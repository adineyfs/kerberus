package com.kerberus;

import java.util.Collection;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;
import org.fxmisc.richtext.model.StyleSpans;
import org.fxmisc.richtext.model.StyleSpansBuilder;

import javafx.stage.Stage;

public class Actions {
	
	private static final String[] KEYWORDS = new String[] {
			"select","update","set","delete","from","where","and","or",
			"join","as","on"
    };

    private static final String KEYWORD_PATTERN = "\\b(" + String.join("|", KEYWORDS) + ")\\b";
    private static final String PAREN_PATTERN = "\\(|\\)";
    private static final String BRACE_PATTERN = "\\{|\\}";
    private static final String BRACKET_PATTERN = "\\[|\\]";
    private static final String SEMICOLON_PATTERN = "\\;";
    private static final String STRING_PATTERN = "\'([^\"\\\\]|\\\\.)*\"";
    private static final String COMMENT_PATTERN = "//[^\n]*" + "|" + "/\\*(.|\\R)*?\\*/";

    private static final Pattern PATTERN = Pattern.compile(
            "(?<KEYWORD>" + KEYWORD_PATTERN + ")"
            + "|(?<PAREN>" + PAREN_PATTERN + ")"
            + "|(?<BRACE>" + BRACE_PATTERN + ")"
            + "|(?<BRACKET>" + BRACKET_PATTERN + ")"
            + "|(?<SEMICOLON>" + SEMICOLON_PATTERN + ")"
            + "|(?<STRING>" + STRING_PATTERN + ")"
            + "|(?<COMMENT>" + COMMENT_PATTERN + ")"
    );
    
    private static final String sampleCode = String.join("\n", new String[] {
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
        });
	
	public Components components;
    public Stage primaryStage;
	
	public Actions(Components components, Stage primaryStage)
    {
        if (components == null)
        {
            System.out.println("Components is null");
        }
        if (primaryStage == null)
        {
            System.out.println(primaryStage);
        }
        this.primaryStage = primaryStage;
        this.components = components;
    }
	
	public void setActions() {
		CodeArea codeAreaSqlStatement = components.code;
		codeAreaSqlStatement.setParagraphGraphicFactory(LineNumberFactory.get(codeAreaSqlStatement));

		codeAreaSqlStatement.richChanges()
                .filter(ch -> !ch.getInserted().equals(ch.getRemoved())) // DON'T DO NOTHING
                .subscribe(change -> {
                	codeAreaSqlStatement.setStyleSpans(0, computeHighlighting(codeAreaSqlStatement.getText()));
                });
		//codeAreaSqlStatement.replaceText(0, 0, sampleCode);
		
	}
	
	private static StyleSpans<Collection<String>> computeHighlighting(String text) {
        Matcher matcher = PATTERN.matcher(text.toLowerCase());
        int lastKwEnd = 0;
        StyleSpansBuilder<Collection<String>> spansBuilder
                = new StyleSpansBuilder<Collection<String>>();
        while(matcher.find()) {
            String styleClass =
                    matcher.group("KEYWORD") != null ? "keyword" :
                    matcher.group("PAREN") != null ? "paren" :
                    matcher.group("BRACE") != null ? "brace" :
                    matcher.group("BRACKET") != null ? "bracket" :
                    matcher.group("SEMICOLON") != null ? "semicolon" :
                    matcher.group("STRING") != null ? "string" :
                    matcher.group("COMMENT") != null ? "comment" :
                    null; /* never happens */ assert styleClass != null;
            spansBuilder.add(Collections.<String>emptyList(), matcher.start() - lastKwEnd);
            spansBuilder.add(Collections.singleton(styleClass), matcher.end() - matcher.start());
            lastKwEnd = matcher.end();
        }
        spansBuilder.add(Collections.<String>emptyList(), text.length() - lastKwEnd);
        return spansBuilder.create();
    }
	

}
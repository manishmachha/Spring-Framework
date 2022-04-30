package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TextEditorConfig {

	@Bean
	TextEditor textEditor() {
		return new TextEditor(spellChecker());
	}

	@Bean
	SpellChecker spellChecker() {
		return new SpellChecker();
	}
}

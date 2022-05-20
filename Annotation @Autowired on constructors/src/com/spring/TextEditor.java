package com.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	private SpellChecker spellChecker;

	@Autowired
	public TextEditor(SpellChecker spellCheck) {
		System.out.println("inside TextEditor constructor");
		this.spellChecker = spellCheck;
	}

	public void spellcheck() {
		spellChecker.checkspelling();
	}
}

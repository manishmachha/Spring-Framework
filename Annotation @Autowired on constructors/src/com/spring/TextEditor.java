package com.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	private SpellChecker spellChecker;

	@Autowired
	public TextEditor(SpellChecker spellChecker) {
		System.out.println("inside TextEditor constructor");
		this.spellChecker = spellChecker;
	}

	public void spellcheck() {
		spellChecker.checkspelling();
	}
}

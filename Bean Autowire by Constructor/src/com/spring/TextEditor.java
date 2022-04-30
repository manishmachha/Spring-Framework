package com.spring;

public class TextEditor {
	private SpellChecker spellChecker;

	public TextEditor(SpellChecker spellChecker) {
		System.out.println("inside TextEditor constructor");
		this.spellChecker = spellChecker;
	}

	public void spellcheck() {
		spellChecker.checkspelling();
	}
}

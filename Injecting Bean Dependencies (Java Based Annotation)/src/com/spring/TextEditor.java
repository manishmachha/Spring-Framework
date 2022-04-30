package com.spring;

public class TextEditor {
	SpellChecker spellChecker;

	public TextEditor(SpellChecker spellChecker) {
		System.out.println("Inside TextEditor constructor");
		this.spellChecker = spellChecker;
	}

	public void spellCheck() {
		spellChecker.CheckSpelling();
	}
}

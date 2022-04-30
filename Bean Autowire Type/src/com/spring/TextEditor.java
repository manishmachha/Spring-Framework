package com.spring;

public class TextEditor {
	private SpellChecker spellChecker;

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside setSpellChecker()");
		this.spellChecker = spellChecker;
	}

	public void spellcheck() {
		spellChecker.checkspelling();
	}
}

package com.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	@Autowired
	private SpellChecker spellChecker;
	
	public TextEditor() {
		System.out.println("Inside TextEditor constructor");
	}

	public void spellcheck() {
		spellChecker.checkspelling();
	}
}

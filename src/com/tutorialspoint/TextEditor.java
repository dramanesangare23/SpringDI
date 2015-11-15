package com.tutorialspoint;

/**
 * @author warlord
 *
 */
public class TextEditor {
	private SpellChecker spellChecker;
	private int numberOfWords;
	private String textOwner;
	
//	public TextEditor(SpellChecker spellChecker, int numberOfWords, String textOwner) { 
//		System.out.println("Inside TextEditor constructor...\n" ); 
//		this.spellChecker = spellChecker; 
//		this.setNumberOfWords(numberOfWords);
//		this.textOwner = textOwner;
//	} 
	
	public void spellCheck() { 
		spellChecker.checkSpelling(); 
	}

	//A getter method to return spellChecker 
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	//A setter method to inject the dependency
	//This method will be invoked automatically when constructing a TextEditor object
	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside setSpellChecker...\n");
		this.spellChecker = spellChecker;
	}

	/**
	 * @return the numberOfWords
	 */
	public int getNumberOfWords() {
		return numberOfWords;
	}

	/**
	 * @param numberOfWords the numberOfWords to set
	 */
	public void setNumberOfWords(int numberOfWords) {
		this.numberOfWords = numberOfWords;
	}

	/**
	 * @return the textOwner
	 */
	public String getTextOwner() {
		return textOwner;
	}

	/**
	 * @param textOwner the textOwner to set
	 */
	public void setTextOwner(String textOwner) {
		this.textOwner = textOwner;
	}
	
}

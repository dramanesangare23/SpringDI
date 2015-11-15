package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		
		TextEditor textEditor = (TextEditor)applicationContext.getBean("textEditor");
		
		System.out.println("Number of words = " + textEditor.getNumberOfWords()+"\n");
		System.out.println("Text owner = " + textEditor.getTextOwner()+"\n");
		textEditor.spellCheck();
		
		((AbstractApplicationContext)applicationContext).registerShutdownHook();
		((AbstractApplicationContext)applicationContext).close();
	}

}

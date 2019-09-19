package com.toolstest;

/**
 * Hello world!
 */
public class App {
    
    static private String name;

    public static void main(String[] args) {
        //TODO hacer algo con este proyecto
        name = "Fer";
        System.out.println(name);
    }
    
    
    public void metodo(){
    	if(name != null)
    		System.out.println(name);
    	else
    		System.out.println("otro");
    }
}

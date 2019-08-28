package fr.formation.inti.core;

public class Generic {
	
	public static <T> void affiche(T[] tab) {
		for(T t : tab)
			System.out.println(t);
		
		
	}
	
	public static void main(String[] args) {
		String[] str = {"aaaa","bbbb","cccc"};
		
		Double[] d = {15d,12.2, 59d};
		
		affiche(str);
		affiche(d);
		
		
	}

}

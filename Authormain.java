package com.author;

public class Authormain {
	public static void main(String args[ ]) {
		Author a1=new Author("Chandru","natarajan");
		Author a2=new Author("Arun","kumar");
		
		System.out.println(a1.getFirstname());
		System.out.println(a1.getLasname());
		
		
		System.out.println(a2.toString());
		
		Author a3= new Author();
		
		Author a4;
		//System.out.println(a2);
		a4=a2;
		System.out.println(a4);
			
		
		
		
		
	}
	

}

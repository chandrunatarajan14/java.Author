package com.author;

public class Author {
    
	 private String firstname;
     private String lastname;
     
     
     public Author() {
    	 
     }
	
	
	public Author(String firstname, String lasname) {
	super();
	this.firstname = firstname;
	this.lastname = lasname;
}


  public String getFirstname() {
	return firstname;
}
  public String getLasname() {
	return lastname;
}

     public void setFirstname(String firstname) {
	   this.firstname = firstname;
}

   public void setLasname(String lasname) {
	this.lastname = lasname;
}


@Override
	public String toString() {
		return "Author firstname=  " + firstname + ", lasname=  " + lastname + "";
	}

}


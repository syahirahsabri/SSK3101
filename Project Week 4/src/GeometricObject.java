
public class GeometricObject {
	private String colour;
	private boolean filled;
	 private java.util.Date dateCreated;
	  
	  // Construct a default geometric object 
	  public GeometricObject() {
	    dateCreated = new java.util.Date();
	  }

	  // Construct a geometric object with the specified color and filled value 
	  public GeometricObject(String colour, boolean filled) {
	    dateCreated = new java.util.Date();
	    this.colour = colour;
	    this.filled = filled;
	  }

	  // Return color 
	  public String getColour() {
	    return colour;
	  }

	  // Set a new color 
	  public void setColour(String colour) {
	    this.colour = colour;
	  }

	  // Return filled. Since filled is boolean, its get method is named isFilled 
	  public boolean isFilled() {
	    return filled;
	  }

	  // Set a new filled 
	  public void setFilled(boolean filled) {
	    this.filled = filled;
	  }
	  
	  // Get dateCreated 
	  public java.util.Date getDateCreated() {
	    return dateCreated;
	  }
	  
	  // Return a string representation of this object 
	  public String toString() {
	    return "Color: " + colour + 
	      " and Filled: " + filled;
	  }
	}




public class PotatoHead
{
	// create instance variables
	private boolean hasEyes;
	private String eyeColor;
	private String eyes;
	private String costume;
	// add one instance variable

	// default constructor
	public PotatoHead()
	{
		// initialize ***ALL*** instance variables here
		hasEyes = false;
		eyeColor = "unknown";
	}

	/*
	VARIOUS ACCESSOR AND MUTATOR METHODS IN ALPHABETICAL ORDER GO HERE
	*/

	/* String getEyeColor()
     accessor method for eyeColor
	*/ 
	public String getEyeColor()
	{
		return eyeColor;
	}

	/* void setEyeColor(String someColor)
     MUTATOR METHOD - change an instance variable's value
	*/ 
	public void setEyeColor(String someColor)
	{
		eyeColor = someColor;
	}

	/* String toString()
  *  ACCESSOR METHOD
	*  method to access ***ALL*** instance variables
	*  you should be adding your new instance variable here
	*/ 
	public String toString()
	{
		String output;
		output =  "Eyes: " + eyes;
		output += "\nCostume: " + costume;
		return output;
	}
} 

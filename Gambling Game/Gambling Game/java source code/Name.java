public class Name {
	private boolean buildName;
	private String firstName;
	private char middleInitial;
	private String lastName;
//-----constructor
public Name(boolean buildName,String firstName, char middleInitial, String lastName) {
	this.buildName = buildName;
	if(buildName == true) {
		System.out.println("Please enter in your first name : ");
		firstName = DataValidation.theWord();
		setFirstName(firstName);
		middleInitial = DataValidation.validateChar("Please enter in your middle initial : ");
		setMiddleInitial(middleInitial);
		System.out.println("Please enter in your Last name : ");
		lastName = DataValidation.theWord();
		setLastName(lastName);
		}
		if(buildName == false) {
			this.firstName = firstName;
			this.middleInitial = middleInitial;
			this.lastName = lastName;
			}
	}
//----------setters
public void setFirstName(String firstName) {
	this.firstName = toSentenceCase(firstName);
}	
public void setMiddleInitial(char middleInitial) {
	this.middleInitial = middleInitial;
}	
public void setLastName(String lastName) {
	this.lastName = toSentenceCase(lastName);
}
//----------sentence case
public static String toSentenceCase(String inputString) {   
			String result = "";   
		    if (inputString.length() == 0) {
		    		return result;
		       		}//end if
		       		char firstChar = inputString.charAt(0);
		       		char firstCharToUpperCase = Character.toUpperCase(firstChar);
		       		result = result + firstCharToUpperCase;
		       		boolean terminalCharacterEncountered = false;
		       		char[] terminalCharacters = {'.', '?', '!'};
		       			for (int i = 1; i < inputString.length(); i++) {
		       				char currentChar = inputString.charAt(i);
		       				if (terminalCharacterEncountered) {
		       					if (currentChar == ' ') {
		       						result = result + currentChar;
		       						}else{
		       							char currentCharToUpperCase = Character.toUpperCase(currentChar);
		       							result = result + currentCharToUpperCase;
		       							terminalCharacterEncountered = false;
		       							}//end else
		       							}else{
		       								char currentCharToLowerCase = Character.toLowerCase(currentChar);
		       								result = result + currentCharToLowerCase;
		       								}//end else
		          	for (int j = 0; j < terminalCharacters.length; j++) {
		               if (currentChar == terminalCharacters[j]) {
		                   terminalCharacterEncountered = true;
		                   break;
		               		}//end if
		          			}//end for
		       				}//end main for
return result;
}//end sentence case 		
//----------getters
public String getLastName() {
	return lastName;
}
public char getMiddleInitial() {
	return middleInitial;
}
public String getFirstName() {
	return firstName;
}
//-----------to string
@Override
public String toString() {
		String result = "First Name: " + firstName+"\n";
		result +="Middle Initial: " + middleInitial+ "\n";
		result +="Last Name: " + lastName+ "\n";
return result;
}//end to string	
public boolean isBuildName() {
	return buildName;
}
public void setBuildName(boolean buildName) {
	this.buildName = buildName;
}
}// end class
package introduction;

public class J9_stringMethod {
	public static void main(String[] args) {
		String name = "Madhvendra";
        // System.out.println(name);
        int value = name.length();
        System.out.println("lenth of string is: "+ value);
        
        System.out.println();

        String lstring = name.toLowerCase();
        System.out.println(lstring);
        
        System.out.println();

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        System.out.println();
        
        String nonTrimmedString = "     Madhvendra     ";
        System.out.println(nonTrimmedString);

        System.out.println();

        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        System.out.println();

        System.out.println(name.substring(1));
        System.out.println(name.substring(1,5));

        System.out.println();

        System.out.println(name.replace('d', 't'));
        System.out.println(name.replace("a", "Sir"));

        System.out.println();

        System.out.println(name.startsWith("Mad"));
        System.out.println(name.endsWith("dd"));

        System.out.println();

        //System.out.println(name.charAt(4));

        //String modifiedName = "Harryrryrry";
        //System.out.println(modifiedName.indexOf("rry"));
        //System.out.println(modifiedName.indexOf("rry", 4));
        //System.out.println(modifiedName.lastIndexOf("rry", 7));

        //System.out.println(name.equals("Harry"));
        System.out.println(name.equalsIgnoreCase("HarRY"));

        System.out.println("I am escape sequence\tdouble quote");


	}
}



/*

Method	Description
1. length()					Returns the length of String name. (5 in this case)
2. toLowerCase()			Converts all the characters of the string to the lower case letters.
3. toUpperCase()			Converts all the characters of the string to the upper case letters.
4. trim()					Returns a new String after removing all the leading and trailing spaces from the original string.
5. substring(int start)	 	Returns a substring from start to the end. Substring(3) returns �ry�. [Note that indexing starts from 0]

6. substring(int start, int end)	Returns a substring from the start index to the end index. The start index is included, and the end is excluded.
7. replace(�r�, �p�)				Returns a new string after replacing r with p. Happy is returned in this case. (This method takes char as argument)
8. startsWith(�Ha�)					Returns true if the name starts with the string �Ha�. (True in this case)
9. endsWith(�ry�)					Returns true if the name ends with the string �ry�. (True in this case)
10. charAt(2)						Returns the character at a given index position. (r in this case)
11. indexOf(�s�)					Returns the index of the first occurrence of the specified character in the given string.
12. lastIndexOf(�r�)				Returns the last index of the specified character from the given string. (3 in this case)
13. equals(�Harry�)					Returns true if the given string is equal to �Harry� false otherwise [Case sensitive]
14.equalsIgnoreCase(�harry�)		Returns true if two strings are equal, ignoring the case of characters.

*/

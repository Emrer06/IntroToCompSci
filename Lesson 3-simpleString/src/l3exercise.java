
public class l3exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("a\\b\\c\\\"d\"");
		System.out.println("\\t is a tab. \\n is a new line, \\\" prints a \"quote\" ");
		System.out.println("\\\\denotes a single line comment\n\\*denotes a multiline comment*\\");
		System.out.println(" \"\\\\\" \"\\\"\" \n \\\"\\\"\"\\ \n\\\"\"\"\"\\");
		
		System.out.println();
		
		String word = "birthday";
		System.out.println(word.toUpperCase());
		
		String word1 = "it's my party";
		System.out.println(word1.substring(0,3)+" a "+word1.substring(8,13).toUpperCase());
		
		String word2 = "whose a whats it";
		System.out.println(word2.substring(0,5).toUpperCase()+"\n is " +word2.substring(8,12).toUpperCase());
	
		String word3 = "Every Way The Wind Blows";
		System.out.println();
		System.out.println(word3.substring(0,4).toLowerCase()+word3.substring(5,9).toUpperCase()+word3.substring(9,13).toLowerCase()+"\\\\"+word3.substring(13,18)+"\\"+word3.substring(18,24).toLowerCase()+" 4");
		
		System.out.println();
		String word4 = "word has 4 letters";
		System.out.println("\""+word4.substring(0,4).length()+"\""+);
		
	}

}


public class l3exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("a\\b\\c\\\"d\"");
		System.out.println("\\t is a tab. \\n is a new line, \\\" prints a \"quote\" ");
		System.out.println("\"line one\"\n\\line       two\\");
		System.out.println("\\\\denotes a single line comment\n\\*denotes a multiline comment*\\");
		System.out.println(" \"\\\\\" \"\\\"\" \n           \\\"\\\"\"\\ \n\\\"\"\"\"\\");
		
		System.out.println();
		String word5 = "if SUBSTRING is used";
		String word = "birthday";
		System.out.println(word.toUpperCase());
		
		String word1 = "it's my party";
		System.out.println(word1.substring(0,3)+" a "+"\""+word1.substring(8,13).toUpperCase()+"\"");
		
		String word2 = "whose a whats it";
		System.out.println(word2.substring(0,5).toUpperCase()+"\n"+word5.substring(13,16) +word2.substring(8,12).toUpperCase());
	
		String word3 = "Every Way The Wind Blows";
		System.out.println();
		System.out.println(word3.substring(0,4).toLowerCase()+word3.substring(5,9).toUpperCase()+word3.substring(9,13).toLowerCase()+" \\"+word3.substring(14,18).toUpperCase()+"\\"+word3.substring(18,24).toLowerCase()+" 4");
		
		System.out.println();
		String word4 = "word has 4 letters";
		System.out.println("\""+word4.substring(0,4).length()+"\""+word4.substring(10,18)+word4.substring(4,9)+"\""+word4.substring(0,9).length()+"\""+word4.substring(10,18));
		System.out.println();
		
		String word7 = "Peter Piper Pickled A Peck Of Pickel Peppers";
		System.out.println(word7.substring(19, 36).toLowerCase()+"          "+word7.substring(36,44).toLowerCase()+" "+word7.substring(0,11)+"    "+word7.substring(29,35).toLowerCase()+"d");
		
		System.out.println();
		
		System.out.println(word5.substring(2,12).toLowerCase()+word5.substring(12,16)+word5.substring(2,11).length());
		
		System.out.println();
		String word6 = "Jim, Jacky, Johny, Jill";
		System.out.println(word6.substring(0,3).toLowerCase()+"\\"+word6.substring(0,3).length()+"\n"+word6.substring(5,10).toUpperCase()+"\\"+word6.substring(5,10).length()+"\n"+word6.substring(12,17).toLowerCase()+"\\"+word6.substring(0,6).length()+"\n"+word6.substring(19,23).toUpperCase()+"\\"+word6.substring(19,23).length());
		
	}

}

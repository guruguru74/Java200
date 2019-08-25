package s067_문자열가공하기;

public class StringTest {
	private static String title = "=> s067_문자열가공하기";
	public static void main(String[] args) {
		System.out.println(title);
		System.out.println();

		String text = "Hello Java4Android";
		String com = "HEllo java4Android";
		
		System.out.println(text.charAt(2));
		System.out.println(text.concat("s"));
		System.out.println(text.contains("And"));
		System.out.println(text.contentEquals(com));
		System.out.println(text.equalsIgnoreCase(com));
		
		System.out.println(text.indexOf("a"));
		System.out.println(text.lastIndexOf("a"));
		System.out.println(text.trim());
		System.out.println(text.length());
		System.out.println(text.substring(7));
		System.out.println(text.substring(7,11));
		System.out.println(text.replace("", "-"));		// replaceAll
		System.out.println(text.replaceAll("", "-"));
		System.out.println(text.toUpperCase());
		System.out.println(text.toLowerCase());
		
		String[] sp = text.split(" ");
		for(int i=0; i<sp.length; i++)
			System.out.println(i+"\t\t"+sp[i]+"\t\t"+sp[i].length());
		
		int i=0;
		for(String tmp : sp)
			System.out.println(i++ + "\t\t" + tmp + "\t\t" + tmp.length());
	}
}

package week11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FONT {

	public static void main(String[] args) {
		String html="<font face=¡®Arial Serif¡¯ size=¡®10px¡¯ color=¡®red¡¯ />";
		String Str="";
		String Rex1="<\s*font\s*([^>]*)\s*/>";
		Pattern FontPattern1=Pattern.compile(Rex1,Pattern.CASE_INSENSITIVE);
		Matcher FontMatcher1=FontPattern1.matcher(html);
		while(FontMatcher1.find()) {
			System.out.println(FontMatcher1.group(1));
			Str=FontMatcher1.group(1);
		}
		String Rex2="([a-z]+)\s*=\s*¡®([^¡¯]+)¡¯";
		Pattern FontPattern2=Pattern.compile(Rex2);
		Matcher FontMatcher2=FontPattern2.matcher(Str);
		while(FontMatcher2.find()) {
			System.out.print(FontMatcher2.group(1)+":");
			System.out.println(FontMatcher2.group(2));	
		}
	}

}

package FunctionalInterface;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

interface decodeWord{
	void decoder(String s);
}

public class Phone {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(Pattern.matches("[0-9]{3}[0-9]{3}[A-Za-z]{1,}+", s)) {
		decodeWord decode=(str)->{
			HashMap<Character,String>hm=new HashMap<>();
			hm.put('A',"2");
			hm.put('B',"2");
			hm.put('C',"2");
			hm.put('D',"3");
			hm.put('E',"3");
			hm.put('F',"3");
			hm.put('G',"4");
			hm.put('H',"4");
			hm.put('I',"4");
			hm.put('J',"5");
			hm.put('K',"5");
			hm.put('L',"5");
			hm.put('M',"6");
			hm.put('N',"6");
			hm.put('O',"6");
			hm.put('P',"7");
			hm.put('Q',"7");
			hm.put('R',"7");
			hm.put('S',"7");
			hm.put('T',"8");
			hm.put('U',"8");
			hm.put('V',"8");
			hm.put('W',"9");
			hm.put('X',"9");
			hm.put('Y',"9");
			hm.put('Z',"9");
			
			String firstThree=s.substring(0,3);
			String mid=s.substring(3,6);
			String last=s.substring(6);
			last=last.toUpperCase();
			firstThree="("+firstThree+")";
			String n="";
			for(int i=0;i<last.length();i++) {
				char c=last.charAt(i);
				if(hm.containsKey(c)) {
					n=n+hm.get(c);
				}
			}
			System.out.println(firstThree+""+mid+"-"+n);
		};
		decode.decoder(s);
		}
		else {
			System.out.println("Invalid number");
		}
	}
	
	}
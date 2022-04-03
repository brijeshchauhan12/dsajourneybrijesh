package brijeshdsa;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Regexx {
    public static void main(String [] args) {
    	boolean t=true;
    	while(t) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("type the pattern to be tested");
    	String s=sc.nextLine();
    	System.out.println("type the text to check the pattern is right or wrong");
    	String ss=sc.nextLine();
    	Pattern p=Pattern.compile(s);
    	Matcher m=p.matcher(ss);
    	
    	if(m.find()) {
    		System.out.println("Pattern matches successfully");
    		
    	}
    	else {
    		System.out.println("Pattern does not matches successfully");
    	}
    	System.out.println("do you want to break: if yes enter :1 else enter :2");
    	int n=sc.nextInt();
    	switch(n) {
    	case 1:
    		t=false;
    		sc.close();
    		break;
    	case 2:
    		t=true;
    		break;
    		
    	}
    }
    }
}

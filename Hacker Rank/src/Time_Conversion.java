import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Time_Conversion{
    public static void main(String[] args) throws IOException {
Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String d= s.substring(8,10);
        String t1 = "PM";
        String t2 = "AM";
    if(d.equals(t1)){
        //02:00:00PM -> 14:00:00
        int p=Integer.parseInt(s.substring(0,2)); 
        if(p==12){
            System.out.println(s.substring(0,8));
        }else{
            System.out.println(p+12+s.substring(2,8));
        }
        
    }
    else if(d.equals(t2)){
        String z=s.substring(0,2);
        String t3="12";
        if(z.equals(t3)){
            System.out.println("00"+s.substring(2,8));
        }else{
            System.out.println(s.substring(0,8));
        }
    }
    }
}

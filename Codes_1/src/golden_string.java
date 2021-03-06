import java.util.*;
public class golden_string {
    public int solve(String A) {
        char arr[] = new char[A.length()];
        int[] freq = new int[A.length()];  
        for(int i =0;i<A.length();i++){
            arr[i]=A.charAt(i);
            //System.out.println(arr[i]);
        }
        int i, j;  
        
        //Converts given string into character array  
        char string[] = A.toCharArray();  
          
        for(i = 0; i <A.length(); i++) {  
            freq[i] = 1;  
            for(j = i+1; j <A.length(); j++) {  
                if(string[i] == string[j]) {  
                    freq[i]++;  
                      
                    //Set string[j] to 0 to avoid printing visited character  
                    string[j] = '0';  
                }  
            }  
        }  
          
        //Displays the each character and their corresponding frequency 
        double N=A.length();
        //System.out.println("Characters and their corresponding frequencies");  
        int max = freq[0];
        for(i = 0; i <freq.length; i++) {  
            if(string[i] != ' ' && string[i] != '0')  {
            	 //System.out.println(string[i] + "-" + freq[i]);  
                if(max<freq[i]) {
                	max = freq[i];
                }
            }
            
               
        }
        
        //System.out.println(max);
        //System.out.println(N/3);
        if(N/3 < max){
            return 1;
        } else{
            return 0;
        }
        

        
    }
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	golden_string ob = new golden_string();
    	//String str =sc.nextLine();
    	String str="abbad";
    	System.out.println(ob.solve(str));
    }
}
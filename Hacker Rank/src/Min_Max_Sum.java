/* Sample Input

1 2 3 4 5

Sample Output

10 14
*/

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

class Min_Max_Sum {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long[] m=new long[5];
        for(int i=0;i<5;i++){
            m[i]=in.nextLong();
        }
        Arrays.sort(m);
        long x=0;
        long y=0;
        for(int i=0;i<4;i++){
            x+=m[i];
        }
        for(int i=1;i<5;i++){
            y+=m[i];
        }
        System.out.println(x+" "+y);
    }

}

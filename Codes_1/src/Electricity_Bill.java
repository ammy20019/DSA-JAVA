import java.util.*;
public class Electricity_Bill {
public static void main (String args[]){
long unit;
double bill=0;

Scanner scan=new Scanner(System.in);
unit=scan.nextLong();

if(unit<=100){
   bill = unit*0;
}
else if(unit<=200){
   bill = (float)(20-150+(unit*1.5));
}
else if(unit<=500){
   //first 100 units
   bill=(float)(30-150+(100*1.5)+(100*2)+((unit-200)*3));
}
else if(unit>500){
    bill=(float)(50-150+(100*1.5)+(100*3.5)+(300*4.6)+((unit-500)*6.6));
}
System.out.println(bill+"INR");



}

}

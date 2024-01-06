import java.util.Scanner;

 public class MaximumArray{

public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.println("Enter array length: ");
int array = input.nextInt();

double[] myList = new double[array];
System.out.println("Enter elements :");

double max = myList[0];

for (int i = 1; i < myList.length; i++){ 
myList[i] = input.nextDouble();

 if (myList[i] > max){
 max = myList[1];

}
}
System.out.print(+max  );

}
}
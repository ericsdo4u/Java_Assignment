import java.util.Scanner;
public class Multiplication{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter number: ");
int userInput = input.nextInt();


if(userInput < 0 || userInput > 10){
System.out.print("Invalid number");
}
else{
int count = 1;
while(count < 13 ){ 

int result = userInput * count;

System.out.printf("%d x %d = %d%n ", userInput, count, result);
	
	count = count + 1;

    }
  }
 }
}

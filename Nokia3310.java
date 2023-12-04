import java.util.Scanner;
public class Nokia3310{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);

 System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n       	%s%n%s%n%s%n", "1.phone book",  "2.message",  "3.Chat",  	"4.Call",  "5.Tone",  "6.Settings",   "7.Call Divert",   	"8.Game",   "9.Calculator",   "10.Reminders",  	"11.Clock",  "12.Profile",  "13.Sim sevice" );

   	System.out.print("Enter 1 to navigate phone book: ");
     	int phoneBook = input.nextInt();
 	if(phoneBook == 1){
		 System.out.println("phone book\n 1.search\n 2.Service nos\n 3. 		Add name     	\n 4.Erase\n 5.Edit\n 6.Assign tone\n 7.Send\n 			8.option\n 9.Speed\n 	10.Voice Tag");
   
   }

  	System.out.print("Enter 2 to navigate message: ");
	int message = input.nextInt();
	if(message == 2){
		System.out.println("1.Write message\n 2.Inbox\n 3.Output\n 		4.Picture message\n 5.Templates\n 6.Smileys\n 7.Message settings "); 
		
	
 }
}
import java.util.Scanner;
public class Nokia3310{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);

 System.out.printf("%s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n", "Phone menu", "1.phone book", "2.message", "3.Chat", "4.Call",  "5.Tone", "6.Settings", "7.Call Divert", "8.Game",  "9.Calculator",  "10.Reminders", "11.Clock", "12.Profile", "13.Sim sevice" );

   	System.out.print("Enter 1 to navigate phone book: ");
     	int phoneBook = input.nextInt();
 	if(phoneBook == 1){
		 System.out.println("1.phone book \n 1.search \n 2.Service nos \n 3.Add name \n 4.Erase \n 5.Edit \n 6.Assign tone \n 7.Send \n 8.option \n  1.Type of view \n  2.Memory status \n 9.Speed \n 10.Voice Tag");

	System.out.print("Enter 1 for search: ");
	int search = input.nextInt();
	if(search == 1 ){
	System.out.println(" \n  Search\n  ");

	System.out.print("Enter 2 for service: ");
	int service = input.nextInt();
	if(service == 2){
	System.out.println(" \n  Service nos\n  ");
	
	System.out.print("Enter 3 for add name: ");
	int addName = input.nextInt();
	if(addName == 3){
	System.out.println(" \n  Add name\n  ");

	System.out.print("Enter 4 for Erase: ");
	int erase = input.nextInt();
	if(erase == 4){
	System.out.println(" \n  Erase\n  ");

	System.out.print("Enter 5 for edit: ");
	int edit = input.nextInt();
	if(edit == 5){
	System.out.println(" \n  Edit\n  ");

	System.out.print("Enter 6 for assign tone: ");
	int assignTone = input.nextInt();
	if(assignTone == 6){
	System.out.println(" \n  Assign tone \n ");

	System.out.print("Enter 7 send: ");
	int send = input.nextInt();
	if(send == 7){
	System.out.println(" \n  Service nos\n  ");
	
	
	
	
	}
	}
	}
	}
	}
	}
     }
   }

  	System.out.print("Enter 2 to navigate message: ");
	int message = input.nextInt();
	if(message == 2){
	
		System.out.println("1.message \n 1.Write message \n 2.Inbox \n 3.Output \n 4.Picture messages \n 5.Templates \n 6.Smileys \n 7.Message settings \n  1.set 1 \n   1.Message centre number     \n   2.Messages sent as \n   3.Message validity \n  2.Common \n   1.Delivery reports \n   2.Reply via same centre \n   3.Character support \n8.Infor servic \n9.Voice mailbox number \n10.Service command editor "); 
  }		


System.out.print("Enter 3 for chat: ");
int chat = input.nextInt();
if(chat == 3)
	System.out.print("\n3.chat\n"); 	


 }

}
import java.io.Console;
 
public class TreeStory3 {
    
  public static void main(String[] args) {
    Console console = System.console();
    /*  Some terms:
    noun - Person, place or thing
    verb - An action
    adjective - A description used to modify or describe a noun
    Enter your amazing code here!
    */
    //__Name__is a __adjective__ __noun__. They are always __adverb__ __verb__.
    int age = 12;
    if (age<13) {
       //Insert exit code
       console.printf("Sorry you must be 13 to use this program\n");
       System.exit(0);
       //System is a global system method with a method on it called exit, 
       //The exit method takes arguments for the status code
       //The value 0 means the system exited intentially any other non zero vaue means otherwise
    }

    String name = console.readLine("Enter a name:  ");
    String adjective = console.readLine("Enter an adjective:  ");
    String noun = console.readLine("Enter a noun:  ");
    String adverb = console.readLine("Enter an adverb:  ");
    String verb = console.readLine("Enter a verb ending with -ing:  ");

    console.printf("Your TreeStory:\n---------------\n");
    console.printf("%s is a %s %s. ", name, adjective, noun);
    console.printf("They are always %s %s.\n", adverb, verb);
		
	}//clear && javac TreeStory3.java && java TreeStory3
}

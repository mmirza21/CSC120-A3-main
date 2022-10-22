import java.util.Random;
import java.util.Scanner;
import java.util.*;

class Conversation {
  public static void main(String[] arguments) {
    // You will start the conversation here.
    // Create an ArrayList to store transcript 
    ArrayList <String> transcript = new ArrayList<>();
    //Ask user to input number of rounds and records it as an int, and adds it to the transcript
    System.out.println("How many rounds?");
    transcript.add("How many rounds?");
    var input = new Scanner(System.in);
    int rounds = input.nextInt();
    String round = String.valueOf(rounds);
    transcript.add(round);
    //Asks user for next input
    System.out.println("Hi, there! What's on your mind?");
    transcript.add("Hi, there! What's on your mind?");
    int i=0;
    //Loops through conversation for the number of rounds idicated, regularly adding lines to transcript
    while(true){
      String reply = "";
      transcript.add(reply);
      var input2 = new Scanner(System.in);
      String answer = input2.nextLine();
      transcript.add(answer);
      String [] sentence = answer.split(" ");
      int counter = 0;
      //loops through each word in user input and replaces words that are mirror words, leaving other words the same
      for (int a = 0; a < sentence.length; a++){
        if (sentence[a].equals("I")){
          sentence[a] = "you";
          reply = reply + sentence[a] + " ";
          counter+=1;}
        else if (sentence[a].equals("me")){
          sentence[a] = "you";
          reply = reply + sentence[a]+ " ";
          counter+=1;}
        else if (sentence[a].equals("am")){
          sentence[a] = "are";
          reply = reply + sentence[a]+ " ";
          counter+=1;}
        else if (sentence[a].equals("you")){
          sentence[a] = "I";
          reply = reply + sentence[a]+ " ";
          counter+=1;}
        else if (sentence[a].equals("my")){
        sentence[a] = "your";
         reply = reply + sentence[a]+ " ";
         counter+=1;}
        else if (sentence[a].equals("your")){
        sentence[a] = "my";
        reply = reply + sentence[a]+ " ";
        counter+=1;}
        else{
        reply+=sentence[a]+ " ";
        }
        //Prints canned responses when no mirror words found
        {if (counter == 0 ){
          ArrayList <String> canned = new ArrayList<String>();
          canned.add("Absolutely fascinating.");
          canned.add("Yeah, that's alright.");
          canned.add("What else?");
          canned.add("Lovely day today, isn't it?");
          canned.add("Oh, really?");   
          Random rand = new Random();
          int int_random = rand.nextInt(5);  
          String response = canned.get(int_random); 
          reply = "" + response;
          counter+=1;
        }}
        }
        i+=1;
        System.out.println(reply);
        transcript.add(reply);
      //Terminates program when all rounds are ended and transcript has been printed
      if(i==rounds){
        System.out.println("See ya!");
        System.out.println("TRANSCRIPT:");
        for (int b = 0; b < transcript.size(); b++){
          String transcript1 = "" + transcript.get(b);
          System.out.println(transcript1);}
        input.close();
        input2.close();
        break;
        
      }
        
      
      }}
      } 

        
      



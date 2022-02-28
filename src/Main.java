import java.util.*;

public class Main {

    static ArrayList<String> unseen = new ArrayList<String>();
    static ArrayList<String> seen = new ArrayList<String>();
    public void setUnseen(){
        unseen.add("Legacies");
        unseen.add("Good Trouble");
        unseen.add("Family Guy");
        unseen.add("A Million Little Things");
        unseen.add("Younger");
        unseen.add("Ugly Betty");
        unseen.add("Insecure");
        unseen.add("Yellowjackets");
        unseen.add("Below Deck Med");
        unseen.add("Starstruck");
        unseen.add("What If?");
        unseen.add("We are Lady Parts");
        unseen.add("Derry Girls");
        unseen.add("A Discovery of Witches");
        unseen.add("Daredevil");
        unseen.add("Riverdale");
        unseen.add("Avengers: Assembled");
    }

    public void setSeen(){
        seen.add("The Bold Type");
        seen.add("Gilmore Girls");
        seen.add("You");
        seen.add("South Park");
        seen.add("Love Island Australia");
        seen.add("Love Island US");
        seen.add("Love Island UK");
        seen.add("The Bachelor");
        seen.add("Below Deck");
        seen.add("The Bachelorette");
        seen.add("Bachelor in Paradise");
        seen.add("The Originals");
        seen.add("The 100");
        seen.add("Euphoria");
        seen.add("Joe Millionaire");
        seen.add("Shameless");
        seen.add("Dexter");
        seen.add("Bridgerton");
        seen.add("Wandavision");
        seen.add("Hawkeye");
        seen.add("Hannah Montana");
        seen.add("HSM: The Musical: The Series, Season 1");
        seen.add("The Fairly OddParents");
        seen.add("iCarly");
    }

    public static void addToSeen(String str){
        seen.add(str);
    }

    public static void addToUnseen(String str){
        unseen.add(str);
    }

    //getElement code was copied from
    //https://www.geeksforgeeks.org/randomly-select-items-from-a-list-in-java/
    public String getElement(List<String> temp){
        setSeen();
        setUnseen();
        Random rando = new Random();
        int loc = rando.nextInt(temp.size());
        if(loc<0)
            throw new NoSuchElementException("Elements must start at 0");
        return temp.get(loc);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seen or Unseen?");
        String input = sc.nextLine();
        Main obj = new Main();
        String result="";
        if(input.equalsIgnoreCase("Seen")){
            result=obj.getElement(seen);
            System.out.println(result);
        }

        else if(input.equalsIgnoreCase("Unseen")){
            result=obj.getElement(unseen);
            System.out.println(result);
        }

        else{
            System.out.print("Invalid input: must respond with seen or unseen");
        }
        System.out.print("Do you want to add a show to the list?");
        String reply = sc.nextLine();
        if(reply.equalsIgnoreCase("yes")){
            System.out.println("Seen or unseen?");
            String response = sc.nextLine();
            if(response.equalsIgnoreCase("seen")){
                System.out.println("Enter the title");
                String title = sc.nextLine();
                addToSeen(title);
            }
            else if(response.equalsIgnoreCase("unseen")){
                System.out.println("Enter the title");
                String title = sc.nextLine();
                addToUnseen(title);
            }
            else{
                System.out.println("Invalid response: must reply with seen or unseen");
            }
        }
        else if(reply.equalsIgnoreCase("no")){
            System.out.println("Enjoy your show");
        }
        else{
            System.out.println("Invalid response: must reply with yes or no");
        }
    }
}

import java.util.Scanner;
public class pmoMadLib{
    public static String madLib(String lib, Scanner sc){
        System.out.println(lib);
        System.out.print("Enter a noun: ");
        String inputNoun = sc.nextLine();
        System.out.print("Enter a verb: ");
        String inputVerb = sc.nextLine();
        System.out.print("Enter an adjective: ");
        String inputAdj = sc.nextLine();
        

        //System.out.println(adj);
        lib = lib.replace("<noun>", inputNoun);
        lib = lib.replace("<verb>", inputVerb);
     //   lib = lib.replace("<adj>", inputAdj);
        int adjStart = lib.indexOf("<adj>");
        String beforeAdj = lib.substring(0, adjStart);
        String afterAdj = lib.substring(adjStart + 5);
        lib = beforeAdj + inputAdj + afterAdj;
    
        
        return lib;
 
    }
    // testing function
    // included the scanner inside the test function because a new scanner needs to be made for every seperate test functiono!
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String test1 = "The <noun> <verb> over the <adj> barn.";
        String funTest = "The <noun> <verb> to Brainrot Land in <adj> TralaleroTralala.";
        String stringo = "<noun> meets its <adj> mom and <verb> away!";
        System.out.println(madLib(test1, sc));
        System.out.println(madLib(funTest, sc));
        System.out.println(madLib(stringo, sc));
        sc.close();
    }
}

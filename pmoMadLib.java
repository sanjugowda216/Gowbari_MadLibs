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
        lib = lib.replace("<noun>", inputNoun);
        lib = lib.replace("<verb>", inputVerb);
        lib = lib.replace("<adj>", inputAdj);
        
        return lib;
 
    }
    // testing function
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

import java.util.Scanner;
public class pmoMadLib{
    public static String madLib(String lib){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String inputNoun = sc.nextLine();
        System.out.print("Enter a verb: ");
        String inputVerb = sc.nextLine();
        System.out.print("Enter an adjective: ");
        String inputAdj = sc.nextLine();
        lib = lib.replace("<noun>", inputNoun);
        lib = lib.replace("<verb>", inputVerb);
        lib = lib.replace("<adj>", inputAdj);
        sc.close();
        return lib;
 
    }
    // testing function
    public static void main(String[] args){
        
        String test1 = "The <noun> <verb> over the <adj> barn.";
        System.out.println(madLib(test1));
    }
}

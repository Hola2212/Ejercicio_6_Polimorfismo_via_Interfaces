import java.io.PrintStream;
import java.util.Scanner;
public class Consola{
    public final PrintStream imp;
    public final Scanner sc;
    public Consola(){
        imp = new PrintStream(System.out);
        sc = new Scanner(System.in);
    }
}
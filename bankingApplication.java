import java.util.Scanner;
public class bankingApplication{
    public static void main(String []args){
        System.out.println("ENTER YOUR NAME");
        Scanner NEW = new Scanner (System.in);
        String name = NEW.nextLine();
        

       bankAccount first = new bankAccount(name);
       first.showMenu();
       NEW.close();
    }
}
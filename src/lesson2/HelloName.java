import java.util.Scanner;

public class HelloName {
    public static void main(String [] args) {
	    Scanner scanner = new Scanner(System.in);
	
	    System.out.print("Пожалуйста, введите своё имя: ");
	
	    String name = scanner.nextLine();
	// System.out.println("Привет, " + name + "!");
	
	    if (name.length() == 0) {
		    System.out.println("Вы не ввели имя");
	    } else {
		    System.out.println("Привет, " + name + "!"); // не читает кирилицу??
	    }
	}
}

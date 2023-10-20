package firstProgram;
import java.util.Scanner;


public class Percabangan {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String password = prompt("Enter password :");
        String validPassword = "password";

        if(password.equals(validPassword)){
            System.out.println("Selamat datang Bos");
        } else {
            System.out.println("Password salah, coba lagi");
        }
        System.out.println("Terima kasih sudah menggunakan aplikasi kami");

    }

    public static String prompt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }
}


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();

        if(x<0)
            System.out.println("Лёд");
        else {
            if(x>100){
                System.out.println("Пар");
            } else {
                System.out.println("Вода");
            }
        }

        if(x<0){
            System.out.println("Лёд");
        }else if(x<100){
            System.out.println("Вода");
        }else{
            System.out.println("Пар");
        }



    }
}

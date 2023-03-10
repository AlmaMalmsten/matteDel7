import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> primArray = new ArrayList<Integer>();
        tvillingar(primArray);
        tripletter(primArray);
    }
    static void primtal(ArrayList<Integer> primArray){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ange m: ");
        int m = scanner.nextInt();
        System.out.println("Ange n: ");
        int n = scanner.nextInt();

        System.out.println("Primtal från " + m + " till " + n + " är: ");

        for (int i = m; i <=n; i++){
            if(i==2){
                System.out.println(i);
                primArray.add(i);
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
                else if(j==i-1){
                    System.out.println(i);
                    primArray.add(i);
                }
            }
        }
    }

    static void tvillingar(ArrayList<Integer> primArray){
        primtal(primArray);
        for (int i = 1; i < primArray.size(); i++){
            if(primArray.get(i) == (primArray.get(i-1))+2){
                System.out.println(primArray.get(i-1) + " och " + primArray.get(i) + " är tvillingar.");
            }
        }
    }
    static void tripletter(ArrayList<Integer> primArray){
        primtal(primArray);
        for (int i = 2; i < primArray.size(); i++){
            if(primArray.get(i) == (primArray.get(i-1))+2 && primArray.get(i-1) == (primArray.get(i-2)+2)){
                System.out.println(primArray.get(i-2) + " och " + primArray.get(i-1) + " och " + primArray.get(i) + " är tripletter.");
            }
        }
    }
}
import java.util.*;

class Main {
    public static void main(String args[]) {
        LinkedList<String> a = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        
        for (int i = 0; i < size; i++) {
            String s = sc.next(); 
            a.addFirst(s);
        }

        
        for (int i = 0; i < size; i++) {
            System.out.print(a.get(i) + " ");
        }
    }
}
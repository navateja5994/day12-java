import java.util.*;
class main
{
    public static void main(String args[])
    {
        LinkedList<String> a=new LinkedList<>();
        a.add("Hello");
        a.add("I am");
        a.add("Students");
        System.out.println(a);
        a.remove(0);
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}
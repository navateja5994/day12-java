import java.util.*;
class main
{
    public static void main(String args[])
    {
     LinkedHashSet<String> a = new LinkedHashSet<>();
     a.add("Hello");
     a.add("i am");
     a.add("navateja");
     a.add("Student");
     Iterator itr=a.iterator();
     while(itr.hasNext())
     {
        System.out.println(itr.next()+" ");
     }
    }
}


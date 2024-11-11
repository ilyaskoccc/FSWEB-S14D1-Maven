import com.workintech.developers.JuniorDeveloper;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        JuniorDeveloper juniorDeveloper = new JuniorDeveloper(1, "ilyas", 1000);
        JuniorDeveloper juniorDeveloper1 = new JuniorDeveloper(2, "ahmet", 2000);
        JuniorDeveloper juniorDeveloper2 = new JuniorDeveloper(3, "ilyas", 1000);
        System.out.println(juniorDeveloper.toString());
        System.out.println(juniorDeveloper1.toString());
        System.out.println(juniorDeveloper2.toString());

        juniorDeveloper.work();
        juniorDeveloper1.work();
        juniorDeveloper2.work();
    }
}
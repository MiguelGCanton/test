import java.util.function.Predicate;

/**
 * Num
 */

class d{}
class e extends d{

}
class A{

    public d foo(){
        return new d();
    }
}

interface B{}

class C extends A{
    public e foo(){
        return new e();
    }
}

public class Num {

    public static void main(String[] args) {
        Integer num1 = new Integer(12);
        Integer num2 = new Integer(12);

        System.out.println(num1 == num2);

        int integer = 9;

        Predicate aBool = integer -> {System.out.println("putos"); return integer > 5;};

    }



}
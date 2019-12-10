/**
 * Casa
 */
public class Casa {
    enum Color {RED, BLUE};
    static int num;
    public static void main(String[] args) {
        Color c1 = Color.RED; Color c2 = Color.RED;
        String s = "akljsd";
        if(c1 == c2){
            System.out.println("==");
        }

        if(c2.equals(c2)){
            System.out.println("equals");
        }

        if(s instanceof String){
            System.out.println(" is a string");
        }

        A b = new B();
    
        C c = new C();
        int x= 2; int y =3;
        if(false |  false){
            System.out.println( "as" + 1 +2 + "hey");    
        }

    }
}
class C extends B{}
/**
 * A
 */ 
class A {

    
}
class B  extends A{
    void sayHi(){
    System.out.println("hi");
    }
}

/*
y y y y y x x -= *= *= *=
y y y y y x x -= *= *= *=

x *= x ; 49



x *= y ; 14

x -= y; 5

*/

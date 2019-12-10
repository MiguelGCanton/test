/**
 * Test
 */
public class Test {

    public int t;
    public void sum(Test x){
        x.t++; 
    }

    public static void main(String[] args) {
        System.out.println("hey");
        Runtime rt = Runtime.getRuntime();
        System.out.println(rt.totalMemory());
        System.out.println(rt.freeMemory());
        int x =3;
        Test t = new Test();
        t.sum(t);
        //t.sum(x);

        System.out.println(t.t);

    }
}
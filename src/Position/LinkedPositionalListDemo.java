package Position;

public class LinkedPositionalListDemo {
    public static void main(String args []){
        LinkedPositionalList<Integer> a=new LinkedPositionalList<Integer>();
        a.addFirst(10);
        a.addFirst(20);
        Position<Integer> p;
        p=a.first();
        System.out.println(p.getElement());
        System.out.println(a.after(p));
    }
}

package academy.mindswap;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList list2 = new LinkedList();

        list.add(list.sum(2,5));
        list.add(new String[]{"Jonh", "Joane"});
        list.add(list2);

        System.out.println(list.size());
    }

}

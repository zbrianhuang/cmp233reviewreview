public class Main {
    public static void main(String[] args){
        Object sa = new Object();

        Garage<String> a = new Garage("hello");
        System.out.println(a.getThing());
        Garage<Integer> nas = new Garage(23);

        System.out.println(nas.toString());
    }
}

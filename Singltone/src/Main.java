
public class Main {
    public static void main(String[] args) {

        Database database = Database.getInstance("Hi");
        Database database2 = Database.getInstance("There");
        System.out.println(database.value);
        System.out.println(database2.value);
    }
}
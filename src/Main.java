public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.printPersonInformation();
        Person p2 = new Person("Mark");
        p2.printPersonInformation();
        Person p3 = new Person("Mark","Matthew");
        p3.printPersonInformation();
        Person p4 = new Person("Murid","Quorishi","02/08/2004");
        p4.printPersonInformation();
        Person p5 = new Person(p4);
        p5.printPersonInformation();
    }
}
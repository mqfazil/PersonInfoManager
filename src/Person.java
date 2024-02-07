public class Person {
    private String firstName;
    private String lastName;
    private String DOB;
    Person(){ //default constructor
        this.firstName = "Murid";
        this.lastName = "Quorishi";
        this.DOB = "02/08/2004";
    }
    Person(String _firstName){
        this.firstName = _firstName;
        this.lastName = "";
        this.DOB = "";
    }
    Person(String _firstName, String _lastName){
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.DOB = "";
    }
    Person(String _firstName, String _lastName, String _dob){
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.DOB = _dob;
    }
    Person(Person p){
        this.firstName = p.firstName;
        this.lastName = p.lastName;
        this.DOB = p.DOB;
    }
    public void printPersonInformation(){
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Date of Birth: " + this.DOB);
    }
}

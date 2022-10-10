import java.util.Optional;

public class OopsConcept {
    String firstName;
    String lastName;
    String emailId;
public OopsConcept(){

    }
    public OopsConcept(String firstName, String lastName, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }

    void StudentInfo(){
        System.out.println("...........Oops concept..........");
        System.out.println(this.firstName);
        System.out.println(this.lastName);
        System.out.println(this.emailId);
    }

    public static void main(String[] args) {
        OopsConcept Op1 = new OopsConcept("hari","bhatta","hari@gmail.com");
        Op1.StudentInfo();
    }
}

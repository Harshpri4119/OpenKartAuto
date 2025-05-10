package SeleniumPracticeTests.JavaPractice;

public class LoginInputs {

    String firstName;
    String lastName;
    String gender;
    String email;
    int age;
    String phoneNumber;

    public String userName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        return firstName + " " + lastName;
    }

    public String gender(String gender){
        this.gender = gender;

        return gender;
    }

    public String email(String email){
        this.email = email;

        return email;
    }

    public int age(int age){
        this.age = age;

        return age;
    }

    public String phoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;

        return phoneNumber;
    }
}

package SeleniumPracticeTests.JavaPractice;

public class RunTests {
    public void runMathMethods(){
        MathMethod mathMethod = new MathMethod();

        System.out.println(mathMethod.addMethod(10, 10));
        System.out.println(mathMethod.subMethod(10,10));
        System.out.println(mathMethod.multiMethod(10, 10));
        System.out.println(mathMethod.divMethod(10,10));
    }

    public void getUserDetails(){
        LoginInputs loginInputs = new LoginInputs();

        String firstName = "Harsha Vardhan";
        String lastName = "Kanakagiri";
        String email = "Kanakagirih@gmail.com";
        String gender = "Male";
        int age = 17;
        String phNumber = "+91 9182203017";

        System.out.println(loginInputs.userName(firstName, lastName));
        System.out.println(loginInputs.gender(gender));
        System.out.println(loginInputs.email(email));
        System.out.println(loginInputs.age(age));
        System.out.println(loginInputs.phoneNumber(phNumber));

        if (age >= 18){
            System.out.println(" Welcome to Dot Technologies");
        }else if(age < 18){
            System.out.println(" Sorry!, we can't let you In");
        }
    }
}

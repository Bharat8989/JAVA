package conditions;

public class Main {
    public static void main(String args[]){
        String userName = "Bharat";   // correct username
        String password = "123";      // correct password

        String inputUser = "Bharat"; // user entered username
        String inputPass = "123s";    // user entered password

        if(inputUser.equals(userName) && inputPass.equals(password)) {
            System.out.println("Login successful");
        } 
        else if(!inputUser.equals(userName) && !inputPass.equals(password)) {
            System.out.println("Username and password both are wrong");
        } 
        else if(!inputUser.equals(userName)) {
            System.out.println("Username is wrong");
        } 
        else if(!inputPass.equals(password)) {
            System.out.println("Password is wrong");
        }
    }
}

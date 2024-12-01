class Main1 {
    // Private field
    private String name;

    // Setter method
    public void setName(String n) {
        name = n; // Assign the value to the private field
    }

    // Getter method
    public String getName() {
        return name; // Return the value of the private field
    }
}

public class Main {
    public static void main(String[] args) {
        Main1 kk = new Main1();

        // Setting the name
        kk.setName("Bharat Kadam");

        // Getting and displaying the name
        System.out.println("Your name is: " + kk.getName());
    }
} 
// encapsulations

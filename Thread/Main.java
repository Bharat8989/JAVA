class Main {
    public static void main(String[] args) {
        // nested if else
        int age = 19;
        int weight = 45;

        if (age >= 18) {
            if (weight >= 50) {
                System.out.println("You can donate the blood.");
            } else {
                System.out.println("You cannot donate blood due to weight.");
            }
        } else {
            System.out.println("You cannot donate blood due to age.");
        }
    }
}

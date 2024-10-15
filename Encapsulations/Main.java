class Person {
    private String CarColor;

    public void SetColor(String Color) {
        CarColor = Color;
    }

    public String GetColor() {
        return CarColor;
    }
}

public class Main {
    public static void main(String[] args) {
        Person pro = new Person();
        pro.SetColor("blue");
        System.out.println("Set color is: " + pro.GetColor());
    }
}

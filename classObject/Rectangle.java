package classObject;
class Rectangle
{
    int length=12;
    int b=10;
    void rect(){
        int RectangleLength= length*b;
        System.out.println(RectangleLength);
    }
    public static void main(String args[])

    {
        Rectangle re=new Rectangle();
        re.rect();
    }
}
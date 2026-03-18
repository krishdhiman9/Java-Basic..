package accessModifiers;
class Rectangle {
    int length;
    int breadth;

    // Default constructor
    Rectangle() {
        length = 0;
        breadth = 0;
    }

    // Parameterized constructor (overloaded)
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void area() {
        int area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }

    public static void main(String[] args) {
        // object using parameterized constructor
        Rectangle r1 = new Rectangle(5, 5);

        r1.area();
    }
}

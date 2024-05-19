package start.Lesson3;

public class MathOperations {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        int sum = x + y;
        //System.out.println(sum);

        int diff = x - y;
        //System.out.println(diff);

        int multiply = x * y;
        //System.out.println(multiply);

        double divide = (double) x / y;
        //System.out.println(divide);

        int ext = x * x;
        //System.out.println(ext);

        double height = 1.82;
        double weight = 98.7;
        double index = weight / (height*height);
        System.out.println(index);
    }
}

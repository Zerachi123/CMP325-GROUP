public class JavaClass{
    public static void main(String [] arguments) {
        int n = 10, firstNum = 0, secondNum = 1;
        int nextNum;
        for (int i=1;i<=n;i++) {
            System.out.print(firstNum + ", ");
            nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}

public class HomeTask3 {
    public static void main(String[] args) {
    double usNum1 = input.Double("Введите первое число");
    String math = input.Str("Введите действие");
    double usNum2 = input.Double("Введите второе число");
    try {
        double result = calc(usNum1,usNum2,math);
        System.out.println(result);
    } catch (RuntimeException e){
        System.out.println(e.getMessage());
    }
    }

    public static double calc (double num1, double num2, String operation){
        switch (operation){
            case "+":
                return num1+num2;
            case "-":
                return num1-num2;
            case "*":
                return num1*num2;
            case "/":
                return num1/num2;
            default:
                throw new RuntimeException("Запрашиваемое действие не найдено");
        }
    }

}

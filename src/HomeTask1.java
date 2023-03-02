import java.util.Scanner;

public class HomeTask1 {
//    Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
//    Ввод:5
//    Треугольное число 1 + 2 + 3 + 4 + 5 = 15
//    n! 1 * 2 * 3 * 4 * 5 = 120
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Введите число: ");
    int usersNum = input.nextInt();
    int cut = cutSum(usersNum);
    int fact = factorial(usersNum);
    System.out.printf("Треугольное число от %d = %d \n !%d = %d", usersNum, cut, usersNum, fact);
}
public static int cutSum (int usersNum){
    int res = 0;
    while (usersNum>=0){
        res+=usersNum;
        usersNum--;
    }
    return res;
}

public static int factorial (int usersNum){
    int res = 1;
    int counter = 1;
    while (counter<=usersNum){
        res *= counter;
        counter++;
    }
    return res;
}
}

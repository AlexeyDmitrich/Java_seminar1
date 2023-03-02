import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int[] nums = new int[] {3,2,2,3,4,3,4,4,3,3,4,6,2,2,3,5};
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число");
        int usersNum = input.nextInt();
        System.out.println(Arrays.toString(formatedArray1(nums, usersNum)));
//        System.out.println(Arrays.toString(formatedArray2(nums, usersNum)));
    }
/*
Дан массив nums = [3,2,2,3,4,3] и число val  вводим с клавиатуры
Если в массиве есть числа, равные заданному, нужно перенести
эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов массива
должны быть отличны от заданного, а остальные - равны ему.
Ввод: 3
Вывод:
2, 2, 4, 3, 3, 3
 */
public static int[] formatedArray1 (int[] usersArray, int usersNum){
int[] formArr = new int[usersArray.length];
int j = 0;
int k = 0;
    for (int i = 0; i < usersArray.length ; i++) {
        if (usersArray[i] == usersNum){
            formArr[formArr.length-(k+1)] = usersArray[i];
            k++;
        }
        else {
            formArr[j] = usersArray[i];
            j++;
        }
    }
    return formArr;
}
    public static int[] formatedArray2 (int[] usersArray, int usersNum){
        int[] formArr = new int[usersArray.length];

        for (int i = 0; i < usersArray.length ; i++) {
            for (int j = 0; j < formArr.length; j++) {
                if (usersArray[j]!=usersNum){
                    formArr[i]=usersArray[j];
                }
                else {
                    formArr[j]=usersNum;
                }
            }
        }
        return formArr;
    }

}

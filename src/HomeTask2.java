import java.util.Arrays;

public class HomeTask2 {
    // простые числа от 1 до 1000
    public static void main(String[] args) {
    int usersInput = input.Int("Введите число");
    System.out.println(usersInput);
    int[] simple = findSimple(usersInput);
        System.out.println(Arrays.toString(simple));
    }

    public static int[] findSimple (int usersNum){
        int n = usersNum;
        int[] founded = new int[usersNum];
        for (int i = 2; i < founded.length; i++) {
            founded[i] = i; //загружаем массив значениями от 2 до n последовательно
        }
        for (int i = 2; i < founded.length-2; i++) {
            if (founded[i]!=0){     // если значение в ячейке не нулевое - оставляем его на своём месте
                founded[i] = i;
                System.out.printf("Ячейка %d в работе\n", i);
                for (int j = (i+i); j < founded.length; j+=i) {
                    founded[j] = 0;   // забиваем нулями все следующие суммы числа, увеличивая число на каждой итеррации
                    // то есть для 2 это будет (2, 4, 6, 8, 10 ...), для 3 - (3, 6, 9, 12) и т. д.
                    // а вот 4 мы уже не обрабатываем, т.к. она встретилась в 2, и в строке 19 мы её откинем.
                    // соответственно из следующих 9 чисел (до 12) будут проверены только 3: (5, 7 и 11)
                    System.out.printf("Ячейка %d : значение %d\n", j, founded[j]);
                }
            }
            else {
                System.out.printf("Ячейку %d пропускаем\n", i);
            }
        }
        // если число ни разу не попалось в цикле (стр.22), мы можем считать его простым,
        // так как оно не будет являться произведением никаких чисел в диапазоне от 2 до себя.

        int counter = 0;
        for (int i = 0; i < founded.length; i++) {
            if (founded[i] > 0){
                counter++;
            }
        }
        int[] simple = new int[counter];
        int j = 0;
        for (int i = 0; i < founded.length; i++) {
            if (founded[i] > 0){
                simple[j]=founded[i];
                j++;
            }
        }
        return simple;
    }

}

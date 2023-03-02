public class Task2 {
    public static void main(String[] args) {
        int[] users_array = new int[]{1,0,0,1,1,1,0,1,0,1,0,1,1,1,1,1,0,1,1,1,1,1,1,1};
        System.out.printf("Максимальная последовательность = %d", calc1(users_array));
    }
    /*
    Дан массив двоичных чисел, например [1,1,0,1,1,1,1,0,1,1,1],
вывести максимальное количество подряд идущих 1.
Вывод: 4
     */
    public static int calc1 (int[] users_array){
        int counter = 0;
        int tempCount = 0;
        for (int i = 0; i < users_array.length; i++) {
            if (users_array[i] == 1){
                tempCount++;
            }
            if (tempCount>counter){
                counter=tempCount;
            }
            if (users_array[i]==0){
                tempCount=0;
            }
        }
        return counter;
    }
}
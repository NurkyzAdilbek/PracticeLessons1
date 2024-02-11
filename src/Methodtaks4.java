import java.util.Arrays;

public class Methodtaks4 {
    public static void main(String[] args) {
        // Параметирине бүтүн сандардын массивин алган
        // жана бардык бүтүн сандары 1ге көбөйтүлгөн жаңы
        // массивди кайтарган метод  жазыңыз
        int [] array= {1,3,454,678,8536,657};
        arrays(array);
    }
    public static void arrays (int []array) {
        int [] array1=new int [array.length];
        for (int i = 0; i < array.length; i++) {
            array1[i]=array[i]+1;
        }
        System.out.println(Arrays.toString(array1));
    }
}

import java.util.Arrays;

class QuickSort {
    public static int middleShow = 0;
    public static int meaning = 0;
    public static int meaningShow = 0;
    public static void quickSort(int[] array, int start, int end ){
        if (end == -1) {
            System.out.println("Массив не заполнен");
            return ;
        }
        if (end <= 0) {
            System.out.println("В массиве только одно число");
            return;
        }

        int middle = start + (end - start) / 2;
        meaning = array[middle];
        if (middleShow == 0){
            middleShow = middle;
            meaningShow = meaning;
        }

        int s = start;
        int e = end;
        while (s <= e){
            while (array[s] < meaning){
                s++;
            }

            while (array[e] > meaning){
                e--;
            }

            if (s <= e) {
                int temp = array[s];
                array[s] = array[e];
                array[e] = temp;
                s ++;
                e --;
                System.out.println("промежуточный массив" + Arrays.toString(array));
            }

            if(start < e){
               quickSort(array, start, e);
            }

            if (end > s){
                quickSort(array, s, end);
            }
        }
    }

    public static void main(String[] args) {
        int [] array = new int[]{8,6,7,5,3,4,2,1,5};
        System.out.println("     исходный массив" + Arrays.toString(array));
        quickSort(array,0, array.length -1);
        System.out.println("центр массива: " + middleShow);
        System.out.println("значения центра массива: " + meaningShow);
        System.out.println("сортированный массив" + Arrays.toString(array));

    }

}
package sort;

import java.util.Arrays;

/*      冒泡排序（Bubble Sorting）的基本思想是：通过对待排序序列从前向后（从下标较小的元素开始）,
        依次比较 相邻元素的值，若发现逆序则交换，使值较大的元素逐渐从前移向后部，就象水底下的气泡一样逐渐向上冒。*/
public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {3, 9, -1, 10, 20};
        System.out.printf(Arrays.toString(bubble(arr)));
    }

    //从小到大排序
    public static int[] bubble(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = 0;
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}

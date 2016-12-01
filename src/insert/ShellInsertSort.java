package insert;

/**
 * Created by zeyuanguo on 16/12/1.
 * 插入排序，希尔排序
 */
public class ShellInsertSort {
    public static void main(String[] args) {
        /**
         * 从小到大排序
         */
        int[] initArray = {1,3,2,8,3,6,9,23,11};
        int dk = initArray.length / 2;
        while (dk >= 1) {
            for (int i = 0; i < initArray.length - dk; i++) {
                if (initArray[i + dk] < initArray[i]) {
                    int tmp = initArray[i];
                    initArray[i] = initArray[i + dk];
                    initArray[i + dk] = tmp;
                }
            }
            dk = dk / 2;
        }

        for (int i : initArray) {
            System.out.println(i);
        }
    }
}

package insert;

/**
 * Created by zeyuanguo on 16/12/1.
 * 插入排序，直接插入排序
 * 时间复杂度 O(n^2)
 */
public class InsertSort {
    public static void main(String[] args) {
        /**
         * 从小到大排序
         */
        int[] initArray = {1,3,2,8,3,6,9,23,11};
        for (int i = 1; i < initArray.length; i++) {
            if (initArray[i] < initArray[i - 1]) { // 如果当前值比上一个值小
                int now = initArray[i]; // 把当前值当做哨兵
                int j = i - 1;
                while (now < initArray[j]) { // 循环已排序数据，插入合适的位置
                    int bigger = initArray[j];
                    initArray[j] = now;
                    initArray[j + 1] = bigger;
                }
            }
        }

        for (int i = 0; i < initArray.length; i++) {
            System.out.println(initArray[i]);
        }
    }
}

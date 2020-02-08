package com.zhangjiabao.zhangjiabao;

import java.util.Arrays;

public class studyday01 {
    public static int count;

    public static void main(String[] args) {
        int arr[]={11,23,33,44,55,66,77,88,99,7,9,4,5,6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int findata=99;
       int rr= searchResoult(arr,0,arr.length-1,99);
        System.out.println("查询了"+count+"次");
        System.out.println("下标位"+rr);


    }

    /**
     * 二分法处理数组实现快速查找
     *
     * @param arr       查找数组
     * @param start     开始位置
     * @param end       结束位置
     * @param findValue 查找元素
     * @return 找到返回数组所在位置否则返回-1
     */
    public static int searchResoult(int [] arr, int start, int end, int findValue) {

        //判断数组的有效性
        if (arr == null) {
            System.out.println("arr == null");
            return -1;
        }
        count++;
        //获取中间位置
        if (start<=end) {
            //获取中间位置
            int modelindex = start + (end - start) / 2;
            int modelindexvalue=arr[modelindex];
            if (findValue == modelindexvalue) {
                return modelindex;
            } else if (findValue > modelindexvalue) {
                return searchResoult(arr, modelindex+1, end, findValue);


            } else if (findValue < modelindexvalue) {

                return searchResoult(arr, start, modelindex-1, findValue);

            }


        }else {
            return -1;

        }

        System.out.println("没有执行");
return -1;

    }
}

package com.lemon.zuoye;

/**
 * @Project: java_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: java32期 T0123
 * @Author: tian
 * @Create: 2021-09-05 17:34
 * @Desc：
 **/
public class paixu {
    public static void main(String[] args) {
        int arr[] = {9, 7, 5, 6, 8, 4, 3, 2,1};
        System.out.print("排序前：");
        for (int x1:arr)//遍历数组中的元素并且打印
            System.out.print(x1);
        for (int i = 0; i<arr.length -1; i++){
            //控制内层循环次数
            for(int j = 0 ;j<  arr.length -1-i; j++){
                //控制外层循环次数
                if(arr[j] > arr[j + 1]){
                    //把大的值交换到后面
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.print("排序后:");
        for(int num:arr)
            System.out.print(num);
    }
    }

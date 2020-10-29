package com.aisino.sort;

    /**给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
     对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
     你可以返回任何满足上述条件的数组作为答案。
     示例：
     输入：[4,2,5,7]
    输出：[4,5,2,7]
    解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。
    */

import java.util.Arrays;

/**
 * @author: xuguangwu
 * @Description:
 * @date Created in 2020-10-21-下午 5:20
 */
public class ArrayJiOuPaiXu {
    public static int [] sortArrayByParity1(int [] arr){
        int [] output = new int[arr.length];
        int index = 0;
        for(int i:arr){         //特别注意的地方：i是元素，不是下标。
            if(i%2==0) {
                output[index] = i;
                index += 2;
            }
        }
        int index2=1;
        for(int i:arr){
            if(i%2!=0){
                output[index2] = i;
                index2+=2;
            }
        }
        return output;
    }
    public static void main(String args[]){
        int arr []= new int[]{4,2,5,7};
        System.out.println(Arrays.toString(sortArrayByParity1(arr)));
    }
}

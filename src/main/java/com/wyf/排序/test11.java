package com.wyf.排序;

import org.springframework.beans.factory.support.DefaultSingletonBeanRegistry;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
//import org.springframework.beans.factory.support.DefaultSingletonBeanRegistry;

public class test11 {

    public static void  sort(Integer[] array,int n){
        if (n <= 1){
            return;
        }

        //有n个元素，进行n次冒泡
        for(int i = 0; i < n ; i++){

            //每一次冒泡，彼此交换相邻两个数据
            for(int j = 0; j < n-i-1 ; j++){
                System.out.println("i:{}" + i + " j:{}" + j);

                if(array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Integer[] integers = {2,77,55,34};

        System.out.println("排序前："+ Arrays.deepToString(integers));

        sort(integers,integers.length);

        System.out.println("排序后："+ Arrays.deepToString(integers));

        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.incrementAndGet();

        DefaultSingletonBeanRegistry defaultSingletonBeanRegistry = new DefaultSingletonBeanRegistry();
    }


    public String reverseWords(String s) {

        List<String> array1 = Arrays.asList(s.split(String.valueOf(' ')));

        StringBuffer a = new StringBuffer();
        for (int i = array1.size()-1; i >-1; i--){
            a.append(array1.get(i));
            if (i != 0){
                a.append(String.valueOf(' '));
            }
        }

        return a.toString();
    }
}

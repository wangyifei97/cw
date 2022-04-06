package com.wyf.liKou;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * @className: com.wyf.liKou-> hhh
 * @author: 王一飞
 * @createDate: 2022-01-18 9:01 下午
 * @description:
 */
public class hhh {
    public static void main(String[] args) {
        System.out.println("出现频率最多的词语: 排行版启动");
        System.out.println("");

        //        System.out.println("请输入排行版输出的数量：");
        //        Integer count = Integer.valueOf(new Scanner(System.in).next());

        System.out.println("请输入文本：");
        StringBuilder text = new StringBuilder();
        //
        //        Scanner scanner = new Scanner(System.in);
        //        if (scanner.hasNextLine()) {
        //            text.append(scanner.nextLine());
        //        }

        text.append("吴亦凡吃 吴");
        extractData(text.toString());
    }


    /**
     * @createAuthor: 王一飞
     * @title: 出现频率最多的词语
     * @createDate: 2022/2/19 1:56 下午
     * @return: List<String>
     */
    private static List<String> extractData(String text) {
        char[] chars = text.replaceAll(" ", "").toCharArray();
        HashMap<String, Integer> map = new HashMap<>();

        //        //  每次取一个值，双指针，前指针的开始和结束下标，后指针的开始和结束下标
        //        int hierarchy = 1, startIndexI = 0, endIndexI = startIndexI + hierarchy, endIndexJ = chars.length - 1, startIndexJ = endIndexJ - hierarchy;
        //        while (endIndexI < startIndexJ) {
        //            stringSplicing(chars,);
        //            map.put(chars[startIndexI], );
        //        }
        //  双指针
        int startIndex = 0, endIndex = chars.length - 1, hierarchy = 1;
        while (startIndex + 1 < endIndex) {
            String key = stringSplicing(String.valueOf(chars[startIndex]), String.valueOf(chars[startIndex + 1]));
            map.put(key, Objects.isNull(map.get(key)) ? 1 : map.get(key));
            startIndex++;
        }

        return null;
    }


    /**
     * @createAuthor: 王一飞
     * @title: 拼接字符串
     * @createDate: 2022/2/19 3:19 下午
     */
    private static String stringSplicing(String... strings) {
        StringBuilder resultString = new StringBuilder();
        for (String word : strings) {
            resultString.append(word);
        }
        return resultString.toString();
    }
}

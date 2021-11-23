package com.wyf.dataStructure.Node;

import cn.hutool.core.collection.CollectionUtil;
import lombok.Data;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.stream.Collectors;

/**
 * @Author wangyifei
 * @Date 2021-11-22 21:59:22
 * @deprecated : 面试题
 **/
public class NodeTest {
    /**
     * 请写一个函数void print(List< Node> lit,)-.}.
     * (可以有辅助函数)
     * 把输入的数据在控制台打印为个有缩进的树形结构。 例如:
     * AA
     * ----BB
     * --------FF
     * --------GG
     * ----CC
     * --------DD
     * ------------HH
     * --------EE
     * ------------II
     */
    private static List<Node> list;

    static {
        list = new ArrayList<Node>() {{
            add(new Node() {{
                setId(1);
                setParentId(0);
                setName("AA");
            }});
            add(new Node() {{
                setId(2);
                setParentId(1);
                setName("BB");
            }});
            add(new Node() {{
                setId(3);
                setParentId(1);
                setName("CC");
            }});
            add(new Node() {{
                setId(4);
                setParentId(3);
                setName("DD");
            }});
            add(new Node() {{
                setId(5);
                setParentId(3);
                setName("EE");
            }});
            add(new Node() {{
                setId(6);
                setParentId(2);
                setName("FF");
            }});
            add(new Node() {{
                setId(7);
                setParentId(2);
                setName("GG");
            }});
            add(new Node() {{
                setId(8);
                setParentId(4);
                setName("HH");
            }});
            add(new Node() {{
                setId(9);
                setParentId(5);
                setName("II");
            }});
            add(new Node() {{
                setId(10);
                setParentId(0);
                setName("JJ");
            }});
            add(new Node() {{
                setId(11);
                setParentId(10);
                setName("KK");
            }});
            add(new Node() {{
                setId(12);
                setParentId(10);
                setName("LL");
            }});
            add(new Node() {{
                setId(13);
                setParentId(13);
                setName("MM");
            }});
            add(new Node() {{
                setId(14);
                setParentId(13);
                setName("NN");
            }});
            add(new Node() {{
                setId(15);
                setParentId(14);
                setName("OO");
            }});
        }};
    }

    public static void main(String[] args) {
        try {
            print2(list);
        } catch (Exception e) {
        }
    }

    public static void print2(List<Node> list) throws Exception {
        // 存放id，用于判断是否存在
        ArrayList<Integer> idResultList = new ArrayList<>(list.size());
        // 存放结果字符串
        ArrayList<String> stringResultList = new ArrayList<>(list.size());
        // 存放层级数
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Node node : list) {
            map.put(node.getId(), 0);
        }

        for (Node node : list) {
            //判断是否存在
            if (idResultList.contains(node.getParentId())) {
                // 获取父id的下标，用于层级
                Integer index = getIndexByName(idResultList, node.getParentId());
                // 标记位：判断是否存在
                idResultList.add(index + 1, node.getId());

                // 层级数
                Integer count = map.get(node.getParentId()) + 1;
                stringResultList.add(index + 1, getBlankSpace(count) + node.getName());
                // 层级数+1
                map.put(node.getId(), count);
            } else {
                idResultList.add(node.getId());
                stringResultList.add(node.getName());
            }
        }
        System.out.println(Arrays.toString(stringResultList.toArray()));
    }

    public static String getBlankSpace(Integer count) {
        String temp = "----";
        StringBuilder blankSpace = new StringBuilder();
        for (Integer i = 0; i < count; i++) {
            blankSpace.append(temp);
        }
        return blankSpace.toString();
    }

    public static Integer getIndexByName(List<Integer> list, Integer name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(name)) {
                return i;
            }
        }
        return - 1;
    }
}

@Data
class Node {
    int id;
    int parentId;
    String name;
    Boolean isBlank;
}

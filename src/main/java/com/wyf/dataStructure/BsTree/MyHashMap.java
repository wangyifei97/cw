package com.wyf.dataStructure.BsTree;

/**
 * @author 王一飞
 * @description:
 * @since 2021/5/23--23:17
 */
public class MyHashMap {

    //初始大小
    private final int CAPCAITY = 10000;
    Node[] nodes = new Node[CAPCAITY];

    //获取key对应的数组索引
    public static int hashCode(int value) {
        return value;
    }

    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        map.put(1, 1);
        map.put(2, 2);
        map.put(1, 40);
        map.put(2, 200);

        map.remove(2);

        System.out.println(map.get(1));
        System.out.println(map.get(2));
    }

    private int getIndex(int key) {
        int hash = Integer.hashCode(key);
        //高16位或低16位
        hash ^= (hash >>> 16);
        //与数组长度取模，得到对应的索引下标
        return hash % CAPCAITY;
    }

    public int get(int key) {
        Node now = nodes[getIndex(key)];
        if (null != now) {
            if (now.key == key) {
                return now.value;
            } else {
                while (null != now) {
                    if (now.key == key) {
                        return now.value;
                    }
                    now = now.next;
                }
            }
        }
        return -1;
    }

    public void put(int key, int value) {
        Node now = nodes[getIndex(key)], tmp = now;

        if (null != tmp) {
            Node prev = null;
            while (null != tmp) {
                if (tmp.key == key) {
                    tmp.value = value;
                    return;
                }
                prev = tmp;
                tmp = tmp.next;
            }
            tmp = prev;
        }

        Node node = new Node(key, value);
        if (null != tmp) {
            tmp.next = node;
        } else {
            nodes[getIndex(key)] = node;
        }
    }

    public void remove(int key) {
        //得到索引
        int idx = getIndex(key);
        //拿到首节点
        Node now = nodes[idx];

        if (null != now) {
            Node prev = null;
            while (null != now) {
                if (now.key == key) {
                    //1. 如果要删除的节点是首节点，那么直接让当前数组下标对应的首节点位为其下一个节点
                    if (null != prev) {
                        prev.next = now.next;
                    }
                    //2. 如果不是，那么让前一个节点的下一个节点指向当前要删除节点的下一个节点就实现了删除效果
                    else {
                        nodes[idx] = now.next;
                    }
                    now.next = null;
                    return;
                }
                //如果没找到，让前节点指向当前节点，当前节点指向其下一个节点
                prev = now;
                now = now.next;
            }
        }
    }

    //链表
    static class Node {
        //保存该节点的key，vlaue
        int key, value;
        //指向下一个节点
        Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}

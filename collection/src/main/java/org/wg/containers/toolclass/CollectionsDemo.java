package org.wg.containers.toolclass;

import org.junit.Test;

import java.util.*;

public class CollectionsDemo {
    @Test
    public void demo_4() {
        List<String> list = new ArrayList<String>();

        list.add("abcde");
        list.add("cba");
        list.add("zhangsan");
        list.add("zhaoliu");
        list.add("xiaoqiang");

        System.out.println(list);
//		Collections.replaceAll(list, "cba", "nba"); // set(indexOf("cba"),"nba");
        Collections.shuffle(list);
//		Collections.fill(list, "cc");
        System.out.println(list);
    }

    public static void demo_3() {
        /*
        TreeSet<String> ts = new TreeSet<String>(new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {

				int temp = o2.compareTo(o1);
				return temp;
			}

		});
		*/
        TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder(new ComparatorByLength()));

        ts.add("abc");
        ts.add("hahaha");
        ts.add("zzz");
        ts.add("aa");
        ts.add("cba");

        System.out.println(ts);

    }

    @Test
    public void demo_2() {
        List<String> list = new ArrayList<String>();

        list.add("abcde");
        list.add("cba");
        list.add("aa");
        list.add("zzz");
        list.add("cba");
        list.add("nbaa");
//		Collections.sort(list);
        System.out.println(list);

//		int index = Collections.binarySearch(list, "cba");
//		System.out.println("index="+index);

        //获取最大值。
        String max = Collections.max(list, new ComparatorByLength());
        System.out.println("max=" + max);
    }


    @Test
    public void demo_1() {

        List<String> list = new ArrayList<String>();

        list.add("abcde");
        list.add("cba");
        list.add("aa");
        list.add("zzz");
        list.add("cba");
        list.add("nbaa");
        System.out.println(list);

        //对list集合进行指定顺序的排序。
//		Collections.sort(list);
//		mySort(list);
//		mySort(list,new ComparatorByLength());
        Collections.sort(list, new ComparatorByLength());
        System.out.println(list);
    }

    public static <T> void mySort(List<T> list, Comparator<? super T> comp) {

        for (int i = 0; i < list.size() - 1; i++) {

            for (int j = i + 1; j < list.size(); j++) {

                if (comp.compare(list.get(i), list.get(j)) > 0) {

//					T temp = list.get(i);
//					list.set(i, list.get(j));
//					list.set(j, temp);
                    Collections.swap(list, i, j);

                }
            }
        }
    }


    public static <T extends Comparable<? super T>> void mySort(List<T> list) {

        for (int i = 0; i < list.size() - 1; i++) {

            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(i).compareTo(list.get(j)) > 0) {

//					T temp = list.get(i);
//					list.set(i, list.get(j));
//					list.set(j, temp);
                    Collections.swap(list, i, j);

                }
            }
        }
    }
}

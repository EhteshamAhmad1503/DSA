package Collection_Framework;

import java.util.*;

public class ArrayLists {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(3);
		list.add(15);
		list.add(45);
		list.add(65);
		list.add(80);
		//System.out.println(list + " ");
	//	list.add(100);
		//list.add(0, 50);
		System.out.println(list + " ");

		List<Integer> newlist = new ArrayList<Integer>();

		newlist.add(200);
		newlist.add(300);
		list.addAll(newlist);
		System.out.println(list);
//		System.out.println(list.get(4));

//		List<Integer> list = new ArrayList<Integer>();
//
//		list.add(35);
//		list.add(15);
//		list.add(4);
//		list.add(5);
//		list.add(81);
//		System.out.println(list + " ");
//		list.set(1, 50);
//		System.out.println(list);
//		System.out.println(list.contains(81));

//		// Collections.sort(list);
//		int size = list.size();
//		System.out.println(size);
//		list.remove(1);
//		System.out.println(list);
//		list.remove(Integer.valueOf(80));
//	   list.clear();
//		System.out.println(list);

//		List<Integer> list = new ArrayList<Integer>();
//
//		list.add(35);
//		list.add(15);
//		list.add(4);
//		list.add(5);
//		list.add(81);
//
//		System.out.println(list + " ");
//
//		for (Integer item : list) {
//			System.out.print(item + " ");
//		}

//		List<Integer> list = new ArrayList<Integer>();
//
//		list.add(35);
//		list.add(15);
//		list.add(4);
//		list.add(5);
//		list.add(81);
//
//		Iterator<Integer> it = list.iterator();
//
//		while (it.hasNext()) {
//			System.out.print(it.next() + " ");
		}

	}



package com.ray.advanced;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestGenericEx1 {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("A"); //加入
		list.add("B");
		list.remove("B");//刪除
		System.out.println(list); // [A]
		
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(1, "a"); 	//加入
		map.put(2, "b");
		System.out.println(map.get(1));  //a
		System.out.println(map.isEmpty()); //false 是否為空
		Set<Integer> set = map.keySet();  //取得key的set
		System.out.println(set);  //[1,2]
				
	}

}

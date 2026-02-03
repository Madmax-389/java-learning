package com.practise.hashmap;

import java.util.HashMap;

public class baiscs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Character,Integer> map= new HashMap<>();
map.put('a',8);
map.put('b', 3);

String str1="banana";
for (int i=0;i<str1.length();i++) {
	char ch = str1.charAt(i);
	map.put(ch, map.getOrDefault(ch, 0)+1);
}
System.out.println(map);
}

}

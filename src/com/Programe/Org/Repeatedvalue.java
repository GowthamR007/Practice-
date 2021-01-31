package com.Programe.Org;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repeatedvalue {
	public static void main(String[] args) {
		String s = "welcome god god here here here";
       Map<String, Integer> m = new LinkedHashMap<>();
		String[] all = s.split(" ");
		for (String words : all) {
			if (m.containsKey(words)) {
				Integer value = m.get(words);
				m.put(words, value + 1);

			} else {
			m.put(words, 1);
			}
			}System.out.println(m);
			Set<Entry<String, Integer>> entrySet = m.entrySet();
			for (Entry<String, Integer> entry : entrySet) {
			
				if (entry.getValue() > 1) {
					System.out.println(entry);
				}

				}
				
			}
		}


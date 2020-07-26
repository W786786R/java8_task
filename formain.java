package java_8_task.washiur.washiur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;

public class formain{
	public static void main(String[] args)
	{
		List<String> strList = Arrays.asList("abc", "rtrr", "bcd", "aur", "defg", "jk","aghj","aaa","aaa","aaaa","abc");
		List Pallindrome = formain.filterList(strList, IntPredicate::IsPallindrome);
		System.out.println(Pallindrome);
		
		
	}
	public static List filterList(List<String> list, IntPredicate predicate) {
		List finallist = new ArrayList<>();
		for (String strList : list) {
			if(predicate.test(strList)) {
				finallist.add(strList);
			}
		}
		return finallist;
	}
}

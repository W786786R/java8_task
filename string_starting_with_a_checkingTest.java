package java_8_task.washiur.washiur;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class string_starting_with_a_checkingTest {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("abc", "rtrr", "bcd", "aur", "defg", "jk","aghj","aaa","aaa","aaaa","abc");
        List<String> filtered = strList.stream() .filter(x -> x.length()== 3 && x.startsWith("a")) .collect(Collectors.toList());
        System.out.printf("List %s ", filtered);
       
    }

}

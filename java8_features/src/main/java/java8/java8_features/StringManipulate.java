package java8.java8_features;

import java.util.*;
import java.util.stream.Collectors;
public class StringManipulate {
	public List<String> stringManipulate(List<String> list)
	{
		return list.stream().filter(s -> s.startsWith("a")).filter(s -> s.length() == 3).collect(Collectors.toList());
	}
}
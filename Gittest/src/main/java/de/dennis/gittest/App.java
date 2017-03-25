package de.dennis.gittest;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App {

	public static void main(String[] args) {
		System.out.println("test");
		System.out.println("test2");
		streamIntegerSysout().stream().findAny();
	}

	static java.util.List<Integer> streamIntegerSysout() {
//		Integer[] ints = { 1, 2, 3, 4, 5 };
//		return Arrays.stream(ints).peek(System.out::println).collect(Collectors.toList());
		return IntStream.of(1,2,3,4).limit(3).mapToObj(i->new Integer(i)).peek(System.out::println).collect(Collectors.toList());
	}
}

package test.com;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Test01Main7 {

	public static void main(String[] args) {
		System.out.println("Stream...스트림..");

		// C:\MULTI_EDU_20\javaWork\java20stream\src\test\com\test.txt
		String path = "C:\\MULTI_EDU_20\\javaWork\\java20stream\\src\\test\\com\\test.txt";
		try {
			List<String> list = Files.lines(Paths.get(path), Charset.forName("UTF-8")).toList();
			System.out.println(list);
			System.out.println("=========");
			Files.lines(Paths.get(path), Charset.forName("UTF-8")).forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}// end main

}// end class
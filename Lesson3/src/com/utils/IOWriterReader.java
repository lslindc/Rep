package com.utils;

import java.io.*;
import java.util.Scanner;

public class IOWriterReader {

	static String separator = File.separator;
	static String path = "C:" + separator + "Users" + separator + "Serg" + separator + "Desktop" + separator + "text1";
	static String path2 = "C:" + separator + "Users" + separator + "Serg" + separator + "Desktop" + separator + "text2";
	// static String path2 = "C:%1$sUsers%1$sSerg%1$sDesktop%1$stext1";

	public static void writeToFile(String value) throws Exception {

		File file = new File(path);
		try {

			FileWriter wf = new FileWriter(file);
			wf.write(value);
			wf.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

	public static String readFromFile() throws Exception {

		File file = new File(path);

		Scanner scanner = null;

		try {
			FileReader rf = new FileReader(file);
			scanner = new Scanner(rf);

			System.out.println(scanner.nextLine());
			rf.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} finally {
			scanner.close();

		}

		return "default";
	}

}

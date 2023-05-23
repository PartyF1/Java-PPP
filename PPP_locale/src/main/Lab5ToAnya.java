package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Lab5ToAnya {
	public static void main(String[] args) {
		String result = "";
		ArrayList<String> priv = new ArrayList<String> ();
		ArrayList<String> prot = new ArrayList<String> ();
		ArrayList<String> pub = new ArrayList<String> ();
		try {
			String[] fields = readLines("arg.txt");
			for (int i = 1; i < fields.length-1; i++) {
				String type = (fields[i].split(" "))[0];
				switch (type) {
				case "private" : {
					priv.add(fields[i]);
					break;
				}
				case "protected" : {
					prot.add(fields[i]);
					break;
				}
				case "public" : {
					pub.add(fields[i]);
					break;
				}
				}
			}
			result += fields[0]+"\n";
			for (String el : pub) {
				result += el + "\n";
			}
			for (String el : prot) {
				result += el + "\n";
			}
			for (String el : priv) {
				result += el + "\n";
			}
			result += fields[fields.length-1];
			
			write("exit.txt", result);
		} catch (IOException e) {
			e.printStackTrace();
		}	
		

	}
	//Чтение файла 
	public static String[] readLines(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        int numberOfLines = countLines(filename);
        String[] lines = new String[numberOfLines];
        int i = 0;
        while ((line = bufferedReader.readLine()) != null) {
            lines[i] = line.replaceAll("	", "");
            i++;
        }
        bufferedReader.close();
        return lines;
    }
	//кол-во строк в файле
    private static int countLines(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int numberOfLines = 0;
        while (bufferedReader.readLine() != null) {        
            numberOfLines++;
        }
        bufferedReader.close();
        return numberOfLines;
    }
    //запись в файл
    public static void write(String file, String data) {
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(data);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

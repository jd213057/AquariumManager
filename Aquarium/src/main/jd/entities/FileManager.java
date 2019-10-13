package jd.entities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.UnsupportedEncodingException;

public class FileManager extends FileNotFoundException {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8098057964019925149L;
	
	private static final String FILENAME = "C:\\aquarium.txt";
	
	BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));
	

	
	public FileManager() {}
	
	
	public void createRecord(Aquarium aquarium) throws IOException {
		BufferedReader fileReader = new BufferedReader(new FileReader(FILENAME));
		String lineReader = fileReader.readLine();
		
		PrintWriter writer = new PrintWriter("aquarium.txt", "UTF-8");
		while ((lineReader)!=null) {
			lineReader = fileReader.readLine();
		}
		writer.println(aquarium.getNameRecord());
		writer.println("Date de la dernière maintenance:");
		writer.println(aquarium.toString());
		writer.close();
		fileReader.close();
	}
	
	public void updateRecord(Aquarium aquarium) throws IOException {
		BufferedReader fileReader = new BufferedReader(new FileReader(FILENAME));
		String lineReader= fileReader.readLine();
		try {
			
			lineReader = fileReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		while ((lineReader)!=null && (lineReader)!=aquarium.getNameRecord()) {
			lineReader = fileReader.readLine();
		}
		for (int i=0; i<=3; i++) {
			FileWriter updater = new FileWriter("Tonfichier", false);
		
	}
		fileReader.close();
	}
	
	public void readAllRecords() throws IOException {
		BufferedReader fileReader = new BufferedReader(new FileReader(FILENAME));
		String lineReader = fileReader.readLine();
		while ((lineReader)!=null) {
			System.out.println(lineReader);
			lineReader = fileReader.readLine();
		}
		fileReader.close();
	}
		
	public void readRecord(String nameRecord) throws IOException {
		BufferedReader fileReader = new BufferedReader(new FileReader(FILENAME));
		String lineReader = fileReader.readLine();
		while ((lineReader)!=null && (lineReader)!=nameRecord) {
			lineReader = fileReader.readLine();
		}
		System.out.println("Contenu de l'enregistrement:");
		System.out.println();
		for (int i=0; i<=3; i++) {
			System.out.println(lineReader);
			lineReader = fileReader.readLine();
		}
		fileReader.close();
	}
	
	public void deleteAllRecordsFromFile() throws IOException {
		FileOutputStream fos = new FileOutputStream( FILENAME );
	}
	
	public File copyAllRecordsIntoNewFile() throws IOException {
		System.out.println("Saisir le nom du nouveau fichier.");
		System.out.println("Ce fichier sera copié sur votre bureau");
		String FILENAMECOPY = keyboardReader.readLine();
		BufferedReader fileReader = new BufferedReader(new FileReader(FILENAME));
		BufferedWriter fileWriter = new BufferedWriter(new File(FILENAMECOPY));
		String lineReader = fileReader.readLine();
		while ((lineReader)!=null) {
			
		}
		
		
		return null;
		
		
	}
	
	
}
		
	
		
	

	
	
	


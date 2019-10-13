package jd.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

import jd.entities.Aquarium;
import jd.entities.FileManager;

public class MainAquarium {
	FileManager filemanager = new FileManager();

	public static void main(String[] args) throws IOException {
		boolean quitter = false;
		BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));
		
		
		FileManager filemanager;
		
		while(quitter == false) {
			System.out.println("Menu principal:");
			System.out.println("Tapez la valeur correspondant à la fonctionnalité que vous souhaitez acceder:");
			System.out.println();
			System.out.println("1 - Consulter l'ensemble des enregistrements.");
			System.out.println("2 - Consulter un enregistrement spécifique (nomEnregistrement requis).");
			System.out.println("3 - Créer un nouvel enregistrement.");
			System.out.println("4 - Mettre à jour enregistrement existant (nomEnregistrement requis).");
			System.out.println("5 - Effacer tout le contenu du fichier.");
			System.out.println("6 - Copier l'ensemble des doonnées sur un nouveau fichier sur votre bureau.");
			System.out.println("7 - Quitter la console.");
			
			int choise = keyboardReader.read();
			
			switch (choise) {
			
			case 1:
				System.out.println("Ci-dessous l'ensemble des enregistrements du fichier.");
				filemanager.readAllRecords();
				break;
			case 2:
				System.out.println("Saisir le nomEnregistrement que vous souhaitez afficher:");
				String nameRecord = keyboardReader.readLine();
				filemanager.readRecord(nameRecord);
				break;
			case 3:
				System.out.println("Saisissez dans l'ordre qui suit l'ensemble des paramètres demandés:");
				Aquarium aquarium = new Aquarium();
				System.out.println("idAquarium (valeur entière):");
				int idAquarium = keyboardReader.read();
				aquarium.setIdAquarium(idAquarium);
				System.out.println("Date dernière maintenance (YYYY/MM/DD)");
				String dateString = keyboardReader.readLine();
				int beginIndex = dateString.indexOf('/');
				int endIndex = dateString.lastIndexOf('/');
	            String yearString = dateString.substring(1, beginIndex);
	            String monthString = dateString.substring(beginIndex, endIndex);
	            String dayString = dateString.substring(endIndex);
				int year = 	Integer.parseInt(yearString);
				int month = Integer.parseInt(monthString);
				int day = Integer.parseInt(dayString);
				Date dateLastMaintenance = new Date(year, month, day);
				aquarium.setDerniereMaintenance(dateLastMaintenance);
				System.out.println("Date prochaine maintenance (YYYY/MM/DD)");
				dateString = keyboardReader.readLine();
				beginIndex = dateString.indexOf('/');
				endIndex = dateString.lastIndexOf('/');
	            yearString = dateString.substring(1, beginIndex);
	            monthString = dateString.substring(beginIndex, endIndex);
	            dayString = dateString.substring(endIndex);
				year = 	Integer.parseInt(yearString);
				month = Integer.parseInt(monthString);
				day = Integer.parseInt(dayString);
				Date dateNextMaintenance = new Date(year, month, day);
				aquarium.setProchaineMaintenance(dateLastMaintenance);
				filemanager.createRecord(aquarium);
			case 4:
				filemanager.updateRecord(Aquarium aquarium);
				
			case 5:
				filemanager.deleteAllRecordsFromFile();
				System.out.println("Contenu du fichier effacé.");
				break;
			case 6:
				filemanager.copyAllRecordsIntoNewFile();
				System.out.println("Fichier copié sur le bureau.");
				break;
			case 7:
				quitter = true;
			    break;
				
			}
			
		}

	}

}

package fr.formation.inti.file;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import fr.formation.inti.entities.Employee;

public class FileObject {

	public void saveEmployee(Employee e) throws IOException {
		
		// penser à changer le chemin d'acces au fichier
		ObjectOutputStream flux = new ObjectOutputStream(new FileOutputStream("C:\\cheminPourAccederAuFichier"));
		
		flux.writeObject(e);
		
	}

}

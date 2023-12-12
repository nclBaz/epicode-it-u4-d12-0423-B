package riccardogulin;

import riccardogulin.dao.StudentsDAO;
import riccardogulin.entities.Student;
import riccardogulin.entities.StudentType;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {
	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("u4d12");
	// "u4d12" DEVE CORRISPONDERE ESATTAMENTE al nome della persistence unit dichiarata nel persistence.xml

	// EntityManagerFactory è l'oggetto che mi consente di creare gli EntityManager
	public static void main(String[] args) {
		EntityManager em = emf.createEntityManager(); // Entity Manager è responsabile della gestione delle interazioni col DB
		StudentsDAO sd = new StudentsDAO(em);

		Student aldo = new Student("Aldo", "Baglio", StudentType.BACKEND);
		Student giovanni = new Student("Giovanni", "Storti", StudentType.FRONTEND);

		Student giacomo = new Student("Giacomo", "Poretti", StudentType.FULLSTACK);

		// ************************************ SAVE ********************************
/*		sd.save(aldo);
		sd.save(giovanni);
		sd.save(giacomo);*/

		// ************************************ FIND BY ID ********************************
		long id = 2;
		Student aldoFromDB = sd.findById(id);
		if (aldoFromDB != null) {
			System.out.println(aldoFromDB);
		} else {
			System.out.println("Studente con id " + id + " non trovato");
		}

		// ************************************ FIND BY ID AND DELETE ********************************
		sd.findByIdAndDelete(5);

		// A fine programma è sempre bene ricordarsi di chiudere entitymanager e entitymanagerfactory
		em.close();
		emf.close();
	}
}

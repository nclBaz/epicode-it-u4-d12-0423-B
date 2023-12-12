package riccardogulin;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {
	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("u4d12");
	// "u4d12" DEVE CORRISPONDERE ESATTAMENTE al nome della persistence unit dichiarata nel persistence.xml

	// EntityManagerFactory è l'oggetto che mi consente di creare gli EntityManager
	public static void main(String[] args) {
		System.out.println("HELLO WORLD");
	}
}

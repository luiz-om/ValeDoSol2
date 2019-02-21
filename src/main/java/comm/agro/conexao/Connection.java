package comm.agro.conexao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Connection {
	public static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("JavaPU");

	public EntityManager getConnection() {
		return emf.createEntityManager();

	}

}

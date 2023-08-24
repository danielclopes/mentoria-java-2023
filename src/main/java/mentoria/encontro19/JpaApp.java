package mentoria.encontro19;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import mentoria.encontro19.entity.Autor;
import mentoria.encontro19.repository.AutorRepository;

public class JpaApp {
	private static EntityManagerFactory emf = null;

	public static void main(String[] args) {
//		System.out.println(getAutor(3));
//		createAutor(new Autor("Fulano", "de Tal"));
		AutorRepository autorRepo = new AutorRepository();
		System.out.println(autorRepo.findAll());
	}
	
	public static EntityManagerFactory getEntityManagerFactory() {
		if (emf == null)
			emf = Persistence.createEntityManagerFactory("Autores-PU");
		
		return emf;
	}
	
	public static Autor getAutor(int id) {
		EntityManager em = getEntityManagerFactory().createEntityManager();
		try {
			return em.find(Autor.class, id);
		} finally {
			em.close();
		}
	}
	
	public static void createAutor(Autor autor) {
		EntityManager em = getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(autor);
			em.getTransaction().commit();
		} finally {
			em.close();
		}
	}

}

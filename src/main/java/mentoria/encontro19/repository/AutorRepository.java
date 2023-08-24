package mentoria.encontro19.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import mentoria.encontro19.entity.Autor;

public class AutorRepository extends AbstractRepository<Autor> {

	public List<Autor> findAll() {
		String sql = "select * from autores";

		Query query = getEntityManagerFactory()
				.createEntityManager()
				.createNativeQuery(sql, Autor.class);

		List<Autor> autores = null;

		try {
			autores = query.getResultList();
		} catch (NoResultException e) {
			autores = new ArrayList<>();
		}

		return autores;
	}
}

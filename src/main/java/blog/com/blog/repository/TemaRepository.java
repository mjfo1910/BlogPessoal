package blog.com.blog.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import blog.com.blog.model.Tema;

@Repository
    public interface TemaRepository  extends JpaRepository<Tema, Long> {	
		public List<Tema> findAllByTituloContainingIgnoreCase (String titulo); 


    }





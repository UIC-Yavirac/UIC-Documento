package uic.documento.document;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface DocumentRepository extends CrudRepository<Document, Long> {

    List<Document> findAll();
}

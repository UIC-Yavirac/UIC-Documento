package uic.documento.documentfk;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@CrossOrigin({ "*" })
@FeignClient(name = "bff.customer.documentfk", url = "http://localhost:3030/api/documentfk")
public interface CustomerDocumentfk {

    @GetMapping("/{id}/")
    DocumentfkDTO findById(@PathVariable("id") Long id);

    @GetMapping("/")
    List<DocumentfkDTO> findAll();

    @PostMapping("/")
    DocumentfkDTO save(DocumentfkDTO entity);

    @DeleteMapping("/{id}/")
    void deleteById(@PathVariable("id") Long id);

    @PutMapping("/{id}/")
    DocumentfkDTO update(@PathVariable("id") Long id, DocumentfkDTO entity);

    @PutMapping("/{id}/completardatos/")
    DocumentfkDTO completardatos(@PathVariable("id") Long id);

}

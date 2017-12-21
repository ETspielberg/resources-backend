package unidue.ub.services.resourcesbackend;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import unidue.ub.media.journals.Journal;

@RepositoryRestResource(collectionResourceRel = "journal", path = "journal")
public interface JournalRepository extends CrudRepository<Journal, String> {

}

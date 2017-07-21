package unidue.ub.services.resourcesbackend;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import unidue.ub.media.journals.Journal;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "journal", path = "journal")
public interface JournalRepository extends PagingAndSortingRepository<Journal, Long>{

}

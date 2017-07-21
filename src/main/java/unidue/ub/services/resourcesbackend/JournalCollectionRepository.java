package unidue.ub.services.resourcesbackend;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import unidue.ub.media.journals.JournalCollection;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "journalCollection", path = "journalCollection")
public interface JournalCollectionRepository extends PagingAndSortingRepository<JournalCollection, Long>{

}

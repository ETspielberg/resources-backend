package unidue.ub.services.resourcesbackend;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import unidue.ub.media.journals.JournalTitle;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "journalTitle", path = "journalTitle")
public interface JournalTitleRepository extends PagingAndSortingRepository<JournalTitle, Long>{

}

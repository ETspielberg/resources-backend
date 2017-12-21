package unidue.ub.services.resourcesbackend;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import unidue.ub.media.journals.Journalcollection;

@RepositoryRestResource(collectionResourceRel = "journalcollection", path = "journalcollection")
public interface JournalCollectionRepository extends PagingAndSortingRepository<Journalcollection, String>{

}

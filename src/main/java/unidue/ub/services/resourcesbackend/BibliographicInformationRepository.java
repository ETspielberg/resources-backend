package unidue.ub.services.resourcesbackend;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import unidue.ub.media.monographs.BibliographicInformation;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "bibliographicinformation", path = "bibliographicinformation")
public interface BibliographicInformationRepository extends PagingAndSortingRepository<BibliographicInformation, Long>{
	
	

}

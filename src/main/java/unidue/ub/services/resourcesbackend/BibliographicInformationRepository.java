package unidue.ub.services.resourcesbackend;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "bibliographicinformation", path = "bibliographicinformation")
public interface BibliographicInformationRepository {
	
	

}

package unidue.ub.services.resourcesbackend;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import org.springframework.web.bind.annotation.RequestParam;
import unidue.ub.media.journals.Journaltitle;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "journaltitle", path = "journaltitle")
public interface JournaltitleRepository extends PagingAndSortingRepository<Journaltitle, String>{

    @Query(value = "select distinct jt.issn from journal_title",nativeQuery = true)
    public List<String> findUniqueIssns();

    public List<Journaltitle> findByIssn(@RequestParam("issn") String issn);

}

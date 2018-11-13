package idv.villebez.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class Query implements GraphQLQueryResolver{
	@Autowired
	private LinkRepository linkRepository;

    public List<Link> allLinks() {
        return linkRepository.getAllLinks();
    }
}

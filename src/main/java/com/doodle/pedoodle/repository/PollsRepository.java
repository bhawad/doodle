package com.doodle.pedoodle.repository;


import com.doodle.pedoodle.model.Poll;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "polls", path = "polls")
public interface PollsRepository extends MongoRepository<Poll, String> {

    @RestResource(path = "byTitle", rel = "FindByTitleContains")
    List<Poll> findByTitleContains(String title);

    @RestResource(path = "byInitiator", rel = "FindByInitiatorNameContains")
    List<Poll> findByInitiatorNameContains(String initiatorName);

    @RestResource(path = "initiatedAfter", rel = "FindByInitiatedDateAfter")
    List<Poll> findByInitiatedAfter(@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Long initiated);
}

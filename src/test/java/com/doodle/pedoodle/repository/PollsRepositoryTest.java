package com.doodle.pedoodle.repository;

import com.doodle.pedoodle.model.Poll;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.List;

@DataMongoTest
@ExtendWith(SpringExtension.class)
class PollsRepositoryTest {

    private final static ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private final static String DATA_PATH = "src/test/resources/polls.json";


    @Autowired
    private PollsRepository pollsRepository;


    @BeforeEach
    void setUp() throws Exception {

        pollsRepository.deleteAll();

        List<Poll> initialPolls = OBJECT_MAPPER.readValue(new File(DATA_PATH), new TypeReference<List<Poll>>() {
        });

        pollsRepository.saveAll(initialPolls);
    }

    @Test
    void findByTitleContainsPositive() {

        String testValue = "sont les";
        List<Poll> positiveResult = pollsRepository.findByTitleContains(testValue);

        Assertions.assertEquals(1, positiveResult.size(), "Result of finding by title (Positive) must be 1");
        Assertions.assertTrue(positiveResult.get(0).getTitle().contains(testValue), "Result title must contain the searched text");
    }

    @Test
    void findByTitleContainsNegative() {

        String testValue = "Not Existing";
        List<Poll> positiveResult = pollsRepository.findByTitleContains(testValue);

        Assertions.assertEquals(0, positiveResult.size(), "Result of finding by title (Negative) must be None");
    }


    @Test
    void findByInitiatorNameContainsPositive() {
        String testValue = "Doe";
        List<Poll> positiveResult = pollsRepository.findByInitiatorNameContains(testValue);

        Assertions.assertEquals(36, positiveResult.size(), "Result of finding by initiator name (Positive) must be 36");
        Assertions.assertTrue(positiveResult.stream()
                .map(r -> r.getInitiator().getName().contains(testValue))
                .reduce((r1, r2) -> r1 && r2)
                .get(), "Result initiator names must all contain the searched text");
    }

    @Test
    void findByInitiatorNameContainsNegative() {
        String testValue = "Lee";
        List<Poll> positiveResult = pollsRepository.findByInitiatorNameContains(testValue);

        Assertions.assertEquals(0, positiveResult.size(), "Result of finding by initiator name (Negative) must be 0");
    }


    @Test
    void findByInitiatedGreaterThanPositive() throws Exception {
        Long testValue = new SimpleDateFormat("yyyy-MM-dd").parse("2017-01-25").getTime();

        List<Poll> positiveResult = pollsRepository.findByInitiatedAfter(testValue);
        Assertions.assertEquals(5, positiveResult.size(), "Result of finding by initiated date  (Positive) must be 5");
        Assertions.assertTrue(positiveResult.stream()
                .map(r -> r.getInitiated() > testValue)
                .reduce((r1, r2) -> r1 && r2)
                .get(), "Result initiated dates must be greater than the test value");
    }

    @Test
    void findByInitiatedGreaterThanNegative() throws Exception {
        Long testValue = new SimpleDateFormat("yyyy-MM-dd").parse("2017-01-29").getTime();

        List<Poll> positiveResult = pollsRepository.findByInitiatedAfter(testValue);
        Assertions.assertEquals(0, positiveResult.size(), "Result of finding by initiated date  (Negative) must be 0");
    }
}
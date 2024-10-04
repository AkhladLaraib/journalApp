package net.engineeringdigest.journalApp.scheduler;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserSchedulerTests {

    @Autowired
    private UserScheduler userScheduler;

    @Test
    void testFetchUsersAndSendSAMail() {
        userScheduler.fetchUsersAndSAMail();
    }
}

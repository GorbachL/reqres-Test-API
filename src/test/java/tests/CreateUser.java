package tests;

import adapters.UsersAdapter;
import models.JobUser;
import org.testng.annotations.Test;

public class CreateUser extends BaseTest {

    @Test
    public void createUser() {
        JobUser user = new UsersAdapter().post(new JobUser("name", "job", "23", ""));
        System.out.println(user);
    }
}

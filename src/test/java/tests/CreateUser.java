package tests;

import adapters.UsersAdapter;
import models.JobUser;
import org.testng.annotations.Test;

public class CreateUser extends BaseTest {

    @Test
    public void createUser() {
        JobUser user = new UsersAdapter().post(new JobUser("morpheus", "leader", "391", "2020-03-03T11:49:53.739Z", ""));
        System.out.println(user);
    }
}

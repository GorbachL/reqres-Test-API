package tests;

import adapters.UsersAdapter;
import models.JobUser;
import org.testng.annotations.Test;

public class UpdateUserPATCH extends BaseTest {

    @Test
    public void updateUserUsingPUT() {
        JobUser user = new UsersAdapter()
                .patch(new JobUser("morpheus", "zion resident", "391", "2020-03-03T11:49:53.739Z", "2020-03-03T14:40:19.695Z"));
        System.out.println(user);
    }
}

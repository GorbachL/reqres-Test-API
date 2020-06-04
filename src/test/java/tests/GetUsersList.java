package tests;

import adapters.UsersAdapter;
import models.UsersList;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;

import static org.testng.Assert.assertEquals;

public class GetUsersList extends BaseTest {

    @Test
    public void testGetUsersList() throws FileNotFoundException {
        UsersList expectedUsersList;
        expectedUsersList = gson.fromJson(new FileReader("src/test/java/resources/expectedUsersList.json"), UsersList.class);

        UsersList list = new UsersAdapter().get(2);
        assertEquals(list, expectedUsersList);
    }
}

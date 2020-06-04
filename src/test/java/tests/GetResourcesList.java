package tests;

import adapters.ResourcesAdapter;
import models.ResourceList;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;

import static org.testng.Assert.assertEquals;

public class GetResourcesList extends BaseTest {

    @Test
    public void GetResourcesList() throws FileNotFoundException {
        ResourceList expectedResourceList;
        expectedResourceList = gson.fromJson(new FileReader("src/test/java/resources/expectedResourcesList.json"), ResourceList.class);

        ResourceList list = new ResourcesAdapter().get();
        assertEquals(list, expectedResourceList);
    }
}


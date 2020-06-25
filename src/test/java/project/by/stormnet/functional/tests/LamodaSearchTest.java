package project.by.stormnet.functional.tests;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import project.by.stormnet.functional.entities.helpers.HomeHelper;

public class LamodaSearchTest {
    private HomeHelper homeHelper = new HomeHelper();
    private String searchKey = "jeans";

    @Test
    public void performSearch() {
        int countPerPage = homeHelper.search(searchKey).getSearchResultsCountPerPage();
        Assert.assertTrue(countPerPage > 0, "No results were found");
        //Assert.assertFalse(countPerPage > 0, "No results were found"); // поломали для Retry
    }

    @Test
    public void testPassed() {
        Assert.assertTrue(true);
    }

    @Test
    public void testSkipped() {
        throw new SkipException("This test is skipped");
    }

    @Test
    public void testFailed() {
        Assert.assertTrue(false);


    }
}
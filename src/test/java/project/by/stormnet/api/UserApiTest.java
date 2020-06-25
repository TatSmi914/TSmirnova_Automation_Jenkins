package project.by.stormnet.api;

import by.stormnet.core.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import project.by.stormnet.api.entities.UserService;

public class UserApiTest {


    private UserService userService = new UserService();

    @Test
    public void getUserTest() {
        Response response = userService.getUser();
        int code = response.getCode();
        boolean userCreated = response.getBody().contains("Michael");
        Assert.assertTrue(code == 200 && userCreated, "User is NOT added!");
    }

    @Test
    public void postUserTest() {
        Response response = userService.postUser();
        int code = response.getCode();
        boolean userCreated = response.getBody().contains("morpheus");
        Assert.assertTrue(code == 201 && userCreated, "User is NOT added!");
    }

    @Test
    public void putUserTest() {
        Response response = userService.putUser();
        int code = response.getCode();
        boolean userUpdated = response.getBody().contains("morpheus");
        Assert.assertTrue(code == 200 && userUpdated, "User is NOT updated!");
    }

    @Test
    public void deleteUserTest() {
        Response response = userService.deleteUser();
        int code = response.getCode();
        Assert.assertTrue(code == 204, "User is NOT deleted!");
    }

}

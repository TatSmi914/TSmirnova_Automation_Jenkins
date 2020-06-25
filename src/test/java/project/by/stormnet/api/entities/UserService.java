package project.by.stormnet.api.entities;

import by.stormnet.core.FrameworkHttpClient;
import by.stormnet.core.Response;

public class UserService extends AbstractService {
    private FrameworkHttpClient client = new FrameworkHttpClient();
    private String getUrl = baseUserUrl + "/api/users?page=2";
    private String postUrl = baseUserUrl + "/api/users";
    private String putUrl = baseUserUrl + "/api/users/2";
    private String deleteUrl = baseUserUrl + "/api/users/2";

    public Response postUser() {
        System.out.println("Post user");
        return client.doPost(postUrl, "{\n" + "\"name\": \"morpheus\", \n" + "\"job\": \"leader\"\n" + "}");
    }

    public Response putUser() {
        System.out.println("Put user");
        return client.doPut(putUrl, "{\n" + "\"name\": \"morpheus\", \n" + "\"job\": \"leader\"\n" + "}" );
    }

    public Response deleteUser() {
        System.out.println("Delete user");
        return client.doDelete(deleteUrl);
    }

    public Response getUser() {
        System.out.println("Get user");
        return client.doGet(getUrl);
    }
}

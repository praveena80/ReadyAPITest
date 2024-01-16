package api.endpoints;


public class Routes {
    //Maintain URL's
    public static String base_url = "https://petstore3.swagger.io/v2";

    //User Module
    public static String post_url=base_url+"/user";
    public static String get_url=base_url+"/user/{username}";
    public static String update_url=base_url+"/user/{username}";
    public static String delete_url=base_url+"/user/{username}";

}

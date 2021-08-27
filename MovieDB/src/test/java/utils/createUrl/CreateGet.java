package utils.createUrl;

import java.util.Objects;

public class CreateGet {
    private final StringBuilder url= new StringBuilder();
    String domain = "https://api.themoviedb.org/3/";
    String equals = "?api_key=";

    public static CreateGet getCreate() {
        return new CreateGet();
    }

    public String create(String category, String subCategory,String complement,String apiKey) {
        url.append(domain).append(category);
        if(!Objects.equals(subCategory, "")){url.append("/");}
        url.append(subCategory);
        if(!Objects.equals(complement, "")){url.append("/");}
        url.append(complement).append(equals).append(apiKey);
        return url.toString();
    }
}

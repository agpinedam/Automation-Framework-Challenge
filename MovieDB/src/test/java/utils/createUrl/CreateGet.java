package utils.createUrl;

public class CreateGet {
    private static CreateGet createGet;
    private StringBuilder url= new StringBuilder();
    private String domain = "https://api.themoviedb.org/3/";
    private String equals ="?api_key=";

    public static CreateGet getCreate() {
        createGet=new CreateGet();
        return  createGet;
    }

    public String create(String category, String subCategory,String complement,String apiKey) {
        url.append(domain+category);
        if(subCategory!=""){url.append("/");}
        url.append(subCategory);
        if(complement!=""){url.append("/");}
        url.append(complement+equals+apiKey);
        return url.toString();
    }
}

package utils;

public class GetDetails {
    private String apiKey;
    private static GetDetails getDetails;

    private GetDetails(String apiKey){
        this.apiKey=apiKey;
    }

    private String url(){
        StringBuilder url= new StringBuilder();
        url.append("https://api.themoviedb.org/3/authentication/token/new?api_key=");
        url.append(apiKey);
        return url.toString();
    }

    public static GetDetails getGetDetails(String apiKey) {
        if(getDetails==null){
            getDetails=new GetDetails(apiKey);
        }else {
            System.out.println("Error ");
        }
        return getDetails;
    }
    public String getUrl(){
        return url();
    }
}

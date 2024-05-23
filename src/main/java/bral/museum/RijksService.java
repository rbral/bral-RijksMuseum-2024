package bral.museum;

/*import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import java.io.IOException;*/

/*
Instructions:
You will need to create a RijksService that has 3 methods.
You can hard code the English version in the url’s culture field.
You must pass the api key with each request.
1. A request to the collection with no search parameters but the page number (p field)
2. A request to the collection with a query (q field) and page number
3. A request to the collection with a query for artist (involvedMaker field) and page number.

Write tests for all 3 requests.

The data you’re going to need to retrieve from the API call are
The “artObjects”
Each art object has a title, longTitle, webImage and principalOrFirstMaker
 */
public class RijksService
{
    public RijksService getService()
    {

        return null;
    }

    // chat gpt:

/*
    public JsonNode getCollection(int page) throws IOException {
        String url = String.format("%s?p=%d&key=%s", BASE_URL, page, API_KEY);
        return sendRequest(url);
    }

    public JsonNode searchCollection(String query, int page) throws IOException {
        String url = String.format("%s?q=%s&p=%d&key=%s", BASE_URL, query, page, API_KEY);
        return sendRequest(url);
    }

    public JsonNode searchByArtist(String artist, int page) throws IOException {
        String url = String.format("%s?involvedMaker=%s&p=%d&key=%s", BASE_URL, artist, page, API_KEY);
        return sendRequest(url);
    }

    private JsonNode sendRequest(String url) throws IOException {
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(url);
            try (CloseableHttpResponse response = httpClient.execute(request)) {
                ObjectMapper mapper = new ObjectMapper();
                return mapper.readTree(response.getEntity().getContent());
            }
        }
    }*/
}









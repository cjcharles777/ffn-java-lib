package com.donkeigy.ffn.webservice;

import com.donkeigy.ffn.Interceptors.FakeBrowserInterceptor;
import com.donkeigy.ffn.bo.FFNNFLTeams;
import com.donkeigy.ffn.bo.FFNPlayers;
import com.donkeigy.ffn.bo.FFNSchedule;
import com.donkeigy.ffn.bo.Team;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.*;

/**
 * Created by cedric on 10/20/15.
 */
public class FFNAPIWebService
{
    private String apiKey;

    public FFNAPIWebService(String apiKey)
    {
        this.apiKey = apiKey;
    }

    private RestTemplate prepareRestTemplate()
    {
        RestTemplate restTemplate = new RestTemplate();
        List<ClientHttpRequestInterceptor> interceptors = new LinkedList<ClientHttpRequestInterceptor>();
        interceptors.add(new FakeBrowserInterceptor());
        restTemplate.setInterceptors(interceptors);
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
        GsonHttpMessageConverter map = new GsonHttpMessageConverter();
        messageConverters.add(map);
        messageConverters.add(new FormHttpMessageConverter());
        restTemplate.setMessageConverters(messageConverters);
        return restTemplate;
    }
    public List<Team> getNFLTeamsList()
    {


        RestTemplate restTemplate = prepareRestTemplate();

        FFNNFLTeams response = restTemplate.getForObject("http://www.fantasyfootballnerd.com/service/nfl-teams/json" +
                "/"+apiKey+"/", FFNNFLTeams.class);

//        ResponseEntity<Team[]> responseEntity = restTemplate.getForEntity("http://www.fantasyfootballnerd.com/service/nfl-teams/json" +
//                "/3muq2f58iwve/", Team[].class);

        List<Team> result = new ArrayList<Team>();
        result.addAll(response.getNFLTeams());
        return result;

    }

    public FFNSchedule getSchedule()
    {
        RestTemplate restTemplate = prepareRestTemplate();
        FFNSchedule response = restTemplate.getForObject("http://www.fantasyfootballnerd.com/service/schedule/json/" +
                apiKey+"/", FFNSchedule.class);
        return response;
    }

    public FFNPlayers getPlayers()
    {
        RestTemplate restTemplate = prepareRestTemplate();
        FFNPlayers response = restTemplate.getForObject("http://www.fantasyfootballnerd.com/service/players/json/"+apiKey, FFNPlayers.class);
        return response;
    }
    public FFNPlayers getPlayers(String position)
    {
        RestTemplate restTemplate = prepareRestTemplate();
        FFNPlayers response = restTemplate.getForObject("http://www.fantasyfootballnerd.com/service/players/json/"+
                apiKey+"/"+position, FFNPlayers.class);
        return response;
    }


}

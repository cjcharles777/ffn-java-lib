package com.donkeigy.webservice;

import com.donkeigy.Interceptors.FakeBrowserInterceptor;
import com.donkeigy.bo.FFNNFLTeams;
import com.donkeigy.bo.Team;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.*;

/**
 * Created by cedric on 10/20/15.
 */
public class FFNAPIWebService
{
    public List<Team> getNFLTeamsList()
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
        FFNNFLTeams response = restTemplate.getForObject("http://www.fantasyfootballnerd.com/service/nfl-teams/json" +
                "/3muq2f58iwve/", FFNNFLTeams.class);

//        ResponseEntity<Team[]> responseEntity = restTemplate.getForEntity("http://www.fantasyfootballnerd.com/service/nfl-teams/json" +
//                "/3muq2f58iwve/", Team[].class);

        List<Team> result = new ArrayList<Team>();
        result.addAll(response.getNFLTeams());
        return result;

    }
}

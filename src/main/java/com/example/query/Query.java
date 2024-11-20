package com.example.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.request.SampleRequest;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {
    public String firstQuery(){
        return "First Query";
    }
    public String secondQuery(){
        return "Second Query";
    }

    public String fullName(SampleRequest sampleRequest){
        return sampleRequest.getFirstName()+" "+sampleRequest.getLastName();
    }

}
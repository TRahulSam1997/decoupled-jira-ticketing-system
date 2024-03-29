package com.jira.backend.RESTAPI;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class Main {
    private static final String JIRA_API_KEY = System.getenv("JIRA_API_KEY");
    private static final String JIRA_API_COOKIE = System.getenv("JIRA_API_COOKIE");
    private static final Logger log = LoggerFactory.getLogger(Main.class);

//    void API() {
//        OkHttpClient client = new OkHttpClient().newBuilder()
//                .build();
//        MediaType mediaType = MediaType.parse("application/json");
//        RequestBody body = RequestBody.create(mediaType, "{\n    \"update\": {},\n    \"fields\": {\n      \"summary\": \"Main order flow broken\",\n      \"issuetype\": {\n        \"name\": \"Bug\"\n      },\n      \"components\": [\n        {\n          \"id\": \"10000\"\n        }\n      ],\n      \"project\": {\n        \"id\": \"10000\"\n      },\n      \"description\": {\n        \"type\": \"doc\",\n        \"version\": 1,\n        \"content\": [\n          {\n            \"type\": \"paragraph\",\n            \"content\": [\n              {\n                \"text\": \"Order entry fails when selecting supplier.\",\n                \"type\": \"text\"\n              }\n            ]\n          }\n        ]\n      },\n      \"customfield_10014\": \"TES-1\",\n      \"labels\": [\n        \"bugfix\",\n        \"blitz_test\"\n      ]\n    }\n  }");
//        Request request = new Request.Builder()
//                .url("https://rahulsam.atlassian.net/rest/api/3/issue/")
//                .method("POST", body)
//                .addHeader("Accept", "application/json")
//                .addHeader("Content-Type", "application/json")
//                //Don't push this!
//                .addHeader("Authorization", JIRA_API_KEY)
//                .addHeader("Cookie", JIRA_API_COOKIE)
//        Response response = client.newCall(request).execute();
//    }

    public static void main(String[] args) {

        log.info("Hello World! -> " + JIRA_API_COOKIE);
    }
}

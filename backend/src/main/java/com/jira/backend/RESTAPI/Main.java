package com.jira.backend.RESTAPI;

public class Main {

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
//                .addHeader("Authorization", "Basic cmFodWxzYW1hcmFuYXlha2VAeWFob28uY29tOnd1ejJRWnQ2dlB0WUVNVjRtSXoyRTA5OQ==")
//                .addHeader("Cookie", "atlassian.xsrf.token=6b0a0f0d-981b-44f6-9c4e-910a2edf7d5a_ae11946d66ee1b29c7ea74480d0a5124875b0f4c_lin")
//                .build();
//        Response response = client.newCall(request).execute();
//    }

    public static void main(String[] args) {

    }
}

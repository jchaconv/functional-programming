package com.functional.programming.section03streams.brokenlinks;

import com.functional.programming.section03streams.util.LinkUtil;

public class Main {

    private static final String GOOGLE_URL = "https://www.google.com";

    /* 
     * HTTP Codes
     * 200: OK
     * 0: No host 
     * 404: bad url
     */
    
    public static void main(String[] args) {
        
        System.out.println(
            LinkUtil.getResponseCode(GOOGLE_URL + "/sszl/sldadlasd")
        );

    }

}

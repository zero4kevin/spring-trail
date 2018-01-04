package com.zero4kevin.spring;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by xi1zhang on 2018/1/3.
 */
public class Test {
    public static void main(String[] args){
        String s="ZMWL:IMEI:555485943;";
        Pattern pattern=Pattern.compile(":[IMSI|IMEI|MSISDN]:*");
        Matcher matcher=pattern.matcher(s);
        if(matcher.find()){
            int startIndex=s.indexOf(":");
            int endIndex=s.indexOf(":",startIndex+1);
            System.out.println(s.substring(0,endIndex)+":***");
        }else {
            System.out.println(s);
        }
//        s.replace(":[IMSI|IMEI|MSISDN]:\\d+[:|;]","xxx");
        System.out.println(s.replace(":[IMSI|IMEI|MSISDN]:\\d+[:|;]","xxx"));
    }
}

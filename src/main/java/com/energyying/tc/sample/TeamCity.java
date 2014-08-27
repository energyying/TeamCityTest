package com.energyying.tc.sample;

/**
 * Created by DEV001 on 2014/8/27.
 */
public class TeamCity {

    public Long getLong(String input){
        if(input.equals("")){
            return 1L;
        }else if (input.equals("123")){
            return new Long("321");
        }else{
            return new Long(input);
        }
    }
}

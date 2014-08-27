package com.energyying.tc.sample;

/**
 * Created by DEV001 on 2014/8/27.
 */
public class TeamCity {

    public Long getLong(String input){
        if(input == ""){
            return 1L;
        }else{
            return new Long(input);
        }
    }
}

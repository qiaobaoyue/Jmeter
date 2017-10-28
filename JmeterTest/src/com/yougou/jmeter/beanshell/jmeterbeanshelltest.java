package com.yougou.jmeter.beanshell;

import java.util.logging.Logger;

import org.apache.jmeter.samplers.SampleResult;

public class jmeterbeanshelltest {
    
	private SampleResult sr;
	private Logger log;
	
	
	
	
    public jmeterbeanshelltest(SampleResult slr){
    	this.sr=slr;
    }
	
    public String getresponsedata(){
    	sr = new SampleResult();
    	return sr.getResponseDataAsString();
    }
    
    public boolean result(){
    	boolean rs =false;
        if (this.getresponsedata().contains("思加图")){
        	rs=true;
        	sr.setSuccessful(rs);
        	
        }
        else {
        	sr.setSuccessful(rs);
        }
        
    	return rs;
    }
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    */
}

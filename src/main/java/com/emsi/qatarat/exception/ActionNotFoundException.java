package com.emsi.qatarat.exception;

public class ActionNotFoundException extends RuntimeException{

    public ActionNotFoundException(Long id){
        super(String.format("Not found action with id = %d",id));
    }

}

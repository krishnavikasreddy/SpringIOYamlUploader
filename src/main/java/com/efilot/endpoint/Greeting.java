/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.efilot.endpoint;
import com.efilot.validation.constraints.EqualsWith;
import javax.validation.constraints.NotNull;

/**
 *
 * @author krishna
 */
public class Greeting {

    @NotNull
    private final String id;
    
    @NotNull
    @EqualsWith(compareWith = "vikas")
    private final String content;
    
    public Greeting(){
        this.id = null;
        this.content = null;
    }
    
    public Greeting(String id, String content) {
        this.id = id;
        this.content = content;
    }
    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
    
    @Override
    public String toString() {
        return this.id + this.content;
    }
}
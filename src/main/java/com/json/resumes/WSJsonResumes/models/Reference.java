package com.json.resumes.WSJsonResumes.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "References")
public class Reference {
    
    private String _name;
    private String _reference;

    public Reference(String _name, String _reference) {
        this._name = _name;
        this._reference = _reference;
    }
    
    protected Reference(){
        
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public String getReference() {
        return _reference;
    }

    public void setReference(String reference) {
        this._reference = reference;
    }
    
    
    
}

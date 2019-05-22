package com.json.resumes.WSJsonResumes.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Languagess")
public class Language {
    
    private String _language;
    private String _fluency;

    public Language(String _language, String _fluency) {
        this._language = _language;
        this._fluency = _fluency;
    }
    
    protected Language(){
        
    }

    public String getLanguage() {
        return _language;
    }

    public void setLanguage(String language) {
        this._language = language;
    }

    public String getFluency() {
        return _fluency;
    }

    public void setFluency(String fluency) {
        this._fluency = fluency;
    }
    
    
    
}

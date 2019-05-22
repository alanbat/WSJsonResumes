package com.json.resumes.WSJsonResumes.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Publications")
public class Publication {
    
    private String _name;
    private String _publisher;
    private String _relaseDate;
    private String _website;
    private String _summary;

    public Publication(String _name, String _publisher, String _relaseDate, String _website, String _summary) {
        this._name = _name;
        this._publisher = _publisher;
        this._relaseDate = _relaseDate;
        this._website = _website;
        this._summary = _summary;
    }
    
    protected Publication(){
        
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public String getPublisher() {
        return _publisher;
    }

    public void setPublisher(String publisher) {
        this._publisher = publisher;
    }

    public String getRelaseDate() {
        return _relaseDate;
    }

    public void setRelaseDate(String relaseDate) {
        this._relaseDate = relaseDate;
    }

    public String getWebsite() {
        return _website;
    }

    public void setWebsite(String website) {
        this._website = website;
    }

    public String getSummary() {
        return _summary;
    }

    public void setSummary(String summary) {
        this._summary = summary;
    }
    
    
    
}

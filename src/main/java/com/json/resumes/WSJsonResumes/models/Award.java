package com.json.resumes.WSJsonResumes.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Awards")
public class Award {
    
    private String _title;
    private String _date;
    private String _awarder;
    private String _summary;

    public Award(String _title, String _date, String _awarder, String _summary) {
        this._title = _title;
        this._date = _date;
        this._awarder = _awarder;
        this._summary = _summary;
    }
    
    protected Award(){
        
    }
    
    public String getTitle() {
        return _title;
    }

    public void setTitle(String title) {
        this._title = title;
    }

    public String getDate() {
        return _date;
    }

    public void setDate(String date) {
        this._date = date;
    }

    public String getAwarder() {
        return _awarder;
    }

    public void setAwarder(String awarder) {
        this._awarder = awarder;
    }

    public String getSummary() {
        return _summary;
    }

    public void setSummary(String summary) {
        this._summary = summary;
    }
    
    
    
}

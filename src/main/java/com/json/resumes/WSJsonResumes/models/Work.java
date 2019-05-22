package com.json.resumes.WSJsonResumes.models;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Work")
public class Work {
    
    private String _company;
    private String _position;
    private String _website;
    private String _startDate;
    private String _endDate;
    private String _summary;
    private List<String> _highlights;
    
    protected Work(){
        this._highlights = new ArrayList();
    }

    public Work(String _company, String _position, String _website, String _startDate, String _endDate, String _summary, List<String> _highlights) {
        this._company = _company;
        this._position = _position;
        this._website = _website;
        this._startDate = _startDate;
        this._endDate = _endDate;
        this._summary = _summary;
        this._highlights = _highlights;
    }

    public String getCompany() {
        return _company;
    }

    public void setCompany(String company) {
        this._company = company;
    }

    public String getPosition() {
        return _position;
    }

    public void setPosition(String position) {
        this._position = position;
    }

    public String getWebsite() {
        return _website;
    }

    public void setWebsite(String website) {
        this._website = website;
    }

    public String getStartDate() {
        return _startDate;
    }

    public void setStartDate(String startDate) {
        this._startDate = startDate;
    }

    public String getEndDate() {
        return _endDate;
    }

    public void setEndDate(String endDate) {
        this._endDate = endDate;
    }

    public String getSummary() {
        return _summary;
    }

    public void setSummary(String summary) {
        this._summary = summary;
    }

    public List<String> getHighlights() {
        return _highlights;
    }

    public void setHighlights(List<String> highlights) {
        this._highlights = highlights;
    }
    
    
    
}

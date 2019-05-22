package com.json.resumes.WSJsonResumes.models;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Skills")
public class Skill {
    
    private String _name;
    private String _level;
    private List<String> _keywords;
    
    protected Skill(){
        this._keywords = new ArrayList();
    }

    public Skill(String _name, String _level, List<String> _keywords) {
        this._name = _name;
        this._level = _level;
        this._keywords = _keywords;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public String getLevel() {
        return _level;
    }

    public void setLevel(String level) {
        this._level = level;
    }

    public List<String> getKeywords() {
        return _keywords;
    }

    public void setKeywords(List<String> keywords) {
        this._keywords = keywords;
    }
    
    
    
}

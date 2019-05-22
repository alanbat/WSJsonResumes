package com.json.resumes.WSJsonResumes.models;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Documents")
public class Interest {
    
    private String _name;
    private List<String> _keywords;
    
    protected Interest(){
        this._keywords = new ArrayList();
    }

    public Interest(String _name, List<String> _keywords) {
        this._name = _name;
        this._keywords = _keywords;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public List<String> getKeywords() {
        return _keywords;
    }

    public void setKeyword(List<String> keywords) {
        this._keywords = keywords;
    }
    
    
    
}

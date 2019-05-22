package com.json.resumes.WSJsonResumes.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Profiles")
public class Profile {
    
    private String _network;
    private String _username;
    private String _url;

    public Profile(String _network, String _username, String _url) {
        this._network = _network;
        this._username = _username;
        this._url = _url;
    }
    
    protected Profile(){
        
    }

    public String getNetwork() {
        return _network;
    }

    public void setNetwork(String network) {
        this._network = network;
    }

    public String getUsername() {
        return _username;
    }

    public void setUsername(String username) {
        this._username = username;
    }

    public String getUrl() {
        return _url;
    }

    public void setUrl(String url) {
        this._url = url;
    }
    
}

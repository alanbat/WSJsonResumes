package com.json.resumes.WSJsonResumes.models;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.annotation.Id;

public class Basics {
    
    @Id
    private String _id;
    private String _name;
    private String _label;
    private String _picture;
    private String _email;
    private String _phone;
    private String _website;
    private String _summary;
    private Location _location;
    private List<Profile> _profiles;
    
    protected Basics(){
        this._profiles = new ArrayList();
        this._id = null;
        this._location = new Location();
    }

    public Basics(String _id, String _name, String _label, String _picture, String _email, String _phone, String _website, String _summary, Location _location, List<Profile> _profiles) {
        this._id = _id;
        this._name = _name;
        this._label = _label;
        this._picture = _picture;
        this._email = _email;
        this._phone = _phone;
        this._website = _website;
        this._summary = _summary;
        this._location = _location;
        this._profiles = _profiles;
    }
    
    public String getId() {
        return _id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public String getLabel() {
        return _label;
    }

    public void setLabel(String label) {
        this._label = label;
    }

    public String getPicture() {
        return _picture;
    }

    public void setPicture(String picture) {
        this._picture = picture;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String email) {
        this._email = email;
    }

    public String getPhone() {
        return _phone;
    }

    public void setPhone(String phone) {
        this._phone = phone;
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

    public Location getLocation() {
        return _location;
    }

    public void setLocation(Location location) {
        this._location = location;
    }

    public List<Profile> getProfiles() {
        return _profiles;
    }

    public void setProfiles(List<Profile> profiles) {
        this._profiles = profiles;
    }

    
}

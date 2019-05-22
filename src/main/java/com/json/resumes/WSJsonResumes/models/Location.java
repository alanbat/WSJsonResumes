package com.json.resumes.WSJsonResumes.models;

public class Location {
    
    private String _address;
    private String _postalCode;
    private String _city;
    private String _countryCode;
    private String _region;

    public Location(String _address, String _postalCode, String _city, String _countryCode, String _region) {
        this._address = _address;
        this._postalCode = _postalCode;
        this._city = _city;
        this._countryCode = _countryCode;
        this._region = _region;
    }

    Location() {
        
    }

    public String getAddress() {
        return _address;
    }

    public void setAddress(String address) {
        this._address = address;
    }

    public String getPostalCode() {
        return _postalCode;
    }

    public void setPostalCode(String postalCode) {
        this._postalCode = postalCode;
    }

    public String getCity() {
        return _city;
    }

    public void setCity(String city) {
        this._city = city;
    }

    public String getCountryCode() {
        return _countryCode;
    }

    public void setCountryCode(String countryCode) {
        this._countryCode = countryCode;
    }

    public String getRegion() {
        return _region;
    }

    public void setRegion(String region) {
        this._region = region;
    }
    
    
}

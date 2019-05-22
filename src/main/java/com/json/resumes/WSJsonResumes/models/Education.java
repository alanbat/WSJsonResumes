package com.json.resumes.WSJsonResumes.models;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Education")
public class Education {
    
    private String _institution;
    private String _area;
    private String _studyType;
    private String _startDate;
    private String _endDate;
    private String _gpa;
    private List<String> _courses;
    
    protected Education(){
        this._courses = new ArrayList();
    }

    public Education(String _institution, String _area, String _studyType, String _startDate, String _endDate, String _gpa, List<String> _courses) {
        this._institution = _institution;
        this._area = _area;
        this._studyType = _studyType;
        this._startDate = _startDate;
        this._endDate = _endDate;
        this._gpa = _gpa;
        this._courses = _courses;
    }

    public String getInstitution() {
        return _institution;
    }

    public void setInstitution(String institution) {
        this._institution = institution;
    }

    public String getArea() {
        return _area;
    }

    public void setArea(String area) {
        this._area = area;
    }

    public String getStudyType() {
        return _studyType;
    }

    public void setStudyType(String studyType) {
        this._studyType = studyType;
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

    public String getGpa() {
        return _gpa;
    }

    public void setGpa(String gpa) {
        this._gpa = gpa;
    }

    public List<String> getCourses() {
        return _courses;
    }

    public void setCourses(List<String> courses) {
        this._courses = courses;
    }
    
    
    
}

package com.json.resumes.WSJsonResumes.models;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Resumes")
public class Resume {
    
    private Basics _basics;
    private List<Work> _work;
    private List<Volunteer> _volunteer;
    private List<Education> _education;
    private List<Award> _awards;
    private List<Publication> _publications;
    private List<Skill> _skills;
    private List<Language> _languages;
    private List<Interest> _interests;
    private List<Reference> _reference;
    
    protected Resume(){
        this._awards = new ArrayList();
        this._basics = new Basics();
        this._education = new ArrayList();
        this._interests = new ArrayList();
        this._languages = new ArrayList();
        this._publications = new ArrayList();
        this._reference = new ArrayList();
        this._skills = new ArrayList();
        this._volunteer = new ArrayList();
        this._work = new ArrayList();
    }

    public Resume(Basics _basics, List<Work> _work, List<Volunteer> _volunteer, List<Education> _education, List<Award> _awards, List<Publication> _publications, List<Skill> _skills, List<Language> _languages, List<Interest> _interests, List<Reference> _reference) {
        this._basics = _basics;
        this._work = _work;
        this._volunteer = _volunteer;
        this._education = _education;
        this._awards = _awards;
        this._publications = _publications;
        this._skills = _skills;
        this._languages = _languages;
        this._interests = _interests;
        this._reference = _reference;
    }

    public Basics getBasics() {
        return _basics;
    }

    public void setBasics(Basics basics) {
        this._basics = basics;
    }

    public List<Work> getWork() {
        return _work;
    }

    public void setWork(List<Work> work) {
        this._work = work;
    }

    public List<Volunteer> getVolunteer() {
        return _volunteer;
    }

    public void setVolunteer(List<Volunteer> volunteer) {
        this._volunteer = volunteer;
    }

    public List<Education> getEducation() {
        return _education;
    }

    public void setEducation(List<Education> education) {
        this._education = education;
    }

    public List<Award> getAwards() {
        return _awards;
    }

    public void setAwards(List<Award> awards) {
        this._awards = awards;
    }

    public List<Publication> getPublications() {
        return _publications;
    }

    public void setPublications(List<Publication> publications) {
        this._publications = publications;
    }

    public List<Skill> getSkills() {
        return _skills;
    }

    public void setSkills(List<Skill> skills) {
        this._skills = skills;
    }

    public List<Language> getLanguages() {
        return _languages;
    }

    public void setLanguages(List<Language> languages) {
        this._languages = languages;
    }

    public List<Interest> getInterests() {
        return _interests;
    }

    public void setInterests(List<Interest> interests) {
        this._interests = interests;
    }

    public List<Reference> getReference() {
        return _reference;
    }

    public void setReference(List<Reference> reference) {
        this._reference = reference;
    }
    
    
            
            
}

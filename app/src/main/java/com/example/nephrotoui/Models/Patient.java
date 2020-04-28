package com.example.nephrotoui.Models;

public class Patient {

    private String patient_id;
    private String content;
    private String timestamp;
    private String donor_name;
    private String kidney_length;
    private String kidney_width;
    private String num_of_arteries;
    private String dist_of_arteries;
    private String bool_abnormalities;
    private String bool_surg_damage;

    public Patient(String patient_id, String content, String timestamp,
                   String donor_name, String kidney_length, String kidney_width,
                   String num_of_arteries, String dist_of_arteries,
                   String bool_abnormalities, String bool_surg_damage) {
        this.patient_id = patient_id;
        this.content = content;
        this.timestamp = timestamp;
        this.donor_name = donor_name;
        this.kidney_length = kidney_length;
        this.kidney_width = kidney_width;
        this.num_of_arteries = num_of_arteries;
        this.dist_of_arteries = dist_of_arteries;
        this.bool_abnormalities = bool_abnormalities;
        this.bool_surg_damage = bool_surg_damage;
    }

    public Patient(){
    }

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getDonor_name(){
        return donor_name;
    }

    public void setDonor_name(String donor_name){
        this.donor_name = donor_name;
    }

    public String getKidney_length(){
        return kidney_length;
    }

    public void setKidney_length(String kidney_length){
        this.kidney_length = kidney_length;
    }

    public String getKidney_width(){
        return kidney_width;
    }

    public void setKidney_width(String kidney_width){
        this.kidney_width = kidney_width;
    }

    public String getNum_of_arteries(){
        return num_of_arteries;
    }

    public void setNum_of_arteries(String num_of_arteries){
        this.num_of_arteries = num_of_arteries;
    }

    public String getDist_of_arteries() {
        return dist_of_arteries;
    }

    public void setDist_of_arteries(String dist_of_arteries) {
        this.dist_of_arteries = dist_of_arteries;
    }

    public String getBool_abnormalities() {
        return bool_abnormalities;
    }

    public void setBool_abnormalities(String bool_abnormalities) {
        this.bool_abnormalities = bool_abnormalities;
    }

    public String getBool_surg_damage() {
        return bool_surg_damage;
    }

    public void setBool_surg_damage(String bool_surg_damage) {
        this.bool_surg_damage = bool_surg_damage;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patient_id='" + patient_id + '\'' +
                ", content='" + content + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}

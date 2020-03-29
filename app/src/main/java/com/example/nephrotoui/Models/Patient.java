package com.example.nephrotoui.Models;

public class Patient {

    private String patient_id;
    private String content;
    private String timestamp;

    public Patient(String patient_id, String content, String timestamp) {
        this.patient_id = patient_id;
        this.content = content;
        this.timestamp = timestamp;
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

    @Override
    public String toString() {
        return "Patient{" +
                "patient_id='" + patient_id + '\'' +
                ", content='" + content + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}

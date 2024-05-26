package com.parv.jobportal.job;


public class Job {
    private long id;
    private String title;
    private String description;
    private Integer minPay;
    private Integer maxPay;
    private Integer noOfPositions;
    private String location;

    public Job(long id, String title, String description, Integer minPay, Integer maxPay, Integer noOfPositions, String location) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.minPay = minPay;
        this.maxPay = maxPay;
        this.noOfPositions = noOfPositions;
        this.location = location;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getMinPay() {
        return minPay;
    }

    public void setMinPay(Integer minPay) {
        this.minPay = minPay;
    }

    public Integer getMaxPay() {
        return maxPay;
    }

    public void setMaxPay(Integer maxPay) {
        this.maxPay = maxPay;
    }

    public Integer getNoOfPositions() {
        return noOfPositions;
    }

    public void setNoOfPositions(Integer noOfPositions) {
        this.noOfPositions = noOfPositions;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

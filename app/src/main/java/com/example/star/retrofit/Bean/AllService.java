package com.example.star.retrofit.Bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AllService {

    @SerializedName("result")
    @Expose
    private Boolean result;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private List<ServiceImages> serviceImages = null;

    public AllService(Boolean result, String message, List<ServiceImages> serviceImages) {
        this.result = result;
        this.message = message;
        this.serviceImages = serviceImages;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ServiceImages> getServiceImages() {
        return serviceImages;
    }

    public void setServiceImages(List<ServiceImages> serviceImages) {
        this.serviceImages = serviceImages;
    }
}

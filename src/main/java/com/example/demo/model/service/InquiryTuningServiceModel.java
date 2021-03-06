package com.example.demo.model.service;

import com.example.demo.model.entity.enums.MakeNameEnum;
import com.example.demo.model.entity.enums.InquiryTypeNameEnum;
import com.example.demo.model.entity.enums.VehicleTypeNameEnum;

public class InquiryTuningServiceModel {
    private String email;
    private String phoneNumber;
    private InquiryTypeNameEnum inquiry;
    private VehicleTypeNameEnum vehicle;
    private MakeNameEnum make;
    private String model;
    private String description;

    public InquiryTuningServiceModel() {
    }

    public String getEmail() {
        return email;
    }

    public InquiryTuningServiceModel setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public InquiryTuningServiceModel setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public InquiryTypeNameEnum getInquiry() {
        return inquiry;
    }

    public InquiryTuningServiceModel setInquiry(InquiryTypeNameEnum inquiry) {
        this.inquiry = inquiry;
        return this;
    }

    public VehicleTypeNameEnum getVehicle() {
        return vehicle;
    }

    public InquiryTuningServiceModel setVehicle(VehicleTypeNameEnum vehicle) {
        this.vehicle = vehicle;
        return this;
    }

    public MakeNameEnum getMake() {
        return make;
    }

    public InquiryTuningServiceModel setMake(MakeNameEnum make) {
        this.make = make;
        return this;
    }

    public String getModel() {
        return model;
    }

    public InquiryTuningServiceModel setModel(String model) {
        this.model = model;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public InquiryTuningServiceModel setDescription(String description) {
        this.description = description;
        return this;
    }
}

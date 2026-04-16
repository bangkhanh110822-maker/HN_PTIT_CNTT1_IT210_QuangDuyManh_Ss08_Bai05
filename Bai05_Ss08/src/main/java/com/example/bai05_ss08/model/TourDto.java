package com.example.bai05_ss08.model;

import com.example.bai05_ss08.validation.ValidDateRange;
import com.example.bai05_ss08.validation.ValidPriceRange;
import com.example.bai05_ss08.validation.ValidTourCode;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

@ValidPriceRange
@ValidDateRange
public class TourDto {

    @NotNull(message = "Ma tour khong duoc de trong")
    @ValidTourCode
    private String tourCode;

    @NotNull(message = "Gia nguoi lon khong duoc de trong")
    @DecimalMin(value = "0.0", inclusive = false, message = "Gia nguoi lon phai lon hon 0")
    private BigDecimal adultPrice;

    @NotNull(message = "Gia tre em khong duoc de trong")
    @DecimalMin(value = "0.0", inclusive = false, message = "Gia tre em phai lon hon 0")
    private BigDecimal childPrice;

    @NotNull(message = "Ngay khoi hanh khong duoc de trong")
    @FutureOrPresent(message = "Ngay khoi hanh phai tu hom nay tro di")
    private LocalDate startDate;

    @NotNull(message = "Ngay ket thuc khong duoc de trong")
    private LocalDate endDate;

    public String getTourCode() {
        return tourCode;
    }

    public void setTourCode(String tourCode) {
        this.tourCode = tourCode;
    }

    public BigDecimal getAdultPrice() {
        return adultPrice;
    }

    public void setAdultPrice(BigDecimal adultPrice) {
        this.adultPrice = adultPrice;
    }

    public BigDecimal getChildPrice() {
        return childPrice;
    }

    public void setChildPrice(BigDecimal childPrice) {
        this.childPrice = childPrice;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}


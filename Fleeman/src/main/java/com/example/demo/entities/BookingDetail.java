package com.example.demo.entities;

import com.example.demo.entities.Booking;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="BookingDetail")
public class BookingDetail {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long booking_dtal_id;
	
	@ManyToOne
	@JoinColumn(name="booking_id", referencedColumnName="id", foreignKey=@ForeignKey(name="fk_booking_id"))
	private Booking booking;
	 @Column(name = "addon_id")
	    private Long addonId;

	    @Column(name = "addon_rate")
	    private Double addonRate;

	    // Getters and Setters

	    public Long getId() {
	        return booking_dtal_id;
	    }

	    public void setId(Long id) {
	        this.booking_dtal_id = id;
	    }

	    public Booking getBooking() {
	        return booking;
	    }

	    public void setBooking(Booking booking) {
	        this.booking = booking;
	    }

	    public Long getAddonId() {
	        return addonId;
	    }

	    public void setAddonId(Long addonId) {
	        this.addonId = addonId;
	    }

	    public Double getAddonRate() {
	        return addonRate;
	    }

	    public void setAddonRate(Double addonRate) {
	        this.addonRate = addonRate;
	    }
	}
	
	
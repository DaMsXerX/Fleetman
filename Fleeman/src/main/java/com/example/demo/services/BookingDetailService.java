package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.BookingDetail;

public interface BookingDetailService {
	List<BookingDetail> getAllBookingDetails();
	BookingDetail saveBookingDetail(BookingDetail bookingDetail);
	BookingDetail getBookingDetailById(Long id);
	void deleteBookingDetail(Long id);

}

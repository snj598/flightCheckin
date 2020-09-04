package com.snj.flightcheckin.integration;

import com.snj.flightcheckin.integration.dto.Reservation;
import com.snj.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {

	public Reservation findReservation(Long id);

	public Reservation updateReservation(ReservationUpdateRequest request);

}

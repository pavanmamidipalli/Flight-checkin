package com.suresh.flightcheckin.integration;

import com.suresh.flightcheckin.integration.dto.Reservation;
import com.suresh.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {

	public Reservation findReservation(Long id);

	public Reservation updateReservation(ReservationUpdateRequest request);

}

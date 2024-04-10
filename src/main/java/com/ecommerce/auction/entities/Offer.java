package com.ecommerce.auction.entities;

import java.sql.Time;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Offer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idoffer;
	private Date datedeclôture;
	private Time heuredefermeture;
	private boolean Status;
	private Date Datedevente;
	private Date date_enchère;

}

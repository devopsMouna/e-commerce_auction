package com.ecommerce.auction.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
@SuperBuilder
public class AbstractEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	 	@CreatedDate
	    @Column(name = "created_at", updatable = false, nullable = false)
	    private LocalDateTime createdAt;

	    @LastModifiedDate
	    @Column(name = "last_modified_date")
	    private LocalDateTime lastModifiedDate;

	    @PrePersist
	    protected void onCreate() {
	        createdAt = LocalDateTime.now();
	        lastModifiedDate = createdAt;
	    }

	    @PreUpdate
	    protected void onUpdate() {
	        lastModifiedDate = LocalDateTime.now();
	    }

}

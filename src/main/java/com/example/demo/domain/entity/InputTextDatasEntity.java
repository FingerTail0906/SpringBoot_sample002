package com.example.demo.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "input_text_datas")
public class InputTextDatasEntity {
	
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "text_data")
	private String textData;

}

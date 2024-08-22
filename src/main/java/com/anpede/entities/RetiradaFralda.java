package com.anpede.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "tb_RetiradaFralda")
public class RetiradaFralda implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	
	private Long id;
	private Integer quantidade;
	private LocalDate dataretirada;
	public RetiradaFralda() {
		//VOID
	}
	public RetiradaFralda(Long id,Integer quantidade,LocalDate dataretirada) {
		super();
		this.id = id;
		this.quantidade = quantidade;
		this.dataretirada = dataretirada;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public LocalDate getDataretirada() {
		return dataretirada;
	}
	public void setDataRetirada(LocalDate dataRetirada) {
		this.dataretirada = dataRetirada;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dataretirada, id, quantidade);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RetiradaFralda other = (RetiradaFralda) obj;
		return Objects.equals(dataretirada, other.dataretirada) && Objects.equals(id, other.id)
				&& Objects.equals(quantidade, other.quantidade);
	}
	

}

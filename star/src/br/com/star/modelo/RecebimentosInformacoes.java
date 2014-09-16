package br.com.star.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


import javax.persistence.Table;

import com.sun.istack.internal.NotNull;

@Entity
@Table(name="RECEBIMENTOSINFORMACOES")
public class RecebimentosInformacoes {
	
	@Id
	@GeneratedValue
	private int numeroVenda;
	
	@OneToMany(mappedBy="recebimentosInformacoes", cascade=CascadeType.ALL) 
	private List<Recebimentos> Recebimentos; 
	
	
	
	
	private int NumeroCheque;
	private String garantia;
	
	private int numeroDeParcelas;
	
	private int Sucata;
	private int Quantidade;
	@NotNull
	private String Modelo;
	private int numeroSerie;
	
	
	public int getNumeroVenda() {
		return numeroVenda;
	}
	public void setNumeroVenda(int numeroVenda) {
		this.numeroVenda = numeroVenda;
	}
	public List<Recebimentos> getRecebimentos() {
		return Recebimentos;
	}
	public void setRecebimentos(List<Recebimentos> recebimentos) {
		Recebimentos = recebimentos;
	}
	public int getNumeroCheque() {
		return NumeroCheque;
	}
	public void setNumeroCheque(int numeroCheque) {
		NumeroCheque = numeroCheque;
	}
	public String getGarantia() {
		return garantia;
	}
	public void setGarantia(String garantia) {
		this.garantia = garantia;
	}
	public int getNumeroDeParcelas() {
		return numeroDeParcelas;
	}
	public void setNumeroDeParcelas(int numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}
	public int getSucata() {
		return Sucata;
	}
	public void setSucata(int sucata) {
		Sucata = sucata;
	}
	public int getQuantidade() {
		return Quantidade;
	}
	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public int getNumeroSerie() {
		return numeroSerie;
	}
	public void setNumeroSerie(int numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	
	
}

package br.com.star.modelo;	
		

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.internal.NotNull;

@Entity
@Table(name="RECEBIMENTOS")
public class Recebimentos {
	
	@Id
	@GeneratedValue
	private int id;
	
	@ManyToOne(cascade=CascadeType.ALL) 
	@JoinColumn(name="numeroVenda") 
	private RecebimentosInformacoes recebimentosInformacoes; 
	
	private int idCliente;
								
	private long valor;
	private long banco;
	private long desconto;
	
	
	
	private int numeroCheque;
	
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	@NotNull
	private Calendar data;

	@DateTimeFormat(pattern="dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	@NotNull
	private Calendar dataVencimento;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Calendar dataRecebimento;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public RecebimentosInformacoes getRecebimentosInformacoes() {
		return recebimentosInformacoes;
	}

	public void setRecebimentosInformacoes(
			RecebimentosInformacoes recebimentosInformacoes) {
		this.recebimentosInformacoes = recebimentosInformacoes;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public long getValor() {
		return valor;
	}

	public void setValor(long valor) {
		this.valor = valor;
	}

	public long getBanco() {
		return banco;
	}

	public void setBanco(long banco) {
		this.banco = banco;
	}

	public long getDesconto() {
		return desconto;
	}

	public void setDesconto(long desconto) {
		this.desconto = desconto;
	}

	public int getNumeroCheque() {
		return numeroCheque;
	}

	public void setNumeroCheque(int numeroCheque) {
		this.numeroCheque = numeroCheque;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public Calendar getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Calendar dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Calendar getDataRecebimento() {
		return dataRecebimento;
	}

	public void setDataRecebimento(Calendar dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}


	
	

	
	
	
	
	
	
	

}

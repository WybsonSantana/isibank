package br.com.isidrocorp.isibank.model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_conta")
public class Conta {
	@Id
	@Column(name = "numero")
	private int numeroConta;

	@Column(name = "dv")
	private int digitoVerificador;

	@Column(name = "agencia")
	private int agencia;

	@Column(name = "data_abertura")
	private LocalDate dataAbertura;

	@Column(name = "saldo")
	private double saldoConta;

	@Column(name = "tipo")
	private int tipoConta;

	@ManyToOne
	@JoinColumn(name = "cod_cliente")
	private Cliente titularConta;

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getDigitoVerificador() {
		return digitoVerificador;
	}

	public void setDigitoVerificador(int digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public LocalDate getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(LocalDate dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}

	public int getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(int tipoConta) {
		this.tipoConta = tipoConta;
	}

	public Cliente getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(Cliente titularConta) {
		this.titularConta = titularConta;
	}
}
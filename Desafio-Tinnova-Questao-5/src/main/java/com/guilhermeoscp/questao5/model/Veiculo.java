package com.guilhermeoscp.questao5.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Veiculo {
	
	private int id;
	private String veiculo;
	private String marca;
	private int ano;
	private String descricao;
	private boolean vendido;
	private String created;
	private String updated;
	public static List<Veiculo> veiculoList;
		
	static {
		veiculoRepository();
	}
	
	public Veiculo(int id, String veiculo, String marca, int ano, String descricao, boolean vendido, String created,
			String updated) {
		this.id = id;
		this.veiculo = veiculo;
		this.marca = marca;
		this.ano = ano;
		this.descricao = descricao;
		this.vendido = vendido;
		this.created = created;
		this.updated = updated;
	}

	public Veiculo() {
	}
	
	private static void veiculoRepository() {
		veiculoList = new ArrayList<>(Arrays.asList(
				new Veiculo(1, "Kadett", "Chevrolet", 1998, "O primeiro carro produzido em série a utilizar vidros colados", true, "13/01/2022","13/01/2022"),
				new Veiculo(2, "Gol", "Volkswagen", 1997, "Considerado um dos maiores sucessos da Volkswagen do Brasil de todos os tempos", true, "13/01/2022","13/01/2022"),
				new Veiculo(3, "Uno", "Ford", 1998, "Automóvel compacto fabricado pela Fiat, lançado na Europa em 1983", true, "13/01/2022","13/01/2022"),
				new Veiculo(4, "Lancer", "Mitsubishi", 2020, "Lancer é um modelo compacto da Mitsubishi Motors.", false, "13/01/2022","13/01/2022"),
				new Veiculo(5, "Renegade", "Jeep", 2018, "O Renegade é um SUV compacto, produzido pela Jeep, bandeira da FCA, lançado em 2014.", false, "13/01/2022","13/01/2022")
				));
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isVendido() {
		return vendido;
	}

	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		if (id != other.id)
			return false;
		return true;
	}
}

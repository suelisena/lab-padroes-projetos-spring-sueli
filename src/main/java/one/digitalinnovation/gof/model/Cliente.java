
package one.digitalinnovation.gof.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import one.digitalinnovation.gof.model.Endereco;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private Byte idade;
	private String email;
	private Long telefone;
	@ManyToOne
	private Endereco endereco;
	
	
	
	
	
	public Cliente() {
		super();
		
	}
	
	public Cliente(String nome, Long telefone, Byte idade, String email, Long id, Endereco endereco) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.idade = idade;
		this.email = email;
		this.id = id;
		this.endereco = endereco;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Byte getIdade() {
		return idade;
	}
	public void setIdade(Byte idade) {
		this.idade = idade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getTelefone() {
		return telefone;
	}
	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	

}

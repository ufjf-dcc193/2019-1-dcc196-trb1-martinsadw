package br.ufjf.dcc193.t1.ong;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Atividade {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String titulo;
    private String descricao;
    private Date dataInicio;
    private Date dataFim;
    private Float horasAssistencial;
    private Float horasJuridica;
    private Float horasFinanceira;
    private Float horasExecutiva;

    @ManyToOne
    @JoinColumn
    private Sede sede;

    public Atividade() {

    }
    public Atividade(String titulo, String descricao, Date dataInicio, Date dataFim, Float horasAssistencial, Float horasJuridica, Float horasFinanceira, Float horasExecutiva) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.horasAssistencial = horasAssistencial;
        this.horasJuridica = horasJuridica;
        this.horasFinanceira = horasFinanceira;
        this.horasExecutiva = horasExecutiva;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }
    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Float getHorasAssistencial() {
        return horasAssistencial;
    }
    public void setHorasAssistencial(Float horasAssistencial) {
        this.horasAssistencial = horasAssistencial;
    }

    public Float getHorasJuridica() {
        return horasJuridica;
    }
    public void setHorasJuridica(Float horasJuridica) {
        this.horasJuridica = horasJuridica;
    }

    public Float getHorasFinanceira() {
        return horasFinanceira;
    }
    public void setHorasFinanceira(Float horasFinanceira) {
        this.horasFinanceira = horasFinanceira;
    }

    public Float getHorasExecutiva() {
        return horasExecutiva;
    }
    public void setHorasExecutiva(Float horasExecutiva) {
        this.horasExecutiva = horasExecutiva;
    }

    public Sede getSede() {
        return sede;
    }
    public void setSede(Sede sede) {
        this.sede = sede;
    }
}
package br.com.exercise.groupFive.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Objects;

public class ProfessorDTO {

    private final String nome;
    private final LocalDate dataNascimento;
    private final LocalTime cargaHoraria;
    private final Double valorHora;
    private final boolean estrangeiro;
    private final Integer horasDisponiveis;
    private final String biografia;
    private final LocalDateTime dataHoraCadastro;

    public ProfessorDTO(Builder builder) {
        nome = builder.nome;
        dataNascimento = builder.dataNascimento;
        cargaHoraria = builder.cargaHoraria;
        valorHora = builder.valorHora;
        estrangeiro = builder.estrangeiro;
        horasDisponiveis = builder.horasDisponiveis;
        biografia = builder.biografia;
        dataHoraCadastro = builder.dataHoraCadastro;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public LocalTime getCargaHoraria() {
        return cargaHoraria;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public boolean isEstrangeiro() {
        return estrangeiro;
    }

    public Integer getHorasDisponiveis() {
        return horasDisponiveis;
    }

    public String getBiografia() {
        return biografia;
    }

    public LocalDateTime getDataHoraCadastro() {
        return dataHoraCadastro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProfessorDTO professorDTO = (ProfessorDTO) o;
        return estrangeiro == professorDTO.estrangeiro && Objects.equals(nome, professorDTO.nome) && Objects.equals(dataNascimento, professorDTO.dataNascimento) && Objects.equals(cargaHoraria, professorDTO.cargaHoraria) && Objects.equals(valorHora, professorDTO.valorHora) && Objects.equals(horasDisponiveis, professorDTO.horasDisponiveis) && Objects.equals(biografia, professorDTO.biografia) && Objects.equals(dataHoraCadastro, professorDTO.dataHoraCadastro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, dataNascimento, cargaHoraria, valorHora, estrangeiro, horasDisponiveis, biografia, dataHoraCadastro);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder {
        private String nome;
        private LocalDate dataNascimento;
        private LocalTime cargaHoraria;
        private Double valorHora;
        private boolean estrangeiro;
        private Integer horasDisponiveis;
        private String biografia;
        private LocalDateTime dataHoraCadastro;

        private Builder() {}

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder dataNascimento(LocalDate dataNascimento) {
            this.dataNascimento = dataNascimento;
            return this;
        }

        public Builder cargaHoraria(LocalTime cargaHoraria) {
            this.cargaHoraria = cargaHoraria;
            return this;
        }

        public Builder valorHora(Double valorHora) {
            this.valorHora = valorHora;
            return this;
        }

        public Builder estrangeiro(boolean estrangeiro) {
            this.estrangeiro = estrangeiro;
            return this;
        }

        public Builder horasDisponiveis(Integer horasDisponiveis) {
            this.horasDisponiveis = horasDisponiveis;
            return this;
        }

        public Builder biografia(String biografia) {
            this.biografia = biografia;
            return this;
        }

        public Builder dataHoraCadastro(LocalDateTime dataHoraCadastro) {
            this.dataHoraCadastro = dataHoraCadastro;
            return this;
        }

        public ProfessorDTO build() {
            return new ProfessorDTO(this);
        }
    }

    @Override
    public String toString() {
        return "Professor{" +
                ", nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", cargaHoraria=" + cargaHoraria +
                ", valorHora=" + valorHora +
                ", estrangeiro=" + estrangeiro +
                ", horasDisponiveis=" + horasDisponiveis +
                ", biografia='" + biografia + '\'' +
                ", dataHoraCadastro=" + dataHoraCadastro +
                '}';
    }
}

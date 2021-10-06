package com.example.controleemprestimos2;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(foreignKeys = @ForeignKey(entity = Equipamento.class,
                                parentColumns = "idEquipamento",
                                childColumns = "idEquipamento"))
public class Emprestimo {
    @PrimaryKey(autoGenerate = true)
    private int idEmprestimo;

    private int idEquipamento;

    @ColumnInfo(name = "nome_pessoa")
    private String nomePessoa;

    @ColumnInfo(name = "telefone")
    private String telefone;

    @ColumnInfo(name = "data")
    private String data;

    @ColumnInfo(name = "devolvido")
    private boolean devolvido;

    public Emprestimo(int idEquipamento, String nomePessoa, String telefone, String data, boolean devolvido) {
        this.idEquipamento = idEquipamento;
        this.nomePessoa = nomePessoa;
        this.telefone = telefone;
        this.data = data;
        this.devolvido = devolvido;
    }

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public int getIdEquipamento() {
        return idEquipamento;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    @Override
    public String toString() {
        return getIdEmprestimo() + ": " + getNomePessoa() + " - ";
    }
}
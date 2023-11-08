package turismo.models.Adm;

import java.time.LocalDate;

import turismo.models.Pessoas.Cliente;
import turismo.models.Pessoas.Funcionario;

public class Reserva<Reservavel> {
    private Reservavel reserva;
    private Cliente cliente;
    private LocalDate dataReserva;
    private Funcionario funcionario;
    
    //Construtor
    public Reserva(Reservavel reserva, Cliente cliente, LocalDate dataReserva, Funcionario funcionario) {
        this.reserva = reserva;
        this.cliente = cliente;
        this.dataReserva = dataReserva;
        this.funcionario = funcionario;
    }
    //Getters e Setters
    public Reservavel getReserva() {
        return reserva;
    }

    public void setReserva(Reservavel reserva) {
        this.reserva = reserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(LocalDate dataReserva) {
        this.dataReserva = dataReserva;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    
}

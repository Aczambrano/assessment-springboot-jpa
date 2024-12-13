package co.com.sofka.cuentabancaria.dto.cuenta;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CuentaRequestDTO {

    @NotNull
    @Size(min = 10, max = 10, message = "El número de cuenta debe tener 10 caracteres")
    private String numeroCuenta;

    @NotNull
    @PositiveOrZero(message = "El saldo inicial debe ser mayor o igual a cero")
    private double saldoInicial;

    @NotNull
    @NotBlank(message = "El titular no debe estar vacío")
    private String titular;
}
package ar.edu.unlam.basica2;

public class CuentaSueldo {
	private Double saldo;

	public CuentaSueldo() {
		this.saldo = 0.0;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void depositar(Double montoADepositar){
		saldo+=montoADepositar;
	}
	public void extraer(Double montoARetirar){
		if(montoARetirar<=getSaldo()){
		setSaldo(getSaldo()-montoARetirar);
		return;
		}
		else{
			return;
			}
	}
}

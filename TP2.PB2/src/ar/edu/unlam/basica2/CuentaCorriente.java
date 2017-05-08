package ar.edu.unlam.basica2;

public class CuentaCorriente extends CuentaSueldo {

	private Double descubierto;

	public CuentaCorriente(Double descubierto) {
		super();
		this.descubierto = descubierto;
	}
	
	public Double getDescubierto() {
		return descubierto;
	}

	public void setDescubierto(Double descubierto) {
		this.descubierto = descubierto;
	}

	@Override
	public void extraer(Double montoARetirar){
		if ((montoARetirar<=getSaldo()+getDescubierto())){
			setSaldo(getSaldo()-montoARetirar);
			if(getSaldo()<0){
				setSaldo(getSaldo()*1.05);
			}
		}
		return;
	}
	
	
}

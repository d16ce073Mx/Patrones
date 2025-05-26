package com.alejandro.patronesdediseno.prototype;

public class CuentaAhorroImpl implements ICuenta {
	
	private String tipo;
	private float monto;
	
	public ICuenta clonar() {
		CuentaAhorroImpl cuentaAhorroImpl = null;
		try {
			cuentaAhorroImpl = (CuentaAhorroImpl) clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cuentaAhorroImpl;
	}
	
	public String getTipo() {
		return tipo;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

	public CuentaAhorroImpl() {
		this.tipo = "AHORRO";
	}
	
	@Override
	public String toString() {
		return "CuentaAhorroImpl [tipo=" + tipo + ", monto=" + monto + "]";
	}

}

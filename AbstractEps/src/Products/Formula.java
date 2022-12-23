package Products;

public class Formula {
	
	private boolean Acetaminofen=false;
	private boolean Penisilina=false;
	private boolean Naproxeno=false;
	private boolean Ibuprofeno=false;
	
	
	public String toString() {
		
		String resultado="";
		
		if(Acetaminofen)
		resultado+="    Acetaminofen\n";
		
		if(Penisilina)
			resultado+="    Penisilina\n";
		
		if(Naproxeno)
			resultado+="    Naproxeno\n";
		
		if(Ibuprofeno)
			resultado+="    Ibuprofeno\n";
		
		return resultado;
	}

    public boolean isAcetaminofen() {
        return Acetaminofen;
    }

    public void setAcetaminofen(boolean Acetaminofen) {
        this.Acetaminofen = Acetaminofen;
    }

    public boolean isPenisilina() {
        return Penisilina;
    }

    public void setPenisilina(boolean Penisilina) {
        this.Penisilina = Penisilina;
    }

    public boolean isNaproxeno() {
        return Naproxeno;
    }

    public void setNaproxeno(boolean Naproxeno) {
        this.Naproxeno = Naproxeno;
    }

    public boolean isIbuprofeno() {
        return Ibuprofeno;
    }

    public void setIbuprofeno(boolean Ibuprofeno) {
        this.Ibuprofeno = Ibuprofeno;
    }
	

	
}

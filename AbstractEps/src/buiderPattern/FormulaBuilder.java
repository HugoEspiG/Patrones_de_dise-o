package buiderPattern;

import Products.Formula;


public class FormulaBuilder implements IBuilder{

	private Formula formula;
	
	public void reset() {
            formula=new Formula();
	}

    @Override
    public void putAcetaminofen() {
        formula.setAcetaminofen(true);
    }

    @Override
    public void putPenisilina() {
        formula.setPenisilina(true);
    }

    @Override
    public void putNaproxeno() {
        formula.setNaproxeno(true);
    }

    @Override
    public void putIbuprofeno() {
        formula.setIbuprofeno(true);
    }

    public Formula getFormula() {
        return formula;
    }

    public void setFormula(Formula formula) {
        this.formula = formula;
    }
	

}

package org.example.planosContratos;

public abstract class PlanoDecorator implements IPlano {

    private IPlano plano;
    public String estrutura;

    public PlanoDecorator(IPlano plano) {
        this.plano = plano;
    }

    public IPlano getPlano() {
        return plano;
    }

    public void setPlano(IPlano plano) {
        this.plano = plano;
    }

    public abstract float getValorAdicional();

    public float getValorPlano() {
        return this.plano.getValorPlano() + this.getValorAdicional();
    }

    public abstract String getNomeEstrutura();

    public String getEstrutura() {
        return this.plano.getEstrutura() + "/" + this.getNomeEstrutura();
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }
}
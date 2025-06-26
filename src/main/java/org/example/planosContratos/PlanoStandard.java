package org.example.planosContratos;

public class PlanoStandard implements IPlano {
    private float valorPlano;

    public PlanoStandard() {
        this.valorPlano = 75.0f;
    }

    public PlanoStandard(float valorPlano) {
        this.valorPlano = valorPlano;
    }

    @Override
    public float getValorPlano() {
        return valorPlano;
    }

    @Override
    public String getEstrutura() {
        return "Plano Standard";
    }
}
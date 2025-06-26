package org.example.planosContratos;

public class PlanoPremium implements IPlano {
    private float valorPlano;

    public PlanoPremium() {
        this.valorPlano = 100.0f;
    }

    public PlanoPremium(float valorPlano) {
        this.valorPlano = valorPlano;
    }

    @Override
    public float getValorPlano() {
        return valorPlano;
    }

    @Override
    public String getEstrutura() {
        return "Plano Premium";
    }
}
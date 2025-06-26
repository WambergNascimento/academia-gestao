package org.example.planosContratos;

public class PlanoBasic implements IPlano {
    private float valorPlano;

    public PlanoBasic() {
        this.valorPlano = 50.0f;
    }

    public PlanoBasic(float valorPlano) {
        this.valorPlano = valorPlano;
    }

    @Override
    public float getValorPlano() {
        return valorPlano;
    }

    @Override
    public String getEstrutura() {
        return "Plano Basic";
    }
}

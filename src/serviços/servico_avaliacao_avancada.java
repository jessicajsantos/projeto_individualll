package serviços;

public class servico_avaliacao_avancada extends servico_avaliacao {
    private String nivelCondicionamento; // Atributo adicional

    // Construtor vazio
    public servico_avaliacao_avancada() {
        super(); // Chama o construtor da classe mãe
    }

    // Construtor com parâmetros
    public servico_avaliacao_avancada(String medicao_corporal, String peso, String altura, String percentual_gordura,
                                    String flexibilidade, String postura, String mobilidade, String equilibrio,
                                    String av_cardiovascular, String hist_saude, String habitos_alimentares,
                                    String agilidade, String nivelCondicionamento) {
        super(medicao_corporal, peso, altura, percentual_gordura, flexibilidade, postura, mobilidade, equilibrio,
                av_cardiovascular, hist_saude, habitos_alimentares, agilidade);
        this.nivelCondicionamento = nivelCondicionamento;
    }

    public servico_avaliacao_avancada(String medicao_corporal, String peso, String altura, String percentual_gordura, String flexibilidade, String postura, String mobilidade, String equilibrio, String av_cardiovascular, String hist_saude, String habitos_alimentares, String agilidade) {
        super(medicao_corporal, peso, altura, percentual_gordura, flexibilidade, postura, mobilidade, equilibrio, av_cardiovascular, hist_saude, habitos_alimentares, agilidade);
    }

    public String getNivelCondicionamento() {
        return nivelCondicionamento;
    }

    public void setNivelCondicionamento(String nivelCondicionamento) {
        this.nivelCondicionamento = nivelCondicionamento;
    }
}

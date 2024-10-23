package serviços;

public class servico_avaliacao {
    private final String medicaoCorporal;

    // atributos para serviços de avaliação fisíca

    String medicao_corporal;
    String peso;
    String altura;
    String percentual_gordura;
    String flexibilidade;
    String postura;
    String mobilidade;
    String equilibrio;
    String av_cardiovascular;
    String hist_saude;
    String habitos_alimentares;
    String agilidade;
    // Construtor vazio
    public servico_avaliacao() {
        this.medicaoCorporal = null;
    }

    // Construtor com parâmetros
    public servico_avaliacao (String medicao_corporal, String altura, String peso, String percentual_gordura, String flexibilidade,
                              String postura, String mobilidade, String equilibrio, String av_cardiovascular,
                              String hist_saude, String habitos_alimentares, String agilidade) {
        this.medicaoCorporal = medicao_corporal;
        this.medicao_corporal = medicao_corporal;
        this.peso = peso;
        this.altura = altura;
        this.percentual_gordura = percentual_gordura;
        this.flexibilidade = flexibilidade;
        this.postura = postura;
        this.mobilidade = mobilidade;
        this.equilibrio = equilibrio;
        this.av_cardiovascular = av_cardiovascular;
        this.hist_saude = hist_saude;
        this.habitos_alimentares = habitos_alimentares;
        this.agilidade = agilidade;
    }

    public servico_avaliacao (String medicao_corporal, String peso, String altura, String percentual_gordura, String flexibilidade, String postura, String mobilidade, String equilibrio, String av_cardiovascular, String hist_saude, String habitos_alimentares, String agilidade, String medicaoCorporal) {
        this.medicaoCorporal = medicaoCorporal;
    }

    // Métodos get e set
    public String getMedicao_corporal() {
        return medicao_corporal;
    }

    public void setMedicao_corporal(String medicao_corporal) {
        this.medicao_corporal = medicao_corporal;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;

    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPercentual_gordura() {
        return percentual_gordura;
    }

    public void setPercentual_gordura(String percentual_gordura) {
        this.percentual_gordura = percentual_gordura;

    }

    public String getFlexibilidade() {
        return flexibilidade;
    }

    public void setFlexibilidade(String flexibilidade) {
        this.flexibilidade = flexibilidade;
    }

    public String getPostura() {
        return postura;
    }

    public void setPostura(String postura) {
        this.postura = postura;
    }
    public String getMobilidade() {
        return mobilidade;
    }

    public void setMobilidade(String mobilidade) {
        this.mobilidade = mobilidade;
    }

    public String getEquilibrio() {
        return equilibrio;
    }

    public void setEquilibrio(String equilibrio) {
        this.equilibrio = equilibrio;
    }

    public String getAv_cardiovascular() {
        return av_cardiovascular;

    }

    public void setAv_cardiovascular(String av_cardiovascular) {
        this.av_cardiovascular = av_cardiovascular;
    }

    public String getHist_saude() {
        return hist_saude;
    }

    public void setHist_saude(String hist_saude) {
        this.hist_saude = hist_saude;
    }

    public String getHabitos_alimentares() {
        return habitos_alimentares;
    }
    public void setHabitos_alimentares(String habitos_alimentares) {
        this.habitos_alimentares = habitos_alimentares;
    }

    public String getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(String agilidade) {
        this.agilidade = agilidade;
    }

}

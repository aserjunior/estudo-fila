package entities;

public class Processo {
    private Integer id;
    private String nome;
    private Integer prioridade;
    private Integer ciclosNecessarios;
    private String recursosNecessarios;


    public Processo(Integer id, String nome, Integer prioridade, Integer ciclosNecessarios) {
        this.id = id;
        this.nome = nome;
        this.prioridade = prioridade;
        this.ciclosNecessarios = ciclosNecessarios;
        this.recursosNecessarios = null;
    }

    public Processo(Integer id, String nome, Integer prioridade, Integer ciclosNecessarios, String recursosNecessarios) {
        this.id = id;
        this.nome = nome;
        this.prioridade = prioridade;
        this.ciclosNecessarios = ciclosNecessarios;
        this.recursosNecessarios = recursosNecessarios;
    }

    public Processo() {
    }

    public Integer getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Integer prioridade) {
        this.prioridade = prioridade;
    }

    public Integer getCiclosNecessarios() {
        return ciclosNecessarios;
    }

    public void setCiclosNecessarios(Integer ciclosNecessarios) {
        this.ciclosNecessarios = ciclosNecessarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRecursosNecessarios() {
        return recursosNecessarios;
    }

    public void setRecursosNecessarios(String recursosNecessarios) {
        this.recursosNecessarios = recursosNecessarios;
    }
}

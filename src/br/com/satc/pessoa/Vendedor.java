/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.pessoa;

/**
 *
 * @author Edutec
 */
public class Vendedor extends Funcionario{
        String especialidade;
        float comissao;


    public Vendedor(String especialidade, String setor, String cargo, float salario, String nome, String rg, String cpf) {
        super(setor, cargo, salario, nome, rg, cpf);
        this.especialidade=especialidade;
    }
        public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String retornaDados() {
        String oi;
     oi="Nome:"+this.getNome()+"\nEspecialidade:"+this.getEspecialidade()+"\nRG:"+this.getRg()+"\nCPF:"+this.getCpf()+"\nSalario:"+this.getSalario()+"\nSetor:"+this.getSetor()+"\nCargo:"+this.getCargo()+"\nSalario Final:"+this.getSalariofinal()+"\nComissao:"+this.getComissao()+"\nSupervisor:"+this.getSupervisor().getNome();
    return oi;
    }

    @Override
    public void AlteraNome(String Nome) {
        this.setNome(nome);
    }

    @Override
    public float CalcularComissao(float val,float porcentagem) {
        float ComiVend;
        ComiVend = val*(porcentagem/100);
        this.setComissao(ComiVend);
        return ComiVend;
    }

    @Override
    public void AdicionarBonus(float valor) {
        this.setSalariofinal(this.getSalariofinal()+valor);
        
    }

    @Override
    public void TrocarSupervisor(Funcionario Supervisor) {
        this.setSupervisor(Supervisor);
    }

  
    
}



package br.com.projeto.pin.registroparada;

import java.util.Scanner;

import br.com.projeto.pin.domain.causa.Causa;
import br.com.projeto.pin.domain.componente.Componente;
import br.com.projeto.pin.domain.datahora.DataHora;
import br.com.projeto.pin.domain.descricao.Descricao;
import br.com.projeto.pin.domain.equipamento.Equipamento;
import br.com.projeto.pin.domain.localcausador.LocalCausador;
import br.com.projeto.pin.domain.localproducao.LocalProducao;
import br.com.projeto.pin.domain.lote.Lote;
import br.com.projeto.pin.domain.ordemproducao.OrdemProducao;

public class RegistroParada {
    private Componente componente = new Componente();
    private Equipamento equipamento = new Equipamento();
    private Causa causa = new Causa();
    private LocalProducao localProducao = new LocalProducao();
    private LocalCausador localCausador = new LocalCausador();
    private Lote lote = new Lote();
    private DataHora dataHora = new DataHora();
    private OrdemProducao ordemProducao = new OrdemProducao();
    private Descricao descricao = new Descricao();

    public void registrar() {

        Scanner input = new Scanner(System.in);

        System.out.println("Hora Inicial: ");
        String horaInicial = input.next();
        dataHora.setHoraInicial(horaInicial);

        System.out.println("Hora Final: ");
        String horaFinal = input.next();
        dataHora.setHoraFinal(horaFinal);

        System.out.println("Lote: ");
        String nLote = input.next();
        lote.setLote(nLote);

        System.out.println("Ordem: ");
        String ordem = input.next();
        ordemProducao.setOrdem(ordem);

        System.out.println("Material: ");
        String material = input.next();
        ordemProducao.setMaterial(material);

        System.out.println("Sequencial: ");
        String sequencial = input.next();
        ordemProducao.setSequencial(sequencial);

        System.out.println("Turma: ");
        String turma = input.next();
        ordemProducao.setTurma(turma);

        System.out.println("Local de Produção: ");
        String nomeLocalProducao = input.next();
        localProducao.setNome(nomeLocalProducao);

        System.out.println("Local Causador: ");
        String nomeLocalCausador = input.next();
        localCausador.setNome(nomeLocalCausador);

        System.out.println("Equipamento: ");
        String nomeEquipamento = input.next();
        equipamento.setNome(nomeEquipamento);

        System.out.println("Componente: ");
        String peca = input.next();
        componente.setPeca(peca);

        System.out.println("Tipo: ");
        String tipoCausa = input.next();
        causa.setTipo(tipoCausa);
        
        System.out.println("Atributo: ");
        String atributoCausa = input.next();
        causa.setAtributo(atributoCausa);

        System.out.println("Disfunção: ");
        String disfuncaoCausa = input.next();
        causa.setDisfuncao(disfuncaoCausa);

        System.out.println("Descrição: ");
        String campoDescricao = input.next();
        descricao.setDescricao(campoDescricao);

        input.close();
    }
}

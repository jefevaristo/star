package br.com.star.action;

import javax.persistence.EntityManager;





import br.com.star.dao.RecebimentosDAO;
import br.com.star.dao.RecebimentosInformacoesDAO;
import br.com.star.modelo.Recebimentos;
import br.com.star.modelo.RecebimentosInformacoes;
import br.com.star.util.JPAUtil;

public class NovaVendaGravar {
	public static void main(String[] args) {
		
		EntityManager manager = new JPAUtil().getEntityManager();
		
		RecebimentosDAO recebimentos = new RecebimentosDAO(manager);
		RecebimentosInformacoesDAO recebimentosInformacoes = new RecebimentosInformacoesDAO(manager);
		
		recebimentos.setBanco("banco");
		recebimentos.setData(data);
		recebimentos.setDataRecebimento(dataRecebimento);
		recebimentos.setId(id);
		recebimentos.setIdCliente(idCliente);
		recebimentos.setDataVencimento(dataVencimento);
		recebimentos.setDesconto(desconto);
		recebimentos.setNumeroCheque(numeroCheque);
		recebimentos.setValor(valor);
		
		recebimentosInformacoes.setGarantia(garantia);
		recebimentosInformacoes.setModelo(modelo);
		recebimentosInformacoes.setNumeroCheque(numeroCheque);
		recebimentosInformacoes.setNumeroDeParcelas(numeroDeParcelas);
		recebimentosInformacoes.setNumeroSerie(numeroSerie);
		recebimentosInformacoes.setNumeroVenda(numeroVenda);
		recebimentosInformacoes.setQuantidade(quantidade);
		recebimentosInformacoes.setSucata(sucata);
		
		
		manager.getTransaction().begin();
		manager.persist(recebimentos);
		manager.persist(recebimentosInformacoes);
		manager.getTransaction().commit();
		manager.close();
		
		
		
	}
	
}

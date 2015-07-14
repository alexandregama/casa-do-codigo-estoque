package br.com.casadocodigo.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import br.com.casadocodigo.estoque.ItemEstoque;

public class EstoqueService extends UnicastRemoteObject implements EstoqueRmi {

	private static final long serialVersionUID = 1L;
	
	public EstoqueService() throws RemoteException {
		super();
	}

	@Override
	public ItemEstoque getItemEstoque(String codigo) throws RemoteException {
		Estoque estoque = new HashMapEstoqueDao();
		
		return estoque.getItemEstoque(codigo);
	}

}

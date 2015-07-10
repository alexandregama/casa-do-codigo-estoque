package br.com.casadocodigo.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

import br.com.casadocodigo.estoque.ItemEstoque;

public interface EstoqueRmi extends Remote {

	ItemEstoque getItemEstoque(String codigo) throws RemoteException;
	
}

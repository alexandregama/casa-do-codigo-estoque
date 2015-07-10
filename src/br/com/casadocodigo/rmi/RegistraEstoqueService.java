package br.com.casadocodigo.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class RegistraEstoqueService {

	public static void main(String[] args) {
		try {
			LocateRegistry.createRegistry(1099);
			Naming.rebind("/estoque", new EstoqueService());
		} catch (RemoteException e) {
			throw new RuntimeException("Um erro ocorreu na chamada RMI para o servico", e); 
		} catch (MalformedURLException e) {
			throw new RuntimeException("Ocorreu um erro no nome utilizado para registrar o servico", e);
		}
	}
	
}

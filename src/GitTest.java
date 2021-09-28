import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class GitTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		Cliente cli1 = new Cliente("Antonio Banderas", "00001", 200000);
		Cliente cli2 = new Cliente("Rafael Nadal", "00002", 250000);
		Cliente cli3 = new Cliente("Penélope Cruz", "00003", 300000);
		Cliente cli4 = new Cliente("Julio Iglesias", "00004", 500000);
		Cliente cli5 = new Cliente("Antonio Banderas", "00005", 200000);
		Set<Cliente> clientesBanco = new HashSet<Cliente>();
		clientesBanco.add(cli1);
		clientesBanco.add(cli2);
		clientesBanco.add(cli3);
		clientesBanco.add(cli4);
		clientesBanco.add(cli5);
		/*
		for (Cliente cliente: clientesBanco){
			System.out.println(cliente.getNombre() + " - " +
					cliente.getN_cuenta() + " - " + cliente.getSaldo());
		}
		*/
		
		/*
		Iterator<Cliente> it = clientesBanco.iterator();
		while(it.hasNext()){
			//String nombreCliente = it.next().getNombre();
			Cliente Cli = it.next();
			System.out.println(Cli.getNombre() + " - " + Cli.getN_cuenta() + " - " + Cli.getSaldo());
		}
		*/
		/* Borrado saca error
		for (Cliente cliente: clientesBanco){
			if(cliente.getNombre().equals("Julio Iglesias")){
				clientesBanco.remove(cliente);
			System.out.println(cliente.getNombre() + " - " +
					cliente.getN_cuenta() + " - " + cliente.getSaldo());
			}
		}
		*/
		//clientesBanco.remove(cli1);
		Iterator<Cliente> it = clientesBanco.iterator();
		while(it.hasNext()){
			//String nombreCliente = it.next().getNombre();
			//Cliente Cli = it.next();
			if(it.next().getNombre().equals("Julio Iglesias")){
				it.remove();
			}
		}
		//*****************************************************
		for (Cliente cliente: clientesBanco){
			System.out.println(cliente.getNombre() + " - " +
					cliente.getN_cuenta() + " - " + cliente.getSaldo());
		}
	}

}

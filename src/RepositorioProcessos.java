import java.util.HashMap;

<<<<<<< HEAD
public interface RepositorioProcessos {

	public boolean addProcesso(Processo processo);
	
	public Processo getProcesso(int id);
	
=======
public class RepositorioProcessos {
	
	HashMap <Integer, Processo> repositorio = new HashMap <Integer, Processo>();
	
	boolean addProcesso(Processo processo){
		int identidade = processo.getId();
		//Nao armazena processos com mesmo Ids
		if(repositorio.containsKey(identidade))
			return false;
		else{
			repositorio.put(identidade, processo.copyProcesso());
			return true;
		}
	}
	
	Processo getProcesso(int id){
		//Para nao alterar o banco de processos, o metodo retorna 
		//uma copia do processo requisitado
		if(repositorio.containsKey(id)){
			return repositorio.get(id).copyProcesso();
		}
		else return null;
	}
>>>>>>> 04b9660670706e72179000758e277402d18c4c51
}

import java.util.HashSet;
import java.util.ArrayList;

/**
 * Escreva uma descrição da classe ShippingCompany aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ShippingCompany extends HashSet<Transport>{
    private String name;
    ArrayList<Transport> inService = new ArrayList<Transport>();
    
    public ShippingCompany(){
        super();
    }
    
    public ShippingCompany(String name){
        super();
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public ArrayList<Transport> getInService() {
        return this.inService;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append(String.format("\n%15s: %s\n", "Nome da Companhia", getName()));  
        sb.append(String.format("%15s: %s\n", "Transportes em serviço", ""));  
        for (Transport transport : inService) {
            sb.append(String.format("%17s %s\n", "", transport.toString()));
        }
        
        return sb.toString();
    }
}

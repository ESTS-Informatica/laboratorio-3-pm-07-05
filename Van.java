
/**
 * Escreva uma descrição da classe Van aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Van extends GroundTransportation{
    private int packages;
    
    public Van(){
        super();
    }
    
    public Van(String licensePlate, int packages){
        super();
        setLicensePlate(licensePlate);
        
        this.packages = packages;
    }
    
    public int getPackages() {
         return this.packages;
    }
    
    public void setPackages(int packages) {
        this.packages = packages;
    }
    
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append(String.format("%15s: %d\n", "Número de Pacotes", this.packages));

        return sb.toString();
    }
}

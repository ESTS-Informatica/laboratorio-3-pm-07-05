
/**
 * Escreva uma descrição da classe AirTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AirTransportation extends Transport{
    private String name;
    private int numberOfContainers;
    private static double percentage = 0.04; 

    
    public AirTransportation(){
        super();
    }
    
    public AirTransportation(int auto, String origin, String destination, double price, double fees, boolean available, String name, int numberOfContainers){
        super();
        setOrigin(origin);
        setDestination(destination);
        setPrice(price);
        setFees(fees);
        setAvailable(available);
        this.name = name;
        this.numberOfContainers = numberOfContainers;
    }
    
    @Override
    public double getFees() {
        return super.getFees() * (1.0 + percentage);
    }
    
    //Nível 2
    
    public AirTransportation(String name, int numberOfContainers) {
        super();
        this.name = name;
        this.numberOfContainers = numberOfContainers;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getNumberOfContainers(){
        return this.numberOfContainers;
    }
    
    public void setNumberOfContainers(int numberOfContainers){
        this.numberOfContainers = numberOfContainers;
    }
    
    //Nível 3
    
    @Override
    public double getPriceWithFees() {
        double priceWithFees = getPrice() * (1.0 + percentage);
        return priceWithFees;
    }
    
    @Override
    public String getTransportType() {
        return "Transporte aéreo";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append(String.format("%15s: %s\n", "Nome", this.name));        
        sb.append(String.format("%15s: %d\n", "Número de Contentores", this.numberOfContainers));

        return sb.toString();
    }
}

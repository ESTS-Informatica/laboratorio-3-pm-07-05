
/**
 * Escreva uma descrição da classe GroundTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class GroundTransportation extends Transport{
    private String licensePlate;
    private static double percentage = 0.03; 
    
    public GroundTransportation(){
        super();
    }
    
    public GroundTransportation(int auto, String origin, String destination, double price, double fees, boolean available, String licensePlate){
        super();
        setOrigin(origin);
        setDestination(destination);
        setPrice(price);
        setFees(fees);
        setAvailable(available);
        this.licensePlate = licensePlate;
    }
    
    @Override
    public double getFees() {
        return super.getFees() * (1.0 + percentage);
    }
    
    //Nível 2
    
    public GroundTransportation(String licensePlate) {
        super();
        this.licensePlate = licensePlate;
    }
    
    public String getLicensePlate() {
         return this.licensePlate;
    }
    
    public void setLicensePlate(String licensePlate) {
        if (licensePlate != null) {
            this.licensePlate = licensePlate;
        }
    }
    
    //Nível 3
    
    @Override
    public double getPriceWithFees() {
        double priceWithFees = getPrice() * (1.0 + percentage);
        return priceWithFees;
    }
    
    @Override
    public String getTransportType() {
        return "Transporte terrestre";
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append(String.format("%15s: %s\n", "Matrícula", this.licensePlate));

        return sb.toString();
    }
}

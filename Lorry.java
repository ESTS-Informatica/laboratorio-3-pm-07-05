
/**
 * Escreva uma descrição da classe Lorry aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Lorry extends GroundTransportation{
    private int numberOfPallets;
    private int trailers;
    
    public Lorry(){
        super();
    }
    
    public Lorry(String licensePlate, int numberOfPallets, int trailers){
        super();
        setLicensePlate(licensePlate);
        
        this.numberOfPallets = numberOfPallets;
        this.trailers = trailers;
    }
    
    public int getNumberOfPallets() {
         return this.numberOfPallets;
    }
    
    public void setNumberOfPallets(int numberOfPallets) {
        this.numberOfPallets = numberOfPallets;
    }
    
    public int getTrailers() {
         return this.trailers;
    }
    
    public void setTrailers(int trailers) {
        this.trailers = trailers;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append(String.format("%15s: %d\n", "Número de Paletes", this.numberOfPallets));
        sb.append(String.format("%15s: %d\n", "Atrelados", this.trailers));

        return sb.toString();
    }
}

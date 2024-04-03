
/**
 * Escreva uma descrição da classe Main aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Main
{
    public static void main(String[] args) {
        ShippingCompany company = new ShippingCompany("RELIABLE-MOVING");
        
        System.out.println("Informações da Empresa:");
        System.out.println(company);
        
        GroundTransportation groundTransportation = new GroundTransportation();
        AirTransportation airTransportation1 = new AirTransportation();
        AirTransportation airTransportation2 = new AirTransportation();
        Lorry lorry = new Lorry();
        Van van = new Van();
        
        company.add(groundTransportation);
        company.add(airTransportation1);
        company.add(airTransportation2);
        company.add(lorry);
        company.add(van);
        
        System.out.println("Transportes criados:");
        for (Transport transport : company) {
            System.out.println(transport);
        }
    }
}

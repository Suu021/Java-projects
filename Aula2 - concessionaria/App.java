public class App {
    public static void main(String[] args) throws Exception{ 
        
        Concessionaria italo_GM = new Concessionaria("italo", "Pres. Vargas 1929", "GM");
        Concessionaria william_Audi = new Concessionaria("william", "Iffar", "audi");
        Concessionaria suu_MB = new Concessionaria("Suu", "anyway", "Mercedes Benz");
       

       italo_GM.addCarro("SDF-9823", 2022, 0, "6r5g4r64g6e4ge8", 4);   
       william_Audi.addCarro("THB-3184", 2014, 12000, "6r8g456d5ce87g1", 4);
       william_Audi.addCarro("JYT-6523", 2015, 10000,"3s54f8e4fw94df6", 4);
       suu_MB.addCaminhao("HSF-8726", 2020, 5000, "e6fg49r84g68er4", 10, 5000);
      
       
       System.out.println("italo " + italo_GM.getDesconto());
       System.out.println ("william " + william_Audi.getDesconto());
       Concessionaria.setDesconto(0.7f);

       System.out.println("italo " + italo_GM.getDesconto());
       System.out.println("william " + william_Audi.getDesconto());




    }
}

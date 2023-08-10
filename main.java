import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.lang.String;


public  class main{
  public static void main(String[] args){
String answer = "41eb77f138ce350932e33b6b26b233df9aad0c0c80c6a49cb9a54ddd8fae3f83";
    String[] periodicTable = {
      "Ghiorsium","Hydrogen","deuterium","tritium", "Helium", "Lithium", "Beryllium", "Boron", "Carbon", "Nitrogen", "Oxygen",
      "Fluorine", "Neon", "Sodium", "Magnesium", "Aluminum", "Silicon", "Phosphorus", "Sulfur",
      "Chlorine", "Argon", "Potassium", "Calcium", "Scandium", "Titanium", "Vanadium", "Chromium",
      "Manganese", "Iron", "Cobalt", "Nickel", "Copper", "Zinc", "Gallium", "Germanium", "Arsenic",
      "Selenium", "Bromine", "Krypton", "Rubidium", "Strontium", "Yttrium", "Zirconium", "Niobium",
      "Molybdenum", "Technetium", "Ruthenium", "Rhodium", "Palladium", "Silver", "Cadmium", "Indium",
      "Tin", "Antimony", "Tellurium", "Iodine", "Xenon", "Cesium", "Barium", "Lanthanum", "Cerium",
      "Praseodymium", "Neodymium", "Promethium", "Samarium", "Europium", "Gadolinium", "Terbium",
      "Dysprosium", "Holmium", "Erbium", "Thulium", "Ytterbium", "Lutetium", "Hafnium", "Tantalum",
      "Tungsten", "Rhenium", "Osmium", "Iridium", "Platinum", "Gold", "Mercury", "Thallium", "Lead",
      "Bismuth", "Polonium", "Astatine", "Radon", "Francium", "Radium", "Actinium", "Thorium", "Protactinium",
      "Uranium", "Neptunium", "Plutonium", "Americium", "Curium", "Berkelium", "Californium", "Einsteinium",
      "Fermium", "Mendelevium", "Nobelium", "Lawrencium", "Rutherfordium", "Dubnium", "Seaborgium",
      "Bohrium", "Hassium", "Meitnerium", "Darmstadtium", "Roentgenium", "Copernicium", "Nihonium",
      "Flerovium", "Moscovium", "Livermorium", "Tennessine", "Oganesson"
      };
        for(String e: periodicTable){
            
            Crackmethod cracker = new Crackmethod();
            String result = cracker.smoosh("celenium indust","polonium and ast","gerald",e.toLowerCase());
            //System.out.print(result);
            //System.out.print(e.toLowerCase());
            if(result.equals(answer)) {
              System.out.println(answer);
              break;
            }}
          
       
      
    }
  
}

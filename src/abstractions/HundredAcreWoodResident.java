
package abstractions;


public class HundredAcreWoodResident {
    private String habitat;
    
    public HundredAcreWoodResident(String h)
    {
    habitat = h;
    }
    
    
    public void setHabitat(String h)
    {
    habitat = h;
    }
    
    @Override    
    public String toString()
    {
            String str = "Home: " + habitat;
            return str;
    }
}

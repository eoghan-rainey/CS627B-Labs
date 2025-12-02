package lab2;

public class AccessPackage{
    private String seatinginfo;
    private String VIPperk;
    private boolean digitalaccess;

    public AccessPackage(String seatinginfo,String VIPperk,boolean digitalaccess){
        this.seatinginfo=seatinginfo;
        this.VIPperk=VIPperk;
        this.digitalaccess=digitalaccess;
    }

    //Getter
    public String getSeat(){
        return seatinginfo;
    }

    public String getVIP(){
        return VIPperk;
    }

    public boolean getdigital(){
        return digitalaccess;
    }

    //Setter
    public void setSeat(String seatinginfo){
        this.seatinginfo=seatinginfo;
    }

    public void setVIP(String VIPperk){
        this.VIPperk=VIPperk;
    }

    public void setdigital(boolean digitalaccess){
        this.digitalaccess=digitalaccess;
    }

    @Override
    public String toString(){
        return "Seating Info: "+seatinginfo+", VIP Perk: "+VIPperk+", Digital Access: "+digitalaccess;
    }

}
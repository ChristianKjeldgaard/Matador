public class Feltvaerdi {

    private String name;
    private String type;
    private int  price;
    private int rent;
    private String colour;

    public Feltvaerdi() {
        name = "";
        type = "";
        price = 0;
        rent = 0;
        colour = "";

    }
        public void Felt(String name,String type,int price,int rent,String colour){
            this.name = name;
            this.type = type;
            this.price = price;
            this.rent = rent;
            this.colour = colour;
        }
    }

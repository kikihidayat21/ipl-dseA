package openclose;

public class StudentCinema {
    public StudentCinema(double price){
        this.price = price;
        }
        @Override
        Double calculateAdminFee(){
        return this.price * 2/100;
        }
       }
}

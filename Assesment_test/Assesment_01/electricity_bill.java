public class electricity_bill {
    public static void main(String[] args) {
        int unit=564;

        if(unit<=100){
            System.out.println(unit*1.25);
        }
        else if (unit >100 && unit <=200 ){
            System.out.println(100*1.25 + (unit-100)*1.50 );
        }
        else if(unit> 200){
            System.out.println(100*1.25 + 100*1.50 +(unit-200)*1.80);
            
        }
    }
}

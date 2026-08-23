public class Given_integer_is_present_or_not {
    public static void main(String[] args) {
        int[] pratap = {43,77,65,44,78};

        boolean bool = false;
        for(int singh : pratap) {
            if (singh==77 ){
                bool=true;
                break;
            }
        }
        if(bool==true){
            System.out.println("the value is present in the given array ");
        }

        else {
        System.out.println("the value is not in the array ");

        }
    }
}

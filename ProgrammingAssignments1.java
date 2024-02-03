 class SY2022BIT026 {

    public int getvalidRegistrationCount(String [] regno) {
        int count = 0;
        for (int i = 0; i < regno.length; i++) {
            String year=regno[i].substring(0,4);
            String dep=regno[i].substring(4,7);

            String startyear="2000";
            String endyear="2024";
            int c = regno[i].length();
            if (c == 10) {         // Check the size of registration number is 10;
                if (year.compareTo(startyear) >= 0 && year.compareTo(endyear) <= 0) {
                    // count++;
                    // Your department checks here...{
                    // count++;
                    String bcs="BCS";     // for Computer Science department
                    String bit="BIT";     // for Information technology department
                    String bmc="BMC";    // for  mechanical department
                    String bch="BCH";    // for chemical department

                    if(bcs.equals(dep)){
                        count++;
                    }
                    if(bit.equals(dep)){
                        count++;
                    }
                    if(bmc.equals(dep)){
                        count++;
                    }
                    if(bch.equals(dep)){
                        count++;
                    }
                }
            }}
        return count;
    }


    public static void main(String[] args) {
        String [] regno={"2022BIT026","2009BCS016","2022BMC623","2022BCH06","2022BMC032","1900BIT225","2021BMC888","2022BTY234"};
        System.out.print("Valid Registration Number Count:");
        SY2022BIT026 sy =new SY2022BIT026();
        System.out.println( sy.getvalidRegistrationCount(regno));;
    }}
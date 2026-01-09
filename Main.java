public static void main(String[] args) {
//    User john = new User();
    User john = new User("John",1954,2,18);
    john.displayInfo();
    Admin nicolas = new Admin("Nicolas",1964,7,1);
//    nicolas.displayInfo();
    nicolas.displayInfo(true);
    nicolas.displayInfo(false);
}
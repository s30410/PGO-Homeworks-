class Goal {
    private String name;
    private int year;
    private int month;
    private int day;
    private int bonus;

    public Goal (String name, int year, int month, int day, int bonus){
        this.name=name;
        this.year=year;
        this.day=day;
        this.bonus=bonus;

    }

    public  int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay() {
        return day;
    }
    public  int getBonus(){
        return bonus;
    }
}

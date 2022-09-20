package arena;

import Sports.Sports;
import badminton.badminton;
import football.football;

public class arena {
    public Sports getSports(String sportType){
        if(sportType == null){
            return null;
        }
        if(sportType.equalsIgnoreCase("BADMINTON")){
            return new badminton();

        } else if (sportType.equalsIgnoreCase("FOOTBALL")){
            return new football();
        }
        return null;}
}

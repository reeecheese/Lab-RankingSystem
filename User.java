public class User {
    int rank; int progress;
    public User(){
        rank = -8; progress = 0;
        }
    public int getRank(){
        return rank;
    }
    public int getProgress(){
        return progress;
    }
    public void incProgress(int activityRank){
        if(activityRank > 8 || activityRank <-8 || activityRank == 0){
            throw new IllegalArgumentException("The rank of an activity cannot be less than 8, 0, or greater than 8!");
        }
        int d = activityRank - rank;
        if(activityRank>0 && rank < 0){
            d = d - 1;
        }
        if(d > 0 ){
            progress = 10 * d * d;
        }if(d == 0){
            progress = progress + 3;
        }if(d == -1) {
            progress = progress + 1;
        }if(progress >= 100){
            while(progress>=100){
                progress = progress - 100;
                rank++;
                if(rank == 0){
                    rank = 1;
                }
        }
}}////
    public String toString(){
        String output = "User{rank="+ rank +", " + "progress="+progress + "}";
        return output;
    }


}

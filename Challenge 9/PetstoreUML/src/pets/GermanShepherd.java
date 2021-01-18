/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets;

/**
 *
 * @author worm
 */
public class GermanShepherd extends Dog {
    
    private Boolean canGuard;
    private Boolean doTricks;
    private Boolean isLargeDog;
    
    public GermanShepherd(Gender gender, String name, int age, Boolean isLargeDog, Boolean canGuard) {
        super(gender, name, age);
        this.isLargeDog = isLargeDog;
        this.canGuard = canGuard;
    }
    
    @Override
    public String getSkill(){
        if(isTrained == true){
            return "Can patrol! Guard! Take care of baby!";
        }else{
            return "Can do nothing...";
        }
    }
    
    String guarding(){
        return "Careful! Caucasian is coming!";
    }
    
    protected void training(){
        canGuard = true;
        doTricks = true;
    }
    
    public String perform(){
        if(doTricks == true){
            return "Ohhh, what a wonderful dog, "
                    + "it can do so many tricks and is well trained!";
        }else{
            return "No no no... Your dog needs training!";
        }
    }
    
    @Override
    public String toString() {
        String info = super.toString();
        String updatedInfo =  String.format("%s, Guard: %s", info, canGuard);
        updatedInfo +=  ", Well-Trained: " + doTricks;    
        return updatedInfo;
    }
}
    
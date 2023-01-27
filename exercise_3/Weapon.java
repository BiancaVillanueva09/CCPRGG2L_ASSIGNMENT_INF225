public class Weapon {
    String weapon;
    String weaponname;
    int damage;
    String rarity;
    String description;
    String charactername;
    String attack;
    int additionalDamage;

    public void sayTheWeapon() {
        System.out.println("This is a " + weapon +".");
    }
    
    public void sayWeaponName() {
        System.out.println("Its name is " + weaponname +".");
    }

    public void sayDescription() {
        System.out.println("Description: " + description);
    }


    public void AddDamage(int additionalDamage) {
        int newDamage = this.damage + additionalDamage;
        System.out.println("Damage increased from " + damage + " to " + newDamage + ".");
        this.damage = newDamage; 
    }

    public String showNameandRarity(){
        return this.weaponname + " " + this.rarity;
    }

}

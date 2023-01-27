public class App {
    public static void main(String[] args) {

        Weapon Dagger = new Weapon();

        Dagger.weapon = "Dagger";
        Dagger.weaponname = "Rubra";
        Dagger.damage = 100;
        Dagger.rarity = "Legendary";
        Dagger.description = "A dagger that can kill an immortal's soul by applying the owner's blood on his heart on the blade. A dagger that will kill both the owner and the immortal.";
        Dagger.sayTheWeapon();
        Dagger.sayWeaponName();
        Dagger.sayDescription();
        Dagger.AddDamage(20);
        System.out.print(Dagger.showNameandRarity());
    

        Character Commander = new Character();

        Commander.charactername = "Ciel:";
        Commander.attack();


        Weapon Sword = new Weapon();

        Sword.weapon = "Long Sword";
        Sword.weaponname = "Skotos";
        Sword.damage = 150;
        Sword.rarity = "Rare";
        Sword.description = "A long sword that is ony slightly above a common sword. But its strength depends on its wielder, the stronger the wielder, the stronger the sword.";
        Sword.sayTheWeapon();
        Sword.sayWeaponName();
        Sword.sayDescription();
        Sword.AddDamage(300);
        System.out.print(Sword.showNameandRarity());

        Character Knight = new Character();

        Knight.charactername = "Han:";
        Knight.attack();

        
        Weapon Spear = new Weapon();

        Spear.weapon = "Spear";
        Spear.weaponname = "Ra";
        Spear.damage = 100;
        Spear.rarity = "Rare";
        Spear.description = "A spear that can break through thousand armors.";
        Spear.sayTheWeapon();
        Spear.sayWeaponName();
        Spear.sayDescription();
        Spear.AddDamage(200);
        System.out.print(Spear.showNameandRarity());

        Character Prince = new Character();
        Prince.charactername = "Al:";
        Prince.attack();
    }
}

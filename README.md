# RPG-Heroes

## Project Description
This project was an assignment at Experis Academy. The goal was to create a Gradle or Maven application in Java.

In RPG-Heroes you can create and level up your own hero. In this application, there are four different classes a hero can belong to: Mage, Ranger, Rogue, and Warrior. Each hero starts at level 1 and has shared fields such as Name, Level, LevelAttributes, Equipment, ValidWeaponTypes, and ValidArmorTypes.

### Classes
#### Mage
A Mage starts with the following attributes:
* Strength: 1
* Dexterity: 1
* Intelligence: 8

Every time a Mage levels up, their attributes increase as follows:
* Strength: 1
* Dexterity: 1
* Intelligence: 5

A Mage can equip the following items:
* Staffs
* Wands
* Cloth

#### Ranger
A Ranger starts with the following attributes:
* Strength: 1
* Dexterity: 7
* Intelligence: 1

Every time a Ranger levels up, their attributes increase as follows:
* Strength: 1
* Dexterity: 5
* Intelligence: 1

A Ranger can equip the following items:
* Bows
* Leather
* Mail

#### Rogue
A Rogue starts with the following attributes:
* Strength: 2
* Dexterity: 6
* Intelligence: 1

Every time a Rogue levels up, their attributes increase as follows:
* Strength: 1
* Dexterity: 4
* Intelligence: 1

A Rogue can equip the following items:
* Daggers 
* Swords
* Leather 
* Mail

#### Warrior
A Warrior starts with the following attributes:
* Strength: 5
* Dexterity: 2
* Intelligence: 1

Every time a Warrior levels up, their attributes increase as follows:
* Strength: 3
* Dexterity: 2
* Intelligence: 1

A Warriore can equip the following items:
* Axes
* Hammers
* Swords
* Mail
* Plate

### Hero Attributes
The HeroAttribute class encapsulates the attributes of each hero. It includes the following attributes:
* Strength
* Dexterity
* Intelligence
The HeroAttribute class has a method to add two instances together.

### Items and Equipment
There are two types of items in the game: Weapons and Armor. All items share the following fields: Name, RequiredLevel, and Slot. 
If a hero is below the RequiredLevel, they cannot equip the item. Each item is equipped in a specific Slot.

#### Weapons
There are several types of weapons which exist:
* Axes
* Bows
* Daggers
* Hammers
* Staffs
* Swords
* Wands
Each weapon deals damage, which is represented as a WeaponDamage field. When a weapon is created, it is automatically given the Slot of Weapon.

#### Armor
There are several types of armor that exist:
* Cloth
* Leather
* Mail
* Plate

Each armor has attributes which provide bonuses to a hero's attributes when equipped.


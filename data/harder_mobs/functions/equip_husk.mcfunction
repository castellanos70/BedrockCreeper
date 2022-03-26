tag @s add op_husk
execute if entity @p[level=17..] run loot replace entity @s weapon.mainhand loot harder_mobs:husk_weapon
execute if entity @p[level=28..] run data modify entity @s AbsorptionAmount set value 15
execute if entity @p[level=37..] run loot replace entity @s armor.feet loot harder_mobs:husk_boots
data modify entity @s HandDropChances[0] set value 0.01f
data modify entity @s ArmorDropChances[0] set value 0.01f
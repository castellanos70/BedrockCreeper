tag @s add op_zombie
execute if entity @p[level=15..] run loot replace entity @s weapon.mainhand loot harder_mobs:zombie_weapon
execute if entity @p[level=30..] run data modify entity @s AbsorptionAmount set value 20
execute if entity @p[level=40..] run loot replace entity @s armor.chest loot harder_mobs:zombie_armor
data modify entity @s HandDropChances[0] set value 0.01f
data modify entity @s ArmorDropChances[2] set value 0.01f
tag @s add op_mob
execute if entity @p[level=5..] run loot replace entity @s weapon.mainhand loot harder_mobs:pillager_weapon
execute if entity @p[level=10..] run loot replace entity @s weapon.offhand loot harder_mobs:pillager_arrow
data modify entity @s HandDropChances[0] set value 0.01f
data modify entity @s HandDropChances[1] set value 1.0f
execute if entity @p[level=25..] run data modify entity @s AbsorptionAmount set value 25

tag @s add op_mob
execute if entity @p[level=25..] run loot replace entity @s weapon.mainhand loot harder_mobs:piglin_weapon
execute if entity @p[level=14..34] run data modify entity @s AbsorptionAmount set value 6
execute if entity @p[level=35..44] run data modify entity @s AbsorptionAmount set value 12
execute if entity @p[level=45..] run data modify entity @s AbsorptionAmount set value 18
data modify entity @s HandDropChances[0] set value 0.01f
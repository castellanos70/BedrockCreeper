tag @s add op_mob
execute if entity @p[level=25..34] run data modify entity @s AbsorptionAmount set value 12
execute if entity @p[level=35..] run data modify entity @s AbsorptionAmount set value 24
execute if entity @p[level=15..29] run function harder_mobs:equip_trident20percent
execute if entity @p[level=30..39] run function harder_mobs:equip_trident40percent
execute if entity @p[level=40..] run function harder_mobs:equip_trident70percent
data modify entity @s HandDropChances[0] set value 0.03f
data modify entity @s HandDropChances[1] set value 1.0f

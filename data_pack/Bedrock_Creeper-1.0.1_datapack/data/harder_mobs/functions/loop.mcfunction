# data get entity @e[type=minecraft:drowned, distance=..10, limit=1, sort=nearest]
execute as @e[type=minecraft:zombie,tag=!op_mob] run function harder_mobs:equip_zombie
execute as @e[type=minecraft:husk,tag=!op_mob] run function harder_mobs:equip_husk
execute as @e[type=minecraft:drowned,tag=!op_mob] run function harder_mobs:equip_drowned
execute as @e[type=minecraft:pillager,tag=!op_mob] run function harder_mobs:equip_pillager
execute as @e[type=minecraft:piglin,tag=!op_mob] run function harder_mobs:equip_piglin
execute as @e[type=minecraft:wandering_trader,tag=!op_mob] at @s run function harder_mobs:wandering_trades

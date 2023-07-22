# BedrockCreeper
Minecraft Datapack bringing Creativity, Intrest, Challange, Fun and Balance

## Dev Notes:
### Creating Resource Pack, BedrockCreeper_RP_x.y.z.zip
1. The TOP LEVEL of the `.zip` must have `assets` folder, `pack.mcmeta`, `pack.png`, and `Selected Packs.txt` files.
2. Into a temporary working folder, tmp, which is ignored by git, copy the contents of `resource_pack\BedrockCreeper_vanilla-tweaks`. Next, merge into the blocks and textures directories `resource_pack\BedrockCreeper_blocks` and `resource_pack\BedrockCreeper_textures`.
3. Copy `data_pack\pack.png`, update version and copy `data_pack/pack.mcmeta` into tmp folder.
4. Zip tmp folder contains (not the folder itself) and upload to website. 
5. Update server preference file to the new .zip file name with new version number


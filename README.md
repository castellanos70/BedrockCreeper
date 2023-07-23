# BedrockCreeper
Minecraft Datapack bringing Creativity, Intrest, Challange, Fun and Balance

## Dev Notes:
### Creating Resource Pack, BedrockCreeper_RP_x.y.z.zip
1. The TOP LEVEL of the `.zip` must have `assets` folder, `pack.mcmeta`, `pack.png`, and `Selected Packs.txt` files.
2. Into a temporary working folder, tmp, which is ignored by git, copy the contents of `resource_pack\BedrockCreeper_vanilla-tweaks`. Note that `resource_pack\BedrockCreeper_vanilla-tweaks` is *not* a simple unzip of
what vanilla-tweaks downloads. In particular, the .json model files for warped and crimson planks, steps and slabs using 6 texture variations need to be deleated (and the corrosponding textues have also been deleated)
3. Next, merge into the blocks and textures directories `resource_pack\BedrockCreeper_blocks` and `resource_pack\BedrockCreeper_textures`.
4. Copy `data_pack\pack.png`, update version and copy `data_pack/pack.mcmeta` into tmp folder.
5. Zip tmp folder contains (not the folder itself) and upload to website. 
6. Update server preference file to the new .zip file name with new version number


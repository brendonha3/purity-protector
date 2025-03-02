# the plan

## start
in the beginning I must:
- figure out where the plugin code is
  - https://github.com/runelite/runelite/blob/master/runelite-client/src/main/java/net/runelite/client/plugins/menuentryswapper/MenuEntrySwapperPlugin.java
  - code is here, starting at line 705, for the menu entry swap portion
  - still need to know how to get the attack style, what the attack styles are, and how to swap attack off left click
    - thought: possibly can force a swap to walk here no matter what if attack exists and attack action could cause def xp gain
- looking for attack style information
- thoughts on implementation
  - do another implementation
- interesting comment about walk here swaps at 1654
- maybe instead of walk here, add an option that does nothing except spam "NO! BAD!" and then use that option as the left-click option when butterfly net is equipped
### pseudo code
```
    // butterfly net
    if weapon slot item is butterfly net or magic butterfly net
        add NPC menu option Def Protection
        change NPC menu option to Def Protection
        
    // on attack style that can gain xp
    setup AttackStyles enum with attack styles that gain def xp
    
    startup
        currentAttackStyle = getCurrentAttackStyle()
        if currentAttackStyle == AttackStyles.GainsDefXp = true
            swapToDefProtectionMenuEntry
    
    onAttackStyleChangeEvent
        if currentAttackStyle == AttackStyles.GainsDefXp = true
            swapToDefProtectionMenuEntry
        
    onEquippedItemIntoMainhand
        if currentAttackStyle == AttackStyles.GainsDefXp = true
    
    swapToDefProtectionMenuEntry
        add defProtectionMenuEntry
        swap NPC menu entry to defProtectionMenuEntry
    
    on mouseover of npc
        set 
    if 
```

### need to look up
- How to get current attack style on startup
```
import net.runelite.api.VarPlayer 
attackStyle = VarPlayer.ATTACK_STYLE
attackStyleName = VarPlayer.ATTACK_STYLE_NAME
```
- How to get an attack style change event
```

```
- How to create a new menu entry for NPCs
- How to make that entry do stuff
- How to swap to that entry
- How to listen for an attack options change

### Sidequest - get it to boot
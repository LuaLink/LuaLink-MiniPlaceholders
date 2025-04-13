# OBSOLETE WITH V2. Please see https://lualink.github.io/docs/dependencies/ for using external plugins.
# LuaLink-MiniPlaceholders

### Introduction
The MiniPlaceholders addon provides access to MiniPlaceholders functionality within LuaLink scripts. You can use it to retrieve placeholders and integrate them into your LuaLink scripts seamlessly.

### Functions

1. **`getRelationalPlaceholders(player1: Player, player2: Player): Table`**
   - Retrieve relational placeholders between two players.
   - `player1`: A `Player` object representing the first player.
   - `player2`: A `Player` object representing the second player.
   - Returns: A Lua table containing relational placeholders.

2. **`getRelationalGlobalPlaceholders(player1: Player, player2: Player): Table`**
   - Retrieve global relational placeholders between two players.
   - `player1`: A `Player` object representing the first player.
   - `player2`: A `Player` object representing the second player.
   - Returns: A Lua table containing global relational placeholders.

3. **`getAudiencePlaceholders(player: Player): Table`**
   - Retrieve audience placeholders for a specific player.
   - `player`: A `Player` object representing the player.
   - Returns: A Lua table containing audience placeholders.

4. **`getAudienceGlobalPlaceholders(player: Player): Table`**
   - Retrieve global audience placeholders for a specific player.
   - `player`: A `Player` object representing the player.
   - Returns: A Lua table containing global audience placeholders.

5. **`getGlobalPlaceHolders(): Table`**
   - Retrieve global placeholders.
   - Returns: A Lua table containing global placeholders.

### Usage Examples

#### Retrieving Global Placeholders
```lua
local MiniPlaceholders = addons.get("MiniPlaceholders")
local MiniMessage = import "net.kyori.adventure.text.minimessage.MiniMessage"

-- Retrieve global placeholders
local globalPlaceholders = MiniPlaceholders.getGlobalPlaceHolders()

-- Example message using MiniMessage
local msg = "<green>There are <yellow><server_online></yellow> players currently online!</green>"

-- Send the message with placeholders applied
sender:sendMessage(MiniMessage:miniMessage():deserialize(msg, globalPlaceholders))
```

#### Retrieving Relational Placeholders
```lua
local MiniPlaceholders = addons.get("MiniPlaceholders")
local MiniMessage = import "net.kyori.adventure.text.minimessage.MiniMessage"

-- Retrieve two player objects (player1 and player2)
local player1 = ... -- Get the first player
local player2 = ... -- Get the second player

-- Retrieve relational placeholders
local relationalPlaceholders = MiniPlaceholders.getRelationalPlaceholders(player1, player2)

-- Example message using MiniMessage
local msg = "<green><player1> and <player2> are friends!</green>"

-- Send the message with placeholders applied
sender:sendMessage(MiniMessage:miniMessage():deserialize(msg, relationalPlaceholders))
```

#### Retrieving Audience Placeholders
```lua
local MiniPlaceholders = addons.get("MiniPlaceholders")
local MiniMessage = import "net.kyori.adventure.text.minimessage.MiniMessage"

-- Retrieve a player object
local player = ... -- Get the player

-- Retrieve audience placeholders
local audiencePlaceholders = MiniPlaceholders.getAudiencePlaceholders(player)

-- Example message using MiniMessage
local msg = "<green>Welcome, <player_name>! You have <player_balance> coins.</green>"

-- Send the message with placeholders applied
sender:sendMessage(MiniMessage:miniMessage():deserialize(msg, audiencePlaceholders))
```

Please make sure to replace `...` with actual player objects or relevant data in your script.


### Online players command example
```lua
local MiniPlaceholders = addons.get("MiniPlaceholders")
local MiniMessage = import "net.kyori.adventure.text.minimessage.MiniMessage"
script.registerSimpleCommand(function(sender, args)
    local globalPlaceholders = MiniPlaceholders.getGlobalPlaceholders()
    local msg = "<green>There are <yellow><server_online></yellow> players currently online!</green>"

    sender:sendMessage(MiniMessage:miniMessage():deserialize(msg, globalPlaceholders))
end, {
    name = "players",
    description = "Example command to test MiniPlaceholders and MiniMessage",
})
```

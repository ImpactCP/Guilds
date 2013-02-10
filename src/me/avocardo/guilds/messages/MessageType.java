package me.avocardo.guilds.messages;

public enum MessageType {

	ALREADY_IN_GUILD("&e/p/ is already in a guild."),
	MUST_JOIN_GUILD("&eyou need to join a guild to play on this server!"),
	GUILD_CHOSEN("&eyou have chosen your guild."),
	NOT_IN_GUILD("&eyou do not belong to a guild"),
	GUILD_CREATED("&e/g/ has been created."),
	GUILD_EXISTS("&e/g/ already exists."),
	GUILD_DELETED("&e/g/ has been removed."),
	GUILD_LEAVE("&eyou have left your guild."),
	JOIN_COMMAND("&e/guilds join <guild>"),
	NO_FRIENDLY_FIRE("&esame guild PVP is not allowed!"),
	PEACEKEEPER("&eyou are a peacekeeper!"),
	REFLECTED("&eREFLECTED!"),
	SUNLIGHT("&eSunlight!"),
	MOONLIGHT("&eMoonlight!"),
	RAIN("&eRain!"),
	LAND("&eLand!"),
	WATER("&eWater!"),
	ALTITUDE("&eAltitude!"),
	COMMAND_SETBASE("&emissing parameters... /guilds setbase <guild>"),
	COMMAND_SETTING("&emissing parameters... /guilds setting <setting> <value>"),
	COMMAND_SETTINGS("&emissing parameters... /guilds settings <guild> <settings> <value>"),
	COMMAND_MESSAGE("&emissing parameters... /guilds message <message> <value>"),
	COMMAND_TOGGLE("&emissing parameters... /guilds toggle <guild> <world/biome>"),
	COMMAND_WORLD("&emissing parameters... /guilds world <guild> <world>"),
	COMMAND_RESTRICTIONS("&emissing parameters... /guilds restrictions <guild> <material/itemid>"),
	COMMAND_BIOME("&emissing parameters... /guilds biome <guild> <biome>"),
	COMMAND_REMOVE("&emissing parameters... /guilds remove <guild>"),
	COMMAND_CREATE("&emissing parameters... /guilds create <guild>"),
	COMMAND_KICK("&emissing parameters... /guilds kick <player>"),
	COMMAND_ADD("&emissing parameters... /guilds add <player> <guild>"),
	COMMAND_JOIN("&emissing parameters... /guilds join <guild>"),
	COMMAND_PROFICIENCY("&emissing parameters... /guilds proficiency <guild> <proficiency> <input> <value>"),
	GUILD_JOIN("&eyou joined /g/"),
	PLAYER_GUILD_JOIN("&e/p/ added to /g/"),
	ITEM_RESTRICTED("&ethis item is restricted for your guild."),
	ARMOUR_RESTRICTED("&ethis armour is restricted for your guild."),
	COOLDOWN("&e/s/ Cooling Down!"),
	NO_PERMISSION_JOIN("&eyou do not have permission to join /g/."),
	NO_PERMISSION("&eyou do not have permission."),
	SAVE("&esave complete."),
	LOAD("&eload complete."),
	BASE_SET("&eBase set for /g/."),
	PROTECTED_BARRIER_WARNING("&ethis area belongs to /g/."),
	PROTECTED_BLOCK("&eblock in /g/ protected area!"),
	PROTECTED_BARRIER("&etoo close to /g/ spawn area!"),
	PLAYER_REMOVED_FROM_GUILD("&e/p/ was removed from their guild."),
	YOU_REMOVED_FROM_GUILD("&eyou were removed from your guild."),
	GUILD_NOT_RECOGNISED("&eguild /g/ not recognised."),
	PLAYER_NOT_RECOGNISED("&eplayer /p/ not recognised."),
	CONSOLE_ERROR("&ecommand not supported by console."),
	SETTING_NOT_RECOGNISED("&e/s/ not recognised."),
	SETTING_SET("&e/s/ set to /v/"),
	SETTINGS_SET("&e/s/ set to /v/ for /g/"),
	TOGGLE_SET("&e/t/ set to /v/ for /g/"),
	PROFICIENCY_INPUT_SET("&e/p/ input /i/ set to /v/ for /g/"),
	NOT_BOOLEAN("&ethe value you entered is not true/false."),
	NOT_INT("&ethe value you entered is not an integer."),
	NOT_DOUBLE("&ethe value you entered is not a double."),
	NOT_LONG("&ethe value you entered is not a long."),
	MESSAGE_NOT_RECOGNISED("&e/m/ not recognised."),
	MESSAGE_SET("&e/m/ set to /v/"),
	CHANGE_TIME("&e/t/ seconds before you can change guild."),
	COMMAND_NOT_RECOGNISED("&e/guilds /a/ not recognised."),
	PROFICIENCY_NOT_RECOGNISED("&eproficiency /p/ not recognised."),
	INPUT_NOT_RECOGNISED("&einput /i/ not recognised."),
	TOGGLE_NOT_RECOGNISED("&eplease use 'world' or 'biome' to toggle."),
	WORLD_NOT_RECOGNISED("&e/w/ not a recognised world."),
	BIOME_NOT_RECOGNISED("&e/b/ not a recognised biome."),
	RESTRICTION_NOT_RECOGNISED("&e/r/ not a recognised material or material id."),
	WRONG_INPUT("&e/p/ does not have /i/ setting."),
	LEADERBOARD("&e|/r/| &7/g/ - (/k///d/) &e- Exp (/e/)");
    
    String str;
   
    MessageType(String str) {
      	this. str = str;
    }

    public String getMessage() {
    	return this.str;
    }

    public void setMessage(String str) {
    	this.str = str;
    }
   
    @Override
    public String toString() {
    	return super.toString();
    }
	
}

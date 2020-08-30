package com.alessiodp.parties.bukkit.configuration.data;

import com.alessiodp.core.common.configuration.ConfigOption;
import com.alessiodp.parties.common.PartiesPlugin;
import com.alessiodp.parties.common.configuration.PartiesConstants;
import com.alessiodp.parties.common.configuration.data.ConfigParties;
import lombok.Getter;

public class BukkitConfigParties extends ConfigParties {
	@Getter private final String fileName = "parties.yml";
	@Getter private final String resourceName = "bukkit/parties.yml";
	@Getter private final int latestVersion = PartiesConstants.VERSION_BUKKIT_CONFIG_PARTIES;
	
	// Additional settings
	@ConfigOption(path = "additional.friendly-fire.enable")
	public static boolean		ADDITIONAL_FRIENDLYFIRE_ENABLE;
	@ConfigOption(path = "additional.friendly-fire.type")
	public static String		ADDITIONAL_FRIENDLYFIRE_TYPE;
	@ConfigOption(path = "additional.friendly-fire.warn-players-on-fight")
	public static boolean		ADDITIONAL_FRIENDLYFIRE_WARNONFIGHT;
	
	@ConfigOption(path = "additional.home.enable")
	public static boolean		ADDITIONAL_HOME_ENABLE;
	@ConfigOption(path = "additional.home.delay")
	public static int			ADDITIONAL_HOME_DELAY;
	@ConfigOption(path = "additional.home.cooldown-home")
	public static int			ADDITIONAL_HOME_COOLDOWN_HOME;
	@ConfigOption(path = "additional.home.cooldown-sethome")
	public static int			ADDITIONAL_HOME_COOLDOWN_SETHOME;
	@ConfigOption(path = "additional.home.max-homes")
	public static int			ADDITIONAL_HOME_MAX_HOMES;
	@ConfigOption(path = "additional.home.cancel.hit")
	public static boolean		ADDITIONAL_HOME_CANCEL_HIT;
	@ConfigOption(path = "additional.home.cancel.moving")
	public static boolean		ADDITIONAL_HOME_CANCEL_MOVING;
	@ConfigOption(path = "additional.home.cancel.distance")
	public static int			ADDITIONAL_HOME_CANCEL_DISTANCE;
	@ConfigOption(path = "additional.home.cancel.reset-cooldown")
	public static boolean		ADDITIONAL_HOME_CANCEL_RESET_COOLDOWN;
	
	@ConfigOption(path = "additional.kills.enable")
	public static boolean		ADDITIONAL_KILLS_ENABLE;
	@ConfigOption(path = "additional.kills.which-save.neutral-mobs")
	public static boolean		ADDITIONAL_KILLS_MOB_NEUTRAL;
	@ConfigOption(path = "additional.kills.which-save.hostile-mobs")
	public static boolean		ADDITIONAL_KILLS_MOB_HOSTILE;
	@ConfigOption(path = "additional.kills.which-save.players")
	public static boolean		ADDITIONAL_KILLS_MOB_PLAYERS;
	
	
	public BukkitConfigParties(PartiesPlugin plugin) {
		super(plugin);
	}
}

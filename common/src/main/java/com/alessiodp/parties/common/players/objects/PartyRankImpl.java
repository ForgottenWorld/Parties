package com.alessiodp.parties.common.players.objects;

import com.alessiodp.parties.api.interfaces.PartyRank;
import com.alessiodp.parties.common.PartiesPlugin;
import com.alessiodp.parties.common.utils.PartiesPermission;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class PartyRankImpl implements PartyRank {
	@Getter @Setter @NonNull private String configName;
	@Getter @Setter private String name = "";
	@Getter @Setter private String chat = "";
	@Getter @Setter private int level = 1;
	@Getter @Setter private List<String> permissions = new ArrayList<>();
	private boolean def = false;
	
	@Override
	public void setDefault(boolean def) {
		this.def = def;
	}
	
	@Override
	public boolean isDefault() {
		return def;
	}
	
	@Override
	public boolean havePermission(String p) {
		for (String perm : permissions) {
			if ("*".equals(perm))
				return true;
			
			if (perm.equalsIgnoreCase("-" + p))
				return false;
			else if (perm.equalsIgnoreCase(p))
				return true;
		}
		return false;
	}
	
	public boolean havePermission(PartiesPermission p) {
		return havePermission(p.toString());
	}
	
	public String parseWithPlaceholders(PartiesPlugin plugin, String message) {
		return message
				.replace("%config%", configName)
				.replace("%name%", plugin.getMessageUtils().formatText(name))
				.replace("%chat%", plugin.getMessageUtils().formatText(chat))
				.replace("%level%", Integer.toString(level))
				.replace("%default%", plugin.getMessageUtils().formatYesNo(def));
				
	}
}

package com.purityprotector;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class PurityProtectorPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(PurityProtectorPlugin.class);
		RuneLite.main(args);
	}
}
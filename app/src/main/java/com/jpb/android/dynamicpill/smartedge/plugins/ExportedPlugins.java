package com.jpb.android.dynamicpill.smartedge.plugins;

import com.jpb.android.dynamicpill.smartedge.plugins.BatteryPlugin.BatteryPlugin;
import com.jpb.android.dynamicpill.smartedge.plugins.MediaSession.MediaSessionPlugin;
import com.jpb.android.dynamicpill.smartedge.plugins.Notification.NotificationPlugin;

import java.util.ArrayList;

public class ExportedPlugins {
    public static ArrayList<BasePlugin> getPlugins() {
        ArrayList<BasePlugin> plugins = new ArrayList<>();
        plugins.add(new MediaSessionPlugin());
        plugins.add(new NotificationPlugin());
        plugins.add(new BatteryPlugin());
        return plugins;
    }
}

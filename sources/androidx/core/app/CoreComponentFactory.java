package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;

public class CoreComponentFactory extends AppComponentFactory {
    public Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        return super.instantiateActivity(classLoader, str, intent);
    }

    public Application instantiateApplication(ClassLoader classLoader, String str) {
        return super.instantiateApplication(classLoader, str);
    }

    public ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        return super.instantiateProvider(classLoader, str);
    }

    public BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        return super.instantiateReceiver(classLoader, str, intent);
    }

    public Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        return super.instantiateService(classLoader, str, intent);
    }
}

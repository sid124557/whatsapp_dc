package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7MM  reason: invalid class name */
public class AnonymousClass7MM {
    public final Context A00;
    public final SharedPreferences A01;
    public final C178968iO A02;
    public final AtomicBoolean A03;

    public AnonymousClass7MM(Context context, C178968iO r6, String str) {
        boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Context context2 = context;
        if (Build.VERSION.SDK_INT >= 24 && !AnonymousClass0Y8.A0B(context)) {
            context2 = AnonymousClass0Y8.A06(context);
        }
        this.A00 = context2;
        SharedPreferences sharedPreferences = context.getSharedPreferences(AnonymousClass000.A0V("com.google.firebase.common.prefs:", str, AnonymousClass001.A0o()), 0);
        this.A01 = sharedPreferences;
        this.A02 = r6;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                Context context3 = this.A00;
                PackageManager packageManager = context3.getPackageManager();
                if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context3.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled"))) {
                    z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            z = true;
        }
        this.A03 = new AtomicBoolean(z);
    }
}

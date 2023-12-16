package X;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import androidx.multidex.MultiDex;
import com.whatsapp.AbstractAppShellDelegate;
import com.whatsapp.ApplicationLike;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.0xE  reason: invalid class name and case insensitive filesystem */
public class C18370xE extends Application implements C16120sV {
    public static final C58652vb appStartStat = C58652vb.A03;
    public ApplicationLike delegate;
    public volatile C18570xu waResourcesWrapper;

    private void configureCrashLogging(Context context) {
        Thread.setDefaultUncaughtExceptionHandler(new C71793cg(context, this));
    }

    public Resources getResources() {
        if (Boolean.TRUE.equals(C626936e.A01)) {
            return super.getResources();
        }
        if (this.waResourcesWrapper == null) {
            synchronized (this) {
                if (this.waResourcesWrapper == null) {
                    this.waResourcesWrapper = C18570xu.A02(super.getResources(), C389229y.A01(this).BsW());
                }
            }
        }
        return this.waResourcesWrapper;
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        C626936e.A01 = true;
        File A0A = AnonymousClass002.A0A(getFilesDir(), "Logs");
        if (!AnonymousClass0IR.A00((Object) null, A0A, Log.logDirRef)) {
            throw AnonymousClass001.A0e("log application context already assigned");
        }
        Log.logFile = AnonymousClass002.A0A(A0A, "whatsapp.log");
        Log.logTempFile = AnonymousClass002.A0A(A0A, "whatsapp.tmp");
        Log.logFileLatch.countDown();
        Log.level = 4;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("==== logfile version=");
        A0o.append("2.23.26.14");
        A0o.append(" level=");
        A0o.append(4);
        Log.log("LL_I ", AnonymousClass000.A0X("====", A0o));
        MultiDex.A01(this);
        configureCrashLogging(this);
    }

    public ApplicationLike createDelegate() {
        if (AnonymousClass322.A01(this)) {
            return new SecondaryProcessAbstractAppShellDelegate(this);
        }
        return new AbstractAppShellDelegate(this, appStartStat);
    }

    public C04320Nt getWorkManagerConfiguration() {
        return (C04320Nt) C72343dZ.A00(C389229y.A01(this).AcK.A00.A9o).get();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ApplicationLike applicationLike = this.delegate;
        C626936e.A06(applicationLike);
        applicationLike.onConfigurationChanged(configuration);
    }

    public void onCreate() {
        super.onCreate();
        ApplicationLike createDelegate = createDelegate();
        this.delegate = createDelegate;
        createDelegate.onCreate();
    }

    public void sendBroadcast(Intent intent, String str, Bundle bundle) {
        C621633u.A02(intent);
        super.sendBroadcast(intent, str, bundle);
    }

    public void sendOrderedBroadcast(Intent intent, String str, Bundle bundle) {
        C621633u.A02(intent);
        super.sendOrderedBroadcast(intent, str, bundle);
    }

    public void startActivity(Intent intent) {
        C621633u.A03(intent);
        super.startActivity(intent);
    }

    public void sendBroadcast(Intent intent, String str) {
        C621633u.A02(intent);
        super.sendBroadcast(intent, str);
    }

    public void sendOrderedBroadcast(Intent intent, String str) {
        C621633u.A02(intent);
        super.sendOrderedBroadcast(intent, str);
    }

    public void sendBroadcast(Intent intent) {
        C621633u.A02(intent);
        super.sendBroadcast(intent);
    }

    public void sendOrderedBroadcast(Intent intent, String str, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str2, Bundle bundle) {
        C621633u.A02(intent);
        super.sendOrderedBroadcast(intent, str, broadcastReceiver, handler, i, str2, bundle);
    }

    public void sendOrderedBroadcast(Intent intent, int i, String str, String str2, BroadcastReceiver broadcastReceiver, Handler handler, String str3, Bundle bundle, Bundle bundle2) {
        C621633u.A02(intent);
        super.sendOrderedBroadcast(intent, i, str, str2, broadcastReceiver, handler, str3, bundle, bundle2);
    }

    public void sendOrderedBroadcast(Intent intent, String str, Bundle bundle, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str2, Bundle bundle2) {
        C621633u.A02(intent);
        super.sendOrderedBroadcast(intent, str, bundle, broadcastReceiver, handler, i, str2, bundle2);
    }

    public void sendOrderedBroadcast(Intent intent, String str, String str2, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str3, Bundle bundle) {
        C621633u.A02(intent);
        super.sendOrderedBroadcast(intent, str, str2, broadcastReceiver, handler, i, str3, bundle);
    }
}

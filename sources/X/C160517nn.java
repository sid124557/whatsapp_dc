package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.7nn  reason: invalid class name and case insensitive filesystem */
public class C160517nn {
    public static final Object A01 = AnonymousClass002.A0D();
    public static volatile C160517nn A02;
    public ConcurrentHashMap A00 = AnonymousClass0x9.A1D();

    public static C160517nn A00() {
        if (A02 == null) {
            synchronized (A01) {
                if (A02 == null) {
                    A02 = new C160517nn();
                }
            }
        }
        C160517nn r0 = A02;
        C162177rO.A02(r0);
        return r0;
    }

    public void A01(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof C178428hW)) {
            ConcurrentHashMap concurrentHashMap = this.A00;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    public final boolean A02(Context context, Intent intent, ServiceConnection serviceConnection, String str, int i) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            try {
                if ((C159987mq.A00(context).A00.getPackageManager().getApplicationInfo(component.getPackageName(), 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof C178428hW) {
            return context.bindService(intent, serviceConnection, i);
        }
        ConcurrentHashMap concurrentHashMap = this.A00;
        Object putIfAbsent = concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (!(putIfAbsent == null || serviceConnection == putIfAbsent)) {
            Object[] A1X = AnonymousClass0x9.A1X();
            C18280x3.A19(serviceConnection, str, A1X);
            A1X[2] = intent.getAction();
            AnonymousClass6C8.A1B("Duplicate binding with the same ServiceConnection: %s, %s, %s.", "ConnectionTracker", A1X);
        }
        try {
            boolean bindService = context.bindService(intent, serviceConnection, i);
            if (!bindService) {
                return false;
            }
            return bindService;
        } finally {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
        }
    }
}

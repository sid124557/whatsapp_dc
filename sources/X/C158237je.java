package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7je  reason: invalid class name and case insensitive filesystem */
public class C158237je {
    public static final long A0F = TimeUnit.DAYS.toMillis(366);
    public static final Object A0G = AnonymousClass002.A0D();
    public static volatile ScheduledExecutorService A0H;
    public int A00 = 0;
    public int A01;
    public long A02;
    public WorkSource A03;
    public C178448hY A04 = C1695689u.A00;
    public AnonymousClass8KY A05;
    public Future A06;
    public AtomicInteger A07 = new AtomicInteger(0);
    public final Context A08;
    public final PowerManager.WakeLock A09;
    public final Object A0A = AnonymousClass002.A0D();
    public final String A0B;
    public final Map A0C = AnonymousClass001.A0t();
    public final Set A0D = AnonymousClass002.A0K();
    public final ScheduledExecutorService A0E;

    public C158237je(Context context) {
        Object[] objArr;
        String packageName = context.getPackageName();
        C162177rO.A07("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        this.A08 = context.getApplicationContext();
        this.A05 = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf("wake:com.google.firebase.iid.WakeLockHolder");
            this.A0B = AnonymousClass6C7.A0k("*gcore*:", valueOf, valueOf.length());
        } else {
            this.A0B = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            this.A09 = newWakeLock;
            if (context.getPackageManager() != null) {
                if (C159987mq.A00(context).A00.getPackageManager().checkPermission("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) == 0) {
                    packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
                    WorkSource workSource = null;
                    if (!(context.getPackageManager() == null || packageName == null)) {
                        try {
                            ApplicationInfo applicationInfo = C159987mq.A00(context).A00.getPackageManager().getApplicationInfo(packageName, 0);
                            if (applicationInfo == null) {
                                AnonymousClass6C9.A14("Could not get applicationInfo from package: ", packageName, "WorkSourceUtil");
                            } else {
                                int i = applicationInfo.uid;
                                workSource = new WorkSource();
                                Method method = C159947mj.A01;
                                if (method != null) {
                                    try {
                                        objArr = new Object[2];
                                        AnonymousClass000.A1P(objArr, i, 0);
                                        objArr[1] = packageName;
                                    } catch (Exception e) {
                                        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                                    }
                                } else {
                                    method = C159947mj.A00;
                                    if (method != null) {
                                        objArr = new Object[1];
                                        AnonymousClass000.A1P(objArr, i, 0);
                                    }
                                }
                                method.invoke(workSource, objArr);
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                            AnonymousClass6C9.A14("Could not find package: ", packageName, "WorkSourceUtil");
                        }
                    }
                    this.A03 = workSource;
                    if (workSource != null) {
                        try {
                            newWakeLock.setWorkSource(workSource);
                        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e2) {
                            Log.wtf("WakeLock", e2.toString());
                        }
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = A0H;
            if (scheduledExecutorService == null) {
                synchronized (A0G) {
                    scheduledExecutorService = A0H;
                    if (scheduledExecutorService == null) {
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        A0H = scheduledExecutorService;
                    }
                }
            }
            this.A0E = scheduledExecutorService;
            return;
        }
        StringBuilder A0Y = AnonymousClass6CA.A0Y(29);
        A0Y.append("expected a non-null reference", 0, 29);
        throw new AnonymousClass8RW(A0Y.toString());
    }

    public final void A00() {
        synchronized (this.A0A) {
            if (A01()) {
                int i = this.A00 - 1;
                this.A00 = i;
                if (i <= 0) {
                    Set set = this.A0D;
                    if (!set.isEmpty()) {
                        ArrayList A0J = AnonymousClass002.A0J(set);
                        set.clear();
                        if (A0J.size() > 0) {
                            A0J.get(0);
                            throw null;
                        }
                    }
                    Map map = this.A0C;
                    Iterator A0v = AnonymousClass001.A0v(map);
                    while (A0v.hasNext()) {
                        ((C155757fS) A0v.next()).A00 = 0;
                    }
                    map.clear();
                    Future future = this.A06;
                    if (future != null) {
                        future.cancel(false);
                        this.A06 = null;
                        this.A02 = 0;
                    }
                    this.A01 = 0;
                    PowerManager.WakeLock wakeLock = this.A09;
                    if (wakeLock.isHeld()) {
                        try {
                            wakeLock.release();
                            if (this.A05 != null) {
                                this.A05 = null;
                            }
                        } catch (RuntimeException e) {
                            if (e.getClass().equals(RuntimeException.class)) {
                                Log.e("WakeLock", String.valueOf(this.A0B).concat(" failed to release!"), e);
                                if (this.A05 != null) {
                                    this.A05 = null;
                                }
                            } else {
                                throw e;
                            }
                        } catch (Throwable th) {
                            if (this.A05 != null) {
                                this.A05 = null;
                            }
                            throw th;
                        }
                    } else {
                        AnonymousClass6C9.A14(String.valueOf(this.A0B), " should be held!", "WakeLock");
                    }
                }
            }
        }
    }

    public boolean A01() {
        boolean A1W;
        synchronized (this.A0A) {
            A1W = AnonymousClass001.A1W(this.A00);
        }
        return A1W;
    }
}

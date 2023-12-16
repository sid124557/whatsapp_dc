package X;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
/* renamed from: X.00W  reason: invalid class name */
public abstract class AnonymousClass00W extends Service {
    public static final Object A05 = AnonymousClass002.A0D();
    public static final HashMap A06 = AnonymousClass001.A0t();
    public AnonymousClass01S A00;
    public C16530tY A01;
    public AnonymousClass0QS A02;
    public boolean A03 = false;
    public final ArrayList A04;

    public abstract void A08(Intent intent);

    public static void A00(Context context, Intent intent, Class cls, int i) {
        ComponentName componentName = new ComponentName(context, cls);
        if (intent != null) {
            synchronized (A05) {
                HashMap hashMap = A06;
                AnonymousClass0QS r0 = (AnonymousClass0QS) hashMap.get(componentName);
                if (r0 == null) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        r0 = new C004905d(componentName, context, i);
                    } else {
                        r0 = new C005005e(componentName, context);
                    }
                    hashMap.put(componentName, r0);
                }
                r0.A03(i);
                r0.A04(intent);
            }
            return;
        }
        throw AnonymousClass001.A0c("work must not be null");
    }

    public C16540tZ A04() {
        C16530tY r0 = this.A01;
        if (r0 != null) {
            return r0.B1X();
        }
        ArrayList arrayList = this.A04;
        synchronized (arrayList) {
            if (arrayList.size() <= 0) {
                return null;
            }
            C16540tZ r02 = (C16540tZ) arrayList.remove(0);
            return r02;
        }
    }

    public void A05() {
        ArrayList arrayList = this.A04;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.A00 = null;
                if (arrayList.size() > 0) {
                    A06(false);
                } else if (!this.A03) {
                    this.A02.A00();
                }
            }
        }
    }

    public void A06(boolean z) {
        if (this.A00 == null) {
            this.A00 = new AnonymousClass01S(this);
            AnonymousClass0QS r0 = this.A02;
            if (r0 != null && z) {
                r0.A01();
            }
            this.A00.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public boolean A07() {
        return true;
    }

    public IBinder onBind(Intent intent) {
        C16530tY r0 = this.A01;
        if (r0 != null) {
            return r0.AzE();
        }
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        ArrayList arrayList = this.A04;
        if (arrayList == null) {
            return 2;
        }
        this.A02.A02();
        synchronized (arrayList) {
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new C07850cv(intent, this, i2));
            A06(true);
        }
        return 3;
    }

    public AnonymousClass00W() {
        ArrayList A0s;
        if (Build.VERSION.SDK_INT >= 26) {
            A0s = null;
        } else {
            A0s = AnonymousClass001.A0s();
        }
        this.A04 = A0s;
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.A01 = new C000000a(this);
            this.A02 = null;
            return;
        }
        this.A01 = null;
        ComponentName componentName = new ComponentName(this, getClass());
        HashMap hashMap = A06;
        AnonymousClass0QS r0 = (AnonymousClass0QS) hashMap.get(componentName);
        if (r0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                throw AnonymousClass001.A0c("Can't be here without a job id");
            }
            r0 = new C005005e(componentName, this);
            hashMap.put(componentName, r0);
        }
        this.A02 = r0;
    }

    public void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.A04;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.A03 = true;
                this.A02.A00();
            }
        }
    }
}

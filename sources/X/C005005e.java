package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;

/* renamed from: X.05e  reason: invalid class name and case insensitive filesystem */
public final class C005005e extends AnonymousClass0QS {
    public boolean A00;
    public boolean A01;
    public final Context A02;
    public final PowerManager.WakeLock A03;
    public final PowerManager.WakeLock A04;

    public void A00() {
        synchronized (this) {
            if (this.A01) {
                if (this.A00) {
                    this.A03.acquire(60000);
                }
                this.A01 = false;
                this.A04.release();
            }
        }
    }

    public void A01() {
        synchronized (this) {
            if (!this.A01) {
                this.A01 = true;
                this.A04.acquire(600000);
                this.A03.release();
            }
        }
    }

    public void A02() {
        synchronized (this) {
            this.A00 = false;
        }
    }

    public void A04(Intent intent) {
        Intent intent2 = new Intent(intent);
        intent2.setComponent(this.A02);
        if (this.A02.startService(intent2) != null) {
            synchronized (this) {
                if (!this.A00) {
                    this.A00 = true;
                    if (!this.A01) {
                        this.A03.acquire(60000);
                    }
                }
            }
        }
    }

    public C005005e(ComponentName componentName, Context context) {
        super(componentName);
        this.A02 = context.getApplicationContext();
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(componentName.getClassName());
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, AnonymousClass000.A0X(":launch", A0o));
        this.A03 = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append(componentName.getClassName());
        PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, AnonymousClass000.A0X(":run", A0o2));
        this.A04 = newWakeLock2;
        newWakeLock2.setReferenceCounted(false);
    }
}

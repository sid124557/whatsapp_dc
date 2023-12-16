package X;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* renamed from: X.0QQ  reason: invalid class name */
public abstract class AnonymousClass0QQ {
    public BroadcastReceiver A00;
    public final /* synthetic */ AnonymousClass040 A01;

    public abstract int A00();

    public abstract IntentFilter A01();

    public abstract void A04();

    public AnonymousClass0QQ(AnonymousClass040 r1) {
        this.A01 = r1;
    }

    public void A02() {
        BroadcastReceiver broadcastReceiver = this.A00;
        if (broadcastReceiver != null) {
            try {
                this.A01.A0i.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
            this.A00 = null;
        }
    }

    public void A03() {
        A02();
        IntentFilter A012 = A01();
        if (A012.countActions() != 0) {
            BroadcastReceiver broadcastReceiver = this.A00;
            if (broadcastReceiver == null) {
                broadcastReceiver = new C17480ve(this, 0);
                this.A00 = broadcastReceiver;
            }
            this.A01.A0i.registerReceiver(broadcastReceiver, A012);
        }
    }
}

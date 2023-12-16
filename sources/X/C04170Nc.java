package X;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* renamed from: X.0Nc  reason: invalid class name and case insensitive filesystem */
public final class C04170Nc {
    public boolean A00;
    public boolean A01;
    public final BroadcastReceiver A02;
    public final IntentFilter A03;

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("Receiver{");
        sb.append(this.A02);
        sb.append(" filter=");
        sb.append(this.A03);
        if (this.A01) {
            sb.append(" DEAD");
        }
        return AnonymousClass000.A0g(sb);
    }

    public C04170Nc(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.A03 = intentFilter;
        this.A02 = broadcastReceiver;
    }
}

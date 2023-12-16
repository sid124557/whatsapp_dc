package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.IGmsServiceBroker;

/* renamed from: X.7sf  reason: invalid class name and case insensitive filesystem */
public final class C162737sf implements ServiceConnection {
    public final int A00;
    public final /* synthetic */ C160847oP A01;

    public C162737sf(C160847oP r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IGmsServiceBroker r1;
        int i;
        int i2;
        C160847oP r5 = this.A01;
        if (iBinder == null) {
            synchronized (r5.A0M) {
                i = r5.A02;
            }
            if (i == 3) {
                r5.A0D = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            Handler handler = r5.A0G;
            handler.sendMessage(handler.obtainMessage(i2, r5.A0C.get(), 16));
            return;
        }
        synchronized (r5.A0N) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IGmsServiceBroker)) {
                r1 = new C1694989n(iBinder);
            } else {
                r1 = (IGmsServiceBroker) queryLocalInterface;
            }
            r5.A09 = r1;
        }
        int i3 = this.A00;
        Handler handler2 = r5.A0G;
        handler2.sendMessage(handler2.obtainMessage(7, i3, -1, new AnonymousClass6UG(r5, 0)));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C160847oP r2 = this.A01;
        synchronized (r2.A0N) {
            r2.A09 = null;
        }
        Handler handler = r2.A0G;
        handler.sendMessage(handler.obtainMessage(6, this.A00, 1));
    }
}

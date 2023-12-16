package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: X.6Dv  reason: invalid class name and case insensitive filesystem */
public final class C124776Dv extends Handler {
    public boolean A00;
    public final C162697sb A01 = new C162697sb();
    public final /* synthetic */ AnonymousClass6CW A02;

    public final synchronized void A00(String str) {
        if (this.A00) {
            if (Log.isLoggable("WearableLS", 2)) {
                String valueOf = String.valueOf(this.A02.A00);
                StringBuilder A0Y = AnonymousClass6CA.A0Y(str.length() + 17 + valueOf.length());
                A0Y.append("unbindService: ");
                A0Y.append(str);
                AnonymousClass001.A1M(A0Y);
                AnonymousClass000.A1E(valueOf, "WearableLS", A0Y);
            }
            try {
                this.A02.unbindService(this.A01);
            } catch (RuntimeException e) {
                Log.e("WearableLS", "Exception when unbinding from local service", e);
            }
            this.A00 = false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C124776Dv(Looper looper, AnonymousClass6CW r3) {
        super(looper);
        this.A02 = r3;
    }

    public final void dispatchMessage(Message message) {
        synchronized (this) {
            if (!this.A00) {
                if (Log.isLoggable("WearableLS", 2)) {
                    String valueOf = String.valueOf(this.A02.A00);
                    StringBuilder A0Y = AnonymousClass6CA.A0Y(valueOf.length() + 13);
                    A0Y.append("bindService: ");
                    AnonymousClass000.A1E(valueOf, "WearableLS", A0Y);
                }
                AnonymousClass6CW r3 = this.A02;
                r3.bindService(r3.A01, this.A01, 1);
                this.A00 = true;
            }
        }
        try {
            super.dispatchMessage(message);
        } finally {
            if (!hasMessages(0)) {
                A00("dispatch");
            }
        }
    }
}

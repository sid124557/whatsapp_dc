package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7t4  reason: invalid class name and case insensitive filesystem */
public final class C162977t4 implements Handler.Callback {
    public boolean A00 = false;
    public final Handler A01;
    public final C180918lq A02;
    public final Object A03 = AnonymousClass002.A0D();
    public final ArrayList A04 = AnonymousClass001.A0s();
    public final ArrayList A05 = AnonymousClass001.A0s();
    public final ArrayList A06 = AnonymousClass001.A0s();
    public final AtomicInteger A07 = new AtomicInteger(0);
    public volatile boolean A08 = false;

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            C183908qr r2 = (C183908qr) message.obj;
            synchronized (this.A03) {
                if (this.A08 && this.A02.isConnected() && this.A05.contains(r2)) {
                    r2.onConnected((Bundle) null);
                }
            }
            return true;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Don't know how to handle message: ");
        A0o.append(i);
        Log.wtf("GmsClientEvents", A0o.toString(), new Exception());
        return false;
    }

    public C162977t4(Looper looper, C180918lq r4) {
        this.A02 = r4;
        this.A01 = new C124806Dy(looper, this);
    }
}

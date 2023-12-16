package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* renamed from: X.0yL  reason: invalid class name and case insensitive filesystem */
public class C18840yL extends Handler {
    public HandlerThread A00;
    public C378124c A01;
    public AnonymousClass5TQ A02;

    public void handleMessage(Message message) {
        C378124c r3 = this.A01;
        r3.A00.set(Double.doubleToRawLongBits((double) this.A02.A00()));
        sendEmptyMessageDelayed(0, (long) 50);
    }

    public C18840yL(HandlerThread handlerThread, C378124c r3, AnonymousClass5TQ r4) {
        super(handlerThread.getLooper());
        this.A00 = handlerThread;
        this.A01 = r3;
        this.A02 = r4;
    }
}

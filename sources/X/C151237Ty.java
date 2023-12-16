package X;

import android.os.HandlerThread;
import android.os.Message;

/* renamed from: X.7Ty  reason: invalid class name and case insensitive filesystem */
public final class C151237Ty {
    public int A00 = 1;
    public HandlerThread A01;
    public C124736Dr A02;
    public C147437Eh A03;
    public final C147427Eg A04 = new C147427Eg(this);

    public synchronized void A00(C147437Eh r8, long j) {
        synchronized (this) {
            if (this.A02 == null) {
                this.A02 = new C124736Dr(this.A01.getLooper(), this.A04);
            }
            C626936e.A07(r8, "timerCallback cannot be null, or we are using the resources without any actual use");
            C626936e.A07(this.A02, "Handler for timer cannot be null");
            C626936e.A0F(AnonymousClass001.A1T(this.A00), "Timer is in running state, please call cancel or wait for timer to complete before starting the timer again");
            this.A03 = r8;
            this.A00 = 2;
            C124736Dr r5 = this.A02;
            Long valueOf = Long.valueOf(j);
            Message obtain = Message.obtain();
            obtain.what = 1;
            if (valueOf != null) {
                obtain.getData().putLong("TimerDuration", valueOf.longValue());
            }
            r5.sendMessage(obtain);
        }
    }

    public C151237Ty(HandlerThread handlerThread) {
        this.A01 = handlerThread;
    }
}

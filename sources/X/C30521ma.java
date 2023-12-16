package X;

import com.whatsapp.jid.DeviceJid;

/* renamed from: X.1ma  reason: invalid class name and case insensitive filesystem */
public final class C30521ma extends C624134x implements AnonymousClass48R {
    public int A00;
    public long A01;
    public DeviceJid A02;

    public C30521ma(AnonymousClass2z0 r2, long j) {
        super(r2, (byte) 77, j);
    }

    public void A1B(int i) {
        if (i != 512) {
            super.A1B(i);
        }
    }

    public final void A1v(Integer num) {
        if (num == null || num.intValue() <= 0) {
            num = C18290x4.A0Z();
        }
        this.A00 = num.intValue();
    }
}

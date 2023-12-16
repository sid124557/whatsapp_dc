package X;

import android.os.SystemClock;

/* renamed from: X.6q3  reason: invalid class name and case insensitive filesystem */
public class C138276q3 extends C173778Rq {
    public final /* synthetic */ AnonymousClass7X7 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138276q3(AnonymousClass7X7 r2) {
        super("CameraQRCodeProcessor");
        this.A00 = r2;
    }

    public void run() {
        int i;
        int i2;
        C151757We r3;
        while (true) {
            AnonymousClass7X7 r2 = this.A00;
            if (r2.A07) {
                try {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    AnonymousClass7KX B3t = r2.A06.B3t();
                    if (B3t != null) {
                        byte[] bArr = B3t.A02;
                        int i3 = B3t.A01;
                        int i4 = B3t.A00;
                        if (i3 < 320) {
                            i = i3;
                        } else {
                            i = (i3 * 3) / 4;
                        }
                        if (i4 < 320) {
                            i2 = i4;
                        } else {
                            i2 = (i4 * 3) / 4;
                        }
                        try {
                            r3 = r2.A04.A00(new C151607Vl(new C130886ch(new C130906cj(bArr, i3, i4, (i3 - i) / 2, (i4 - i2) / 2, i, i2))), r2.A02);
                        } catch (C143846zZ unused) {
                            r3 = null;
                        }
                        if (r2.A07) {
                            synchronized (r2) {
                                if (r3 != null) {
                                    C151757We r0 = r2.A00;
                                    if (r0 == null || !r0.A02.equals(r3.A02)) {
                                        r2.A00 = r3;
                                        r2.A05.BX1(r3);
                                    }
                                }
                            }
                        }
                    }
                    long uptimeMillis2 = ((long) (1000 / r2.A03)) - (SystemClock.uptimeMillis() - uptimeMillis);
                    if (r2.A07 && uptimeMillis2 > 0) {
                        Thread.sleep(uptimeMillis2);
                    }
                } catch (InterruptedException unused2) {
                }
            } else {
                return;
            }
        }
    }
}

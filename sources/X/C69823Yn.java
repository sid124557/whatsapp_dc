package X;

import java.io.Closeable;

/* renamed from: X.3Yn  reason: invalid class name and case insensitive filesystem */
public class C69823Yn implements Closeable {
    public boolean A00;
    public final C55902r6 A01;

    public void close() {
        boolean z;
        C55902r6 r0;
        AnonymousClass37I r2;
        synchronized (this) {
            z = false;
            if (!this.A00) {
                z = true;
                this.A00 = true;
            }
        }
        if (z) {
            C55902r6 r3 = this.A01;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("svc-client/onSessionClosed; service=");
            String A0X = AnonymousClass000.A0X("GoogleMigrateClient", A0o);
            if (this instanceof C32481qh) {
                r0 = ((C32481qh) this).A00;
            } else {
                r0 = r3;
            }
            if (r0 == r3) {
                synchronized (r3) {
                    StringBuilder A0l = AnonymousClass000.A0l(A0X);
                    A0l.append(", ref_cnt=");
                    C18260x0.A1F(A0l, r3.A00);
                    int i = r3.A00;
                    if (i <= 0) {
                        C18260x0.A0x(", imbalanced ref_cnt=", AnonymousClass000.A0l(A0X), i);
                        C55682qk r5 = r3.A05;
                        StringBuilder A0o2 = AnonymousClass001.A0o();
                        A0o2.append("name=");
                        A0o2.append("GoogleMigrateClient");
                        A0o2.append(", counter=");
                        r5.A0A("svc-client-reference-counter-imbalance", false, AnonymousClass000.A0h(A0o2, r3.A00));
                        r3.A00 = 0;
                    } else {
                        int i2 = i - 1;
                        r3.A00 = i2;
                        C18260x0.A0w(", ref_cnt=", AnonymousClass000.A0l(A0X), i2);
                    }
                    r2 = null;
                    if (r3.A00 == 0) {
                        C18260x0.A1J(AnonymousClass000.A0l(A0X), ", last session is closed");
                        AnonymousClass37I r02 = r3.A01;
                        r3.A01 = null;
                        r2 = r02;
                    }
                }
                if (r2 != null) {
                    r2.A01(false);
                    return;
                }
                return;
            }
            StringBuilder A0o3 = AnonymousClass001.A0o();
            A0o3.append("A session from a different client has been provided. Client: ");
            throw AnonymousClass000.A0F("GoogleMigrateClient", A0o3);
        }
    }

    public C69823Yn(C55902r6 r1) {
        this.A01 = r1;
    }
}

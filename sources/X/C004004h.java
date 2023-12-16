package X;

import java.util.concurrent.Executor;

/* renamed from: X.04h  reason: invalid class name and case insensitive filesystem */
public class C004004h extends C04530Oq {
    public static final Executor A02 = new C18010wb(0);
    public static volatile C004004h A03;
    public C04530Oq A00;
    public C04530Oq A01;

    public static C004004h A00() {
        if (A03 == null) {
            synchronized (C004004h.class) {
                if (A03 == null) {
                    A03 = new C004004h();
                }
            }
        }
        return A03;
    }

    public void A01(Runnable runnable) {
        this.A01.A01(runnable);
    }

    public void A02(Runnable runnable) {
        this.A01.A02(runnable);
    }

    public boolean A03() {
        return this.A01.A03();
    }

    public C004004h() {
        C003904g r0 = new C003904g();
        this.A00 = r0;
        this.A01 = r0;
    }
}

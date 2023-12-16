package X;

import android.content.DialogInterface;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.08S  reason: invalid class name */
public class AnonymousClass08S extends C05550Ty {
    public int A00 = 0;
    public int A01 = 0;
    public DialogInterface.OnClickListener A02;
    public AnonymousClass0NM A03;
    public C04550Os A04;
    public C06190Wp A05;
    public AnonymousClass0MY A06;
    public C03680Ld A07;
    public AnonymousClass08M A08;
    public AnonymousClass08M A09;
    public AnonymousClass08M A0A;
    public AnonymousClass08M A0B;
    public AnonymousClass08M A0C;
    public AnonymousClass08M A0D;
    public AnonymousClass08M A0E;
    public AnonymousClass08M A0F;
    public CharSequence A0G;
    public Executor A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L = true;
    public boolean A0M;
    public boolean A0N;

    public int A0D() {
        AnonymousClass0MY r2 = this.A06;
        if (r2 == null) {
            return 0;
        }
        C06190Wp r0 = this.A05;
        int i = r2.A00;
        if (i != 0) {
            return i;
        }
        int i2 = 255;
        if (r0 != null) {
            i2 = 15;
        }
        if (r2.A05) {
            return i2 | 32768;
        }
        return i2;
    }

    public void A0E(int i) {
        AnonymousClass08M r1 = this.A0C;
        if (r1 == null) {
            r1 = AnonymousClass08M.A01();
            this.A0C = r1;
        }
        A00(r1, Integer.valueOf(i));
    }

    public void A0F(CharSequence charSequence) {
        AnonymousClass08M r0 = this.A0B;
        if (r0 == null) {
            r0 = AnonymousClass08M.A01();
            this.A0B = r0;
        }
        A00(r0, charSequence);
    }

    public void A0G(boolean z) {
        AnonymousClass08M r1 = this.A0F;
        if (r1 == null) {
            r1 = AnonymousClass08M.A01();
            this.A0F = r1;
        }
        A00(r1, Boolean.valueOf(z));
    }

    public static void A00(AnonymousClass08M r2, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            r2.A0H(obj);
        } else {
            r2.A0G(obj);
        }
    }
}

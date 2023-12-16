package X;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Timer;

/* renamed from: X.331  reason: invalid class name */
public class AnonymousClass331 {
    public static final HashMap A0M = AnonymousClass001.A0t();
    public boolean A00;
    public boolean A01;
    public byte[] A02;
    public byte[] A03;
    public final long A04 = SystemClock.elapsedRealtime();
    public final C69263Wi A05;
    public final C56972sr A06;
    public final C64773Ex A07;
    public final C29421in A08;
    public final C56332ro A09;
    public final C55052pi A0A;
    public final C56612sH A0B;
    public final C66543Lv A0C;
    public final C56892sj A0D;
    public final C56152rV A0E;
    public final AnonymousClass4FV A0F;
    public final C95814uZ A0G;
    public final C73443fV A0H;
    public final C56452s0 A0I;
    public final C56832sd A0J;
    public final Long A0K;
    public final boolean A0L;

    public static boolean A00(C95814uZ r3) {
        if (r3 != null) {
            Iterator A10 = C18290x4.A10(A0M);
            while (A10.hasNext()) {
                if (r3.equals(((AnonymousClass331) A10.next()).A0G)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void A01(int i) {
        int length;
        AnonymousClass1Z6 r4 = new AnonymousClass1Z6();
        byte[] bArr = this.A02;
        int i2 = 0;
        if (bArr == null) {
            length = 0;
        } else {
            length = bArr.length;
        }
        byte[] bArr2 = this.A03;
        if (bArr2 != null) {
            i2 = bArr2.length;
        }
        r4.A01 = Double.valueOf((double) (length + i2));
        r4.A03 = C18310x6.A0f(SystemClock.elapsedRealtime(), this.A04);
        r4.A02 = Integer.valueOf(i);
        r4.A00 = Boolean.valueOf(this.A0L);
        this.A0F.BhB(r4);
    }

    public final void A02(C95814uZ r3) {
        this.A0A.A06.A04(this.A07.A0A(r3));
        this.A08.A08(r3);
    }

    public AnonymousClass331(C69263Wi r5, C56972sr r6, C64773Ex r7, C29421in r8, C56332ro r9, C55052pi r10, C56612sH r11, C66543Lv r12, C56892sj r13, C56152rV r14, AnonymousClass4FV r15, C95814uZ r16, C56452s0 r17, C56832sd r18, byte[] bArr, byte[] bArr2, boolean z) {
        this.A0B = r11;
        this.A05 = r5;
        this.A06 = r6;
        this.A0F = r15;
        this.A07 = r7;
        this.A08 = r8;
        this.A0E = r14;
        this.A09 = r9;
        this.A0A = r10;
        this.A0I = r17;
        this.A0J = r18;
        this.A0C = r12;
        this.A0D = r13;
        this.A0G = r16;
        this.A02 = bArr;
        this.A03 = bArr2;
        this.A0L = z;
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.A0K = valueOf;
        A0M.put(valueOf.toString(), this);
        C73443fV r3 = new C73443fV(this);
        this.A0H = r3;
        new Timer().schedule(r3, 32000);
    }
}

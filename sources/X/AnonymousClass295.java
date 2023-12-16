package X;

import java.io.File;

/* renamed from: X.295  reason: invalid class name */
public final class AnonymousClass295 {
    public static final AnonymousClass39M A00(C56352rq r24, C55732qp r25, AnonymousClass2UB r26) {
        AnonymousClass2UB r2 = r26;
        C162457s7.A0J(r2, 0);
        C56352rq r0 = r24;
        C55732qp r1 = r25;
        C18270x1.A10(r1, 1, r0);
        String str = r2.A0D;
        File A02 = r0.A02(str);
        if (!A02.exists()) {
            return null;
        }
        AnonymousClass39M r7 = new AnonymousClass39M((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, false, false, false, false, false);
        r7.A0D = str;
        AnonymousClass39M.A01(r7, A02);
        r7.A01 = 1;
        r7.A0G = r2.A0G;
        r7.A08 = r2.A0C;
        r7.A06 = r2.A0B;
        r7.A0C = r2.A0F;
        r7.A0B = r2.A0E;
        r7.A00 = r2.A07;
        r7.A03 = r2.A09;
        r7.A02 = r2.A08;
        r7.A07 = r2.A01;
        r7.A0K = r2.A05;
        r7.A0A = r2.A02;
        r7.A05 = r2.A00;
        r7.A0L = r2.A06;
        r1.A04(r7);
        return r7;
    }
}

package X;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* renamed from: X.7JP  reason: invalid class name */
public class AnonymousClass7JP {
    public int A00;
    public long A01;
    public C1684785o A02;

    public AnonymousClass7JP(Context context, C180608lL r19, C158667kM r20, C147747Fo r21, C150307Qc r22, AnonymousClass7QR r23, String str, ExecutorService executorService) {
        AnonymousClass7RH r0;
        int i;
        C1684785o r8 = new C1684785o(context, r19, r20, r21, r22, r23, str, executorService);
        this.A02 = r8;
        AnonymousClass7RI r1 = new AnonymousClass7RI();
        r8.A00 = r1;
        C147787Fs r2 = r8.A08.A08;
        if (r2.A01 == null) {
            C141016ut[] values = C141016ut.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                C141016ut r12 = values[i2];
                if (r12 == C141016ut.HE) {
                    i2++;
                } else {
                    String obj = r12.toString();
                    if ("lc".equalsIgnoreCase(obj)) {
                        i = 2;
                    } else if ("main".equalsIgnoreCase(obj)) {
                        i = 1;
                    } else if ("ssr".equalsIgnoreCase(obj)) {
                        i = 3;
                    } else if ("he".equalsIgnoreCase(obj)) {
                        i = 5;
                    } else {
                        r0 = null;
                        r2.A01 = r0;
                        r8.A00.A00(r2);
                    }
                    r0 = new AnonymousClass7RH(i);
                    r2.A01 = r0;
                    r8.A00.A00(r2);
                }
            }
        } else {
            r1.A00(r2);
        }
        C158667kM r24 = r8.A06;
        String str2 = null;
        try {
            str2 = r8.A00.A00.A04.getName();
        } catch (IllegalStateException unused) {
        }
        r24.A0E = str2;
        this.A02.BpW((C160227nH) null, 5);
        this.A00 = 4;
        this.A01 = 0;
    }
}

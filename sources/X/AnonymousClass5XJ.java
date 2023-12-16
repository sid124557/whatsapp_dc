package X;

import android.view.View;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5XJ  reason: invalid class name */
public final class AnonymousClass5XJ {
    public static final long A0F = TimeUnit.DAYS.toMillis(14);
    public static final List A0G = C18290x4.A12(C141346vQ.A02);
    public View A00;
    public View A01;
    public C85474Gj A02;
    public boolean A03;
    public final AnonymousClass08M A04;
    public final C15930sC A05;
    public final C106155Xv A06;
    public final C102565Ji A07;
    public final C56612sH A08;
    public final AnonymousClass1VX A09;
    public final AnonymousClass107 A0A;
    public final C187958y5 A0B;
    public final Map A0C;
    public final AnonymousClass4C6 A0D;
    public final boolean A0E;

    public final void A00(C158527k7 r3) {
        if (this.A03) {
            AnonymousClass107 r1 = this.A0A;
            if (!C86614Ku.A1W(r1, r3)) {
                r1.A0H(r3);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r1 == false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (r6.self.A06 == 1) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(com.whatsapp.voipcalling.CallInfo r6) {
        /*
            r5 = this;
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x003b
            X.1VX r1 = r5.A09
            X.8y5 r0 = r5.A0B
            boolean r2 = X.C107215at.A06(r1, r0, r6)
            com.whatsapp.voipcalling.CallState r1 = r6.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 != r0) goto L_0x003c
            boolean r0 = r6.isSelfRequestingUpgrade()
            if (r0 != 0) goto L_0x003c
            X.5Lb r0 = r6.self
            int r0 = r0.A06
            r1 = 1
            if (r0 != r1) goto L_0x003c
        L_0x001f:
            X.107 r0 = r5.A0A
            java.lang.Object r0 = X.C86634Kw.A0v(r0)
            X.7k7 r0 = (X.C158527k7) r0
            if (r2 == 0) goto L_0x002c
            r4 = 1
            if (r1 != 0) goto L_0x002d
        L_0x002c:
            r4 = 0
        L_0x002d:
            boolean r3 = r0.A02
            int r2 = r0.A01
            float r1 = r0.A00
            X.7k7 r0 = new X.7k7
            r0.<init>(r1, r2, r3, r4)
            r5.A00(r0)
        L_0x003b:
            return
        L_0x003c:
            r1 = 0
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5XJ.A01(com.whatsapp.voipcalling.CallInfo):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0031, code lost:
        if (r5 != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5XJ(android.content.Context r7, X.C106155Xv r8, X.C620633i r9, X.C56612sH r10, X.C620733j r11, X.AnonymousClass1VX r12, X.C187958y5 r13, X.AnonymousClass4C6 r14) {
        /*
            r6 = this;
            X.C18260x0.A0e(r9, r11, r10, r12)
            X.C18260x0.A0U(r13, r8)
            r6.<init>()
            r6.A08 = r10
            r6.A09 = r12
            r6.A0B = r13
            r6.A06 = r8
            r6.A0D = r14
            r0 = 6399(0x18ff, float:8.967E-42)
            boolean r5 = r12.A0X(r0)
            r6.A0E = r5
            long r3 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r1 = r8.A03()
            java.lang.String r0 = "tooltip_last_shown_ms"
            long r0 = X.AnonymousClass0x2.A0B(r1, r0)
            long r3 = r3 - r0
            long r1 = A0F
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0033
            r0 = 0
            if (r5 == 0) goto L_0x0034
        L_0x0033:
            r0 = 1
        L_0x0034:
            r6.A03 = r0
            X.6vQ r1 = X.C141346vQ.A02
            X.8Vr r0 = new X.8Vr
            r0.<init>(r6)
            X.66R r0 = X.C154517dI.A01(r0)
            java.util.Map r0 = X.C57692u3.A04(r1, r0)
            r6.A0C = r0
            X.5Ji r0 = new X.5Ji
            r0.<init>(r7, r9, r11)
            r6.A07 = r0
            r2 = 0
            r1 = 0
            X.7k7 r0 = new X.7k7
            r0.<init>(r1, r2, r2, r2)
            X.107 r1 = X.AnonymousClass4L0.A0O(r0)
            r6.A0A = r1
            X.08M r0 = X.AnonymousClass08M.A01()
            r6.A04 = r0
            r0 = 66
            X.6C6 r0 = X.AnonymousClass6C6.A00(r6, r0)
            r6.A05 = r0
            r1.A0E(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5XJ.<init>(android.content.Context, X.5Xv, X.33i, X.2sH, X.33j, X.1VX, X.8y5, X.4C6):void");
    }
}

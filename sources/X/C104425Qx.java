package X;

import android.graphics.RectF;
import android.os.Handler;
import android.os.Vibrator;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.Map;

/* renamed from: X.5Qx  reason: invalid class name and case insensitive filesystem */
public class C104425Qx {
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public RectF A02 = AnonymousClass002.A07();
    public Vibrator A03;
    public C105425Uw A04;
    public Map A05 = AnonymousClass001.A0t();
    public boolean A06 = false;
    public boolean A07 = false;
    public final float A08;
    public final Handler A09;
    public final ViewGroup A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        if (r5 == 2) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float A00(android.graphics.PointF r11, X.C105425Uw r12, float r13) {
        /*
            r10 = this;
            X.5Uw r0 = r10.A04
            if (r0 == r12) goto L_0x0009
            r10.A04 = r12
            r10.A01()
        L_0x0009:
            java.util.Map r4 = r10.A05
            r0 = 3
            java.lang.Object r3 = X.AnonymousClass001.A0i(r4, r0)
            X.4v4 r3 = (X.C95914v4) r3
            float r5 = r12.A00
            boolean r2 = r3.A03
            r1 = -1
            if (r2 == 0) goto L_0x0058
            float r6 = r3.A00
            float r6 = r6 + r13
            int r0 = X.C95914v4.A00(r6)
            if (r0 == r1) goto L_0x004e
            r3.A00 = r6
            r13 = 0
        L_0x0025:
            float r5 = r5 + r13
            int r5 = X.C95914v4.A00(r5)
            if (r5 == r1) goto L_0x002e
            r3.A01 = r5
        L_0x002e:
            r3.A02 = r11
            if (r2 == 0) goto L_0x00c7
            boolean r0 = r10.A06
            if (r0 == 0) goto L_0x0046
            r0 = 2
            if (r5 != r0) goto L_0x0046
        L_0x0039:
            java.lang.Object r0 = X.AnonymousClass001.A0i(r4, r0)
            X.5UA r0 = (X.AnonymousClass5UA) r0
            r0.A02()
        L_0x0042:
            r3.A03()
            return r13
        L_0x0046:
            boolean r0 = r10.A07
            if (r0 == 0) goto L_0x0042
            if (r5 != 0) goto L_0x0042
            r0 = 1
            goto L_0x0039
        L_0x004e:
            float r6 = r6 - r5
            r0 = 0
            r3.A00 = r0
            r0 = 0
            r3.A03 = r0
            r2 = 0
            r13 = r6
            goto L_0x0025
        L_0x0058:
            r7 = r13
            float r6 = java.lang.Math.abs(r13)
            r0 = 1127481344(0x43340000, float:180.0)
            r8 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x006b
            r7 = 1135869952(0x43b40000, float:360.0)
            int r0 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c5
            float r7 = r7 + r13
        L_0x006b:
            r9 = 1110704128(0x42340000, float:45.0)
            float r6 = r5 % r9
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0025
            float r6 = r6 + r7
            if (r0 <= 0) goto L_0x00ba
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x007e
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0025
        L_0x007e:
            float r8 = r5 + r13
            int r0 = X.C95914v4.A00(r8)
            if (r0 == r1) goto L_0x0025
            r0 = 1
            r3.A03 = r0
            r2 = 1
            r3.A00 = r8
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            boolean r7 = X.AnonymousClass001.A1V(r0)
            float r0 = r8 % r9
            float r6 = java.lang.Math.abs(r0)
            r0 = 1108869120(0x42180000, float:38.0)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00ab
            float r6 = r9 - r6
            r7 = r7 ^ 1
        L_0x00a3:
            if (r7 != 0) goto L_0x00a6
            float r6 = -r6
        L_0x00a6:
            float r8 = r8 + r6
            float r13 = r8 - r5
            goto L_0x0025
        L_0x00ab:
            r0 = 1088421888(0x40e00000, float:7.0)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a3
            java.lang.String r0 = java.lang.Float.toString(r8)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x00ba:
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x007e
            r0 = -1036779520(0xffffffffc2340000, float:-45.0)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0025
            goto L_0x007e
        L_0x00c5:
            float r7 = r7 - r13
            goto L_0x006b
        L_0x00c7:
            r3.A02()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C104425Qx.A00(android.graphics.PointF, X.5Uw, float):float");
    }

    public final void A01() {
        C95914v4 r2 = (C95914v4) AnonymousClass001.A0i(this.A05, 3);
        if (r2 != null) {
            r2.A00 = 0.0f;
            r2.A03 = false;
        }
        this.A06 = false;
        this.A07 = false;
        this.A01 = 0.0f;
        this.A00 = 0.0f;
    }

    public C104425Qx(Handler handler, ViewGroup viewGroup, C620633i r5) {
        this.A0A = viewGroup;
        this.A09 = handler;
        this.A08 = C86664Kz.A01(viewGroup.getResources(), R.dimen.f6nameremoved);
        this.A03 = r5.A0K();
    }
}

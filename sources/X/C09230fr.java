package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.List;

/* renamed from: X.0fr  reason: invalid class name and case insensitive filesystem */
public class C09230fr implements C17340vN, C16230sg, C17350vO, C16220sf, C17360vP {
    public C09270fv A00;
    public final Matrix A01 = AnonymousClass002.A05();
    public final Path A02 = AnonymousClass002.A06();
    public final AnonymousClass01G A03;
    public final C04850Qx A04;
    public final C04850Qx A05;
    public final AnonymousClass0QZ A06;
    public final C09320g0 A07;
    public final String A08;
    public final boolean A09;

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0005 A[LOOP:0: B:3:0x0005->B:6:0x000f, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Aw0(java.util.ListIterator r8) {
        /*
            r7 = this;
            X.0fv r0 = r7.A00
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r8.hasPrevious()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r8.previous()
            if (r0 == r7) goto L_0x0012
            goto L_0x0005
        L_0x0012:
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
        L_0x0016:
            boolean r0 = r8.hasPrevious()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r0 = r8.previous()
            r5.add(r0)
            r8.remove()
            goto L_0x0016
        L_0x0027:
            java.util.Collections.reverse(r5)
            X.01G r1 = r7.A03
            X.0g0 r3 = r7.A07
            java.lang.String r4 = "Repeater"
            boolean r6 = r7.A09
            r2 = 0
            X.0fv r0 = new X.0fv
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09230fr.Aw0(java.util.ListIterator):void");
    }

    public void Aws(C05560Tz r2, Object obj) {
        C04850Qx r0;
        if (!this.A06.A04(r2, obj)) {
            if (obj == C17150ue.A0E) {
                r0 = this.A04;
            } else if (obj == C17150ue.A0F) {
                r0 = this.A05;
            } else {
                return;
            }
            r0.A0F(r2);
        }
    }

    public void B2C(Canvas canvas, Matrix matrix, int i) {
        float A022 = C04850Qx.A02(this.A04);
        float A023 = C04850Qx.A02(this.A05);
        AnonymousClass0QZ r7 = this.A06;
        float A024 = C04850Qx.A02(r7.A06) / 100.0f;
        float A025 = C04850Qx.A02(r7.A01) / 100.0f;
        int i2 = (int) A022;
        while (true) {
            i2--;
            if (i2 >= 0) {
                Matrix matrix2 = this.A01;
                matrix2.set(matrix);
                float f = (float) i2;
                matrix2.preConcat(r7.A01(f + A023));
                this.A00.B2C(canvas, matrix2, (int) (((float) i) * AnonymousClass001.A00(A025, A024, f / A022)));
            } else {
                return;
            }
        }
    }

    public void B4p(Matrix matrix, RectF rectF, boolean z) {
        this.A00.B4p(matrix, rectF, z);
    }

    public Path BAd() {
        Path BAd = this.A00.BAd();
        Path path = this.A02;
        path.reset();
        float A022 = C04850Qx.A02(this.A04);
        float A023 = C04850Qx.A02(this.A05);
        int i = (int) A022;
        while (true) {
            i--;
            if (i < 0) {
                return path;
            }
            Matrix matrix = this.A01;
            matrix.set(this.A06.A01(((float) i) + A023));
            path.addPath(BAd, matrix);
        }
    }

    public void BfC() {
        this.A03.invalidateSelf();
    }

    public void Bm3(List list, List list2) {
        this.A00.Bm3(list, list2);
    }

    public String getName() {
        return this.A08;
    }

    public C09230fr(AnonymousClass01G r3, C09400g8 r4, C09320g0 r5) {
        this.A03 = r3;
        this.A07 = r5;
        this.A08 = r4.A03;
        this.A09 = r4.A04;
        C01540Bg A002 = AnonymousClass0BW.A00(r4.A00);
        this.A04 = A002;
        r5.A08(A002);
        C04850Qx.A06(A002, this);
        C01540Bg A003 = AnonymousClass0BW.A00(r4.A01);
        this.A05 = A003;
        r5.A08(A003);
        C04850Qx.A06(A003, this);
        AnonymousClass0QZ r0 = new AnonymousClass0QZ(r4.A02);
        this.A06 = r0;
        r0.A03(r5);
        r0.A02(this);
    }

    public void Bk4(AnonymousClass0WB r1, AnonymousClass0WB r2, List list, int i) {
        C06100Wg.A01(this, r1, r2, list, i);
    }
}

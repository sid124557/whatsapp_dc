package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.List;

/* renamed from: X.0Bu  reason: invalid class name and case insensitive filesystem */
public class C01680Bu extends C09320g0 {
    public Paint A00 = new Paint();
    public C04850Qx A01;
    public final RectF A02 = AnonymousClass002.A07();
    public final RectF A03 = AnonymousClass002.A07();
    public final List A04 = AnonymousClass001.A0s();

    public void A09(AnonymousClass0WB r4, AnonymousClass0WB r5, List list, int i) {
        int i2 = 0;
        while (true) {
            List list2 = this.A04;
            if (i2 < list2.size()) {
                ((C09320g0) list2.get(i2)).Bk4(r4, r5, list, i);
                i2++;
            } else {
                return;
            }
        }
    }

    public void A07(Canvas canvas, Matrix matrix, int i) {
        RectF rectF = this.A02;
        C04510Oo r1 = this.A0M;
        rectF.set(0.0f, 0.0f, (float) r1.A03, (float) r1.A02);
        matrix.mapRect(rectF);
        if (!this.A0K.A0C || this.A04.size() <= 1 || i == 255) {
            canvas.save();
        } else {
            Paint paint = this.A00;
            paint.setAlpha(i);
            AnonymousClass0Y0.A02(canvas, paint, rectF, 31);
            i = 255;
        }
        List list = this.A04;
        for (int A042 = AnonymousClass002.A04(list, 1); A042 >= 0; A042--) {
            if (rectF.isEmpty() || canvas.clipRect(rectF)) {
                ((C09320g0) list.get(A042)).B2C(canvas, matrix, i);
            }
        }
        canvas.restore();
        AnonymousClass0K1.A01();
    }

    public C01680Bu(AnonymousClass0QL r11, AnonymousClass01G r12, C04510Oo r13, List list) {
        super(r12, r13);
        C09320g0 r0;
        C09320g0 r2;
        C01610Bn r02 = r13.A0A;
        if (r02 != null) {
            C01540Bg A002 = AnonymousClass0BW.A00(r02);
            this.A01 = A002;
            A08(A002);
            C04850Qx.A06(this.A01, this);
        } else {
            this.A01 = null;
        }
        C10550i7 r4 = new C10550i7(r11.A07.size());
        int size = list.size() - 1;
        C09320g0 r6 = null;
        while (true) {
            if (size >= 0) {
                C04510Oo r9 = (C04510Oo) list.get(size);
                C02190Ff r22 = r9.A0E;
                switch (r22.ordinal()) {
                    case 0:
                        r2 = new C01680Bu(r11, r12, r9, (List) r11.A0B.get(r9.A0H));
                        break;
                    case 1:
                        r2 = new C01660Bs(r12, r9);
                        break;
                    case 2:
                        r2 = new C01670Bt(r12, r9);
                        break;
                    case 3:
                        r2 = new C01640Bq(r12, r9);
                        break;
                    case 4:
                        r2 = new C01650Br(r12, r9);
                        break;
                    case 5:
                        r2 = new C01690Bv(r12, r9);
                        break;
                    default:
                        AnonymousClass0S3.A00(AnonymousClass000.A0P(r22, "Unknown layer type ", AnonymousClass001.A0o()));
                        continue;
                }
                r4.A0A(r2.A0M.A07, r2);
                if (r6 != null) {
                    r6.A03 = r2;
                    r6 = null;
                } else {
                    this.A04.add(0, r2);
                    int ordinal = r9.A0F.ordinal();
                    if (ordinal == 1 || ordinal == 2) {
                        r6 = r2;
                    }
                }
                size--;
            } else {
                for (int i = 0; i < r4.A01(); i++) {
                    C09320g0 r23 = (C09320g0) r4.A05(r4.A02(i), (Object) null);
                    if (!(r23 == null || (r0 = (C09320g0) r4.A05(r23.A0M.A08, (Object) null)) == null)) {
                        r23.A04 = r0;
                    }
                }
                return;
            }
        }
    }

    public void A05(float f) {
        super.A05(f);
        C04850Qx r3 = this.A01;
        if (r3 != null) {
            AnonymousClass0QL r0 = this.A0K.A04;
            AnonymousClass0QL r02 = this.A0M.A09;
            f = ((C04850Qx.A02(r3) * r02.A01) - r02.A02) / ((r0.A00 - r0.A02) + 0.01f);
        }
        if (this.A01 == null) {
            C04510Oo r03 = this.A0M;
            float f2 = r03.A00;
            AnonymousClass0QL r04 = r03.A09;
            f -= f2 / (r04.A00 - r04.A02);
        }
        float f3 = this.A0M.A01;
        if (f3 != 0.0f) {
            f /= f3;
        }
        List list = this.A04;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C09320g0) list.get(size)).A05(f);
            } else {
                return;
            }
        }
    }

    public void A0A(boolean z) {
        super.A0A(z);
        for (C09320g0 A0A : this.A04) {
            A0A.A0A(z);
        }
    }

    public void Aws(C05560Tz r3, Object obj) {
        super.Aws(r3, obj);
        if (obj != C17150ue.A0J) {
            return;
        }
        if (r3 == null) {
            C04850Qx r1 = this.A01;
            if (r1 != null) {
                r1.A0F((C05560Tz) null);
                return;
            }
            return;
        }
        AnonymousClass0BZ r0 = new AnonymousClass0BZ(r3, (Object) null);
        this.A01 = r0;
        C04850Qx.A06(r0, this);
        A08(this.A01);
    }

    public void B4p(Matrix matrix, RectF rectF, boolean z) {
        super.B4p(matrix, rectF, z);
        List list = this.A04;
        for (int size = list.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.A03;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((C09320g0) list.get(size)).B4p(this.A08, rectF2, true);
            rectF.union(rectF2);
        }
    }
}

package X;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;

/* renamed from: X.0ft  reason: invalid class name and case insensitive filesystem */
public class C09250ft implements C17340vN, C16230sg, C17360vP {
    public AnonymousClass0N4 A00 = new AnonymousClass0N4();
    public boolean A01;
    public final Path A02 = AnonymousClass002.A06();
    public final RectF A03 = AnonymousClass002.A07();
    public final AnonymousClass01G A04;
    public final C04850Qx A05;
    public final C04850Qx A06;
    public final C04850Qx A07;
    public final String A08;
    public final boolean A09;

    public void BfC() {
        this.A01 = false;
        this.A04.invalidateSelf();
    }

    public void Bm3(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            C16780tx r2 = (C16780tx) list.get(i);
            if (r2 instanceof C09200fo) {
                C09200fo r22 = (C09200fo) r2;
                if (r22.A03 == AnonymousClass0FR.SIMULTANEOUSLY) {
                    this.A00.A00.add(r22);
                    r22.A05.add(this);
                }
            }
        }
    }

    public void Aws(C05560Tz r2, Object obj) {
        C04850Qx r0;
        if (obj == C17150ue.A03) {
            r0 = this.A07;
        } else if (obj == C17150ue.A02) {
            r0 = this.A06;
        } else if (obj == C17150ue.A07) {
            r0 = this.A05;
        } else {
            return;
        }
        r0.A0F(r2);
    }

    public Path BAd() {
        float A0G;
        boolean z = this.A01;
        Path path = this.A02;
        if (!z) {
            path.reset();
            if (!this.A09) {
                PointF A042 = C04850Qx.A04(this.A07);
                float f = A042.x / 2.0f;
                float f2 = A042.y / 2.0f;
                C04850Qx r0 = this.A05;
                if (r0 == null) {
                    A0G = 0.0f;
                } else {
                    A0G = ((C01540Bg) r0).A0G();
                }
                float min = Math.min(f, f2);
                if (A0G > min) {
                    A0G = min;
                }
                PointF A043 = C04850Qx.A04(this.A06);
                path.moveTo(A043.x + f, (A043.y - f2) + A0G);
                path.lineTo(A043.x + f, (A043.y + f2) - A0G);
                int i = (A0G > 0.0f ? 1 : (A0G == 0.0f ? 0 : -1));
                if (i > 0) {
                    RectF rectF = this.A03;
                    float f3 = A043.x + f;
                    float f4 = A0G * 2.0f;
                    float f5 = A043.y + f2;
                    rectF.set(f3 - f4, f5 - f4, f3, f5);
                    path.arcTo(rectF, 0.0f, 90.0f, false);
                }
                path.lineTo((A043.x - f) + A0G, A043.y + f2);
                if (i > 0) {
                    RectF rectF2 = this.A03;
                    float f6 = A043.x - f;
                    float f7 = A043.y + f2;
                    float f8 = A0G * 2.0f;
                    rectF2.set(f6, f7 - f8, f8 + f6, f7);
                    path.arcTo(rectF2, 90.0f, 90.0f, false);
                }
                path.lineTo(A043.x - f, (A043.y - f2) + A0G);
                if (i > 0) {
                    RectF rectF3 = this.A03;
                    float f9 = A043.x - f;
                    float f10 = A043.y - f2;
                    float f11 = A0G * 2.0f;
                    rectF3.set(f9, f10, f9 + f11, f11 + f10);
                    path.arcTo(rectF3, 180.0f, 90.0f, false);
                }
                path.lineTo((A043.x + f) - A0G, A043.y - f2);
                if (i > 0) {
                    RectF rectF4 = this.A03;
                    float f12 = A043.x + f;
                    float f13 = A0G * 2.0f;
                    float f14 = A043.y - f2;
                    rectF4.set(f12 - f13, f14, f12, f14 + f13);
                    path.arcTo(rectF4, 270.0f, 90.0f, false);
                }
                path.close();
                this.A00.A00(path);
            }
            this.A01 = true;
        }
        return path;
    }

    public String getName() {
        return this.A08;
    }

    public C09250ft(AnonymousClass01G r4, C09480gG r5, C09320g0 r6) {
        this.A08 = r5.A03;
        this.A09 = r5.A04;
        this.A04 = r4;
        C04850Qx B0O = r5.A01.B0O();
        this.A06 = B0O;
        C04850Qx B0O2 = r5.A02.B0O();
        this.A07 = B0O2;
        C01540Bg A002 = AnonymousClass0BW.A00(r5.A00);
        this.A05 = A002;
        r6.A08(B0O);
        r6.A08(B0O2);
        r6.A08(A002);
        C04850Qx.A06(B0O, this);
        C04850Qx.A06(B0O2, this);
        C04850Qx.A06(A002, this);
    }

    public void Bk4(AnonymousClass0WB r1, AnonymousClass0WB r2, List list, int i) {
        C06100Wg.A01(this, r1, r2, list, i);
    }
}

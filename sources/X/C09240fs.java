package X;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* renamed from: X.0fs  reason: invalid class name and case insensitive filesystem */
public class C09240fs implements C17340vN, C16230sg, C17360vP {
    public AnonymousClass0N4 A00 = new AnonymousClass0N4();
    public boolean A01;
    public final Path A02 = AnonymousClass002.A06();
    public final AnonymousClass01G A03;
    public final C04850Qx A04;
    public final C04850Qx A05;
    public final C09390g7 A06;
    public final String A07;

    public void BfC() {
        this.A01 = false;
        this.A03.invalidateSelf();
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
        if (obj == C17150ue.A01) {
            r0 = this.A05;
        } else if (obj == C17150ue.A02) {
            r0 = this.A04;
        } else {
            return;
        }
        r0.A0F(r2);
    }

    public Path BAd() {
        boolean z = this.A01;
        Path path = this.A02;
        if (!z) {
            path.reset();
            C09390g7 r5 = this.A06;
            if (!r5.A03) {
                PointF A042 = C04850Qx.A04(this.A05);
                float f = A042.x / 2.0f;
                float f2 = A042.y / 2.0f;
                float f3 = f * 0.55228f;
                float f4 = 0.55228f * f2;
                path.reset();
                if (r5.A04) {
                    float f5 = -f2;
                    path.moveTo(0.0f, f5);
                    float f6 = 0.0f - f3;
                    float f7 = -f;
                    float f8 = 0.0f - f4;
                    path.cubicTo(f6, f5, f7, f8, f7, 0.0f);
                    float f9 = f4 + 0.0f;
                    Path path2 = path;
                    path2.cubicTo(f7, f9, f6, f2, 0.0f, f2);
                    float f10 = f3 + 0.0f;
                    path.cubicTo(f10, f2, f, f9, f, 0.0f);
                    path2.cubicTo(f, f8, f10, f5, 0.0f, f5);
                } else {
                    float f11 = -f2;
                    path.moveTo(0.0f, f11);
                    float f12 = f3 + 0.0f;
                    float f13 = 0.0f - f4;
                    path.cubicTo(f12, f11, f, f13, f, 0.0f);
                    float f14 = f4 + 0.0f;
                    path.cubicTo(f, f14, f12, f2, 0.0f, f2);
                    float f15 = 0.0f - f3;
                    float f16 = -f;
                    path.cubicTo(f15, f2, f16, f14, f16, 0.0f);
                    float f17 = f16;
                    path.cubicTo(f17, f13, f15, f11, 0.0f, f11);
                }
                PointF A043 = C04850Qx.A04(this.A04);
                path.offset(A043.x, A043.y);
                path.close();
                this.A00.A00(path);
            }
            this.A01 = true;
        }
        return path;
    }

    public String getName() {
        return this.A07;
    }

    public C09240fs(AnonymousClass01G r3, C09390g7 r4, C09320g0 r5) {
        this.A07 = r4.A02;
        this.A03 = r3;
        C01550Bh r1 = new C01550Bh(r4.A00.A00);
        this.A05 = r1;
        C04850Qx B0O = r4.A01.B0O();
        this.A04 = B0O;
        this.A06 = r4;
        r5.A08(r1);
        r5.A08(B0O);
        C04850Qx.A06(r1, this);
        C04850Qx.A06(B0O, this);
    }

    public void Bk4(AnonymousClass0WB r1, AnonymousClass0WB r2, List list, int i) {
        C06100Wg.A01(this, r1, r2, list, i);
    }
}

package X;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import java.util.List;

/* renamed from: X.7lm  reason: invalid class name and case insensitive filesystem */
public class C159407lm {
    public static int A00(C153427bI r3, AnonymousClass84O r4) {
        AnonymousClass84O A0J = r4.A0K(38);
        if (A0J != null) {
            return C154127ce.A01(r3, A0J, 0);
        }
        try {
            String str = (String) AnonymousClass84O.A05(r4, 36);
            if (str == null) {
                return -16777216;
            }
            return C162407s0.A05(str);
        } catch (AnonymousClass6u2 e) {
            C159737mN.A00(r3, "ColorDrawableUtils", "Error parsing border color in BoxDecoration", e);
            return 0;
        }
    }

    public static C124546Cy A01(C153427bI r10, AnonymousClass84O r11, int i) {
        float A01;
        int A00;
        int A002;
        float A012;
        float[] A02;
        float A013;
        C124546Cy r2 = new C124546Cy();
        if (r11 == null) {
            A01 = 0.0f;
            A00 = 0;
            A002 = 0;
            A012 = 0.0f;
            A02 = null;
        } else {
            String str = (String) AnonymousClass84O.A05(r11, 46);
            if (str == null) {
                A01 = 0.0f;
            } else {
                A01 = C162407s0.A01(str);
            }
            A00 = C159417ln.A00(r11.A0S(56), 0);
            A002 = A00(r10, r11);
            String A08 = AnonymousClass84O.A08(r11);
            if (A08 == null) {
                A012 = 0.0f;
            } else {
                A012 = C162407s0.A01(A08);
            }
            A02 = A02(r11.A0S(62));
            String str2 = (String) AnonymousClass84O.A05(r11, 63);
            if (str2 != null) {
                A013 = C162407s0.A01(str2);
                r2.A05.setColor(i);
                Paint paint = r2.A04;
                paint.setColor(A002);
                paint.setStrokeWidth(A012);
                if (A012 > 0.0f && A02 != null) {
                    paint.setPathEffect(new DashPathEffect(A02, A013));
                }
                r2.A02 = A01;
                r2.A03 = A00;
                float f = A012 / 2.0f;
                r2.A00 = f;
                r2.A01 = A01 - f;
                return r2;
            }
        }
        A013 = 0.0f;
        r2.A05.setColor(i);
        Paint paint2 = r2.A04;
        paint2.setColor(A002);
        paint2.setStrokeWidth(A012);
        paint2.setPathEffect(new DashPathEffect(A02, A013));
        r2.A02 = A01;
        r2.A03 = A00;
        float f2 = A012 / 2.0f;
        r2.A00 = f2;
        r2.A01 = A01 - f2;
        return r2;
    }

    public static float[] A02(List list) {
        float A01;
        if (list == null || list.size() == 0) {
            return null;
        }
        float[] fArr = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            String A0n = AnonymousClass001.A0n(list, i);
            if (A0n == null) {
                A01 = 0.0f;
            } else {
                A01 = C162407s0.A01(A0n);
            }
            fArr[i] = A01;
        }
        return fArr;
    }
}

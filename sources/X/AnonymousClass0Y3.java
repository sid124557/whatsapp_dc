package X;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import java.util.Arrays;

/* renamed from: X.0Y3  reason: invalid class name */
public class AnonymousClass0Y3 {
    public static Drawable A00(C153427bI r3, AnonymousClass84O r4, AnonymousClass84O r5) {
        try {
            String A0O = r4.A0O(35);
            if (A0O == null) {
                return new C124546Cy();
            }
            return C159407lm.A01(r3, r5, C162407s0.A05(A0O));
        } catch (AnonymousClass6u2 e) {
            C159737mN.A00(r3, "ColorDrawableUtils", "Error parsing color for ColorDrawable", e);
            return new C124546Cy();
        }
    }

    public static Drawable A01(C153427bI r10, AnonymousClass84O r11, AnonymousClass84O r12) {
        GradientDrawable.Orientation orientation;
        int[] iArr;
        AnonymousClass84O A0J = r11.A0K(35);
        AnonymousClass84O A0J2 = r11.A0K(36);
        if (A0J == null || A0J2 == null) {
            throw AnonymousClass002.A0E("Gradient drawable received with null begin or end color");
        }
        AnonymousClass84O A0J3 = r11.A0K(38);
        String A0O = r11.A0O(40);
        if (A0O == null) {
            try {
                orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            } catch (AnonymousClass6u2 e) {
                C159737mN.A00(r10, "GradientDrawableUtils", "Error parsing orientation for GradientDrawable", e);
                orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            }
        } else {
            orientation = C162407s0.A0B(A0O);
        }
        int A00 = C154127ce.A00(r10, A0J);
        int A002 = C154127ce.A00(r10, A0J2);
        if (A0J3 != null) {
            iArr = new int[]{A00, C154127ce.A00(r10, A0J3), A002};
        } else {
            iArr = new int[]{A00, A002};
        }
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
        if (r12 != null) {
            A05(gradientDrawable, r12);
        }
        return gradientDrawable;
    }

    public static Drawable A03(C153427bI r6, AnonymousClass84O r7, AnonymousClass84O r8) {
        Drawable A06;
        AnonymousClass84O A0J = r7.A0K(35);
        if (A0J == null) {
            C159737mN.A01("RippleDrawableUtils", "Client received a RippleDrawable with null content");
        }
        if (A0J == null) {
            A06 = new ColorDrawable();
        } else {
            A06 = C158977kt.A00().A04().A06(r6, A0J, r8);
        }
        ShapeDrawable shapeDrawable = null;
        if (r8 != null) {
            float[] fArr = new float[8];
            try {
                Arrays.fill(fArr, C162407s0.A03(r8.A0O(46), 0.0f));
            } catch (AnonymousClass6u2 unused) {
                C159737mN.A01("RippleDrawableUtils", "Error parsing Corner radius for Box decoration");
                Arrays.fill(fArr, 0.0f);
            }
            shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        }
        return new RippleDrawable(ColorStateList.valueOf(Color.parseColor(r7.A0O(38))), A06, shapeDrawable);
    }

    public static Drawable A04(C153427bI r3, AnonymousClass84O r4, AnonymousClass84O r5) {
        try {
            return C159407lm.A01(r3, r5, C154127ce.A00(r3, r4.A0K(35)));
        } catch (AnonymousClass6u2 e) {
            C159737mN.A00(r3, "ThemedColorDrawableUtils", "Parse error for ThemedColorDrawable", e);
            return new C124546Cy();
        }
    }

    public static void A05(GradientDrawable gradientDrawable, AnonymousClass84O r4) {
        try {
            float[] fArr = new float[8];
            C159417ln.A01(fArr, C162407s0.A03(r4.A0O(46), 0.0f), C159417ln.A00(r4.A0S(56), 15));
            gradientDrawable.setCornerRadii(fArr);
        } catch (AnonymousClass6u2 unused) {
            C159737mN.A01("GradientDrawableUtils", "Error parsing Corner radius for Box decoration");
        }
    }

    public static Drawable A02(C153427bI r0, AnonymousClass84O r1, AnonymousClass84O r2) {
        return A03(r0, r1, r2);
    }

    public Drawable A06(C153427bI r3, AnonymousClass84O r4, AnonymousClass84O r5) {
        int A0D = r4.A0D();
        if (A0D == 13318) {
            return A00(r3, r4, r5);
        }
        if (A0D == 13322) {
            return A01(r3, r4, r5);
        }
        if (A0D == 13330) {
            return A02(r3, r4, r5);
        }
        if (A0D == 13332) {
            return AnonymousClass0SX.A00(r3, r4, r5);
        }
        if (A0D != 13340) {
            return new ColorDrawable();
        }
        return A04(r3, r4, r5);
    }

    public boolean A07(AnonymousClass84O r2) {
        return false;
    }
}

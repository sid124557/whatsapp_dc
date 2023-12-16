package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.widget.SeekBar;

/* renamed from: X.0Xz  reason: invalid class name and case insensitive filesystem */
public class C06510Xz {
    public static final Handler A00 = new C001601w(Looper.getMainLooper());

    public static GradientDrawable A00(Drawable drawable) {
        if (drawable != null) {
            if (drawable instanceof GradientDrawable) {
                return (GradientDrawable) drawable;
            }
            if (drawable instanceof ScaleDrawable) {
                return A00(((ScaleDrawable) drawable).getDrawable());
            }
            if ((drawable instanceof StateListDrawable) && drawable.getConstantState() != null) {
                DrawableContainer.DrawableContainerState drawableContainerState = (DrawableContainer.DrawableContainerState) drawable.getConstantState();
                for (int i = 0; i < drawableContainerState.getChildCount(); i++) {
                    GradientDrawable A002 = A00(drawableContainerState.getChild(i));
                    if (A002 != null) {
                        return A002;
                    }
                }
            }
        }
        return null;
    }

    public static void A03(SeekBar seekBar, AnonymousClass0XI r6, C153427bI r7, AnonymousClass84O r8) {
        int i;
        int i2;
        int i3;
        GradientDrawable gradientDrawable;
        AnonymousClass84O A0J = r8.A0K(43);
        if (A0J != null) {
            i = C154127ce.A00(r7, A0J);
        } else {
            i = r6.A04;
        }
        AnonymousClass84O A0J2 = r8.A0K(48);
        if (A0J2 != null) {
            i2 = C154127ce.A00(r7, A0J2);
        } else {
            i2 = r6.A06;
        }
        int i4 = r6.A05;
        try {
            i4 = (int) C162407s0.A03(r8.A0O(46), (float) i4);
        } catch (AnonymousClass6u2 unused) {
            C159737mN.A01("BKBloksComponentsSliderBinderUtil", "Error while parsing slider track height");
        }
        if (i4 != r6.A05) {
            A05(r6, i4);
        }
        if (i != r6.A04) {
            PorterDuff.Mode mode = PorterDuff.Mode.SRC;
            GradientDrawable gradientDrawable2 = r6.A0A;
            if (gradientDrawable2 != null) {
                AnonymousClass001.A12(mode, gradientDrawable2, i);
            }
        }
        if (i2 != r6.A06) {
            PorterDuff.Mode mode2 = PorterDuff.Mode.SRC;
            GradientDrawable gradientDrawable3 = r6.A09;
            if (gradientDrawable3 != null) {
                AnonymousClass001.A12(mode2, gradientDrawable3, i2);
            }
        }
        int i5 = r6.A03;
        try {
            i5 = (int) C162407s0.A03(r8.A0O(45), (float) i5);
        } catch (AnonymousClass6u2 unused2) {
            C159737mN.A01("BKBloksComponentsSliderBinderUtil", "Error while parsing slider thumb diameter");
        }
        AnonymousClass84O A0J3 = r8.A0K(44);
        if (A0J3 != null) {
            i3 = C154127ce.A00(r7, A0J3);
        } else {
            i3 = r6.A02;
        }
        if (i5 != r6.A00) {
            gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setSize(i5, i5);
        } else {
            gradientDrawable = (GradientDrawable) seekBar.getThumb();
        }
        gradientDrawable.setColor(i3);
        seekBar.setThumb(gradientDrawable);
        seekBar.setThumbOffset(0);
        r6.A00 = i5;
    }

    public static void A05(AnonymousClass0XI r3, int i) {
        GradientDrawable gradientDrawable = r3.A09;
        if (gradientDrawable != null && r3.A0A != null && r3.A0B != null) {
            gradientDrawable.setSize(-1, i);
            r3.A0A.setSize(-1, i);
            r3.A0B.setSize(-1, i);
        }
    }

    public static void A01(SeekBar seekBar, AnonymousClass0XI r7, C153427bI r8) {
        r7.A08 = seekBar.getThumb();
        LayerDrawable layerDrawable = (LayerDrawable) seekBar.getProgressDrawable();
        if (layerDrawable != null) {
            GradientDrawable A002 = A00(layerDrawable.findDrawableByLayerId(16908288));
            GradientDrawable A003 = A00(layerDrawable.findDrawableByLayerId(16908301));
            GradientDrawable A004 = A00(layerDrawable.findDrawableByLayerId(16908303));
            if (A002 == null || A003 == null || A004 == null) {
                throw AnonymousClass001.A0e("Track is not using the default Drawable");
            }
            r7.A09 = A002;
            r7.A0A = A003;
            r7.A0B = A004;
            Context A005 = r8.A00();
            DisplayMetrics A0B = AnonymousClass000.A0B(A005);
            Resources.Theme theme = A005.getTheme();
            r7.A03 = (int) ((float) AnonymousClass001.A07((float) 18, ((float) A0B.densityDpi) / 160.0f));
            r7.A02 = AnonymousClass001.A0G(theme, new int[1], 16843818, -16776961);
            r7.A05 = (int) ((float) AnonymousClass001.A07((float) 2, ((float) A0B.densityDpi) / 160.0f));
            r7.A04 = AnonymousClass001.A0G(theme, new int[1], 16843818, -16776961);
            r7.A06 = AnonymousClass001.A0G(theme, new int[1], 16843817, -7829368);
            int i = r7.A03;
            int i2 = r7.A02;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setSize(i, i);
            gradientDrawable.setColor(i2);
            seekBar.setThumb(gradientDrawable);
            seekBar.setThumbOffset(0);
            A05(r7, r7.A05);
            int i3 = r7.A04;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            GradientDrawable gradientDrawable2 = r7.A0A;
            if (gradientDrawable2 != null) {
                AnonymousClass001.A12(mode, gradientDrawable2, i3);
            }
            int i4 = r7.A06;
            GradientDrawable gradientDrawable3 = r7.A09;
            if (gradientDrawable3 != null) {
                AnonymousClass001.A12(mode, gradientDrawable3, i4);
                return;
            }
            return;
        }
        throw AnonymousClass001.A0e("Track drawable is null");
    }
}

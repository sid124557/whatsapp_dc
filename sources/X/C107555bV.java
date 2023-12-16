package X;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.5bV  reason: invalid class name and case insensitive filesystem */
public class C107555bV {
    public static final Object A00 = AnonymousClass002.A0D();

    public static void A05(View view, C620733j r6, int i, int i2) {
        A07(view, r6, i, view.getPaddingTop(), i2, view.getPaddingBottom());
    }

    public static int A00(int i) {
        if ((8388608 & i) != 0) {
            return i;
        }
        int i2 = i & 7;
        if (i2 == 5) {
            return (i & -8) | 3;
        }
        if (i2 == 3) {
            return (i & -8) | 5;
        }
        return i;
    }

    public static String A01(C620733j r1, String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        boolean A04 = C620733j.A04(r1);
        char c = 8207;
        if (A04) {
            c = 8206;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(c);
        A0o.append(str);
        return AnonymousClass001.A0j(A0o, c);
    }

    public static String A02(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char c = 8207;
        if (A0C(str)) {
            c = 8206;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(c);
        A0o.append(str);
        return AnonymousClass001.A0j(A0o, c);
    }

    public static void A03(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(view);
        A0T.setMarginStart(i);
        A0T.setMarginEnd(i2);
        view.setLayoutParams(A0T);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
        r1 = (android.widget.RelativeLayout) r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a2, code lost:
        r4 = (android.widget.ListView) r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cd, code lost:
        r11 = (android.view.ViewGroup.MarginLayoutParams) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(android.view.View r13, X.C620733j r14) {
        /*
            boolean r0 = X.C620733j.A04(r14)
            r3 = 0
            if (r0 == 0) goto L_0x0028
            boolean r0 = r13 instanceof android.widget.TimePicker
            if (r0 == 0) goto L_0x0177
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "samsung"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x001d
            java.lang.String r0 = "accent"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0177
        L_0x001d:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 22
            if (r1 == r0) goto L_0x0027
            r0 = 23
            if (r1 != r0) goto L_0x0177
        L_0x0027:
            return
        L_0x0028:
            boolean r0 = r13 instanceof X.C180038k7
            if (r0 != 0) goto L_0x0027
            r0 = 2131427938(0x7f0b0262, float:1.8477506E38)
            java.lang.Object r0 = r13.getTag(r0)
            if (r0 != 0) goto L_0x0027
            boolean r0 = r13 instanceof android.widget.TimePicker
            if (r0 != 0) goto L_0x0027
            int r2 = r13.getPaddingRight()
            int r1 = r13.getPaddingTop()
            int r0 = r13.getPaddingLeft()
            X.C86654Ky.A15(r13, r2, r1, r0)
            boolean r0 = r13 instanceof android.widget.TextView
            r2 = 1
            if (r0 == 0) goto L_0x0070
            boolean r0 = r13 instanceof android.widget.EditText
            if (r0 != 0) goto L_0x0070
            r7 = r13
            android.widget.TextView r7 = (android.widget.TextView) r7
            int r0 = r7.getGravity()
            int r0 = A00(r0)
            r7.setGravity(r0)
            android.graphics.drawable.Drawable[] r6 = r7.getCompoundDrawables()
            r0 = 2
            r5 = r6[r0]
            r4 = r6[r2]
            r1 = r6[r3]
            r0 = 3
            r0 = r6[r0]
            r7.setCompoundDrawables(r5, r4, r1, r0)
        L_0x0070:
            boolean r0 = r13 instanceof android.widget.RelativeLayout
            if (r0 == 0) goto L_0x0084
            r1 = r13
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            int r0 = r1.getGravity()
            if (r0 == 0) goto L_0x0084
            int r0 = A00(r0)
            r1.setGravity(r0)
        L_0x0084:
            boolean r0 = r13 instanceof android.widget.LinearLayout
            if (r0 == 0) goto L_0x009e
            r4 = r13
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x0150
            int r0 = r4.getGravity()
        L_0x0095:
            if (r0 == 0) goto L_0x009e
            int r0 = A00(r0)
            r4.setGravity(r0)
        L_0x009e:
            boolean r0 = r13 instanceof android.widget.ListView
            if (r0 == 0) goto L_0x00b3
            r4 = r13
            android.widget.ListView r4 = (android.widget.ListView) r4
            android.graphics.drawable.Drawable r1 = r4.getDivider()
            if (r1 == 0) goto L_0x00b3
            X.6dx r0 = new X.6dx
            r0.<init>(r1, r14)
            r4.setDivider(r0)
        L_0x00b3:
            boolean r0 = r13 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0165
            r8 = r13
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            int r7 = r8.getChildCount()
            r6 = 0
        L_0x00bf:
            if (r6 >= r7) goto L_0x0165
            android.view.View r5 = r8.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r4 = r5.getLayoutParams()
            boolean r0 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x00dd
            r11 = r4
            android.view.ViewGroup$MarginLayoutParams r11 = (android.view.ViewGroup.MarginLayoutParams) r11
            int r10 = r11.leftMargin
            int r9 = r11.rightMargin
            if (r10 == r9) goto L_0x00dd
            int r1 = r11.topMargin
            int r0 = r11.bottomMargin
            r11.setMargins(r9, r1, r10, r0)
        L_0x00dd:
            boolean r0 = r4 instanceof android.widget.RelativeLayout.LayoutParams
            if (r0 == 0) goto L_0x0108
            r11 = r4
            android.widget.RelativeLayout$LayoutParams r11 = (android.widget.RelativeLayout.LayoutParams) r11
            int[] r12 = r11.getRules()
            r1 = r12[r3]
            r0 = r12[r2]
            r12[r2] = r1
            r12[r3] = r0
            r10 = 5
            r9 = r12[r10]
            r1 = 7
            r0 = r12[r1]
            r11.addRule(r10, r0)
            r11.addRule(r1, r9)
            r10 = 9
            r9 = r12[r10]
            r1 = 11
            r0 = r12[r1]
            r12[r10] = r0
            r12[r1] = r9
        L_0x0108:
            boolean r0 = r4 instanceof android.widget.FrameLayout.LayoutParams
            if (r0 == 0) goto L_0x0117
            r1 = r4
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r0 = r1.gravity
            int r0 = A00(r0)
            r1.gravity = r0
        L_0x0117:
            boolean r0 = r4 instanceof android.widget.LinearLayout.LayoutParams
            if (r0 == 0) goto L_0x0126
            r1 = r4
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            int r0 = r1.gravity
            int r0 = A00(r0)
            r1.gravity = r0
        L_0x0126:
            boolean r0 = r4 instanceof X.C001702c
            if (r0 == 0) goto L_0x0149
            X.02c r4 = (X.C001702c) r4
            float r1 = r4.A02
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = X.AnonymousClass002.A00(r1, r0)
            r4.A02 = r0
            int r1 = r4.A0T
            int r0 = r4.A0l
            r4.A0T = r0
            r4.A0l = r1
            int r1 = r4.A0U
            int r0 = r4.A0k
            r4.A0U = r0
            r4.A0k = r1
            r5.setLayoutParams(r4)
        L_0x0149:
            A04(r5, r14)
            int r6 = r6 + 1
            goto L_0x00bf
        L_0x0150:
            java.lang.Class<android.widget.LinearLayout> r1 = android.widget.LinearLayout.class
            java.lang.String r0 = "mGravity"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x009e }
            r0.setAccessible(r2)     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x009e }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x009e }
            int r0 = X.AnonymousClass001.A0K(r0)     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x009e }
            goto L_0x0095
        L_0x0165:
            boolean r0 = r13 instanceof androidx.constraintlayout.widget.Barrier
            if (r0 == 0) goto L_0x0027
            androidx.constraintlayout.widget.Barrier r13 = (androidx.constraintlayout.widget.Barrier) r13
            int r0 = r13.A00
            if (r0 != 0) goto L_0x0172
            r13.A00 = r2
            return
        L_0x0172:
            if (r0 != r2) goto L_0x0027
            r13.A00 = r3
            return
        L_0x0177:
            X.AnonymousClass0YH.A06(r13, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107555bV.A04(android.view.View, X.33j):void");
    }

    public static void A06(View view, C620733j r3, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(view);
        if (C620733j.A04(r3)) {
            A0T.setMargins(i, i2, i3, i4);
        } else {
            A0T.setMargins(i3, i2, i, i4);
        }
        view.setLayoutParams(A0T);
    }

    public static void A07(View view, C620733j r3, int i, int i2, int i3, int i4) {
        int i5 = i;
        if (C102805Ki.A00(r3)) {
            i5 = i3;
        }
        if (!C102805Ki.A00(r3)) {
            i = i3;
        }
        view.setPadding(i5, i2, i, i4);
    }

    public static void A08(Window window, C620733j r2) {
        window.getDecorView().setLayoutDirection(AnonymousClass000.A1S(C102805Ki.A00(r2) ? 1 : 0) ? 1 : 0);
    }

    public static void A09(EditText editText, C620733j r5) {
        int paddingLeft;
        int paddingTop;
        int dimensionPixelSize;
        if (C102805Ki.A00(r5)) {
            paddingLeft = editText.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            paddingTop = editText.getPaddingTop();
            dimensionPixelSize = editText.getPaddingRight();
        } else {
            paddingLeft = editText.getPaddingLeft();
            paddingTop = editText.getPaddingTop();
            dimensionPixelSize = editText.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        }
        C86654Ky.A15(editText, paddingLeft, paddingTop, dimensionPixelSize);
    }

    public static void A0A(HorizontalScrollView horizontalScrollView, C620733j r3) {
        if (C102805Ki.A00(r3)) {
            C86614Ku.A1J(horizontalScrollView.getViewTreeObserver(), horizontalScrollView, 0);
        }
    }

    public static void A0B(TextView textView, C620733j r3, int i) {
        if (C102805Ki.A00(r3)) {
            textView.setCompoundDrawablesWithIntrinsicBounds(AnonymousClass0x7.A0J(textView.getContext(), r3, i), (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
        }
    }

    public static boolean A0C(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            return !AnonymousClass0K7.A01.BIl(charSequence, 0, charSequence.length());
        }
        Log.w("TextEmojiLabel/isTextLTR text is empty or null");
        return true;
    }
}

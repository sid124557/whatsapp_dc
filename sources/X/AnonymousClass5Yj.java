package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.whatsapp.R;

/* renamed from: X.5Yj  reason: invalid class name */
public final class AnonymousClass5Yj {
    public static final AnonymousClass66R A00 = C154517dI.A01(C121095zf.A00);

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0055, code lost:
        if (r6 == false) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0059, code lost:
        if (r6 != false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005b, code lost:
        if (r9 == 0) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005d, code lost:
        ((java.util.AbstractMap) A00.getValue()).put(java.lang.Integer.valueOf(r8), java.lang.Integer.valueOf(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0070, code lost:
        return r9;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A02(android.content.Context r7, int r8, int r9) {
        /*
            boolean r6 = X.C1001059l.A02
            if (r7 != 0) goto L_0x000a
            java.lang.String r0 = "The context passed to WDSColorsUtils.getThemeColorResourceId is null"
        L_0x0006:
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0009:
            return r9
        L_0x000a:
            boolean r0 = r7 instanceof android.app.Application
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "The context passed to WDSColorsUtils.getThemeColorResourceId is AppContext"
            goto L_0x0006
        L_0x0011:
            boolean r0 = X.C1001059l.A03
            if (r0 == 0) goto L_0x0009
            r5 = 0
            if (r6 == 0) goto L_0x002f
            X.66R r0 = A00
            java.lang.Object r0 = r0.getValue()
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            java.lang.Object r0 = X.C18290x4.A0j(r0, r8)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x002f
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x002f
            return r0
        L_0x002f:
            android.util.TypedValue r1 = X.AnonymousClass4L0.A0B()     // Catch:{ Exception -> 0x0055, all -> 0x0071 }
            android.content.res.Resources$Theme r0 = r7.getTheme()     // Catch:{ Exception -> 0x0055, all -> 0x0071 }
            r4 = 1
            if (r0 == 0) goto L_0x003d
            r0.resolveAttribute(r8, r1, r4)     // Catch:{ Exception -> 0x0055, all -> 0x0071 }
        L_0x003d:
            int r0 = r1.resourceId     // Catch:{ Exception -> 0x0055, all -> 0x0071 }
            if (r0 != 0) goto L_0x0058
            java.util.Locale r3 = java.util.Locale.US     // Catch:{ Exception -> 0x0055, all -> 0x0071 }
            java.lang.String r2 = "Color attr not found on provided context Theme: %s"
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0055, all -> 0x0071 }
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x0055, all -> 0x0071 }
            r1[r5] = r0     // Catch:{ Exception -> 0x0055, all -> 0x0071 }
            java.lang.String r0 = X.C86634Kw.A10(r2, r3, r1, r4)     // Catch:{ Exception -> 0x0055, all -> 0x0071 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0055, all -> 0x0071 }
            goto L_0x0059
        L_0x0055:
            if (r6 == 0) goto L_0x0009
            goto L_0x005b
        L_0x0058:
            r9 = r0
        L_0x0059:
            if (r6 == 0) goto L_0x0009
        L_0x005b:
            if (r9 == 0) goto L_0x0009
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            X.66R r0 = A00
            java.lang.Object r0 = r0.getValue()
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            r0.put(r2, r1)
            return r9
        L_0x0071:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5Yj.A02(android.content.Context, int, int):int");
    }

    public static int A00(Context context) {
        return A02(context, R.attr.f3nameremoved, R.color.f5nameremoved);
    }

    public static int A01(Context context) {
        return A02(context, R.attr.f3nameremoved, R.color.f5nameremoved);
    }

    public static int A03(Context context, Context context2, int i, int i2) {
        return AnonymousClass0Y8.A04(context2, A02(context, i, i2));
    }

    public static int A04(View view) {
        return A02(view.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved);
    }

    public static int A05(View view) {
        return A02(view.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved);
    }

    public static int A06(View view) {
        return A02(view.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved);
    }

    public static int A07(View view) {
        return A02(view.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved);
    }

    public static void A08(Context context, Context context2, TextView textView, int i, int i2) {
        textView.setTextColor(AnonymousClass0Y8.A04(context2, A02(context, i, i2)));
    }

    public static void A09(Context context, View view) {
        Drawable A002 = AnonymousClass0RP.A00(context, R.drawable.search_attachment_background);
        C626936e.A06(A002);
        view.setBackground(C107335b8.A0B(A002, AnonymousClass0Y8.A04(view.getContext(), A02(view.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved))));
    }

    public static void A0A(Context context, View view, int i, int i2) {
        view.setBackgroundResource(A02(context, i, i2));
    }

    public static void A0B(Context context, TextView textView, int i, int i2) {
        textView.setTextColor(AnonymousClass0Y8.A04(context, A02(context, i, i2)));
    }

    public static void A0C(Chip chip) {
        chip.setChipBackgroundColorResource(A02(chip.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
    }

    public static final boolean A0D(int i) {
        C626936e.A0E(AnonymousClass000.A1U(Color.alpha(i), 255), "Color must be opaque!");
        if (i == -16051174) {
            return false;
        }
        if (i == -1 || AnonymousClass0YI.A01(-1, i) < AnonymousClass0YI.A01(-16777216, i)) {
            return true;
        }
        return false;
    }
}

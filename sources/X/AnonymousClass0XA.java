package X;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;

/* renamed from: X.0XA  reason: invalid class name */
public class AnonymousClass0XA {
    public static Class A00;
    public static final Rect A01 = AnonymousClass001.A0N();
    public static final int[] A02 = {16842912};
    public static final int[] A03 = new int[0];

    static {
        try {
            A00 = Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException unused) {
        }
    }

    public static PorterDuff.Mode A00(PorterDuff.Mode mode, int i) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0075, code lost:
        if (r1 == false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0077, code lost:
        r0 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        if (r0 == 0) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007a, code lost:
        if (r0 == 1) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007c, code lost:
        if (r0 == 2) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007e, code lost:
        if (r0 != 3) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0080, code lost:
        r7.bottom = r10.getInt(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0087, code lost:
        r7.right = r10.getInt(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008e, code lost:
        r7.top = r10.getInt(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0095, code lost:
        r7.left = r10.getInt(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009b, code lost:
        r3 = r3 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Rect A01(android.graphics.drawable.Drawable r10) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x001f
            android.graphics.Insets r1 = r10.getOpticalInsets()
            android.graphics.Rect r7 = X.AnonymousClass001.A0N()
            int r0 = r1.left
            r7.left = r0
            int r0 = r1.right
            r7.right = r0
            int r0 = r1.top
            r7.top = r0
            int r0 = r1.bottom
            r7.bottom = r0
        L_0x001e:
            return r7
        L_0x001f:
            java.lang.Class r2 = A00
            if (r2 == 0) goto L_0x00a5
            boolean r0 = r10 instanceof X.C15750rs     // Catch:{ Exception -> 0x009e }
            if (r0 == 0) goto L_0x002d
            X.0rs r10 = (X.C15750rs) r10     // Catch:{ Exception -> 0x009e }
            X.01J r10 = (X.AnonymousClass01J) r10     // Catch:{ Exception -> 0x009e }
            android.graphics.drawable.Drawable r10 = r10.A02     // Catch:{ Exception -> 0x009e }
        L_0x002d:
            java.lang.Class r1 = r10.getClass()     // Catch:{ Exception -> 0x009e }
            java.lang.String r0 = "getOpticalInsets"
            java.lang.Object r6 = X.AnonymousClass000.A0K(r1, r10, r0)     // Catch:{ Exception -> 0x009e }
            if (r6 == 0) goto L_0x00a5
            android.graphics.Rect r7 = X.AnonymousClass001.A0N()     // Catch:{ Exception -> 0x009e }
            java.lang.reflect.Field[] r5 = r2.getFields()     // Catch:{ Exception -> 0x009e }
            int r4 = r5.length     // Catch:{ Exception -> 0x009e }
            r3 = 0
        L_0x0043:
            if (r3 >= r4) goto L_0x001e
            r10 = r5[r3]     // Catch:{ Exception -> 0x009e }
            java.lang.String r1 = r10.getName()     // Catch:{ Exception -> 0x009e }
            int r0 = r1.hashCode()     // Catch:{ Exception -> 0x009e }
            r9 = 3
            r8 = 2
            r2 = 1
            switch(r0) {
                case -1383228885: goto L_0x006e;
                case 115029: goto L_0x0066;
                case 3317767: goto L_0x005e;
                case 108511772: goto L_0x0056;
                default: goto L_0x0055;
            }     // Catch:{ Exception -> 0x009e }
        L_0x0055:
            goto L_0x0077
        L_0x0056:
            java.lang.String r0 = "right"
            boolean r1 = r1.equals(r0)     // Catch:{ Exception -> 0x009e }
            r0 = 2
            goto L_0x0075
        L_0x005e:
            java.lang.String r0 = "left"
            boolean r1 = r1.equals(r0)     // Catch:{ Exception -> 0x009e }
            r0 = 0
            goto L_0x0075
        L_0x0066:
            java.lang.String r0 = "top"
            boolean r1 = r1.equals(r0)     // Catch:{ Exception -> 0x009e }
            r0 = 1
            goto L_0x0075
        L_0x006e:
            java.lang.String r0 = "bottom"
            boolean r1 = r1.equals(r0)     // Catch:{ Exception -> 0x009e }
            r0 = 3
        L_0x0075:
            if (r1 != 0) goto L_0x0078
        L_0x0077:
            r0 = -1
        L_0x0078:
            if (r0 == 0) goto L_0x0095
            if (r0 == r2) goto L_0x008e
            if (r0 == r8) goto L_0x0087
            if (r0 != r9) goto L_0x009b
            int r0 = r10.getInt(r6)     // Catch:{ Exception -> 0x009e }
            r7.bottom = r0     // Catch:{ Exception -> 0x009e }
            goto L_0x009b
        L_0x0087:
            int r0 = r10.getInt(r6)     // Catch:{ Exception -> 0x009e }
            r7.right = r0     // Catch:{ Exception -> 0x009e }
            goto L_0x009b
        L_0x008e:
            int r0 = r10.getInt(r6)     // Catch:{ Exception -> 0x009e }
            r7.top = r0     // Catch:{ Exception -> 0x009e }
            goto L_0x009b
        L_0x0095:
            int r0 = r10.getInt(r6)     // Catch:{ Exception -> 0x009e }
            r7.left = r0     // Catch:{ Exception -> 0x009e }
        L_0x009b:
            int r3 = r3 + 1
            goto L_0x0043
        L_0x009e:
            java.lang.String r1 = "DrawableUtils"
            java.lang.String r0 = "Couldn't obtain the optical insets. Ignoring."
            android.util.Log.e(r1, r0)
        L_0x00a5:
            android.graphics.Rect r0 = A01
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XA.A01(android.graphics.drawable.Drawable):android.graphics.Rect");
    }

    public static void A02(Drawable drawable) {
        int[] iArr;
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(AnonymousClass000.A0O(drawable))) {
            int[] state = drawable.getState();
            if (state == null || state.length == 0) {
                iArr = A02;
            } else {
                iArr = A03;
            }
            drawable.setState(iArr);
            drawable.setState(state);
        }
    }

    public static boolean A03(Drawable drawable) {
        Drawable drawable2;
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
                return true;
            }
            for (Drawable A032 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                if (!A03(A032)) {
                    return false;
                }
            }
            return true;
        }
        if (drawable instanceof C15750rs) {
            drawable2 = ((AnonymousClass01J) ((C15750rs) drawable)).A02;
        } else if (drawable instanceof AnonymousClass01H) {
            drawable2 = ((AnonymousClass01H) drawable).A00;
        } else if (!(drawable instanceof ScaleDrawable)) {
            return true;
        } else {
            drawable2 = ((ScaleDrawable) drawable).getDrawable();
        }
        return A03(drawable2);
    }
}

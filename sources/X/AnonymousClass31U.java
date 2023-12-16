package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;

/* renamed from: X.31U  reason: invalid class name */
public final class AnonymousClass31U {
    public static final Drawable A00(Resources resources, AnonymousClass5Y0 r7, String str) {
        C162457s7.A0J(str, 0);
        return r7.A04(resources, new C94284qs(str), 1.0f, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        if (A02(r7, r0) == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A01(android.content.Context r7, X.C56612sH r8, X.AnonymousClass3ZH r9) {
        /*
            r0 = 1
            X.C162457s7.A0J(r8, r0)
            r6 = 0
            if (r9 == 0) goto L_0x0017
            java.lang.String r5 = r9.A0Y
            if (r5 != 0) goto L_0x0018
            java.lang.String r0 = r9.A0X
            if (r0 == 0) goto L_0x0048
            if (r7 == 0) goto L_0x0048
            boolean r0 = A02(r7, r0)
            if (r0 != 0) goto L_0x0048
        L_0x0017:
            return r6
        L_0x0018:
            long r3 = r9.A0D
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0029
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0029
            return r6
        L_0x0029:
            java.lang.String r0 = r9.A0X
            if (r0 == 0) goto L_0x0047
            boolean r0 = X.C107575bX.A0F(r5)
            if (r0 != 0) goto L_0x0048
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r9.A0Y
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            java.lang.String r0 = r9.A0X
            java.lang.String r5 = X.AnonymousClass000.A0X(r0, r1)
        L_0x0047:
            return r5
        L_0x0048:
            java.lang.String r5 = r9.A0X
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass31U.A01(android.content.Context, X.2sH, X.3ZH):java.lang.String");
    }

    public static final boolean A02(Context context, String str) {
        if (str != null && !C175738Zn.A0V(str) && !str.equals(context.getString(R.string.f11nameremoved))) {
            TypedArray obtainTypedArray = context.getResources().obtainTypedArray(R.array.f2nameremoved);
            C162457s7.A0D(obtainTypedArray);
            int length = obtainTypedArray.length();
            int i = 0;
            while (i < length) {
                String string = obtainTypedArray.getString(i);
                if (string == null || !string.equals(str)) {
                    i++;
                } else {
                    obtainTypedArray.recycle();
                }
            }
            obtainTypedArray.recycle();
            return true;
        }
        return false;
    }
}

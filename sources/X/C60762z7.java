package X;

import android.content.Context;
import android.os.Build;
import com.whatsapp.R;

/* renamed from: X.2z7  reason: invalid class name and case insensitive filesystem */
public class C60762z7 {
    public static final int[] A03 = (Build.VERSION.SDK_INT >= 29 ? new int[]{R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved} : new int[]{R.string.f11nameremoved, R.string.f11nameremoved});
    public final Context A00;
    public final C54412og A01;
    public final C620733j A02;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r4 != 2) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r4 != 2) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A00() {
        /*
            r7 = this;
            android.content.Context r6 = r7.A00
            int[] r5 = A03
            X.2og r0 = r7.A01
            int r4 = r0.A01()
            int r3 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            r1 = 1
            r0 = 2
            if (r3 < r2) goto L_0x001e
            if (r4 == r1) goto L_0x0021
            if (r4 == r0) goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            r0 = r5[r0]
            java.lang.String r0 = r6.getString(r0)
            return r0
        L_0x001e:
            if (r4 == r0) goto L_0x0021
            goto L_0x0016
        L_0x0021:
            r0 = 1
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60762z7.A00():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r3 != 2) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002f, code lost:
        if (r3 != 2) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C89654ea r6) {
        /*
            r5 = this;
            X.2og r0 = r5.A01
            int r3 = r0.A01()
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r0 = 1
            r4 = 2
            if (r2 < r1) goto L_0x002f
            if (r3 == r0) goto L_0x0032
            if (r3 == r4) goto L_0x0013
        L_0x0012:
            r4 = 0
        L_0x0013:
            X.33j r1 = r5.A02
            int[] r0 = A03
            java.lang.String[] r3 = r1.A0V(r0)
            r2 = 2
            r0 = 2131893750(0x7f121df6, float:1.9422285E38)
            com.whatsapp.SingleSelectionDialogFragment r1 = new com.whatsapp.SingleSelectionDialogFragment
            r1.<init>()
            android.os.Bundle r0 = com.whatsapp.SingleSelectionDialogFragment.A00(r3, r2, r4, r0)
            r1.A0u(r0)
            r6.Boo(r1)
            return
        L_0x002f:
            if (r3 == r4) goto L_0x0032
            goto L_0x0012
        L_0x0032:
            r4 = 1
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60762z7.A01(X.4ea):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        if (r7 == 2) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (r7 != 1) goto L_0x0027;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(int r7) {
        /*
            r6 = this;
            X.2og r5 = r6.A01
            int r4 = r5.A01()
            int r3 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            r1 = 2
            r0 = 1
            if (r3 < r2) goto L_0x0025
            if (r7 == r0) goto L_0x0027
            r2 = -1
            if (r7 != r1) goto L_0x0014
        L_0x0013:
            r2 = 2
        L_0x0014:
            if (r4 == r2) goto L_0x0029
            android.content.SharedPreferences$Editor r1 = X.C54412og.A00(r5)
            java.lang.String r0 = "night_mode"
            X.C18270x1.A0h(r1, r0, r2)
            X.C06280Wy.A02(r2)
            r0 = 1
            return r0
        L_0x0025:
            if (r7 == r0) goto L_0x0013
        L_0x0027:
            r2 = 1
            goto L_0x0014
        L_0x0029:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60762z7.A02(int):boolean");
    }

    public C60762z7(Context context, C54412og r2, C620733j r3) {
        this.A00 = context;
        this.A02 = r3;
        this.A01 = r2;
    }
}

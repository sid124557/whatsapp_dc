package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.R;

/* renamed from: X.5Ze  reason: invalid class name and case insensitive filesystem */
public class C106485Ze {
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        if (r1 != 6) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003c, code lost:
        r1 = com.whatsapp.R.drawable.msg_status_waiting;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005f, code lost:
        if ((r9.A0K + 86400000) < r8.A0H()) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (X.AnonymousClass001.A1U(X.AnonymousClass358.A00(r9.A0D, 4)) != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable A00(android.content.Context r7, X.C56612sH r8, X.C624134x r9) {
        /*
            boolean r0 = X.C627636p.A0l(r9)
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            r3 = 4
            r2 = 0
            if (r0 == 0) goto L_0x001e
            X.2z0 r0 = r9.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x001e
            int r0 = r9.A0D
            int r0 = X.AnonymousClass358.A00(r0, r3)
            boolean r0 = X.AnonymousClass001.A1U(r0)
            if (r0 == 0) goto L_0x0056
        L_0x001d:
            return r2
        L_0x001e:
            X.2z0 r0 = r9.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x001d
            int r1 = r9.A0D
            if (r1 == 0) goto L_0x0056
            r0 = 8
            if (r1 == r0) goto L_0x004f
            r0 = 13
            if (r1 == r0) goto L_0x004f
            r0 = 20
            if (r1 == r0) goto L_0x0061
            if (r1 == r3) goto L_0x004b
            r0 = 5
            if (r1 == r0) goto L_0x0047
            r0 = 6
            if (r1 == r0) goto L_0x001d
        L_0x003c:
            r1 = 2131233221(0x7f0809c5, float:1.8082573E38)
        L_0x003f:
            r0 = 2131101895(0x7f0608c7, float:1.7816213E38)
        L_0x0042:
            android.graphics.drawable.Drawable r0 = X.C107335b8.A04(r7, r1, r0)
            return r0
        L_0x0047:
            r1 = 2131233158(0x7f080986, float:1.8082446E38)
            goto L_0x003f
        L_0x004b:
            r1 = 2131233205(0x7f0809b5, float:1.808254E38)
            goto L_0x003f
        L_0x004f:
            r1 = 2131233158(0x7f080986, float:1.8082446E38)
            r0 = 2131101894(0x7f0608c6, float:1.781621E38)
            goto L_0x0042
        L_0x0056:
            long r3 = r9.A0K
            long r3 = r3 + r5
            long r1 = r8.A0H()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x003c
        L_0x0061:
            r0 = 2131233170(0x7f080992, float:1.808247E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass0RP.A00(r7, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106485Ze.A00(android.content.Context, X.2sH, X.34x):android.graphics.drawable.Drawable");
    }

    public static String A01(Context context, AnonymousClass1n2 r3) {
        String A01 = AnonymousClass353.A01(r3);
        if (!TextUtils.isEmpty(A01)) {
            return A01;
        }
        if (C86614Ku.A1Z(r3) || AnonymousClass353.A04(r3)) {
            return context.getString(R.string.f11nameremoved);
        }
        return r3.A1w();
    }

    public static String A02(Context context, C31971pB r3) {
        String A01 = AnonymousClass353.A01(r3);
        if (!TextUtils.isEmpty(A01)) {
            return A01;
        }
        if (C86614Ku.A1Z(r3) || AnonymousClass353.A04(r3)) {
            return context.getString(R.string.f11nameremoved);
        }
        return r3.A1w();
    }
}

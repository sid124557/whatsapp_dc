package X;

import android.content.ClipData;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.5VR  reason: invalid class name */
public class AnonymousClass5VR {
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r1 != 3) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(android.content.Context r3, java.lang.Integer r4, java.lang.String r5, boolean r6) {
        /*
            if (r6 == 0) goto L_0x002b
            if (r4 == 0) goto L_0x002b
            int r1 = r4.intValue()
            r2 = 1
            if (r1 != r2) goto L_0x0013
            r2 = 2131891640(0x7f1215b8, float:1.9418006E38)
        L_0x000e:
            java.lang.String r0 = r3.getString(r2)
            return r0
        L_0x0013:
            r0 = 2
            if (r1 == r0) goto L_0x0019
            r0 = 6
            if (r1 != r0) goto L_0x0025
        L_0x0019:
            if (r5 == 0) goto L_0x0025
            r1 = 2131894132(0x7f121f74, float:1.942306E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r0 = X.C86614Ku.A0s(r3, r5, r0, r1)
            return r0
        L_0x0025:
            r0 = 3
            r2 = 2131888485(0x7f120965, float:1.9411607E38)
            if (r1 == r0) goto L_0x000e
        L_0x002b:
            r2 = 2131889902(0x7f120eee, float:1.941448E38)
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5VR.A00(android.content.Context, java.lang.Integer, java.lang.String, boolean):java.lang.String");
    }

    public static void A01(C69263Wi r3, C620633i r4, String str) {
        try {
            r4.A0C().setPrimaryClip(ClipData.newPlainText(str, str));
            r3.A0H(R.string.f11nameremoved, 0);
        } catch (NullPointerException | SecurityException e) {
            Log.e("sharedeeplink/copy/npe", e);
            r3.A0H(R.string.f11nameremoved, 0);
        }
    }
}

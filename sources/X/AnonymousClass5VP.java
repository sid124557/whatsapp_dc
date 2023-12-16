package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: X.5VP  reason: invalid class name */
public class AnonymousClass5VP {
    public static Drawable A00(Context context, AnonymousClass1nF r6) {
        String str = r6.A05;
        String A1x = r6.A1x();
        String A02 = C106695a0.A02(str);
        Locale locale = Locale.US;
        String upperCase = A02.toUpperCase(locale);
        if (TextUtils.isEmpty(upperCase) && !TextUtils.isEmpty(A1x)) {
            upperCase = C627536m.A08(A1x).toUpperCase(locale);
        }
        return A01(context, str, upperCase, false);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (android.text.TextUtils.isEmpty(r6) != false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        r2 = X.C86664Kz.A1L(X.C106695a0.A02(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005e, code lost:
        if (r5.equals(r0) == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
        r0 = com.whatsapp.R.drawable.icon_file_ppt;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0063, code lost:
        if (r7 == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0065, code lost:
        r0 = com.whatsapp.R.drawable.icon_file_ppt_large;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0078, code lost:
        if (r5.equals(r0) == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007a, code lost:
        r0 = com.whatsapp.R.drawable.icon_file_doc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007d, code lost:
        if (r7 == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007f, code lost:
        r0 = com.whatsapp.R.drawable.icon_file_doc_large;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0089, code lost:
        if (r5.equals(r0) == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008b, code lost:
        r0 = com.whatsapp.R.drawable.icon_file_xls;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008e, code lost:
        if (r7 == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0090, code lost:
        r0 = com.whatsapp.R.drawable.icon_file_xls_large;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0097, code lost:
        return X.AnonymousClass0RP.A00(r4, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable A01(android.content.Context r4, java.lang.String r5, java.lang.String r6, boolean r7) {
        /*
            if (r5 != 0) goto L_0x0023
            r3 = 2131232902(0x7f080886, float:1.8081926E38)
            if (r7 == 0) goto L_0x000a
            r3 = 2131232903(0x7f080887, float:1.8081928E38)
        L_0x000a:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x0098
            java.lang.String r2 = ""
        L_0x0012:
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131168442(0x7f070cba, float:1.7951186E38)
            int r1 = r1.getDimensionPixelSize(r0)
            X.4M6 r0 = new X.4M6
            r0.<init>(r4, r2, r3, r1)
            return r0
        L_0x0023:
            int r0 = r5.hashCode()
            switch(r0) {
                case -1248334925: goto L_0x0041;
                case -1248332507: goto L_0x0052;
                case -1073633483: goto L_0x0055;
                case -1071817359: goto L_0x0058;
                case -1050893613: goto L_0x0069;
                case -1004732798: goto L_0x006c;
                case -366307023: goto L_0x006f;
                case 904647503: goto L_0x0072;
                case 1993842850: goto L_0x0083;
                default: goto L_0x002a;
            }
        L_0x002a:
            r3 = 2131232902(0x7f080886, float:1.8081926E38)
            if (r7 == 0) goto L_0x0032
            r3 = 2131232903(0x7f080887, float:1.8081928E38)
        L_0x0032:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x0098
        L_0x0038:
            java.lang.String r0 = X.C106695a0.A02(r5)
            java.lang.String r2 = X.C86664Kz.A1L(r0)
            goto L_0x0012
        L_0x0041:
            java.lang.String r0 = "application/pdf"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x002a
            r3 = 2131232898(0x7f080882, float:1.8081918E38)
            if (r7 == 0) goto L_0x0038
            r3 = 2131232899(0x7f080883, float:1.808192E38)
            goto L_0x0038
        L_0x0052:
            java.lang.String r0 = "application/rtf"
            goto L_0x0074
        L_0x0055:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.presentationml.presentation"
            goto L_0x005a
        L_0x0058:
            java.lang.String r0 = "application/vnd.ms-powerpoint"
        L_0x005a:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x002a
            r0 = 2131232900(0x7f080884, float:1.8081922E38)
            if (r7 == 0) goto L_0x0093
            r0 = 2131232901(0x7f080885, float:1.8081924E38)
            goto L_0x0093
        L_0x0069:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.wordprocessingml.document"
            goto L_0x0074
        L_0x006c:
            java.lang.String r0 = "text/rtf"
            goto L_0x0074
        L_0x006f:
            java.lang.String r0 = "application/vnd.ms-excel"
            goto L_0x0085
        L_0x0072:
            java.lang.String r0 = "application/msword"
        L_0x0074:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x002a
            r0 = 2131232896(0x7f080880, float:1.8081914E38)
            if (r7 == 0) goto L_0x0093
            r0 = 2131232897(0x7f080881, float:1.8081916E38)
            goto L_0x0093
        L_0x0083:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
        L_0x0085:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x002a
            r0 = 2131232904(0x7f080888, float:1.808193E38)
            if (r7 == 0) goto L_0x0093
            r0 = 2131232905(0x7f080889, float:1.8081932E38)
        L_0x0093:
            android.graphics.drawable.Drawable r0 = X.AnonymousClass0RP.A00(r4, r0)
            return r0
        L_0x0098:
            java.lang.String r2 = X.C86664Kz.A1L(r6)
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5VP.A01(android.content.Context, java.lang.String, java.lang.String, boolean):android.graphics.drawable.Drawable");
    }
}

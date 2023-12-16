package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.9Wk  reason: invalid class name and case insensitive filesystem */
public class C195169Wk {
    public static int A00(int i) {
        if (i == 1) {
            return R.drawable.av_visa;
        }
        if (i == 2) {
            return R.drawable.av_mc;
        }
        if (i == 3) {
            return R.drawable.av_amex;
        }
        if (i != 4) {
            return R.drawable.av_card;
        }
        return R.drawable.av_discover;
    }

    public static int A01(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (C1899693i.A0D(list, i).A01 == 2) {
                return i;
            }
        }
        return 0;
    }

    public static String A04(Context context, C166587yw r3) {
        if (!TextUtils.isEmpty((CharSequence) null) || r3.A01 != 2) {
            return null;
        }
        return context.getString(R.string.f11nameremoved);
    }

    public static String A03(Context context, C166587yw r2) {
        C133796hx r0 = r2.A08;
        C626936e.A06(r0);
        if (!r0.A0B()) {
            return context.getString(R.string.f11nameremoved);
        }
        if (A04(context, r2) != null) {
            return A04(context, r2);
        }
        return "";
    }

    public static void A06(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("fetchIcon/costs ");
        sb.append(System.currentTimeMillis() - j);
        sb.append(" ms");
        Log.d(C160757oG.A01("PaymentMethodUtils", sb.toString()));
    }

    public static void A07(C166587yw r1, PaymentMethodRow paymentMethodRow) {
        int i;
        if (r1 instanceof C133736hr) {
            i = A00(((C133736hr) r1).A01);
        } else {
            Bitmap A09 = r1.A09();
            if (A09 != null) {
                paymentMethodRow.A01.setImageBitmap(A09);
                return;
            }
            i = R.drawable.av_bank;
        }
        paymentMethodRow.A04(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        if (r6 != null) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007d, code lost:
        if (r6 != null) goto L_0x007f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008a A[SYNTHETIC, Splitter:B:35:0x008a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A09(X.C56492s4 r10, java.lang.String r11) {
        /*
            java.lang.String r5 = "fetchIcon/Close InputStream: "
            java.lang.String r4 = "PaymentMethodUtils"
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r3 = 0
            if (r0 != 0) goto L_0x009f
            long r8 = java.lang.System.currentTimeMillis()
            r0 = 32768(0x8000, float:4.5918E-41)
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch:{ MalformedURLException -> 0x006f, IOException -> 0x005e, all -> 0x005c }
            r7.<init>(r0)     // Catch:{ MalformedURLException -> 0x006f, IOException -> 0x005e, all -> 0x005c }
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x006f, IOException -> 0x005e, all -> 0x005c }
            r0.<init>(r11)     // Catch:{ MalformedURLException -> 0x006f, IOException -> 0x005e, all -> 0x005c }
            java.net.URLConnection r2 = r0.openConnection()     // Catch:{ MalformedURLException -> 0x006f, IOException -> 0x005e, all -> 0x005c }
            r0 = 10000(0x2710, float:1.4013E-41)
            r2.setReadTimeout(r0)     // Catch:{ MalformedURLException -> 0x006f, IOException -> 0x005e, all -> 0x005c }
            r2.setConnectTimeout(r0)     // Catch:{ MalformedURLException -> 0x006f, IOException -> 0x005e, all -> 0x005c }
            java.lang.Integer r1 = X.C18320x8.A0W()     // Catch:{ MalformedURLException -> 0x006f, IOException -> 0x005e, all -> 0x005c }
            java.io.InputStream r0 = r2.getInputStream()     // Catch:{ MalformedURLException -> 0x006f, IOException -> 0x005e, all -> 0x005c }
            X.1zz r6 = new X.1zz     // Catch:{ MalformedURLException -> 0x006f, IOException -> 0x005e, all -> 0x005c }
            r6.<init>(r10, r0, r3, r1)     // Catch:{ MalformedURLException -> 0x006f, IOException -> 0x005e, all -> 0x005c }
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r6)     // Catch:{ MalformedURLException -> 0x005a, IOException -> 0x0058 }
            if (r2 != 0) goto L_0x0049
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ MalformedURLException -> 0x005a, IOException -> 0x0058 }
            java.lang.String r0 = "fetchIcon/failed to decode image data/url="
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r11, r1)     // Catch:{ MalformedURLException -> 0x005a, IOException -> 0x0058 }
            X.C1899593h.A1Q(r4, r0)     // Catch:{ MalformedURLException -> 0x005a, IOException -> 0x0058 }
            goto L_0x0054
        L_0x0049:
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ MalformedURLException -> 0x005a, IOException -> 0x0058 }
            r0 = 100
            r2.compress(r1, r0, r7)     // Catch:{ MalformedURLException -> 0x005a, IOException -> 0x0058 }
            byte[] r3 = r7.toByteArray()     // Catch:{ MalformedURLException -> 0x005a, IOException -> 0x0058 }
        L_0x0054:
            A06(r8)
            goto L_0x007f
        L_0x0058:
            r1 = move-exception
            goto L_0x0060
        L_0x005a:
            r1 = move-exception
            goto L_0x0071
        L_0x005c:
            r2 = move-exception
            goto L_0x0085
        L_0x005e:
            r1 = move-exception
            r6 = r3
        L_0x0060:
            java.lang.String r0 = "/fetchIcon/IOException: "
            java.lang.String r0 = X.C160757oG.A01(r4, r0)     // Catch:{ all -> 0x0083 }
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0083 }
            A06(r8)
            if (r6 == 0) goto L_0x009f
            goto L_0x007f
        L_0x006f:
            r1 = move-exception
            r6 = r3
        L_0x0071:
            java.lang.String r0 = "fetchIcon/Malformed URL: "
            java.lang.String r0 = X.C160757oG.A01(r4, r0)     // Catch:{ all -> 0x0083 }
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0083 }
            A06(r8)
            if (r6 == 0) goto L_0x009f
        L_0x007f:
            r6.close()     // Catch:{ IOException -> 0x0097 }
            return r3
        L_0x0083:
            r2 = move-exception
            r3 = r6
        L_0x0085:
            A06(r8)
            if (r3 == 0) goto L_0x0096
            r3.close()     // Catch:{ IOException -> 0x008e }
            throw r2
        L_0x008e:
            r1 = move-exception
            java.lang.String r0 = X.C160757oG.A01(r4, r5)
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0096:
            throw r2
        L_0x0097:
            r1 = move-exception
            java.lang.String r0 = X.C160757oG.A01(r4, r5)
            com.whatsapp.util.Log.w(r0, r1)
        L_0x009f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195169Wk.A09(X.2s4, java.lang.String):byte[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A02(android.content.Context r7, X.C133736hr r8) {
        /*
            r0 = 2131894596(0x7f122144, float:1.9424001E38)
            java.lang.String r3 = r7.getString(r0)
            int r0 = r8.A01
            java.lang.String r5 = X.C133736hr.A03(r0)
            java.lang.String r6 = ""
            if (r5 != 0) goto L_0x0012
            r5 = r6
        L_0x0012:
            int r2 = r8.A00
            r4 = 1
            r1 = 2131891707(0x7f1215fb, float:1.9418142E38)
            if (r2 == r4) goto L_0x0026
            r0 = 4
            r1 = 2131891706(0x7f1215fa, float:1.941814E38)
            if (r2 == r0) goto L_0x0026
            r0 = 6
            if (r2 != r0) goto L_0x0066
            r1 = 2131891705(0x7f1215f9, float:1.9418138E38)
        L_0x0026:
            java.lang.String r0 = r7.getString(r1)
        L_0x002a:
            if (r0 == 0) goto L_0x0041
            r1 = 2131891707(0x7f1215fb, float:1.9418142E38)
            if (r2 == r4) goto L_0x003d
            r0 = 4
            r1 = 2131891706(0x7f1215fa, float:1.941814E38)
            if (r2 == r0) goto L_0x003d
            r0 = 6
            if (r2 != r0) goto L_0x0061
            r1 = 2131891705(0x7f1215f9, float:1.9418138E38)
        L_0x003d:
            java.lang.String r6 = r7.getString(r1)
        L_0x0041:
            X.7yt r1 = r8.A09
            boolean r0 = X.C161527pr.A03(r1)
            if (r0 != 0) goto L_0x0060
            java.lang.String r0 = X.C1899693i.A0e(r1)
            java.lang.String r3 = A05(r0)
            r2 = 2131891794(0x7f121652, float:1.9418318E38)
            r0 = 3
            java.lang.Object[] r1 = X.AnonymousClass6C9.A1Z(r5, r0)
            r1[r4] = r6
            r0 = 2
            java.lang.String r3 = X.AnonymousClass002.A0F(r7, r3, r1, r0, r2)
        L_0x0060:
            return r3
        L_0x0061:
            java.lang.String r6 = X.C166587yw.A06(r2)
            goto L_0x0041
        L_0x0066:
            java.lang.String r0 = X.C166587yw.A06(r2)
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195169Wk.A02(android.content.Context, X.6hr):java.lang.String");
    }

    public static String A05(String str) {
        int length = str.length();
        if (length > 4) {
            str = str.substring(length - 4);
        }
        int length2 = str.length();
        int i = length2 - 1;
        int i2 = 0;
        while (i >= 0 && Character.isDigit(str.charAt(i))) {
            i2++;
            i--;
        }
        if (i2 != length2) {
            return str.substring(length2 - i2);
        }
        return str;
    }

    public static boolean A08(C166587yw r2) {
        int A08 = r2.A08();
        if (A08 == 4 || A08 == 1 || A08 == 6 || A08 == 8 || A08 == 7) {
            return true;
        }
        return false;
    }
}

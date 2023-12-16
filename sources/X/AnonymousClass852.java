package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.852  reason: invalid class name */
public class AnonymousClass852 implements C180528lD {
    public final C54372oc A00;
    public final C180598lK A01;

    public /* bridge */ /* synthetic */ void BXh(C157277i2 r12, C150297Qb r13, File file) {
        String str;
        long j;
        C126316Nj r9 = (C126316Nj) r13;
        File file2 = file;
        if (r9.A03) {
            try {
                str = file.getCanonicalPath();
            } catch (IOException unused) {
                str = file.getAbsolutePath();
            }
            long optLong = this.A00.A01(str).optLong("last_measured_size", -1);
            C180598lK r3 = this.A01;
            if (((C183808qg) r3).BI1()) {
                j = r9.A01;
            } else {
                j = r9.A00;
            }
            if (optLong > j) {
                r3.B1O(file);
                file.mkdirs();
            }
        }
        ((C180578lI) this.A01).B7T(C141406vW.CONCURRENT).execute(new C71593cM((Object) this, (Object) r12, (Object) file2, (Object) r9, 3));
    }

    public AnonymousClass852(C180598lK r2) {
        this.A01 = r2;
        this.A00 = ((C180548lF) r2).BDL("max_size");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0005 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C126286Ng r7, java.io.File r8, long r9) {
        /*
            r6 = this;
            java.lang.String r5 = r8.getCanonicalPath()     // Catch:{ IOException -> 0x0005 }
            goto L_0x0009
        L_0x0005:
            java.lang.String r5 = r8.getAbsolutePath()     // Catch:{ JSONException -> 0x0031 }
        L_0x0009:
            org.json.JSONObject r4 = r7.Bqp()     // Catch:{ JSONException -> 0x0031 }
            X.7Qb r0 = r7.A00     // Catch:{ JSONException -> 0x0031 }
            X.6Nj r0 = (X.C126316Nj) r0     // Catch:{ JSONException -> 0x0031 }
            boolean r0 = r0.A03     // Catch:{ JSONException -> 0x0031 }
            if (r0 == 0) goto L_0x002c
            r1 = 0
            java.lang.String r3 = "last_measured_size"
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0029
            X.2oc r0 = r6.A00     // Catch:{ JSONException -> 0x0031 }
            org.json.JSONObject r2 = r0.A01(r5)     // Catch:{ JSONException -> 0x0031 }
            r0 = -1
            long r9 = r2.optLong(r3, r0)     // Catch:{ JSONException -> 0x0031 }
        L_0x0029:
            r4.put(r3, r9)     // Catch:{ JSONException -> 0x0031 }
        L_0x002c:
            X.2oc r0 = r6.A00     // Catch:{ JSONException -> 0x0031 }
            r0.A03(r5, r4)     // Catch:{ JSONException -> 0x0031 }
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass852.A00(X.6Ng, java.io.File, long):void");
    }
}

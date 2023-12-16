package X;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: X.0wR  reason: invalid class name and case insensitive filesystem */
public class C17910wR implements Callable {
    public Object A00;
    public String A01;
    public String A02;
    public final int A03;

    public C17910wR(Context context, String str, String str2, int i) {
        this.A03 = i;
        this.A00 = context;
        this.A02 = str;
        this.A01 = str2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(16:3|(2:5|1b)|22|(11:24|25|26|(1:28)|30|31|(1:33)|34|(1:36)(1:40)|37|(3:39|105|(2:107|108)(1:129)))|41|43|44|45|46|(12:48|49|(1:51)|52|(2:60|(6:62|100|101|(1:128)|105|(0)(0))(1:63))(2:56|(6:58|100|101|(0)|105|(0)(0))(1:59))|64|(2:66|(1:68))|100|101|(0)|105|(0)(0))|69|70|(7:72|95|100|101|(0)|105|(0)(0))|73|74|(3:75|76|(1:78)(10:79|80|81|82|95|100|101|(0)|105|(0)(0)))) */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0075, code lost:
        if (r8.exists() != false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e9, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        X.AnonymousClass0S3.A01("get error failed ", r1);
        r0 = r1.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0203, code lost:
        if (r7 == null) goto L_0x020d;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0186 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x0193 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x01da */
    /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x01e8 */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0191 A[Catch:{ IOException -> 0x0193 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01ce A[Catch:{ Exception -> 0x01e2, all -> 0x01e4 }, LOOP:0: B:75:0x01c8->B:78:0x01ce, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01d7 A[SYNTHETIC, Splitter:B:79:0x01d7] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r10 = this;
            int r0 = r10.A03
            if (r0 == 0) goto L_0x0011
            java.lang.Object r2 = r10.A00
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r1 = r10.A02
            java.lang.String r0 = r10.A01
            X.0Tu r4 = X.AnonymousClass0YR.A01(r2, r1, r0)
        L_0x0010:
            return r4
        L_0x0011:
            java.lang.Object r4 = r10.A00
            android.content.Context r4 = (android.content.Context) r4
            X.0LK r6 = X.AnonymousClass0K1.A02
            if (r6 != 0) goto L_0x0045
            java.lang.Class<X.0LK> r3 = X.AnonymousClass0LK.class
            monitor-enter(r3)
            X.0LK r6 = X.AnonymousClass0K1.A02     // Catch:{ all -> 0x021e }
            if (r6 != 0) goto L_0x0044
            X.0Tr r2 = X.AnonymousClass0K1.A01     // Catch:{ all -> 0x021e }
            if (r2 != 0) goto L_0x0038
            java.lang.Class<X.0Tr> r1 = X.AnonymousClass0Tr.class
            monitor-enter(r1)     // Catch:{ all -> 0x021e }
            X.0Tr r2 = X.AnonymousClass0K1.A01     // Catch:{ all -> 0x021b }
            if (r2 != 0) goto L_0x0037
            X.0Kf r0 = new X.0Kf     // Catch:{ all -> 0x021b }
            r0.<init>(r4)     // Catch:{ all -> 0x021b }
            X.0Tr r2 = new X.0Tr     // Catch:{ all -> 0x021b }
            r2.<init>(r0)     // Catch:{ all -> 0x021b }
            X.AnonymousClass0K1.A01 = r2     // Catch:{ all -> 0x021b }
        L_0x0037:
            monitor-exit(r1)     // Catch:{ all -> 0x021b }
        L_0x0038:
            X.0J5 r0 = new X.0J5     // Catch:{ all -> 0x021e }
            r0.<init>()     // Catch:{ all -> 0x021e }
            X.0LK r6 = new X.0LK     // Catch:{ all -> 0x021e }
            r6.<init>(r0, r2)     // Catch:{ all -> 0x021e }
            X.AnonymousClass0K1.A02 = r6     // Catch:{ all -> 0x021e }
        L_0x0044:
            monitor-exit(r3)     // Catch:{ all -> 0x021e }
        L_0x0045:
            java.lang.String r5 = r10.A02
            java.lang.String r3 = r10.A01
            r4 = 0
            if (r3 == 0) goto L_0x00b5
            X.0Tr r9 = r6.A01
            java.io.File r1 = r9.A01()     // Catch:{ FileNotFoundException -> 0x00b5 }
            X.0GE r7 = X.AnonymousClass0GE.JSON     // Catch:{ FileNotFoundException -> 0x00b5 }
            r2 = 0
            java.lang.String r0 = X.AnonymousClass0Tr.A00(r7, r5, r2)     // Catch:{ FileNotFoundException -> 0x00b5 }
            java.io.File r8 = X.AnonymousClass002.A0A(r1, r0)     // Catch:{ FileNotFoundException -> 0x00b5 }
            boolean r0 = r8.exists()     // Catch:{ FileNotFoundException -> 0x00b5 }
            if (r0 != 0) goto L_0x0077
            java.io.File r1 = r9.A01()     // Catch:{ FileNotFoundException -> 0x00b5 }
            X.0GE r0 = X.AnonymousClass0GE.ZIP     // Catch:{ FileNotFoundException -> 0x00b5 }
            java.lang.String r0 = X.AnonymousClass0Tr.A00(r0, r5, r2)     // Catch:{ FileNotFoundException -> 0x00b5 }
            java.io.File r8 = X.AnonymousClass002.A0A(r1, r0)     // Catch:{ FileNotFoundException -> 0x00b5 }
            boolean r0 = r8.exists()     // Catch:{ FileNotFoundException -> 0x00b5 }
            if (r0 == 0) goto L_0x00b5
        L_0x0077:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00b5 }
            r2.<init>(r8)     // Catch:{ FileNotFoundException -> 0x00b5 }
            java.lang.String r1 = r8.getAbsolutePath()
            java.lang.String r0 = ".zip"
            boolean r0 = r1.endsWith(r0)
            if (r0 == 0) goto L_0x008a
            X.0GE r7 = X.AnonymousClass0GE.ZIP
        L_0x008a:
            r8.getAbsolutePath()
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r7, r2)
            java.lang.Object r2 = r0.first
            java.lang.Object r1 = r0.second
            java.io.InputStream r1 = (java.io.InputStream) r1
            X.0GE r0 = X.AnonymousClass0GE.ZIP
            if (r2 != r0) goto L_0x00b0
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream
            r0.<init>(r1)
            X.0Tu r0 = X.AnonymousClass0YR.A04(r5, r0)
        L_0x00a5:
            java.lang.Object r0 = r0.A00
            if (r0 == 0) goto L_0x00b5
            X.0Tu r4 = new X.0Tu
            r4.<init>((java.lang.Object) r0)
            goto L_0x020f
        L_0x00b0:
            X.0Tu r0 = X.AnonymousClass0YR.A03(r1, r5)
            goto L_0x00a5
        L_0x00b5:
            java.lang.String r2 = "LottieFetchResult close failed "
            r7 = 0
            java.net.URL r0 = new java.net.URL     // Catch:{ Exception -> 0x01fd }
            r0.<init>(r5)     // Catch:{ Exception -> 0x01fd }
            java.net.URLConnection r1 = r0.openConnection()     // Catch:{ Exception -> 0x01fd }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ Exception -> 0x01fd }
            java.lang.String r0 = "GET"
            r1.setRequestMethod(r0)     // Catch:{ Exception -> 0x01fd }
            r1.connect()     // Catch:{ Exception -> 0x01fd }
            X.0hx r0 = new X.0hx     // Catch:{ Exception -> 0x01fd }
            r0.<init>(r1)     // Catch:{ Exception -> 0x01fd }
            r7 = r0
            java.net.HttpURLConnection r8 = r0.A00     // Catch:{ IOException -> 0x0186 }
            int r0 = r8.getResponseCode()     // Catch:{ IOException -> 0x0186 }
            int r1 = r0 / 100
            r0 = 2
            if (r1 != r0) goto L_0x0186
            java.io.InputStream r9 = r8.getInputStream()     // Catch:{ Exception -> 0x01fd }
            java.lang.String r1 = r8.getContentType()     // Catch:{ Exception -> 0x01fd }
            if (r1 != 0) goto L_0x00e8
            java.lang.String r1 = "application/json"
        L_0x00e8:
            java.lang.String r0 = "application/zip"
            boolean r0 = r1.contains(r0)     // Catch:{ Exception -> 0x01fd }
            if (r0 != 0) goto L_0x0123
            java.lang.String r0 = "\\?"
            java.lang.String[] r1 = r5.split(r0)     // Catch:{ Exception -> 0x01fd }
            r0 = 0
            r1 = r1[r0]     // Catch:{ Exception -> 0x01fd }
            java.lang.String r0 = ".lottie"
            boolean r0 = r1.endsWith(r0)     // Catch:{ Exception -> 0x01fd }
            if (r0 != 0) goto L_0x0123
            X.0GE r8 = X.AnonymousClass0GE.JSON     // Catch:{ Exception -> 0x01fd }
            if (r3 != 0) goto L_0x010b
            X.0Tu r4 = X.AnonymousClass0YR.A03(r9, r4)     // Catch:{ Exception -> 0x01fd }
            goto L_0x0205
        L_0x010b:
            X.0Tr r6 = r6.A01     // Catch:{ Exception -> 0x01fd }
            java.io.File r0 = r6.A02(r8, r9, r5)     // Catch:{ Exception -> 0x01fd }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x01fd }
            java.io.File r1 = X.AnonymousClass002.A0B(r0)     // Catch:{ Exception -> 0x01fd }
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x01fd }
            r0.<init>(r1)     // Catch:{ Exception -> 0x01fd }
            X.0Tu r4 = X.AnonymousClass0YR.A03(r0, r5)     // Catch:{ Exception -> 0x01fd }
            goto L_0x0146
        L_0x0123:
            X.0GE r8 = X.AnonymousClass0GE.ZIP     // Catch:{ Exception -> 0x01fd }
            if (r3 != 0) goto L_0x0132
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream     // Catch:{ Exception -> 0x01fd }
            r0.<init>(r9)     // Catch:{ Exception -> 0x01fd }
            X.0Tu r4 = X.AnonymousClass0YR.A04(r4, r0)     // Catch:{ Exception -> 0x01fd }
            goto L_0x0205
        L_0x0132:
            X.0Tr r6 = r6.A01     // Catch:{ Exception -> 0x01fd }
            java.io.File r0 = r6.A02(r8, r9, r5)     // Catch:{ Exception -> 0x01fd }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x01fd }
            r1.<init>(r0)     // Catch:{ Exception -> 0x01fd }
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream     // Catch:{ Exception -> 0x01fd }
            r0.<init>(r1)     // Catch:{ Exception -> 0x01fd }
            X.0Tu r4 = X.AnonymousClass0YR.A04(r5, r0)     // Catch:{ Exception -> 0x01fd }
        L_0x0146:
            java.lang.Object r0 = r4.A00     // Catch:{ Exception -> 0x01fd }
            if (r0 == 0) goto L_0x0205
            r0 = 1
            java.lang.String r1 = X.AnonymousClass0Tr.A00(r8, r5, r0)     // Catch:{ Exception -> 0x01fd }
            java.io.File r0 = r6.A01()     // Catch:{ Exception -> 0x01fd }
            java.io.File r6 = X.AnonymousClass002.A0A(r0, r1)     // Catch:{ Exception -> 0x01fd }
            java.lang.String r5 = r6.getAbsolutePath()     // Catch:{ Exception -> 0x01fd }
            java.lang.String r1 = ".temp"
            java.lang.String r0 = ""
            java.lang.String r0 = r5.replace(r1, r0)     // Catch:{ Exception -> 0x01fd }
            java.io.File r5 = X.AnonymousClass002.A0B(r0)     // Catch:{ Exception -> 0x01fd }
            boolean r0 = r6.renameTo(r5)     // Catch:{ Exception -> 0x01fd }
            if (r0 != 0) goto L_0x0205
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x01fd }
            java.lang.String r0 = "Unable to rename cache file "
            X.AnonymousClass000.A10(r6, r0, r1)     // Catch:{ Exception -> 0x01fd }
            java.lang.String r0 = " to "
            X.AnonymousClass000.A10(r5, r0, r1)     // Catch:{ Exception -> 0x01fd }
            java.lang.String r0 = "."
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ Exception -> 0x01fd }
            X.AnonymousClass0S3.A00(r0)     // Catch:{ Exception -> 0x01fd }
            goto L_0x0205
        L_0x0186:
            java.net.HttpURLConnection r0 = r7.A00     // Catch:{ IOException -> 0x0193 }
            int r0 = r0.getResponseCode()     // Catch:{ IOException -> 0x0193 }
            int r1 = r0 / 100
            r0 = 2
            if (r1 != r0) goto L_0x0193
            r0 = 0
            goto L_0x01f3
        L_0x0193:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x01e9 }
            java.lang.String r0 = "Unable to fetch "
            r5.append(r0)     // Catch:{ IOException -> 0x01e9 }
            java.net.HttpURLConnection r1 = r7.A00     // Catch:{ IOException -> 0x01e9 }
            java.net.URL r0 = r1.getURL()     // Catch:{ IOException -> 0x01e9 }
            r5.append(r0)     // Catch:{ IOException -> 0x01e9 }
            java.lang.String r0 = ". Failed with "
            r5.append(r0)     // Catch:{ IOException -> 0x01e9 }
            int r0 = r1.getResponseCode()     // Catch:{ IOException -> 0x01e9 }
            r5.append(r0)     // Catch:{ IOException -> 0x01e9 }
            java.lang.String r0 = "\n"
            r5.append(r0)     // Catch:{ IOException -> 0x01e9 }
            java.io.InputStream r1 = r1.getErrorStream()     // Catch:{ IOException -> 0x01e9 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x01e9 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x01e9 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException -> 0x01e9 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x01e9 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x01e9 }
        L_0x01c8:
            java.lang.String r0 = r4.readLine()     // Catch:{ Exception -> 0x01e2 }
            if (r0 == 0) goto L_0x01d7
            r1.append(r0)     // Catch:{ Exception -> 0x01e2 }
            r0 = 10
            r1.append(r0)     // Catch:{ Exception -> 0x01e2 }
            goto L_0x01c8
        L_0x01d7:
            r4.close()     // Catch:{ Exception -> 0x01da }
        L_0x01da:
            X.AnonymousClass000.A1B(r1, r5)     // Catch:{ IOException -> 0x01e9 }
            java.lang.String r0 = r5.toString()     // Catch:{ IOException -> 0x01e9 }
            goto L_0x01f3
        L_0x01e2:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01e4 }
        L_0x01e4:
            r0 = move-exception
            r4.close()     // Catch:{ Exception -> 0x01e8 }
        L_0x01e8:
            throw r0     // Catch:{ IOException -> 0x01e9 }
        L_0x01e9:
            r1 = move-exception
            java.lang.String r0 = "get error failed "
            X.AnonymousClass0S3.A01(r0, r1)     // Catch:{ Exception -> 0x01fd }
            java.lang.String r0 = r1.getMessage()     // Catch:{ Exception -> 0x01fd }
        L_0x01f3:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ Exception -> 0x01fd }
            X.0Tu r4 = new X.0Tu     // Catch:{ Exception -> 0x01fd }
            r4.<init>((java.lang.Throwable) r0)     // Catch:{ Exception -> 0x01fd }
            goto L_0x0205
        L_0x01fd:
            r0 = move-exception
            X.0Tu r4 = new X.0Tu     // Catch:{ all -> 0x0221 }
            r4.<init>((java.lang.Throwable) r0)     // Catch:{ all -> 0x0221 }
            if (r7 == 0) goto L_0x020d
        L_0x0205:
            r7.close()     // Catch:{ IOException -> 0x0209 }
            goto L_0x020d
        L_0x0209:
            r0 = move-exception
            X.AnonymousClass0S3.A01(r2, r0)
        L_0x020d:
            if (r3 == 0) goto L_0x0010
        L_0x020f:
            java.lang.Object r1 = r4.A00
            if (r1 == 0) goto L_0x0010
            X.0Sx r0 = X.C05330Sx.A01
            X.0Qw r0 = r0.A00
            r0.A08(r3, r1)
            return r4
        L_0x021b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x021b }
            throw r0     // Catch:{ all -> 0x021e }
        L_0x021e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x021e }
            throw r0
        L_0x0221:
            r1 = move-exception
            if (r7 == 0) goto L_0x022c
            r7.close()     // Catch:{ IOException -> 0x0228 }
            throw r1
        L_0x0228:
            r0 = move-exception
            X.AnonymousClass0S3.A01(r2, r0)
        L_0x022c:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17910wR.call():java.lang.Object");
    }
}

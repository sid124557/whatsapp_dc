package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0Vb  reason: invalid class name and case insensitive filesystem */
public class C05810Vb {
    public static final C04840Qw A00 = new C04840Qw(16);
    public static final C06290Wz A01 = new C06290Wz();
    public static final Object A02 = AnonymousClass002.A0D();
    public static final ExecutorService A03;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) SearchActionVerificationClientService.NOTIFICATION_ID, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new C13710nc());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        A03 = threadPoolExecutor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008a, code lost:
        r2 = r7.authority;
        r4 = X.AnonymousClass001.A0s();
        r15 = new android.net.Uri.Builder().scheme("content").authority(r2).build();
        r14 = new android.net.Uri.Builder().scheme("content").authority(r2).appendPath("file").build();
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r16 = r24.getContentResolver();
        r3 = X.C02870Hx.A00(r16, r15, (java.lang.Object) null, "query = ?", (java.lang.String) null, new java.lang.String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, new java.lang.String[]{r8.A03});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f3, code lost:
        if (r3 == null) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f9, code lost:
        if (r3.getCount() <= 0) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00fb, code lost:
        r8 = r3.getColumnIndex("result_code");
        r4 = X.AnonymousClass001.A0s();
        r13 = r3.getColumnIndex("_id");
        r7 = r3.getColumnIndex("file_id");
        r6 = r3.getColumnIndex("font_ttc_index");
        r5 = r3.getColumnIndex("font_weight");
        r2 = r3.getColumnIndex("font_italic");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x011b, code lost:
        if (r3.moveToNext() == false) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x011e, code lost:
        if (r8 == -1) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0120, code lost:
        r20 = r3.getInt(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0125, code lost:
        r20 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0127, code lost:
        if (r6 == -1) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0129, code lost:
        r18 = r3.getInt(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x012e, code lost:
        r18 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0130, code lost:
        if (r7 != -1) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0132, code lost:
        r17 = android.content.ContentUris.withAppendedId(r15, r3.getLong(r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x013b, code lost:
        r17 = android.content.ContentUris.withAppendedId(r14, r3.getLong(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0143, code lost:
        if (r5 == -1) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0145, code lost:
        r19 = r3.getInt(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x014a, code lost:
        r19 = 400;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x014c, code lost:
        if (r2 == -1) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x014e, code lost:
        r21 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0154, code lost:
        if (r3.getInt(r2) == 1) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0156, code lost:
        r21 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0158, code lost:
        r4.add(new X.AnonymousClass0MK(r17, r18, r19, r20, r21));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0166, code lost:
        r2 = new X.AnonymousClass0L4((X.AnonymousClass0MK[]) r4.toArray(new X.AnonymousClass0MK[0]), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0176, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0177, code lost:
        if (r3 != null) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r3.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C05350Sz A00(android.content.Context r24, X.C04200Nf r25, java.lang.String r26, int r27) {
        /*
            X.0Qw r12 = A00
            r23 = r26
            r0 = r23
            java.lang.Object r2 = r12.A04(r0)
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2
            if (r2 != 0) goto L_0x01c9
            r11 = 0
            android.content.pm.PackageManager r4 = r24.getPackageManager()     // Catch:{ NameNotFoundException -> 0x01ac }
            r24.getResources()     // Catch:{ NameNotFoundException -> 0x01ac }
            r8 = r25
            java.lang.String r3 = r8.A01     // Catch:{ NameNotFoundException -> 0x01ac }
            r9 = 0
            android.content.pm.ProviderInfo r7 = r4.resolveContentProvider(r3, r9)     // Catch:{ NameNotFoundException -> 0x01ac }
            if (r7 == 0) goto L_0x0184
            java.lang.String r1 = r7.packageName     // Catch:{ NameNotFoundException -> 0x01ac }
            java.lang.String r2 = r8.A02     // Catch:{ NameNotFoundException -> 0x01ac }
            boolean r0 = r1.equals(r2)     // Catch:{ NameNotFoundException -> 0x01ac }
            if (r0 == 0) goto L_0x0194
            r0 = 64
            android.content.pm.PackageInfo r0 = r4.getPackageInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x01ac }
            android.content.pm.Signature[] r3 = r0.signatures     // Catch:{ NameNotFoundException -> 0x01ac }
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()     // Catch:{ NameNotFoundException -> 0x01ac }
            int r2 = r3.length     // Catch:{ NameNotFoundException -> 0x01ac }
            r1 = 0
        L_0x0039:
            if (r1 >= r2) goto L_0x0047
            r0 = r3[r1]     // Catch:{ NameNotFoundException -> 0x01ac }
            byte[] r0 = r0.toByteArray()     // Catch:{ NameNotFoundException -> 0x01ac }
            r6.add(r0)     // Catch:{ NameNotFoundException -> 0x01ac }
            int r1 = r1 + 1
            goto L_0x0039
        L_0x0047:
            java.util.Comparator r5 = X.AnonymousClass0JW.A00     // Catch:{ NameNotFoundException -> 0x01ac }
            java.util.Collections.sort(r6, r5)     // Catch:{ NameNotFoundException -> 0x01ac }
            java.util.List r4 = r8.A04     // Catch:{ NameNotFoundException -> 0x01ac }
        L_0x004e:
            int r0 = r4.size()     // Catch:{ NameNotFoundException -> 0x01ac }
            if (r9 >= r0) goto L_0x017d
            java.lang.Object r0 = r4.get(r9)     // Catch:{ NameNotFoundException -> 0x01ac }
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ NameNotFoundException -> 0x01ac }
            java.util.ArrayList r3 = X.AnonymousClass002.A0J(r0)     // Catch:{ NameNotFoundException -> 0x01ac }
            java.util.Collections.sort(r3, r5)     // Catch:{ NameNotFoundException -> 0x01ac }
            int r1 = r6.size()     // Catch:{ NameNotFoundException -> 0x01ac }
            int r0 = r3.size()     // Catch:{ NameNotFoundException -> 0x01ac }
            if (r1 != r0) goto L_0x0087
            r2 = 0
        L_0x006c:
            int r0 = r6.size()     // Catch:{ NameNotFoundException -> 0x01ac }
            if (r2 >= r0) goto L_0x008a
            java.lang.Object r1 = r6.get(r2)     // Catch:{ NameNotFoundException -> 0x01ac }
            byte[] r1 = (byte[]) r1     // Catch:{ NameNotFoundException -> 0x01ac }
            java.lang.Object r0 = r3.get(r2)     // Catch:{ NameNotFoundException -> 0x01ac }
            byte[] r0 = (byte[]) r0     // Catch:{ NameNotFoundException -> 0x01ac }
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ NameNotFoundException -> 0x01ac }
            if (r0 == 0) goto L_0x0087
            int r2 = r2 + 1
            goto L_0x006c
        L_0x0087:
            int r9 = r9 + 1
            goto L_0x004e
        L_0x008a:
            java.lang.String r2 = r7.authority     // Catch:{ NameNotFoundException -> 0x01ac }
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()     // Catch:{ NameNotFoundException -> 0x01ac }
            android.net.Uri$Builder r0 = new android.net.Uri$Builder     // Catch:{ NameNotFoundException -> 0x01ac }
            r0.<init>()     // Catch:{ NameNotFoundException -> 0x01ac }
            java.lang.String r1 = "content"
            android.net.Uri$Builder r0 = r0.scheme(r1)     // Catch:{ NameNotFoundException -> 0x01ac }
            android.net.Uri$Builder r0 = r0.authority(r2)     // Catch:{ NameNotFoundException -> 0x01ac }
            android.net.Uri r15 = r0.build()     // Catch:{ NameNotFoundException -> 0x01ac }
            android.net.Uri$Builder r0 = new android.net.Uri$Builder     // Catch:{ NameNotFoundException -> 0x01ac }
            r0.<init>()     // Catch:{ NameNotFoundException -> 0x01ac }
            android.net.Uri$Builder r0 = r0.scheme(r1)     // Catch:{ NameNotFoundException -> 0x01ac }
            android.net.Uri$Builder r1 = r0.authority(r2)     // Catch:{ NameNotFoundException -> 0x01ac }
            java.lang.String r0 = "file"
            android.net.Uri$Builder r0 = r1.appendPath(r0)     // Catch:{ NameNotFoundException -> 0x01ac }
            android.net.Uri r14 = r0.build()     // Catch:{ NameNotFoundException -> 0x01ac }
            r3 = 0
            java.lang.String r7 = "_id"
            java.lang.String r6 = "file_id"
            java.lang.String r5 = "font_ttc_index"
            java.lang.String r19 = "font_variation_settings"
            java.lang.String r2 = "font_weight"
            java.lang.String r1 = "font_italic"
            java.lang.String r0 = "result_code"
            r18 = r5
            r20 = r2
            r21 = r1
            r22 = r0
            r16 = r7
            r17 = r6
            java.lang.String[] r21 = new java.lang.String[]{r16, r17, r18, r19, r20, r21, r22}     // Catch:{ all -> 0x0176 }
            android.content.ContentResolver r16 = r24.getContentResolver()     // Catch:{ all -> 0x0176 }
            java.lang.String r19 = "query = ?"
            r10 = 1
            java.lang.String[] r9 = new java.lang.String[r10]     // Catch:{ all -> 0x0176 }
            java.lang.String r8 = r8.A03     // Catch:{ all -> 0x0176 }
            r13 = 0
            r9[r13] = r8     // Catch:{ all -> 0x0176 }
            r20 = r11
            r17 = r15
            r18 = r11
            r22 = r9
            android.database.Cursor r3 = X.C02870Hx.A00(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x0176 }
            if (r3 == 0) goto L_0x0166
            int r8 = r3.getCount()     // Catch:{ all -> 0x0176 }
            if (r8 <= 0) goto L_0x0163
            int r8 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x0176 }
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0176 }
            int r13 = r3.getColumnIndex(r7)     // Catch:{ all -> 0x0176 }
            int r7 = r3.getColumnIndex(r6)     // Catch:{ all -> 0x0176 }
            int r6 = r3.getColumnIndex(r5)     // Catch:{ all -> 0x0176 }
            int r5 = r3.getColumnIndex(r2)     // Catch:{ all -> 0x0176 }
            int r2 = r3.getColumnIndex(r1)     // Catch:{ all -> 0x0176 }
        L_0x0117:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0176 }
            if (r0 == 0) goto L_0x0163
            r9 = -1
            if (r8 == r9) goto L_0x0125
            int r20 = r3.getInt(r8)     // Catch:{ all -> 0x0176 }
            goto L_0x0127
        L_0x0125:
            r20 = 0
        L_0x0127:
            if (r6 == r9) goto L_0x012e
            int r18 = r3.getInt(r6)     // Catch:{ all -> 0x0176 }
            goto L_0x0130
        L_0x012e:
            r18 = 0
        L_0x0130:
            if (r7 != r9) goto L_0x013b
            long r0 = r3.getLong(r13)     // Catch:{ all -> 0x0176 }
            android.net.Uri r17 = android.content.ContentUris.withAppendedId(r15, r0)     // Catch:{ all -> 0x0176 }
            goto L_0x0143
        L_0x013b:
            long r0 = r3.getLong(r7)     // Catch:{ all -> 0x0176 }
            android.net.Uri r17 = android.content.ContentUris.withAppendedId(r14, r0)     // Catch:{ all -> 0x0176 }
        L_0x0143:
            if (r5 == r9) goto L_0x014a
            int r19 = r3.getInt(r5)     // Catch:{ all -> 0x0176 }
            goto L_0x014c
        L_0x014a:
            r19 = 400(0x190, float:5.6E-43)
        L_0x014c:
            if (r2 == r9) goto L_0x0156
            int r0 = r3.getInt(r2)     // Catch:{ all -> 0x0176 }
            r21 = 1
            if (r0 == r10) goto L_0x0158
        L_0x0156:
            r21 = 0
        L_0x0158:
            X.0MK r0 = new X.0MK     // Catch:{ all -> 0x0176 }
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0176 }
            r4.add(r0)     // Catch:{ all -> 0x0176 }
            goto L_0x0117
        L_0x0163:
            r3.close()     // Catch:{ NameNotFoundException -> 0x01ac }
        L_0x0166:
            r0 = 0
            X.0MK[] r0 = new X.AnonymousClass0MK[r0]     // Catch:{ NameNotFoundException -> 0x01ac }
            java.lang.Object[] r1 = r4.toArray(r0)     // Catch:{ NameNotFoundException -> 0x01ac }
            X.0MK[] r1 = (X.AnonymousClass0MK[]) r1     // Catch:{ NameNotFoundException -> 0x01ac }
            r0 = 0
            X.0L4 r2 = new X.0L4     // Catch:{ NameNotFoundException -> 0x01ac }
            r2.<init>(r1, r0)     // Catch:{ NameNotFoundException -> 0x01ac }
            goto L_0x01e2
        L_0x0176:
            r1 = move-exception
            if (r3 == 0) goto L_0x01ab
            r3.close()     // Catch:{ NameNotFoundException -> 0x01ac }
            goto L_0x01ab
        L_0x017d:
            r0 = 1
            X.0L4 r2 = new X.0L4     // Catch:{ NameNotFoundException -> 0x01ac }
            r2.<init>(r11, r0)     // Catch:{ NameNotFoundException -> 0x01ac }
            goto L_0x01e2
        L_0x0184:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ NameNotFoundException -> 0x01ac }
            java.lang.String r0 = "No package found for authority: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r3, r1)     // Catch:{ NameNotFoundException -> 0x01ac }
            android.content.pm.PackageManager$NameNotFoundException r1 = new android.content.pm.PackageManager$NameNotFoundException     // Catch:{ NameNotFoundException -> 0x01ac }
            r1.<init>(r0)     // Catch:{ NameNotFoundException -> 0x01ac }
            goto L_0x01ab
        L_0x0194:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ NameNotFoundException -> 0x01ac }
            java.lang.String r0 = "Found content provider "
            r1.append(r0)     // Catch:{ NameNotFoundException -> 0x01ac }
            r1.append(r3)     // Catch:{ NameNotFoundException -> 0x01ac }
            java.lang.String r0 = ", but package was not "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r2, r1)     // Catch:{ NameNotFoundException -> 0x01ac }
            android.content.pm.PackageManager$NameNotFoundException r1 = new android.content.pm.PackageManager$NameNotFoundException     // Catch:{ NameNotFoundException -> 0x01ac }
            r1.<init>(r0)     // Catch:{ NameNotFoundException -> 0x01ac }
        L_0x01ab:
            throw r1     // Catch:{ NameNotFoundException -> 0x01ac }
        L_0x01ac:
            r1 = -1
            X.0Sz r0 = new X.0Sz
            r0.<init>((int) r1)
            return r0
        L_0x01b3:
            int r1 = r1 + 1
            if (r1 < r2) goto L_0x01d7
            X.0Q5 r1 = X.AnonymousClass0VS.A01
            r2 = r27
            r0 = r24
            android.graphics.Typeface r2 = r1.A03(r0, r11, r3, r2)
            r0 = -3
            if (r2 == 0) goto L_0x01e9
            r0 = r23
            r12.A08(r0, r2)
        L_0x01c9:
            X.0Sz r1 = new X.0Sz
            r1.<init>((android.graphics.Typeface) r2)
            return r1
        L_0x01cf:
            X.0MK[] r3 = r2.A01
            if (r3 == 0) goto L_0x01e9
            int r2 = r3.length
            if (r2 == 0) goto L_0x01e9
            r1 = 0
        L_0x01d7:
            r0 = r3[r1]
            int r0 = r0.A00
            if (r0 == 0) goto L_0x01b3
            if (r0 < 0) goto L_0x01e0
            r4 = r0
        L_0x01e0:
            r0 = r4
            goto L_0x01e9
        L_0x01e2:
            int r1 = r2.A00
            r4 = -3
            r0 = 1
            if (r1 == 0) goto L_0x01cf
            r0 = -2
        L_0x01e9:
            X.0Sz r1 = new X.0Sz
            r1.<init>((int) r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05810Vb.A00(android.content.Context, X.0Nf, java.lang.String, int):X.0Sz");
    }
}

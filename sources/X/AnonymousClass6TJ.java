package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6TJ  reason: invalid class name */
public final class AnonymousClass6TJ extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164257vA();
    public String A00;

    public AnonymousClass6TJ(String str) {
        C162177rO.A03(str, "json must not be null");
        this.A00 = str;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:15|(2:17|18)|19|20|21|22) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:8|9|10|11|12|13|14) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0022 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0039 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x003c */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:12:0x0022=Splitter:B:12:0x0022, B:21:0x003c=Splitter:B:21:0x003c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass6TJ A00(android.content.Context r6, int r7) {
        /*
            android.content.res.Resources r0 = r6.getResources()
            java.io.InputStream r6 = r0.openRawResource(r7)
            java.io.ByteArrayOutputStream r5 = X.AnonymousClass0x9.A0e()     // Catch:{ IOException -> 0x003d }
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r4]     // Catch:{ IOException -> 0x003d }
        L_0x0010:
            r2 = 0
            int r1 = r6.read(r3, r2, r4)     // Catch:{ all -> 0x0033 }
            r0 = -1
            if (r1 == r0) goto L_0x001c
            r5.write(r3, r2, r1)     // Catch:{ all -> 0x0033 }
            goto L_0x0010
        L_0x001c:
            r6.close()     // Catch:{ IOException -> 0x001f }
        L_0x001f:
            r5.close()     // Catch:{ IOException -> 0x0022 }
        L_0x0022:
            byte[] r2 = r5.toByteArray()     // Catch:{ IOException -> 0x003d }
            java.lang.String r0 = "UTF-8"
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x003d }
            r1.<init>(r2, r0)     // Catch:{ IOException -> 0x003d }
            X.6TJ r0 = new X.6TJ     // Catch:{ IOException -> 0x003d }
            r0.<init>(r1)     // Catch:{ IOException -> 0x003d }
            return r0
        L_0x0033:
            r0 = move-exception
            if (r6 == 0) goto L_0x0039
            r6.close()     // Catch:{ IOException -> 0x0039 }
        L_0x0039:
            r5.close()     // Catch:{ IOException -> 0x003c }
        L_0x003c:
            throw r0     // Catch:{ IOException -> 0x003d }
        L_0x003d:
            r0 = move-exception
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r0 = r2.length()
            int r0 = r0 + 37
            java.lang.StringBuilder r1 = X.AnonymousClass6CA.A0Y(r0)
            java.lang.String r0 = "Failed to read resource "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ": "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r2, r1)
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6TJ.A00(android.content.Context, int):X.6TJ");
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1695389r.A04(parcel, this.A00, C162417s1.A00(parcel));
    }
}

package X;

import android.content.ContentUris;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import com.whatsapp.util.Log;

/* renamed from: X.5mg  reason: invalid class name and case insensitive filesystem */
public abstract class C114215mg implements C186308v5 {
    public Cursor A00;
    public boolean A01 = false;
    public boolean A02;
    public final int A03;
    public final Uri A04;
    public final C04840Qw A05;
    public final AnonymousClass1VX A06;
    public final C58392vB A07;
    public final AnonymousClass5UR A08;
    public final String A09;

    private Cursor A00() {
        synchronized (this) {
            if (this.A00 == null) {
                return null;
            }
            if (this.A01) {
                if (this.A06.A0X(6538)) {
                    this.A00 = A01();
                } else {
                    this.A00.requery();
                }
                this.A01 = false;
            }
            Cursor cursor = this.A00;
            return cursor;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.4tP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: X.4tP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: X.4tQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: X.4tP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: X.4tP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: X.4tP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: X.4tP} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor A01() {
        /*
            r11 = this;
            boolean r0 = r11 instanceof X.C95314tM
            if (r0 == 0) goto L_0x001d
            r1 = r11
            X.4tM r1 = (X.C95314tM) r1
            X.5UR r0 = r1.A08
            android.content.ContentResolver r2 = r0.A00
            android.net.Uri r3 = r1.A04
            java.lang.String[] r4 = X.C1458077j.A00
            java.lang.String r5 = r1.A05()
            r6 = 0
            java.lang.String r7 = r1.A04()
            android.database.Cursor r0 = android.provider.MediaStore.Images.Media.query(r2, r3, r4, r5, r6, r7)
            return r0
        L_0x001d:
            boolean r0 = r11 instanceof X.AnonymousClass4tQ
            if (r0 == 0) goto L_0x004d
            r4 = r11
            X.4tQ r4 = (X.AnonymousClass4tQ) r4
            X.5UR r0 = r4.A08
            android.content.ContentResolver r5 = r0.A00
            android.net.Uri r6 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            java.lang.String[] r7 = X.C1460778m.A01
            java.lang.String r8 = r4.A05()
            java.lang.String r3 = r4.A09
            if (r3 == 0) goto L_0x004a
            java.lang.String[] r2 = X.C1460778m.A00
        L_0x0036:
            int r1 = r2.length
            int r0 = r1 + 1
            java.lang.String[] r9 = new java.lang.String[r0]
            r0 = 0
            java.lang.System.arraycopy(r2, r0, r9, r0, r1)
            r9[r1] = r3
        L_0x0041:
            java.lang.String r10 = r4.A04()
            android.database.Cursor r0 = android.provider.MediaStore.Images.Media.query(r5, r6, r7, r8, r9, r10)
            return r0
        L_0x004a:
            java.lang.String[] r9 = X.C1460778m.A00
            goto L_0x0041
        L_0x004d:
            boolean r0 = r11 instanceof X.AnonymousClass4tP
            if (r0 == 0) goto L_0x006a
            r4 = r11
            X.4tP r4 = (X.AnonymousClass4tP) r4
            X.5UR r0 = r4.A08
            android.content.ContentResolver r5 = r0.A00
            android.net.Uri r6 = r4.A04
            java.lang.String[] r7 = X.C1460678l.A01
            java.lang.String r8 = r4.A05()
            java.lang.String r3 = r4.A09
            if (r3 == 0) goto L_0x0067
            java.lang.String[] r2 = X.C1460678l.A00
            goto L_0x0036
        L_0x0067:
            java.lang.String[] r9 = X.C1460678l.A00
            goto L_0x0041
        L_0x006a:
            boolean r0 = r11 instanceof X.C95334tO
            if (r0 == 0) goto L_0x008e
            r1 = r11
            X.4tO r1 = (X.C95334tO) r1
            X.5UR r2 = r1.A08
            android.net.Uri r3 = r1.A04
            java.lang.String[] r4 = X.C1457977i.A00
            java.lang.String r5 = r1.A05()
            java.lang.String r0 = r1.A09
            if (r0 != 0) goto L_0x0089
            r6 = 0
        L_0x0080:
            java.lang.String r7 = r1.A04()
            android.database.Cursor r0 = r2.A03(r3, r4, r5, r6, r7)
            return r0
        L_0x0089:
            java.lang.String[] r6 = X.C18270x1.A1b(r0)
            goto L_0x0080
        L_0x008e:
            X.5UR r0 = r11.A08
            android.net.Uri r1 = r11.A04
            java.lang.String[] r2 = X.C100815Cj.A00
            r3 = 0
            java.lang.String r5 = r11.A04()
            r4 = r3
            android.database.Cursor r0 = r0.A03(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114215mg.A01():android.database.Cursor");
    }

    public Uri A02(long j) {
        try {
            Uri uri = this.A04;
            if (ContentUris.parseId(uri) != j) {
                Log.e("MediaList/id mismatch");
            }
            return uri;
        } catch (NumberFormatException unused) {
            return ContentUris.withAppendedId(this.A04, j);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r7v1 */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5, types: [java.io.File] */
    /* JADX WARNING: type inference failed for: r7v10, types: [X.8ug] */
    /* JADX WARNING: type inference failed for: r7v14 */
    /* JADX WARNING: type inference failed for: r19v2, types: [X.1ca] */
    /* JADX WARNING: type inference failed for: r7v15 */
    /* JADX WARNING: type inference failed for: r19v3, types: [X.4tL] */
    /* JADX WARNING: type inference failed for: r7v16 */
    /* JADX WARNING: type inference failed for: r7v17 */
    /* JADX WARNING: type inference failed for: r7v18 */
    /* JADX WARNING: type inference failed for: r7v19 */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01c3, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01c5, code lost:
        return null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C186058ug A03(int r31) {
        /*
            r30 = this;
            r1 = r30
            monitor-enter(r1)
            android.database.Cursor r0 = r1.A00()     // Catch:{ all -> 0x01c7 }
            if (r0 == 0) goto L_0x01c4
            r4 = r31
            boolean r2 = r0.moveToPosition(r4)     // Catch:{ all -> 0x01c7 }
            if (r2 == 0) goto L_0x01c4
            boolean r2 = r0.isClosed()     // Catch:{ all -> 0x01c7 }
            if (r2 != 0) goto L_0x01c4
            boolean r2 = r1 instanceof X.C95314tM     // Catch:{ all -> 0x01c7 }
            if (r2 == 0) goto L_0x0078
            r2 = 0
            long r12 = r0.getLong(r2)     // Catch:{ all -> 0x01c7 }
            r2 = 1
            java.lang.String r10 = r0.getString(r2)     // Catch:{ all -> 0x01c7 }
            r2 = 2
            long r14 = r0.getLong(r2)     // Catch:{ all -> 0x01c7 }
            r5 = 0
            int r2 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0039
            r2 = 6
            long r14 = r0.getLong(r2)     // Catch:{ all -> 0x01c7 }
            r2 = 1000(0x3e8, float:1.401E-42)
            long r2 = (long) r2     // Catch:{ all -> 0x01c7 }
            long r14 = r14 * r2
        L_0x0039:
            r2 = 5
            java.lang.String r11 = r0.getString(r2)     // Catch:{ all -> 0x01c7 }
            r2 = 7
            long r16 = r0.getLong(r2)     // Catch:{ all -> 0x01c7 }
            if (r10 == 0) goto L_0x006c
            java.io.File r0 = X.AnonymousClass002.A0B(r10)     // Catch:{ all -> 0x01c7 }
            boolean r0 = com.whatsapp.GifHelper.A01(r0)     // Catch:{ all -> 0x01c7 }
            if (r0 == 0) goto L_0x006c
            X.5UR r9 = r1.A08     // Catch:{ all -> 0x01c7 }
            X.C162457s7.A0C(r9)     // Catch:{ all -> 0x01c7 }
            android.net.Uri r8 = r1.A02(r12)     // Catch:{ all -> 0x01c7 }
            X.C162457s7.A0D(r8)     // Catch:{ all -> 0x01c7 }
            X.1ca r7 = new X.1ca     // Catch:{ all -> 0x01c7 }
            r7.<init>(r8, r9, r10, r11, r12, r14, r16)     // Catch:{ all -> 0x01c7 }
        L_0x0060:
            X.0Qw r2 = r1.A05     // Catch:{ all -> 0x01c7 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x01c7 }
            r2.A08(r0, r7)     // Catch:{ all -> 0x01c7 }
        L_0x0069:
            monitor-exit(r1)     // Catch:{ all -> 0x01c7 }
            goto L_0x01c3
        L_0x006c:
            X.5UR r9 = r1.A08     // Catch:{ all -> 0x01c7 }
            android.net.Uri r8 = r1.A02(r12)     // Catch:{ all -> 0x01c7 }
            X.4tL r7 = new X.4tL     // Catch:{ all -> 0x01c7 }
            r7.<init>(r8, r9, r10, r11, r12, r14, r16)     // Catch:{ all -> 0x01c7 }
            goto L_0x0060
        L_0x0078:
            boolean r2 = r1 instanceof X.AnonymousClass4tQ     // Catch:{ all -> 0x01c7 }
            if (r2 != 0) goto L_0x0183
            boolean r2 = r1 instanceof X.AnonymousClass4tP     // Catch:{ all -> 0x01c7 }
            if (r2 != 0) goto L_0x0183
            boolean r2 = r1 instanceof X.C95334tO     // Catch:{ all -> 0x01c7 }
            if (r2 == 0) goto L_0x013f
            r3 = 0
            boolean r2 = r0.isClosed()     // Catch:{ all -> 0x01c7 }
            r7 = 0
            if (r2 != 0) goto L_0x0069
            long r13 = r0.getLong(r3)     // Catch:{ all -> 0x01c7 }
            r2 = 1
            java.lang.String r10 = r0.getString(r2)     // Catch:{ all -> 0x01c7 }
            r2 = 5
            long r15 = r0.getLong(r2)     // Catch:{ all -> 0x01c7 }
            r5 = 0
            int r2 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x00a9
            r2 = 4
            long r15 = r0.getLong(r2)     // Catch:{ all -> 0x01c7 }
            r2 = 1000(0x3e8, float:1.401E-42)
            long r2 = (long) r2     // Catch:{ all -> 0x01c7 }
            long r15 = r15 * r2
        L_0x00a9:
            r2 = 2
            java.lang.String r11 = r0.getString(r2)     // Catch:{ all -> 0x01c7 }
            r5 = 3
            int r3 = r0.getInt(r5)     // Catch:{ all -> 0x01c7 }
            r2 = 7
            long r17 = r0.getLong(r2)     // Catch:{ all -> 0x01c7 }
            if (r10 == 0) goto L_0x00be
            java.io.File r7 = X.AnonymousClass002.A0B(r10)     // Catch:{ all -> 0x01c7 }
        L_0x00be:
            if (r3 != r5) goto L_0x00e0
            boolean r0 = com.whatsapp.GifHelper.A01(r7)     // Catch:{ all -> 0x01c7 }
            if (r0 != 0) goto L_0x0100
            X.5UR r0 = r1.A08     // Catch:{ all -> 0x01c7 }
            android.net.Uri r20 = r1.A02(r13)     // Catch:{ all -> 0x01c7 }
            X.4tL r7 = new X.4tL     // Catch:{ all -> 0x01c7 }
            r19 = r7
            r21 = r0
            r22 = r10
            r23 = r11
            r24 = r13
            r26 = r15
            r28 = r17
            r19.<init>(r20, r21, r22, r23, r24, r26, r28)     // Catch:{ all -> 0x01c7 }
            goto L_0x0060
        L_0x00e0:
            java.lang.String r2 = "image/gif"
            boolean r2 = r2.equals(r11)     // Catch:{ all -> 0x01c7 }
            if (r2 == 0) goto L_0x0127
            if (r7 == 0) goto L_0x0127
            X.C172218Kd.A04(r7)     // Catch:{ IOException -> 0x0127 }
            X.7L1 r2 = X.C172218Kd.A04(r7)     // Catch:{ IOException -> 0x0121, OutOfMemoryError -> 0x00fa }
            boolean r2 = r2.A02     // Catch:{ IOException -> 0x0121, OutOfMemoryError -> 0x00fa }
            r2 = r2 ^ 1
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x0127
            goto L_0x0100
        L_0x00fa:
            r2 = move-exception
            java.lang.String r0 = "LoadMediaFromCursor/Image/Gif/IsSingleFrameGif/OutOfMemory"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x01c7 }
        L_0x0100:
            X.5UR r0 = r1.A08     // Catch:{ all -> 0x01c7 }
            X.C162457s7.A0C(r0)     // Catch:{ all -> 0x01c7 }
            android.net.Uri r20 = r1.A02(r13)     // Catch:{ all -> 0x01c7 }
            X.C162457s7.A0D(r20)     // Catch:{ all -> 0x01c7 }
            X.1ca r7 = new X.1ca     // Catch:{ all -> 0x01c7 }
            r19 = r7
            r21 = r0
            r22 = r10
            r23 = r11
            r24 = r13
            r26 = r15
            r28 = r17
            r19.<init>(r20, r21, r22, r23, r24, r26, r28)     // Catch:{ all -> 0x01c7 }
            goto L_0x0060
        L_0x0121:
            r3 = move-exception
            java.lang.String r2 = "LoadMediaFromCursor/Image/Gif/IsSingleFrameGif/IOException"
            com.whatsapp.util.Log.e(r2, r3)     // Catch:{ all -> 0x01c7 }
        L_0x0127:
            X.5UR r9 = r1.A08     // Catch:{ all -> 0x01c7 }
            X.C162457s7.A0C(r9)     // Catch:{ all -> 0x01c7 }
            android.net.Uri r8 = r1.A02(r13)     // Catch:{ all -> 0x01c7 }
            X.C162457s7.A0D(r8)     // Catch:{ all -> 0x01c7 }
            r2 = 6
            int r12 = r0.getInt(r2)     // Catch:{ all -> 0x01c7 }
            X.1cb r7 = new X.1cb     // Catch:{ all -> 0x01c7 }
            r7.<init>(r8, r9, r10, r11, r12, r13, r15, r17)     // Catch:{ all -> 0x01c7 }
            goto L_0x0060
        L_0x013f:
            r6 = 1
            java.lang.String r3 = r0.getString(r6)     // Catch:{ all -> 0x01c7 }
            r7 = 0
            if (r3 == 0) goto L_0x0069
            r2 = 2
            long r9 = r0.getLong(r2)     // Catch:{ all -> 0x01c7 }
            r2 = 5
            short r5 = r0.getShort(r2)     // Catch:{ all -> 0x01c7 }
            java.io.File r8 = X.AnonymousClass002.A0B(r3)     // Catch:{ all -> 0x01c7 }
            if (r5 == r6) goto L_0x017b
            r2 = 3
            r3 = 6
            if (r5 == r2) goto L_0x016f
            r2 = 13
            if (r5 == r2) goto L_0x0165
            r2 = 81
            if (r5 == r2) goto L_0x016f
            goto L_0x0069
        L_0x0165:
            long r11 = r0.getLong(r3)     // Catch:{ all -> 0x01c7 }
            X.6io r6 = new X.6io     // Catch:{ all -> 0x01c7 }
            r6.<init>(r7, r8, r9, r11)     // Catch:{ all -> 0x01c7 }
            goto L_0x0178
        L_0x016f:
            long r11 = r0.getLong(r3)     // Catch:{ all -> 0x01c7 }
            X.6ip r6 = new X.6ip     // Catch:{ all -> 0x01c7 }
            r6.<init>(r7, r8, r9, r11)     // Catch:{ all -> 0x01c7 }
        L_0x0178:
            r7 = r6
            goto L_0x0060
        L_0x017b:
            X.4sx r0 = new X.4sx     // Catch:{ all -> 0x01c7 }
            r0.<init>(r7, r8, r9)     // Catch:{ all -> 0x01c7 }
            r7 = r0
            goto L_0x0060
        L_0x0183:
            r2 = 0
            long r13 = r0.getLong(r2)     // Catch:{ all -> 0x01c7 }
            r2 = 2
            long r15 = r0.getLong(r2)     // Catch:{ all -> 0x01c7 }
            r5 = 0
            int r2 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x019b
            r2 = 7
            long r15 = r0.getLong(r2)     // Catch:{ all -> 0x01c7 }
            r2 = 1000(0x3e8, double:4.94E-321)
            long r15 = r15 * r2
        L_0x019b:
            X.5UR r9 = r1.A08     // Catch:{ all -> 0x01c7 }
            X.C162457s7.A0C(r9)     // Catch:{ all -> 0x01c7 }
            android.net.Uri r8 = r1.A02(r13)     // Catch:{ all -> 0x01c7 }
            X.C162457s7.A0D(r8)     // Catch:{ all -> 0x01c7 }
            r2 = 1
            java.lang.String r10 = r0.getString(r2)     // Catch:{ all -> 0x01c7 }
            r2 = 6
            java.lang.String r11 = r0.getString(r2)     // Catch:{ all -> 0x01c7 }
            r2 = 4
            int r12 = r0.getInt(r2)     // Catch:{ all -> 0x01c7 }
            r2 = 8
            long r17 = r0.getLong(r2)     // Catch:{ all -> 0x01c7 }
            X.1cb r7 = new X.1cb     // Catch:{ all -> 0x01c7 }
            r7.<init>(r8, r9, r10, r11, r12, r13, r15, r17)     // Catch:{ all -> 0x01c7 }
            goto L_0x0060
        L_0x01c3:
            return r7
        L_0x01c4:
            monitor-exit(r1)     // Catch:{ all -> 0x01c7 }
            r0 = 0
            return r0
        L_0x01c7:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01c7 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114215mg.A03(int):X.8ug");
    }

    public String A04() {
        String str;
        if (this.A03 == 1) {
            str = " ASC";
        } else {
            str = " DESC";
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("case ifnull(datetaken,0) when 0 then date_modified*1000 else datetaken end");
        A0o.append(str);
        return AnonymousClass000.A0V(", _id", str, A0o);
    }

    public C186058ug B9S(int i) {
        C186058ug r2 = (C186058ug) this.A05.A04(Integer.valueOf(i));
        if (r2 != null) {
            return r2;
        }
        if (!C615631i.A02() || !this.A06.A0X(5882)) {
            return A03(i);
        }
        return r2;
    }

    public void Bjj() {
        if ((this instanceof C95324tN) && this.A00 != null) {
            if (!this.A06.A0X(6538)) {
                this.A00.deactivate();
            }
            this.A01 = true;
        }
    }

    public void close() {
        try {
            if (this.A00 != null) {
                if (!this.A06.A0X(6538)) {
                    this.A00.deactivate();
                }
                this.A01 = true;
            }
        } catch (IllegalStateException e) {
            Log.e("MediaList/exception while deactivating cursor", e);
        }
        Cursor cursor = this.A00;
        if (cursor != null) {
            cursor.close();
            this.A00 = null;
        }
    }

    public void registerContentObserver(ContentObserver contentObserver) {
        Cursor cursor;
        if ((this instanceof C95324tN) && (cursor = this.A00) != null) {
            cursor.registerContentObserver(contentObserver);
        }
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
        Cursor cursor;
        if ((this instanceof C95324tN) && (cursor = this.A00) != null) {
            cursor.unregisterContentObserver(contentObserver);
        }
    }

    public C114215mg(Uri uri, C620633i r5, AnonymousClass1VX r6, C58392vB r7, String str, int i, boolean z) {
        C04840Qw r2 = new C04840Qw(512);
        this.A05 = r2;
        this.A06 = r6;
        this.A07 = r7;
        this.A08 = C620633i.A02(r5);
        this.A03 = i;
        this.A04 = uri;
        this.A09 = str;
        this.A02 = z;
        Cursor A012 = A01();
        this.A00 = A012;
        if (A012 == null) {
            Log.w("MediaList/createCursor returns null");
        }
        r2.A07(0);
    }

    public C186058ug Bhe(int i) {
        C626936e.A00();
        try {
            return A03(i);
        } catch (Exception e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("MediaGalleryList/processMediaAt/position = ");
            A0o.append(i);
            C18260x0.A1Q(A0o, " ; e = ", e);
            return null;
        }
    }

    public int getCount() {
        int count;
        Cursor A002 = A00();
        if (A002 == null) {
            return 0;
        }
        synchronized (this) {
            count = A002.getCount();
        }
        return count;
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1T(getCount());
    }
}

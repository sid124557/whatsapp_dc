package X;

/* renamed from: X.5O9  reason: invalid class name */
public class AnonymousClass5O9 {
    public final C55682qk A00;
    public final C620633i A01;
    public final AnonymousClass5ZR A02;
    public final AnonymousClass1VX A03;
    public final C58392vB A04;

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007d, code lost:
        if ((r1 & 1) != 0) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ba, code lost:
        if (r2 != 3) goto L_0x00e4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0113  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C186308v5 A00(X.C108945dp r15) {
        /*
            r14 = this;
            int r2 = r15.A01
            int r1 = r15.A00
            int r12 = r15.A02
            java.lang.String r11 = r15.A03
            boolean r0 = r15.A05
            if (r0 != 0) goto L_0x0121
            X.33i r8 = r14.A01
            X.5UR r0 = r8.A0R()
            if (r0 == 0) goto L_0x0121
            java.lang.String r4 = android.os.Environment.getExternalStorageState()
            X.5ZR r3 = r14.A02
            boolean r0 = r3.A0I(r4)
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = "mounted_ro"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0032
            java.lang.String[] r0 = X.C107035aa.A04()
            int r0 = r3.A03(r0)
            if (r0 == 0) goto L_0x0044
        L_0x0032:
            java.lang.String r0 = "mounted"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0052
            java.lang.String[] r0 = X.C107035aa.A02()
            int r0 = r3.A03(r0)
            if (r0 != 0) goto L_0x0052
        L_0x0044:
            r4 = 1
        L_0x0045:
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r3 = 1
            if (r4 == 0) goto L_0x00b7
            if (r2 == r3) goto L_0x00bc
            r4 = 7
            if (r1 != r4) goto L_0x007b
            goto L_0x0054
        L_0x0052:
            r4 = 0
            goto L_0x0045
        L_0x0054:
            X.1VX r9 = r14.A03     // Catch:{ SQLiteException -> 0x0069 }
            X.2vB r10 = r14.A04     // Catch:{ SQLiteException -> 0x0069 }
            java.lang.String r4 = "external"
            android.net.Uri r7 = android.provider.MediaStore.Files.getContentUri(r4)     // Catch:{ SQLiteException -> 0x0069 }
            boolean r13 = r15.A04     // Catch:{ SQLiteException -> 0x0069 }
            X.4tO r6 = new X.4tO     // Catch:{ SQLiteException -> 0x0069 }
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ SQLiteException -> 0x0069 }
            r0.add(r6)     // Catch:{ SQLiteException -> 0x0069 }
            goto L_0x00b7
        L_0x0069:
            r7 = move-exception
            java.lang.String r4 = "mediamanager/makeMediaList exception"
            com.whatsapp.util.Log.e(r4, r7)
            X.2qk r6 = r14.A00
            java.lang.String r5 = "mediamanager/makemedialist/sqliteexception"
            java.lang.String r4 = r7.getMessage()
            r6.A0A(r5, r3, r4)
            goto L_0x007f
        L_0x007b:
            r4 = r1 & 1
            if (r4 == 0) goto L_0x008f
        L_0x007f:
            X.1VX r9 = r14.A03
            X.2vB r10 = r14.A04
            android.net.Uri r7 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            boolean r13 = r15.A04
            X.4tQ r6 = new X.4tQ
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r0.add(r6)
        L_0x008f:
            r4 = r1 & 4
            if (r4 == 0) goto L_0x00a3
            X.1VX r9 = r14.A03
            X.2vB r10 = r14.A04
            android.net.Uri r7 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            boolean r13 = r15.A04
            X.4tM r6 = new X.4tM
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r0.add(r6)
        L_0x00a3:
            r4 = r1 & 2
            if (r4 == 0) goto L_0x00b7
            X.1VX r9 = r14.A03
            X.2vB r10 = r14.A04
            android.net.Uri r7 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            boolean r13 = r15.A04
            X.4tP r6 = new X.4tP
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r0.add(r6)
        L_0x00b7:
            if (r2 == r3) goto L_0x00bc
            r4 = 3
            if (r2 != r4) goto L_0x00e4
        L_0x00bc:
            r2 = r1 & 1
            if (r2 == 0) goto L_0x00d0
            X.1VX r9 = r14.A03
            X.2vB r10 = r14.A04
            android.net.Uri r7 = android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI
            boolean r13 = r15.A04
            X.4tQ r6 = new X.4tQ
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r0.add(r6)
        L_0x00d0:
            r1 = r1 & 2
            if (r1 == 0) goto L_0x00e4
            X.1VX r9 = r14.A03
            X.2vB r10 = r14.A04
            android.net.Uri r7 = android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI
            boolean r13 = r15.A04
            X.4tP r6 = new X.4tP
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r0.add(r6)
        L_0x00e4:
            java.util.Iterator r4 = r0.iterator()
        L_0x00e8:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0105
            java.lang.Object r2 = r4.next()
            X.5mg r2 = (X.C114215mg) r2
            int r1 = r2.getCount()
            boolean r1 = X.AnonymousClass000.A1T(r1)
            if (r1 == 0) goto L_0x00e8
            r2.close()
            r4.remove()
            goto L_0x00e8
        L_0x0105:
            int r2 = r0.size()
            r1 = 0
            if (r2 != r3) goto L_0x0113
            java.lang.Object r1 = r0.get(r1)
            X.8v5 r1 = (X.C186308v5) r1
            return r1
        L_0x0113:
            X.8v5[] r1 = new X.C186308v5[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            X.8v5[] r0 = (X.C186308v5[]) r0
            X.8Gc r1 = new X.8Gc
            r1.<init>(r0, r12)
            return r1
        L_0x0121:
            X.8Ga r1 = new X.8Ga
            r1.<init>()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5O9.A00(X.5dp):X.8v5");
    }

    public AnonymousClass5O9(C55682qk r1, C620633i r2, AnonymousClass5ZR r3, AnonymousClass1VX r4, C58392vB r5) {
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = r3;
    }
}

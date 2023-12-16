package X;

import java.util.HashMap;

/* renamed from: X.2cv  reason: invalid class name and case insensitive filesystem */
public final class C47232cv {
    public HashMap A00 = AnonymousClass001.A0t();
    public final C69263Wi A01;
    public final C620633i A02;
    public final AnonymousClass1VX A03;
    public final AnonymousClass5N4 A04;
    public final AnonymousClass2WS A05;
    public final C620033c A06;
    public final C989053r A07;
    public final AnonymousClass4FS A08;

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00da, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00db, code lost:
        X.AnonymousClass2A8.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00de, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass3XA A00(android.net.Uri r31, int r32) {
        /*
            r30 = this;
            X.3XA r3 = new X.3XA
            r3.<init>()
            r15 = 0
            r1 = 1
            X.7iO r4 = new X.7iO
            r4.<init>(r1, r15, r1)
            r0 = r30
            X.1VX r8 = r0.A03
            X.6kz r7 = new X.6kz
            r7.<init>(r8)
            X.53r r2 = r0.A07
            X.33i r2 = r2.A03
            X.5UR r5 = r2.A0R()
            r2 = r31
            java.lang.String r5 = X.C107655bf.A0W(r2, r5)
            boolean r29 = X.C989053r.A08(r5)
            r6 = 4697(0x1259, float:6.582E-42)
            X.2vE r5 = X.C58422vE.A02
            boolean r5 = r8.A0Y(r5, r6)
            if (r5 == 0) goto L_0x00df
            if (r29 == 0) goto L_0x00df
            java.lang.String r5 = X.C18290x4.A0o(r2)
            android.net.Uri r6 = android.net.Uri.parse(r5)
            X.33i r5 = r0.A02
            X.5UR r5 = r5.A0R()
            r7 = 0
            if (r5 == 0) goto L_0x005b
            r9 = r7
            r10 = r7
            r8 = r7
            android.database.Cursor r7 = r5.A03(r6, r7, r8, r9, r10)
            if (r7 == 0) goto L_0x005b
            r7.moveToFirst()     // Catch:{ all -> 0x00d8 }
            java.lang.String r5 = "_data"
            int r5 = r7.getColumnIndex(r5)     // Catch:{ all -> 0x00d8 }
            java.lang.String r5 = r7.getString(r5)     // Catch:{ all -> 0x00d8 }
            goto L_0x0060
        L_0x005b:
            java.lang.String r5 = r6.getPath()     // Catch:{ all -> 0x00d8 }
            goto L_0x0063
        L_0x0060:
            r7.close()
        L_0x0063:
            if (r5 != 0) goto L_0x006d
            java.lang.String r2 = "InAppBugReportingScreenshotsUploadRepository/getFilePath: null path for media uri"
            com.whatsapp.util.Log.e((java.lang.String) r2)
            r2 = 0
            goto L_0x00f1
        L_0x006d:
            java.io.File r10 = X.AnonymousClass002.A0B(r5)
            r7 = 0
            X.38t r8 = X.C633138t.A0g
            java.lang.String r5 = "doodle"
            java.lang.String r11 = r2.getQueryParameter(r5)
            java.lang.String r5 = "from"
            java.lang.String r6 = r2.getQueryParameter(r5)
            if (r6 == 0) goto L_0x00d5
            int r5 = r6.length()
            if (r5 == 0) goto L_0x00d5
            long r17 = java.lang.Long.parseLong(r6)
        L_0x008c:
            java.lang.String r5 = "to"
            java.lang.String r5 = r2.getQueryParameter(r5)
            if (r5 == 0) goto L_0x00d2
            int r2 = r5.length()
            if (r2 == 0) goto L_0x00d2
            long r19 = java.lang.Long.parseLong(r5)
        L_0x009f:
            android.net.Uri r2 = android.net.Uri.fromFile(r10)
            java.lang.String r12 = r2.toString()
            boolean r22 = X.AnonymousClass36O.A05(r8)
            X.2dV r6 = new X.2dV
            r13 = r7
            r14 = r7
            r21 = r15
            r24 = r1
            r25 = r15
            r26 = r15
            r27 = r15
            r28 = r15
            r9 = r7
            r16 = r15
            r23 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r21, r22, r23, r24, r25, r26, r27, r28)
            X.2UD r9 = X.C154347d1.A00(r7, r8, r15, r1)
            X.32J r2 = new X.32J
            r8 = r2
            r10 = r6
            r11 = r4
            r12 = r7
            r13 = r15
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x00f1
        L_0x00d2:
            r19 = 0
            goto L_0x009f
        L_0x00d5:
            r17 = 0
            goto L_0x008c
        L_0x00d8:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00da }
        L_0x00da:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r7, r1)
            throw r0
        L_0x00df:
            r9 = 0
            X.38t r12 = X.C633138t.A0C
            r14 = r9
            r16 = r15
            r18 = r1
            r8 = r2
            r10 = r7
            r11 = r4
            r13 = r9
            r17 = r1
            X.32J r2 = X.AnonymousClass32J.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x00f1:
            X.5N4 r8 = r0.A04
            if (r29 == 0) goto L_0x0128
            java.lang.String r5 = "video"
        L_0x00f8:
            java.lang.String r4 = "mms_type"
            r7 = 476716874(0x1c6a1f4a, float:7.7464546E-22)
            X.8vZ r6 = r8.A01
            r6.markerAnnotate((int) r7, (java.lang.String) r4, (java.lang.String) r5)
            java.lang.String r5 = "network_type"
            java.lang.String r4 = r8.A00()
            r6.markerAnnotate((int) r7, (java.lang.String) r5, (java.lang.String) r4)
            if (r2 != 0) goto L_0x012b
            java.lang.String r0 = "InAppBugReportingScreenshotsUploadRepository/mediaJobRequestData is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r13 = 19
            r9 = 0
            X.7Zc r8 = new X.7Zc
            r11 = r9
            r12 = r9
            r10 = r9
            r8.<init>(r9, r10, r11, r12, r13)
            r3.A05(r8)
            r0 = 148(0x94, float:2.07E-43)
            r6.markerEnd(r7, r0)
            return r3
        L_0x0128:
            java.lang.String r5 = "image"
            goto L_0x00f8
        L_0x012b:
            X.33c r4 = r0.A06
            X.3QO r4 = r4.A03(r2, r1)
            java.lang.String r2 = "mms"
            r4.A0W = r2
            X.4FS r2 = r0.A08
            r5 = r32
            X.C71713cY.A00(r2, r0, r4, r5, r1)
            X.4Jk r1 = new X.4Jk
            r24 = r1
            r25 = r3
            r26 = r0
            r27 = r4
            r28 = r15
            r24.<init>(r25, r26, r27, r28, r29)
            r0 = 0
            r4.A04(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47232cv.A00(android.net.Uri, int):X.3XA");
    }

    public C47232cv(C69263Wi r2, C620633i r3, AnonymousClass1VX r4, AnonymousClass5N4 r5, AnonymousClass2WS r6, C620033c r7, C989053r r8, AnonymousClass4FS r9) {
        C18260x0.A0f(r7, r9, r2, r4, r6);
        C18260x0.A0W(r8, r3, r5);
        this.A06 = r7;
        this.A08 = r9;
        this.A01 = r2;
        this.A03 = r4;
        this.A05 = r6;
        this.A07 = r8;
        this.A02 = r3;
        this.A04 = r5;
    }
}

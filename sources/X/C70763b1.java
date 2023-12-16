package X;

/* renamed from: X.3b1  reason: invalid class name and case insensitive filesystem */
public class C70763b1 implements Runnable {
    public long A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    public C70763b1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, long j) {
        this.A06 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = j;
        this.A03 = obj3;
        this.A04 = obj4;
        this.A05 = obj5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:95:0x013d, code lost:
        if (X.C624234y.A00(r8.A0O, r8.A1b, r2) == false) goto L_0x013f;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x008f */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0147  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r28 = this;
            r2 = r28
            int r0 = r2.A06
            switch(r0) {
                case 0: goto L_0x019d;
                case 1: goto L_0x00d4;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r7 = r2.A01
            X.2TP r7 = (X.AnonymousClass2TP) r7
            long r3 = r2.A00
            java.lang.Object r6 = r2.A02
            java.io.File r6 = (java.io.File) r6
            java.lang.Object r11 = r2.A03
            javax.crypto.Cipher r11 = (javax.crypto.Cipher) r11
            java.lang.Object r8 = r2.A04
            android.os.ParcelFileDescriptor r8 = (android.os.ParcelFileDescriptor) r8
            java.lang.Object r10 = r2.A05
            android.os.CancellationSignal r10 = (android.os.CancellationSignal) r10
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ExportMigrationApi/writer started for "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r5 = ", "
            X.C18260x0.A1P(r1, r5, r6)
            r0 = 32768(0x8000, float:4.5918E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x00b9 }
            java.io.FileInputStream r2 = X.AnonymousClass0x9.A0g(r6)     // Catch:{ OperationCanceledException -> 0x0096, IOException -> 0x008f }
            if (r11 != 0) goto L_0x003b
            r9 = r2
            goto L_0x0040
        L_0x003b:
            javax.crypto.CipherInputStream r9 = new javax.crypto.CipherInputStream     // Catch:{ all -> 0x0085 }
            r9.<init>(r2, r11)     // Catch:{ all -> 0x0085 }
        L_0x0040:
            android.os.ParcelFileDescriptor$AutoCloseOutputStream r11 = new android.os.ParcelFileDescriptor$AutoCloseOutputStream     // Catch:{ all -> 0x007b }
            r11.<init>(r8)     // Catch:{ all -> 0x007b }
            X.C619032s.A01(r10, r9, r11, r0)     // Catch:{ IOException -> 0x0049 }
            goto L_0x0067
        L_0x0049:
            r12 = move-exception
            java.lang.String r0 = "ExportMigrationApi/Failed while writing to a remote stream "
            com.whatsapp.util.Log.e(r0, r12)     // Catch:{ all -> 0x0071 }
            X.2qk r10 = r7.A00     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = "xpm-export-api-remote-write"
            java.lang.String r0 = r12.getMessage()     // Catch:{ all -> 0x0071 }
            r10.A09(r1, r0, r12)     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = "Failed to write data."
            r8.closeWithError(r0)     // Catch:{ IOException -> 0x0061 }
            goto L_0x0067
        L_0x0061:
            r1 = move-exception
            java.lang.String r0 = "ExportMigrationApi/Failed to close the pipe after an error."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0071 }
        L_0x0067:
            r11.close()     // Catch:{ all -> 0x007b }
            r9.close()     // Catch:{ all -> 0x0085 }
            r2.close()     // Catch:{ OperationCanceledException -> 0x0096, IOException -> 0x008f }
            goto L_0x009f
        L_0x0071:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0076 }
            goto L_0x007a
        L_0x0076:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x007b }
        L_0x007a:
            throw r1     // Catch:{ all -> 0x007b }
        L_0x007b:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0080 }
            goto L_0x0084
        L_0x0080:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0085 }
        L_0x0084:
            throw r1     // Catch:{ all -> 0x0085 }
        L_0x0085:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x008a }
            goto L_0x008e
        L_0x008a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ OperationCanceledException -> 0x0096, IOException -> 0x008f }
        L_0x008e:
            throw r1     // Catch:{ OperationCanceledException -> 0x0096, IOException -> 0x008f }
        L_0x008f:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00b9 }
            java.lang.String r0 = "ExportMigrationApi/Failed to close stream for "
            goto L_0x009c
        L_0x0096:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00b9 }
            java.lang.String r0 = "ExportMigrationApi/Cancelled by remote peer while streaming "
        L_0x009c:
            X.C18260x0.A1S(r1, r0, r6)     // Catch:{ all -> 0x00b9 }
        L_0x009f:
            monitor-enter(r7)
            java.util.Set r0 = r7.A05     // Catch:{ all -> 0x00b6 }
            r0.remove(r8)     // Catch:{ all -> 0x00b6 }
            monitor-exit(r7)     // Catch:{ all -> 0x00b6 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ExportMigrationApi/writer completed for "
            r1.append(r0)
            r1.append(r3)
            X.C18260x0.A1P(r1, r5, r6)
            return
        L_0x00b6:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00b6 }
            throw r0
        L_0x00b9:
            r2 = move-exception
            monitor-enter(r7)
            java.util.Set r0 = r7.A05     // Catch:{ all -> 0x00d1 }
            r0.remove(r8)     // Catch:{ all -> 0x00d1 }
            monitor-exit(r7)     // Catch:{ all -> 0x00d1 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ExportMigrationApi/writer completed for "
            r1.append(r0)
            r1.append(r3)
            X.C18260x0.A1P(r1, r5, r6)
            throw r2
        L_0x00d1:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00d1 }
            throw r0
        L_0x00d4:
            java.lang.Object r8 = r2.A01
            X.4oJ r8 = (X.C93314oJ) r8
            java.lang.Object r9 = r2.A02
            java.util.List r9 = (java.util.List) r9
            long r14 = r2.A00
            java.lang.Object r7 = r2.A03
            android.widget.TextView r7 = (android.widget.TextView) r7
            java.lang.Object r6 = r2.A04
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.Object r11 = r2.A05
            java.util.Iterator r18 = r9.iterator()
            r16 = 0
            r25 = 0
            r10 = 0
        L_0x00f1:
            boolean r0 = r18.hasNext()
            r5 = 1
            if (r0 == 0) goto L_0x0129
            X.1mV r0 = X.C18320x8.A0S(r18)
            X.33C r12 = X.C30471mV.A00(r0)
            X.2rD r13 = r8.A1a
            long r3 = r0.A00
            boolean r0 = r12.A0Z
            if (r0 == 0) goto L_0x011a
            r1 = 0
        L_0x010a:
            long r3 = r3 - r1
            long r25 = r25 + r3
            X.2rD r1 = r8.A1a
            java.lang.String r0 = r12.A0I
            X.5LM r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0129
            int r10 = r10 + 1
            goto L_0x00f1
        L_0x011a:
            java.lang.String r0 = r12.A0I
            r1 = 0
            if (r0 == 0) goto L_0x010a
            X.5LM r0 = r13.A01(r0)
            if (r0 == 0) goto L_0x010a
            long r1 = r0.A0A
            goto L_0x010a
        L_0x0129:
            int r0 = r9.size()
            if (r0 != r5) goto L_0x013f
            X.34x r2 = r8.getFMessage()
            X.2ld r1 = r8.A1b
            X.1VX r0 = r8.A0O
            boolean r0 = X.C624234y.A00(r0, r1, r2)
            r19 = 1
            if (r0 != 0) goto L_0x0141
        L_0x013f:
            r19 = 0
        L_0x0141:
            int r0 = r9.size()
            if (r10 != r0) goto L_0x0164
            int r0 = (r25 > r16 ? 1 : (r25 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x014d
            r25 = r14
        L_0x014d:
            X.3Wi r1 = r8.A0X
            X.3c7 r0 = new X.3c7
            r24 = 0
            r20 = r0
            r21 = r8
            r22 = r7
            r23 = r6
            r27 = r19
            r20.<init>(r21, r22, r23, r24, r25, r27)
            r1.A0S(r0)
            return
        L_0x0164:
            java.lang.Object r0 = r7.getTag()
            if (r0 != r11) goto L_0x01bd
            X.3Wi r1 = r8.A0X
            X.3c7 r0 = new X.3c7
            r20 = r0
            r21 = r8
            r22 = r7
            r23 = r6
            r24 = r5
            r25 = r14
            r27 = r19
            r20.<init>(r21, r22, r23, r24, r25, r27)
            r1.A0S(r0)
            X.2rD r1 = r8.A1a
            X.33j r0 = r8.A0M
            android.content.Context r11 = r8.getContext()
            X.1tT r10 = new X.1tT
            r16 = r9
            r17 = r14
            r12 = r7
            r13 = r0
            r14 = r1
            r15 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r19)
            X.4FS r0 = r8.A25
            X.AnonymousClass0x7.A1B(r10, r0)
            return
        L_0x019d:
            java.lang.Object r0 = r2.A01
            X.2qz r0 = (X.C55832qz) r0
            long r5 = r2.A00
            java.lang.Object r4 = r2.A02
            X.30G r4 = (X.AnonymousClass30G) r4
            java.lang.Object r3 = r2.A03
            X.1mX r3 = (X.C30491mX) r3
            java.lang.Object r1 = r2.A04
            X.2i6 r1 = (X.C50392i6) r1
            java.lang.Object r2 = r2.A05
            X.3Lv r2 = (X.C66543Lv) r2
            X.34x r0 = X.C55122pp.A00(r0, r5)
            if (r0 == 0) goto L_0x01be
            r0 = 0
            r4.A03(r3, r0)
        L_0x01bd:
            return
        L_0x01be:
            java.lang.String r0 = r1.A06
            r3.A02 = r0
            int r0 = r1.A00
            r3.A00 = r0
            long r0 = r1.A03
            r3.A01 = r0
            r2.A0V(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70763b1.run():void");
    }
}

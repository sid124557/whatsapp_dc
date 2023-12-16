package X;

import java.io.File;

/* renamed from: X.9jd  reason: invalid class name and case insensitive filesystem */
public class C201169jd implements Runnable {
    public final /* synthetic */ C193909Qr A00;
    public final /* synthetic */ C195349Xk A01;
    public final /* synthetic */ AnonymousClass9KQ A02;
    public final /* synthetic */ File A03;

    public C201169jd(C193909Qr r1, C195349Xk r2, AnonymousClass9KQ r3, File file) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = file;
        this.A02 = r3;
    }

    /* JADX WARNING: type inference failed for: r11v7, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01ec, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01ff, code lost:
        r15 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0200, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0268, code lost:
        r0 = th;
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01eb, code lost:
        r15 = e;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:53:0x0141, B:82:0x01a1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0268 A[ExcHandler: all (th java.lang.Throwable), PHI: r11 
      PHI: (r11v5 java.io.BufferedInputStream) = (r11v8 java.io.BufferedInputStream), (r11v11 java.io.BufferedInputStream) binds: [B:82:0x01a1, B:53:0x0141] A[DONT_GENERATE, DONT_INLINE], Splitter:B:53:0x0141] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01ce A[LOOP:2: B:94:0x01cb->B:96:0x01ce, LOOP_END] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r22 = this;
            r1 = r22
            X.9Qr r0 = r1.A00
            X.9V8 r0 = r0.A00
            X.9Oi r0 = r0.A03
            r21 = r0
            X.9Xk r7 = r1.A01
            java.io.File r6 = r1.A03
            X.9KQ r1 = r1.A02
            if (r6 != 0) goto L_0x001b
            if (r1 != 0) goto L_0x001b
            java.lang.String r2 = "DefaultAssetManager"
            java.lang.String r0 = "download result and error should not be null at the same time."
            X.C162477s9.A09(r2, r0)
        L_0x001b:
            r0 = r21
            X.9W5 r5 = r0.A00
            java.lang.Object r8 = r5.A06
            monitor-enter(r8)
            X.9Sd r4 = r0.A01     // Catch:{ all -> 0x0277 }
            java.util.List r20 = r5.A06(r4)     // Catch:{ all -> 0x0277 }
            int r0 = r4.A00     // Catch:{ all -> 0x0277 }
            boolean r0 = X.AnonymousClass001.A1W(r0)
            r3 = 0
            r19 = 0
            if (r0 != 0) goto L_0x0035
            r19 = 1
        L_0x0035:
            X.9VJ r0 = r5.A01     // Catch:{ all -> 0x0277 }
            java.util.Map r2 = r0.A02     // Catch:{ all -> 0x0277 }
            X.9Xk r0 = r4.A03     // Catch:{ all -> 0x0277 }
            X.9WL r0 = r0.A02     // Catch:{ all -> 0x0277 }
            java.lang.String r0 = r0.A0A     // Catch:{ all -> 0x0277 }
            r2.remove(r0)     // Catch:{ all -> 0x0277 }
            monitor-exit(r8)     // Catch:{ all -> 0x0277 }
            if (r6 == 0) goto L_0x00a4
            if (r1 != 0) goto L_0x00a4
            long r1 = r7.A00
            java.lang.String r18 = "DefaultAssetManager"
            java.lang.String r13 = "[%s]-%s asset result size check. Expected - Actual : %d - %d"
            X.9WL r0 = r7.A02
            java.lang.String r9 = r0.A0A
            com.facebook.cameracore.ardelivery.model.ARAssetType r0 = r0.A02
            java.lang.String r8 = r0.name()
            java.lang.Long r10 = java.lang.Long.valueOf(r1)
            long r11 = r6.length()
            java.lang.Long r12 = java.lang.Long.valueOf(r11)
            X.8vJ r0 = X.C162477s9.A01
            r11 = 4
            boolean r0 = r0.BI0(r11)
            if (r0 == 0) goto L_0x0075
            java.lang.String r12 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r13, r9, r8, r10, r12)
            r0 = r18
            X.C162477s9.A07(r0, r12)
        L_0x0075:
            r12 = -1
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x00d7
            long r12 = r6.length()
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00d7
            X.9Tm r8 = new X.9Tm
            r8.<init>()
            X.9K2 r0 = X.AnonymousClass9K2.DOWNLOAD_ERROR
            r8.A00 = r0
            java.lang.String r0 = "size_mismatch"
            r8.A02 = r0
            long r0 = r6.length()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "[%s] downloaded asset size mismatch. %d vs %d"
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r9, r10, r1)
        L_0x009e:
            r8.A01 = r0
            X.9KQ r1 = r8.A00()
        L_0x00a4:
            boolean r0 = r20.isEmpty()
            if (r0 != 0) goto L_0x00ca
            r0 = r20
            java.lang.Object r0 = r0.get(r3)
            X.9Sm r0 = (X.C194339Sm) r0
            X.32L r0 = r0.A08
            java.util.List r12 = java.util.Collections.singletonList(r0)
            X.9JK r9 = X.AnonymousClass9JK.DOWNLOAD_END
            boolean r15 = X.AnonymousClass000.A1X(r1)
            if (r6 == 0) goto L_0x00d4
            long r13 = r6.length()
        L_0x00c4:
            r8 = r5
            r10 = r7
            r11 = r1
            r8.A09(r9, r10, r11, r12, r13, r15)
        L_0x00ca:
            if (r1 == 0) goto L_0x024f
            r0 = 0
            r5.A0A(r4, r0, r1, r3)
            if (r6 == 0) goto L_0x024b
            goto L_0x023f
        L_0x00d4:
            r13 = 0
            goto L_0x00c4
        L_0x00d7:
            java.lang.String r2 = "[%s]-%s asset hash check. HashType : %s. Expected : %s"
            X.9JU r0 = r7.A03
            r17 = r0
            if (r0 != 0) goto L_0x0239
            java.lang.String r1 = "null"
        L_0x00e1:
            java.lang.String r12 = r7.A06
            X.8vJ r0 = X.C162477s9.A01
            boolean r0 = r0.BI0(r11)
            if (r0 == 0) goto L_0x00f4
            java.lang.String r1 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r2, r9, r8, r1, r12)
            r0 = r18
            X.C162477s9.A07(r0, r1)
        L_0x00f4:
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x0236
            if (r17 == 0) goto L_0x0236
            int r0 = r17.ordinal()
            r13 = 1
            if (r0 == r13) goto L_0x0194
            if (r0 == r3) goto L_0x0134
            r11 = 0
        L_0x0106:
            X.9Tm r8 = new X.9Tm
            r8.<init>()
            X.9K2 r0 = X.AnonymousClass9K2.DOWNLOAD_ERROR
            r8.A00 = r0
            java.lang.String r0 = "hash_value_mismatch"
            r8.A02 = r0
            r0 = 6
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r3] = r9
            java.lang.String r0 = r17.name()
            r2[r13] = r0
            X.AnonymousClass6C7.A19(r12, r11, r10, r2)
            long r0 = r6.length()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 5
            r2[r0] = r1
            java.lang.String r0 = "asset hash mismatch. asset id: %s, hash type: %s, server hash value: %s, actual hash value: %s. server file size: %d, actual file size: %d"
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe((java.lang.String) r0, (java.lang.Object[]) r2)
            goto L_0x009e
        L_0x0134:
            java.lang.String r14 = "AssetFileUtil"
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r16 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0261 }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r15 = new byte[r0]
            r11 = 0
            boolean r0 = r6 instanceof X.AnonymousClass9JA     // Catch:{ FileNotFoundException -> 0x0180, IOException -> 0x016d, all -> 0x0268 }
            if (r0 == 0) goto L_0x014d
            r0 = r6
            X.9JA r0 = (X.AnonymousClass9JA) r0     // Catch:{ FileNotFoundException -> 0x0180, IOException -> 0x016d, all -> 0x0268 }
        L_0x0148:
            java.io.BufferedInputStream r2 = X.AnonymousClass0x7.A0c(r0)     // Catch:{ FileNotFoundException -> 0x0180, IOException -> 0x016d, all -> 0x0268 }
            goto L_0x0153
        L_0x014d:
            X.9JA r0 = new X.9JA     // Catch:{ FileNotFoundException -> 0x0180, IOException -> 0x016d, all -> 0x0268 }
            r0.<init>((java.io.File) r6)     // Catch:{ FileNotFoundException -> 0x0180, IOException -> 0x016d, all -> 0x0268 }
            goto L_0x0148
        L_0x0153:
            int r1 = r2.read(r15)     // Catch:{ FileNotFoundException -> 0x016b, IOException -> 0x0169 }
            if (r1 <= 0) goto L_0x015f
            r0 = r16
            r0.update(r15, r3, r1)     // Catch:{ FileNotFoundException -> 0x016b, IOException -> 0x0169 }
            goto L_0x0153
        L_0x015f:
            X.AnonymousClass9UQ.A00(r2)
            byte[] r11 = r16.digest()
            r0 = 32
            goto L_0x01c8
        L_0x0169:
            r15 = move-exception
            goto L_0x016f
        L_0x016b:
            r15 = move-exception
            goto L_0x0182
        L_0x016d:
            r15 = move-exception
            r2 = r11
        L_0x016f:
            java.lang.String r8 = "Couldn't read the file: %s"
            java.lang.Object[] r1 = new java.lang.Object[r13]     // Catch:{ all -> 0x026a }
            java.lang.String r0 = r6.getPath()     // Catch:{ all -> 0x026a }
            r1[r3] = r0     // Catch:{ all -> 0x026a }
            X.C162477s9.A0C(r14, r8, r15, r1)     // Catch:{ all -> 0x026a }
            X.AnonymousClass9UQ.A00(r2)
            goto L_0x0106
        L_0x0180:
            r15 = move-exception
            r2 = r11
        L_0x0182:
            java.lang.String r8 = "Couldn't find the file: %s"
            java.lang.Object[] r1 = new java.lang.Object[r13]     // Catch:{ all -> 0x026a }
            java.lang.String r0 = r6.getPath()     // Catch:{ all -> 0x026a }
            r1[r3] = r0     // Catch:{ all -> 0x026a }
            X.C162477s9.A0C(r14, r8, r15, r1)     // Catch:{ all -> 0x026a }
            X.AnonymousClass9UQ.A00(r2)
            goto L_0x0106
        L_0x0194:
            java.lang.String r14 = "AssetFileUtil"
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r16 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0270 }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r15 = new byte[r0]
            r11 = 0
            boolean r0 = r6 instanceof X.AnonymousClass9JA     // Catch:{ FileNotFoundException -> 0x01ff, IOException -> 0x01eb, all -> 0x0268 }
            if (r0 == 0) goto L_0x01ad
            r0 = r6
            X.9JA r0 = (X.AnonymousClass9JA) r0     // Catch:{ FileNotFoundException -> 0x01ff, IOException -> 0x01eb, all -> 0x0268 }
        L_0x01a8:
            java.io.BufferedInputStream r2 = X.AnonymousClass0x7.A0c(r0)     // Catch:{ FileNotFoundException -> 0x01ff, IOException -> 0x01eb, all -> 0x0268 }
            goto L_0x01b3
        L_0x01ad:
            X.9JA r0 = new X.9JA     // Catch:{ FileNotFoundException -> 0x01ff, IOException -> 0x01eb, all -> 0x0268 }
            r0.<init>((java.io.File) r6)     // Catch:{ FileNotFoundException -> 0x01ff, IOException -> 0x01eb, all -> 0x0268 }
            goto L_0x01a8
        L_0x01b3:
            int r1 = r2.read(r15)     // Catch:{ FileNotFoundException -> 0x01e9, IOException -> 0x01e7 }
            if (r1 <= 0) goto L_0x01bf
            r0 = r16
            r0.update(r15, r3, r1)     // Catch:{ FileNotFoundException -> 0x01e9, IOException -> 0x01e7 }
            goto L_0x01b3
        L_0x01bf:
            X.AnonymousClass9UQ.A00(r2)
            byte[] r11 = r16.digest()
            r0 = 64
        L_0x01c8:
            char[] r14 = new char[r0]
            r2 = 0
        L_0x01cb:
            int r0 = r11.length
            if (r2 >= r0) goto L_0x0213
            byte r0 = r11[r2]
            r15 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r2 * 2
            char[] r16 = X.AnonymousClass9UQ.A00
            int r0 = r15 >>> 4
            char r0 = r16[r0]
            r14[r1] = r0
            int r1 = r1 + 1
            r0 = r15 & 15
            char r0 = r16[r0]
            r14[r1] = r0
            int r2 = r2 + 1
            goto L_0x01cb
        L_0x01e7:
            r15 = move-exception
            goto L_0x01ed
        L_0x01e9:
            r15 = move-exception
            goto L_0x0201
        L_0x01eb:
            r15 = move-exception
            r2 = r11
        L_0x01ed:
            java.lang.String r8 = "Couldn't read the file: %s"
            java.lang.Object[] r1 = new java.lang.Object[r13]     // Catch:{ all -> 0x026a }
            java.lang.String r0 = r6.getPath()     // Catch:{ all -> 0x026a }
            r1[r3] = r0     // Catch:{ all -> 0x026a }
            X.C162477s9.A0C(r14, r8, r15, r1)     // Catch:{ all -> 0x026a }
            X.AnonymousClass9UQ.A00(r2)
            goto L_0x0106
        L_0x01ff:
            r15 = move-exception
            r2 = r11
        L_0x0201:
            java.lang.String r8 = "Couldn't find the file: %s"
            java.lang.Object[] r1 = new java.lang.Object[r13]     // Catch:{ all -> 0x026a }
            java.lang.String r0 = r6.getPath()     // Catch:{ all -> 0x026a }
            r1[r3] = r0     // Catch:{ all -> 0x026a }
            X.C162477s9.A0C(r14, r8, r15, r1)     // Catch:{ all -> 0x026a }
            X.AnonymousClass9UQ.A00(r2)
            goto L_0x0106
        L_0x0213:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r14)
            boolean r0 = android.text.TextUtils.equals(r11, r12)
            if (r0 == 0) goto L_0x0106
            java.lang.String r10 = r17.name()
            java.lang.String r2 = "[%s]-%s asset hash match. Hash type: %s,"
            X.8vJ r1 = X.C162477s9.A01
            r0 = 4
            boolean r0 = r1.BI0(r0)
            if (r0 == 0) goto L_0x0236
            java.lang.String r1 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r2, r9, r8, r10)
            r0 = r18
            X.C162477s9.A07(r0, r1)
        L_0x0236:
            r1 = 0
            goto L_0x00a4
        L_0x0239:
            java.lang.String r1 = r17.name()
            goto L_0x00e1
        L_0x023f:
            r6.delete()     // Catch:{ SecurityException -> 0x0243 }
            goto L_0x024b
        L_0x0243:
            r2 = move-exception
            java.lang.String r1 = "DefaultAssetManager"
            java.lang.String r0 = "failed to delete corrupted downloaded asset."
            X.C162477s9.A0B(r1, r0, r2)
        L_0x024b:
            r5.A08()
            return
        L_0x024f:
            if (r19 == 0) goto L_0x025e
            java.util.concurrent.Executor r2 = r5.A09
        L_0x0253:
            X.9iy r1 = new X.9iy
            r0 = r21
            r1.<init>(r0, r7, r6)
            r2.execute(r1)
            return
        L_0x025e:
            java.util.concurrent.Executor r2 = r5.A08
            goto L_0x0253
        L_0x0261:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0268:
            r0 = move-exception
            goto L_0x026c
        L_0x026a:
            r0 = move-exception
            r11 = r2
        L_0x026c:
            X.AnonymousClass9UQ.A00(r11)
            throw r0
        L_0x0270:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0277:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0277 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201169jd.run():void");
    }
}

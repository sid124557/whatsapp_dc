package X;

/* renamed from: X.8GV  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8GV implements C182418oN {
    public final /* synthetic */ C184318rb A00;
    public final /* synthetic */ AnonymousClass5Y0 A01;

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b6, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010a, code lost:
        if (r0 == false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x016f, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap BJn(android.content.res.Resources r12, int r13) {
        /*
            r11 = this;
            X.5Y0 r0 = r11.A01
            X.8rb r5 = r11.A00
            X.6i3 r3 = r0.A04
            monitor-enter(r3)
            r7 = 1
            boolean r0 = X.AnonymousClass000.A1S(r13)
            X.C626936e.A0C(r0)     // Catch:{ all -> 0x019e }
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x019e }
            r2.<init>()     // Catch:{ all -> 0x019e }
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x019e }
            r2.inPreferredConfig = r0     // Catch:{ all -> 0x019e }
            int r1 = r13 / 100
            boolean r0 = r3.A0D(r1)     // Catch:{ all -> 0x019e }
            r4 = 0
            if (r0 != 0) goto L_0x00b7
            java.lang.String r0 = "DoodleEmojiManager/getBitmap/Downloadable files are not ready and getBitmap is called"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x019e }
            int r8 = r3.A01(r1)     // Catch:{ all -> 0x019e }
            r6 = 0
            r2 = 5
            if (r8 == 0) goto L_0x006a
            if (r8 == r7) goto L_0x0050
            r0 = 2
            if (r8 == r0) goto L_0x006a
            r0 = 3
            if (r8 == r0) goto L_0x0050
            r0 = 4
            if (r8 == r0) goto L_0x006a
            if (r8 == r2) goto L_0x00a4
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x019c }
            java.lang.String r0 = "DoodleEmojiManager/getFilesAsyncFromState/Unexpected state "
            r1.append(r0)     // Catch:{ all -> 0x019c }
            java.util.HashMap r0 = X.C160827oN.A0J     // Catch:{ all -> 0x019c }
            java.lang.Object r0 = X.C18290x4.A0j(r0, r8)     // Catch:{ all -> 0x019c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x019c }
            X.C18260x0.A1K(r1, r0)     // Catch:{ all -> 0x019c }
            goto L_0x009b
        L_0x0050:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x019c }
            java.lang.String r0 = "DoodleEmojiManager/getFilesAsyncFromState/State is "
            r2.append(r0)     // Catch:{ all -> 0x019c }
            java.util.HashMap r0 = X.C160827oN.A0J     // Catch:{ all -> 0x019c }
            java.lang.Object r0 = X.C18290x4.A0j(r0, r8)     // Catch:{ all -> 0x019c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x019c }
            X.C18260x0.A1J(r2, r0)     // Catch:{ all -> 0x019c }
            if (r5 == 0) goto L_0x00b5
            r3.A0A(r5, r1)     // Catch:{ all -> 0x019c }
            goto L_0x00b5
        L_0x006a:
            boolean r0 = r3.A0D(r1)     // Catch:{ all -> 0x019c }
            if (r0 != 0) goto L_0x00a1
            X.33p r2 = r3.A0A     // Catch:{ all -> 0x019c }
            X.1ip r0 = r3.A06     // Catch:{ all -> 0x019c }
            int r0 = r0.A08(r7)     // Catch:{ all -> 0x019c }
            int r0 = X.C380425g.A00(r2, r0)     // Catch:{ all -> 0x019c }
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0096
            java.lang.String r0 = "DoodleEmojiManager/getFilesAsyncFromState/Fetch is network safe."
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x019c }
            java.lang.String r0 = "DoodleEmojiManager/getFilesAsyncFromState/No local info, will call manifest."
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x019c }
            r3.A09(r7, r1)     // Catch:{ all -> 0x019c }
            if (r5 == 0) goto L_0x0092
            r3.A0A(r5, r1)     // Catch:{ all -> 0x019c }
        L_0x0092:
            r3.A08(r6, r1)     // Catch:{ all -> 0x019c }
            goto L_0x00b5
        L_0x0096:
            java.lang.String r0 = "DoodleEmojiManager/getFilesAsyncFromState/Fetch is NOT network safe."
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x019c }
        L_0x009b:
            if (r5 == 0) goto L_0x00b5
            r5.BRy()     // Catch:{ all -> 0x019c }
            goto L_0x00b5
        L_0x00a1:
            r3.A09(r2, r1)     // Catch:{ all -> 0x019c }
        L_0x00a4:
            if (r5 == 0) goto L_0x00b5
            boolean r0 = r3.A0D(r1)     // Catch:{ all -> 0x019c }
            X.C626936e.A0C(r0)     // Catch:{ all -> 0x019c }
            r3.A0G(r1)     // Catch:{ all -> 0x019c }
            android.util.SparseArray r0 = r3.A00     // Catch:{ all -> 0x019c }
            r5.BZS(r0)     // Catch:{ all -> 0x019c }
        L_0x00b5:
            monitor-exit(r3)
            return r4
        L_0x00b7:
            java.lang.String r0 = "DoodleEmojiManager/getBitmap/files are downloaded"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x019e }
            android.util.SparseArray r0 = r3.A00     // Catch:{ all -> 0x019c }
            java.lang.Object r5 = r0.get(r13)     // Catch:{ all -> 0x019c }
            java.io.File r5 = (java.io.File) r5     // Catch:{ all -> 0x019c }
            if (r5 == 0) goto L_0x018d
            boolean r0 = r5.exists()     // Catch:{ all -> 0x019e }
            if (r0 == 0) goto L_0x018d
            java.lang.String r0 = "DoodleEmojiManager/getBitmap/Computing bitmap from downloaded file."
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x019e }
            java.io.FileInputStream r6 = X.AnonymousClass0x9.A0g(r5)     // Catch:{ IOException -> 0x017a }
            java.lang.String r0 = r5.getPath()     // Catch:{ all -> 0x0170 }
            java.lang.String r1 = X.C627536m.A08(r0)     // Catch:{ all -> 0x0170 }
            java.lang.String r0 = "obi"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0170 }
            if (r0 == 0) goto L_0x0107
            X.7h2 r1 = r3.A01     // Catch:{ all -> 0x0170 }
            java.util.Set r0 = r1.A00     // Catch:{ all -> 0x0170 }
            if (r0 != 0) goto L_0x00f5
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0170 }
            java.util.HashSet r0 = X.AnonymousClass0x9.A15(r0)     // Catch:{ all -> 0x0170 }
            r1.A00 = r0     // Catch:{ all -> 0x0170 }
        L_0x00f5:
            boolean r0 = X.C18300x5.A1X(r0, r13)     // Catch:{ all -> 0x0170 }
            if (r0 == 0) goto L_0x0109
            X.1VX r1 = r1.A01     // Catch:{ all -> 0x0170 }
            r0 = 2025(0x7e9, float:2.838E-42)
            boolean r1 = r1.A0X(r0)     // Catch:{ all -> 0x0170 }
            r0 = 1
            if (r1 != 0) goto L_0x010a
            goto L_0x0109
        L_0x0107:
            r7 = 0
            goto L_0x010c
        L_0x0109:
            r0 = 0
        L_0x010a:
            if (r0 == 0) goto L_0x0107
        L_0x010c:
            if (r7 == 0) goto L_0x0167
            X.7h2 r7 = r3.A01     // Catch:{ all -> 0x0170 }
            int r2 = r6.available()     // Catch:{ IOException -> 0x014b }
            X.7WO r10 = r7.A03     // Catch:{ IOException -> 0x014b }
            r0 = 12288(0x3000, float:1.7219E-41)
            if (r2 <= r0) goto L_0x011b
            r0 = r2
        L_0x011b:
            X.7WO r9 = X.C155127eK.A00     // Catch:{ IOException -> 0x014b }
            java.nio.ByteBuffer r8 = r9.A00(r0)     // Catch:{ IOException -> 0x014b }
            byte[] r0 = r8.array()     // Catch:{ all -> 0x0146 }
            r6.read(r0)     // Catch:{ all -> 0x0146 }
            byte[] r1 = r8.array()     // Catch:{ all -> 0x0146 }
            r0 = 0
            com.whatsapp.superpack.WhatsAppObiInputStream r2 = com.whatsapp.superpack.WhatsAppObiInputStream.openBytes(r1, r0, r2)     // Catch:{ all -> 0x0146 }
            android.graphics.Bitmap r0 = X.C155127eK.A00(r10, r2)     // Catch:{ all -> 0x013c }
            r2.close()     // Catch:{ all -> 0x0146 }
            r9.A01(r8)     // Catch:{ IOException -> 0x014b }
            goto L_0x0163
        L_0x013c:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0141 }
            goto L_0x0145
        L_0x0141:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0146 }
        L_0x0145:
            throw r1     // Catch:{ all -> 0x0146 }
        L_0x0146:
            r0 = move-exception
            r9.A01(r8)     // Catch:{ IOException -> 0x014b }
            throw r0     // Catch:{ IOException -> 0x014b }
        L_0x014b:
            r0 = move-exception
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0170 }
            X.4rR r2 = new X.4rR     // Catch:{ all -> 0x0170 }
            r2.<init>()     // Catch:{ all -> 0x0170 }
            r2.A02 = r0     // Catch:{ all -> 0x0170 }
            java.lang.String r0 = "doodle_emoji"
            r2.A01 = r0     // Catch:{ all -> 0x0170 }
            X.5ZC r1 = X.C156687h2.A04     // Catch:{ all -> 0x0170 }
            X.4FV r0 = r7.A02     // Catch:{ all -> 0x0170 }
            r0.BhC(r2, r1)     // Catch:{ all -> 0x0170 }
            r0 = 0
        L_0x0163:
            r6.close()     // Catch:{ IOException -> 0x017a }
            goto L_0x016e
        L_0x0167:
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r6, r4, r2)     // Catch:{ all -> 0x0170 }
            r6.close()     // Catch:{ IOException -> 0x017a }
        L_0x016e:
            monitor-exit(r3)
            return r0
        L_0x0170:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0175 }
            goto L_0x0179
        L_0x0175:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x017a }
        L_0x0179:
            throw r1     // Catch:{ IOException -> 0x017a }
        L_0x017a:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x019e }
            java.lang.String r0 = "DoodleEmojiManager/getBitmap/Could not get bitmap from downloaded file for "
            r1.append(r0)     // Catch:{ all -> 0x019e }
            java.lang.String r0 = r5.getName()     // Catch:{ all -> 0x019e }
            X.C18260x0.A15(r0, r1, r2)     // Catch:{ all -> 0x019e }
            monitor-exit(r3)
            return r4
        L_0x018d:
            r0 = 0
            r3.A09(r0, r1)     // Catch:{ all -> 0x019e }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x019e }
            java.lang.String r0 = "DoodleEmojiManager/getBitmap/Error getting downloaded file to compute bitmap for emojiId="
            X.C18260x0.A0x(r0, r1, r13)     // Catch:{ all -> 0x019e }
            monitor-exit(r3)
            return r4
        L_0x019c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x019e }
        L_0x019e:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8GV.BJn(android.content.res.Resources, int):android.graphics.Bitmap");
    }

    public /* synthetic */ AnonymousClass8GV(C184318rb r1, AnonymousClass5Y0 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}

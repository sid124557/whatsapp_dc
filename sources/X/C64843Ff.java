package X;

/* renamed from: X.3Ff  reason: invalid class name and case insensitive filesystem */
public class C64843Ff implements AnonymousClass4E8 {
    public final C621133n A00;
    public final C48972fm A01;
    public final C614730x A02;

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a6, code lost:
        r5 = X.C18320x8.A05(r6.get(r5));
        X.C18260x0.A12("axolotl found keys ready to be deleted, uploaded at or before: ", X.AnonymousClass001.A0o(), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00cd, code lost:
        if (r5 <= 0) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cf, code lost:
        r9 = r10.A0C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r8 = r9.Axl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r7 = r10.A0C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r4 = ((X.AnonymousClass3H0) r7).A03;
        r2 = X.AnonymousClass0x9.A1Y();
        r1 = java.lang.String.valueOf(r5);
        r2[0] = r1;
        r6 = r4.A07("prekeys", "sent_to_server = 1 AND upload_timestamp <= ?", "SignalPreKeyStore/deleteExpiredSentPreKeys", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r7.close();
        r5 = r10.A0C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r2 = ((X.AnonymousClass3H0) r5).A03.A07("prekey_uploads", "upload_timestamp <= ?", "SignalPreKeyStore/deleteExpiredPreKeyUpload", X.C18270x1.A1b(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r1 = X.C18280x3.A0f(r5);
        r1.append("axolotl deleted expired uploaded keys:");
        r1.append(r6);
        X.C18260x0.A0y(" timestamp rows:", r1, r2);
        r8.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x012b, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0130, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0135, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0139, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x013a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x013f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0143, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0144, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0157, code lost:
        r0 = "axolotl deleteExpiredServerPreKeys, nothing expiring yet";
     */
    /* JADX WARNING: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x015e A[SYNTHETIC, Splitter:B:77:0x015e] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0163  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r16 = this;
            r1 = r16
            X.30x r0 = r1.A02
            X.3fe r15 = r0.A03()
            X.33n r1 = r1.A00     // Catch:{ all -> 0x018e }
            r1.A0J()     // Catch:{ all -> 0x018e }
            X.30x r0 = r1.A0K     // Catch:{ all -> 0x018e }
            X.3fe r14 = r0.A03()     // Catch:{ all -> 0x018e }
            X.35n r0 = r1.A00     // Catch:{ all -> 0x0182 }
            X.2qP r3 = r0.A02     // Catch:{ all -> 0x0182 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ all -> 0x0182 }
            X.3Mh r1 = r3.A00     // Catch:{ all -> 0x0182 }
            X.1Ek r0 = X.C66663Mh.A1o     // Catch:{ all -> 0x0182 }
            int r0 = r1.A03(r0)     // Catch:{ all -> 0x0182 }
            long r0 = (long) r0     // Catch:{ all -> 0x0182 }
            long r12 = r2.toSeconds(r0)     // Catch:{ all -> 0x0182 }
            X.2q3 r0 = r3.A04     // Catch:{ all -> 0x0182 }
            X.2sH r7 = r0.A01     // Catch:{ all -> 0x0182 }
            long r5 = X.C56612sH.A00(r7)     // Catch:{ all -> 0x0182 }
            long r5 = r5 - r12
            X.1RJ r10 = r0.A02     // Catch:{ all -> 0x0182 }
            X.4Fq r4 = r10.A0C()     // Catch:{ all -> 0x0182 }
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0178 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x0178 }
            java.lang.String r11 = "prekeys"
            java.lang.String r2 = "direct_distribution = 1 AND upload_timestamp < ?"
            java.lang.String[] r1 = X.C18260x0.A1b(r5)     // Catch:{ all -> 0x0178 }
            java.lang.String r0 = "SignalPreKeyStore/deleteExpiredDirectDistributionPreKeys"
            int r2 = r3.A07(r11, r2, r0, r1)     // Catch:{ all -> 0x0178 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0178 }
            java.lang.String r0 = "axolotl deleted expired direct distribution keys:"
            X.C18260x0.A0y(r0, r1, r2)     // Catch:{ all -> 0x0178 }
            java.util.ArrayList r6 = X.C18320x8.A0n(r4)     // Catch:{ all -> 0x0182 }
            X.4GK r3 = r10.get()     // Catch:{ all -> 0x0182 }
            r0 = r3
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0173 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x0173 }
            java.lang.String r1 = "SELECT upload_timestamp FROM prekey_uploads ORDER BY _id DESC"
            java.lang.String r0 = "SignalPreKeyStore/getAllPreKeyUploads"
            android.database.Cursor r2 = X.C56862sg.A01(r2, r1, r0)     // Catch:{ all -> 0x0173 }
            java.lang.String r0 = "upload_timestamp"
            int r1 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0167 }
        L_0x006e:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0167 }
            if (r0 == 0) goto L_0x0078
            X.C18260x0.A0H(r2, r6, r1)     // Catch:{ all -> 0x0167 }
            goto L_0x006e
        L_0x0078:
            r2.close()     // Catch:{ all -> 0x0173 }
            r3.close()     // Catch:{ all -> 0x0182 }
            int r1 = r6.size()     // Catch:{ all -> 0x0182 }
            r0 = 3
            if (r1 < r0) goto L_0x0149
            java.lang.String r0 = "axolotl found more than 2 upload generations"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0182 }
            r5 = 2
        L_0x008b:
            int r0 = r6.size()     // Catch:{ all -> 0x0182 }
            r8 = 0
            if (r5 >= r0) goto L_0x0157
            int r0 = r5 + -2
            java.lang.Object r0 = r6.get(r0)     // Catch:{ all -> 0x0182 }
            long r3 = X.C18320x8.A05(r0)     // Catch:{ all -> 0x0182 }
            long r3 = r3 + r12
            long r1 = X.C56612sH.A00(r7)     // Catch:{ all -> 0x0182 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b8
            java.lang.Object r0 = r6.get(r5)     // Catch:{ all -> 0x0182 }
            long r5 = X.C18320x8.A05(r0)     // Catch:{ all -> 0x0182 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0182 }
            java.lang.String r0 = "axolotl found keys ready to be deleted, uploaded at or before: "
            X.C18260x0.A12(r0, r1, r5)     // Catch:{ all -> 0x0182 }
            goto L_0x00cb
        L_0x00b8:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0182 }
            java.lang.String r0 = "axolotl not deleting prekeys for upload timestamp:"
            r1.append(r0)     // Catch:{ all -> 0x0182 }
            java.lang.Object r0 = r6.get(r5)     // Catch:{ all -> 0x0182 }
            X.C18260x0.A0o(r0, r1)     // Catch:{ all -> 0x0182 }
            int r5 = r5 + 1
            goto L_0x008b
        L_0x00cb:
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0157
            X.4Fq r9 = r10.A0C()     // Catch:{ all -> 0x0182 }
            X.3Yo r8 = r9.Axl()     // Catch:{ all -> 0x0144 }
            X.4Fq r7 = r10.A0C()     // Catch:{ all -> 0x013a }
            r0 = r7
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0130 }
            X.2sg r4 = r0.A03     // Catch:{ all -> 0x0130 }
            java.lang.String r3 = "sent_to_server = 1 AND upload_timestamp <= ?"
            java.lang.String[] r2 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x0130 }
            java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0130 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x0130 }
            java.lang.String r0 = "SignalPreKeyStore/deleteExpiredSentPreKeys"
            int r6 = r4.A07(r11, r3, r0, r2)     // Catch:{ all -> 0x0130 }
            r7.close()     // Catch:{ all -> 0x013a }
            X.4Fq r5 = r10.A0C()     // Catch:{ all -> 0x013a }
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x012b }
            X.2sg r4 = r0.A03     // Catch:{ all -> 0x012b }
            java.lang.String r3 = "prekey_uploads"
            java.lang.String r2 = "upload_timestamp <= ?"
            java.lang.String[] r1 = X.C18270x1.A1b(r1)     // Catch:{ all -> 0x012b }
            java.lang.String r0 = "SignalPreKeyStore/deleteExpiredPreKeyUpload"
            int r2 = r4.A07(r3, r2, r0, r1)     // Catch:{ all -> 0x012b }
            java.lang.StringBuilder r1 = X.C18280x3.A0f(r5)     // Catch:{ all -> 0x013a }
            java.lang.String r0 = "axolotl deleted expired uploaded keys:"
            r1.append(r0)     // Catch:{ all -> 0x013a }
            r1.append(r6)     // Catch:{ all -> 0x013a }
            java.lang.String r0 = " timestamp rows:"
            X.C18260x0.A0y(r0, r1, r2)     // Catch:{ all -> 0x013a }
            r8.A00()     // Catch:{ all -> 0x013a }
            r8.close()     // Catch:{ all -> 0x0144 }
            r9.close()     // Catch:{ all -> 0x0182 }
            goto L_0x015c
        L_0x012b:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0135 }
            goto L_0x0139
        L_0x0130:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0135 }
            goto L_0x0139
        L_0x0135:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x013a }
        L_0x0139:
            throw r1     // Catch:{ all -> 0x013a }
        L_0x013a:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x013f }
            goto L_0x0143
        L_0x013f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0144 }
        L_0x0143:
            throw r1     // Catch:{ all -> 0x0144 }
        L_0x0144:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x017d }
            goto L_0x0181
        L_0x0149:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0182 }
            java.lang.String r0 = "axolotl deleteExpiredServerPreKeys, not enough key uploads yet:"
            X.C18260x0.A19(r0, r1, r6)     // Catch:{ all -> 0x0182 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0182 }
            goto L_0x0159
        L_0x0157:
            java.lang.String r0 = "axolotl deleteExpiredServerPreKeys, nothing expiring yet"
        L_0x0159:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0182 }
        L_0x015c:
            if (r14 == 0) goto L_0x0161
            r14.close()     // Catch:{ all -> 0x018e }
        L_0x0161:
            if (r15 == 0) goto L_0x0166
            r15.close()
        L_0x0166:
            return
        L_0x0167:
            r1 = move-exception
            if (r2 == 0) goto L_0x0172
            r2.close()     // Catch:{ all -> 0x016e }
            goto L_0x0172
        L_0x016e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0173 }
        L_0x0172:
            throw r1     // Catch:{ all -> 0x0173 }
        L_0x0173:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x017d }
            goto L_0x0181
        L_0x0178:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x017d }
            goto L_0x0181
        L_0x017d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0182 }
        L_0x0181:
            throw r1     // Catch:{ all -> 0x0182 }
        L_0x0182:
            r1 = move-exception
            if (r14 == 0) goto L_0x018d
            r14.close()     // Catch:{ all -> 0x0189 }
            goto L_0x018d
        L_0x0189:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x018e }
        L_0x018d:
            throw r1     // Catch:{ all -> 0x018e }
        L_0x018e:
            r1 = move-exception
            if (r15 == 0) goto L_0x0199
            r15.close()     // Catch:{ all -> 0x0195 }
            throw r1
        L_0x0195:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0199:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64843Ff.A00():void");
    }

    public void BQW() {
        if (this.A00.A0X()) {
            A00();
            return;
        }
        C48972fm r2 = this.A01;
        r2.A00.submit(C69983Zk.A00(this, 8));
    }

    public C64843Ff(C621133n r1, C48972fm r2, C614730x r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public String BDW() {
        return "CryptoDailyCron";
    }

    public void BQX() {
    }
}

package X;

/* renamed from: X.2q8  reason: invalid class name and case insensitive filesystem */
public final class C55302q8 {
    public final C28731hg A00;
    public final C59272we A01;
    public final C623334p A02;

    public String A00(AnonymousClass1fU r5) {
        Boolean bool;
        C162457s7.A0J(r5, 0);
        long A05 = this.A02.A05(r5);
        C59272we r0 = this.A01;
        C60512yg A012 = r0.A01(A05);
        if (A012 == null) {
            return null;
        }
        if (r0.A01.A0Y(C58422vE.A02, 4746)) {
            String str = A012.A01;
            if (str != null) {
                bool = C18320x8.A0V(C175738Zn.A0V(str));
            } else {
                bool = null;
            }
            if (AnonymousClass0x9.A1Q(bool)) {
                return AnonymousClass0x2.A0e(str, AnonymousClass001.A0o(), '@');
            }
        }
        return A012.A00;
    }

    public String A01(AnonymousClass1fU r6) {
        C60512yg A012;
        C162457s7.A0J(r6, 0);
        long A05 = this.A02.A05(r6);
        if (A05 < 0 || (A012 = this.A01.A01(A05)) == null) {
            return null;
        }
        return A012.A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0095, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.AnonymousClass2A8.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0099, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009d, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a0, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(X.AnonymousClass1fU r18, java.lang.String r19) {
        /*
            r17 = this;
            r5 = r18
            r4 = r19
            X.C18260x0.A0O(r5, r4)
            r7 = r17
            java.lang.String r3 = r7.A01(r5)
            if (r3 != 0) goto L_0x0011
            java.lang.String r3 = ""
        L_0x0011:
            boolean r0 = r4.equals(r3)
            if (r0 != 0) goto L_0x0033
            X.34p r0 = r7.A02
            long r0 = r0.A05(r5)
            r8 = 0
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 < 0) goto L_0x0033
            X.2we r2 = r7.A01
            r9 = 1
            X.3dV r6 = r2.A00
            boolean r2 = X.C72303dV.A00(r6)
            if (r2 != 0) goto L_0x0035
            java.lang.String r0 = "AliasedDisplayNameStore/upsertUsernameForLid db not ready"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0033:
            r2 = 0
        L_0x0034:
            return r2
        L_0x0035:
            X.4Fq r2 = r6.A04()
            X.3Yo r6 = r2.Axl()     // Catch:{ all -> 0x009a }
            android.content.ContentValues r12 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x0093 }
            java.lang.String r8 = "lid_row_id"
            X.C18270x1.A0c(r12, r8, r0)     // Catch:{ all -> 0x0093 }
            java.lang.String r8 = "username"
            X.2sg r11 = X.AnonymousClass3H0.A03(r12, r2, r8, r4)     // Catch:{ all -> 0x0093 }
            java.lang.String r13 = "lid_display_name"
            java.lang.String r14 = "lid_row_id = ?"
            java.lang.String[] r8 = new java.lang.String[r9]     // Catch:{ all -> 0x0093 }
            X.C18270x1.A1S(r8, r0)     // Catch:{ all -> 0x0093 }
            java.lang.String r15 = "LidDisplayNameStore/INSERT_USERNAME"
            r16 = r8
            int r0 = r11.A05(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0093 }
            long r0 = (long) r0     // Catch:{ all -> 0x0093 }
            r9 = 0
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 > 0) goto L_0x0070
            java.lang.String r1 = "display_name"
            java.lang.String r0 = ""
            r12.put(r1, r0)     // Catch:{ all -> 0x0093 }
            r0 = 5
            r11.A0C(r13, r15, r12, r0)     // Catch:{ all -> 0x0093 }
        L_0x0070:
            r6.A00()     // Catch:{ all -> 0x0093 }
            r6.close()     // Catch:{ all -> 0x009a }
            r2.close()
            r2 = 1
            X.1hg r0 = r7.A00
            X.C162457s7.A0J(r3, r2)
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x0083:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0034
            java.lang.Object r0 = r1.next()
            X.494 r0 = (X.AnonymousClass494) r0
            r0.BfB(r5, r3, r4)
            goto L_0x0083
        L_0x0093:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0095 }
        L_0x0095:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r6, r1)     // Catch:{ all -> 0x009a }
            throw r0     // Catch:{ all -> 0x009a }
        L_0x009a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009c }
        L_0x009c:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55302q8.A04(X.1fU, java.lang.String):boolean");
    }

    public C55302q8(C28731hg r1, C59272we r2, C623334p r3) {
        C18260x0.A0V(r3, r2, r1);
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a2, code lost:
        X.AnonymousClass2A8.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a5, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A02(java.util.Map r9) {
        /*
            r8 = this;
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.Iterator r3 = X.AnonymousClass000.A0q(r9)
        L_0x0008:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0024
            java.util.Map$Entry r2 = X.AnonymousClass001.A0w(r3)
            X.34p r1 = r8.A02
            com.whatsapp.jid.Jid r0 = X.AnonymousClass0x9.A0R(r2)
            java.lang.Long r1 = X.C623334p.A03(r1, r0)
            java.lang.Object r0 = r2.getValue()
            X.AnonymousClass3Z6.A03(r1, r0, r4)
            goto L_0x0008
        L_0x0024:
            java.util.Map r7 = X.C73813g7.A0B(r4)
            X.2we r0 = r8.A01
            X.3dV r1 = r0.A00
            boolean r0 = X.C72303dV.A00(r1)
            if (r0 != 0) goto L_0x005b
            java.lang.String r0 = "AliasedDisplayNameStore/upsertDisplayNameForLidBulk db not ready"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.3d3 r0 = X.C72023d3.A00
        L_0x0039:
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.Iterator r3 = r0.iterator()
        L_0x0041:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0093
            long r1 = X.C18270x1.A02(r3)
            X.34p r0 = r8.A02
            com.whatsapp.jid.Jid r1 = r0.A08(r1)
            boolean r0 = r1 instanceof X.C27981fH
            if (r0 == 0) goto L_0x0041
            if (r1 == 0) goto L_0x0041
            r4.add(r1)
            goto L_0x0041
        L_0x005b:
            X.4Fq r6 = r1.A04()
            X.3Yo r5 = r6.Axl()     // Catch:{ all -> 0x009f }
            java.util.Iterator r4 = X.AnonymousClass000.A0q(r7)     // Catch:{ all -> 0x0098 }
        L_0x0067:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x0081
            java.util.Map$Entry r3 = X.AnonymousClass001.A0w(r4)     // Catch:{ all -> 0x0098 }
            java.lang.Object r0 = r3.getKey()     // Catch:{ all -> 0x0098 }
            long r1 = X.C18310x6.A0B(r0)     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = X.AnonymousClass0x9.A12(r3)     // Catch:{ all -> 0x0098 }
            X.C59272we.A00(r6, r0, r1)     // Catch:{ all -> 0x0098 }
            goto L_0x0067
        L_0x0081:
            r5.A00()     // Catch:{ all -> 0x0098 }
            r5.close()     // Catch:{ all -> 0x009f }
            r6.close()
            java.util.Set r0 = r7.keySet()
            java.util.List r0 = X.C73723fy.A0F(r0)
            goto L_0x0039
        L_0x0093:
            java.util.List r0 = X.C73723fy.A0F(r4)
            return r0
        L_0x0098:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009a }
        L_0x009a:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)     // Catch:{ all -> 0x009f }
            throw r0     // Catch:{ all -> 0x009f }
        L_0x009f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55302q8.A02(java.util.Map):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03(X.AnonymousClass1fU r6, java.lang.String r7) {
        /*
            r5 = this;
            X.C18260x0.A0O(r6, r7)
            X.34p r0 = r5.A02
            long r0 = r0.A05(r6)
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x001e
            X.2we r2 = r5.A01
            X.3dV r3 = r2.A00
            boolean r2 = X.C72303dV.A00(r3)
            if (r2 != 0) goto L_0x0020
            java.lang.String r0 = "AliasedDisplayNameStore/upsertDisplayNameForLid db not ready"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x001e:
            r0 = 0
            return r0
        L_0x0020:
            X.4Fq r3 = r3.A04()
            X.3Yo r2 = r3.Axl()     // Catch:{ all -> 0x003d }
            X.C59272we.A00(r3, r7, r0)     // Catch:{ all -> 0x0036 }
            r2.A00()     // Catch:{ all -> 0x0036 }
            r2.close()     // Catch:{ all -> 0x003d }
            r3.close()
            r0 = 1
            return r0
        L_0x0036:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x003d }
            throw r0     // Catch:{ all -> 0x003d }
        L_0x003d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003f }
        L_0x003f:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55302q8.A03(X.1fU, java.lang.String):boolean");
    }
}

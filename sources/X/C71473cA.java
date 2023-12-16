package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.3cA  reason: invalid class name and case insensitive filesystem */
public class C71473cA implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    public C71473cA(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.A06 = i2;
        this.A02 = obj;
        this.A05 = obj2;
        this.A03 = obj3;
        this.A01 = obj4;
        this.A00 = i;
        this.A04 = obj5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01bd, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0289, code lost:
        if (r4 < 100) goto L_0x028b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02e0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02e1, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0170, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        com.whatsapp.util.Log.w("prekey digest SHA1 algorithm unknown", r1);
        r3.A00.A08();
        r3.A02.A1z(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0185, code lost:
        r3.A00.A08();
        r3.A02.A1z(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01b2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01b7, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01b8, code lost:
        if (r16 != null) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        r16.close();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:4:0x0028, B:53:0x0130, B:90:0x01ae] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r19 = this;
            r1 = r19
            int r0 = r1.A06
            switch(r0) {
                case 0: goto L_0x038a;
                case 1: goto L_0x01be;
                case 2: goto L_0x0007;
                case 3: goto L_0x0007;
                case 4: goto L_0x022d;
                case 5: goto L_0x02e5;
                case 6: goto L_0x03de;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r1.A01
            X.3Qh r3 = (X.C67693Qh) r3
            java.lang.Object r8 = r1.A02
            byte[] r8 = (byte[]) r8
            int r0 = r1.A00
            byte r6 = (byte) r0
            java.lang.Object r4 = r1.A03
            byte[] r4 = (byte[]) r4
            java.lang.Object r5 = r1.A04
            byte[][] r5 = (byte[][]) r5
            java.lang.Object r7 = r1.A05
            byte[] r7 = (byte[]) r7
            X.30x r0 = r3.A05
            X.3fe r16 = r0.A03()
            r0 = 5
            r2 = 0
            if (r6 == r0) goto L_0x0034
            X.1i9 r0 = r3.A00     // Catch:{ all -> 0x01b7 }
            r0.A08()     // Catch:{ all -> 0x01b7 }
            X.33p r0 = r3.A02     // Catch:{ all -> 0x01b7 }
            r0.A1z(r2)     // Catch:{ all -> 0x01b7 }
            goto L_0x018f
        L_0x0034:
            byte r0 = r8[r2]     // Catch:{ all -> 0x01b7 }
            int r1 = X.C18290x4.A07(r8, r0, r2)     // Catch:{ all -> 0x01b7 }
            X.33n r6 = r3.A03     // Catch:{ all -> 0x01b7 }
            X.2qF r0 = r6.A07     // Catch:{ all -> 0x01b7 }
            int r0 = r0.A01()     // Catch:{ all -> 0x01b7 }
            if (r1 == r0) goto L_0x0050
            X.1i9 r0 = r3.A00     // Catch:{ all -> 0x01b7 }
            r0.A08()     // Catch:{ all -> 0x01b7 }
            X.33p r0 = r3.A02     // Catch:{ all -> 0x01b7 }
            r0.A1z(r2)     // Catch:{ all -> 0x01b7 }
            goto L_0x018f
        L_0x0050:
            byte[] r9 = r6.A0d()     // Catch:{ all -> 0x01b7 }
            X.2Ov r8 = r6.A0D()     // Catch:{ all -> 0x01b7 }
            byte[] r0 = r8.A01     // Catch:{ all -> 0x01b7 }
            boolean r0 = java.util.Arrays.equals(r0, r4)     // Catch:{ all -> 0x01b7 }
            if (r0 != 0) goto L_0x006c
            X.1i9 r0 = r3.A00     // Catch:{ all -> 0x01b7 }
            r0.A08()     // Catch:{ all -> 0x01b7 }
            X.33p r0 = r3.A02     // Catch:{ all -> 0x01b7 }
            r0.A1z(r2)     // Catch:{ all -> 0x01b7 }
            goto L_0x018f
        L_0x006c:
            int r4 = r5.length     // Catch:{ all -> 0x01b7 }
            int[] r11 = new int[r4]     // Catch:{ all -> 0x01b7 }
            r1 = 0
        L_0x0070:
            if (r1 >= r4) goto L_0x007d
            r0 = r5[r1]     // Catch:{ all -> 0x01b7 }
            int r0 = X.AnonymousClass36A.A00(r0)     // Catch:{ all -> 0x01b7 }
            r11[r1] = r0     // Catch:{ all -> 0x01b7 }
            int r1 = r1 + 1
            goto L_0x0070
        L_0x007d:
            X.30x r0 = r6.A0K     // Catch:{ all -> 0x01b7 }
            X.3fe r15 = r0.A03()     // Catch:{ all -> 0x01b7 }
            java.util.ArrayList r5 = X.AnonymousClass002.A0I(r4)     // Catch:{ all -> 0x01ab }
            android.util.SparseArray r10 = new android.util.SparseArray     // Catch:{ all -> 0x01ab }
            r10.<init>(r4)     // Catch:{ all -> 0x01ab }
            X.2q3 r0 = r6.A09     // Catch:{ all -> 0x01ab }
            java.util.ArrayList r13 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x01ab }
            X.1RJ r0 = r0.A02     // Catch:{ all -> 0x01ab }
            X.4GK r14 = r0.get()     // Catch:{ all -> 0x01ab }
            r0 = r14
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x01a1 }
            X.2sg r6 = r0.A03     // Catch:{ all -> 0x01a1 }
            java.lang.String r1 = "SELECT prekey_id, record FROM prekeys"
            java.lang.String r0 = "SignalPreKeyStore/getPreKeys"
            android.database.Cursor r12 = X.C56862sg.A01(r6, r1, r0)     // Catch:{ all -> 0x01a1 }
        L_0x00a5:
            boolean r0 = r12.moveToNext()     // Catch:{ all -> 0x0195 }
            if (r0 == 0) goto L_0x00c2
            java.lang.String r0 = "prekey_id"
            int r6 = X.AnonymousClass0x2.A04(r12, r0)     // Catch:{ all -> 0x0195 }
            java.lang.String r0 = "record"
            byte[] r1 = X.C18280x3.A1Z(r12, r0)     // Catch:{ all -> 0x0195 }
            X.2JO r0 = new X.2JO     // Catch:{ all -> 0x0195 }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x0195 }
            r13.add(r0)     // Catch:{ all -> 0x0195 }
            goto L_0x00a5
        L_0x00c2:
            r12.close()     // Catch:{ all -> 0x01a1 }
            r14.close()     // Catch:{ all -> 0x01ab }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x01ab }
        L_0x00cc:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x01ab }
            if (r0 == 0) goto L_0x00f7
            java.lang.Object r12 = r13.next()     // Catch:{ all -> 0x01ab }
            X.2JO r12 = (X.AnonymousClass2JO) r12     // Catch:{ all -> 0x01ab }
            int r1 = r12.A00     // Catch:{ IOException -> 0x00e4 }
            byte[] r0 = r12.A01     // Catch:{ IOException -> 0x00e4 }
            X.2Ov r0 = X.C621133n.A00(r0, r1)     // Catch:{ IOException -> 0x00e4 }
            r10.put(r1, r0)     // Catch:{ IOException -> 0x00e4 }
            goto L_0x00cc
        L_0x00e4:
            r6 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01ab }
            java.lang.String r0 = "error reading prekey "
            r1.append(r0)     // Catch:{ all -> 0x01ab }
            int r0 = r12.A00     // Catch:{ all -> 0x01ab }
            r1.append(r0)     // Catch:{ all -> 0x01ab }
            X.C18280x3.A1C(r1, r6)     // Catch:{ all -> 0x01ab }
            goto L_0x00cc
        L_0x00f7:
            r1 = 0
        L_0x00f8:
            if (r1 >= r4) goto L_0x010e
            r0 = r11[r1]     // Catch:{ all -> 0x01ab }
            java.lang.Object r0 = r10.get(r0)     // Catch:{ all -> 0x01ab }
            X.2Ov r0 = (X.C42612Ov) r0     // Catch:{ all -> 0x01ab }
            if (r0 != 0) goto L_0x0105
            goto L_0x010b
        L_0x0105:
            r5.add(r0)     // Catch:{ all -> 0x01ab }
            int r1 = r1 + 1
            goto L_0x00f8
        L_0x010b:
            if (r15 == 0) goto L_0x0185
            goto L_0x0182
        L_0x010e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01ab }
            java.lang.String r0 = "axolotl reporting back "
            X.C18260x0.A19(r0, r1, r5)     // Catch:{ all -> 0x01ab }
            java.lang.String r0 = " sequenced prekeys"
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x01ab }
            X.2Ov[] r0 = new X.C42612Ov[r2]     // Catch:{ all -> 0x01ab }
            java.lang.Object[] r6 = r5.toArray(r0)     // Catch:{ all -> 0x01ab }
            X.2Ov[] r6 = (X.C42612Ov[]) r6     // Catch:{ all -> 0x01ab }
            if (r15 == 0) goto L_0x0129
            r15.close()     // Catch:{ all -> 0x01b7 }
        L_0x0129:
            if (r6 == 0) goto L_0x0185
            int r5 = r6.length     // Catch:{ all -> 0x01b7 }
            if (r5 != r4) goto L_0x0185
            java.lang.String r0 = "SHA1"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0170 }
            r4.update(r9)     // Catch:{ all -> 0x01b7 }
            byte[] r0 = r8.A00     // Catch:{ all -> 0x01b7 }
            r4.update(r0)     // Catch:{ all -> 0x01b7 }
            byte[] r0 = r8.A02     // Catch:{ all -> 0x01b7 }
            r4.update(r0)     // Catch:{ all -> 0x01b7 }
            r1 = 0
        L_0x0142:
            if (r1 >= r5) goto L_0x014e
            r0 = r6[r1]     // Catch:{ all -> 0x01b7 }
            byte[] r0 = r0.A00     // Catch:{ all -> 0x01b7 }
            r4.update(r0)     // Catch:{ all -> 0x01b7 }
            int r1 = r1 + 1
            goto L_0x0142
        L_0x014e:
            byte[] r0 = r4.digest()     // Catch:{ all -> 0x01b7 }
            boolean r0 = java.util.Arrays.equals(r0, r7)     // Catch:{ all -> 0x01b7 }
            if (r0 != 0) goto L_0x0169
            java.lang.String r0 = "prekey digest check failed"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x01b7 }
            X.1i9 r0 = r3.A00     // Catch:{ all -> 0x01b7 }
            r0.A08()     // Catch:{ all -> 0x01b7 }
        L_0x0163:
            X.33p r0 = r3.A02     // Catch:{ all -> 0x01b7 }
            r0.A1z(r2)     // Catch:{ all -> 0x01b7 }
            goto L_0x018f
        L_0x0169:
            java.lang.String r0 = "prekey digest check passed"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01b7 }
            goto L_0x0163
        L_0x0170:
            r1 = move-exception
            java.lang.String r0 = "prekey digest SHA1 algorithm unknown"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x01b7 }
            X.1i9 r0 = r3.A00     // Catch:{ all -> 0x01b7 }
            r0.A08()     // Catch:{ all -> 0x01b7 }
            X.33p r0 = r3.A02     // Catch:{ all -> 0x01b7 }
            r0.A1z(r2)     // Catch:{ all -> 0x01b7 }
            goto L_0x018f
        L_0x0182:
            r15.close()     // Catch:{ all -> 0x01b7 }
        L_0x0185:
            X.1i9 r0 = r3.A00     // Catch:{ all -> 0x01b7 }
            r0.A08()     // Catch:{ all -> 0x01b7 }
            X.33p r0 = r3.A02     // Catch:{ all -> 0x01b7 }
            r0.A1z(r2)     // Catch:{ all -> 0x01b7 }
        L_0x018f:
            if (r16 == 0) goto L_0x03dd
            r16.close()
            return
        L_0x0195:
            r1 = move-exception
            if (r12 == 0) goto L_0x01a0
            r12.close()     // Catch:{ all -> 0x019c }
            goto L_0x01a0
        L_0x019c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01a1 }
        L_0x01a0:
            throw r1     // Catch:{ all -> 0x01a1 }
        L_0x01a1:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x01a6 }
            goto L_0x01aa
        L_0x01a6:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01ab }
        L_0x01aa:
            throw r1     // Catch:{ all -> 0x01ab }
        L_0x01ab:
            r1 = move-exception
            if (r15 == 0) goto L_0x01b6
            r15.close()     // Catch:{ all -> 0x01b2 }
            goto L_0x01b6
        L_0x01b2:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01b7 }
        L_0x01b6:
            throw r1     // Catch:{ all -> 0x01b7 }
        L_0x01b7:
            r1 = move-exception
            if (r16 == 0) goto L_0x02e4
            r16.close()     // Catch:{ all -> 0x02e0 }
            throw r1
        L_0x01be:
            java.lang.Object r5 = r1.A01
            X.3Lq r5 = (X.C66493Lq) r5
            java.lang.Object r4 = r1.A02
            X.1fK r4 = (X.C28001fK) r4
            java.lang.Object r3 = r1.A03
            X.34x r3 = (X.C624134x) r3
            int r2 = r1.A00
            java.lang.Object r9 = r1.A04
            java.io.File r9 = (java.io.File) r9
            java.lang.Object r10 = r1.A05
            java.io.File r10 = (java.io.File) r10
            r0 = 300(0x12c, double:1.48E-321)
            android.os.SystemClock.sleep(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "group/create again, jid:"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " subject:"
            r1.append(r0)
            java.lang.String r0 = r3.A13()
            X.C18260x0.A1M(r1, r0)
            X.2dL r1 = new X.2dL
            r1.<init>(r4)
            java.lang.String r0 = r3.A13()
            r1.A03 = r0
            java.util.List r0 = r3.A19()
            r1.A04 = r0
            r1.A00 = r2
            X.2U1 r7 = r1.A00()
            X.2sH r2 = r5.A0M
            X.3Lv r4 = r5.A0U
            X.2sd r8 = r5.A17
            X.1hw r3 = r5.A0T
            X.1eA r1 = new X.1eA
            r6 = r5
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            X.1VX r10 = r5.A0j
            X.2qk r7 = r5.A04
            X.2sr r8 = r5.A06
            X.31C r0 = r5.A0z
            X.2U1 r13 = r1.A04
            X.3TR r6 = new X.3TR
            r9 = r2
            r11 = r5
            r12 = r1
            r14 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r6.A00()
            return
        L_0x022d:
            java.lang.Object r11 = r1.A01
            X.2rc r11 = (X.C56212rc) r11
            java.lang.Object r8 = r1.A02
            X.4uY r8 = (X.C95804uY) r8
            java.lang.Object r6 = r1.A03
            X.31A r6 = (X.AnonymousClass31A) r6
            java.lang.Object r13 = r1.A04
            java.lang.Long r13 = (java.lang.Long) r13
            int r3 = r1.A00
            java.lang.Object r9 = r1.A05
            X.4Ap r9 = (X.C83994Ap) r9
            X.2rr r1 = r11.A05
            java.lang.String[] r4 = X.AnonymousClass0x9.A1Y()
            X.2sm r0 = r1.A01
            X.C56922sm.A01(r0, r8, r4)
            X.3dV r0 = r1.A04
            X.4GK r7 = r0.get()
            r0 = r7
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x02db }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x02db }
            java.lang.String r1 = "   SELECT sort_id FROM available_message_view WHERE chat_row_id = ? AND (message_type != '7') AND (message_type != '8') ORDER BY sort_id ASC LIMIT 1"
            java.lang.String r0 = "GET_FIRST_SORT_REF_SQL"
            android.database.Cursor r2 = r2.A0E(r1, r0, r4)     // Catch:{ all -> 0x02db }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x02cf }
            if (r0 == 0) goto L_0x0272
            java.lang.String r0 = "sort_id"
            long r4 = X.AnonymousClass0x2.A0C(r2, r0)     // Catch:{ all -> 0x02cf }
            r2.close()     // Catch:{ all -> 0x02db }
            goto L_0x0281
        L_0x0272:
            r2.close()     // Catch:{ all -> 0x02db }
            java.lang.StringBuilder r1 = X.C18280x3.A0f(r7)
            java.lang.String r0 = "SortIdStore/ getFirstSortId can't get value for "
            X.C18260x0.A1S(r1, r0, r8)
            r4 = -9223372036854775808
            goto L_0x028b
        L_0x0281:
            r7.close()
            r15 = r4
            r1 = 100
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x028d
        L_0x028b:
            r15 = 100
        L_0x028d:
            X.1RL r6 = (X.AnonymousClass1RL) r6
            boolean r0 = r6.A0M
            r10 = 0
            if (r0 == 0) goto L_0x029f
            r12 = r8
            r14 = r3
            r11.A05(r12, r13, r14, r15)
        L_0x0299:
            if (r9 == 0) goto L_0x03dd
            r9.Bjl(r10)
            return
        L_0x029f:
            r1 = 1
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x02af
            X.2nm r7 = r11.A0B
            r14 = 0
            r12 = 50
            r11 = r10
            r7.A00(r8, r9, r10, r11, r12, r14)
            return
        L_0x02af:
            r12 = r8
            r14 = r3
            r11.A05(r12, r13, r14, r15)
            if (r13 == 0) goto L_0x03dd
            long r1 = r13.longValue()
            long r1 = r1 - r4
            r16 = 50
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x0299
            X.2nm r11 = r11.A0B
            java.lang.Long r14 = java.lang.Long.valueOf(r4)
            r18 = 0
            r13 = r9
            r15 = r10
            r11.A00(r12, r13, r14, r15, r16, r18)
            return
        L_0x02cf:
            r1 = move-exception
            if (r2 == 0) goto L_0x02da
            r2.close()     // Catch:{ all -> 0x02d6 }
            goto L_0x02da
        L_0x02d6:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x02db }
        L_0x02da:
            throw r1     // Catch:{ all -> 0x02db }
        L_0x02db:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x02e0 }
            throw r1
        L_0x02e0:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x02e4:
            throw r1
        L_0x02e5:
            java.lang.Object r4 = r1.A01
            X.1iO r4 = (X.C29171iO) r4
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x032b
            java.lang.Object r0 = r1.A05
            X.1id r0 = (X.C29321id) r0
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x032b
            java.lang.Object r4 = r1.A03
            X.2HT r4 = (X.AnonymousClass2HT) r4
            X.2HS r0 = r4.A00
            if (r0 == 0) goto L_0x03dd
            com.whatsapp.notification.PopupNotification r0 = r0.A00
            boolean r0 = r0.A1S
            if (r0 == 0) goto L_0x03dd
            java.lang.String r0 = "messagenotification/popupnotification/foreground"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x030b:
            java.lang.Object r3 = r1.A04
            X.4uZ r3 = (X.C95814uZ) r3
            X.2HS r0 = r4.A00
            if (r0 == 0) goto L_0x0321
            com.whatsapp.notification.PopupNotification r2 = r0.A00
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "popupnotification/set-quick-reply-jid:"
            X.C18260x0.A1R(r1, r0, r3)
            r2.A0z = r3
        L_0x0321:
            X.2HS r0 = r4.A00
            if (r0 == 0) goto L_0x03dd
            com.whatsapp.notification.PopupNotification r0 = r0.A00
            r0.A6k()
            return
        L_0x032b:
            java.lang.String r0 = "messagenotification/popupnotification/background"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r0 = r1.A05
            X.1id r0 = (X.C29321id) r0
            boolean r0 = r0.A09()
            r3 = 3
            if (r0 == 0) goto L_0x0343
            int r2 = r1.A00
            r0 = 2
            if (r2 == r0) goto L_0x034b
            if (r2 == r3) goto L_0x034b
        L_0x0343:
            boolean r0 = r4.A00
            if (r0 != 0) goto L_0x035b
            int r0 = r1.A00
            if (r0 == r3) goto L_0x035b
        L_0x034b:
            r2 = 1
        L_0x034c:
            java.lang.Object r4 = r1.A03
            X.2HT r4 = (X.AnonymousClass2HT) r4
            X.2HS r0 = r4.A00
            if (r0 == 0) goto L_0x035d
            com.whatsapp.notification.PopupNotification r0 = r0.A00
            boolean r0 = r0.A1S
            if (r0 == 0) goto L_0x035d
            goto L_0x030b
        L_0x035b:
            r2 = 0
            goto L_0x034c
        L_0x035d:
            if (r2 == 0) goto L_0x03dd
            java.lang.Object r5 = r1.A02
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r4 = r1.A04
            com.whatsapp.jid.Jid r4 = (com.whatsapp.jid.Jid) r4
            r3 = 0
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.notification.PopupNotification"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "popup_notification_extra_quick_reply_jid"
            X.C627336j.A0D(r2, r4, r0)
            java.lang.String r0 = "popup_notification_extra_dismiss_notification"
            r2.putExtra(r0, r3)
            r0 = 268697600(0x10040000, float:2.603241E-29)
            r2.setFlags(r0)
            r5.startActivity(r2)
            return
        L_0x038a:
            X.1aO r4 = new X.1aO
            r4.<init>()
            java.lang.Object r2 = r1.A03
            X.2rV r2 = (X.C56152rV) r2
            java.lang.Object r0 = r1.A04
            X.4uZ r0 = (X.C95814uZ) r0
            r6 = 1
            X.34x r5 = r2.A02(r0, r6)
            if (r5 == 0) goto L_0x03bc
            int r0 = X.C624134x.A05(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A00 = r0
            long r2 = r5.A0K
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r4.A05 = r0
            X.2z0 r0 = r5.A1J
            java.lang.String r0 = r0.A01
            r4.A06 = r0
            java.lang.String r0 = X.AnonymousClass31G.A00(r5)
            r4.A07 = r0
        L_0x03bc:
            int r0 = r1.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A02 = r0
            java.lang.Object r0 = r1.A02
            java.lang.Integer r0 = (java.lang.Integer) r0
            r4.A03 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r4.A04 = r0
            java.lang.Object r0 = r1.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            r4.A01 = r0
            java.lang.Object r0 = r1.A05
            X.4FV r0 = (X.AnonymousClass4FV) r0
            r0.BhD(r4)
        L_0x03dd:
            return
        L_0x03de:
            java.lang.Object r2 = r1.A05
            X.3MY r2 = (X.AnonymousClass3MY) r2
            java.lang.Object r10 = r1.A02
            java.security.cert.X509Certificate r10 = (java.security.cert.X509Certificate) r10
            java.lang.Object r9 = r1.A04
            java.security.PublicKey r9 = (java.security.PublicKey) r9
            int r0 = r1.A00
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r1.A01
            X.4EJ r3 = (X.AnonymousClass4EJ) r3
            java.lang.Object r4 = r1.A03
            X.2p5 r4 = (X.C54662p5) r4
            r0 = 0
            X.C18270x1.A11(r10, r0, r4)
            r11 = -1
            r6 = 0
            r8 = r6
            r7 = r6
            r2.A07(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71473cA.run():void");
    }

    public C71473cA(AnonymousClass4EJ r2, C54662p5 r3, AnonymousClass3MY r4, PublicKey publicKey, X509Certificate x509Certificate, int i) {
        this.A06 = 6;
        C162457s7.A0J(publicKey, 3);
        this.A05 = r4;
        this.A02 = x509Certificate;
        this.A04 = publicKey;
        this.A00 = i;
        this.A01 = r2;
        this.A03 = r3;
    }
}

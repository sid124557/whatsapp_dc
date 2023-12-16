package X;

import android.database.Cursor;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2sZ  reason: invalid class name and case insensitive filesystem */
public class C56792sZ {
    public final C56972sr A00;
    public final C66663Mh A01;
    public final C49712gy A02;
    public final C64663Ek A03;
    public final C56612sH A04;
    public final AnonymousClass33p A05;
    public final AnonymousClass1RE A06;
    public final C45192Za A07;
    public final C56302rl A08;
    public final C54312oW A09;
    public final AnonymousClass2WC A0A;
    public final AnonymousClass35J A0B;

    public C60542yj A01() {
        String str;
        C60542yj A012 = this.A09.A01();
        if (A012 == null) {
            str = "SyncdKeyManager/getActiveKey: no latest key";
        } else {
            long millis = TimeUnit.DAYS.toMillis((long) this.A01.A03(C66663Mh.A1R));
            long A0H = this.A04.A0H();
            C52402lQ r2 = A012.A00;
            if (A0H - r2.A00 > millis) {
                str = "SyncdKeyManager/getActiveKey: latest key expired";
            } else if (A0B(r2)) {
                return A012;
            } else {
                return null;
            }
        }
        Log.d(str);
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0195, code lost:
        if (r4.get((java.lang.Object) null) != null) goto L_0x0197;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashMap A02(java.lang.String r14, java.util.Collection r15) {
        /*
            r13 = this;
            X.2oW r2 = r13.A09
            r0 = 0
            r2.A03(r15, r0)
            java.util.HashSet r0 = X.AnonymousClass0x9.A15(r15)
            java.util.HashMap r4 = r13.A03(r0)
            r3 = 0
            boolean r0 = r4.containsValue(r3)
            if (r0 == 0) goto L_0x01a4
            java.util.HashSet r5 = X.AnonymousClass002.A0K()
            java.util.Iterator r2 = X.AnonymousClass001.A0u(r4)
        L_0x001e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0038
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r2)
            java.lang.Object r1 = r0.getKey()
            if (r1 == 0) goto L_0x001e
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto L_0x001e
            r5.add(r1)
            goto L_0x001e
        L_0x0038:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x018a
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SyncdKeyManager/requestMissingKeys syncdKeyIds="
            X.C18260x0.A1R(r1, r0, r5)
            X.2sr r0 = r13.A00
            com.whatsapp.jid.PhoneUserJid r8 = X.C56972sr.A04(r0)
            if (r8 == 0) goto L_0x00df
            boolean r0 = r5.isEmpty()
            r7 = 1
            if (r0 != 0) goto L_0x00df
            java.util.Set r0 = r13.A04()
            java.util.HashSet r6 = X.AnonymousClass0x9.A15(r5)
            r6.removeAll(r0)
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x00df
            X.2Za r0 = r13.A07
            java.util.Collection r0 = r0.A00()
            java.util.Iterator r12 = r0.iterator()
        L_0x0071:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00d0
            java.lang.Object r9 = r12.next()
            X.33G r9 = (X.AnonymousClass33G) r9
            X.35J r2 = r13.A0B
            X.2sH r0 = r13.A04
            long r0 = r0.A0H()
            com.whatsapp.jid.DeviceJid r10 = r9.A07
            X.2z0 r3 = r2.A04(r8, r7)
            X.1nI r2 = new X.1nI
            r2.<init>(r3, r0)
            r2.A00 = r10
            java.util.Set r0 = r2.A00
            r0.clear()
            r0.addAll(r6)
            X.2rl r0 = r13.A08
            long r0 = r0.A00(r2)
            java.lang.StringBuilder r11 = X.AnonymousClass001.A0o()
            java.lang.String r3 = "SyncdKeyManager/requestMissingKeys to add peer message, rowId="
            X.C18260x0.A12(r3, r11, r0)
            X.1RE r0 = r13.A06
            X.4Fq r3 = r0.A0C()
            r0 = r3
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0180 }
            X.2sg r0 = r0.A03     // Catch:{ all -> 0x0180 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0180 }
            boolean r0 = r0.inTransaction()     // Catch:{ all -> 0x0180 }
            if (r0 == 0) goto L_0x00c7
            r1 = 37
            X.3aJ r0 = new X.3aJ     // Catch:{ all -> 0x0180 }
            r0.<init>(r13, r2, r9, r1)     // Catch:{ all -> 0x0180 }
            r3.B25(r0)     // Catch:{ all -> 0x0180 }
            goto L_0x00cc
        L_0x00c7:
            X.2gy r0 = r13.A02     // Catch:{ all -> 0x0180 }
            X.C49712gy.A00(r0, r10, r2)     // Catch:{ all -> 0x0180 }
        L_0x00cc:
            r3.close()
            goto L_0x0071
        L_0x00d0:
            X.3Ek r1 = r13.A03
            int r0 = r6.size()
            X.30l r3 = r1.A01
            java.lang.String r2 = "missing_key_counter"
            long r0 = (long) r0
            r3.A06(r2, r0)
        L_0x00df:
            X.2WC r7 = r13.A0A
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SyncdMissingKeysStore/storeMissingKeys for collection: "
            X.C18260x0.A0q(r0, r14, r1)
            X.1RE r0 = r7.A00
            X.4Fq r3 = r0.A0C()
            X.3Yo r11 = r3.Axl()     // Catch:{ all -> 0x0180 }
            r0 = r3
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0176 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x0176 }
            java.lang.String r1 = "INSERT OR REPLACE INTO missing_keys (device_id, epoch, collection_name) VALUES (?, ?, ?)"
            java.lang.String r0 = "SyncdMissingKeysTable.INSERT_OR_REPLACE"
            X.2sQ r6 = r2.A0G(r1, r0)     // Catch:{ all -> 0x0176 }
            java.util.Iterator r10 = r5.iterator()     // Catch:{ all -> 0x0176 }
        L_0x0105:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0176 }
            if (r0 == 0) goto L_0x0142
            java.lang.Object r5 = r10.next()     // Catch:{ all -> 0x0176 }
            X.33J r5 = (X.AnonymousClass33J) r5     // Catch:{ all -> 0x0176 }
            r6.A02()     // Catch:{ all -> 0x0176 }
            int r0 = r5.A00()     // Catch:{ all -> 0x0176 }
            long r0 = (long) r0     // Catch:{ all -> 0x0176 }
            r2 = 1
            r6.A06(r2, r0)     // Catch:{ all -> 0x0176 }
            byte[] r1 = r5.A00     // Catch:{ all -> 0x0176 }
            r2 = 2
            byte r0 = r1[r2]     // Catch:{ all -> 0x0176 }
            int r0 = X.C18290x4.A07(r1, r0, r2)     // Catch:{ all -> 0x0176 }
            long r0 = (long) r0     // Catch:{ all -> 0x0176 }
            r6.A06(r2, r0)     // Catch:{ all -> 0x0176 }
            r0 = 3
            r6.A07(r0, r14)     // Catch:{ all -> 0x0176 }
            long r8 = r6.A01()     // Catch:{ all -> 0x0176 }
            r1 = -1
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0105
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0176 }
            java.lang.String r0 = "SyncdMissingKeyStore/storeMissingKeys failed to store missing key: "
            X.C18260x0.A1Q(r1, r0, r5)     // Catch:{ all -> 0x0176 }
            goto L_0x0105
        L_0x0142:
            r11.A00()     // Catch:{ all -> 0x0176 }
            r11.close()     // Catch:{ all -> 0x0180 }
            r3.close()
            java.util.Set r3 = r7.A00()
            boolean r0 = r3.isEmpty()
            r2 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0174
            java.util.Set r0 = r13.A04()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0174
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SyncdKeyManager/isKeyMissingOnAllClients: key(s) missing on all the clients for collection(s): "
            X.C18260x0.A1Q(r1, r0, r3)
        L_0x016b:
            if (r2 == 0) goto L_0x01a4
            r0 = 71
            X.1Sf r0 = X.C23341Sf.A00(r14, r0)
            throw r0
        L_0x0174:
            r2 = 0
            goto L_0x016b
        L_0x0176:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x017b }
            goto L_0x017f
        L_0x017b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0180 }
        L_0x017f:
            throw r1     // Catch:{ all -> 0x0180 }
        L_0x0180:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0185 }
            throw r1
        L_0x0185:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x018a:
            boolean r0 = r4.containsKey(r3)
            if (r0 == 0) goto L_0x0197
            java.lang.Object r0 = r4.get(r3)
            r1 = 1
            if (r0 == 0) goto L_0x0198
        L_0x0197:
            r1 = 0
        L_0x0198:
            java.lang.String r0 = "SyncdKeyManager/resolveKeys: either there are missing keys or active key is missing"
            X.C626936e.A0F(r1, r0)
            X.2yj r0 = r13.A00()
            r4.put(r3, r0)
        L_0x01a4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56792sZ.A02(java.lang.String, java.util.Collection):java.util.HashMap");
    }

    public Set A04() {
        List<C30841nI> A042 = this.A08.A04((byte) 39);
        HashSet A0K = AnonymousClass002.A0K();
        for (C30841nI r0 : A042) {
            A0K.addAll(Collections.unmodifiableSet(r0.A00));
        }
        return A0K;
    }

    public final void A06() {
        int i;
        C60542yj A012 = this.A09.A01();
        if (A012 == null) {
            i = 3;
        } else {
            i = 1;
            if (!A0B(A012.A00)) {
                i = 2;
            }
        }
        C64663Ek r2 = this.A03;
        AnonymousClass1WT r1 = new AnonymousClass1WT();
        r1.A00 = Integer.valueOf(i);
        C64663Ek.A05(r2, r1);
    }

    public void A08(DeviceJid deviceJid, HashMap hashMap, boolean z) {
        PhoneUserJid A042 = C56972sr.A04(this.A00);
        if (A042 != null && !hashMap.isEmpty()) {
            AnonymousClass35J r2 = this.A0B;
            C30851nJ r5 = new C30851nJ(r2.A04(A042, true), this.A04.A0H());
            r5.A00 = deviceJid;
            r5.A1w(hashMap);
            r5.A01 = z;
            if (this.A08.A00(r5) < 0) {
                Log.e("SyncdKeyManager/shareKeys unable to add peer message");
            } else {
                C49712gy.A00(this.A02, deviceJid, r5);
            }
        }
    }

    public void A09(Set set) {
        C69833Yo Axl;
        C85284Fq A0C = this.A09.A00.A0C();
        try {
            Axl = A0C.Axl();
            C56702sQ A0G = ((AnonymousClass3H0) A0C).A03.A0G("INSERT OR IGNORE INTO crypto_info (device_id, epoch, key_data, timestamp, fingerprint) VALUES (?, ?, ?, ?, ?)", "SyncdCryptoInfoTable.INSERT_OR_IGNORE");
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C60542yj r3 = (C60542yj) it.next();
                A0G.A02();
                AnonymousClass33J r5 = r3.A01;
                A0G.A06(1, (long) r5.A00());
                byte[] bArr = r5.A00;
                A0G.A06(2, (long) C18290x4.A07(bArr, bArr[2], 2));
                C52402lQ r32 = r3.A00;
                A0G.A08(3, r32.A02);
                A0G.A06(4, r32.A00);
                A0G.A08(5, r32.A01.A01().A0F());
                if (A0G.A01() == -1) {
                    C18260x0.A1Q(AnonymousClass001.A0o(), "SyncdCryptoStore/saveKey failed to store key: ", r5);
                } else {
                    C18260x0.A1P(AnonymousClass001.A0o(), "SyncdCryptoStore/saveKey success keyId=", r5);
                }
            }
            Axl.A00();
            Axl.close();
            A0C.close();
            return;
        } catch (Throwable th) {
            try {
                A0C.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public boolean A0A() {
        for (C30851nJ r1 : this.A08.A04((byte) 38)) {
            if (!r1.A01 && r1.A01) {
                return true;
            }
        }
        return false;
    }

    public boolean A0B(C52402lQ r7) {
        String str;
        C61162zo r5 = r7.A01;
        int i = r5.A01;
        AnonymousClass33p r2 = this.A05;
        if (i != C18310x6.A03(AnonymousClass0x2.A0F(r2), "adv_raw_id")) {
            str = "SyncdKeyManager/verifyFingerprintOfKey: fingerprint mismatch: rawId did not match";
        } else {
            int A032 = C18310x6.A03(AnonymousClass0x2.A0F(r2), "adv_current_key_index");
            HashSet A15 = AnonymousClass0x9.A15(r5.A02);
            int i2 = r5.A00;
            while (true) {
                i2++;
                if (i2 > A032) {
                    break;
                }
                C18270x1.A1K(A15, i2);
            }
            if (A05().equals(A15)) {
                return true;
            }
            str = "SyncdKeyManager/verifyFingerprintOfKey: fingerprint mismatch: one of a peer device is no longer registered";
        }
        Log.i(str);
        return false;
    }

    public C56792sZ(C56972sr r1, C66663Mh r2, C49712gy r3, C64663Ek r4, C56612sH r5, AnonymousClass33p r6, AnonymousClass1RE r7, C45192Za r8, C56302rl r9, C54312oW r10, AnonymousClass2WC r11, AnonymousClass35J r12) {
        this.A04 = r5;
        this.A00 = r1;
        this.A01 = r2;
        this.A06 = r7;
        this.A02 = r3;
        this.A09 = r10;
        this.A03 = r4;
        this.A07 = r8;
        this.A08 = r9;
        this.A0B = r12;
        this.A05 = r6;
        this.A0A = r11;
    }

    public C60542yj A00() {
        if (!A0A()) {
            int A002 = this.A09.A00();
            if (A002 == 0) {
                A002 = new SecureRandom().nextInt(65536);
            }
            AnonymousClass33J r6 = new AnonymousClass33J(this.A00.A0D(), A002 + 1);
            byte[] A012 = AnonymousClass29O.A01(32);
            long A0H = this.A04.A0H();
            AnonymousClass33p r4 = this.A05;
            C60542yj r42 = new C60542yj(new C52402lQ(new C61162zo(A05(), C18310x6.A03(AnonymousClass0x2.A0F(r4), "adv_raw_id"), C18310x6.A03(AnonymousClass0x2.A0F(r4), "adv_current_key_index")), A012, A0H), r6);
            C18260x0.A1R(AnonymousClass001.A0o(), "SyncdKeyManager/generateAndShareNewKey syncdKey = ", r42);
            Collection<AnonymousClass33G> A003 = this.A07.A00();
            if (A003.isEmpty()) {
                A06();
                A09(Collections.singleton(r42));
                return r42;
            }
            for (AnonymousClass33G r1 : A003) {
                A08(r1.A07, new HashMap(Collections.singletonMap(r42.A01, r42)), true);
            }
        }
        return null;
    }

    public final HashMap A03(Collection collection) {
        C60542yj r0;
        Cursor A0E;
        HashMap A0t = AnonymousClass001.A0t();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass33J r6 = (AnonymousClass33J) it.next();
            if (r6 != null) {
                C54312oW r8 = this.A09;
                AnonymousClass4GK A0B2 = r8.A00.get();
                try {
                    C56862sg r5 = ((AnonymousClass3H0) A0B2).A03;
                    String[] A1Z = AnonymousClass0x9.A1Z();
                    C18270x1.A1O(A1Z, r6.A00());
                    byte[] bArr = r6.A00;
                    C18270x1.A1P(A1Z, C18290x4.A07(bArr, bArr[2], 2));
                    A0E = r5.A0E("SELECT device_id, epoch, key_data, timestamp, fingerprint FROM crypto_info WHERE device_id = ?  AND epoch = ? ", "SyncdCryptoInfoTable.SELECT_KEY_WITH_ID", A1Z);
                    if (A0E.moveToFirst()) {
                        r0 = r8.A02(A0E);
                        A0E.close();
                        A0B2.close();
                    } else {
                        A0E.close();
                        A0B2.close();
                        r0 = null;
                    }
                } catch (Throwable th) {
                    try {
                        A0B2.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } else {
                r0 = A01();
            }
            A0t.put(r6, r0);
        }
        return A0t;
        throw th;
    }

    public final Set A05() {
        HashSet A0K = AnonymousClass002.A0K();
        for (AnonymousClass33G r0 : this.A07.A00()) {
            C18270x1.A1K(A0K, r0.A04);
        }
        C18270x1.A1K(A0K, this.A00.A0D());
        return A0K;
    }

    public void A07(int i) {
        C18260x0.A0y("SyncdKeyManager/expireKeysWithEpochIfActive expiredKeyEpoch = ", AnonymousClass001.A0o(), i);
        C54312oW r1 = this.A09;
        C60542yj A012 = r1.A01();
        if (A012 == null) {
            Log.d("SyncdKeyManager/expireKeysWithEpochIfActive: no latest key");
            return;
        }
        AnonymousClass33J r7 = A012.A01;
        byte[] bArr = r7.A00;
        if (C18290x4.A07(bArr, bArr[2], 2) <= i) {
            C85284Fq A0C = r1.A00.A0C();
            try {
                C56862sg r3 = ((AnonymousClass3H0) A0C).A03;
                String[] strArr = new String[2];
                C18270x1.A1O(strArr, r7.A00());
                C18270x1.A1P(strArr, C18290x4.A07(bArr, bArr[2], 2));
                r3.A0I("UPDATE crypto_info SET timestamp = 0  WHERE device_id = ?  AND epoch = ? ", "SyncdCryptoInfoTable.EXPIRE_BY_KEY_ID", strArr);
                A0C.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
    }
}

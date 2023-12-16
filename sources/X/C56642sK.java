package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2sK  reason: invalid class name and case insensitive filesystem */
public class C56642sK {
    public Map A00;
    public Map A01;
    public final C64773Ex A02;
    public final C34451vB A03;
    public final C56612sH A04;
    public final AnonymousClass33p A05;
    public final AnonymousClass1VX A06;

    public final synchronized Map A08() {
        Map map;
        map = this.A00;
        if (map == null) {
            map = AnonymousClass0x7.A0y();
            this.A00 = map;
        }
        return map;
    }

    public final synchronized Map A09() {
        Map map;
        map = this.A01;
        if (map == null) {
            map = AnonymousClass0x7.A0y();
            this.A01 = map;
        }
        return map;
    }

    public static long A00(C56642sK r4, C56952sp r5) {
        C58422vE r1 = C58422vE.A02;
        return r4.A03((long) r5.A0O(r1, 865), (long) r5.A0O(r1, 909));
    }

    public long A02() {
        AnonymousClass1VX r4 = this.A06;
        return Math.min(A03(C56952sp.A06(r4, 996), C56952sp.A06(r4, 997)), A00(this, r4));
    }

    public final long A03(long j, long j2) {
        long A0B = C18290x4.A0B(this.A04.A0D());
        long j3 = A0B - 15724800;
        if (j <= 0 || j2 <= 0) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Bad bucket configuration: numValidBuckets = ");
            A0o.append(j2);
            C18260x0.A11(", bucketLengthSec = ", A0o, j);
            return j3;
        }
        long j4 = A0B / j;
        long j5 = j2 - 1;
        if (j4 < j5) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("Strange bucket configuration: currentBucket = ");
            A0o2.append(j4);
            A0o2.append(", currentTimeSec = ");
            A0o2.append(A0B);
            A0o2.append(", numValidBuckets = ");
            A0o2.append(j2);
            C18260x0.A11(", bucketLengthSec = ", A0o2, j);
        }
        return Math.max((j4 - j5) * j, j3);
    }

    public AnonymousClass2K8 A04(UserJid userJid) {
        Cursor A0E;
        byte[] bArr;
        Long l;
        AnonymousClass4GK A032 = C18630y0.A03(this.A03);
        try {
            A0E = ((AnonymousClass3H0) A032).A03.A0E("SELECT incoming_tc_token, incoming_tc_token_timestamp FROM wa_trusted_contacts WHERE jid= ?", "GET_RECEIVED_TOKEN_AND_TIMESTAMP_BY_JID", C18270x1.A1a(userJid));
            AnonymousClass2K8 r6 = null;
            if (A0E.moveToNext()) {
                bArr = C18280x3.A1Z(A0E, "incoming_tc_token");
                l = Long.valueOf(AnonymousClass0x2.A0C(A0E, "incoming_tc_token_timestamp"));
            } else {
                bArr = null;
                l = null;
            }
            A0E.close();
            A032.close();
            if (bArr != null) {
                r6 = new AnonymousClass2K8(l, bArr);
            }
            if (r6 == null || r6.A00.longValue() < A00(this, this.A06)) {
                return null;
            }
            return r6;
        } catch (Throwable th) {
            try {
                A032.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public Map A06() {
        Cursor A0E;
        C34451vB r0 = this.A03;
        HashMap A0t = AnonymousClass001.A0t();
        AnonymousClass4GK A032 = C18630y0.A03(r0);
        try {
            A0E = ((AnonymousClass3H0) A032).A03.A0E("SELECT jid, incoming_tc_token, incoming_tc_token_timestamp FROM wa_trusted_contacts", "GET_ALL_RECEIVED_TOKENS", new String[0]);
            int A012 = AnonymousClass0x9.A01(A0E);
            int columnIndexOrThrow = A0E.getColumnIndexOrThrow("incoming_tc_token");
            int columnIndexOrThrow2 = A0E.getColumnIndexOrThrow("incoming_tc_token_timestamp");
            while (A0E.moveToNext()) {
                UserJid A002 = AnonymousClass32Y.A00(A0E, A012);
                byte[] blob = A0E.getBlob(columnIndexOrThrow);
                long j = A0E.getLong(columnIndexOrThrow2);
                C626936e.A06(blob);
                A0t.put(A002, new AnonymousClass2K8(Long.valueOf(j), blob));
            }
            A0E.close();
            A032.close();
            return A0t;
        } catch (Throwable th) {
            try {
                A032.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public Map A07() {
        Cursor A0E;
        C34451vB r0 = this.A03;
        HashMap A0t = AnonymousClass001.A0t();
        AnonymousClass4GK A032 = C18630y0.A03(r0);
        try {
            A0E = ((AnonymousClass3H0) A032).A03.A0E("SELECT jid, sent_tc_token_timestamp, real_issue_timestamp FROM wa_trusted_contacts_send", "GET_ALL_SENT_TOKENS", new String[0]);
            int A012 = AnonymousClass0x9.A01(A0E);
            while (A0E.moveToNext()) {
                C95814uZ A0K = AnonymousClass0x2.A0K(A0E, A012);
                if (A0K != null) {
                    A0t.put(A0K, C34451vB.A00(A0E));
                }
            }
            A0E.close();
            A032.close();
            return A0t;
        } catch (Throwable th) {
            try {
                A032.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A0A(UserJid userJid, long j) {
        C69833Yo Axl;
        C85284Fq A07 = C18630y0.A07(this.A03);
        try {
            Axl = A07.Axl();
            ContentValues A072 = AnonymousClass0x9.A07(2);
            Long valueOf = Long.valueOf(j);
            A072.put("sent_tc_token_timestamp", valueOf);
            A072.putNull("real_issue_timestamp");
            UserJid userJid2 = userJid;
            boolean z = false;
            String valueOf2 = String.valueOf(j);
            int i = (AnonymousClass361.A07(A072, A07, "wa_trusted_contacts_send", "jid = ? AND sent_tc_token_timestamp <= ?", new String[]{userJid2.getRawString(), valueOf2}) > 1 ? 1 : (AnonymousClass361.A07(A072, A07, "wa_trusted_contacts_send", "jid = ? AND sent_tc_token_timestamp <= ?", new String[]{userJid2.getRawString(), valueOf2}) == 1 ? 0 : -1));
            if (i < 0) {
                ContentValues A073 = AnonymousClass0x9.A07(1);
                A073.put("real_issue_timestamp", valueOf);
                String[] strArr = new String[2];
                C18280x3.A0w(userJid2, strArr, 0);
                strArr[1] = valueOf2;
                i = (AnonymousClass361.A07(A073, A07, "wa_trusted_contacts_send", "jid = ? AND real_issue_timestamp IS NOT NULL AND real_issue_timestamp <= ?", strArr) > 1 ? 1 : (AnonymousClass361.A07(A073, A07, "wa_trusted_contacts_send", "jid = ? AND real_issue_timestamp IS NOT NULL AND real_issue_timestamp <= ?", strArr) == 1 ? 0 : -1));
                if (i < 0) {
                    ContentValues A074 = AnonymousClass0x9.A07(2);
                    AnonymousClass0x2.A0n(A074, userJid2, "jid");
                    long A0C = AnonymousClass3H0.A00(A074, valueOf, A07, "sent_tc_token_timestamp").A0C("wa_trusted_contacts_send", "PrivacyTokenStore/insert_wa_trusted_contacts_send", A074, 4);
                    Axl.A00();
                    if (A0C == -1) {
                        Axl.close();
                        A07.close();
                        return;
                    }
                    Axl.close();
                    A07.close();
                    A09().remove(userJid2);
                    return;
                }
            }
            if (i == 0) {
                z = true;
            }
            C626936e.A0D(z, "Should have only one row per JID");
            Axl.A00();
            Axl.close();
            A07.close();
            A09().remove(userJid2);
            return;
        } catch (Throwable th) {
            try {
                A07.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public boolean A0B(UserJid userJid) {
        Long l;
        if (userJid == null) {
            return false;
        }
        AnonymousClass3ZH A07 = this.A02.A07(userJid);
        if (A07 != null && A07.A0Q()) {
            return true;
        }
        AnonymousClass2K9 A052 = A05(userJid);
        if (A052 == null || (l = A052.A01) == null) {
            return false;
        }
        long longValue = l.longValue();
        AnonymousClass1VX r1 = this.A06;
        if (longValue >= A03(C56952sp.A06(r1, 865), C56952sp.A06(r1, 3802))) {
            return true;
        }
        return false;
    }

    public C56642sK(C64773Ex r2, C56612sH r3, AnonymousClass33p r4, AnonymousClass1VX r5, AnonymousClass1RI r6) {
        this.A04 = r3;
        this.A06 = r5;
        this.A02 = r2;
        this.A03 = new C34451vB(r6);
        this.A05 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0051, code lost:
        if (r8 == 1) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A01(com.whatsapp.jid.UserJid r14, byte[] r15, long r16) {
        /*
            r13 = this;
            java.util.Map r1 = r13.A08()
            r4 = 2
            X.2FX r0 = new X.2FX
            r0.<init>(r13)
            r1.put(r14, r0)
            X.1vB r3 = r13.A03
            android.content.ContentValues r6 = X.C18290x4.A0E()
            java.lang.String r1 = r14.getRawString()
            java.lang.String r0 = "jid"
            r6.put(r0, r1)
            java.lang.String r0 = "incoming_tc_token"
            r6.put(r0, r15)
            java.lang.String r2 = "incoming_tc_token_timestamp"
            r0 = r16
            X.C18270x1.A0c(r6, r2, r0)
            X.4Fq r5 = X.C18630y0.A07(r3)
            X.3Yo r12 = r5.Axl()     // Catch:{ all -> 0x0081 }
            java.lang.String r7 = "wa_trusted_contacts"
            java.lang.String r3 = "jid = ? AND incoming_tc_token_timestamp < ? "
            r11 = 2
            java.lang.String[] r2 = new java.lang.String[r4]     // Catch:{ all -> 0x0077 }
            X.C18280x3.A0v(r14, r2)     // Catch:{ all -> 0x0077 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0077 }
            r10 = 1
            r2[r10] = r0     // Catch:{ all -> 0x0077 }
            long r8 = X.AnonymousClass361.A07(r6, r5, r7, r3, r2)     // Catch:{ all -> 0x0077 }
            r0 = 0
            int r4 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x0053
            r2 = 1
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L_0x0054
        L_0x0053:
            r0 = 1
        L_0x0054:
            X.C626936e.A0C(r0)     // Catch:{ all -> 0x0077 }
            if (r4 != 0) goto L_0x006d
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0077 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x0077 }
            r1 = 4
            java.lang.String r0 = "PrivacyTokenStore/insert_wa_trusted_contacts"
            long r3 = r2.A0C(r7, r0, r6, r1)     // Catch:{ all -> 0x0077 }
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x006c
            r11 = 0
        L_0x006c:
            r10 = r11
        L_0x006d:
            r12.A00()     // Catch:{ all -> 0x0077 }
            r12.close()     // Catch:{ all -> 0x0081 }
            r5.close()
            return r10
        L_0x0077:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x007c }
            goto L_0x0080
        L_0x007c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0081 }
        L_0x0080:
            throw r1     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0086 }
            throw r1
        L_0x0086:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56642sK.A01(com.whatsapp.jid.UserJid, byte[], long):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        if (r5.A00 < A02()) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass2K9 A05(com.whatsapp.jid.UserJid r8) {
        /*
            r7 = this;
            java.util.Map r6 = r7.A09()
            boolean r0 = r6.containsKey(r8)
            if (r0 != 0) goto L_0x005e
            X.1vB r0 = r7.A03
            X.4GK r4 = X.C18630y0.A03(r0)
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0054 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x0054 }
            java.lang.String r2 = "SELECT sent_tc_token_timestamp, real_issue_timestamp FROM wa_trusted_contacts_send WHERE jid= ?"
            java.lang.String[] r1 = X.C18270x1.A1a(r8)     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = "GET_SENT_TOKEN_BY_JID"
            android.database.Cursor r2 = r3.A0E(r2, r0, r1)     // Catch:{ all -> 0x0054 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x002f
            X.2K9 r5 = X.C34451vB.A00(r2)     // Catch:{ all -> 0x0048 }
            r2.close()     // Catch:{ all -> 0x0054 }
            goto L_0x0036
        L_0x002f:
            r2.close()     // Catch:{ all -> 0x0054 }
            r4.close()
            goto L_0x0043
        L_0x0036:
            r4.close()
            long r3 = r5.A00
            long r1 = r7.A02()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0044
        L_0x0043:
            r5 = 0
        L_0x0044:
            r6.put(r8, r5)
            return r5
        L_0x0048:
            r1 = move-exception
            if (r2 == 0) goto L_0x0053
            r2.close()     // Catch:{ all -> 0x004f }
            goto L_0x0053
        L_0x004f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0054 }
        L_0x0053:
            throw r1     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0059 }
            throw r1
        L_0x0059:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x005e:
            java.lang.Object r0 = r6.get(r8)
            X.2K9 r0 = (X.AnonymousClass2K9) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56642sK.A05(com.whatsapp.jid.UserJid):X.2K9");
    }
}

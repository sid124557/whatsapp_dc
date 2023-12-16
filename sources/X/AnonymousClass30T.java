package X;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.30T  reason: invalid class name */
public class AnonymousClass30T {
    public Map A00;
    public final C56612sH A01;
    public final C56922sm A02;
    public final C56982ss A03;
    public final C623334p A04;
    public final C72303dV A05;
    public final C56082rO A06;
    public final C49002fp A07;

    public static final void A00(C85284Fq r4, C95814uZ r5, byte b, int i) {
        ContentValues A072 = AnonymousClass0x9.A07(1);
        A072.put("jid", r5.getRawString());
        A072.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, Byte.valueOf(b));
        if (AnonymousClass3H0.A01(A072, r4, "message_count", i).A08("frequents", "insertFrequents/INSERT_FREQUENTS_LEGACY", A072) == -1) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("frequentMessageStore/insertFrequents/failed jid=");
            A0o.append(r5);
            C18260x0.A0x(" type=", A0o, b);
        }
    }

    public List A01(C836949k r11, boolean z) {
        AnonymousClass33M A022 = AnonymousClass33M.A02(false);
        Map A023 = A02();
        HashMap A0t = AnonymousClass001.A0t();
        Iterator A0q = AnonymousClass000.A0q(A023);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            C95814uZ r6 = ((C51522jx) A0w.getKey()).A01;
            if (!C627336j.A0L(r6) || !z) {
                byte b = ((C51522jx) A0w.getKey()).A00;
                int A08 = AnonymousClass0x2.A08(A0w);
                StringBuilder A0o = AnonymousClass001.A0o();
                AnonymousClass000.A17(r6, "frequentmsgstore/getfrequents/", " ", A0o);
                A0o.append(b);
                C18260x0.A0w(" ", A0o, A08);
                if (r11 != null) {
                    A08 *= r11.BEV(b);
                }
                if (A08 != 0) {
                    AnonymousClass3ZJ r2 = (AnonymousClass3ZJ) A0t.get(r6);
                    if (r2 == null) {
                        r2 = new AnonymousClass3ZJ(this.A03.A09(r6));
                    }
                    r2.A00 += A08;
                    A0t.put(r6, r2);
                }
            }
        }
        ArrayList A0J = AnonymousClass002.A0J(A0t.entrySet());
        AnonymousClass4IU.A00(A0J, 10);
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = A0J.iterator();
        while (it.hasNext()) {
            Map.Entry A0w2 = AnonymousClass001.A0w(it);
            AnonymousClass0x7.A1J(A0s, A0w2);
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("frequentmsgstore/getfrequents/sorted/");
            A0o2.append(A0w2.getKey());
            A0o2.append(" ");
            A0o2.append(((AnonymousClass3ZJ) A0w2.getValue()).A00);
            A0o2.append(" ");
            C18260x0.A1H(A0o2, ((AnonymousClass3ZJ) A0w2.getValue()).A01);
        }
        Locale locale = Locale.US;
        Object[] A0L = AnonymousClass002.A0L();
        AnonymousClass000.A1Q(A0L, 0, A022.A06());
        C18320x8.A1J("frequentmsgstore/getfrequents took %d ms", locale, A0L);
        return A0s;
    }

    public Map A02() {
        Cursor A012;
        if (this.A00 == null) {
            this.A00 = AnonymousClass0x9.A1D();
            AnonymousClass4GK A032 = this.A05.get();
            try {
                A012 = C56862sg.A01(((AnonymousClass3H0) A032).A03, "SELECT jid_row_id, type, message_count FROM frequent", "GET_FREQUENT");
                int columnIndexOrThrow = A012.getColumnIndexOrThrow("jid_row_id");
                int columnIndexOrThrow2 = A012.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                int columnIndexOrThrow3 = A012.getColumnIndexOrThrow("message_count");
                while (A012.moveToNext()) {
                    C95814uZ r1 = (C95814uZ) this.A04.A0B(C95814uZ.class, A012.getLong(columnIndexOrThrow));
                    if (r1 != null) {
                        if (!C627336j.A0L(r1) || this.A03.A0L(r1)) {
                            C18280x3.A1D(new C51522jx(r1, (byte) A012.getInt(columnIndexOrThrow2)), this.A00, A012.getInt(columnIndexOrThrow3));
                        }
                    }
                }
                A012.close();
                A032.close();
            } catch (Throwable th) {
                try {
                    A032.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        return this.A00;
        throw th;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0051, code lost:
        if (r15 <= r17) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r19 = this;
            java.lang.String r7 = "frequents"
            r5 = 0
            X.33M r6 = new X.33M
            r6.<init>((boolean) r5)
            java.lang.String r0 = "frequentmsgstore/updateFrequents"
            r6.A0A(r0)
            r9 = r19
            X.3dV r0 = r9.A05
            X.4Fq r3 = r0.A04()
            r0 = r3
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x017b }
            X.2sg r10 = r0.A03     // Catch:{ all -> 0x017b }
            X.2sH r8 = r9.A01     // Catch:{ all -> 0x017b }
            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x017b }
            r0 = 691200000(0x2932e000, double:3.414981744E-315)
            long r17 = r17 - r0
            java.lang.String r1 = "SELECT sort_id, received_timestamp FROM available_message_view WHERE received_timestamp > 0 ORDER BY sort_id DESC LIMIT 4096"
            java.lang.String r0 = "GET_SAMPLE_FOR_FREQUENTS"
            r2 = 0
            android.database.Cursor r14 = r10.A0E(r1, r0, r2)     // Catch:{ all -> 0x017b }
            java.lang.String r0 = "received_timestamp"
            int r13 = r14.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x016f }
            java.lang.String r0 = "sort_id"
            int r11 = r14.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x016f }
            r0 = 0
            r12 = 0
        L_0x003f:
            boolean r4 = r14.moveToNext()     // Catch:{ all -> 0x016f }
            if (r4 == 0) goto L_0x0053
            long r15 = r14.getLong(r13)     // Catch:{ all -> 0x016f }
            long r0 = r14.getLong(r11)     // Catch:{ all -> 0x016f }
            int r12 = r12 + 1
            int r4 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r4 > 0) goto L_0x003f
        L_0x0053:
            r14.close()     // Catch:{ all -> 0x017b }
            java.lang.StringBuilder r11 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x017b }
            java.lang.String r4 = "frequentmsgstore/updateFrequents/start sort_id:"
            r11.append(r4)     // Catch:{ all -> 0x017b }
            r11.append(r0)     // Catch:{ all -> 0x017b }
            java.lang.String r4 = " "
            X.C18260x0.A0y(r4, r11, r12)     // Catch:{ all -> 0x017b }
            java.lang.String[] r12 = X.AnonymousClass0x9.A1Z()     // Catch:{ all -> 0x017b }
            X.C18280x3.A1R(r12, r5, r0)     // Catch:{ all -> 0x017b }
            r0 = 6
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x017b }
            r4 = 1
            r12[r4] = r0     // Catch:{ all -> 0x017b }
            java.util.HashMap r11 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x017b }
            java.lang.String r1 = "SELECT chat_row_id, message_type FROM available_message_view WHERE sort_id >= ? AND from_me = 1 AND status != ?"
            java.lang.String r0 = "GET_MESSAGES_FOR_FREQUENTS"
            android.database.Cursor r12 = r10.A0E(r1, r0, r12)     // Catch:{ all -> 0x017b }
            java.lang.String r0 = "message_type"
            int r13 = r12.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0168 }
        L_0x0089:
            boolean r0 = r12.moveToNext()     // Catch:{ all -> 0x0168 }
            if (r0 == 0) goto L_0x00c0
            X.2sm r0 = r9.A02     // Catch:{ all -> 0x0168 }
            X.4uZ r14 = r0.A0C(r12)     // Catch:{ all -> 0x0168 }
            if (r14 == 0) goto L_0x0089
            boolean r0 = r14 instanceof X.C135166kE     // Catch:{ all -> 0x0168 }
            if (r0 != 0) goto L_0x0089
            int r0 = r12.getInt(r13)     // Catch:{ all -> 0x0168 }
            byte r0 = (byte) r0     // Catch:{ all -> 0x0168 }
            X.2jx r1 = new X.2jx     // Catch:{ all -> 0x0168 }
            r1.<init>(r14, r0)     // Catch:{ all -> 0x0168 }
            java.lang.Object r0 = r11.get(r1)     // Catch:{ all -> 0x0168 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0168 }
            if (r0 != 0) goto L_0x00b5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0168 }
        L_0x00b1:
            r11.put(r1, r0)     // Catch:{ all -> 0x0168 }
            goto L_0x0089
        L_0x00b5:
            int r0 = r0.intValue()     // Catch:{ all -> 0x0168 }
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0168 }
            goto L_0x00b1
        L_0x00c0:
            r12.close()     // Catch:{ all -> 0x017b }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x017b }
            java.lang.String r0 = "frequentmsgstore/updateFrequents/calculated "
            int r0 = X.AnonymousClass0x7.A0A(r0, r1, r11)     // Catch:{ all -> 0x017b }
            X.C18260x0.A1F(r1, r0)     // Catch:{ all -> 0x017b }
            X.3Yo r13 = r3.Axl()     // Catch:{ all -> 0x017b }
            java.lang.String r0 = "updateFrequents/DELETE_FREQUENTS_LEGACY"
            r10.A07(r7, r2, r0, r2)     // Catch:{ all -> 0x0163 }
            java.lang.String r1 = "frequent"
            java.lang.String r0 = "updateFrequents/DELETE_FREQUENT"
            r10.A07(r1, r2, r0, r2)     // Catch:{ all -> 0x0163 }
            java.util.Iterator r12 = X.AnonymousClass001.A0u(r11)     // Catch:{ all -> 0x0163 }
        L_0x00e6:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0163 }
            if (r0 == 0) goto L_0x010c
            java.util.Map$Entry r10 = X.AnonymousClass001.A0w(r12)     // Catch:{ all -> 0x0163 }
            java.lang.Object r0 = r10.getKey()     // Catch:{ all -> 0x0163 }
            X.2jx r0 = (X.C51522jx) r0     // Catch:{ all -> 0x0163 }
            X.4uZ r2 = r0.A01     // Catch:{ all -> 0x0163 }
            java.lang.Object r0 = r10.getKey()     // Catch:{ all -> 0x0163 }
            X.2jx r0 = (X.C51522jx) r0     // Catch:{ all -> 0x0163 }
            byte r1 = r0.A00     // Catch:{ all -> 0x0163 }
            java.lang.Object r0 = r10.getValue()     // Catch:{ all -> 0x0163 }
            int r0 = X.AnonymousClass0x7.A05(r0)     // Catch:{ all -> 0x0163 }
            A00(r3, r2, r1, r0)     // Catch:{ all -> 0x0163 }
            goto L_0x00e6
        L_0x010c:
            java.util.Iterator r12 = X.AnonymousClass001.A0u(r11)     // Catch:{ all -> 0x0163 }
        L_0x0110:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0163 }
            if (r0 == 0) goto L_0x0136
            java.util.Map$Entry r10 = X.AnonymousClass001.A0w(r12)     // Catch:{ all -> 0x0163 }
            java.lang.Object r0 = r10.getKey()     // Catch:{ all -> 0x0163 }
            X.2jx r0 = (X.C51522jx) r0     // Catch:{ all -> 0x0163 }
            X.4uZ r2 = r0.A01     // Catch:{ all -> 0x0163 }
            java.lang.Object r0 = r10.getKey()     // Catch:{ all -> 0x0163 }
            X.2jx r0 = (X.C51522jx) r0     // Catch:{ all -> 0x0163 }
            byte r1 = r0.A00     // Catch:{ all -> 0x0163 }
            java.lang.Object r0 = r10.getValue()     // Catch:{ all -> 0x0163 }
            int r0 = X.AnonymousClass0x7.A05(r0)     // Catch:{ all -> 0x0163 }
            r9.A05(r2, r1, r0, r4)     // Catch:{ all -> 0x0163 }
            goto L_0x0110
        L_0x0136:
            r13.A00()     // Catch:{ all -> 0x0163 }
            r13.close()     // Catch:{ all -> 0x017b }
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ all -> 0x017b }
            r0.<init>(r11)     // Catch:{ all -> 0x017b }
            r9.A00 = r0     // Catch:{ all -> 0x017b }
            X.2rO r2 = r9.A06     // Catch:{ all -> 0x017b }
            long r0 = r8.A0H()     // Catch:{ all -> 0x017b }
            r2.A04(r7, r0)     // Catch:{ all -> 0x017b }
            r3.close()
            r6.A07()
            java.util.Locale r3 = java.util.Locale.US
            java.lang.Object[] r2 = new java.lang.Object[r4]
            long r0 = r6.A06()
            X.AnonymousClass000.A1Q(r2, r5, r0)
            java.lang.String r0 = "frequentmsgstore/updateFrequents took %d ms"
            X.C18320x8.A1J(r0, r3, r2)
            return
        L_0x0163:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x0176 }
            goto L_0x017a
        L_0x0168:
            r1 = move-exception
            if (r12 == 0) goto L_0x017a
            r12.close()     // Catch:{ all -> 0x0176 }
            goto L_0x017a
        L_0x016f:
            r1 = move-exception
            if (r14 == 0) goto L_0x017a
            r14.close()     // Catch:{ all -> 0x0176 }
            goto L_0x017a
        L_0x0176:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x017b }
        L_0x017a:
            throw r1     // Catch:{ all -> 0x017b }
        L_0x017b:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0180 }
            throw r1
        L_0x0180:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass30T.A03():void");
    }

    public void A04(C95814uZ r8) {
        C69833Yo Axl;
        C85284Fq A042 = this.A05.A04();
        try {
            Axl = A042.Axl();
            ((AnonymousClass3H0) A042).A03.A07("frequents", "jid = ?", "deleteFrequents/DELETE_FREQUENTS_LEGACY", C18270x1.A1a(r8));
            long A052 = this.A04.A05(r8);
            C56702sQ A002 = this.A07.A00("DELETE FROM frequent WHERE jid_row_id = ?", "DELETE_FREQUENT_FOR_JID");
            A002.A06(1, A052);
            A002.A00();
            Axl.A00();
            Axl.close();
            A042.close();
            Map map = this.A00;
            if (map != null) {
                ArrayList A0s = AnonymousClass001.A0s();
                Iterator A0i = C18280x3.A0i(map);
                while (A0i.hasNext()) {
                    C51522jx r1 = (C51522jx) A0i.next();
                    if (r8.equals(r1.A01)) {
                        A0s.add(r1);
                    }
                }
                Iterator it = A0s.iterator();
                while (it.hasNext()) {
                    this.A00.remove(it.next());
                }
                return;
            }
            return;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public final void A05(C95814uZ r9, byte b, int i, boolean z) {
        long A052 = this.A04.A05(r9);
        if (!z) {
            C56702sQ A002 = this.A07.A00("UPDATE frequent   SET message_count = ? WHERE jid_row_id = ? AND type = ?", "UPDATE_FREQUENT");
            A002.A06(2, A052);
            A002.A06(3, (long) b);
            A002.A06(1, (long) i);
            if (A002.A00() == 1) {
                return;
            }
        }
        C56702sQ A003 = this.A07.A00("INSERT INTO frequent(jid_row_id, type, message_count) VALUES (?, ?, ?)", "INSERT_FREQUENT");
        A003.A06(1, A052);
        A003.A06(2, (long) b);
        A003.A06(3, (long) i);
        if (A003.A01() == -1) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("frequentMessageStore/insertOrUpdateFrequent/failed jid=");
            A0o.append(r9);
            C18260x0.A0x(" type=", A0o, b);
        }
    }

    public boolean A06() {
        if (this.A06.A00("frequents", 0) + 86400000 >= this.A01.A0H()) {
            return false;
        }
        A03();
        return true;
    }

    public AnonymousClass30T(C56612sH r1, C56922sm r2, C56982ss r3, C623334p r4, C72303dV r5, C56082rO r6, C49002fp r7) {
        this.A01 = r1;
        this.A04 = r4;
        this.A02 = r2;
        this.A03 = r3;
        this.A06 = r6;
        this.A07 = r7;
        this.A05 = r5;
    }
}

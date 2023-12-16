package X;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: X.2ot  reason: invalid class name and case insensitive filesystem */
public class C54542ot {
    public final C56612sH A00;
    public final C46392bY A01;
    public final AnonymousClass1RJ A02;

    public void A01(C54562ov r7) {
        C85284Fq A0C = this.A02.A0C();
        try {
            C18260x0.A1R(C18300x5.A0o((long) ((AnonymousClass3H0) A0C).A03.A07("sessions", "recipient_id = ? AND recipient_type = ? AND device_id = ? ", "SignalSessionStore/removeSession", r7.A00())), " sessions with ", r7);
            A0C.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A02(C54562ov r15, byte[] bArr) {
        C69833Yo Axl;
        String str = r15.A02;
        int i = r15.A01;
        int i2 = r15.A00;
        C85284Fq A0C = this.A02.A0C();
        try {
            Axl = A0C.Axl();
            ContentValues A06 = AnonymousClass0x9.A06();
            A06.put("record", bArr);
            C56862sg r8 = ((AnonymousClass3H0) A0C).A03;
            if (r8.A05(A06, "sessions", "recipient_id = ? AND recipient_type = ? AND device_id = ? ", "SignalSessionStore/saveSessionUpdate", r15.A00()) == 0) {
                long A002 = C56612sH.A00(this.A00);
                A06.put("recipient_id", str);
                C18270x1.A0b(A06, "recipient_type", i);
                C18270x1.A0b(A06, "device_id", i2);
                C18270x1.A0c(A06, "timestamp", A002);
                Long A003 = this.A01.A00(r15, 5);
                if (A003 != null) {
                    A06.put("recipient_lid_identifier", A003);
                }
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("axolotl inserting new session for ");
                A0o.append(r15);
                C18260x0.A12(" at ", A0o, A002);
                r8.A08("sessions", "SignalSessionStore/saveSession", A06);
            }
            Axl.A00();
            Axl.close();
            C18260x0.A1R(C18280x3.A0f(A0C), "axolotl stored session for ", r15);
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

    public C54542ot(C56612sH r1, C46392bY r2, AnonymousClass1RJ r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r2 > 100) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor A00(java.util.Set r5) {
        /*
            r4 = this;
            int r2 = r5.size()
            if (r2 <= 0) goto L_0x000b
            r1 = 100
            r0 = 1
            if (r2 <= r1) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            X.C626936e.A0B(r0)
            X.1RJ r0 = r4.A02
            X.2sg r3 = r0.BEc()
            int r1 = r5.size()
            java.lang.String r0 = "SELECT record, recipient_id, recipient_type, device_id FROM sessions INNER JOIN (SELECT ? AS r, ? AS t, ? AS d"
            java.lang.StringBuilder r2 = X.C18330xA.A0A(r0)
            r0 = 1
            X.8Zj r0 = X.C175708Zk.A02(r0, r1)
            java.util.Iterator r1 = r0.iterator()
        L_0x0028:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x003a
            r0 = r1
            X.3d2 r0 = (X.C72013d2) r0
            r0.A00()
            java.lang.String r0 = " UNION ALL SELECT ? AS r, ? AS t, ? AS d"
            r2.append(r0)
            goto L_0x0028
        L_0x003a:
            java.lang.String r0 = ") AS joined ON joined.r = sessions.recipient_id AND joined.t = sessions.recipient_type AND joined.d = sessions.device_id"
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r2)
            X.C162457s7.A0D(r2)
            java.lang.String[] r1 = X.AnonymousClass261.A00(r5)
            java.lang.String r0 = "SignalSessionStore/getSessionsCursor"
            android.database.Cursor r0 = r3.A0E(r2, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54542ot.A00(java.util.Set):android.database.Cursor");
    }

    public byte[] A03(C54562ov r14) {
        Cursor A0F;
        AnonymousClass4GK A0B = this.A02.get();
        try {
            A0F = ((AnonymousClass3H0) A0B).A03.A0F("sessions", new String[]{"record"}, "recipient_id = ? AND recipient_type = ? AND device_id = ? ", r14.A00(), (String) null, (String) null, (String) null, "SignalSessionStore/getSession");
            if (!A0F.moveToNext()) {
                C18260x0.A1R(AnonymousClass001.A0o(), "axolotl cant load a session record for ", r14);
                A0F.close();
                A0B.close();
                return null;
            }
            byte[] A1Z = C18280x3.A1Z(A0F, "record");
            A0F.close();
            A0B.close();
            return A1Z;
        } catch (Throwable th) {
            try {
                A0B.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }
}

package X;

import android.database.Cursor;

/* renamed from: X.2wf  reason: invalid class name and case insensitive filesystem */
public class C59282wf {
    public final C72303dV A00;
    public final C56082rO A01;

    public static final void A00(C624134x r7) {
        boolean z = false;
        AnonymousClass2z0 A09 = C624134x.A09(r7, "SendCountMessageStore/validateMessage/message must have row_id set; key=", AnonymousClass001.A0o(), AnonymousClass001.A1W((r7.A1L > 0 ? 1 : (r7.A1L == 0 ? 0 : -1))));
        if (r7.A0l() == 1) {
            z = true;
        }
        C18260x0.A0l(A09, "SendCountMessageStore/validateMessage/message in main storage; key=", AnonymousClass001.A0o(), z);
    }

    public int A01(C624134x r9) {
        Cursor A0E;
        Cursor A0E2;
        int i = 0;
        if (r9.A1L <= 0) {
            return 0;
        }
        if (this.A01.A00("send_count_ready", 0) == 1) {
            A00(r9);
            String[] A1Y = AnonymousClass0x9.A1Y();
            C624134x.A0X(r9, A1Y);
            AnonymousClass4GK A03 = this.A00.get();
            try {
                A0E2 = ((AnonymousClass3H0) A03).A03.A0E("SELECT send_count FROM message_send_count WHERE message_row_id = ?", "GET_SEND_COUNT_MESSAGE_BY_ROW_ID_SQL", A1Y);
                if (A0E2.moveToNext()) {
                    i = AnonymousClass0x2.A04(A0E2, "send_count");
                }
                A0E2.close();
                A03.close();
                return i;
            } catch (Throwable th) {
                th = th;
                try {
                    A03.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else {
            AnonymousClass2z0 r6 = r9.A1J;
            String A0i = C18300x5.A0i(r6.A00);
            AnonymousClass4GK A032 = this.A00.get();
            try {
                C56862sg r4 = ((AnonymousClass3H0) A032).A03;
                String[] A1a = AnonymousClass0x9.A1a();
                A1a[0] = A0i;
                A1a[1] = AnonymousClass2z0.A08(r6);
                A1a[2] = r6.A01;
                A0E = r4.A0E("SELECT send_count FROM messages WHERE key_remote_jid = ? AND key_from_me = ? AND key_id = ?", "getSendCountV1/QUERY_MESSAGES", A1a);
                int columnIndexOrThrow = A0E.getColumnIndexOrThrow("send_count");
                if (!A0E.moveToFirst() || A0E.isNull(columnIndexOrThrow)) {
                    A0E.close();
                    A032.close();
                    return 0;
                }
                int i2 = A0E.getInt(columnIndexOrThrow);
                A0E.close();
                A032.close();
                return i2;
            } catch (Throwable th3) {
                th = th3;
                A032.close();
                throw th;
            }
        }
        throw th;
        throw th;
    }

    public C59282wf(C72303dV r1, C56082rO r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}

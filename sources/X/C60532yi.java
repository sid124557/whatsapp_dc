package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;

/* renamed from: X.2yi  reason: invalid class name and case insensitive filesystem */
public class C60532yi {
    public final C72303dV A00;
    public final C56082rO A01;

    public static final void A00(C624134x r7) {
        boolean z = false;
        AnonymousClass2z0 A09 = C624134x.A09(r7, "FutureMessageStore/validateMessage/message must have row_id set; key=", AnonymousClass001.A0o(), AnonymousClass001.A1W((r7.A1L > 0 ? 1 : (r7.A1L == 0 ? 0 : -1))));
        if (r7.A0l() == 1) {
            z = true;
        }
        C18260x0.A0l(A09, "FutureMessageStore/validateMessage/message in main storage; key=", AnonymousClass001.A0o(), z);
    }

    public C60532yi(C72303dV r1, C56082rO r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A01(C624134x r8) {
        A00(r8);
        C85284Fq A04 = this.A00.A04();
        try {
            C56862sg r5 = ((AnonymousClass3H0) A04).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            C18260x0.A1X(A1Y, r8.A1L);
            r5.A07("message_future", "message_row_id = ?", "DELETE_MESSAGE_FUTURE_SQL", A1Y);
            A04.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A02(C30351mJ r6) {
        Cursor A0E;
        A00(r6);
        String[] A1Y = AnonymousClass0x9.A1Y();
        C18260x0.A1Y(A1Y, r6.A1L);
        AnonymousClass4GK A03 = this.A00.get();
        try {
            A0E = ((AnonymousClass3H0) A03).A03.A0E("SELECT version, data, future_message_type, future_proof_stanza FROM message_future WHERE message_row_id = ?", "GET_FUTURE_MESSAGE_BY_ROW_ID_SQL", A1Y);
            if (A0E.moveToNext()) {
                r6.A01 = (int) AnonymousClass0x2.A0C(A0E, "version");
                r6.A1j(C18280x3.A1Z(A0E, "data"));
                r6.A00 = AnonymousClass0x2.A04(A0E, "future_message_type");
                r6.A02 = C18280x3.A1Z(A0E, "future_proof_stanza");
            }
            A0E.close();
            A03.close();
            return;
        } catch (Throwable th) {
            try {
                A03.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A03(C30351mJ r17) {
        C30351mJ r2 = r17;
        A00(r2);
        C85284Fq A04 = this.A00.A04();
        try {
            ContentValues A06 = C624134x.A06(r2);
            C18270x1.A0b(A06, "version", r2.A01);
            C621833x.A04(A06, "data", r2.A1u());
            C18270x1.A0b(A06, "future_message_type", r2.A00);
            byte[] bArr = r2.A02;
            if (bArr != null) {
                A06.put("future_proof_stanza", bArr);
            }
            C56862sg r10 = ((AnonymousClass3H0) A04).A03;
            long A08 = r10.A08("message_future", "INSERT_MESSAGE_FUTURE_SQL", A06);
            boolean z = false;
            if (A08 != -1) {
                if (A08 == r2.A1L) {
                    z = true;
                }
                C626936e.A0F(z, "FutureMessageStore/insertOrUpdateFutureMessage/inserted row should have same row_id");
            } else {
                A06.remove("message_row_id");
                String[] strArr = new String[1];
                C624134x.A0Y(r2, strArr, 0);
                if (r10.A05(A06, "message_future", "message_row_id = ?", "UPDATE_MESSAGE_FUTURE_SQL", strArr) != 1) {
                    throw new SQLiteException("Failed to insert / update futureproof message");
                }
            }
            A04.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }
}

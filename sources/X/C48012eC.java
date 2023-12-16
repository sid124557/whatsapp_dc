package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.util.Log;

/* renamed from: X.2eC  reason: invalid class name and case insensitive filesystem */
public class C48012eC {
    public final C72303dV A00;

    public void A00(C30491mX r7) {
        Cursor A0E;
        AnonymousClass4GK A03 = this.A00.get();
        try {
            C56862sg r4 = ((AnonymousClass3H0) A03).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            C18260x0.A1Y(A1Y, r7.A1L);
            A0E = r4.A0E("SELECT scheduled_timestamp_ms, call_type, title FROM message_scheduled_call WHERE message_row_id = ?", "GET_MESSAGE_SCHEDULED_CALL", A1Y);
            if (A0E.moveToLast()) {
                int columnIndexOrThrow = A0E.getColumnIndexOrThrow("scheduled_timestamp_ms");
                int columnIndexOrThrow2 = A0E.getColumnIndexOrThrow("call_type");
                int columnIndexOrThrow3 = A0E.getColumnIndexOrThrow("title");
                r7.A01 = A0E.getLong(columnIndexOrThrow);
                r7.A00 = A0E.getInt(columnIndexOrThrow2);
                r7.A02 = A0E.getString(columnIndexOrThrow3);
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

    public void A01(C30491mX r7) {
        Log.d("ScheduledCallMessageStore/insertOrUpdateMessageScheduledCall");
        C85284Fq A04 = this.A00.A04();
        try {
            ContentValues A06 = C18300x5.A06();
            C624134x.A0H(A06, r7);
            C18270x1.A0c(A06, "scheduled_timestamp_ms", r7.A01);
            C18270x1.A0b(A06, "call_type", r7.A00);
            if (AnonymousClass3H0.A03(A06, A04, "title", r7.A02).A0C("message_scheduled_call", "ScheduledCallMessageStore/insertOrUpdateMessageScheduledCall", A06, 5) < 0) {
                Log.e(C624134x.A0C(r7, "ScheduledCallMessageStore/insertOrUpdateMessageScheduledCall/insert error, rowId=", AnonymousClass001.A0o()));
            }
            A04.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public C48012eC(C72303dV r1) {
        this.A00 = r1;
    }
}

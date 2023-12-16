package X;

import android.database.Cursor;

/* renamed from: X.2W5  reason: invalid class name */
public class AnonymousClass2W5 {
    public final C72303dV A00;

    public AnonymousClass33F A00(C624134x r10) {
        Cursor A0E;
        AnonymousClass33F r6 = new AnonymousClass33F(r10);
        if (r10.A1L == -1) {
            return r6;
        }
        AnonymousClass4GK A03 = this.A00.get();
        try {
            C56862sg r4 = ((AnonymousClass3H0) A03).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            C18260x0.A1Y(A1Y, r10.A1L);
            A0E = r4.A0E("SELECT duration, campaign_id, first_seen_timestamp, action_link_url, action_link_button_title FROM message_status_psa_campaign WHERE message_row_id = ?", "GET_STATUS_PSA_INFO_FOR_ROW_ID_SQL", A1Y);
            if (A0E != null) {
                if (A0E.moveToNext()) {
                    int columnIndexOrThrow = A0E.getColumnIndexOrThrow("campaign_id");
                    int columnIndexOrThrow2 = A0E.getColumnIndexOrThrow("duration");
                    int columnIndexOrThrow3 = A0E.getColumnIndexOrThrow("first_seen_timestamp");
                    int columnIndexOrThrow4 = A0E.getColumnIndexOrThrow("action_link_url");
                    int columnIndexOrThrow5 = A0E.getColumnIndexOrThrow("action_link_button_title");
                    r6.A04 = A0E.getString(columnIndexOrThrow);
                    r6.A00 = A0E.getLong(columnIndexOrThrow2);
                    r6.A01 = A0E.getLong(columnIndexOrThrow3);
                    r6.A03 = A0E.getString(columnIndexOrThrow4);
                    r6.A02 = A0E.getString(columnIndexOrThrow5);
                }
                A0E.close();
            }
            A03.close();
            return r6;
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

    public AnonymousClass2W5(C72303dV r1) {
        this.A00 = r1;
    }
}

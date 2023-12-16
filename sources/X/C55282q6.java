package X;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: X.2q6  reason: invalid class name and case insensitive filesystem */
public class C55282q6 {
    public final C56422rx A00;
    public final C56562sC A01;
    public final C72303dV A02;

    public C42312Np A00(long j) {
        Cursor A0E;
        C42312Np r5;
        AnonymousClass4GK A03 = this.A02.get();
        try {
            C56862sg r3 = ((AnonymousClass3H0) A03).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            C18260x0.A1Y(A1Y, j);
            A0E = r3.A0E("SELECT host_storage, actual_actors, privacy_mode_ts, business_name FROM message_privacy_state WHERE message_row_id = ?", "GET_PRIVACY_STATE_INFO_SQL", A1Y);
            int columnIndexOrThrow = A0E.getColumnIndexOrThrow("host_storage");
            int columnIndexOrThrow2 = A0E.getColumnIndexOrThrow("actual_actors");
            int columnIndexOrThrow3 = A0E.getColumnIndexOrThrow("privacy_mode_ts");
            int columnIndexOrThrow4 = A0E.getColumnIndexOrThrow("business_name");
            if (A0E.moveToNext()) {
                r5 = new C42312Np(this);
                r5.A00 = new AnonymousClass3ZC(A0E.getInt(columnIndexOrThrow), (long) A0E.getInt(columnIndexOrThrow3), A0E.getInt(columnIndexOrThrow2));
                r5.A01 = A0E.getString(columnIndexOrThrow4);
            } else {
                r5 = null;
            }
            A0E.close();
            A03.close();
            return r5;
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

    public void A01(long j) {
        C85284Fq A04 = this.A02.A04();
        try {
            ((AnonymousClass3H0) A04).A03.A07("message_privacy_state", "message_row_id = ?", "DELETE_MESSAGE_PRIVACY_STATE_FOR_ID_SQL", C18260x0.A1b(j));
            A04.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A02(C64773Ex r7, C624134x r8) {
        AnonymousClass3ZH A07;
        String A0L;
        AnonymousClass3ZC r3 = r8.A0n;
        if (r3 == null) {
            r3 = new AnonymousClass3ZC();
        }
        C85284Fq A04 = this.A02.A04();
        try {
            ContentValues A06 = AnonymousClass0x9.A06();
            C624134x.A0H(A06, r8);
            C18270x1.A0b(A06, "host_storage", r3.hostStorage);
            C18270x1.A0b(A06, "actual_actors", r3.actualActors);
            C18270x1.A0c(A06, "privacy_mode_ts", r3.privacyModeTs);
            if (r8.A0G == 3 && r8.A1G && (A07 = r7.A07(r8.A0o())) != null && (A0L = A07.A0L()) != null) {
                A06.put("business_name", A0L);
                r8.A10 = A0L;
            }
            ((AnonymousClass3H0) A04).A03.A0C("message_privacy_state", "INSERT_PRIVACY_STATE_INFO", A06, 5);
            A04.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A03(C624134x r3) {
        C42312Np A002 = A00(r3.A1L);
        if (A002 != null) {
            r3.A10 = A002.A01;
            r3.A0n = A002.A00;
        }
    }

    public void A04(C624134x r7) {
        C55502qS A012 = this.A00.A01(AnonymousClass32Y.A03(r7.A1J.A00));
        if (A012 != null && A012.A02()) {
            C85284Fq A04 = this.A02.A04();
            try {
                ContentValues A06 = AnonymousClass0x9.A06();
                C624134x.A0H(A06, r7);
                C18270x1.A0b(A06, "host_storage", A012.A01);
                C18270x1.A0b(A06, "actual_actors", A012.A00);
                AnonymousClass3H0.A02(A06, A04, "privacy_mode_ts", A012.A04).A0C("message_privacy_state", "INSERT_PRIVACY_STATE_INFO", A06, 5);
                A04.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
    }

    public C55282q6(C56422rx r1, C56562sC r2, C72303dV r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}

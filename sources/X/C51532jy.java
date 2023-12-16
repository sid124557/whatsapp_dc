package X;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: X.2jy  reason: invalid class name and case insensitive filesystem */
public class C51532jy {
    public final C56922sm A00;
    public final C72303dV A01;

    public Cursor A00(AnonymousClass2z0 r8) {
        C95814uZ r6 = r8.A00;
        if (r6 == null) {
            return null;
        }
        AnonymousClass4GK A03 = this.A01.get();
        try {
            C56862sg r4 = ((AnonymousClass3H0) A03).A03;
            String str = C39122At.A00;
            String[] A1a = AnonymousClass0x9.A1a();
            A1a[0] = r8.A01;
            C18270x1.A1R(A1a, this.A00.A07(r6));
            A1a[2] = AnonymousClass2z0.A08(r8);
            return C56862sg.A00(A03, r4, str, "SELECT_LAST_EDIT_MESSAGE_BY_MESSAGE_KEY", A1a);
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public C51532jy(C56922sm r1, C72303dV r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void A01(C624134x r13) {
        Cursor A0E;
        if (C624134x.A0d(r13)) {
            AnonymousClass4GK A03 = this.A01.get();
            try {
                C56862sg r4 = ((AnonymousClass3H0) A03).A03;
                String[] A1Y = AnonymousClass0x9.A1Y();
                C18260x0.A1Y(A1Y, r13.A1L);
                A0E = r4.A0E("SELECT original_key_id,edited_timestamp,sender_timestamp FROM message_edit_info WHERE message_row_id = ?", "GET_MESSAGE_EDIT_INFO_FOR_ROW_ID_SQL", A1Y);
                if (A0E.moveToNext()) {
                    String A0Z = AnonymousClass0x2.A0Z(A0E, "original_key_id");
                    long A0C = AnonymousClass0x2.A0C(A0E, "edited_timestamp");
                    long A0C2 = AnonymousClass0x2.A0C(A0E, "sender_timestamp");
                    AnonymousClass2z0 r0 = r13.A1J;
                    r13.A1V(new C42602Ou(AnonymousClass2z0.A05(r0.A00, A0Z, r0.A02), A0C, A0C2));
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
        } else {
            return;
        }
        throw th;
    }

    public void A02(C624134x r7) {
        if (C624134x.A0d(r7)) {
            C42602Ou A11 = r7.A11();
            if (A11 != null) {
                C85284Fq A04 = this.A01.A04();
                try {
                    ContentValues A06 = AnonymousClass0x9.A06();
                    C624134x.A0H(A06, r7);
                    A06.put("original_key_id", A11.A02.A01);
                    C18270x1.A0c(A06, "edited_timestamp", A11.A00);
                    AnonymousClass3H0.A02(A06, A04, "sender_timestamp", A11.A01).A0C("message_edit_info", "INSERT_MESSAGE_EDIT_INFO", A06, 5);
                    A04.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                    throw th;
                }
            } else {
                throw AnonymousClass001.A0e("MessageEditInfoStore/insertEditInfo/missing information in the FMessage");
            }
        }
    }
}

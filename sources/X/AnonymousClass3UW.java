package X;

import android.database.Cursor;

/* renamed from: X.3UW  reason: invalid class name */
public class AnonymousClass3UW implements AnonymousClass65Y {
    public final C56922sm A00;
    public final C66533Lu A01;
    public final C72303dV A02;

    public Cursor B9f(AnonymousClass0QU r11, C95814uZ r12, C56532s8 r13) {
        Cursor cursor;
        if (r12 == null) {
            return null;
        }
        C18260x0.A1P(AnonymousClass001.A0o(), "DocumentMessageStore/getDocumentMessagesCursor/jid:", r12);
        C66533Lu r3 = this.A01;
        long A03 = r3.A03();
        AnonymousClass4GK A032 = this.A02.get();
        if (r13 != null) {
            try {
                if (C56532s8.A00(r13)) {
                    r13.A02();
                    if (A03 == 1) {
                        String A0F = r3.A0F(r13.A02());
                        C56862sg r32 = ((AnonymousClass3H0) A032).A03;
                        String str = AnonymousClass2CD.A00;
                        String[] A1a = AnonymousClass0x7.A1a(A0F, 0);
                        C56922sm.A02(this.A00, r12, A1a, 1);
                        cursor = r32.A0D(r11, str, "GET_DOCUMENT_MESSAGES_FTS_DEPRECATED_SQL", A1a);
                    } else {
                        C626936e.A0D(AnonymousClass000.A1T((A03 > 5 ? 1 : (A03 == 5 ? 0 : -1))), "unknown fts version");
                        r13.A02 = 100;
                        String A0A = r3.A0A(r11, r13, (Integer) null);
                        cursor = ((AnonymousClass3H0) A032).A03.A0D(r11, AnonymousClass2CD.A03, "GET_MATCH_TYPE_MESSAGES_FTS_SQL", new String[]{A0A});
                    }
                    A032.close();
                    return cursor;
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
        C56862sg r33 = ((AnonymousClass3H0) A032).A03;
        String str2 = C58162uo.A04;
        String[] strArr = new String[1];
        C56922sm.A02(this.A00, r12, strArr, 0);
        cursor = r33.A0D(r11, str2, "GET_DOCUMENT_MESSAGES", strArr);
        A032.close();
        return cursor;
    }

    public AnonymousClass3UW(C56922sm r1, C66533Lu r2, C72303dV r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}

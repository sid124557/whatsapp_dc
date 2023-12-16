package X;

import android.database.Cursor;

/* renamed from: X.3UX  reason: invalid class name */
public class AnonymousClass3UX implements AnonymousClass65Y {
    public final C56922sm A00;
    public final C66533Lu A01;
    public final C60202yA A02;
    public final C72303dV A03;

    public Cursor B9f(AnonymousClass0QU r12, C95814uZ r13, C56532s8 r14) {
        Cursor cursor;
        if (r13 == null) {
            return null;
        }
        C66533Lu r3 = this.A01;
        long A032 = r3.A03();
        String l = Long.toString(this.A00.A07(r13));
        C18260x0.A1P(AnonymousClass001.A0o(), "LinkMessageStore/getMessageLinkCursor; chatJid=", r13);
        AnonymousClass4GK A033 = this.A03.get();
        if (r14 != null) {
            try {
                if (C56532s8.A00(r14)) {
                    if (A032 == 1) {
                        String A0F = r3.A0F(r14.A02());
                        C56862sg r32 = ((AnonymousClass3H0) A033).A03;
                        String str = AnonymousClass2CD.A01;
                        String[] A1a = AnonymousClass0x7.A1a(l, 0);
                        A1a[1] = A0F;
                        cursor = r32.A0D(r12, str, "GET_LINK_MESSAGE_FTS_DEPRECATED_SQL", A1a);
                    } else {
                        r14.A02 = C627136h.A03;
                        String A0A = r3.A0A(r12, r14, (Integer) null);
                        cursor = ((AnonymousClass3H0) A033).A03.A0D(r12, AnonymousClass2CD.A02, "GET_LINK_MESSAGE_FTS_SQL", new String[]{A0A});
                    }
                    A033.close();
                    return cursor;
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
        cursor = ((AnonymousClass3H0) A033).A03.A0D(r12, C39132Au.A00, "GET_LINK_MESSAGE_SQL", new String[]{l});
        A033.close();
        return cursor;
    }

    public AnonymousClass3UX(C56922sm r1, C66533Lu r2, C60202yA r3, C72303dV r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }
}

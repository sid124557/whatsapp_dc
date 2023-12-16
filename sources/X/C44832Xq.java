package X;

import android.database.Cursor;
import java.util.ArrayList;

/* renamed from: X.2Xq  reason: invalid class name and case insensitive filesystem */
public final class C44832Xq {
    public final C34461vC A00;
    public final AnonymousClass2ML A01;

    public final C60652yu A00() {
        Cursor A09;
        if (!this.A01.A01.A0Y(C58422vE.A02, 3519)) {
            C72023d3 r1 = C72023d3.A00;
            return new C60652yu(r1, r1);
        }
        C34461vC r5 = this.A00;
        AnonymousClass33M A002 = AnonymousClass33M.A00();
        ArrayList A0s = AnonymousClass001.A0s();
        int i = 0;
        try {
            AnonymousClass4GK A03 = C18630y0.A03(r5);
            try {
                A09 = AnonymousClass361.A09(A03, C58142um.A03, "ALL_LID_CONTACTS");
                StringBuilder A0o = AnonymousClass001.A0o();
                C18260x0.A1F(A0o, AnonymousClass0x9.A02(A09, "contact-mgr-db/getAllLidContacts/cursor count=", A0o));
                i = A09.getCount();
                while (A09.moveToNext()) {
                    A0s.add(AnonymousClass25S.A00(A09));
                }
                A09.close();
                A03.close();
            } catch (Throwable th) {
                A03.close();
                throw th;
            }
        } catch (IllegalStateException e) {
            C34461vC.A05(e, "contactmanagerdb/getAllLidContacts/", A0s, i);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        r5.A0S(A0s);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        C18260x0.A19("returned ", A0o2, A0s);
        AnonymousClass33M.A04(A002, " LID contacts | time: ", A0o2);
        AnonymousClass4C5 A04 = C829345m.A04(C827144q.A00, new C626335w(A0s, 1));
        ArrayList A0s2 = AnonymousClass001.A0s();
        ArrayList A0s3 = AnonymousClass001.A0s();
        for (Object next : A04) {
            C18300x5.A1M(next, A0s2, A0s3, ((AnonymousClass3ZH) next).A0o ? 1 : 0);
        }
        return new C60652yu(A0s2, A0s3);
        throw th;
    }

    public C44832Xq(C34461vC r1, AnonymousClass2ML r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}

package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0fj  reason: invalid class name and case insensitive filesystem */
public final class C09150fj implements C16170sa {
    public final C012209r A00;
    public final AnonymousClass0R5 A01;
    public final AnonymousClass0QE A02;

    public List BDX(String str) {
        String str2;
        C08700eu A002 = C02920Ic.A00("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        A002.Axu(1, str);
        AnonymousClass0R5 r0 = this.A01;
        r0.A09();
        Cursor A003 = C02930Id.A00(r0, A002, false);
        try {
            ArrayList A0o = AnonymousClass000.A0o(A003);
            while (A003.moveToNext()) {
                if (A003.isNull(0)) {
                    str2 = null;
                } else {
                    str2 = A003.getString(0);
                }
                A0o.add(str2);
            }
            return A0o;
        } finally {
            A003.close();
            A002.A01();
        }
    }

    public C09150fj(AnonymousClass0R5 r3) {
        this.A01 = r3;
        this.A00 = new C17620vs(r3, this, 6);
        this.A02 = new C17630vt(r3, this, 16);
    }
}

package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0fd  reason: invalid class name and case insensitive filesystem */
public final class C09090fd implements C16160sZ {
    public final C012209r A00;
    public final AnonymousClass0R5 A01;

    public List B6v(String str) {
        String str2;
        C08700eu A012 = C02920Ic.A01("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", str);
        AnonymousClass0R5 r0 = this.A01;
        r0.A09();
        Cursor A002 = C02930Id.A00(r0, A012, false);
        try {
            ArrayList A0o = AnonymousClass000.A0o(A002);
            while (A002.moveToNext()) {
                if (A002.isNull(0)) {
                    str2 = null;
                } else {
                    str2 = A002.getString(0);
                }
                A0o.add(str2);
            }
            return A0o;
        } finally {
            A002.close();
            A012.A01();
        }
    }

    public C09090fd(AnonymousClass0R5 r3) {
        this.A01 = r3;
        this.A00 = new C17620vs(r3, this, 0);
    }
}

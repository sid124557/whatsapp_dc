package X;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0BN  reason: invalid class name */
public class AnonymousClass0BN extends C13220mp {
    public final /* synthetic */ C06310Xb A00;

    public AnonymousClass0BN(C06310Xb r1) {
        this.A00 = r1;
    }

    public void A00() {
        C08700eu A002;
        Cursor A003;
        String str;
        C06310Xb r7 = this.A00;
        WorkDatabase workDatabase = r7.A04;
        workDatabase.A0A();
        try {
            A002 = C02920Ic.A00("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
            AnonymousClass0R5 r0 = ((C09140fi) workDatabase.A0J()).A02;
            r0.A09();
            A003 = C02930Id.A00(r0, A002, false);
            ArrayList A0o = AnonymousClass000.A0o(A003);
            while (A003.moveToNext()) {
                if (A003.isNull(0)) {
                    str = null;
                } else {
                    str = A003.getString(0);
                }
                A0o.add(str);
            }
            A003.close();
            A002.A01();
            Iterator it = A0o.iterator();
            while (it.hasNext()) {
                A01(r7, AnonymousClass001.A0m(it));
            }
            new C03450Ke(workDatabase).A00.A0F().BGe(new AnonymousClass0PK("last_cancel_all_time_ms", Long.valueOf(System.currentTimeMillis())));
            workDatabase.A0B();
            workDatabase.A0C();
        } catch (Throwable th) {
            workDatabase.A0C();
            throw th;
        }
    }
}

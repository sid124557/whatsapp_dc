package X;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0BP  reason: invalid class name */
public class AnonymousClass0BP extends C13220mp {
    public final /* synthetic */ C06310Xb A00;
    public final /* synthetic */ String A01;

    public AnonymousClass0BP(C06310Xb r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public void A00() {
        C08700eu A012;
        Cursor A002;
        String str;
        C06310Xb r7 = this.A00;
        WorkDatabase workDatabase = r7.A04;
        workDatabase.A0A();
        try {
            C17060uV A0J = workDatabase.A0J();
            A012 = C02920Ic.A01("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", this.A01);
            AnonymousClass0R5 r0 = ((C09140fi) A0J).A02;
            r0.A09();
            A002 = C02930Id.A00(r0, A012, false);
            ArrayList A0o = AnonymousClass000.A0o(A002);
            while (A002.moveToNext()) {
                if (A002.isNull(0)) {
                    str = null;
                } else {
                    str = A002.getString(0);
                }
                A0o.add(str);
            }
            A002.close();
            A012.A01();
            Iterator it = A0o.iterator();
            while (it.hasNext()) {
                A01(r7, AnonymousClass001.A0m(it));
            }
            workDatabase.A0B();
            workDatabase.A0C();
            AnonymousClass0VJ.A01(r7.A02, workDatabase, r7.A07);
        } catch (Throwable th) {
            workDatabase.A0C();
            throw th;
        }
    }
}

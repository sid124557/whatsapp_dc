package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2fA  reason: invalid class name and case insensitive filesystem */
public class C48602fA {
    public AnonymousClass8OQ A00;
    public final C183538qC A01;

    public AnonymousClass8OQ A01() {
        AnonymousClass8OQ r0;
        synchronized (this) {
            r0 = this.A00;
            if (r0 == null) {
                HashMap A0t = AnonymousClass001.A0t();
                Iterator A0j = AnonymousClass0x2.A0j(this.A01);
                while (A0j.hasNext()) {
                    AnonymousClass31D r3 = (AnonymousClass31D) A0j.next();
                    C626936e.A06(r3);
                    String str = r3.A0C;
                    C626936e.A06(str);
                    if (A0t.containsKey(str)) {
                        C18260x0.A0t("MigrationRegistry/addMigration/duplicate; name=", str, AnonymousClass001.A0o());
                    }
                    A0t.put(str, r3);
                }
                r0 = AnonymousClass8OQ.copyOf((Map) A0t);
                this.A00 = r0;
            }
        }
        return r0;
    }

    public C48602fA(C54292oU r2) {
        this.A01 = C72333dY.A05(r2, 14);
    }

    public static C172878Nf A00(AnonymousClass30D r0) {
        return r0.A0B.A01().values().iterator();
    }

    public final AnonymousClass31D A02(String str) {
        return (AnonymousClass31D) A01().get(str);
    }
}

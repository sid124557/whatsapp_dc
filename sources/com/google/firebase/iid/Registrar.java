package com.google.firebase.iid;

import X.AnonymousClass000;
import X.AnonymousClass8CO;
import X.AnonymousClass8CP;
import X.AnonymousClass8CS;
import X.C1447972z;
import X.C146657Bc;
import X.C152197Xy;
import X.C152547Zh;
import X.C156047fw;
import X.C157587iY;
import X.C161757qO;
import X.C162177rO;
import X.C181328ma;
import X.C18300x5;
import java.util.Arrays;
import java.util.List;

public final class Registrar {
    public final List getComponents() {
        Class<FirebaseInstanceId> cls = FirebaseInstanceId.class;
        C152547Zh r3 = new C152547Zh(cls, new Class[0]);
        r3.A01(new C152197Xy(C161757qO.class, 1));
        r3.A01(new C152197Xy(AnonymousClass8CS.class, 1));
        r3.A01(new C152197Xy(C156047fw.class, 1));
        C181328ma r0 = AnonymousClass8CO.A00;
        C162177rO.A03(r0, "Null factory");
        r3.A02 = r0;
        C162177rO.A04("Instantiation type has already been set.", AnonymousClass000.A1T(r3.A00));
        r3.A00 = 1;
        C157587iY A00 = r3.A00();
        C152547Zh r1 = new C152547Zh(C146657Bc.class, new Class[0]);
        r1.A01(new C152197Xy(cls, 1));
        C181328ma r02 = AnonymousClass8CP.A00;
        C162177rO.A03(r02, "Null factory");
        r1.A02 = r02;
        C157587iY A002 = r1.A00();
        C157587iY A003 = C1447972z.A00("fire-iid", "20.0.0");
        C157587iY[] r03 = new C157587iY[3];
        r03[0] = A00;
        C18300x5.A1K(A002, A003, r03);
        return Arrays.asList(r03);
    }
}

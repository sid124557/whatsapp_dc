package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Oh  reason: invalid class name and case insensitive filesystem */
public final class C67183Oh implements AnonymousClass4EN {
    public AnonymousClass25E A00;
    public final /* synthetic */ AnonymousClass5P2 A01;

    public void AyP(AnonymousClass2SI r8) {
        ArrayList arrayList;
        AnonymousClass25E r3;
        Collection values;
        C162457s7.A0J(r8, 0);
        if (r8.A00 == 0) {
            C50752ii r0 = (C50752ii) r8.A03.A00;
            if (r0 != null) {
                r3 = new C22311Mo(r0.A00, true);
            } else {
                r3 = new C22321Mp((List) null, C18290x4.A12("client parsing error"), 4);
            }
        } else {
            C48642fE r32 = r8.A04;
            Map map = r32.A00;
            List list = null;
            if (map == null || (values = map.values()) == null) {
                arrayList = null;
            } else {
                List<C618532n> A0F = C73723fy.A0F(values);
                arrayList = C73783g4.A0d(A0F);
                for (C618532n r02 : A0F) {
                    C18270x1.A1K(arrayList, r02.A01);
                }
                if (arrayList.contains(-20)) {
                    r3 = new C22321Mp((List) null, C18290x4.A12("client parsing error"), 4);
                }
            }
            Map map2 = r32.A00;
            if (map2 != null) {
                ArrayList A0z = C18290x4.A0z(map2);
                Iterator A0q = AnonymousClass000.A0q(map2);
                while (A0q.hasNext()) {
                    A0z.add(AnonymousClass0x2.A0W(A0q));
                }
                ArrayList A0d = C73783g4.A0d(A0z);
                Iterator it = A0z.iterator();
                while (it.hasNext()) {
                    A0d.add(((C618532n) it.next()).A06);
                }
                list = C73723fy.A0F(A0d);
            }
            r3 = new C22321Mp(arrayList, list, 2);
        }
        this.A00 = r3;
    }

    public void BQq(IOException iOException) {
        C162457s7.A0J(iOException, 0);
        this.A00 = new C22321Mp((List) null, C18290x4.A12(iOException.getMessage()), 1);
    }

    public void BSB(Exception exc) {
        List A12;
        int i;
        C162457s7.A0J(exc, 0);
        if (exc instanceof AnonymousClass244) {
            A12 = C18290x4.A12(((AnonymousClass244) exc).error.A06);
            i = 2;
        } else {
            A12 = C18290x4.A12(exc.getMessage());
            i = 3;
        }
        this.A00 = new C22321Mp((List) null, A12, i);
    }

    public C67183Oh(AnonymousClass5P2 r1) {
        this.A01 = r1;
    }
}

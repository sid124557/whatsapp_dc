package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Po  reason: invalid class name and case insensitive filesystem */
public class C67513Po implements AnonymousClass4F7 {
    public final AnonymousClass5Y0 A00;
    public final C67523Pp A01;
    public final C27831ek A02;
    public final Map A03;
    public final Map A04;
    public final Map A05 = AnonymousClass001.A0t();

    public synchronized void A01(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A00((C85164Fe) it.next(), this.A04);
        }
    }

    public Collection B3C(String str, int i, boolean z, boolean z2) {
        HashMap A0t = AnonymousClass001.A0t();
        ArrayList A0s = AnonymousClass001.A0s();
        for (C85164Fe r1 : this.A02.A03()) {
            if (r1 instanceof AnonymousClass3QV) {
                A00(r1, A0t);
            }
            A0s.addAll(Arrays.asList(r1.B7I()));
        }
        List<C106655Zv> A022 = this.A01.A02(str, A0s, AnonymousClass001.A0s(), i, false);
        LinkedHashSet A17 = AnonymousClass0x9.A17();
        LinkedHashSet A172 = AnonymousClass0x9.A17();
        ArrayList A0I = AnonymousClass002.A0I(4);
        A0I.add(A0t);
        A0I.add(this.A03);
        A0I.add(this.A04);
        A0I.add(this.A05);
        synchronized (this) {
            Iterator it = A0I.iterator();
            while (it.hasNext()) {
                Map map = (Map) it.next();
                for (C106655Zv r0 : A022) {
                    Collection<C85164Fe> collection = (Collection) map.get(r0);
                    if (collection != null) {
                        for (C85164Fe r12 : collection) {
                            if (r12 instanceof AnonymousClass3QV) {
                                A172.add(r12);
                            } else {
                                A17.add(r12);
                            }
                        }
                    }
                }
            }
        }
        for (C106655Zv r2 : A022) {
            A17.add(new AnonymousClass3QU(r2, this.A00));
        }
        LinkedHashSet linkedHashSet = A172;
        if (z) {
            linkedHashSet = A17;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(linkedHashSet);
        if (z) {
            A17 = A172;
        }
        linkedHashSet2.addAll(A17);
        return linkedHashSet2;
    }

    public void Ayq() {
        this.A01.Ayq();
    }

    public Collection B3D(String[] strArr, int i, boolean z, boolean z2) {
        C626936e.A0D(false, "Not implemented");
        return AnonymousClass001.A0s();
    }

    public void BmT(boolean z) {
        this.A01.BmT(z);
    }

    public int getCount() {
        return this.A01.getCount();
    }

    public C67513Po(AnonymousClass5Y0 r4, C67523Pp r5, C27831ek r6) {
        this.A00 = r4;
        this.A02 = r6;
        this.A01 = r5;
        for (C85164Fe A002 : C58022ua.A00()) {
            A00(A002, this.A05);
        }
        this.A03 = AnonymousClass001.A0t();
        this.A04 = AnonymousClass001.A0t();
    }

    public static void A00(C85164Fe r5, Map map) {
        for (C106655Zv r1 : r5.B7I()) {
            Collection collection = (Collection) map.get(r1);
            if (collection == null) {
                collection = AnonymousClass0x9.A17();
                map.put(r1, collection);
            }
            collection.add(r5);
        }
    }
}

package X;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.0Nb  reason: invalid class name and case insensitive filesystem */
public final class C04160Nb {
    public final C06290Wz A00 = new C06290Wz();
    public final C16600tf A01 = new C08030dD(10);
    public final ArrayList A02 = AnonymousClass001.A0s();
    public final HashSet A03 = AnonymousClass002.A0K();

    public final void A00(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (!hashSet.contains(obj)) {
            hashSet.add(obj);
            AbstractList abstractList = (AbstractList) this.A00.get(obj);
            if (abstractList != null) {
                int size = abstractList.size();
                for (int i = 0; i < size; i++) {
                    A00(abstractList.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
            return;
        }
        throw AnonymousClass002.A0E("This graph contains cyclic dependencies");
    }
}

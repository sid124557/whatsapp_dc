package X;

import java.util.AbstractCollection;
import java.util.HashMap;

/* renamed from: X.2gY  reason: invalid class name and case insensitive filesystem */
public class C49452gY {
    public HashMap A00;
    public final C56612sH A01;
    public final AnonymousClass1VX A02;
    public final AnonymousClass4FV A03;

    public final void A00(int i) {
        if (this.A02.A0Y(C58422vE.A02, 2013)) {
            AnonymousClass1WB r2 = new AnonymousClass1WB();
            r2.A00 = Integer.valueOf(i);
            AnonymousClass4FV r1 = this.A03;
            r1.BhD(r2);
            r1.BlF(true);
        }
    }

    public final void A01(C95814uZ r4, int i) {
        if (r4 != null) {
            HashMap hashMap = this.A00;
            if (!hashMap.containsKey(r4)) {
                hashMap.put(r4, AnonymousClass002.A0K());
            }
            AbstractCollection abstractCollection = (AbstractCollection) hashMap.get(r4);
            if (abstractCollection != null) {
                Integer valueOf = Integer.valueOf(i);
                if (!abstractCollection.contains(valueOf)) {
                    A00(i);
                    abstractCollection.add(valueOf);
                }
            }
        }
    }

    public C49452gY(C56612sH r1, AnonymousClass1VX r2, AnonymousClass4FV r3, HashMap hashMap) {
        C18260x0.A0V(r1, r2, r3);
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A00 = hashMap;
    }
}

package X;

import java.util.AbstractMap;
import java.util.HashMap;

/* renamed from: X.7Sn  reason: invalid class name and case insensitive filesystem */
public class C150867Sn {
    public HashMap A00 = AnonymousClass001.A0t();
    public HashMap A01 = AnonymousClass001.A0t();
    public HashMap A02 = AnonymousClass001.A0t();

    public void A00(C153007aW r5) {
        int size;
        C159297la.A02(!AnonymousClass002.A0J(r5.A02).isEmpty(), (String) null);
        C142366x5 r3 = r5.A00;
        HashMap hashMap = this.A02;
        AbstractMap abstractMap = (AbstractMap) hashMap.get(r3);
        if (abstractMap == null) {
            abstractMap = AnonymousClass001.A0t();
            size = 0;
        } else {
            size = abstractMap.size();
        }
        AnonymousClass0x2.A1H(r5, abstractMap, size);
        hashMap.put(r3, abstractMap);
    }
}

package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.5Pi  reason: invalid class name and case insensitive filesystem */
public class C104025Pi {
    public final HashMap A00 = AnonymousClass001.A0t();
    public final List A01 = AnonymousClass001.A0s();

    public int A00(String str) {
        int i = 0;
        for (AnonymousClass5Go r0 : this.A01) {
            if (r0.A00.A0A.getRawString().equals(str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void A01(AnonymousClass5Go r5) {
        this.A01.add(r5);
        String rawString = r5.A00.A0A.getRawString();
        HashMap hashMap = this.A00;
        if (!hashMap.containsKey(rawString)) {
            AnonymousClass0x2.A1J(rawString, hashMap, (long) hashMap.size());
        }
    }
}

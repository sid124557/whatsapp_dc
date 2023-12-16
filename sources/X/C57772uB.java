package X;

import android.text.TextUtils;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.2uB  reason: invalid class name and case insensitive filesystem */
public class C57772uB {
    public static HashMap A00 = AnonymousClass001.A0t();

    public static void A00(C69263Wi r7, C66513Ls r8, C620733j r9, AnonymousClass1VX r10, C83854Ab r11, AnonymousClass4FS r12, String str, boolean z) {
        C66513Ls r0;
        String str2 = str;
        if (!TextUtils.isEmpty(str)) {
            r0 = C57782uC.A00(str);
            if (r0 != null) {
                r0.A0R = z;
                if (r11 == null) {
                    return;
                }
            } else {
                HashMap hashMap = A00;
                AbstractCollection abstractCollection = (AbstractCollection) hashMap.get(str);
                if (abstractCollection != null) {
                    abstractCollection.add(r11);
                    return;
                }
                ArrayList A0I = AnonymousClass002.A0I(1);
                A0I.add(r11);
                hashMap.put(str, A0I);
                r8.A0R = z;
                r12.BkM(new C71613cO(r8, r9, r10, r7, str2, 0));
                return;
            }
        } else if (r11 != null) {
            r0 = null;
        } else {
            return;
        }
        r11.BXc(r0, true);
    }
}

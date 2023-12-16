package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: X.7ou  reason: invalid class name and case insensitive filesystem */
public class C161047ou {
    public static final Set A00 = Collections.emptySet();

    public static C185208tG A00(C152767a5 r11, C146587Av r12, String str, boolean z, boolean z2, boolean z3) {
        Set set;
        String str2;
        C146587Av r10 = r12;
        if (r12 == null) {
            return null;
        }
        List list = C150777Se.A00((C150777Se) r11.A0A.get(0), 0).A05;
        if (list.isEmpty()) {
            set = A00;
        } else {
            HashSet A0K = AnonymousClass002.A0K();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C166657z3 r0 = ((C152937aP) list.get(i)).A00.A0L;
                if (r0 != null) {
                    for (C166487yl r02 : r0.A03) {
                        UUID uuid = r02.A03;
                        if (r02.A04 != null) {
                            A0K.add(uuid);
                        }
                    }
                }
            }
            set = A0K;
        }
        Iterator it = set.iterator();
        while (true) {
            str2 = str;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Object[] A0M = AnonymousClass002.A0M();
            AnonymousClass0x7.A1E(next, A0M, 0);
            A0M[1] = str;
            C161157p6.A01("DrmSessionManagerHelper", "DRM scheme %s for vid=%s", A0M);
        }
        if (set.isEmpty()) {
            C161157p6.A01("DrmSessionManagerHelper", "Not a protected video for vid=%s", str);
            return null;
        }
        UUID uuid2 = C155567f7.A04;
        if (set.contains(uuid2)) {
            C1674180z r1 = new C1674180z(C160797oK.A00(uuid2), new AnonymousClass7NZ(r10, str2, z, z2, z3), uuid2, new int[0]);
            r1.A03.A06();
            return r1;
        }
        throw new C143766zR();
    }
}

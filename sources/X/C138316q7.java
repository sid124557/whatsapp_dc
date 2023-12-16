package X;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.6q7  reason: invalid class name and case insensitive filesystem */
public class C138316q7 extends AnonymousClass2MP {
    public static final Set A00;
    public static final Set A01;

    public C138316q7() {
        super(A00, A01);
    }

    static {
        HashSet A0K = AnonymousClass002.A0K();
        Set<Object> set = C155697fL.A1P;
        HashSet A0K2 = AnonymousClass002.A0K();
        for (Object obj : set) {
            Collection collection = (Collection) C155697fL.A0z.get(obj);
            if (collection == null) {
                collection = Collections.unmodifiableSet(C18280x3.A0h(new AnonymousClass8L9[]{C155697fL.A01}));
            }
            A0K2.addAll(collection);
        }
        for (AnonymousClass8L9 r0 : Collections.unmodifiableSet(A0K2)) {
            String str = r0.sha1Hash;
            C18320x8.A1F("com.whatsapp", str, A0K);
            C18320x8.A1F("com.whatsapp.w4b", str, A0K);
        }
        A00 = Collections.unmodifiableSet(A0K);
        HashSet A0K3 = AnonymousClass002.A0K();
        AnonymousClass8L9 r1 = C155697fL.A0y;
        C18320x8.A1F("com.whatsapp", r1.sha1Hash, A0K3);
        C18320x8.A1F("com.whatsapp.w4b", r1.sha1Hash, A0K3);
        A01 = Collections.unmodifiableSet(A0K3);
    }
}

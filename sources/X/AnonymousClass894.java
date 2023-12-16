package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.894  reason: invalid class name */
public final class AnonymousClass894 implements C186678vl {
    public static final AnonymousClass894 A01;
    public final Bundle A00;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AnonymousClass894) {
                Bundle bundle = new Bundle(this.A00);
                Bundle bundle2 = new Bundle(((AnonymousClass894) obj).A00);
                if (bundle.size() == bundle2.size()) {
                    Iterator<String> it = bundle.keySet().iterator();
                    while (it.hasNext()) {
                        String A0m = AnonymousClass001.A0m(it);
                        if (bundle2.containsKey(A0m)) {
                            if (!AnonymousClass72K.A00(bundle.get(A0m), bundle2.get(A0m))) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Bundle bundle = new Bundle(this.A00);
        int size = bundle.size();
        ArrayList A0I = AnonymousClass002.A0I(size + size);
        ArrayList A0J = AnonymousClass002.A0J(bundle.keySet());
        Collections.sort(A0J);
        int size2 = A0J.size();
        for (int i = 0; i < size2; i++) {
            String str = (String) A0J.get(i);
            A0I.add(str);
            A0I.add(bundle.get(str));
        }
        return C18310x6.A08(A0I, AnonymousClass002.A0L(), 0);
    }

    static {
        Bundle A08 = AnonymousClass002.A08();
        if (!A08.containsKey("accountTypes")) {
            A08.putStringArrayList("accountTypes", AnonymousClass002.A0I(0));
        }
        A01 = new AnonymousClass894(A08);
    }

    public /* synthetic */ AnonymousClass894(Bundle bundle) {
        this.A00 = bundle;
    }
}

package X;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.893  reason: invalid class name */
public final class AnonymousClass893 implements C186678vl {
    public static final AnonymousClass893 A01 = new AnonymousClass893(AnonymousClass002.A08());
    public final Bundle A00;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnonymousClass893)) {
            return false;
        }
        Bundle bundle = this.A00;
        Bundle bundle2 = ((AnonymousClass893) obj).A00;
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> keySet = bundle.keySet();
        if (!keySet.containsAll(bundle2.keySet())) {
            return false;
        }
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            if (!AnonymousClass72K.A00(bundle.get(A0m), bundle2.get(A0m))) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ AnonymousClass893(Bundle bundle) {
        this.A00 = bundle;
    }

    public final int hashCode() {
        return C18310x6.A08(this.A00, AnonymousClass002.A0L(), 0);
    }
}

package X;

import android.os.Bundle;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.0el  reason: invalid class name and case insensitive filesystem */
public final class C08610el implements C16050sO {
    public final Set A00 = new LinkedHashSet();

    public C08610el(AnonymousClass0UG r2) {
        r2.A04(this, "androidx.savedstate.Restarter");
    }

    public Bundle Bkk() {
        Bundle A08 = AnonymousClass002.A08();
        A08.putStringArrayList("classes_to_restore", AnonymousClass002.A0J(this.A00));
        return A08;
    }
}

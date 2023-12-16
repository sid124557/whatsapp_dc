package X;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0em  reason: invalid class name and case insensitive filesystem */
public final class C08620em implements C16050sO {
    public Bundle A00;
    public boolean A01;
    public final AnonymousClass0UG A02;
    public final AnonymousClass66R A03;

    public C08620em(C15940sD r2, AnonymousClass0UG r3) {
        C162457s7.A0J(r2, 2);
        this.A02 = r3;
        this.A03 = C154517dI.A01(new C14050oY(r2));
    }

    public final Bundle A00(String str) {
        Bundle bundle;
        if (!this.A01) {
            this.A00 = this.A02.A01("androidx.lifecycle.internal.SavedStateHandlesProvider");
            this.A01 = true;
            A01();
        }
        Bundle bundle2 = this.A00;
        if (bundle2 != null) {
            bundle = bundle2.getBundle(str);
        } else {
            bundle = null;
        }
        Bundle bundle3 = this.A00;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.A00;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.A00 = null;
        }
        return bundle;
    }

    public final AnonymousClass08O A01() {
        return (AnonymousClass08O) this.A03.getValue();
    }

    public Bundle Bkk() {
        Bundle A08 = AnonymousClass002.A08();
        Bundle bundle = this.A00;
        if (bundle != null) {
            A08.putAll(bundle);
        }
        Iterator A0q = AnonymousClass000.A0q(A01().A00);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            String str = (String) A0w.getKey();
            Bundle Bkk = ((AnonymousClass0XV) A0w.getValue()).A00.Bkk();
            if (!C162457s7.A0P(Bkk, Bundle.EMPTY)) {
                A08.putBundle(str, Bkk);
            }
        }
        this.A01 = false;
        return A08;
    }
}

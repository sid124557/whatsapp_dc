package X;

import android.os.Bundle;
import androidx.savedstate.Recreator;
import androidx.savedstate.SavedStateRegistry$$ExternalSyntheticLambda0;
import java.util.Map;

/* renamed from: X.0PU  reason: invalid class name */
public final class AnonymousClass0PU {
    public boolean A00;
    public final AnonymousClass0UG A01 = new AnonymousClass0UG();
    public final C17310vJ A02;

    public final void A02(Bundle bundle) {
        C162457s7.A0J(bundle, 0);
        AnonymousClass0UG r1 = this.A01;
        Bundle A08 = AnonymousClass002.A08();
        Bundle bundle2 = r1.A00;
        if (bundle2 != null) {
            A08.putAll(bundle2);
        }
        C10610iE r0 = r1.A05;
        C13500nH r2 = new C13500nH(r0);
        r0.A03.put(r2, Boolean.FALSE);
        while (r2.hasNext()) {
            Map.Entry entry = (Map.Entry) r2.next();
            A08.putBundle((String) entry.getKey(), ((C16050sO) entry.getValue()).Bkk());
        }
        if (!A08.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", A08);
        }
    }

    public final void A00() {
        C17310vJ r4 = this.A02;
        AnonymousClass0O9 lifecycle = r4.getLifecycle();
        C162457s7.A0D(lifecycle);
        if (((AnonymousClass08A) lifecycle).A02 == AnonymousClass0GC.INITIALIZED) {
            lifecycle.A00(new Recreator(r4));
            AnonymousClass0UG r1 = this.A01;
            if (!r1.A02) {
                lifecycle.A00(new SavedStateRegistry$$ExternalSyntheticLambda0(r1));
                r1.A02 = true;
                this.A00 = true;
                return;
            }
            throw AnonymousClass001.A0e("SavedStateRegistry was already attached.");
        }
        throw AnonymousClass001.A0e("Restarter must be created only during owner's initialization stage");
    }

    public final void A01(Bundle bundle) {
        Bundle bundle2;
        if (!this.A00) {
            A00();
        }
        AnonymousClass0O9 lifecycle = this.A02.getLifecycle();
        C162457s7.A0D(lifecycle);
        AnonymousClass08A r2 = (AnonymousClass08A) lifecycle;
        if (!AnonymousClass001.A1U(r2.A02.compareTo(AnonymousClass0GC.STARTED))) {
            AnonymousClass0UG r22 = this.A01;
            if (!r22.A02) {
                throw AnonymousClass001.A0e("You must call performAttach() before calling performRestore(Bundle).");
            } else if (!r22.A04) {
                if (bundle != null) {
                    bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                } else {
                    bundle2 = null;
                }
                r22.A00 = bundle2;
                r22.A04 = true;
            } else {
                throw AnonymousClass001.A0e("SavedStateRegistry was already restored.");
            }
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("performRestore cannot be called when owner is ");
            throw AnonymousClass001.A0e(AnonymousClass000.A0R(r2.A02, A0o));
        }
    }

    public AnonymousClass0PU(C17310vJ r2) {
        this.A02 = r2;
    }
}

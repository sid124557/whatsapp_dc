package X;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0UG  reason: invalid class name */
public final class AnonymousClass0UG {
    public Bundle A00;
    public C08610el A01;
    public boolean A02;
    public boolean A03 = true;
    public boolean A04;
    public final C10610iE A05 = new C10610iE();

    public static final void A00(AnonymousClass0GH r2, AnonymousClass0UG r3) {
        C162457s7.A0J(r2, 2);
        if (r2 == AnonymousClass0GH.ON_START) {
            r3.A03 = true;
        } else if (r2 == AnonymousClass0GH.ON_STOP) {
            r3.A03 = false;
        }
    }

    public final Bundle A01(String str) {
        C162457s7.A0J(str, 0);
        if (this.A04) {
            Bundle bundle = this.A00;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = this.A00;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.A00;
            if (bundle4 != null && !bundle4.isEmpty()) {
                return bundle2;
            }
            this.A00 = null;
            return bundle2;
        }
        throw AnonymousClass001.A0e("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public final void A04(C16050sO r2, String str) {
        C162457s7.A0J(str, 0);
        C162457s7.A0J(r2, 1);
        if (this.A05.A02(str, r2) != null) {
            throw AnonymousClass001.A0c("SavedStateProvider with the given key is already registered");
        }
    }

    public final C16050sO A02() {
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(it);
            C162457s7.A0B(A0w);
            Object key = A0w.getKey();
            C16050sO r1 = (C16050sO) A0w.getValue();
            if (C162457s7.A0P(key, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                return r1;
            }
        }
        return null;
    }

    public final void A03() {
        Class<C08600ek> cls = C08600ek.class;
        if (this.A03) {
            C08610el r0 = this.A01;
            if (r0 == null) {
                r0 = new C08610el(this);
            }
            this.A01 = r0;
            try {
                cls.getDeclaredConstructor(new Class[0]);
                C08610el r02 = this.A01;
                if (r02 != null) {
                    String name = cls.getName();
                    C162457s7.A0D(name);
                    r02.A00.add(name);
                }
            } catch (NoSuchMethodException e) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Class ");
                A0o.append(cls.getSimpleName());
                throw new IllegalArgumentException(AnonymousClass000.A0X(" must have default constructor in order to be automatically recreated", A0o), e);
            }
        } else {
            throw AnonymousClass001.A0e("Can not perform this action after onSaveInstanceState");
        }
    }
}

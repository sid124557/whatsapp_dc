package androidx.savedstate;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0GH;
import X.AnonymousClass0N2;
import X.AnonymousClass0UG;
import X.C05090Rx;
import X.C05550Ty;
import X.C15240r0;
import X.C15910sA;
import X.C15940sD;
import X.C162457s7;
import X.C17280vG;
import X.C17310vJ;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public final class Recreator implements C17280vG {
    public final C17310vJ A00;

    public void BcK(AnonymousClass0GH r3, C15910sA r4) {
        C162457s7.A0J(r4, 0);
        C162457s7.A0J(r3, 1);
        if (r3 == AnonymousClass0GH.ON_CREATE) {
            r4.getLifecycle().A01(this);
            Bundle A01 = this.A00.BCR().A01("androidx.savedstate.Restarter");
            if (A01 != null) {
                ArrayList<String> stringArrayList = A01.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        A00(AnonymousClass001.A0m(it));
                    }
                    return;
                }
                throw AnonymousClass001.A0e("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }

    public final void A00(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(C15240r0.class);
            C162457s7.A0D(asSubclass);
            try {
                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    C162457s7.A0D(declaredConstructor.newInstance(new Object[0]));
                    C17310vJ r5 = this.A00;
                    if (r5 instanceof C15940sD) {
                        AnonymousClass0N2 BEL = ((C15940sD) r5).BEL();
                        AnonymousClass0UG BCR = r5.BCR();
                        HashMap hashMap = BEL.A00;
                        Iterator it = new HashSet(hashMap.keySet()).iterator();
                        while (it.hasNext()) {
                            C05090Rx.A00(r5.getLifecycle(), (C05550Ty) hashMap.get(it.next()), BCR);
                        }
                        if (!new HashSet(hashMap.keySet()).isEmpty()) {
                            BCR.A03();
                            return;
                        }
                        return;
                    }
                    throw AnonymousClass001.A0e("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                } catch (Exception e) {
                    throw new RuntimeException(AnonymousClass000.A0V("Failed to instantiate ", str, AnonymousClass001.A0o()), e);
                }
            } catch (NoSuchMethodException e2) {
                StringBuilder A0l = AnonymousClass000.A0l("Class ");
                A0l.append(asSubclass.getSimpleName());
                throw new IllegalStateException(AnonymousClass000.A0X(" must have default constructor in order to be automatically recreated", A0l), e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException(AnonymousClass000.A0X(" wasn't found", AnonymousClass000.A0m("Class ", str)), e3);
        }
    }

    public Recreator(C17310vJ r1) {
        this.A00 = r1;
    }
}

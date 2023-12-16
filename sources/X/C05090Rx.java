package X;

import androidx.lifecycle.LegacySavedStateHandleController$1;
import androidx.lifecycle.SavedStateHandleController;
import java.util.Map;

/* renamed from: X.0Rx  reason: invalid class name and case insensitive filesystem */
public class C05090Rx {
    public static void A01(AnonymousClass0O9 r2, AnonymousClass0UG r3) {
        AnonymousClass0GC r1 = ((AnonymousClass08A) r2).A02;
        if (r1 == AnonymousClass0GC.INITIALIZED || AnonymousClass001.A1U(r1.compareTo(AnonymousClass0GC.STARTED))) {
            r3.A03();
        } else {
            r2.A00(new LegacySavedStateHandleController$1(r2, r3));
        }
    }

    public static void A00(AnonymousClass0O9 r3, C05550Ty r4, AnonymousClass0UG r5) {
        Object obj;
        Map map = r4.A00;
        synchronized (map) {
            obj = map.get("androidx.lifecycle.savedstate.vm.tag");
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController != null && !savedStateHandleController.A00) {
            savedStateHandleController.A00(r3, r5);
            A01(r3, r5);
        }
    }
}

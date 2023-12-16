package X;

import java.util.Map;

/* renamed from: X.0IV  reason: invalid class name */
public final class AnonymousClass0IV {
    public static final AnonymousClass4C6 A00(C05550Ty r3) {
        Object obj;
        C162457s7.A0J(r3, 0);
        Map map = r3.A00;
        synchronized (map) {
            obj = map.get("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        }
        AnonymousClass4C6 r0 = (AnonymousClass4C6) obj;
        if (r0 == null) {
            return (AnonymousClass4C6) r3.A0B(new C10480i0(AnonymousClass2AJ.A00().plus(AnonymousClass34M.A01().A04())), "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        }
        return r0;
    }
}

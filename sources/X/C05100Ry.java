package X;

import androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3;

/* renamed from: X.0Ry  reason: invalid class name and case insensitive filesystem */
public final class C05100Ry {
    public static final Object A00(AnonymousClass0GC r2, AnonymousClass0O9 r3, C84814Du r4, AnonymousClass4GR r5) {
        Object A00;
        if (r2 == AnonymousClass0GC.INITIALIZED) {
            throw AnonymousClass001.A0c("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        } else if (((AnonymousClass08A) r3).A02 == AnonymousClass0GC.DESTROYED || (A00 = AnonymousClass349.A00(r4, new RepeatOnLifecycleKt$repeatOnLifecycle$3(r2, r3, (C84814Du) null, r5))) != C73883gE.A05()) {
            return C59022wD.A00;
        } else {
            return A00;
        }
    }

    public static final Object A01(AnonymousClass0GC r1, C15910sA r2, C84814Du r3, AnonymousClass4GR r4) {
        AnonymousClass0O9 lifecycle = r2.getLifecycle();
        C162457s7.A0D(lifecycle);
        Object A00 = A00(r1, lifecycle, r3, r4);
        if (A00 != C73883gE.A05()) {
            return C59022wD.A00;
        }
        return A00;
    }
}

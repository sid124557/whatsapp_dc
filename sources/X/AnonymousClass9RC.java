package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.9RC  reason: invalid class name */
public class AnonymousClass9RC {
    public final AtomicBoolean A00 = new AtomicBoolean();
    public final C203279nQ[] A01 = new C203279nQ[AnonymousClass22N.values().length];
    public final boolean[] A02 = new boolean[AnonymousClass22N.values().length];

    public final void A00() {
        for (AnonymousClass22N ordinal : AnonymousClass22N.values()) {
            int ordinal2 = ordinal.ordinal();
            C203279nQ[] r1 = this.A01;
            if (r1[ordinal2] != null && this.A00.get() && this.A02[ordinal2]) {
                r1[ordinal2].B2L();
            }
        }
    }
}

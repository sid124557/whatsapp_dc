package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.0OA  reason: invalid class name */
public final class AnonymousClass0OA {
    public final List A00 = AnonymousClass001.A0s();

    public final C17190ui A00() {
        Object[] array = this.A00.toArray(new AnonymousClass0ND[0]);
        if (array != null) {
            AnonymousClass0ND[] r1 = (AnonymousClass0ND[]) array;
            return new C08370eL((AnonymousClass0ND[]) Arrays.copyOf(r1, r1.length));
        }
        throw AnonymousClass001.A0g("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public final void A01(AnonymousClass4GQ r4, C85424Ge r5) {
        this.A00.add(new AnonymousClass0ND(C154547dL.A00(r5), r4));
    }
}

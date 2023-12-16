package X;

import java.util.HashSet;

/* renamed from: X.41Z  reason: invalid class name */
public final class AnonymousClass41Z extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ HashSet $storedLids;

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C162457s7.A0J(obj, 0);
        return Boolean.valueOf(this.$storedLids.contains(obj));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass41Z(HashSet hashSet) {
        super(1);
        this.$storedLids = hashSet;
    }
}

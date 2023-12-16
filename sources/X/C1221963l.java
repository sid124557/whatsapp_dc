package X;

import java.text.Collator;

/* renamed from: X.63l  reason: invalid class name and case insensitive filesystem */
public final class C1221963l extends C829045j implements AnonymousClass4GR {
    public final /* synthetic */ Collator $collator;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1221963l(Collator collator) {
        super(2);
        this.$collator = collator;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(this.$collator.compare(((C108835dd) obj).A02, ((C108835dd) obj2).A02));
    }
}

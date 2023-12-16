package X;

/* renamed from: X.43Q  reason: invalid class name */
public final class AnonymousClass43Q extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ int $index = 1;

    public AnonymousClass43Q() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ((Number) obj).intValue();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Collection doesn't contain element at index ");
        A0o.append(this.$index);
        throw new IndexOutOfBoundsException(AnonymousClass001.A0j(A0o, '.'));
    }
}

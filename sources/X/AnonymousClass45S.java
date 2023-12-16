package X;

/* renamed from: X.45S  reason: invalid class name */
public final class AnonymousClass45S extends C829045j implements AnonymousClass4GR {
    public final /* synthetic */ C85494Gl[] $elements;
    public final /* synthetic */ C69883Yw $index;

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C162457s7.A0J(obj2, 1);
        C85494Gl[] r3 = this.$elements;
        C69883Yw r2 = this.$index;
        int i = r2.element;
        r2.element = i + 1;
        r3[i] = obj2;
        return C59022wD.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass45S(C69883Yw r2, C85494Gl[] r3) {
        super(2);
        this.$elements = r3;
        this.$index = r2;
    }
}

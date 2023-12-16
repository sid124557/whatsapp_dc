package X;

/* renamed from: X.63B  reason: invalid class name */
public final class AnonymousClass63B extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C133336hB $category;
    public final /* synthetic */ int $index;
    public final /* synthetic */ AnonymousClass7P9 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass63B(C133336hB r2, AnonymousClass7P9 r3, int i) {
        super(1);
        this.this$0 = r3;
        this.$category = r2;
        this.$index = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.this$0.A01.A0G(this.$category);
        AnonymousClass7P9 r0 = this.this$0;
        if (r0.A02.A00(r0.A06)) {
            C104795Sj r6 = this.this$0.A05;
            long j = ((long) this.$index) + 1;
            String str = this.$category.A01;
            C95074sa r4 = new C95074sa();
            r4.A01 = C18290x4.A0d();
            r4.A03 = C18290x4.A0Z();
            if (r6.A03.A0X(2828)) {
                r4.A0B = str;
                r4.A05 = Long.valueOf(j);
            }
            r6.A02(r4);
        }
        return C59022wD.A00;
    }
}

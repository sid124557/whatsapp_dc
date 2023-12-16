package X;

/* renamed from: X.3ha  reason: invalid class name and case insensitive filesystem */
public final class C74723ha extends C73893gF {
    public final /* synthetic */ Object $receiver$inlined;
    public final /* synthetic */ AnonymousClass4GR $this_createCoroutineUnintercepted$inlined;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74723ha(Object obj, C84814Du r2, AnonymousClass4GR r3) {
        super(r2);
        this.$this_createCoroutineUnintercepted$inlined = r3;
        this.$receiver$inlined = obj;
    }

    public Object A09(Object obj) {
        int i = this.label;
        if (i == 0) {
            this.label = 1;
            C57682u2.A01(obj);
            C162457s7.A0K(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
            AnonymousClass4GR r1 = this.$this_createCoroutineUnintercepted$inlined;
            AnonymousClass360.A03(r1, 2);
            return r1.invoke(this.$receiver$inlined, this);
        } else if (i == 1) {
            this.label = 2;
            C57682u2.A01(obj);
            return obj;
        } else {
            throw AnonymousClass001.A0e("This coroutine had already completed");
        }
    }
}

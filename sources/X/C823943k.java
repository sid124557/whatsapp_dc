package X;

/* renamed from: X.43k  reason: invalid class name and case insensitive filesystem */
public final class C823943k extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C72183dJ $callbackFuture;
    public final /* synthetic */ AnonymousClass47V this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C823943k(AnonymousClass47V r2, C72183dJ r3) {
        super(1);
        this.this$0 = r2;
        this.$callbackFuture = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C60802zB r6 = (C60802zB) obj;
        C162457s7.A0J(r6, 0);
        AnonymousClass47V r3 = this.this$0;
        C55682qk r2 = r3.A00;
        if (r2 != null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("GroupInfoBatchProcessor/FetchTruncatedGroupsJob/GetGroupInfo -\n                          | error; retry=");
            A0o.append(r3.parameters.retryCount);
            r2.A0A(AnonymousClass47V.A00(AnonymousClass001.A0j(A0o, ';')), false, r6.A01);
            this.$callbackFuture.BQr(new AnonymousClass24O());
            return C59022wD.A00;
        }
        throw C18270x1.A0S("crashLogs");
    }
}

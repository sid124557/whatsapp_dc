package X;

/* renamed from: X.447  reason: invalid class name */
public final class AnonymousClass447 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass4GQ $callback = null;
    public final /* synthetic */ String $token;
    public final /* synthetic */ C53852nm this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass447(C53852nm r2, String str) {
        super(1);
        this.this$0 = r2;
        this.$token = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C53852nm r2 = this.this$0;
        String str = this.$token;
        synchronized (r2) {
            r2.A07.remove(str);
        }
        AnonymousClass4GQ r1 = this.$callback;
        if (r1 != null) {
            r1.invoke(this.$token);
        }
        return C59022wD.A00;
    }
}

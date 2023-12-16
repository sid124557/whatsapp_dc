package X;

/* renamed from: X.8YZ  reason: invalid class name */
public final class AnonymousClass8YZ extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ String $webauthnJson;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8YZ(String str) {
        super(1);
        this.$webauthnJson = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C56052rL r3 = (C56052rL) obj;
        C162457s7.A0J(r3, 0);
        C56052rL r1 = new C56052rL("credential");
        r1.A0J(this.$webauthnJson);
        C56052rL.A07(r1, r3);
        return C59022wD.A00;
    }
}

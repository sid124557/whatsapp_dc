package X;

import org.json.JSONObject;

/* renamed from: X.8YF  reason: invalid class name */
public final class AnonymousClass8YF extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C160327nS this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8YF(C160327nS r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C185078t1 r4 = (C185078t1) obj;
        C162457s7.A0J(r4, 0);
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put("code", r4.B5a());
        A1G.put("detail", r4.B6z());
        A1G.put("category", r4.B5K());
        return C18290x4.A0o(A1G);
    }
}

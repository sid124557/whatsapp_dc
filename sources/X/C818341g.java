package X;

import org.json.JSONArray;

/* renamed from: X.41g  reason: invalid class name and case insensitive filesystem */
public final class C818341g extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ JSONArray $clientFiltersJSON;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C818341g(JSONArray jSONArray) {
        super(1);
        this.$clientFiltersJSON = jSONArray;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int A0K = AnonymousClass001.A0K(obj);
        String string = this.$clientFiltersJSON.getString(A0K);
        C162457s7.A0D(string);
        for (C371221a r1 : C371221a.values()) {
            if (C162457s7.A0P(r1.label, string)) {
                return r1;
            }
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Not a valid client filter: ");
        throw AnonymousClass000.A0F(this.$clientFiltersJSON.getString(A0K), A0o);
    }
}

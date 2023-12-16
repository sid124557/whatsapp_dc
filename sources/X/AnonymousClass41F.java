package X;

import org.json.JSONArray;

/* renamed from: X.41F  reason: invalid class name */
public final class AnonymousClass41F extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ JSONArray $this_toTypedArray;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass41F(JSONArray jSONArray) {
        super(1);
        this.$this_toTypedArray = jSONArray;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = this.$this_toTypedArray.get(AnonymousClass001.A0K(obj));
        if (obj2 != null) {
            return obj2;
        }
        throw AnonymousClass001.A0g("null cannot be cast to non-null type kotlin.String");
    }
}

package X;

import org.json.JSONObject;

/* renamed from: X.43O  reason: invalid class name */
public final class AnonymousClass43O extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ JSONObject $jsonObject;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass43O(JSONObject jSONObject) {
        super(1);
        this.$jsonObject = jSONObject;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        boolean z = true;
        if (AnonymousClass0x7.A06(str) <= 0 || !this.$jsonObject.has(str)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

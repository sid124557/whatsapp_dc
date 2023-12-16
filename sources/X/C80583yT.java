package X;

import android.os.Bundle;

/* renamed from: X.3yT  reason: invalid class name and case insensitive filesystem */
public final class C80583yT extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ String $key;
    public final /* synthetic */ C08310eF $this_nullableStringArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80583yT(C08310eF r2, String str) {
        super(0);
        this.$this_nullableStringArg = r2;
        this.$key = str;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Bundle bundle = this.$this_nullableStringArg.A06;
        if (bundle != null) {
            return bundle.getString(this.$key);
        }
        return null;
    }
}

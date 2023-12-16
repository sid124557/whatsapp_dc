package X;

import android.os.Bundle;

/* renamed from: X.3zp  reason: invalid class name and case insensitive filesystem */
public final class C81403zp extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ int $default;
    public final /* synthetic */ String $key;
    public final /* synthetic */ C08310eF $this_intArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81403zp(C08310eF r2, String str, int i) {
        super(0);
        this.$this_intArg = r2;
        this.$key = str;
        this.$default = i;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        int i;
        Bundle bundle = this.$this_intArg.A06;
        if (bundle != null) {
            i = bundle.getInt(this.$key, this.$default);
        } else {
            i = this.$default;
        }
        return Integer.valueOf(i);
    }
}

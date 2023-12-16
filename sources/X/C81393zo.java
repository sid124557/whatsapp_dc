package X;

import android.os.Bundle;

/* renamed from: X.3zo  reason: invalid class name and case insensitive filesystem */
public final class C81393zo extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ boolean $default = false;
    public final /* synthetic */ String $key;
    public final /* synthetic */ C08310eF $this_booleanArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81393zo(C08310eF r2, String str) {
        super(0);
        this.$this_booleanArg = r2;
        this.$key = str;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        boolean z;
        Bundle bundle = this.$this_booleanArg.A06;
        if (bundle != null) {
            z = bundle.getBoolean(this.$key, this.$default);
        } else {
            z = this.$default;
        }
        return Boolean.valueOf(z);
    }
}

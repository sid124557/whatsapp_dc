package X;

import android.os.Bundle;

/* renamed from: X.3zq  reason: invalid class name and case insensitive filesystem */
public final class C81413zq extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ long $default = 0;
    public final /* synthetic */ String $key;
    public final /* synthetic */ C08310eF $this_longArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81413zq(C08310eF r3, String str) {
        super(0);
        this.$this_longArg = r3;
        this.$key = str;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        long j;
        Bundle bundle = this.$this_longArg.A06;
        if (bundle != null) {
            j = bundle.getLong(this.$key, this.$default);
        } else {
            j = this.$default;
        }
        return Long.valueOf(j);
    }
}

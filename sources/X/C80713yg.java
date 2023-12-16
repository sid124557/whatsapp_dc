package X;

import android.os.Bundle;

/* renamed from: X.3yg  reason: invalid class name and case insensitive filesystem */
public final class C80713yg extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ String $key = "optional_messages";
    public final /* synthetic */ C08310eF $this_bundleArg;

    public /* bridge */ /* synthetic */ Object invoke() {
        Bundle bundle;
        Bundle bundle2 = this.$this_bundleArg.A06;
        if (bundle2 == null || (bundle = bundle2.getBundle(this.$key)) == null) {
            return AnonymousClass002.A08();
        }
        return bundle;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80713yg(C08310eF r2) {
        super(0);
        this.$this_bundleArg = r2;
    }
}

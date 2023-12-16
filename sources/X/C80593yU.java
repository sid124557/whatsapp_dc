package X;

import android.os.Bundle;

/* renamed from: X.3yU  reason: invalid class name and case insensitive filesystem */
public final class C80593yU extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ String $key;
    public final /* synthetic */ C08310eF $this_stringArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80593yU(C08310eF r2, String str) {
        super(0);
        this.$this_stringArg = r2;
        this.$key = str;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String string;
        Bundle bundle = this.$this_stringArg.A06;
        if (bundle != null && (string = bundle.getString(this.$key)) != null) {
            return string;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("No value for ");
        throw AnonymousClass0x2.A0V(this.$key, A0o);
    }
}

package X;

import android.os.Bundle;
import com.whatsapp.jid.Jid;

/* renamed from: X.3xt  reason: invalid class name and case insensitive filesystem */
public final class C80223xt extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ String $key = "cagJid";
    public final /* synthetic */ C08310eF $this_jidArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80223xt(C08310eF r2) {
        super(0);
        this.$this_jidArg = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String string;
        Bundle bundle = this.$this_jidArg.A06;
        if (bundle != null) {
            bundle.getString(this.$key);
        }
        Bundle bundle2 = this.$this_jidArg.A06;
        if (!(bundle2 == null || (string = bundle2.getString(this.$key)) == null)) {
            Jid A00 = AnonymousClass32W.A00(string);
            if ((A00 instanceof C27991fJ) && A00 != null) {
                return A00;
            }
        }
        throw C73193f5.A00;
    }
}

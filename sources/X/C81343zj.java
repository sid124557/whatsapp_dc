package X;

import android.os.Bundle;

/* renamed from: X.3zj  reason: invalid class name and case insensitive filesystem */
public final class C81343zj extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ Enum $default;
    public final /* synthetic */ String $key = "link_mode";
    public final /* synthetic */ C08310eF $this_enumArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81343zj(C08310eF r2, Enum enumR) {
        super(0);
        this.$this_enumArg = r2;
        this.$default = enumR;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String string;
        Object obj;
        Bundle bundle = this.$this_enumArg.A06;
        if (!(bundle == null || (string = bundle.getString(this.$key)) == null)) {
            try {
                obj = Enum.valueOf(C370220q.class, string);
            } catch (Throwable th) {
                obj = AnonymousClass3Z0.A01(th);
            }
            if (obj instanceof AnonymousClass3Z0) {
                obj = null;
            }
            if (obj != null) {
                return obj;
            }
        }
        return this.$default;
    }
}

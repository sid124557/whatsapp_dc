package X;

import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: X.3xY  reason: invalid class name and case insensitive filesystem */
public final class C80013xY extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ String $key = "call_log_message_key";
    public final /* synthetic */ C08310eF $this_parcelableArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80013xY(C08310eF r2) {
        super(0);
        this.$this_parcelableArg = r2;
    }

    public final Object invoke() {
        Parcelable parcelable;
        boolean A0A = C107385bE.A0A();
        Bundle bundle = this.$this_parcelableArg.A06;
        if (!A0A) {
            if (bundle != null) {
                parcelable = bundle.getParcelable(this.$key);
            } else {
                parcelable = null;
            }
            if (parcelable instanceof AnonymousClass39J) {
                return parcelable;
            }
            return null;
        } else if (bundle == null) {
            return null;
        } else {
            return C02810Hr.A00(bundle, AnonymousClass39J.class, this.$key);
        }
    }
}

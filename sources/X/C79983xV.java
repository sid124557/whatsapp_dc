package X;

import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.3xV  reason: invalid class name and case insensitive filesystem */
public final class C79983xV extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass4GP $inFeatureCallback;
    public final /* synthetic */ C50192hm this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79983xV(C50192hm r2, AnonymousClass4GP r3) {
        super(0);
        this.this$0 = r2;
        this.$inFeatureCallback = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C50192hm r4 = this.this$0;
        AnonymousClass4GP r3 = this.$inFeatureCallback;
        int ordinal = r4.A04.A01().ordinal();
        if (ordinal == 0) {
            Log.e("bonsaionboarding/waitlist/requested/can't be before waitlist after requesting");
        } else if (ordinal == 1) {
            r4.A00.A0H(R.string.f11nameremoved, 0);
        } else if (ordinal == 2) {
            r4.A00.A0H(R.string.f11nameremoved, 0);
            r3.invoke();
        }
        return C59022wD.A00;
    }
}

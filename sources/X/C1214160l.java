package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.community.communityInfo.CAGInfoFragment;

/* renamed from: X.60l  reason: invalid class name and case insensitive filesystem */
public final class C1214160l extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ CAGInfoFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1214160l(CAGInfoFragment cAGInfoFragment) {
        super(1);
        this.this$0 = cAGInfoFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass66R r2 = this.this$0.A0B;
        if (!(!((C89654ea) r2.getValue()).A0E)) {
            Intent A00 = C627736r.A00(((Context) r2.getValue()).getApplicationContext());
            C162457s7.A0D(A00);
            ((Context) r2.getValue()).startActivity(A00);
        }
        return C59022wD.A00;
    }
}

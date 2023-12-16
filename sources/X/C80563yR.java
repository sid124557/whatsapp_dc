package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: X.3yR  reason: invalid class name and case insensitive filesystem */
public final class C80563yR extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ String $key = "EXTRA_SAVE_STATE_BUNDLE";
    public final /* synthetic */ Activity $this_bundleArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80563yR(Activity activity) {
        super(0);
        this.$this_bundleArg = activity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Bundle bundleExtra;
        Intent intent = this.$this_bundleArg.getIntent();
        if (intent == null || (bundleExtra = intent.getBundleExtra(this.$key)) == null) {
            return AnonymousClass002.A08();
        }
        return bundleExtra;
    }
}

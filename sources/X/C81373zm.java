package X;

import android.app.Activity;
import android.content.Intent;

/* renamed from: X.3zm  reason: invalid class name and case insensitive filesystem */
public final class C81373zm extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ boolean $default = false;
    public final /* synthetic */ String $key = "is_cag_and_community_add";
    public final /* synthetic */ Activity $this_booleanArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81373zm(Activity activity) {
        super(0);
        this.$this_booleanArg = activity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        boolean z;
        Intent intent = this.$this_booleanArg.getIntent();
        if (intent != null) {
            z = intent.getBooleanExtra(this.$key, this.$default);
        } else {
            z = this.$default;
        }
        return Boolean.valueOf(z);
    }
}

package X;

import android.app.Activity;
import android.content.Intent;

/* renamed from: X.3zn  reason: invalid class name and case insensitive filesystem */
public final class C81383zn extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ int $default;
    public final /* synthetic */ String $key;
    public final /* synthetic */ Activity $this_intArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81383zn(Activity activity, String str, int i) {
        super(0);
        this.$this_intArg = activity;
        this.$key = str;
        this.$default = i;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        int i;
        Intent intent = this.$this_intArg.getIntent();
        if (intent != null) {
            i = intent.getIntExtra(this.$key, this.$default);
        } else {
            i = this.$default;
        }
        return Integer.valueOf(i);
    }
}

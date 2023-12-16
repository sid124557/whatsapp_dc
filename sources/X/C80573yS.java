package X;

import android.app.Activity;
import android.content.Intent;

/* renamed from: X.3yS  reason: invalid class name and case insensitive filesystem */
public final class C80573yS extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ String $key;
    public final /* synthetic */ Activity $this_stringArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80573yS(Activity activity, String str) {
        super(0);
        this.$this_stringArg = activity;
        this.$key = str;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String stringExtra;
        Intent intent = this.$this_stringArg.getIntent();
        if (intent != null && (stringExtra = intent.getStringExtra(this.$key)) != null) {
            return stringExtra;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("No value for ");
        throw AnonymousClass0x2.A0V(this.$key, A0o);
    }
}

package X;

import android.app.Activity;
import android.content.Intent;
import com.whatsapp.jid.Jid;

/* renamed from: X.3xn  reason: invalid class name and case insensitive filesystem */
public final class C80163xn extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ String $key = "chat_jid";
    public final /* synthetic */ Activity $this_jidArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80163xn(Activity activity) {
        super(0);
        this.$this_jidArg = activity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String stringExtra;
        Intent intent = this.$this_jidArg.getIntent();
        if (intent != null) {
            intent.getStringExtra(this.$key);
        }
        Intent intent2 = this.$this_jidArg.getIntent();
        if (!(intent2 == null || (stringExtra = intent2.getStringExtra(this.$key)) == null)) {
            Jid A00 = AnonymousClass32W.A00(stringExtra);
            if ((A00 instanceof C95814uZ) && A00 != null) {
                return A00;
            }
        }
        throw C73193f5.A00;
    }
}

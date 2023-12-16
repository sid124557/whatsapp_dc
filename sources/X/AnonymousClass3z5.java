package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;

/* renamed from: X.3z5  reason: invalid class name */
public final class AnonymousClass3z5 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ String $key = "appeal-request";
    public final /* synthetic */ Activity $this_parcelableArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3z5(Activity activity) {
        super(0);
        this.$this_parcelableArg = activity;
    }

    public final Object invoke() {
        Parcelable parcelable;
        boolean A0A = C107385bE.A0A();
        Intent intent = this.$this_parcelableArg.getIntent();
        if (!A0A) {
            if (intent != null) {
                parcelable = intent.getParcelableExtra(this.$key);
            } else {
                parcelable = null;
            }
            if (parcelable instanceof AnonymousClass38S) {
                return parcelable;
            }
            return null;
        } else if (intent != null) {
            return intent.getParcelableExtra(this.$key, AnonymousClass38S.class);
        } else {
            return null;
        }
    }
}

package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;

/* renamed from: X.3z9  reason: invalid class name and case insensitive filesystem */
public final class C80983z9 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ String $key = "newsletter-appeal-data";
    public final /* synthetic */ Activity $this_parcelableArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80983z9(Activity activity) {
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
            if (parcelable instanceof AnonymousClass38T) {
                return parcelable;
            }
            return null;
        } else if (intent != null) {
            return intent.getParcelableExtra(this.$key, AnonymousClass38T.class);
        } else {
            return null;
        }
    }
}

package androidx.viewpager2.adapter;

import X.AnonymousClass09I;
import X.AnonymousClass0GH;
import X.C15910sA;
import X.C17280vG;
import android.os.Handler;

public class FragmentStateAdapter$5 implements C17280vG {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ AnonymousClass09I A01;
    public final /* synthetic */ Runnable A02;

    public FragmentStateAdapter$5(Handler handler, AnonymousClass09I r2, Runnable runnable) {
        this.A01 = r2;
        this.A00 = handler;
        this.A02 = runnable;
    }

    public void BcK(AnonymousClass0GH r3, C15910sA r4) {
        if (r3 == AnonymousClass0GH.ON_DESTROY) {
            this.A00.removeCallbacks(this.A02);
            r4.getLifecycle().A01(this);
        }
    }
}

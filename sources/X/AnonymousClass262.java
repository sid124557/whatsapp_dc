package X;

import com.whatsapp.expressionstray.ExpressionsSearchViewModel;
import com.whatsapp.expressionstray.ExpressionsSearchViewModel$onGifSelected$1;
import com.whatsapp.expressionstray.gifs.GifExpressionsFragment;
import com.whatsapp.expressionstray.gifs.GifExpressionsSearchViewModel;
import com.whatsapp.expressionstray.gifs.GifExpressionsSearchViewModel$onGifSelected$1;

/* renamed from: X.262  reason: invalid class name */
public class AnonymousClass262 implements AnonymousClass4AK {
    public Object A00;
    public final int A01;

    public AnonymousClass262(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BU5(C166177yG r5) {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            C162457s7.A0J(r5, 1);
            AnonymousClass4AK r0 = ((AnonymousClass123) obj).A01;
            if (r0 != null) {
                r0.BU5(r5);
                return;
            }
            return;
        }
        GifExpressionsFragment gifExpressionsFragment = (GifExpressionsFragment) obj;
        C162457s7.A0J(r5, 1);
        ExpressionsSearchViewModel expressionsSearchViewModel = gifExpressionsFragment.A05;
        if (expressionsSearchViewModel != null) {
            C616131n.A02((C85494Gl) null, new ExpressionsSearchViewModel$onGifSelected$1(expressionsSearchViewModel, r5, (C84814Du) null), AnonymousClass0IV.A00(expressionsSearchViewModel), (AnonymousClass20D) null, 3);
            return;
        }
        GifExpressionsSearchViewModel gifExpressionsSearchViewModel = (GifExpressionsSearchViewModel) gifExpressionsFragment.A0B.getValue();
        C616131n.A02((C85494Gl) null, new GifExpressionsSearchViewModel$onGifSelected$1(gifExpressionsSearchViewModel, r5, (C84814Du) null), AnonymousClass0IV.A00(gifExpressionsSearchViewModel), (AnonymousClass20D) null, 3);
    }
}

package X;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Callable;

/* renamed from: X.0nQ  reason: invalid class name and case insensitive filesystem */
public class C13590nQ implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ LottieAnimationView A01;

    public C13590nQ(LottieAnimationView lottieAnimationView, int i) {
        this.A01 = lottieAnimationView;
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ Object call() {
        String str;
        String str2;
        LottieAnimationView lottieAnimationView = this.A01;
        boolean z = lottieAnimationView.A09;
        Context context = lottieAnimationView.getContext();
        int i = this.A00;
        if (z) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("rawRes");
            if ((AnonymousClass001.A0M(context).uiMode & 48) == 32) {
                str2 = "_night_";
            } else {
                str2 = "_day_";
            }
            str = AnonymousClass000.A0Y(str2, A0o, i);
        } else {
            str = null;
        }
        return AnonymousClass0YR.A00(context, str, i);
    }
}

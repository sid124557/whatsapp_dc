package X;

import android.content.Context;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.airbnb.lottie.LottieAnimationView;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* renamed from: X.0wP  reason: invalid class name and case insensitive filesystem */
public class C17890wP implements Callable {
    public Object A00;
    public String A01;
    public final int A02;

    public C17890wP(int i, String str, Object obj) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    public /* bridge */ /* synthetic */ Object call() {
        String str;
        switch (this.A02) {
            case 0:
                return ((ShortcutInfoCompatSaverImpl) this.A00).A04.get(this.A01);
            case 1:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.A00;
                boolean z = lottieAnimationView.A09;
                Context context = lottieAnimationView.getContext();
                String str2 = this.A01;
                if (z) {
                    str = AnonymousClass000.A0V("asset_", str2, AnonymousClass001.A0o());
                } else {
                    str = null;
                }
                return AnonymousClass0YR.A01(context, str2, str);
            default:
                return AnonymousClass0YR.A03((InputStream) this.A00, this.A01);
        }
    }
}

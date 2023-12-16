package X;

import android.graphics.drawable.Drawable;
import com.whatsapp.settings.chat.wallpaper.WallPaperView;

/* renamed from: X.5lD  reason: invalid class name and case insensitive filesystem */
public class C113305lD implements C185068t0 {
    public final /* synthetic */ C89874fQ A00;
    public final /* synthetic */ WallPaperView A01;
    public final /* synthetic */ Runnable A02;

    public C113305lD(C89874fQ r1, WallPaperView wallPaperView, Runnable runnable) {
        this.A00 = r1;
        this.A02 = runnable;
        this.A01 = wallPaperView;
    }

    public void Ayu() {
        C86644Kx.A1N(this.A01);
    }

    public void Bnq(Drawable drawable) {
        this.A00.A00(drawable);
    }

    public void BsS() {
        this.A02.run();
    }
}

package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.TranslateAnimation;
import java.io.File;

/* renamed from: X.6BH  reason: invalid class name */
public class AnonymousClass6BH implements ViewTreeObserver.OnGlobalLayoutListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public final int A04 = 1;

    public AnonymousClass6BH(AnonymousClass5ZQ r2, C116635qb r3, File file) {
        this.A00 = r3;
        this.A02 = file;
        this.A01 = r2;
        this.A03 = true;
    }

    public final void onGlobalLayout() {
        if (this.A04 != 0) {
            C116635qb r3 = (C116635qb) this.A00;
            double floor = Math.floor((double) (AnonymousClass4L0.A00(r3.A03) / r3.A03.A0D));
            if (floor != 0.0d || !this.A03) {
                this.A03 = true;
                C86604Kt.A1G(r3.A0J.A04(), this);
                r3.A0K.BkP(new C70443aV(this, (AnonymousClass5ZQ) this.A01, (File) this.A02, floor));
                return;
            }
            this.A03 = false;
            return;
        }
        View view = (View) this.A01;
        Object obj = this.A02;
        boolean z = this.A03;
        C113245l7 r32 = ((C88784an) this.A00).A03;
        Drawable background = r32.A2c.A02.getBackground();
        C162457s7.A0D(background);
        if (background instanceof AnonymousClass4M8) {
            AnonymousClass5KV r2 = r32.A2c;
            Drawable drawable = ((AnonymousClass4M8) background).A01;
            C162457s7.A0J(drawable, 0);
            AnonymousClass4M8.A00(drawable, r2.A02);
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(0);
        view.startAnimation(translateAnimation);
        if (obj == r32.A0a && r32.A0W.getVisibility() == 0) {
            r32.A0W.startAnimation(translateAnimation);
        }
        if (r32.A4P.A0L) {
            r32.A0c.startAnimation(translateAnimation);
        }
        if (z) {
            r32.A2f.startAnimation(translateAnimation);
        }
        r32.A05 = 0;
        if (obj == r32.A0a && C113245l7.A0E(r32).A0Y(C58422vE.A01, 3255)) {
            r32.A0a.removeAllViews();
            r32.A2p = null;
        }
    }

    public AnonymousClass6BH(View view, ViewGroup viewGroup, C88784an r4, boolean z) {
        this.A00 = r4;
        this.A01 = view;
        this.A02 = viewGroup;
        this.A03 = z;
    }
}

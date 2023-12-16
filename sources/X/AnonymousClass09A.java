package X;

import android.animation.Animator;
import android.view.View;
import java.util.List;

/* renamed from: X.09A  reason: invalid class name */
public class AnonymousClass09A extends C06580Yj {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass09T A01;
    public final /* synthetic */ C05570Ua A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass09A(AnonymousClass09T r9, C05570Ua r10, C05570Ua r11, float f, float f2, float f3, float f4, int i, int i2) {
        super(r10, f, f2, f3, f4, i);
        this.A01 = r9;
        this.A00 = i2;
        this.A02 = r11;
    }

    public void onAnimationEnd(Animator animator) {
        C05570Ua r2;
        super.onAnimationEnd(animator);
        if (!this.A05) {
            int i = this.A00;
            AnonymousClass09T r3 = this.A01;
            if (i <= 0) {
                r2 = this.A02;
                AnonymousClass0WG.A00(r2);
            } else {
                List list = r3.A0Q;
                r2 = this.A02;
                list.add(r2.A0H);
                this.A04 = true;
                r3.A0K.post(new C11940ki(this, r3));
            }
            View view = r3.A0F;
            View view2 = r2.A0H;
            if (view == view2 && view2 == view) {
                r3.A0F = null;
            }
        }
    }
}

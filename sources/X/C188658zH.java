package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;

/* renamed from: X.8zH  reason: invalid class name and case insensitive filesystem */
public class C188658zH extends AnimatorListenerAdapter {
    public Object A00;
    public Object A01;
    public final int A02;

    public C188658zH(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.A02) {
            case 0:
                ((View) this.A01).setVisibility(4);
                return;
            case 1:
                super.onAnimationEnd(animator);
                ((C151687Vx) this.A01).A01();
                return;
            case 2:
                C149917Ok r2 = (C149917Ok) this.A00;
                ValueAnimator valueAnimator = r2.A03;
                if (!valueAnimator.isRunning() && r2.A05) {
                    valueAnimator.start();
                    return;
                }
                return;
            case 3:
                AnonymousClass4NZ r22 = (AnonymousClass4NZ) this.A00;
                if (r22.A09 < 0.15f) {
                    r22.A03();
                }
                Runnable runnable = (Runnable) this.A01;
                if (runnable != null) {
                    r22.post(runnable);
                    return;
                }
                return;
            default:
                AnonymousClass4NZ r1 = (AnonymousClass4NZ) this.A00;
                r1.A00();
                r1.post((Runnable) this.A01);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.A02) {
            case 1:
                super.onAnimationStart(animator);
                C151687Vx r1 = (C151687Vx) this.A01;
                r1.A01 = true;
                r1.A00 = -1.0f;
                return;
            case 2:
                AnonymousClass7LC r0 = (AnonymousClass7LC) this.A01;
                Handler handler = r0.A00;
                if (handler == null) {
                    handler = AnonymousClass000.A0A();
                    r0.A00 = handler;
                }
                handler.post(r0.A01);
                return;
            case 3:
                AnonymousClass4NZ r12 = (AnonymousClass4NZ) this.A00;
                r12.setVisibility(0);
                r12.A0f = true;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}

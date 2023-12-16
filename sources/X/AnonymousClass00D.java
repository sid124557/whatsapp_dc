package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.00D  reason: invalid class name */
public class AnonymousClass00D extends AnimatorListenerAdapter {
    public Matrix A00 = AnonymousClass002.A05();
    public boolean A01;
    public final /* synthetic */ Matrix A02;
    public final /* synthetic */ View A03;
    public final /* synthetic */ C04220Nh A04;
    public final /* synthetic */ C04630Px A05;
    public final /* synthetic */ AnonymousClass0AA A06;
    public final /* synthetic */ boolean A07;

    public void onAnimationCancel(Animator animator) {
        this.A01 = true;
    }

    public AnonymousClass00D(Matrix matrix, View view, C04220Nh r4, C04630Px r5, AnonymousClass0AA r6, boolean z) {
        this.A06 = r6;
        this.A07 = z;
        this.A02 = matrix;
        this.A03 = view;
        this.A05 = r5;
        this.A04 = r4;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.A01) {
            if (this.A07) {
                Matrix matrix = this.A02;
                Matrix matrix2 = this.A00;
                matrix2.set(matrix);
                View view = this.A03;
                view.setTag(R.id.transition_transform, matrix2);
                this.A05.A00(view);
            } else {
                View view2 = this.A03;
                view2.setTag(R.id.transition_transform, (Object) null);
                view2.setTag(R.id.parent_matrix, (Object) null);
            }
        }
        View view3 = this.A03;
        AnonymousClass0VZ.A02.A01((Matrix) null, view3);
        this.A05.A00(view3);
    }

    public void onAnimationPause(Animator animator) {
        Matrix matrix = this.A04.A02;
        Matrix matrix2 = this.A00;
        matrix2.set(matrix);
        View view = this.A03;
        view.setTag(R.id.transition_transform, matrix2);
        this.A05.A00(view);
    }

    public void onAnimationResume(Animator animator) {
        View view = this.A03;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        AnonymousClass0YZ.A0C(view, 0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setRotation(0.0f);
    }
}

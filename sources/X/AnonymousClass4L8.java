package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.SharedPreferences;
import android.view.View;

/* renamed from: X.4L8  reason: invalid class name */
public final class AnonymousClass4L8 extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C104365Qr A01;
    public final /* synthetic */ C69873Yv A02;

    public void onAnimationEnd(Animator animator) {
        SharedPreferences.Editor putInt;
        C162457s7.A0J(animator, 0);
        super.onAnimationEnd(animator);
        View view = this.A00;
        view.getLayoutParams().height = C104365Qr.A09;
        view.requestLayout();
        if (this.A02.element) {
            C116765qp r1 = (C116765qp) this.A01.A08.getValue();
            AnonymousClass66R r7 = r1.A02;
            SharedPreferences A0F = C18310x6.A0F(r7);
            C162457s7.A0D(A0F);
            SharedPreferences.Editor edit = A0F.edit();
            C162457s7.A0D(edit);
            if (!r1.A00()) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("should not occur: ");
                A0o.append(C18310x6.A0F(r7).getInt("shown", 3));
                A0o.append(' ');
                A0o.append(C18310x6.A0F(r7).getInt("left", 3));
                A0o.append(' ');
                A0o.append(C18310x6.A0F(r7).getLong("ts", -C116765qp.A03));
                C18270x1.A0z(A0o);
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                SharedPreferences A0F2 = C18310x6.A0F(r7);
                long j = C116765qp.A03;
                if (currentTimeMillis - A0F2.getLong("ts", -j) >= j || C18310x6.A0F(r7).getInt("shown", 3) >= 3) {
                    edit.putInt("left", C18310x6.A0F(r7).getInt("left", 3) - 1);
                    putInt = edit.putInt("shown", 1);
                } else {
                    putInt = edit.putInt("shown", C86664Kz.A08(C18310x6.A0F(r7), "shown", 3));
                }
                C162457s7.A0D(putInt);
                C162457s7.A0D(edit.putLong("ts", System.currentTimeMillis()));
            }
            edit.apply();
        }
    }

    public void onAnimationStart(Animator animator) {
        C162457s7.A0J(animator, 0);
        super.onAnimationStart(animator);
        this.A00.setVisibility(0);
    }

    public AnonymousClass4L8(View view, C104365Qr r2, C69873Yv r3) {
        this.A00 = view;
        this.A02 = r3;
        this.A01 = r2;
    }
}

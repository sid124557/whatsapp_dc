package X;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

/* renamed from: X.8JN  reason: invalid class name */
public final class AnonymousClass8JN implements C185508tn {
    public int A00;
    public int A01 = 1;
    public final FrameLayout A02;
    public final WaImageView A03;
    public final WaImageView A04;

    public AnonymousClass8JN(FrameLayout frameLayout) {
        this.A02 = frameLayout;
        WaImageView waImageView = new WaImageView(frameLayout.getContext());
        int i = C1001059l.A04 ? R.drawable.input_mic_white_filled_wds : R.drawable.input_mic_white;
        waImageView.setVisibility(8);
        waImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        waImageView.setImageResource(i);
        frameLayout.addView(waImageView);
        this.A04 = waImageView;
        WaImageView waImageView2 = new WaImageView(frameLayout.getContext());
        int i2 = C1001059l.A04 ? R.drawable.input_camera_white_filled_wds : R.drawable.input_camera_white;
        waImageView2.setVisibility(8);
        waImageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        waImageView2.setImageResource(i2);
        frameLayout.addView(waImageView2);
        this.A03 = waImageView2;
        this.A00 = R.color.f5nameremoved;
        A00();
        BJU(1);
    }

    public final void A00() {
        WaImageView waImageView = this.A04;
        int i = this.A00;
        Drawable mutate = waImageView.getDrawable().mutate();
        C162457s7.A0D(mutate);
        mutate.setTint(i);
        waImageView.setImageDrawable(mutate);
        WaImageView waImageView2 = this.A03;
        int i2 = this.A00;
        Drawable mutate2 = waImageView2.getDrawable().mutate();
        C162457s7.A0D(mutate2);
        mutate2.setTint(i2);
        waImageView2.setImageDrawable(mutate2);
    }

    public void BJU(int i) {
        WaImageView waImageView;
        WaImageView waImageView2;
        this.A01 = i;
        if (i == 1) {
            waImageView = this.A04;
        } else {
            waImageView = this.A03;
            if (i != 1) {
                waImageView2 = this.A04;
                waImageView2.setVisibility(8);
                waImageView2.clearAnimation();
                waImageView.setVisibility(0);
                waImageView.clearAnimation();
            }
        }
        waImageView2 = this.A03;
        waImageView2.setVisibility(8);
        waImageView2.clearAnimation();
        waImageView.setVisibility(0);
        waImageView.clearAnimation();
    }

    public void Bgt(int i) {
        WaImageView waImageView;
        WaImageView waImageView2;
        if (i != this.A01) {
            this.A01 = i;
            if (i == 1) {
                waImageView = this.A04;
            } else {
                waImageView = this.A03;
                if (i != 1) {
                    waImageView2 = this.A04;
                    waImageView2.setVisibility(8);
                    waImageView2.startAnimation(AnonymousClass74J.A00(true));
                    waImageView.setVisibility(0);
                    waImageView.startAnimation(AnonymousClass74J.A00(false));
                }
            }
            waImageView2 = this.A03;
            waImageView2.setVisibility(8);
            waImageView2.startAnimation(AnonymousClass74J.A00(true));
            waImageView.setVisibility(0);
            waImageView.startAnimation(AnonymousClass74J.A00(false));
        }
    }

    public int getTint() {
        return this.A00;
    }

    public void setTint(int i) {
        this.A00 = i;
        A00();
    }
}

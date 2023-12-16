package X;

import android.view.animation.Animation;
import com.whatsapp.QrImageView;

/* renamed from: X.7zi  reason: invalid class name and case insensitive filesystem */
public class C167067zi implements Animation.AnimationListener {
    public final /* synthetic */ C181608n2 A00;
    public final /* synthetic */ QrImageView A01;

    public C167067zi(C181608n2 r1, QrImageView qrImageView) {
        this.A01 = qrImageView;
        this.A00 = r1;
    }

    public void onAnimationEnd(Animation animation) {
        this.A00.BPW(this.A01);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}

package X;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.4fq  reason: invalid class name and case insensitive filesystem */
public abstract class C90104fq extends C111265ho {
    public final FrameLayout A00;

    public int A00(C833748d r3, boolean z) {
        if (C162457s7.A0P(((AnonymousClass3YL) r3).A0G, "whatsapp_banner_privacy_tip")) {
            return AnonymousClass0Y8.A04(this.A00.getContext(), R.color.f5nameremoved);
        }
        return super.A00(r3, z);
    }

    public void A02(AnonymousClass5K6 r6, AnonymousClass5K7 r7, C833748d r8) {
        C162457s7.A0J(r7, 0);
        super.A02(r6, r7, r8);
        if (r8 != null) {
            r7.A05.setVisibility(8);
            r7.A00.setBackgroundResource(R.drawable.banner_with_rounded_corners);
            r7.A01.getLayoutParams().height = -2;
            if (C162457s7.A0P(((AnonymousClass3YL) r8).A0G, "whatsapp_banner_privacy_tip")) {
                if (!this.A01) {
                    r7.A02.setImageResource(R.drawable.vec_ic_tips_v2);
                }
                ImageView imageView = r7.A02;
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                FrameLayout frameLayout = this.A00;
                layoutParams.height = frameLayout.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
                imageView.getLayoutParams().width = C86614Ku.A05(frameLayout, R.dimen.f6nameremoved);
                imageView.setImageTintList(AnonymousClass0Y8.A07(imageView.getContext(), R.color.f5nameremoved));
            }
        }
    }

    public C90104fq(FrameLayout frameLayout, AnonymousClass5S3 r4, AnonymousClass5HH r5, AnonymousClass1VX r6, AnonymousClass4FS r7) {
        super(frameLayout, r4, r5, r6, r7);
        this.A00 = frameLayout;
        r4.A00.A0X(3712);
    }
}

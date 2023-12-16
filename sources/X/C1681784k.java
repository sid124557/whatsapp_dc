package X;

import android.content.Context;
import android.view.View;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.84k  reason: invalid class name and case insensitive filesystem */
public class C1681784k implements C185318tS {
    public final AnonymousClass84O A00;

    public /* bridge */ /* synthetic */ Object Axn(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        AnonymousClass84O r3 = this.A00;
        view.setScaleX(r3.A0B(136, 1.0f));
        view.setScaleY(r3.A0B(137, 1.0f));
        view.setTranslationX(r3.A0B(MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT, 0.0f));
        view.setTranslationY(r3.A0B(145, 0.0f));
        view.setRotation(r3.A0B(138, 0.0f));
        view.setAlpha(r3.A0B(141, 1.0f));
        return null;
    }

    public /* bridge */ /* synthetic */ void BrF(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        View view = (View) obj;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setRotation(0.0f);
        view.setAlpha(1.0f);
    }

    public C1681784k(AnonymousClass84O r1) {
        this.A00 = r1;
    }

    public /* synthetic */ String B6x() {
        return C1443371d.A01(this);
    }

    public /* bridge */ /* synthetic */ boolean Bob(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}

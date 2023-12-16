package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import com.whatsapp.R;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5Wl  reason: invalid class name and case insensitive filesystem */
public final class C105795Wl {
    public static final long A08 = C86654Ky.A09(TimeUnit.DAYS);
    public static final long A09 = TimeUnit.SECONDS.toMillis(2);
    public final AnimatorSet A00;
    public final Paint A01 = C86664Kz.A0a(1);
    public final BitmapDrawable A02;
    public final ImageView A03;
    public final C69263Wi A04;
    public final C380625j A05;
    public final AnonymousClass33p A06;
    public final AnonymousClass4FS A07;

    public C105795Wl(ImageView imageView, C69263Wi r15, C380625j r16, AnonymousClass33p r17, AnonymousClass4FS r18) {
        BitmapDrawable A0E;
        BitmapDrawable A0E2;
        AnonymousClass4FS r2 = r18;
        int A052 = C18300x5.A05(r15, r2, 1);
        C380625j r4 = r16;
        AnonymousClass33p r3 = r17;
        C18260x0.A0b(imageView, r4, r3, 3);
        this.A04 = r15;
        this.A07 = r2;
        this.A03 = imageView;
        this.A05 = r4;
        this.A06 = r3;
        Context context = imageView.getContext();
        boolean z = C1001059l.A04;
        Drawable A0G = C18310x6.A0G(context, z ? R.drawable.ic_text_status_compose_filled_wds : R.drawable.ic_text_status_compose);
        if (A0G instanceof BitmapDrawable) {
            A0E = (BitmapDrawable) A0G;
        } else {
            A0E = C86654Ky.A0E(context, C107335b8.A00(A0G));
        }
        C162457s7.A0D(A0E);
        this.A02 = A0E;
        Drawable A0G2 = C18310x6.A0G(context, z ? R.drawable.input_mic_white_filled_wds : R.drawable.input_mic_white);
        if (A0G2 instanceof BitmapDrawable) {
            A0E2 = (BitmapDrawable) A0G2;
        } else {
            A0E2 = C86654Ky.A0E(context, C107335b8.A00(A0G2));
        }
        C162457s7.A0D(A0E2);
        PathInterpolator A002 = C05030Rp.A00(0.3f, 0.0f, 0.25f, 2.0f);
        float[] fArr = new float[A052];
        fArr[0] = 1.0f;
        ValueAnimator A0P = C86664Kz.A0P(fArr, 0.0f);
        A0P.setStartDelay(800);
        A0P.setDuration(500);
        A0P.setInterpolator(A002);
        A0P.addUpdateListener(new C107795bu(A0E, A0E2, this));
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        long j = A09;
        float[] fArr2 = new float[A052];
        fArr2[0] = 1.0f;
        ValueAnimator A0P2 = C86664Kz.A0P(fArr2, 0.0f);
        if (j > 0) {
            A0P2.setStartDelay(j);
        }
        A0P2.setDuration(350);
        A0P2.setInterpolator(accelerateDecelerateInterpolator);
        A0P2.addUpdateListener(new C107795bu(A0E2, A0E, this));
        AnimatorSet A0O = C86664Kz.A0O();
        this.A00 = A0O;
        Animator[] animatorArr = new Animator[A052];
        AnonymousClass001.A1I(A0P, A0P2, animatorArr);
        A0O.playSequentially(animatorArr);
    }

    public final void A00() {
        this.A00.cancel();
        ImageView imageView = this.A03;
        imageView.setImageDrawable(this.A02);
        long currentTimeMillis = System.currentTimeMillis();
        AnonymousClass33p r4 = this.A06;
        C183538qC r6 = r4.A01;
        if (currentTimeMillis - AnonymousClass0x2.A0B(C18300x5.A0B(r6), "text_to_voice_animation_timestamp") >= A08 && C18280x3.A02(C18300x5.A0B(r6), "text_to_voice_animation_play_times_key") < 10) {
            C18260x0.A0M(r4, "text_to_voice_animation_timestamp", System.currentTimeMillis());
            C18270x1.A03(r4).putInt("text_to_voice_animation_play_times_key", C18280x3.A02(C18300x5.A0B(r6), "text_to_voice_animation_play_times_key") + 1);
            AnonymousClass691.A00(imageView, this, 11);
        }
    }
}

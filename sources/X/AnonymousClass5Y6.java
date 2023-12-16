package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import java.util.HashMap;

/* renamed from: X.5Y6  reason: invalid class name */
public class AnonymousClass5Y6 {
    public static final Interpolator A0M = C05030Rp.A00(0.33f, 1.0f, 0.68f, 1.0f);
    public static final HashMap A0N;
    public static final HashMap A0O = AnonymousClass001.A0t();
    public int A00 = 0;
    public int A01;
    public int A02 = 0;
    public Animation A03;
    public Animation A04;
    public CircularProgressBar A05;
    public AnonymousClass7KW A06;
    public boolean A07 = false;
    public boolean A08;
    public final Context A09;
    public final View A0A;
    public final View A0B;
    public final View A0C;
    public final TextView A0D;
    public final TextView A0E;
    public final WaImageView A0F;
    public final WaImageView A0G;
    public final WaImageView A0H;
    public final WaImageView A0I;
    public final WaImageView A0J;
    public final AnonymousClass678 A0K;
    public final boolean A0L;

    public void A00() {
        WaImageView waImageView = this.A0I;
        waImageView.setActivated(false);
        waImageView.clearAnimation();
        Context context = this.A09;
        float A012 = C86664Kz.A01(context.getResources(), R.dimen.f6nameremoved);
        float f = 1.0f;
        if (this.A08) {
            f = 0.6f;
        }
        int i = (int) (A012 / f);
        waImageView.setPadding(i, i, i, i);
        CircularProgressBar circularProgressBar = this.A05;
        if (circularProgressBar != null) {
            circularProgressBar.clearAnimation();
            circularProgressBar.setProgress(0);
            circularProgressBar.A09 = AnonymousClass0Y8.A04(context, R.color.f5nameremoved);
            circularProgressBar.requestLayout();
        }
    }

    public final void A01() {
        AnonymousClass678 r2 = this.A0K;
        if (r2.getFlashModes().size() <= 1) {
            this.A0G.setVisibility(8);
            return;
        }
        this.A0G.setVisibility(0);
        A04(r2.getFlashMode());
    }

    public final void A02(float f, float f2) {
        this.A0I.setActivated(true);
        ScaleAnimation A0Q = C86634Kw.A0Q(f, f2);
        A0Q.setDuration(220);
        A0Q.setInterpolator(A0M);
        A0Q.setFillAfter(true);
        CircularProgressBar circularProgressBar = this.A05;
        if (circularProgressBar != null) {
            circularProgressBar.A06 = f2 * 8.0f;
            circularProgressBar.A09 = AnonymousClass0Y8.A04(this.A09, R.color.f5nameremoved);
            circularProgressBar.startAnimation(A0Q);
        }
    }

    public final void A03(float f, float f2, boolean z) {
        this.A0I.setActivated(z);
        ValueAnimator A0P = C86664Kz.A0P(C86654Ky.A1b(f), f2);
        A0P.setDuration(220);
        A0P.setInterpolator(A0M);
        C86604Kt.A0w(A0P, this, 17);
        A0P.start();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0079, code lost:
        if (r0 == false) goto L_0x007b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(java.lang.String r7) {
        /*
            r6 = this;
            java.util.HashMap r0 = A0O
            java.lang.Object r0 = r0.get(r7)
            int r3 = X.AnonymousClass001.A0K(r0)
            java.util.HashMap r0 = A0N
            java.lang.Object r0 = r0.get(r7)
            int r5 = X.AnonymousClass001.A0K(r0)
            X.678 r0 = r6.A0K
            java.util.List r2 = r0.getFlashModes()
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x007f
            r1 = 0
        L_0x0021:
            java.lang.String r0 = "off"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x007b
            java.lang.String r0 = "on"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0070
            r1 = 2131889391(0x7f120cef, float:1.9413444E38)
        L_0x0034:
            com.whatsapp.WaImageView r4 = r6.A0G
            X.C107295b4.A03(r4, r1)
            android.content.Context r2 = r6.A09
            X.C18300x5.A13(r2, r4, r5)
            int r0 = r6.A01
            if (r0 == r3) goto L_0x006c
            if (r0 == 0) goto L_0x006c
            android.graphics.drawable.Drawable r1 = X.AnonymousClass0RP.A00(r2, r0)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass0RP.A00(r2, r3)
            X.4M9 r2 = new X.4M9
            r2.<init>(r1, r0)
            int r1 = r2.getIntrinsicHeight()
            int r0 = r4.getPaddingTop()
            int r1 = r1 + r0
            r0 = 120(0x78, float:1.68E-43)
            r2.A00 = r0
            r2.A01 = r1
            r0 = 0
            r2.A02 = r0
            r2.invalidateSelf()
            r4.setImageDrawable(r2)
        L_0x0069:
            r6.A01 = r3
            return
        L_0x006c:
            r4.setImageResource(r3)
            goto L_0x0069
        L_0x0070:
            java.lang.String r0 = "auto"
            boolean r0 = r0.equals(r1)
            r1 = 2131889384(0x7f120ce8, float:1.941343E38)
            if (r0 != 0) goto L_0x0034
        L_0x007b:
            r1 = 2131889389(0x7f120ced, float:1.941344E38)
            goto L_0x0034
        L_0x007f:
            int r0 = r2.indexOf(r7)
            int r1 = r0 + 1
            int r0 = r2.size()
            int r1 = r1 % r0
            java.lang.Object r1 = r2.get(r1)
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5Y6.A04(java.lang.String):void");
    }

    public void A05(boolean z) {
        if (!z) {
            WaImageView waImageView = this.A0J;
            waImageView.startAnimation(this.A04);
            waImageView.setVisibility(8);
        }
        WaImageView waImageView2 = this.A0G;
        Animation animation = this.A04;
        waImageView2.startAnimation(animation);
        waImageView2.setVisibility(8);
        if (this.A06.A02) {
            WaImageView waImageView3 = this.A0H;
            waImageView3.startAnimation(animation);
            waImageView3.setVisibility(8);
        }
        WaImageView waImageView4 = this.A0F;
        waImageView4.startAnimation(animation);
        waImageView4.setVisibility(8);
        this.A0E.setVisibility(8);
    }

    public void A06(boolean z) {
        Resources A0G2 = C18290x4.A0G(this.A0A);
        int i = R.string.f11nameremoved;
        if (z) {
            i = R.string.f11nameremoved;
        }
        this.A0J.setContentDescription(A0G2.getString(i));
    }

    public void A07(boolean z, int i) {
        View view = this.A0C;
        if (z) {
            if (view.getVisibility() != 0) {
                view.setVisibility(0);
                view.startAnimation(this.A03);
            }
            TextView textView = this.A0D;
            textView.setText(String.valueOf(i));
            textView.setContentDescription(AnonymousClass0x2.A0Y(textView.getResources(), i, 0, R.plurals.f9nameremoved));
        } else if (view.getVisibility() != 8) {
            view.setVisibility(8);
            view.startAnimation(this.A04);
        }
    }

    static {
        HashMap A0t = AnonymousClass001.A0t();
        A0N = A0t;
        Integer valueOf = Integer.valueOf(R.string.f11nameremoved);
        A0t.put("off", valueOf);
        A0t.put("on", Integer.valueOf(R.string.f11nameremoved));
        A0t.put("auto", Integer.valueOf(R.string.f11nameremoved));
        A0t.put("torch", valueOf);
    }

    public AnonymousClass5Y6(View view, AnonymousClass678 r9, AnonymousClass7KW r10) {
        int i = 0;
        this.A0A = view;
        this.A09 = view.getContext();
        this.A0B = C06560Yg.A02(view, R.id.fake_flash);
        WaImageView A0L2 = AnonymousClass0x9.A0L(view, R.id.flash_btn);
        this.A0G = A0L2;
        WaImageView A0L3 = AnonymousClass0x9.A0L(view, R.id.switch_camera_btn);
        this.A0J = A0L3;
        this.A0I = AnonymousClass0x9.A0L(view, R.id.shutter);
        WaImageView A0L4 = AnonymousClass0x9.A0L(view, R.id.gallery_btn);
        this.A0H = A0L4;
        this.A0F = AnonymousClass0x9.A0L(view, R.id.close_camera_btn);
        this.A0E = C18300x5.A0G(view, R.id.recording_hint);
        this.A0C = C06560Yg.A02(view, R.id.select_multiple);
        this.A0D = C18300x5.A0G(view, R.id.selected_count);
        this.A06 = r10;
        this.A0K = r9;
        boolean z = C86624Kv.A1W(r9.getNumberOfCameras(), 1);
        this.A0L = z;
        A0L3.setVisibility(AnonymousClass001.A08(z ? 1 : 0));
        A0L2.setVisibility(r9.getStoredFlashModeCount() <= 1 ? 8 : i);
        HashMap hashMap = A0O;
        Integer valueOf = Integer.valueOf(R.drawable.ic_flash_off);
        hashMap.put("off", valueOf);
        hashMap.put("on", Integer.valueOf(R.drawable.ic_flash_on));
        hashMap.put("auto", Integer.valueOf(R.drawable.ic_flash_auto));
        hashMap.put("torch", valueOf);
        this.A03 = AnonymousClass4L0.A0C(0.0f, 1.0f);
        this.A04 = AnonymousClass4L0.A0C(1.0f, 0.0f);
        this.A03.setDuration(200);
        this.A04.setDuration(200);
        AnonymousClass678 r2 = this.A0K;
        A06(r2.BHe());
        WaImageView waImageView = this.A0I;
        waImageView.setEnabled(false);
        this.A0J.setEnabled(false);
        this.A0G.setEnabled(false);
        A04(r2.getFlashMode());
        Context context = this.A09;
        C18290x4.A1A(context, waImageView, R.drawable.shutter_button_background);
        this.A0E.setVisibility(8);
        C86614Ku.A1H(waImageView, this, 4);
        C18300x5.A13(context, waImageView, this.A08 ? R.string.f11nameremoved : R.string.f11nameremoved);
        int dimensionPixelSize = this.A09.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A0I.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        CircularProgressBar circularProgressBar = (CircularProgressBar) C06560Yg.A02(this.A0A, R.id.recording_progress);
        this.A05 = circularProgressBar;
        circularProgressBar.setMax(100);
        this.A05.setProgress(0);
        CircularProgressBar circularProgressBar2 = this.A05;
        circularProgressBar2.A05 = 0.1f;
        circularProgressBar2.A06 = 8.0f;
        WaImageView waImageView2 = this.A0J;
        Context context2 = this.A09;
        C107335b8.A0C(context2, waImageView2, R.drawable.ic_flip_camera, R.color.f5nameremoved);
        this.A0F.setImageDrawable(C18310x6.A0G(context2, R.drawable.ic_close_camera));
        A0L4.setVisibility(r10.A00);
    }
}

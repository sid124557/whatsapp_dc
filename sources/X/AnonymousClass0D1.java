package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.widget.SeekBar;

/* renamed from: X.0D1  reason: invalid class name */
public class AnonymousClass0D1 extends AnonymousClass6NB {
    public Void A0P(SeekBar seekBar, C153427bI r10, AnonymousClass84O r11) {
        C153427bI r4 = r10;
        AnonymousClass84O r5 = r11;
        AnonymousClass0XI r3 = (AnonymousClass0XI) C162377rs.A05(r10, r11);
        if (r3 != null) {
            seekBar.setIndeterminate(false);
            if (Build.VERSION.SDK_INT >= 26) {
                seekBar.setMin(0);
            }
            seekBar.setMax(Integer.MAX_VALUE);
            seekBar.setProgress(r3.A01);
            if (r11.A0V()) {
                seekBar.setProgress((int) (r11.A0B(40, 0.0f) * 2.14748365E9f));
            } else if (!r3.A0E) {
                seekBar.setProgress(r3.A0F);
                r3.A0E = true;
            }
            C835248t A0L = r11.A0L(38);
            C835248t A0L2 = r11.A0L(42);
            C835248t A0L3 = r11.A0L(41);
            if (r3.A08 == null) {
                C06510Xz.A01(seekBar, r3, r10);
            }
            C06510Xz.A03(seekBar, r3, r10, r11);
            seekBar.setSplitTrack(false);
            seekBar.setPadding(0, 0, 0, 0);
            seekBar.refreshDrawableState();
            if (A0L == null && A0L2 == null && A0L3 == null) {
                r3.A0D = null;
                r3.A0C = null;
                return null;
            }
            r3.A0D = r11;
            r3.A0C = r10;
            seekBar.setOnSeekBarChangeListener(new C07430ar(this, r3, r4, r5, A0L2, A0L3));
            return null;
        }
        throw AnonymousClass002.A0E("SliderController is null even though a controller is defined");
    }

    public /* bridge */ /* synthetic */ Object A0M(View view, C153427bI r3, AnonymousClass84O r4, Object obj) {
        return A0P((SeekBar) view, r3, r4);
    }

    public /* bridge */ /* synthetic */ void A0N(View view, C153427bI r2, AnonymousClass84O r3, Object obj, Object obj2) {
        A00((SeekBar) view, r2, r3);
    }

    public /* bridge */ /* synthetic */ void A0O(View view, C153427bI r2, AnonymousClass84O r3, Object obj, Object obj2) {
        A01((SeekBar) view, r2, r3);
    }

    public /* bridge */ /* synthetic */ Object B0R(Context context) {
        return new SeekBar(context);
    }

    public AnonymousClass0D1(C153427bI r1, AnonymousClass84O r2) {
        super(r1, r2);
    }

    public static void A00(SeekBar seekBar, C153427bI r3, AnonymousClass84O r4) {
        AnonymousClass0XI r1 = (AnonymousClass0XI) C162377rs.A05(r3, r4);
        if (r1 != null) {
            seekBar.setThumb(r1.A08);
            r1.A04();
            return;
        }
        throw AnonymousClass002.A0E("SliderController is null even though a controller is defined");
    }

    public static void A01(SeekBar seekBar, C153427bI r5, AnonymousClass84O r6) {
        AnonymousClass0XI r3 = (AnonymousClass0XI) C162377rs.A05(r5, r6);
        if (r3 != null) {
            C06510Xz.A00.removeMessages(0, r3);
            seekBar.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) null);
            r3.A01 = seekBar.getProgress();
            seekBar.setProgress(0);
            GradientDrawable gradientDrawable = r3.A09;
            if (!(gradientDrawable == null || r3.A0A == null || r3.A0B == null)) {
                gradientDrawable.clearColorFilter();
                r3.A0A.clearColorFilter();
                r3.A0B.clearColorFilter();
            }
            C06510Xz.A05(r3, r3.A05);
            if (Build.VERSION.SDK_INT >= 26) {
                seekBar.setMin(0);
            }
            seekBar.setMax(0);
            return;
        }
        throw AnonymousClass002.A0E("SliderController is null even though a controller is defined");
    }
}

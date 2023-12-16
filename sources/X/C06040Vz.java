package X;

import android.content.Context;
import android.view.ViewManager;
import android.view.WindowManager;
import android.view.animation.Interpolator;
import com.whatsapp.R;
import java.lang.ref.WeakReference;

/* renamed from: X.0Vz  reason: invalid class name and case insensitive filesystem */
public class C06040Vz {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Interpolator A03;
    public final Interpolator A04;
    public final AnonymousClass0FU A05;
    public final C16310so A06;
    public final C16320sp A07;
    public final C153427bI A08;
    public final AnonymousClass7r0 A09;
    public final String A0A;
    public final boolean A0B;

    public final AnonymousClass03E A01() {
        C153427bI r4 = this.A08;
        AnonymousClass03E r2 = new AnonymousClass03E(r4.A00(), this.A05, this.A0B);
        r2.setBloksContentViewFromParseResult(r4, this.A09);
        r2.A00 = this.A00;
        r2.A02 = this.A02;
        r2.A01 = this.A01;
        r2.A04 = this.A04;
        r2.A03 = this.A03;
        r2.A07 = new C09670gZ(this);
        r2.A06 = new C18000wa(r2, 0, this);
        r2.setTag(R.id.foa_toast_tag_server_id, this.A0A);
        return r2;
    }

    public void A02() {
        int i;
        Context A002 = this.A08.A00();
        AnonymousClass03E A012 = A01();
        boolean z = this.A0B;
        AnonymousClass0FU r4 = this.A05;
        AnonymousClass03E r1 = (AnonymousClass03E) C06110Wh.A00.get();
        if (r1 != null) {
            r1.A01(r1.A01);
        }
        int i2 = -1;
        if (z) {
            i2 = -2;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(i2, -2, 99, 8, -3);
        if (z) {
            i = 17;
        } else {
            i = 80;
            if (r4.equals(AnonymousClass0FU.TOP)) {
                i = 48;
            }
        }
        layoutParams.gravity = i;
        try {
            ViewManager viewManager = (ViewManager) A002.getSystemService("window");
            if (viewManager != null) {
                viewManager.addView(A012, layoutParams);
                C06110Wh.A00 = new WeakReference(A012);
                A012.setAlpha(0.0f);
                A012.getViewTreeObserver().addOnGlobalLayoutListener(new C18180ws(A012, 4));
                return;
            }
            throw AnonymousClass001.A0e("Window manager required but not found.");
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    public C06040Vz(Interpolator interpolator, Interpolator interpolator2, AnonymousClass0FU r3, C16310so r4, C16320sp r5, C153427bI r6, AnonymousClass7r0 r7, String str, int i, int i2, int i3, boolean z) {
        this.A08 = r6;
        this.A09 = r7;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A04 = interpolator;
        this.A03 = interpolator2;
        this.A07 = r5;
        this.A06 = r4;
        this.A0A = str;
        this.A0B = z;
        this.A05 = r3;
    }

    public /* synthetic */ C06040Vz(Interpolator interpolator, Interpolator interpolator2, C09670gZ r16, AnonymousClass0FU r17, C16310so r18, C16320sp r19, C153427bI r20, AnonymousClass7r0 r21, String str, int i, int i2, int i3, boolean z) {
        this(interpolator, interpolator2, r17, r18, r19, r20, r21, str, i, i2, i3, z);
    }
}

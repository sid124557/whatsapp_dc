package X;

import android.graphics.Rect;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.util.ClippingLayout;

/* renamed from: X.5oZ  reason: invalid class name and case insensitive filesystem */
public class C115375oZ implements C186158uq {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C003203q A01;
    public final /* synthetic */ AnonymousClass4VH A02;
    public final /* synthetic */ C620633i A03;
    public final /* synthetic */ AnonymousClass5ZT A04;

    public C115375oZ(View view, C003203q r2, AnonymousClass4VH r3, C620633i r4, AnonymousClass5ZT r5) {
        this.A04 = r5;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = view;
    }

    public void BUL(boolean z) {
        this.A04.A0n.A0D();
    }

    public void BVt(boolean z) {
        this.A04.A0O(z);
    }

    public void BaD() {
        C06560Yg.A02(this.A00, R.id.footer).setClipBounds((Rect) null);
        this.A04.A18.setClipBounds((Rect) null);
    }

    public void Bba() {
        AnonymousClass5ZT r2 = this.A04;
        r2.A0Y.findViewById(R.id.buttons).setVisibility(0);
        r2.A0W.requestFocus();
    }

    public void Bbd() {
        C003203q r2 = this.A01;
        String string = r2.getString(R.string.f11nameremoved);
        if (this.A04.A0L == null) {
            C107295b4.A00(r2, this.A03, string);
        }
        this.A02.A0F(3);
    }

    public void Bbm(float f) {
        C378124c r3 = this.A04.A0b;
        r3.A00.set(Double.doubleToRawLongBits((double) f));
    }

    public void Bcq(boolean z, boolean z2, boolean z3, boolean z4) {
        this.A04.A0T(z, z2, z3, z4);
    }

    public void Bfc(float f, boolean z) {
        ClippingLayout clippingLayout;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("voicenote/onVoiceButtonOffsetChanged voiceButtonOffset=");
        A0o.append(f);
        C18260x0.A1D(" isOffsetToLeft=", A0o, z);
        AnonymousClass5ZT r5 = this.A04;
        Rect rect = r5.A0S;
        if (z) {
            clippingLayout = r5.A17;
            rect.set(0, 0, r5.A0W.getWidth() + ((int) f), clippingLayout.getHeight());
        } else {
            clippingLayout = r5.A17;
            rect.set((int) f, 0, clippingLayout.getWidth(), clippingLayout.getHeight());
        }
        if (r5.A0X.getVisibility() == 0) {
            clippingLayout = r5.A18;
        }
        clippingLayout.setClipBounds(rect);
    }
}

package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import java.util.List;

/* renamed from: X.6pR  reason: invalid class name and case insensitive filesystem */
public class C137896pR extends AnonymousClass8J3 {
    public View A00;
    public WaImageView A01;
    public WaTextView A02;
    public List A03;
    public final int A04;
    public final AnonymousClass33O A05;
    public final C56932sn A06;
    public final AnonymousClass4BP A07;
    public final boolean A08;

    public C137896pR(Context context, LayoutInflater layoutInflater, AnonymousClass1VX r11, AnonymousClass33O r12, C56932sn r13, AnonymousClass4BP r14, int i, int i2, boolean z) {
        super(context, layoutInflater, r11, i, i2);
        this.A06 = r13;
        this.A05 = r12;
        this.A07 = r14;
        boolean z2 = z;
        this.A04 = C18280x3.A00(z2 ? 1 : 0);
        this.A08 = z2;
    }

    public void A05(AnonymousClass39M r10) {
        AnonymousClass39M r2 = r10;
        this.A05 = r10;
        WaImageView waImageView = this.A01;
        if (waImageView == null) {
            return;
        }
        if (r10 == null) {
            waImageView.setImageDrawable((Drawable) null);
            return;
        }
        AnonymousClass33O r0 = this.A05;
        int i = this.A09;
        r0.A05(waImageView, r2, (C183108pV) null, 0, i, i, true, true);
    }

    public void A06(List list) {
        this.A03 = list;
        C125306Hh A002 = A00();
        A002.A0K(this.A03);
        A002.A05();
        if (this.A00 != null) {
            if (this.A08) {
                this.A02.setText(R.string.f11nameremoved);
            }
            int A0G = A00().A0G();
            View view = this.A00;
            int i = 8;
            if (A0G == 0) {
                i = 0;
            }
            view.setVisibility(i);
        }
    }

    public void A03(View view) {
        View findViewById = view.findViewById(R.id.empty);
        this.A00 = findViewById;
        findViewById.setVisibility(4);
        this.A01 = (WaImageView) C06560Yg.A02(view, R.id.empty_image);
        WaTextView A0L = AnonymousClass0x7.A0L(view, R.id.empty_text);
        this.A02 = A0L;
        A0L.setText(R.string.f11nameremoved);
        if (this.A08) {
            AnonymousClass39M r0 = this.A05;
            if (r0 != null) {
                A05(r0);
            } else {
                this.A01.setImageDrawable((Drawable) null);
            }
        }
    }

    public void BQv(View view, ViewGroup viewGroup, int i) {
        super.BQv(view, viewGroup, i);
        this.A00 = null;
    }
}

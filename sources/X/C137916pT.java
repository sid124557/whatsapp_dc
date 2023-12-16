package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import java.util.List;

/* renamed from: X.6pT  reason: invalid class name and case insensitive filesystem */
public class C137916pT extends AnonymousClass8J3 {
    public View A00;
    public View A01;
    public TextView A02;
    public TextView A03;
    public WaImageView A04;
    public C125306Hh A05;
    public List A06;
    public boolean A07;
    public final int A08;
    public final C56972sr A09;
    public final C153137aj A0A;
    public final C27841el A0B;
    public final AnonymousClass33O A0C;
    public final AnonymousClass4BP A0D;
    public final boolean A0E;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C137916pT(android.content.Context r8, android.view.LayoutInflater r9, X.C56972sr r10, X.AnonymousClass1VX r11, X.C153137aj r12, X.C27841el r13, X.AnonymousClass33O r14, X.AnonymousClass4BP r15, int r16, int r17) {
        /*
            r7 = this;
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r11
            r5 = r16
            r6 = r17
            r1.<init>(r2, r3, r4, r5, r6)
            r7.A09 = r10
            r7.A0A = r12
            r7.A0B = r13
            r7.A0C = r14
            r7.A0D = r15
            boolean r0 = r13.A0E
            r7.A0E = r0
            r7.A08 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137916pT.<init>(android.content.Context, android.view.LayoutInflater, X.2sr, X.1VX, X.7aj, X.1el, X.33O, X.4BP, int, int):void");
    }

    public void A05(AnonymousClass39M r10) {
        AnonymousClass39M r2 = r10;
        this.A05 = r10;
        WaImageView waImageView = this.A04;
        if (waImageView == null) {
            return;
        }
        if (r10 == null) {
            waImageView.setImageDrawable((Drawable) null);
            return;
        }
        AnonymousClass33O r0 = this.A0C;
        int i = this.A09;
        r0.A05(waImageView, r2, (C183108pV) null, 0, i, i, true, true);
    }

    public void A03(View view) {
        view.setBackgroundColor(this.A08);
        View findViewById = view.findViewById(R.id.empty);
        this.A01 = findViewById;
        findViewById.setVisibility(4);
        TextView A092 = AnonymousClass002.A09(view, R.id.get_stickers_button);
        this.A02 = A092;
        C106905aM.A04(A092);
        this.A02.setOnClickListener(new C109675f0((Object) this, 8));
        this.A03 = AnonymousClass002.A09(view, R.id.empty_text);
        this.A04 = (WaImageView) C06560Yg.A02(view, R.id.empty_image);
        this.A00 = view.findViewById(R.id.sticker_avatar_upsell);
        if (this.A0E) {
            AnonymousClass39M r0 = this.A05;
            if (r0 != null) {
                A05(r0);
            } else {
                this.A04.setImageDrawable((Drawable) null);
            }
        }
    }

    public void A06(List list) {
        C125306Hh A002 = A00();
        this.A06 = list;
        A002.A0K(list);
        A002.A05();
        if (this.A01 != null) {
            int A0G = A00().A0G();
            View view = this.A01;
            int i = 8;
            if (A0G == 0) {
                i = 0;
            }
            view.setVisibility(i);
            boolean z = this.A07;
            TextView textView = this.A03;
            if (z) {
                textView.setText(R.string.f11nameremoved);
                this.A02.setVisibility(4);
            } else {
                textView.setText(R.string.f11nameremoved);
                this.A02.setVisibility(0);
            }
            C56972sr r1 = this.A09;
            if (!r1.A0Y()) {
                r1.A0Y();
            }
            this.A04.setVisibility(0);
            if (this.A0E) {
                this.A03.setText(R.string.f11nameremoved);
                this.A02.setVisibility(4);
            }
        }
    }

    public void BQv(View view, ViewGroup viewGroup, int i) {
        super.BQv(view, viewGroup, i);
        C125306Hh r1 = this.A05;
        if (r1 != null) {
            r1.A03 = null;
        }
        this.A01 = null;
    }
}

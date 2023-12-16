package X;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

/* renamed from: X.4td  reason: invalid class name and case insensitive filesystem */
public final class C95424td extends C134586jH {
    public WaImageView A00;
    public C166177yG A01;
    public C149507Ms A02;
    public AnonymousClass5ZM A03;
    public final ViewGroup A04;
    public final ImageView A05;
    public final AnonymousClass4FV A06;
    public final C106095Xp A07;
    public final AnonymousClass4AK A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95424td(ViewGroup viewGroup, C620633i r6, AnonymousClass4FV r7, C106095Xp r8, AnonymousClass4AK r9, C60152y5 r10) {
        super(viewGroup);
        C162457s7.A0J(r9, 6);
        this.A07 = r8;
        this.A06 = r7;
        this.A08 = r9;
        View view = this.A0H;
        this.A05 = (ImageView) C18290x4.A0M(view, R.id.thumb_view);
        ViewGroup viewGroup2 = (ViewGroup) C18290x4.A0M(view, R.id.video_preview_container);
        this.A04 = viewGroup2;
        if (AnonymousClass34G.A01(r6, r10) >= 2012) {
            C149507Ms r0 = new C149507Ms(view.getContext());
            this.A02 = r0;
            viewGroup2.addView(r0.A02, C86664Kz.A0q());
            this.A00 = AnonymousClass0x9.A0L(viewGroup2, R.id.gif);
            viewGroup2.setVisibility(0);
        }
    }

    public void A07() {
        C166177yG r4 = this.A01;
        if (r4 == null) {
            ImageView imageView = this.A05;
            imageView.setOnClickListener((View.OnClickListener) null);
            this.A04.setOnClickListener((View.OnClickListener) null);
            imageView.setVisibility(8);
            return;
        }
        AnonymousClass54E r5 = new AnonymousClass54E(this, 9, r4);
        WaImageView waImageView = this.A00;
        if (waImageView != null) {
            C166097y8 r1 = r4.A01;
            int i = r1.A01;
            if (i <= 0) {
                i = r4.A02.A01;
            }
            int i2 = r1.A00;
            if (i2 <= 0) {
                i2 = r4.A02.A00;
            }
            if (i == 0 || i2 == 0) {
                i = 1;
                i2 = 1;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("h,");
            A0o.append(i);
            A0o.append(':');
            String A0h = AnonymousClass000.A0h(A0o, i2);
            ViewGroup.LayoutParams layoutParams = waImageView.getLayoutParams();
            C162457s7.A0K(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            C001702c r12 = (C001702c) layoutParams;
            r12.A0t = A0h;
            waImageView.setLayoutParams(r12);
        }
        ImageView imageView2 = this.A05;
        imageView2.setOnClickListener(r5);
        ViewGroup viewGroup = this.A04;
        viewGroup.setOnClickListener(r5);
        C18300x5.A13(viewGroup.getContext(), viewGroup, R.string.f11nameremoved);
        imageView2.setVisibility(0);
        imageView2.setImageDrawable(new ColorDrawable(13421772));
        if (this.A02 == null) {
            this.A07.A03(imageView2, r4.A03.A02);
            return;
        }
        String str = r4.A02.A02;
        C106095Xp r13 = this.A07;
        C114345mt r11 = new C114345mt(this, str);
        C184398rj A002 = C106095Xp.A00(r13);
        C54292oU r10 = r13.A0C;
        C56612sH r9 = r13.A0B;
        C95394ta r3 = new C95394ta(r13.A03, r13.A07, r13.A08, r13.A09, r13.A0A, r9, r10, r11, A002, str);
        r3.A02.executeOnExecutor(r13.A02(), new Void[0]);
        this.A03 = r3;
    }

    public void A08() {
        AnonymousClass5ZM r1 = this.A03;
        if (r1 != null) {
            r1.A0D(false);
        }
        this.A03 = null;
        C149507Ms r12 = this.A02;
        if (r12 != null) {
            AnonymousClass6D4 r0 = r12.A00;
            if (r0 != null) {
                r0.stop();
                r12.A00 = null;
            }
            C172218Kd r02 = r12.A01;
            if (r02 != null) {
                r02.close();
                r12.A01 = null;
            }
            r12.A03.setImageDrawable((Drawable) null);
        }
    }
}

package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.stickers.StickerView;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.5Xu  reason: invalid class name and case insensitive filesystem */
public class C106145Xu {
    public static final int A0P;
    public static final int A0Q;
    public C30471mV A00;
    public boolean A01;
    public boolean A02;
    public final View.OnClickListener A03 = new AnonymousClass54F(this, 47);
    public final View A04;
    public final View A05;
    public final AnonymousClass5Ul A06;
    public final C621033m A07;
    public final AnonymousClass5ZR A08;
    public final C620733j A09;
    public final AnonymousClass1VX A0A;
    public final C56232re A0B;
    public final C620133d A0C;
    public final C55732qp A0D;
    public final AnonymousClass33O A0E;
    public final StickerView A0F;
    public final AnonymousClass5C5 A0G;
    public final C185528tp A0H = new C100465Ba(this, 9);
    public final C33141sV A0I;
    public final C109665ez A0J = new AnonymousClass54F(this, 44);
    public final C109665ez A0K = new AnonymousClass54F(this, 45);
    public final C109665ez A0L = new AnonymousClass54F(this, 46);
    public final AnonymousClass5UY A0M;
    public final AnonymousClass5UY A0N;
    public final WDSButton A0O;

    static {
        boolean z = AnonymousClass320.A00;
        int i = 7;
        int i2 = 1;
        if (z) {
            i2 = 7;
        }
        A0P = i2;
        if (!z) {
            i = 3;
        }
        A0Q = i;
    }

    public void A00() {
        String A032;
        View view = this.A04;
        view.setVisibility(0);
        AnonymousClass5UY r8 = this.A0N;
        AnonymousClass5UY r9 = this.A0M;
        WDSButton wDSButton = this.A0O;
        C93244oC.A04(view, wDSButton, r8, r9, false, false, false, false);
        C30471mV r1 = this.A00;
        if (!r1.A1J.A02 || C383227b.A00(r1)) {
            StickerView stickerView = this.A0F;
            C18300x5.A13(stickerView.getContext(), stickerView, R.string.f11nameremoved);
            C620733j r5 = this.A09;
            long j = this.A00.A00;
            if (j <= 0) {
                A032 = "";
            } else {
                A032 = AnonymousClass35V.A03(r5, j);
            }
            wDSButton.setText(A032);
            wDSButton.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_download, 0, 0, 0);
            C109665ez r0 = this.A0K;
            wDSButton.setOnClickListener(r0);
            stickerView.setOnClickListener(r0);
            return;
        }
        StickerView stickerView2 = this.A0F;
        C18300x5.A13(stickerView2.getContext(), stickerView2, R.string.f11nameremoved);
        wDSButton.setText(R.string.f11nameremoved);
        wDSButton.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_upload, 0, 0, 0);
        C109665ez r02 = this.A0L;
        wDSButton.setOnClickListener(r02);
        stickerView2.setOnClickListener(r02);
    }

    public void A01() {
        boolean z = this.A00.A1J.A02;
        View view = this.A04;
        if (!z) {
            view.setVisibility(0);
            AnonymousClass5UY r4 = this.A0N;
            AnonymousClass5UY r5 = this.A0M;
            WDSButton wDSButton = this.A0O;
            C93244oC.A04(view, wDSButton, r4, r5, true, false, false, false);
            StickerView stickerView = this.A0F;
            C18300x5.A13(stickerView.getContext(), stickerView, R.string.f11nameremoved);
            C109665ez r0 = this.A0J;
            wDSButton.setOnClickListener(r0);
            r4.A07(r0);
        } else {
            view.setVisibility(8);
        }
        this.A0F.setOnClickListener((View.OnClickListener) null);
    }

    public void A02() {
        View view = this.A04;
        view.setVisibility(8);
        AnonymousClass5UY r3 = this.A0N;
        AnonymousClass5UY r4 = this.A0M;
        WDSButton wDSButton = this.A0O;
        C93244oC.A04(view, wDSButton, r3, r4, false, false, false, false);
        wDSButton.setOnClickListener((View.OnClickListener) null);
        this.A0F.setOnClickListener(this.A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
        if (r3 != null) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.AnonymousClass1nE r14, boolean r15) {
        /*
            r13 = this;
            r13.A00 = r14
            r4 = 0
            if (r15 == 0) goto L_0x000a
            com.whatsapp.stickers.StickerView r0 = r13.A0F
            r0.setImageDrawable(r4)
        L_0x000a:
            X.2qp r3 = r13.A0D
            X.39M r6 = r3.A00(r14)
            X.33C r1 = X.C30471mV.A00(r14)
            com.whatsapp.stickers.StickerView r5 = r13.A0F
            android.content.res.Resources r2 = X.C18290x4.A0G(r5)
            r0 = 2131166096(0x7f070390, float:1.7946428E38)
            int r9 = r2.getDimensionPixelSize(r0)
            r5.setOnClickListener(r4)
            java.lang.String r2 = r6.A09
            if (r2 == 0) goto L_0x0048
            X.20i r0 = r6.A04()
            X.330 r3 = r3.A01(r0, r2)
            X.1VX r2 = r13.A0A
            r0 = 1396(0x574, float:1.956E-42)
            boolean r0 = r2.A0X(r0)
            if (r0 == 0) goto L_0x0079
            if (r3 == 0) goto L_0x0048
            r14.A04 = r3
        L_0x003e:
            X.5Zv[] r0 = r3.A0B
            if (r0 == 0) goto L_0x0048
            java.lang.String r0 = X.C387228w.A00(r0)
            r6.A07 = r0
        L_0x0048:
            android.content.Context r0 = r5.getContext()
            java.lang.String r0 = X.AnonymousClass320.A00(r0, r6)
            r5.setContentDescription(r0)
            java.lang.String r0 = r6.A0D
            if (r0 == 0) goto L_0x0075
            java.io.File r0 = r1.A0F
            if (r0 != 0) goto L_0x0061
            java.lang.String r0 = r14.A1x()
            if (r0 == 0) goto L_0x0075
        L_0x0061:
            X.33O r4 = r13.A0E
            X.5pT r7 = new X.5pT
            r7.<init>(r1, r13, r14, r15)
            r8 = 1
            r12 = 0
            r10 = r9
            r11 = r8
            r4.A05(r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x006f:
            android.view.View r0 = r13.A05
            r0.invalidate()
            return
        L_0x0075:
            r13.A04(r14, r15)
            goto L_0x006f
        L_0x0079:
            if (r3 == 0) goto L_0x0048
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106145Xu.A03(X.1nE, boolean):void");
    }

    public final void A04(AnonymousClass1nE r8, boolean z) {
        AnonymousClass1nE r3 = r8;
        if (!this.A01 || z) {
            this.A01 = false;
            this.A0I.A09(this.A0F, r8, this.A0H);
            return;
        }
        this.A01 = false;
        this.A0I.A0D(this.A0F, r3, this.A0H, r8.A1J, false);
    }

    public C106145Xu(View view, AnonymousClass5Ul r5, C621033m r6, AnonymousClass5ZR r7, C620733j r8, AnonymousClass1VX r9, C56232re r10, C620133d r11, C55732qp r12, AnonymousClass33O r13, AnonymousClass5C5 r14, C33141sV r15) {
        this.A05 = view;
        this.A0F = (StickerView) view.findViewById(R.id.sticker_image);
        AnonymousClass5UY A0M2 = AnonymousClass0x2.A0M(view, R.id.progress_bar);
        this.A0N = A0M2;
        this.A0G = r14;
        A0M2.A09(new AnonymousClass92F(6));
        this.A0M = AnonymousClass0x2.A0M(view, R.id.cancel_download);
        this.A04 = view.findViewById(R.id.control_frame);
        this.A0O = (WDSButton) view.findViewById(R.id.control_btn);
        this.A0A = r9;
        this.A0E = r13;
        this.A06 = r5;
        this.A07 = r6;
        this.A0D = r12;
        this.A09 = r8;
        this.A0I = r15;
        this.A08 = r7;
        this.A0C = r11;
        this.A0B = r10;
    }
}

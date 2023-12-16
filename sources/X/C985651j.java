package X;

import android.content.Context;
import android.graphics.RectF;
import android.net.Uri;
import android.os.SystemClock;
import android.text.Spanned;
import android.util.DisplayMetrics;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.51j  reason: invalid class name and case insensitive filesystem */
public final class C985651j extends C105395Ut implements AnonymousClass66G {
    public DisplayMetrics A00;
    public View A01;
    public Integer A02;
    public Integer A03;
    public String A04;
    public final int A05 = A03().getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
    public final View A06;
    public final TextEmojiLabel A07;
    public final C114635nM A08;
    public final AnonymousClass36Y A09;
    public final AnonymousClass1VX A0A;
    public final C106685Zz A0B;
    public final C30481mW A0C;
    public final C104835Sn A0D;
    public final AnonymousClass4QG A0E;
    public final C56072rN A0F;
    public final C33141sV A0G;

    public final boolean A0C(float f, float f2, boolean z) {
        Spanned spanned;
        CharSequence text = this.A07.getText();
        if (text instanceof Spanned) {
            spanned = (Spanned) text;
        } else {
            spanned = null;
        }
        if (spanned != null) {
            C111385i0[] r6 = (C111385i0[]) spanned.getSpans(0, spanned.length(), C111385i0.class);
            C162457s7.A0H(r6);
            for (C111385i0 r2 : r6) {
                Iterator it = r2.A06.iterator();
                while (it.hasNext()) {
                    if (((RectF) it.next()).contains(f, f2)) {
                        if (z) {
                            String str = r2.A05;
                            String A002 = AnonymousClass5CC.A00(str);
                            C114635nM r22 = this.A08;
                            C30481mW r1 = this.A0C;
                            Set BBH = r22.BBH(r1.A0n(), r1, str);
                            this.A02 = 1;
                            A05();
                            Context A032 = A03();
                            String str2 = r1.A1J.A01;
                            C162457s7.A0C(str2);
                            C184988ss r7 = this.A00;
                            boolean A0S = C175728Zm.A0S(A002, "…", false);
                            boolean z2 = true;
                            if (this.A09.A0B(Uri.parse(str), (Uri) null) == 1) {
                                z2 = false;
                            }
                            AnonymousClass5VM.A00(A032, r7, this, str, str2, BBH, A0S, z2);
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C985651j(C69263Wi r10, C85244Fm r11, C620633i r12, C620733j r13, C114635nM r14, AnonymousClass36Y r15, AnonymousClass1VX r16, C106685Zz r17, C48132eP r18, C624134x r19, C104035Pj r20, C56072rN r21, C33141sV r22) {
        super(r11, r10, r12, r13, r18, r20);
        C624134x r1 = r19;
        this.A0A = r16;
        this.A0B = r17;
        this.A0F = r21;
        this.A08 = r14;
        this.A0G = r22;
        this.A09 = r15;
        C626936e.A06(r1);
        C30481mW r110 = (C30481mW) r1;
        this.A0C = r110;
        AnonymousClass4QG A002 = C100715Bz.A00(A03(), r14, r110);
        this.A0E = A002;
        View A0G2 = C86644Kx.A0G(A002);
        C162457s7.A0D(A0G2);
        this.A06 = A0G2;
        this.A07 = (TextEmojiLabel) C18290x4.A0M(A002, R.id.message_text);
        this.A0D = A002.getStaticContentPlayer();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a0, code lost:
        if (r1 == null) goto L_0x00a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void A00(android.graphics.Bitmap r5, android.view.View r6, android.view.View r7, X.C985651j r8, com.whatsapp.webpagepreview.WebPagePreviewView r9, int r10, int r11, int r12, boolean r13) {
        /*
            android.view.View r0 = r8.A01
            if (r0 == 0) goto L_0x00b5
            if (r5 == 0) goto L_0x0083
            int r0 = r8.A05
            float r1 = (float) r0
            android.util.DisplayMetrics r0 = r8.A00
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = "displayMetrics"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0014:
            float r0 = r0.density
            float r1 = r1 / r0
            int r0 = (int) r1
            if (r10 < r0) goto L_0x0083
            android.content.Context r0 = r8.A03()     // Catch:{ OutOfMemoryError -> 0x0095 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ OutOfMemoryError -> 0x0095 }
            r4 = 2131168331(0x7f070c4b, float:1.795096E38)
            int r2 = r0.getDimensionPixelSize(r4)     // Catch:{ OutOfMemoryError -> 0x0095 }
            r0 = 2131428506(0x7f0b049a, float:1.8478658E38)
            X.C86624Kv.A0u(r9, r0)     // Catch:{ OutOfMemoryError -> 0x0095 }
            r1 = 1068708659(0x3fb33333, float:1.4)
            float r0 = (float) r10     // Catch:{ OutOfMemoryError -> 0x0095 }
            float r0 = r0 * r1
            int r3 = (int) r0     // Catch:{ OutOfMemoryError -> 0x0095 }
            int r11 = r11 * r2
            int r11 = r11 / r10
            android.view.View r0 = r8.A06     // Catch:{ OutOfMemoryError -> 0x0095 }
            int r1 = r0.getHeight()     // Catch:{ OutOfMemoryError -> 0x0095 }
            com.whatsapp.TextEmojiLabel r0 = r8.A07     // Catch:{ OutOfMemoryError -> 0x0095 }
            int r0 = X.C86664Kz.A0D(r0, r1)     // Catch:{ OutOfMemoryError -> 0x0095 }
            int r0 = r0 - r12
            int r0 = java.lang.Math.min(r11, r0)     // Catch:{ OutOfMemoryError -> 0x0095 }
            int r3 = java.lang.Math.min(r3, r0)     // Catch:{ OutOfMemoryError -> 0x0095 }
            int r12 = r12 + r3
            r0 = 0
            r9.setImagePlayFrameVisibility(r0)     // Catch:{ OutOfMemoryError -> 0x0095 }
            r9.setImageProgressBarVisibility(r0)     // Catch:{ OutOfMemoryError -> 0x0095 }
            android.view.View r0 = r8.A01     // Catch:{ OutOfMemoryError -> 0x0095 }
            if (r0 == 0) goto L_0x0071
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()     // Catch:{ OutOfMemoryError -> 0x0095 }
            if (r1 == 0) goto L_0x0071
            android.content.Context r0 = r8.A03()     // Catch:{ OutOfMemoryError -> 0x0095 }
            int r0 = X.C18320x8.A00(r0, r4)     // Catch:{ OutOfMemoryError -> 0x0095 }
            r1.width = r0     // Catch:{ OutOfMemoryError -> 0x0095 }
            r1.height = r12     // Catch:{ OutOfMemoryError -> 0x0095 }
            android.view.View r0 = r8.A01     // Catch:{ OutOfMemoryError -> 0x0095 }
            if (r0 == 0) goto L_0x0071
            r0.setLayoutParams(r1)     // Catch:{ OutOfMemoryError -> 0x0095 }
        L_0x0071:
            r0 = 1
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r5, r2, r11, r0)     // Catch:{ OutOfMemoryError -> 0x0095 }
            X.C162457s7.A0D(r0)     // Catch:{ OutOfMemoryError -> 0x0095 }
            r9.A01()     // Catch:{ OutOfMemoryError -> 0x0095 }
            r9.A0A(r2, r3)     // Catch:{ OutOfMemoryError -> 0x0095 }
            r9.setImageLargeThumbWithBitmap(r0)     // Catch:{ OutOfMemoryError -> 0x0095 }
            goto L_0x00a9
        L_0x0083:
            java.lang.String r1 = r8.A04
            if (r1 == 0) goto L_0x008c
            X.1mW r0 = r8.A0C
            r9.A0I(r0, r1)
        L_0x008c:
            android.view.View r1 = r8.A01
            if (r1 != 0) goto L_0x00a2
            java.lang.IllegalArgumentException r0 = X.C18300x5.A0X()
            throw r0
        L_0x0095:
            java.lang.String r1 = r8.A04
            if (r1 == 0) goto L_0x009e
            X.1mW r0 = r8.A0C
            r9.A0I(r0, r1)
        L_0x009e:
            android.view.View r1 = r8.A01
            if (r1 == 0) goto L_0x00a9
        L_0x00a2:
            android.content.Context r0 = r8.A03()
            X.C107415bH.A08(r0, r1)
        L_0x00a9:
            android.view.View r0 = r8.A01
            if (r0 == 0) goto L_0x00b0
            r0.requestLayout()
        L_0x00b0:
            com.whatsapp.TextEmojiLabel r0 = r8.A07
            r0.requestLayout()
        L_0x00b5:
            r0 = 5
            X.542 r2 = new X.542
            r2.<init>(r0, r8, r13)
            r7.setOnClickListener(r2)
            r1 = 4
            X.5Bt r0 = new X.5Bt
            r0.<init>(r7, r1, r8)
            r7.setOnTouchListener(r0)
            r6.setOnClickListener(r2)
            r0 = 12
            X.AnonymousClass692.A00(r6, r8, r0)
            java.lang.String r0 = r8.A04
            if (r0 == 0) goto L_0x00f3
            int r1 = r0.length()
            r0 = 89
            if (r1 < r0) goto L_0x00fe
            java.lang.Integer r0 = X.AnonymousClass001.A0f()
        L_0x00df:
            long r2 = r0.longValue()
            r0 = 3000(0xbb8, double:1.482E-320)
            long r2 = r2 * r0
            r0 = 4500(0x1194, double:2.2233E-320)
            long r2 = r2 + r0
            r0 = 10000(0x2710, double:4.9407E-320)
            long r1 = java.lang.Math.max(r0, r2)
            X.5Sn r0 = r8.A0D
            r0.A00 = r1
        L_0x00f3:
            X.5Sn r0 = r8.A0D
            r0.A01()
            X.5Pj r0 = r8.A05
            r0.A01()
            return
        L_0x00fe:
            int r1 = r1 / r0
            double r0 = (double) r1
            double r0 = java.lang.Math.sqrt(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            goto L_0x00df
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C985651j.A00(android.graphics.Bitmap, android.view.View, android.view.View, X.51j, com.whatsapp.webpagepreview.WebPagePreviewView, int, int, int, boolean):void");
    }

    public long A02() {
        return this.A0D.A00;
    }

    public void A07() {
        C104835Sn r2 = this.A0D;
        r2.A01 = 0;
        r2.A02 = SystemClock.elapsedRealtime();
        A0B();
    }

    public void A08() {
        this.A0D.A02();
    }

    public final void A0B() {
        DisplayMetrics A0B2 = AnonymousClass000.A0B(A03());
        C162457s7.A0D(A0B2);
        this.A00 = A0B2;
        TextEmojiLabel textEmojiLabel = this.A07;
        boolean z = false;
        if (textEmojiLabel.getText().length() <= 350) {
            z = true;
        }
        CharSequence text = textEmojiLabel.getText();
        if (text instanceof Spanned) {
            C111385i0[] r2 = (C111385i0[]) ((Spanned) text).getSpans(0, text.length(), C111385i0.class);
            C162457s7.A0H(r2);
            int length = r2.length;
            if (length != 0) {
                this.A03 = 1;
                this.A02 = C18290x4.A0a();
            }
            if (C627636p.A0p(this.A0C) && z && length > 0) {
                textEmojiLabel.addOnLayoutChangeListener(new C1237469p(this, 4, r2));
                textEmojiLabel.requestLayout();
                return;
            }
        }
        this.A0D.A01();
        this.A05.A01();
    }

    public void BP9() {
        this.A02 = C18280x3.A0S();
    }

    public void BR6() {
        A06();
    }
}

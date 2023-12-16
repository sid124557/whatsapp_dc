package X;

import android.os.Build;
import com.whatsapp.biz.product.view.activity.ProductDetailActivity;
import com.whatsapp.jid.UserJid;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4V5  reason: invalid class name */
public class AnonymousClass4V5 extends C05550Ty {
    public boolean A00;
    public boolean A01;
    public final int A02;
    public final AnonymousClass08M A03;
    public final AnonymousClass08M A04;
    public final AnonymousClass08M A05;
    public final AnonymousClass08M A06;
    public final AnonymousClass08M A07;
    public final AnonymousClass08M A08;
    public final AnonymousClass08M A09;
    public final AnonymousClass08M A0A;
    public final C105035Th A0B;
    public final C154197cm A0C;
    public final C104095Pq A0D;
    public final AnonymousClass5Y9 A0E;
    public final C104325Qn A0F;
    public final AnonymousClass5MK A0G;
    public final AnonymousClass8EO A0H;
    public final C29441ip A0I;
    public final AnonymousClass33p A0J;
    public final UserJid A0K;
    public final C103115Lp A0L;
    public final AnonymousClass4FS A0M;
    public final AtomicBoolean A0N = C18280x3.A0l();

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r0 = r3.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0E(X.C109015dw r3, int r4) {
        /*
            r2 = this;
            r1 = 0
            if (r3 == 0) goto L_0x001c
            boolean r0 = r3.A0H
            if (r0 == 0) goto L_0x001c
            if (r4 != 0) goto L_0x001c
            boolean r0 = r3.A02()
            if (r0 != 0) goto L_0x001c
            X.38u r0 = r3.A01
            if (r0 == 0) goto L_0x001c
            int r0 = r0.A00
            if (r0 != 0) goto L_0x001c
            boolean r0 = r3.A08
            if (r0 != 0) goto L_0x001c
            r1 = 1
        L_0x001c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4V5.A0E(X.5dw, int):boolean");
    }

    public AnonymousClass4V5(C105035Th r6, C154197cm r7, C104095Pq r8, AnonymousClass5Y9 r9, C104325Qn r10, AnonymousClass5MK r11, AnonymousClass8EO r12, C29441ip r13, AnonymousClass33p r14, UserJid userJid, C103115Lp r16, AnonymousClass4FS r17, int i) {
        AnonymousClass08M A012 = AnonymousClass08M.A01();
        this.A06 = A012;
        AnonymousClass08M A013 = AnonymousClass08M.A01();
        this.A09 = A013;
        this.A05 = AnonymousClass08M.A01();
        AnonymousClass08M A014 = AnonymousClass08M.A01();
        this.A08 = A014;
        AnonymousClass08M A015 = AnonymousClass08M.A01();
        this.A04 = A015;
        this.A07 = AnonymousClass08M.A01();
        this.A03 = AnonymousClass08M.A01();
        this.A0A = AnonymousClass08M.A01();
        this.A0K = userJid;
        this.A0F = r10;
        this.A0H = r12;
        this.A0I = r13;
        this.A02 = i;
        this.A0E = r9;
        this.A0J = r14;
        this.A0L = r16;
        this.A0B = r6;
        this.A0G = r11;
        this.A0C = r7;
        this.A0D = r8;
        this.A0M = r17;
        r10.A00 = A012;
        r10.A02 = A013;
        r12.A00 = A015;
        r10.A01 = A014;
    }

    public void A0D(ProductDetailActivity productDetailActivity) {
        if (AnonymousClass0x9.A1N(productDetailActivity.getIntent(), "is_from_product_detail_screen")) {
            if (Build.VERSION.SDK_INT < 29) {
                productDetailActivity.onStateNotSaved();
            }
            C86654Ky.A1H(this.A05);
            return;
        }
        productDetailActivity.onBackPressed();
    }
}

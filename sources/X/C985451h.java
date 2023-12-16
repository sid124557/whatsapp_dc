package X;

import com.whatsapp.R;
import com.whatsapp.newsletter.NewsletterLinkLauncher;

/* renamed from: X.51h  reason: invalid class name and case insensitive filesystem */
public final class C985451h extends C985551i {
    public float A00;
    public int A01;
    public int A02 = 3;
    public int A03;
    public int A04;

    public C985451h(C111095hX r3, C64393Dh r4, C69263Wi r5, C620633i r6, C56612sH r7, C54292oU r8, C620733j r9, AnonymousClass5Y0 r10, AnonymousClass1VX r11, C28071fd r12, C48132eP r13, NewsletterLinkLauncher newsletterLinkLauncher, C624134x r15, C104035Pj r16, AnonymousClass5U7 r17, AnonymousClass33O r18, C33141sV r19, C105855Wr r20) {
        super(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, newsletterLinkLauncher, r15, r16, r17, r18, r19, r20);
        this.A09.setId(R.id.status_playback_gif);
    }

    public void A07() {
        this.A04 = 0;
        this.A01 = 0;
        this.A00 = 0.0f;
        super.A07();
        AnonymousClass5YG r2 = this.A02;
        if (r2 != null) {
            r2.A07 = new AnonymousClass69R(this, 1);
        }
    }

    public long A02() {
        int i = this.A02;
        if (i > 0) {
            return (long) (i * this.A03);
        }
        long A022 = super.A02();
        return A022 * ((long) A0L(A022));
    }

    public void A08() {
        AnonymousClass5YG r1 = this.A02;
        if (r1 != null) {
            r1.A07 = null;
        }
        super.A08();
    }

    public final int A0L(long j) {
        if (this.A02 instanceof AnonymousClass564) {
            return 1;
        }
        if (j == 0) {
            return 3;
        }
        return (int) Math.max(3, ((long) 6000) / j);
    }
}

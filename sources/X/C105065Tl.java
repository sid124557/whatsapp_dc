package X;

import android.content.res.Resources;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.chatinfo.view.custom.NewsletterDetailsCard;
import java.text.NumberFormat;

/* renamed from: X.5Tl  reason: invalid class name and case insensitive filesystem */
public final class C105065Tl {
    public AnonymousClass3ZH A00;
    public final C69263Wi A01;
    public final NewsletterDetailsCard A02;
    public final C620633i A03;
    public final C620733j A04;
    public final C113835m4 A05;
    public final C103985Pe A06;

    public final void A01(AnonymousClass1RL r5) {
        String A002;
        C104595Rp A012;
        AnonymousClass1RL r0;
        C162457s7.A0J(r5, 0);
        if (r5.A0K) {
            A002 = C18290x4.A0l(this.A02.getContext(), R.string.f11nameremoved);
        } else {
            String str = r5.A0F;
            if (str == null || str.length() == 0 || (A002 = AnonymousClass0x2.A0e(str, AnonymousClass001.A0o(), '@')) == null) {
                A002 = A00(r5);
            }
        }
        NewsletterDetailsCard newsletterDetailsCard = this.A02;
        newsletterDetailsCard.A0C.setTextDirection(5);
        newsletterDetailsCard.setSubTitle(A002);
        newsletterDetailsCard.setTitleOnLongClickListener((View.OnLongClickListener) null);
        AnonymousClass3ZH r02 = this.A00;
        if (r02 == null) {
            throw C18270x1.A0S("waContact");
        }
        C95814uZ r1 = r02.A0H;
        if (r1 != null && (A012 = this.A05.A01(r1)) != null && (r0 = A012.A00) != null) {
            newsletterDetailsCard.setupActionButtons(r0);
        }
    }

    public final String A00(AnonymousClass1RL r9) {
        String quantityString;
        boolean A002 = this.A06.A00(r9);
        NewsletterDetailsCard newsletterDetailsCard = this.A02;
        if (A002) {
            quantityString = newsletterDetailsCard.getContext().getString(R.string.f11nameremoved);
        } else {
            Resources A0G = C18290x4.A0G(newsletterDetailsCard);
            long j = r9.A05;
            Object[] A0L = AnonymousClass002.A0L();
            String format = NumberFormat.getInstance(C620733j.A02(this.A04)).format(j);
            C162457s7.A0D(format);
            A0L[0] = format;
            quantityString = A0G.getQuantityString(R.plurals.f9nameremoved, (int) j, A0L);
        }
        C162457s7.A0H(quantityString);
        return quantityString;
    }

    public final void A02(AnonymousClass3ZH r6) {
        C104595Rp A012;
        AnonymousClass1RL r2;
        C104595Rp A013;
        AnonymousClass1RL r0;
        String str;
        this.A00 = r6;
        NewsletterDetailsCard newsletterDetailsCard = this.A02;
        newsletterDetailsCard.setContact(r6);
        C95814uZ r1 = r6.A0H;
        if (!(r1 == null || (A013 = this.A05.A01(r1)) == null || (r0 = A013.A00) == null || (str = r0.A0H) == null)) {
            newsletterDetailsCard.setTitleOnLongClickListener(new C636039w(this.A01, this.A03, str));
        }
        C95814uZ r12 = r6.A0H;
        if (r12 != null && (A012 = this.A05.A01(r12)) != null && (r2 = A012.A00) != null) {
            String str2 = r2.A0F;
            int i = 0;
            if (str2 == null || str2.length() == 0) {
                i = 8;
            }
            newsletterDetailsCard.setContactChatStatusVisibility(i);
            if (i == 0) {
                newsletterDetailsCard.setContactChatStatus(A00(r2));
            }
            A01(r2);
            if (!r2.A0K && !this.A06.A00(r2)) {
                if (AnonymousClass000.A1Y(r2.A07, C372821q.GUEST)) {
                    newsletterDetailsCard.A07();
                } else if (!r2.A0K()) {
                    newsletterDetailsCard.A06();
                }
            }
        }
    }

    public C105065Tl(C69263Wi r2, NewsletterDetailsCard newsletterDetailsCard, C620633i r4, C620733j r5, C95104sd r6, C113835m4 r7, C103985Pe r8) {
        C18260x0.A0e(r2, r4, r5, r7);
        C162457s7.A0J(r8, 6);
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r7;
        this.A06 = r8;
        this.A02 = newsletterDetailsCard;
        newsletterDetailsCard.A0V = r6;
    }
}

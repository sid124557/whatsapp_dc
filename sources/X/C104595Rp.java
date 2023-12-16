package X;

import com.whatsapp.newsletter.viewmodel.NewsletterViewModel;

/* renamed from: X.5Rp  reason: invalid class name and case insensitive filesystem */
public final class C104595Rp {
    public final AnonymousClass1RL A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C104595Rp) {
                C104595Rp r5 = (C104595Rp) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static AnonymousClass1RL A00(NewsletterViewModel newsletterViewModel) {
        C104595Rp A012 = newsletterViewModel.A03.A01(newsletterViewModel.A00);
        C162457s7.A0K(A012, "null cannot be cast to non-null type com.whatsapp.newsletter.cache.NewsletterState");
        return A012.A00;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(C18300x5.A04(this.A00), this.A01);
    }

    public C104595Rp(AnonymousClass1RL r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NewsletterState(newsletter=");
        A0o.append(this.A00);
        A0o.append(", animated=");
        return C18260x0.A0A(A0o, this.A01);
    }
}

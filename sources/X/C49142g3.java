package X;

import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType;

/* renamed from: X.2g3  reason: invalid class name and case insensitive filesystem */
public final class C49142g3 {
    public final C56652sL A00;
    public final C95804uY A01;
    public final C56842se A02;

    public C49142g3(C56652sL r2, C95804uY r3, C56842se r4) {
        C162457s7.A0J(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    public final void A00(int i) {
        C56842se r2;
        C95804uY r1;
        C372321l r0;
        if (i != 404) {
            if (i == 423) {
                r2 = this.A02;
                r1 = this.A01;
                r0 = C372321l.SUSPENDED;
            } else if (i == 451) {
                r2 = this.A02;
                r1 = this.A01;
                r0 = C372321l.GEOSUSPENDED;
            } else {
                return;
            }
            r2.A04(r0, r1);
            return;
        }
        this.A02.A07(this.A01);
    }

    public final void A01(GraphQLXWA2NewsletterStateType graphQLXWA2NewsletterStateType) {
        if (graphQLXWA2NewsletterStateType != null) {
            int ordinal = graphQLXWA2NewsletterStateType.ordinal();
            int i = 423;
            if (ordinal != 2) {
                i = 451;
                if (ordinal != 3) {
                    if (ordinal == 5) {
                        i = 404;
                    } else {
                        return;
                    }
                }
            }
            Integer valueOf = Integer.valueOf(i);
            if (valueOf != null) {
                A00(valueOf.intValue());
            }
        }
    }
}

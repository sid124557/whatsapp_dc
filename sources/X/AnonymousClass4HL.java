package X;

import com.whatsapp.infra.graphql.BaseMexCallback;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterJoinResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMutationResponseFragmentImpl;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMuteResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterUnmuteResponseImpl;

/* renamed from: X.4HL  reason: invalid class name */
public class AnonymousClass4HL extends BaseMexCallback {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass4HL(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A02 = obj3;
        this.A01 = obj;
        this.A00 = obj2;
    }

    public /* bridge */ /* synthetic */ void A00(C153197aq r7) {
        NewsletterMutationResponseFragmentImpl newsletterMutationResponseFragmentImpl;
        NewsletterMutationResponseFragmentImpl newsletterMutationResponseFragmentImpl2;
        NewsletterMutationResponseFragmentImpl newsletterMutationResponseFragmentImpl3;
        switch (this.A03) {
            case 0:
                C162457s7.A0J(r7, 0);
                AnonymousClass2QN r2 = (AnonymousClass2QN) this.A02;
                C153197aq A002 = r7.A00(NewsletterMuteResponseImpl.Xwa2NewsletterMuteV2.class, "xwa2_newsletter_mute_v2");
                if (A002 != null) {
                    newsletterMutationResponseFragmentImpl3 = new NewsletterMutationResponseFragmentImpl(A002.A00);
                } else {
                    newsletterMutationResponseFragmentImpl3 = null;
                }
                if (!C162047r8.A05(newsletterMutationResponseFragmentImpl3)) {
                    C55082pl r4 = r2.A01;
                    AnonymousClass21F r3 = AnonymousClass21F.MUTE;
                    C136776nF r1 = new C136776nF((String) null, 0);
                    C162457s7.A0J(r3, 0);
                    r4.A04.A09((C95804uY) this.A01, r3, r1);
                    return;
                }
                r2.A01.A01((C95804uY) this.A01, true);
                return;
            case 1:
                C162457s7.A0J(r7, 0);
                AnonymousClass2QN r22 = (AnonymousClass2QN) this.A02;
                C153197aq A003 = r7.A00(NewsletterUnmuteResponseImpl.Xwa2NewsletterUnmuteV2.class, "xwa2_newsletter_unmute_v2");
                if (A003 != null) {
                    newsletterMutationResponseFragmentImpl2 = new NewsletterMutationResponseFragmentImpl(A003.A00);
                } else {
                    newsletterMutationResponseFragmentImpl2 = null;
                }
                boolean A05 = C162047r8.A05(newsletterMutationResponseFragmentImpl2);
                C55082pl r42 = r22.A01;
                if (!A05) {
                    AnonymousClass21F r32 = AnonymousClass21F.UNMUTE;
                    C136776nF r12 = new C136776nF((String) null, 0);
                    C162457s7.A0J(r32, 0);
                    r42.A04.A09((C95804uY) this.A01, r32, r12);
                    return;
                }
                r42.A01((C95804uY) this.A01, false);
                return;
            case 2:
                C162457s7.A0J(r7, 0);
                AnonymousClass2SP r43 = (AnonymousClass2SP) this.A02;
                C153197aq A004 = r7.A00(NewsletterJoinResponseImpl.Xwa2NewsletterJoinV2.class, "xwa2_newsletter_join_v2");
                if (A004 != null) {
                    newsletterMutationResponseFragmentImpl = new NewsletterMutationResponseFragmentImpl(A004.A00);
                } else {
                    newsletterMutationResponseFragmentImpl = null;
                }
                if (!C162047r8.A05(newsletterMutationResponseFragmentImpl)) {
                    r43.A02.A09((C95804uY) this.A01, AnonymousClass21F.FOLLOW, new C136776nF((String) null, 0));
                    return;
                }
                C18260x0.A1P(AnonymousClass001.A0o(), "SubscribeNewsletterRequest/onResponse ", r7);
                C56652sL r13 = r43.A00;
                C95804uY r33 = (C95804uY) this.A01;
                r13.A08(C372821q.SUBSCRIBED, r33);
                r43.A04.A0D(r33);
                C56212rc r23 = r43.A03;
                AnonymousClass31A A0A = r23.A02.A0A(r33, false);
                if (!(A0A instanceof AnonymousClass1RL) || A0A == null) {
                    throw AnonymousClass001.A0e("NewsletterInfo expected in chatCache");
                }
                C70113Zy.A01(r23.A0D, r23, r33, 47);
                r43.A02.A08(r33, AnonymousClass21F.FOLLOW);
                return;
            default:
                C18260x0.A1P(C18270x1.A0X(r7), "UnsubscribeNewsletterRequest/onResponse ", r7);
                AnonymousClass2SP r34 = (AnonymousClass2SP) this.A02;
                C56652sL r14 = r34.A00;
                C95804uY r24 = (C95804uY) this.A01;
                r14.A08(C372821q.GUEST, r24);
                r34.A04.A0D(r24);
                r34.A02.A08(r24, AnonymousClass21F.UNFOLLOW);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
        r3.A09((X.C95804uY) r5.A01, r2, X.C1452274r.A00(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0063, code lost:
        r1 = X.C1452274r.A00(r6);
        X.C162457s7.A0J(r3, r4);
        r0.A04.A09((X.C95804uY) r5.A01, r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(X.C160327nS r6) {
        /*
            r5 = this;
            int r0 = r5.A03
            switch(r0) {
                case 0: goto L_0x0032;
                case 1: goto L_0x004b;
                case 2: goto L_0x0074;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.StringBuilder r1 = X.C18270x1.A0X(r6)
            java.lang.String r0 = "UnsubscribeNewsletterRequest/onFailure "
            X.C18260x0.A1P(r1, r0, r6)
            X.8t1 r0 = r6.A00()
            int r1 = r0.B5a()
            java.lang.Object r0 = r5.A00
            X.2g3 r0 = (X.C49142g3) r0
            r0.A00(r1)
            java.lang.Object r0 = r5.A02
            X.2SP r0 = (X.AnonymousClass2SP) r0
            X.1ic r3 = r0.A02
            X.21F r2 = X.AnonymousClass21F.UNFOLLOW
        L_0x0025:
            java.lang.Object r1 = r5.A01
            X.4uY r1 = (X.C95804uY) r1
            X.8SE r0 = X.C1452274r.A00(r6)
            r3.A09(r1, r2, r0)
        L_0x0030:
            r0 = 0
            return r0
        L_0x0032:
            r4 = 0
            X.8t1 r0 = r6.A00()
            int r1 = r0.B5a()
            java.lang.Object r0 = r5.A00
            X.2g3 r0 = (X.C49142g3) r0
            r0.A00(r1)
            java.lang.Object r0 = r5.A02
            X.2QN r0 = (X.AnonymousClass2QN) r0
            X.2pl r0 = r0.A01
            X.21F r3 = X.AnonymousClass21F.MUTE
            goto L_0x0063
        L_0x004b:
            r4 = 0
            java.lang.Object r1 = r5.A00
            X.2g3 r1 = (X.C49142g3) r1
            X.8t1 r0 = r6.A00()
            int r0 = r0.B5a()
            r1.A00(r0)
            java.lang.Object r0 = r5.A02
            X.2QN r0 = (X.AnonymousClass2QN) r0
            X.2pl r0 = r0.A01
            X.21F r3 = X.AnonymousClass21F.UNMUTE
        L_0x0063:
            java.lang.Object r2 = r5.A01
            X.4uY r2 = (X.C95804uY) r2
            X.8SE r1 = X.C1452274r.A00(r6)
            X.C162457s7.A0J(r3, r4)
            X.1ic r0 = r0.A04
            r0.A09(r2, r3, r1)
            goto L_0x0030
        L_0x0074:
            java.lang.StringBuilder r1 = X.C18270x1.A0X(r6)
            java.lang.String r0 = "SubscribeNewsletterRequest/onFailure "
            X.C18260x0.A1P(r1, r0, r6)
            X.8t1 r0 = r6.A00()
            int r1 = r0.B5a()
            java.lang.Object r0 = r5.A00
            X.2g3 r0 = (X.C49142g3) r0
            r0.A00(r1)
            java.lang.Object r0 = r5.A02
            X.2SP r0 = (X.AnonymousClass2SP) r0
            X.1ic r3 = r0.A02
            X.21F r2 = X.AnonymousClass21F.FOLLOW
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4HL.A04(X.7nS):boolean");
    }
}

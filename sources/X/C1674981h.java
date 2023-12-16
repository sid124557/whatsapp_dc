package X;

import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;

/* renamed from: X.81h  reason: invalid class name and case insensitive filesystem */
public class C1674981h implements C177658gE {
    public static final AnonymousClass7V5 A05 = new AnonymousClass7V5(new AnonymousClass7W8(new AnonymousClass7JL()));
    public int A00 = 0;
    public C1677082e A01;
    public final C160307nP A02;
    public final AbrContextAwareConfiguration A03;
    public final C1445071v A04;

    public C1674981h(AbrContextAwareConfiguration abrContextAwareConfiguration, C1445071v r5) {
        C160307nP r0;
        C186588vc r2 = C186588vc.A00;
        this.A01 = new C1677082e(this, r2, this, abrContextAwareConfiguration.abrSetting.shouldCountFirstChunkOnly);
        synchronized (C160307nP.class) {
            r0 = C160307nP.A07;
            if (r0 == null) {
                r0 = new C160307nP(r2);
                C160307nP.A07 = r0;
            }
        }
        this.A02 = r0;
        this.A04 = r5;
        this.A03 = abrContextAwareConfiguration;
    }
}

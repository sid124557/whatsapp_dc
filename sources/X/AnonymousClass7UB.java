package X;

import android.content.Context;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* renamed from: X.7UB  reason: invalid class name */
public class AnonymousClass7UB {
    public Context A00;
    public AnonymousClass7TL A01;
    public C154787dk A02;
    public C180608lL A03;
    public C1445471z A04;
    public AnonymousClass720 A05;
    public C147757Fp A06;

    public C186348v9 A00(C158667kM r12, C153257aw r13, AnonymousClass7QR r14, C183838qk r15, ExecutorService executorService) {
        AnonymousClass7TL r1;
        AnonymousClass7QR r8 = r14;
        C183838qk r9 = r15;
        if (AnonymousClass000.A1S("image/gif".equals(AnonymousClass726.A00(r13.A02.getPath(), "video/mp4")) ? 1 : 0) && (r1 = this.A01) != null) {
            Context context = this.A00;
            Objects.requireNonNull(r1);
            return new C1684485l(context, r1, r14, r15);
        } else if (r13.A01()) {
            return new C1684385k(this.A02, r14, r15);
        } else {
            C147757Fp r7 = this.A06;
            return new C1684685n(this.A03, r12, this.A04, this.A05, r7, r8, r9, executorService);
        }
    }

    public AnonymousClass7UB(Context context, AnonymousClass7TL r2, C154787dk r3, C180608lL r4, C1445471z r5, AnonymousClass720 r6, C147757Fp r7) {
        this.A00 = context;
        this.A06 = r7;
        this.A04 = r5;
        this.A03 = r4;
        this.A05 = r6;
        this.A02 = r3;
        this.A01 = r2;
    }
}

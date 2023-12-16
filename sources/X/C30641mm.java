package X;

import com.whatsapp.jobqueue.job.RotateSignedPreKeyJob;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1mm  reason: invalid class name and case insensitive filesystem */
public class C30641mm extends C54252oQ {
    public final /* synthetic */ RotateSignedPreKeyJob A00;
    public final /* synthetic */ AtomicInteger A01;
    public final /* synthetic */ AtomicReference A02;

    public C30641mm(RotateSignedPreKeyJob rotateSignedPreKeyJob, AtomicInteger atomicInteger, AtomicReference atomicReference) {
        this.A00 = rotateSignedPreKeyJob;
        this.A01 = atomicInteger;
        this.A02 = atomicReference;
    }

    public void A01(AnonymousClass36K r4) {
        AnonymousClass36K A0m = r4.A0m("error");
        this.A01.set(AnonymousClass36K.A01(A0m, "code"));
        AnonymousClass36K A0l = A0m.A0l("identity");
        if (A0l != null) {
            this.A02.set(A0l.A01);
        }
    }

    public void A02(AnonymousClass36K r4) {
        RotateSignedPreKeyJob rotateSignedPreKeyJob = this.A00;
        if (rotateSignedPreKeyJob.A01.A0X()) {
            rotateSignedPreKeyJob.A01.A0L(AnonymousClass36A.A00(rotateSignedPreKeyJob.id));
            return;
        }
        C48972fm r2 = rotateSignedPreKeyJob.A02;
        r2.A00.submit(C70003Zm.A00(this, 49));
    }
}

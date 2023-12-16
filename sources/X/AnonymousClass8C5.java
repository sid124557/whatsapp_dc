package X;

import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityServiceException;
import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* renamed from: X.8C5  reason: invalid class name */
public final class AnonymousClass8C5 implements IntegrityManager {
    public final AnonymousClass7K1 A00;

    public final Task requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        AnonymousClass7K1 r8 = this.A00;
        C158887ki r3 = r8.A00;
        if (r3 == null) {
            IntegrityServiceException integrityServiceException = new IntegrityServiceException((Throwable) null, -2);
            AnonymousClass6YV r1 = new AnonymousClass6YV();
            r1.A03(integrityServiceException);
            return r1;
        }
        IntegrityTokenRequest integrityTokenRequest2 = integrityTokenRequest;
        try {
            AnonymousClass6ZY r2 = (AnonymousClass6ZY) integrityTokenRequest2;
            byte[] decode = Base64.decode(r2.A01, 10);
            Long l = r2.A00;
            r8.A01.A02("requestIntegrityToken(%s)", AnonymousClass000.A1b(integrityTokenRequest));
            C152017Xf r5 = new C152017Xf();
            C129196Zp r4 = new C129196Zp(r5, r5, integrityTokenRequest2, r8, l, decode);
            r3.A00().post(new C129166Zm(r4.A00, r5, r3, r4));
            return r5.A00;
        } catch (IllegalArgumentException e) {
            IntegrityServiceException integrityServiceException2 = new IntegrityServiceException(e, -13);
            AnonymousClass6YV r12 = new AnonymousClass6YV();
            r12.A03(integrityServiceException2);
            return r12;
        }
    }

    public AnonymousClass8C5(AnonymousClass7K1 r1) {
        this.A00 = r1;
    }
}

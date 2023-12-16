package X;

import com.whatsapp.R;
import com.whatsapp.status.playback.MessageReplyActivity;
import java.io.File;

/* renamed from: X.6Bs  reason: invalid class name and case insensitive filesystem */
public class C124296Bs implements C1227265m {
    public Object A00;
    public final int A01;

    public C124296Bs(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BaM(AnonymousClass5I8 r10) {
        AnonymousClass2z0 r1;
        AnonymousClass5ZT r4;
        if (this.A01 != 0) {
            MessageReplyActivity messageReplyActivity = (MessageReplyActivity) this.A00;
            C102395Ir r2 = r10.A01;
            if (r2 != null && (r1 = r2.A01) != null && C86664Kz.A1X(messageReplyActivity.A11, r1) && (r4 = messageReplyActivity.A1N) != null) {
                r4.A0M(r2.A02, (File) null, true, false);
                return;
            }
            return;
        }
        C113245l7 r42 = (C113245l7) this.A00;
        C102395Ir r3 = r10.A01;
        if (r3 != null) {
            r42.A0w();
            C624134x r12 = r10.A00;
            if (r12 != null) {
                if (!(r12.A1J.A00 instanceof C135166kE)) {
                    r42.A3B.A0S(r12);
                } else {
                    return;
                }
            }
            if (r42.A5q != null) {
                r42.A29(r12, false);
                AnonymousClass5ZT r13 = r42.A5q;
                File file = r3.A02;
                File file2 = r3.A00;
                r13.A0M(file, file2, true, false);
                AnonymousClass5ZT r43 = r42.A5q;
                C116635qb r32 = r43.A1D;
                C109395eY.A00(r32.A0D, r43.A1K, 47);
                r32.A00();
                r32.A01(R.drawable.ic_resume_draft_preview);
                r43.A1A.BkM(new C70513ac(r43, file, file2, (Object) null, 18));
            }
        }
    }
}

package X;

import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.52b  reason: invalid class name and case insensitive filesystem */
public final class C985852b extends C150487Qx {
    public final /* synthetic */ C116175pr A00;

    public C985852b(C116175pr r1) {
        this.A00 = r1;
    }

    public void A00() {
        AnonymousClass5ZQ r1;
        C116175pr r4 = this.A00;
        try {
            r1 = AnonymousClass5ZQ.A00(r4.A0D, r4.A0E, (AnonymousClass5NV) r4.A0J.get(), r4.A0K, 3);
            try {
                r1.A05();
                r4.A02 = r1;
                if (r1 != null) {
                    try {
                        Object A07 = r4.A07.A07();
                        if (A07 != null) {
                            r1.A0A(AnonymousClass001.A0K(A07));
                            r1.A08();
                            C104995Td r2 = r4.A0I;
                            r2.A02(R.string.f11nameremoved);
                            r4.A04.post(r4.A03);
                            r2.A01();
                            r4.A08.A0H(new C138016pd(r4));
                            return;
                        }
                        throw C18300x5.A0X();
                    } catch (IOException e) {
                        Log.e((Throwable) e);
                    }
                }
                r4.A0C.A0H(R.string.f11nameremoved, 0);
                return;
            } catch (IllegalStateException e2) {
                e = e2;
                r4.A0B.A0A("VoiceRecordingPreviewController/failed to prepare audio player", true, e.toString());
            } catch (IOException e3) {
                e = e3;
                r4.A0B.A0A("VoiceRecordingPreviewController/failed to prepare audio player", true, e.toString());
            }
            throw e;
        } catch (IOException e4) {
            Log.e((Throwable) e4);
            r1 = null;
        }
    }
}

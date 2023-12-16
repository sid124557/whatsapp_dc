package X;

import com.whatsapp.registration.VerifyPhoneNumber;
import com.whatsapp.util.Log;

/* renamed from: X.91E  reason: invalid class name */
public class AnonymousClass91E implements AnonymousClass49Y {
    public Object A00;
    public final int A01;

    public AnonymousClass91E(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BPq(C59622xD r6) {
        C56742sU r2;
        String str;
        boolean z;
        int i;
        C183288pn r0;
        C56742sU r22;
        switch (this.A01) {
            case 0:
                ((VerifyPhoneNumber) this.A00).A7D();
                return;
            case 1:
                C1691588f r3 = (C1691588f) this.A00;
                if (!r3.A01.isFinishing() && r6.A01 && (r2 = r3.A06) != null && r2.A00() == 4 && r2.A0A()) {
                    Log.i("MediaViewStreamingVideoPlayer/auto-retry");
                    str = "";
                    z = true;
                    i = 2;
                    r0 = r3.A07;
                    break;
                } else {
                    return;
                }
                break;
            default:
                C1675981r r32 = (C1675981r) this.A00;
                if (!r32.A01.isFinishing() && r6.A01 && (r22 = r32.A06) != null && r22.A00() == 4 && r22.A0A()) {
                    Log.i("MediaViewStreamingVideoPlayer/auto-retry");
                    str = "";
                    z = true;
                    i = 2;
                    r0 = r32.A07;
                    break;
                } else {
                    return;
                }
        }
        if (r0 != null) {
            r0.BcQ(str, z, i);
        }
    }
}

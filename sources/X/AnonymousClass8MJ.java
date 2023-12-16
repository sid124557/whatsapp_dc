package X;

import com.whatsapp.voipcalling.Voip;

/* renamed from: X.8MJ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8MJ implements Runnable {
    public final /* synthetic */ C107285b3 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public final void run() {
        C107285b3 r0 = this.A00;
        boolean z = this.A02;
        boolean z2 = this.A03;
        String str = this.A01;
        C56972sr r02 = r0.A1e;
        if (r02 != null) {
            r02.A0P();
            if (r02.A01 == null) {
                return;
            }
            if (z) {
                if (z2) {
                    Voip.endCallAndAcceptPendingCallWithVideoStopped(str);
                } else {
                    Voip.endCallAndAcceptPendingCall(str);
                }
            } else if (z2) {
                Voip.acceptCallWithVideoStopped();
            } else {
                Voip.acceptCall();
            }
        }
    }

    public /* synthetic */ AnonymousClass8MJ(C107285b3 r1, String str, boolean z, boolean z2) {
        this.A00 = r1;
        this.A02 = z;
        this.A03 = z2;
        this.A01 = str;
    }
}

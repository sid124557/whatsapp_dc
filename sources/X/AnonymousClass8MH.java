package X;

import com.whatsapp.voipcalling.Voip;

/* renamed from: X.8MH  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8MH implements Runnable {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public final void run() {
        boolean z = this.A02;
        String str = this.A00;
        String str2 = this.A01;
        if (z) {
            Voip.rejectPendingCall(str);
        } else {
            Voip.rejectCall(str, str2);
        }
    }

    public /* synthetic */ AnonymousClass8MH(String str, boolean z, String str2) {
        this.A02 = z;
        this.A00 = str;
        this.A01 = str2;
    }
}

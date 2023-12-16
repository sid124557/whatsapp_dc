package X;

/* renamed from: X.4KL  reason: invalid class name */
public class AnonymousClass4KL implements AnonymousClass4EZ {
    public Object A00;
    public String A01;
    public final int A02;

    public AnonymousClass4KL(int i, String str, Object obj) {
        this.A02 = i;
        this.A01 = str;
        this.A00 = obj;
    }

    public void BQs(String str) {
        if (this.A02 != 0) {
            StringBuilder A0X = C18270x1.A0X(str);
            A0X.append("VoiceChatAcceptPingManager/sendPing/onDeliveryFailure: callId = ");
            String str2 = this.A01;
            A0X.append(str2);
            C18260x0.A0r(", iqId = ", str, A0X);
            C46622bw r4 = (C46622bw) this.A00;
            AnonymousClass2QR r3 = (AnonymousClass2QR) r4.A05.remove(str2);
            if (r3 != null) {
                C56732sT r2 = r4.A03;
                C70013Zn.A00(r2.A07, r2, 23);
                r4.A00.A03.A09(C18290x4.A0J(206, r3), r3.A03);
                return;
            }
            return;
        }
        StringBuilder A0X2 = C18270x1.A0X(str);
        A0X2.append("CallingIncomingPushObserver/sendPing/onDeliveryFailure: callId = ");
        A0X2.append(this.A01);
        C18260x0.A0r(", iqId = ", str, A0X2);
        C56732sT r22 = ((AnonymousClass3U1) this.A00).A05;
        C70013Zn.A00(r22.A07, r22, 23);
    }

    public void BSN(AnonymousClass36K r4, String str) {
        if (this.A02 != 0) {
            StringBuilder A0X = C18270x1.A0X(str);
            A0X.append("VoiceChatAcceptPingManager/sendPing/onError: callId = ");
            String str2 = this.A01;
            A0X.append(str2);
            C18260x0.A0r(", iqId = ", str, A0X);
            ((C46622bw) this.A00).A05.remove(str2);
            return;
        }
        StringBuilder A0X2 = C18270x1.A0X(str);
        A0X2.append("CallingIncomingPushObserver/sendPing/onError: callId = ");
        A0X2.append(this.A01);
        C18260x0.A0r(", iqId = ", str, A0X2);
    }

    public void BdM(AnonymousClass36K r4, String str) {
        if (this.A02 != 0) {
            StringBuilder A0X = C18270x1.A0X(str);
            A0X.append("VoiceChatAcceptPingManager/sendPing/onSuccess: callId = ");
            String str2 = this.A01;
            A0X.append(str2);
            C18260x0.A0s(", iqId = ", str, A0X);
            ((C46622bw) this.A00).A05.remove(str2);
            return;
        }
        StringBuilder A0X2 = C18270x1.A0X(str);
        A0X2.append("CallingIncomingPushObserver/sendPing/onSuccess: callId = ");
        A0X2.append(this.A01);
        C18260x0.A0s(", iqId = ", str, A0X2);
    }
}

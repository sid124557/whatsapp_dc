package X;

import com.whatsapp.calling.service.OutgoingSignalingHandler;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.2Vh  reason: invalid class name and case insensitive filesystem */
public class C44262Vh {
    public final /* synthetic */ C107285b3 A00;

    public C44262Vh(C107285b3 r1) {
        this.A00 = r1;
    }

    public void A00(DeviceJid deviceJid) {
        C18260x0.A1R(AnonymousClass001.A0o(), "VoiceService/notifyNewSessionEstablished ", deviceJid);
        OutgoingSignalingHandler outgoingSignalingHandler = this.A00.A26;
        outgoingSignalingHandler.sendPendingCallOfferStanza(deviceJid, Voip.getCurrentCallId(), false);
        outgoingSignalingHandler.sendOfferRetryRequest(deviceJid);
        outgoingSignalingHandler.sendPendingRekeyRequest(deviceJid);
    }
}

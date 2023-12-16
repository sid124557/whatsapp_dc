package X;

import com.whatsapp.calling.service.OutgoingSignalingHandler;
import com.whatsapp.jid.Jid;
import com.whatsapp.protocol.VoipStanzaChildNode;
import java.util.Map;

/* renamed from: X.3bK  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70953bK implements Runnable {
    public final /* synthetic */ C46602bu A00;
    public final /* synthetic */ OutgoingSignalingHandler A01;
    public final /* synthetic */ Jid A02;
    public final /* synthetic */ VoipStanzaChildNode A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ Map A06;
    public final /* synthetic */ boolean A07;

    public final void run() {
        this.A01.lambda$sendOfferStanza$1(this.A07, this.A02, this.A04, this.A06, this.A00, this.A03, this.A05);
    }

    public /* synthetic */ C70953bK(OutgoingSignalingHandler outgoingSignalingHandler, boolean z, Jid jid, String str, Map map, C46602bu r6, VoipStanzaChildNode voipStanzaChildNode, String str2) {
        this.A01 = outgoingSignalingHandler;
        this.A07 = z;
        this.A02 = jid;
        this.A04 = str;
        this.A06 = map;
        this.A00 = r6;
        this.A03 = voipStanzaChildNode;
        this.A05 = str2;
    }
}

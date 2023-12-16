package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.protocol.VoipStanzaChildNode;

/* renamed from: X.2QR  reason: invalid class name */
public class AnonymousClass2QR {
    public final Jid A00;
    public final VoipStanzaChildNode A01;
    public final String A02;
    public final String A03;

    public AnonymousClass2QR(Jid jid, String str, String str2, VoipStanzaChildNode voipStanzaChildNode) {
        if (C627336j.A0J(jid)) {
            this.A03 = str;
            this.A00 = jid;
            this.A02 = str2;
            this.A01 = voipStanzaChildNode;
            return;
        }
        throw AnonymousClass000.A0E(jid, "CallStanza:Wrong jid type: ", AnonymousClass001.A0o());
    }
}

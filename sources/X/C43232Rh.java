package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.protocol.VoipStanzaChildNode;

/* renamed from: X.2Rh  reason: invalid class name and case insensitive filesystem */
public class C43232Rh {
    public final int A00;
    public final Jid A01;
    public final String A02;
    public final String A03;
    public final VoipStanzaChildNode[] A04;

    public C43232Rh(Jid jid, String str, String str2, VoipStanzaChildNode[] voipStanzaChildNodeArr, int i) {
        if (C627336j.A0J(jid)) {
            this.A02 = str;
            this.A01 = jid;
            this.A03 = str2;
            this.A00 = i;
            this.A04 = voipStanzaChildNodeArr;
            return;
        }
        throw AnonymousClass000.A0E(jid, "CallIncomingAck:Wrong jid type: ", AnonymousClass001.A0o());
    }
}

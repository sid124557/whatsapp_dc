package X;

/* renamed from: X.3OP  reason: invalid class name */
public class AnonymousClass3OP implements AnonymousClass4AH {
    public final C55682qk A00;

    public void BsE(C55962rC r5, C624134x r6) {
        String str = r5.A0J;
        String str2 = r5.A0L;
        if ("poll".equals(str) && "vote".equals(str2) && r6 != null && !(r6 instanceof C30591mh)) {
            if (!(r6 instanceof C30351mJ) || ((C30351mJ) r6).A00 != 67) {
                C55682qk r3 = this.A00;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("type=");
                A0o.append(str);
                C624134x.A0T(r6, " media_wa_type=", A0o);
                r3.A0A("MessageUtils/buildFMessage message type does not correspond to an encoded message", false, A0o.toString());
                throw AnonymousClass24W.A01(76, "poll_update_message_stanza_invalid");
            }
        }
    }

    public AnonymousClass3OP(C55682qk r1) {
        this.A00 = r1;
    }
}

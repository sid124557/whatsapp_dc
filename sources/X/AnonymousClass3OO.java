package X;

/* renamed from: X.3OO  reason: invalid class name */
public class AnonymousClass3OO implements AnonymousClass4AH {
    public final C55682qk A00;

    public void BsE(C55962rC r5, C624134x r6) {
        int i = r5.A01;
        if (2 == i && r6 != null && !(r6 instanceof C30561me)) {
            if (!(r6 instanceof C30351mJ) || ((C30351mJ) r6).A00 != 79) {
                C55682qk r3 = this.A00;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("edit=");
                A0o.append(i);
                C624134x.A0T(r6, " media_wa_type=", A0o);
                r3.A0A("MessageUtils/buildFMessage message type does not correspond to an encoded message", false, A0o.toString());
                throw AnonymousClass24W.A01(76, "pin_in_chat_message_stanza_invalid");
            }
        }
    }

    public AnonymousClass3OO(C55682qk r1) {
        this.A00 = r1;
    }
}

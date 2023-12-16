package X;

/* renamed from: X.3OQ  reason: invalid class name */
public class AnonymousClass3OQ implements AnonymousClass4AH {
    public final C55682qk A00;

    public void BsE(C55962rC r5, C624134x r6) {
        String str = r5.A0J;
        if ("reaction".equals(str) && r6 != null && !(r6 instanceof C30571mf)) {
            C55682qk r3 = this.A00;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("type=");
            A0o.append(str);
            C624134x.A0T(r6, " media_wa_type=", A0o);
            r3.A0A("MessageUtils/buildFMessage message type does not correspond to an encoded message", false, A0o.toString());
            throw AnonymousClass24W.A00(76);
        }
    }

    public AnonymousClass3OQ(C55682qk r1) {
        this.A00 = r1;
    }
}

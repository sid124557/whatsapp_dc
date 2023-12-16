package X;

import java.util.ArrayList;

/* renamed from: X.1xF  reason: invalid class name and case insensitive filesystem */
public final class C35671xF extends C35201wU {
    public static final ArrayList A00 = C18260x0.A0C("0", "1");

    public C35671xF(C35361wk r6) {
        C56052rL A002 = C56052rL.A00();
        C56052rL.A0D(A002, "xmlns", "urn:xmpp:whatsapp:push");
        C56052rL A04 = C56052rL.A04("config");
        A04.A0K("1", "version", A00);
        C35201wU.A01(A04, A002, r6, this);
    }
}

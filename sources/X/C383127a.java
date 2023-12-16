package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.27a  reason: invalid class name and case insensitive filesystem */
public final class C383127a {
    public static final C27981fH A00(String str) {
        C27981fH r1;
        C162457s7.A0J(str, 0);
        UserJid A04 = UserJid.JID_FACTORY.A04(str, "lid");
        C162457s7.A0D(A04);
        if ((A04 instanceof C27981fH) && (r1 = (C27981fH) A04) != null) {
            return r1;
        }
        throw AnonymousClass24P.A00(AnonymousClass000.A0V("invalid lid: ", str, AnonymousClass001.A0o()));
    }
}

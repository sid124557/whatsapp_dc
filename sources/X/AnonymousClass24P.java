package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.24P  reason: invalid class name */
public class AnonymousClass24P extends Exception {
    public static AnonymousClass24P A00(String str) {
        return new AnonymousClass24P(str);
    }

    public AnonymousClass24P(Jid jid) {
        super(jid.toString());
    }

    public AnonymousClass24P(String str) {
        super(str);
    }
}

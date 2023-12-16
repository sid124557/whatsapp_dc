package X;

import java.util.AbstractCollection;

/* renamed from: X.4zQ  reason: invalid class name and case insensitive filesystem */
public class C97884zQ extends C156137g5 implements AnonymousClass659 {
    public final C95814uZ A00;

    public static void A00(C95814uZ r2, AbstractCollection abstractCollection) {
        abstractCollection.add(new C97884zQ(r2, 2));
    }

    public C95814uZ B8o() {
        if (this instanceof C97914zU) {
            return ((C97914zU) this).A00.A0H;
        }
        return this.A00;
    }

    public C97884zQ(C95814uZ r1, int i) {
        super(r1, i);
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ConversationConversationsListItem{jid=");
        return AnonymousClass000.A0Q(this.A00, A0o);
    }
}

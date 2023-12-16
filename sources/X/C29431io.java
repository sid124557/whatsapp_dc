package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1io  reason: invalid class name and case insensitive filesystem */
public class C29431io extends C29451iq {
    public long A00;

    public void A08(C95814uZ r3) {
        Iterator A04 = C61102zi.A04(this, "MessageObservers/notifyListChanged");
        while (A04.hasNext()) {
            A00(this, A04).BVB(r3);
        }
    }

    public void A09(C95814uZ r3) {
        Iterator A04 = C61102zi.A04(this, "MessageObservers/notifyMessagesDeleted");
        while (A04.hasNext()) {
            A00(this, A04).BWf(r3);
        }
    }

    public void A0A(C95814uZ r3, Collection collection, boolean z) {
        Iterator A04 = C61102zi.A04(this, "MessageObservers/notifyMessagesStarChanged");
        while (A04.hasNext()) {
            A00(this, A04).BWi(r3, collection, z);
        }
    }

    public void A0B(C624134x r3, int i) {
        Iterator A04 = C61102zi.A04(this, "MessageObservers/notifyMessageAdded");
        while (A04.hasNext()) {
            A00(this, A04).BWS(r3, i);
        }
    }

    public void A0D(C624134x r3, C624134x r4) {
        Iterator A04 = C61102zi.A04(this, "MessageObservers/notifyMessageReplaced");
        while (A04.hasNext()) {
            A00(this, A04).BWX(r3, r4);
        }
    }

    public void A0F(Collection collection, Map map) {
        Iterator A04 = C61102zi.A04(this, "MessageObservers/notifyMessagesDeleted");
        while (A04.hasNext()) {
            A00(this, A04).BWg(collection, map);
        }
    }

    public static AnonymousClass4FW A00(C29431io r5, Iterator it) {
        AnonymousClass4FW r4 = (AnonymousClass4FW) it.next();
        r5.A00++;
        return r4;
    }

    public void A0C(C624134x r3, int i) {
        C18260x0.A0w("MessageObservers/notifyMessageChanged updateType:", AnonymousClass001.A0o(), i);
        Iterator A03 = C61102zi.A03(this);
        while (A03.hasNext()) {
            A00(this, A03).BWU(r3, i);
        }
    }

    public void A0E(Collection collection, int i) {
        C18260x0.A0w("MessageObservers/notifyMessagesChanged updateType:", AnonymousClass001.A0o(), i);
        Iterator A03 = C61102zi.A03(this);
        while (A03.hasNext()) {
            A00(this, A03).BWe(collection, i);
        }
    }

    public C29431io(C183538qC r1) {
        super(r1);
    }

    public C29431io() {
        super(C72333dY.A02());
    }
}

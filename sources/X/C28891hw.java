package X;

import java.util.Iterator;

/* renamed from: X.1hw  reason: invalid class name and case insensitive filesystem */
public class C28891hw extends C61102zi {
    public void A08() {
        Iterator A04 = C61102zi.A04(this, "ConversationObservers/notifyConversationsListChanged");
        while (A04.hasNext()) {
            ((AnonymousClass4FI) A04.next()).BQI();
        }
    }

    public void A09(int i) {
        Iterator A03 = C61102zi.A03(this);
        while (A03.hasNext()) {
            ((AnonymousClass4FI) A03.next()).BQH(i);
        }
    }

    public void A0A(C95814uZ r3) {
        Iterator A03 = C61102zi.A03(this);
        while (A03.hasNext()) {
            ((AnonymousClass4FI) A03.next()).BQB(r3);
        }
    }

    public void A0B(C95814uZ r3) {
        C626936e.A06(r3);
        Iterator A03 = C61102zi.A03(this);
        while (A03.hasNext()) {
            ((AnonymousClass4FI) A03.next()).BQE(r3);
        }
    }

    public void A0C(C95814uZ r3, boolean z) {
        Iterator A03 = C61102zi.A03(this);
        while (A03.hasNext()) {
            ((AnonymousClass4FI) A03.next()).BQC(r3, z);
        }
    }

    public C28891hw(C183538qC r1) {
        super(r1);
    }
}

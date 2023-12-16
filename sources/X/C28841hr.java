package X;

import java.util.Iterator;

/* renamed from: X.1hr  reason: invalid class name and case insensitive filesystem */
public class C28841hr extends C61102zi {
    public void A08() {
        Iterator A03 = C61102zi.A03(this);
        while (A03.hasNext()) {
            ((AnonymousClass4FM) A03.next()).BOS();
        }
    }

    public void A09(int i) {
        Iterator A03 = C61102zi.A03(this);
        while (A03.hasNext()) {
            ((AnonymousClass4FM) A03.next()).onError(i);
        }
    }
}

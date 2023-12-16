package X;

import java.util.LinkedList;

/* renamed from: X.2wQ  reason: invalid class name and case insensitive filesystem */
public class C59142wQ {
    public LinkedList A00 = AnonymousClass0x9.A18();

    public C59152wR A00() {
        LinkedList linkedList = this.A00;
        if (!linkedList.isEmpty()) {
            return (C59152wR) AnonymousClass0x9.A0t(linkedList);
        }
        throw new AnonymousClass24S("No key state in record!");
    }

    public C59142wQ(byte[] bArr) {
        for (AnonymousClass1CY r2 : ((AnonymousClass1AD) C130786cX.A05(AnonymousClass1AD.DEFAULT_INSTANCE, bArr)).senderKeyStates_) {
            this.A00.add(new C59152wR(r2));
        }
    }

    public C59142wQ() {
    }
}

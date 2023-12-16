package X;

import java.math.BigInteger;
import java.util.Hashtable;

/* renamed from: X.8d5  reason: invalid class name and case insensitive filesystem */
public class C176488d5 extends AnonymousClass8Q0 {
    public static final Hashtable A01 = new Hashtable();
    public static final String[] A02 = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};
    public C176728dT A00;

    public static C176488d5 A0A(Object obj) {
        if (!(obj instanceof C176488d5)) {
            if (obj == null) {
                return null;
            }
            int A0U = C176728dT.A0A(obj).A0U();
            Integer valueOf = Integer.valueOf(A0U);
            Hashtable hashtable = A01;
            if (!hashtable.containsKey(valueOf)) {
                hashtable.put(valueOf, new C176488d5(A0U));
            }
            obj = hashtable.get(valueOf);
        }
        return (C176488d5) obj;
    }

    public String toString() {
        String str;
        int intValue = new BigInteger(this.A00.A01).intValue();
        if (intValue < 0 || intValue > 10) {
            str = "invalid";
        } else {
            str = A02[intValue];
        }
        return AnonymousClass000.A0V("CRLReason: ", str, AnonymousClass001.A0o());
    }

    public C176488d5(int i) {
        this.A00 = new C176728dT(i);
    }
}

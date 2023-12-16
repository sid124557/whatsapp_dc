package X;

import org.json.JSONObject;

/* renamed from: X.1o0  reason: invalid class name and case insensitive filesystem */
public final class C31261o0 extends C30341mI {
    public int A00;
    public int A01;

    public synchronized void A1Z(String str) {
        if (str != null) {
            JSONObject A1H = AnonymousClass0x9.A1H(str);
            this.A00 = A1H.getInt("bizOptOutAction");
            this.A01 = A1H.getInt("bizOptOutCategory");
        }
    }

    public C31261o0(AnonymousClass2z0 r2, long j) {
        super(r2, 153, j);
    }
}

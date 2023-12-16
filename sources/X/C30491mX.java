package X;

import java.util.List;

/* renamed from: X.1mX  reason: invalid class name and case insensitive filesystem */
public abstract class C30491mX extends C624134x implements AnonymousClass4BB {
    public int A00 = 0;
    public long A01 = -1;
    public String A02 = "";

    public C30491mX(AnonymousClass2z0 r9, C30491mX r10, long j) {
        super(r10, r9, j, true);
    }

    public List BDE() {
        String str;
        AnonymousClass39V[] A1V = AnonymousClass0x9.A1V();
        if (this instanceof C30971nX) {
            str = "edit";
        } else {
            str = "creation";
        }
        AnonymousClass39V.A04("scheduled_call_type", str, A1V);
        return C624134x.A0D(A1V);
    }

    public C30491mX(AnonymousClass2z0 r3, byte b, long j) {
        super(r3, b, j);
    }
}

package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.81I  reason: invalid class name */
public class AnonymousClass81I implements C187008wI {
    public final /* synthetic */ C161427pc A00;
    public final /* synthetic */ String A01;

    public List B6o(String str, boolean z, boolean z2) {
        ArrayList A0J = AnonymousClass002.A0J(C187008wI.A00.B6o(str, z, false));
        String str2 = this.A01;
        if (str2 == null || str2.equals(str)) {
            AnonymousClass91R.A00(this, A0J, 3);
            Object[] A0M = AnonymousClass002.A0M();
            C18280x3.A19(str2, A0J, A0M);
            C161157p6.A01("MediaCodecSelector", "%s dec order (sw first) %s", A0M);
        }
        return A0J;
    }

    public AnonymousClass81I(C161427pc r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public C160577nt BAc() {
        return C187008wI.A00.BAc();
    }
}

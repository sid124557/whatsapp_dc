package X;

import java.util.LinkedList;
import java.util.List;

/* renamed from: X.87R  reason: invalid class name */
public class AnonymousClass87R implements C186968wE {
    public final /* synthetic */ AnonymousClass864 A00;

    public AnonymousClass87R(AnonymousClass864 r1) {
        this.A00 = r1;
    }

    public List B6o(String str, boolean z, boolean z2) {
        List<C160687o8> A02 = C162267rY.A02(str, z, z2);
        if (!A02.isEmpty()) {
            if (!this.A00.A00) {
                LinkedList A18 = AnonymousClass0x9.A18();
                boolean z3 = false;
                for (C160687o8 r3 : A02) {
                    if (!z3) {
                        String str2 = r3.A03;
                        if (str2.startsWith("OMX.google")) {
                            C18260x0.A0q("ListViewOptimizedExoPlayer/softwareDecoder=", str2, AnonymousClass001.A0o());
                            A18.add(0, r3);
                            z3 = true;
                        }
                    }
                    A18.add(r3);
                }
                return A18;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("ListViewOptimizedExoPlayer/firstDecoder=");
            C18260x0.A1J(A0o, ((C160687o8) C18290x4.A0k(A02)).A03);
        }
        return A02;
    }
}

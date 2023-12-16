package X;

/* renamed from: X.8Pd  reason: invalid class name and case insensitive filesystem */
public class C173318Pd implements C183608qJ {
    public void Bsi(Appendable appendable, Object obj, C160267nL r7) {
        appendable.append('[');
        boolean z = false;
        for (Object A00 : (Object[]) obj) {
            z = AnonymousClass6C8.A1S(appendable, z);
            C159877mc.A00(appendable, A00, r7);
        }
        appendable.append(']');
    }
}

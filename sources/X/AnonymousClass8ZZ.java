package X;

/* renamed from: X.8ZZ  reason: invalid class name */
public class AnonymousClass8ZZ extends C175628Zc implements C188458yv, C188508z0 {
    public AnonymousClass8ZZ(Class cls, String str, String str2) {
        super(cls, AnonymousClass8PI.NO_RECEIVER, str, str2);
    }

    public C188518z1 computeReflected() {
        return this;
    }

    public C188448yu B7v() {
        return ((C188458yv) getReflected()).B7v();
    }

    public Object get(Object obj) {
        C188448yu B7v = B7v();
        return ((AnonymousClass8PI) ((AnonymousClass8PI) ((AnonymousClass8PI) B7v).getReflected()).getReflected()).getReflected().call(AnonymousClass000.A1b(obj));
    }

    public Object invoke(Object obj) {
        return get(obj);
    }

    public AnonymousClass8ZZ() {
    }
}

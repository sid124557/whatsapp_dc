package X;

/* renamed from: X.7Qb  reason: invalid class name and case insensitive filesystem */
public abstract class C150297Qb {
    public String A01() {
        if (this instanceof C126306Ni) {
            return "user_scope";
        }
        if (this instanceof C126296Nh) {
            return "stale_removal";
        }
        if (this instanceof C126316Nj) {
            return "max_size";
        }
        if (this instanceof C126336Nl) {
            return "eviction.v2";
        }
        return ((C126286Ng) this).A00.A01();
    }
}

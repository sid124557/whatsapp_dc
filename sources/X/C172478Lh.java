package X;

/* renamed from: X.8Lh  reason: invalid class name and case insensitive filesystem */
public abstract class C172478Lh implements Comparable {
    public static final C172478Lh A01 = new C131326dP();
    public Object A00;

    public Object A01() {
        if (this instanceof C131336dQ) {
            return "$";
        }
        if (this instanceof C131356dS) {
            return ((C131356dS) this).A00;
        }
        if (this instanceof C131346dR) {
            return C160947oi.A00(((C131346dR) this).A00, "&&", "");
        }
        if (this instanceof C131366dT) {
            return Integer.valueOf(((C131366dT) this).A00);
        }
        return null;
    }

    public C172478Lh(Object obj) {
        this.A00 = obj;
    }

    /* renamed from: A00 */
    public int compareTo(C172478Lh r3) {
        return -A01().toString().compareTo(r3.A01().toString());
    }
}

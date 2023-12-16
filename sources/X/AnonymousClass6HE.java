package X;

/* renamed from: X.6HE  reason: invalid class name */
public final class AnonymousClass6HE extends AnonymousClass0O4 {
    public /* bridge */ /* synthetic */ boolean A01(Object obj, Object obj2) {
        Object obj3 = (AnonymousClass73X) obj;
        Object obj4 = (AnonymousClass73X) obj2;
        C18260x0.A0O(obj3, obj4);
        if (!C162457s7.A0P(obj3.getClass(), obj4.getClass())) {
            return false;
        }
        if (!(obj3 instanceof C132096eg) || !(obj4 instanceof C132096eg)) {
            if ((obj3 instanceof C132066ed) && (obj4 instanceof C132066ed)) {
                obj3 = ((C132066ed) obj3).A01;
                obj4 = ((C132066ed) obj4).A01;
            } else if ((obj3 instanceof C132076ee) && (obj4 instanceof C132076ee)) {
                obj3 = ((C132076ee) obj3).A00;
                obj4 = ((C132076ee) obj4).A00;
            }
            return C162457s7.A0P(obj3, obj4);
        } else if (((C132096eg) obj3).A00 == ((C132096eg) obj4).A00) {
            return true;
        } else {
            return false;
        }
    }

    public /* bridge */ /* synthetic */ boolean A00(Object obj, Object obj2) {
        C18260x0.A0O(obj, obj2);
        return obj.equals(obj2);
    }
}

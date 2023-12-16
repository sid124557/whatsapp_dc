package X;

/* renamed from: X.11X  reason: invalid class name */
public final class AnonymousClass11X extends AnonymousClass0O4 {
    public /* bridge */ /* synthetic */ boolean A00(Object obj, Object obj2) {
        String str;
        String str2;
        C47712dh r3 = (C47712dh) obj;
        C47712dh r4 = (C47712dh) obj2;
        C18260x0.A0O(r3, r4);
        if ((r3 instanceof C23491Tl) && (r4 instanceof C23491Tl)) {
            str = ((C23491Tl) r3).A03;
            str2 = ((C23491Tl) r4).A03;
        } else if (!(r3 instanceof C23481Tk) || !(r4 instanceof C23481Tk)) {
            return false;
        } else {
            str = ((C23481Tk) r3).A01.A0D;
            str2 = ((C23481Tk) r4).A01.A0D;
        }
        return C162457s7.A0P(str, str2);
    }

    public /* bridge */ /* synthetic */ boolean A01(Object obj, Object obj2) {
        C18260x0.A0O(obj, obj2);
        return obj.equals(obj2);
    }
}

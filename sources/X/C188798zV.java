package X;

/* renamed from: X.8zV  reason: invalid class name and case insensitive filesystem */
public class C188798zV extends AnonymousClass0O4 {
    public final int A00;

    public C188798zV(int i) {
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ boolean A00(Object obj, Object obj2) {
        switch (this.A00) {
            case 1:
                C18260x0.A0O(obj, obj2);
                break;
            case 2:
                return ((C185658u2) obj).equals(obj2);
            case 6:
                C18260x0.A0O(obj, obj2);
                break;
            case 7:
                AnonymousClass7EI r5 = (AnonymousClass7EI) obj;
                AnonymousClass7EI r6 = (AnonymousClass7EI) obj2;
                C18260x0.A0O(r5, r6);
                if (!(r5 instanceof C136916nT) || !(r6 instanceof C136916nT)) {
                    return C162457s7.A0P(r5.getClass(), r6.getClass());
                }
                AnonymousClass7ZJ r3 = ((C136916nT) r5).A00;
                AnonymousClass7ZJ r2 = ((C136916nT) r6).A00;
                if (!C162457s7.A0P(r3.A03, r2.A03) || !C162457s7.A0P(r3.A00, r2.A00)) {
                    return false;
                }
                return true;
        }
        return obj.equals(obj2);
    }

    public /* bridge */ /* synthetic */ boolean A01(Object obj, Object obj2) {
        int i;
        int i2;
        Object obj3;
        Object obj4;
        switch (this.A00) {
            case 1:
                C18260x0.A0O(obj, obj2);
                return obj.equals(obj2);
            case 2:
                i = ((C185658u2) obj).B8k();
                i2 = ((C185658u2) obj2).B8k();
                break;
            case 3:
                i = ((AnonymousClass7VI) obj).A00;
                i2 = ((AnonymousClass7VI) obj2).A00;
                break;
            case 4:
                return ((AnonymousClass3ZH) obj).A0H().equals(((AnonymousClass3ZH) obj2).A0H());
            case 6:
                C109065e1 r3 = (C109065e1) obj;
                C109065e1 r4 = (C109065e1) obj2;
                C18260x0.A0O(r3, r4);
                return C162457s7.A0P(r3.A0F, r4.A0F);
            case 7:
                AnonymousClass7EI r32 = (AnonymousClass7EI) obj;
                AnonymousClass7EI r42 = (AnonymousClass7EI) obj2;
                C18260x0.A0O(r32, r42);
                if (!(r32 instanceof C136916nT) || !(r42 instanceof C136916nT)) {
                    obj3 = r32.getClass();
                    obj4 = r42.getClass();
                } else {
                    obj3 = ((C136916nT) r32).A00.A02;
                    obj4 = ((C136916nT) r42).A00.A02;
                }
                return C162457s7.A0P(obj3, obj4);
            default:
                return obj.equals(obj2);
        }
        return AnonymousClass000.A1U(i, i2);
    }
}

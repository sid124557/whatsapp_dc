package X;

/* renamed from: X.4ZN  reason: invalid class name */
public class AnonymousClass4ZN extends C012009o {
    public final AnonymousClass5ZU A00;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        int i2;
        AnonymousClass3ZH r4 = (AnonymousClass3ZH) obj;
        AnonymousClass3ZH r5 = (AnonymousClass3ZH) obj2;
        C41822Ls r0 = r4.A0J;
        if (r0 != null) {
            i = r0.A00;
        } else {
            i = 0;
        }
        C41822Ls r02 = r5.A0J;
        if (r02 != null) {
            i2 = r02.A00;
        } else {
            i2 = 0;
        }
        if (i == i2) {
            AnonymousClass5ZU r03 = this.A00;
            String A0H = r03.A0H(r4);
            String A0H2 = r03.A0H(r5);
            if (A0H == null || A0H2 == null) {
                return 0;
            }
            return A0H.compareTo(A0H2);
        } else if (i == 3) {
            return -1;
        } else {
            return 1;
        }
    }

    public AnonymousClass4ZN(AnonymousClass0R6 r1, AnonymousClass5ZU r2) {
        super(r1);
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ boolean A01(Object obj, Object obj2) {
        return AnonymousClass75J.A00(obj, obj2);
    }

    public /* bridge */ /* synthetic */ boolean A02(Object obj, Object obj2) {
        return AnonymousClass75J.A00(obj, obj2);
    }
}

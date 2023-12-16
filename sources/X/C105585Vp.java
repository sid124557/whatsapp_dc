package X;

/* renamed from: X.5Vp  reason: invalid class name and case insensitive filesystem */
public final class C105585Vp {
    public final AnonymousClass5QH A00;

    public C105585Vp(AnonymousClass5QH r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public static final void A00(AnonymousClass5JM r7) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("FbProfileDataFetcher/handleErrorsIfAny Received response code: ");
        int i = r7.A02;
        A0o.append(i);
        A0o.append(", Graph status code: ");
        int i2 = r7.A00;
        A0o.append(i2);
        A0o.append(", Graph Error subcode: ");
        int i3 = r7.A01;
        C106245Ye.A00(AnonymousClass000.A0h(A0o, i3));
        if (i == -1) {
            throw new AnonymousClass57L((String) null, (Throwable) null, (C378924l) null, 3);
        } else if (i == 1) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("Unknown error: ");
            throw new C1000759i(AnonymousClass000.A0R(r7.A03, A0o2));
        } else if (i == 2) {
            if (i3 == 459) {
                throw new AnonymousClass57O((String) null, (Throwable) null, (C378924l) null, 3);
            } else if (i3 == 467) {
                throw new AnonymousClass57J((String) null, (Throwable) null, (C378924l) null, 3);
            } else if (i3 == 463) {
                throw new AnonymousClass57H((String) null, (Throwable) null, (C378924l) null, 3);
            } else if (i3 == 464) {
                throw new AnonymousClass57N((String) null, (Throwable) null, (C378924l) null, 3);
            } else if (i2 == 190) {
                throw new AnonymousClass57K((String) null, (Throwable) null, (C378924l) null, 3);
            } else {
                StringBuilder A0o3 = AnonymousClass001.A0o();
                A0o3.append("Unknown error encountered, Code:");
                A0o3.append(i2);
                throw new C1000759i(AnonymousClass000.A0Y(" Error subcode:", A0o3, i3));
            }
        }
    }
}

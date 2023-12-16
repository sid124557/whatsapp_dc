package X;

/* renamed from: X.3Y4  reason: invalid class name */
public final class AnonymousClass3Y4 implements C84804Dt {
    public final C43992Ug A00 = new C43992Ug();

    public AnonymousClass2TE AxG(AnonymousClass2U3 r16, C833748d r17) {
        AnonymousClass2PL r2;
        AnonymousClass2U3 r4 = r16;
        C833748d r22 = r17;
        C18270x1.A14(r22, r4);
        C58682ve r3 = ((AnonymousClass3YL) r22).A08.A00;
        if (r3.A00 != AnonymousClass21H.UNKNOWN) {
            try {
                r2 = this.A00.A00(r3, r4, r22);
            } catch (C377023r | IllegalArgumentException | NullPointerException unused) {
                r2 = new AnonymousClass2PL((C129586aY) null, r3, false);
            }
            if (!r2.A02) {
                C129586aY r1 = r2.A00;
                if (r1 == null || r1.isEmpty()) {
                    C58682ve r9 = r2.A01;
                    if (r9 != null) {
                        return new AnonymousClass2TE((AnonymousClass2PJ) null, r9, "Failed filter clause", (Throwable) null, false, false, false);
                    }
                    return new AnonymousClass2TE((AnonymousClass2PJ) null, (C58682ve) null, (String) null, (Throwable) null, false, false, false);
                }
                AnonymousClass2PJ r23 = (AnonymousClass2PJ) r1.get(0);
                C18320x8.A1E(r23);
                return new AnonymousClass2TE(r23, (C58682ve) null, "Failed context filter", (Throwable) null, false, false, false);
            }
        }
        return C615831k.A00();
    }

    public String BsV() {
        return "client_filters";
    }
}

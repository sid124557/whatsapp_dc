package X;

/* renamed from: X.3Y3  reason: invalid class name */
public final class AnonymousClass3Y3 implements C84804Dt {
    public AnonymousClass2TE AxG(AnonymousClass2U3 r9, C833748d r10) {
        String str;
        boolean A1U = C18270x1.A1U(r10, r9);
        C129526aS r2 = r9.A02;
        if (r2.isEmpty()) {
            str = "No triggers";
        } else {
            str = "Unsupported trigger";
            if (r2.size() == A1U) {
                Object A01 = C73723fy.A01(r2);
                if (A01 == null) {
                    throw C18290x4.A0Y();
                } else if (((AnonymousClass3YL) r10).A0H.contains(A01)) {
                }
            } else {
                for (Object contains : ((AnonymousClass3YL) r10).A0H) {
                    if (r2.contains(contains)) {
                    }
                }
            }
            return C615831k.A00();
        }
        return new AnonymousClass2TE((AnonymousClass2PJ) null, (C58682ve) null, str, (Throwable) null, false, false, false);
    }

    public String BsV() {
        return null;
    }
}

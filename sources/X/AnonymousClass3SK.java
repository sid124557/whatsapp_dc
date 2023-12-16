package X;

/* renamed from: X.3SK  reason: invalid class name */
public final class AnonymousClass3SK implements AnonymousClass4DP {
    public final /* synthetic */ AnonymousClass3DK A00;
    public final /* synthetic */ C29351ig A01;
    public final /* synthetic */ C54612p0 A02;

    public AnonymousClass3SK(AnonymousClass3DK r1, C29351ig r2, C54612p0 r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void onFailure(Exception exc) {
        StringBuilder A0X = C18270x1.A0X(exc);
        A0X.append("AvatarAsyncInit");
        C18260x0.A15("/deleteAvatarUser Failed to delete avatar via Smax: ", A0X, exc);
    }

    public void onSuccess() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass3DK r1 = this.A00;
        A0o.append("AvatarAsyncInit");
        C18260x0.A1J(A0o, "/deleteAvatarUser Deleted avatar user successfully");
        C69263Wi.A00(r1.A00, this.A01, 49);
        this.A02.A01();
    }
}

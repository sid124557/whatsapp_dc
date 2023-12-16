package X;

/* renamed from: X.9hI  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9hI implements Runnable {
    public final /* synthetic */ AnonymousClass9SQ A00;
    public final /* synthetic */ AnonymousClass9VN A01;

    public final void run() {
        AnonymousClass9VN r5 = this.A01;
        AnonymousClass9SQ r4 = this.A00;
        AnonymousClass9N2 r3 = AnonymousClass9VN.A0X;
        byte[] bArr = (byte[]) r5.A00(r3);
        if (bArr == null || bArr.length == 0) {
            r4.A00(AnonymousClass002.A0E("Photo taking returned no jpeg data!"));
            return;
        }
        AnonymousClass6C7.A10(r4.A00.A0J, new Object[]{r4.A01, r5.A00(r3), r5}, 6);
        AnonymousClass9VK A002 = AnonymousClass9VK.A00();
        A002.A02(0, A002.A03);
    }

    public /* synthetic */ AnonymousClass9hI(AnonymousClass9SQ r1, AnonymousClass9VN r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}

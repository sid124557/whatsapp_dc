package X;

import android.os.IInterface;

/* renamed from: X.6Zf  reason: invalid class name and case insensitive filesystem */
public final class C129106Zf extends C124576Db implements IInterface {
    public final C152017Xf A00;
    public final C157897j6 A01;
    public final /* synthetic */ AnonymousClass7K1 A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C129106Zf(C152017Xf r3, AnonymousClass7K1 r4) {
        this();
        this.A02 = r4;
        this.A01 = new C157897j6("OnRequestIntegrityTokenCallback");
        this.A00 = r3;
    }

    public C129106Zf() {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
    }
}

package X;

import java.util.Map;

/* renamed from: X.3D0  reason: invalid class name */
public final class AnonymousClass3D0 implements AnonymousClass4CI {
    public final /* synthetic */ C41182Jg A00;
    public final /* synthetic */ AnonymousClass3XT A01;

    public AnonymousClass3D0(C41182Jg r1, AnonymousClass3XT r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BSu(Map map) {
        AnonymousClass3XT r2 = this.A01;
        r2.A00.A0S(new C71603cN(r2, this.A00, map, "error", 28));
    }

    public void onSuccess() {
        AnonymousClass3XT r2 = this.A01;
        r2.A00.A0S(new C71603cN(r2, this.A00, C72043d5.A00(), "success", 28));
    }
}

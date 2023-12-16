package X;

/* renamed from: X.4JE  reason: invalid class name */
public class AnonymousClass4JE implements C84244Bp {
    public Object A00;
    public final int A01;

    public AnonymousClass4JE(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onError(int i) {
        if (this.A01 != 0) {
            ((C50052hY) this.A00).A01(new C34571vN(i));
        } else {
            C18260x0.A0x("WaffleClientCacheImpl/fetchDataFromServerWithHandler:onFailure Error code: ", AnonymousClass001.A0o(), i);
        }
    }
}

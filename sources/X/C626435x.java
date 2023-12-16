package X;

/* renamed from: X.35x  reason: invalid class name and case insensitive filesystem */
public class C626435x implements AnonymousClass4EQ {
    public Object A00;
    public final int A01;

    public C626435x(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onError(int i) {
        if (this.A01 != 0) {
            C59822xY r1 = (C59822xY) this.A00;
            C59822xY.A00(r1, r1.A0I.decrementAndGet());
            return;
        }
        C18260x0.A0x("LinkExistingGroupsUseCase/LinkSubgroupsProtocolHelper/error = ", AnonymousClass001.A0o(), i);
        ((C84814Du) this.A00).BkD(new C27621eE(i));
    }
}

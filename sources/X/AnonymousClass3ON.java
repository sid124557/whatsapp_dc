package X;

/* renamed from: X.3ON  reason: invalid class name */
public class AnonymousClass3ON implements AnonymousClass4AH {
    public final C55682qk A00;

    public void BsE(C55962rC r5, C624134x r6) {
        int i = r5.A01;
        if (i != 0 && i != 1 && i != 3 && !(r6 instanceof C30441mS) && !(r6 instanceof C30571mf) && !(r6 instanceof C30551md) && !(r6 instanceof C30561me) && !(r6 instanceof C30971nX) && !(r6 instanceof C30581mg)) {
            this.A00.A0A("MessageUtils/buildFMessage unexpected editedVersion", false, AnonymousClass000.A0Y("edit=", AnonymousClass001.A0o(), i));
            throw AnonymousClass24W.A01(76, "invalid_edit_version");
        }
    }

    public AnonymousClass3ON(C55682qk r1) {
        this.A00 = r1;
    }
}

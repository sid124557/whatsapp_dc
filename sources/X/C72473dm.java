package X;

/* renamed from: X.3dm  reason: invalid class name and case insensitive filesystem */
public abstract class C72473dm implements C85484Gk {
    public final C834148h key;

    public C72473dm(C834148h r2) {
        C162457s7.A0J(r2, 1);
        this.key = r2;
    }

    public Object fold(Object obj, AnonymousClass4GR r3) {
        C162457s7.A0J(r3, 2);
        return r3.invoke(obj, this);
    }

    public C85484Gk get(C834148h r3) {
        if (!C18290x4.A1X(r3, this)) {
            return null;
        }
        return this;
    }

    public C85494Gl minusKey(C834148h r3) {
        if (C18290x4.A1X(r3, this)) {
            return C72553du.A00;
        }
        return this;
    }

    public C834148h getKey() {
        return this.key;
    }

    public C85494Gl plus(C85494Gl r2) {
        return C616031m.A00(this, r2);
    }
}

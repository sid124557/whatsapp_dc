package X;

/* renamed from: X.8V3  reason: invalid class name */
public class AnonymousClass8V3 extends AnonymousClass8PI implements C188498yz, AnonymousClass4GV {
    public final int arity;
    public final int flags;

    public AnonymousClass8V3(int i, Object obj) {
        this(i, obj, (Class) null, (String) null, (String) null, 0);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AnonymousClass8V3) {
                AnonymousClass8V3 r4 = (AnonymousClass8V3) obj;
                if (!this.name.equals(r4.name) || !this.signature.equals(r4.signature) || this.flags != r4.flags || this.arity != r4.arity || !C162457s7.A0P(this.receiver, r4.receiver) || !C162457s7.A0P(getOwner(), r4.getOwner())) {
                    return false;
                }
            } else if (obj instanceof C188498yz) {
                return obj.equals(compute());
            } else {
                return false;
            }
        }
        return true;
    }

    public C188518z1 computeReflected() {
        return this;
    }

    public int getArity() {
        return this.arity;
    }

    public C188498yz getReflected() {
        return (C188498yz) super.getReflected();
    }

    public int hashCode() {
        int A04;
        if (getOwner() == null) {
            A04 = 0;
        } else {
            A04 = C18300x5.A04(getOwner());
        }
        return AnonymousClass0x7.A08(this.signature, AnonymousClass0x2.A07(this.name, A04));
    }

    public boolean isExternal() {
        return ((C188498yz) super.getReflected()).isExternal();
    }

    public boolean isInfix() {
        return ((C188498yz) super.getReflected()).isInfix();
    }

    public boolean isInline() {
        return ((C188498yz) super.getReflected()).isInline();
    }

    public boolean isOperator() {
        return ((C188498yz) super.getReflected()).isOperator();
    }

    public boolean isSuspend() {
        return ((C188498yz) super.getReflected()).isSuspend();
    }

    public String toString() {
        C188518z1 compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        String str = this.name;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("function ");
        A0o.append(str);
        return AnonymousClass000.A0X(" (Kotlin reflection is not available)", A0o);
    }

    public AnonymousClass8V3(int i) {
        this(i, AnonymousClass8PI.NO_RECEIVER, (Class) null, (String) null, (String) null, 0);
    }

    public AnonymousClass8V3(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, AnonymousClass000.A1U(i2 & 1, 1));
        this.arity = i;
        this.flags = i2 >> 1;
    }
}

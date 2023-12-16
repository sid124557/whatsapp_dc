package X;

import java.io.Serializable;

/* renamed from: X.3dw  reason: invalid class name and case insensitive filesystem */
public class C72573dw implements AnonymousClass4GV, Serializable {
    public final int arity = 2;
    public final int flags = 2;
    public final boolean isTopLevel = false;
    public final String name;
    public final Class owner;
    public final Object receiver;
    public final String signature;

    public C72573dw(Class cls, Object obj, String str, String str2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C72573dw)) {
            return false;
        }
        C72573dw r4 = (C72573dw) obj;
        return this.isTopLevel == r4.isTopLevel && this.arity == r4.arity && this.flags == r4.flags && C162457s7.A0P(this.receiver, r4.receiver) && C162457s7.A0P(this.owner, r4.owner) && this.name.equals(r4.name) && this.signature.equals(r4.signature);
    }

    public int hashCode() {
        int i = 0;
        int A04 = C18280x3.A04(this.receiver) * 31;
        Class cls = this.owner;
        if (cls != null) {
            i = cls.hashCode();
        }
        int A07 = AnonymousClass0x2.A07(this.signature, AnonymousClass0x2.A07(this.name, (A04 + i) * 31));
        int i2 = 1237;
        if (this.isTopLevel) {
            i2 = 1231;
        }
        return ((((A07 + i2) * 31) + this.arity) * 31) + this.flags;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        return C57712u5.A00(this);
    }
}

package X;

/* renamed from: X.0fG  reason: invalid class name and case insensitive filesystem */
public final class C08880fG implements C17330vM {
    public final AnonymousClass0Pg A00;
    public final AnonymousClass0TW A01;
    public final AnonymousClass0TX A02;

    public C08880fG(AnonymousClass0Pg r4, AnonymousClass0TW r5, AnonymousClass0TX r6) {
        C162457s7.A0J(r6, 2);
        C162457s7.A0J(r5, 3);
        this.A00 = r4;
        this.A02 = r6;
        this.A01 = r5;
        int i = r4.A02;
        int i2 = r4.A01;
        if (i - i2 == 0 && r4.A00 - r4.A03 == 0) {
            throw AnonymousClass001.A0c("Bounds must be non zero");
        } else if (i2 != 0 && r4.A03 != 0) {
            throw AnonymousClass001.A0c("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            Class<C08880fG> cls2 = C08880fG.class;
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (cls2.equals(cls)) {
                C162457s7.A0K(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
                C08880fG r5 = (C08880fG) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public boolean BIu() {
        AnonymousClass0TX r1 = this.A02;
        if (C162457s7.A0P(r1, AnonymousClass0TX.A02) || (C162457s7.A0P(r1, AnonymousClass0TX.A01) && C162457s7.A0P(this.A01, AnonymousClass0TW.A02))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, AnonymousClass000.A08(this.A02, this.A00.hashCode() * 31));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(C08880fG.class.getSimpleName());
        A0o.append(" { ");
        A0o.append(this.A00);
        A0o.append(", type=");
        A0o.append(this.A02);
        A0o.append(", state=");
        A0o.append(this.A01);
        return AnonymousClass000.A0X(" }", A0o);
    }
}

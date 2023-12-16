package X;

/* renamed from: X.2kr  reason: invalid class name and case insensitive filesystem */
public final class C52082kr {
    public final int A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52082kr) {
                C52082kr r5 = (C52082kr) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (C18270x1.A00(this.A01) * 31) + this.A00;
    }

    public C52082kr(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("EligibilityCheckPayload(uniqueId=");
        A0o.append(this.A01);
        A0o.append(", expTimeSeconds=");
        return C18260x0.A09(A0o, this.A00);
    }
}

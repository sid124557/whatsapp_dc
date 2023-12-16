package X;

import java.util.List;

/* renamed from: X.5Rc  reason: invalid class name and case insensitive filesystem */
public final class C104475Rc {
    public final C999658w A00;
    public final List A01;

    public C104475Rc(C999658w r2, List list) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
        this.A01 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C104475Rc) {
                C104475Rc r5 = (C104475Rc) obj;
                if (this.A00 != r5.A00 || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, C18300x5.A04(this.A00));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UserProblemData(userProblemCategory=");
        A0o.append(this.A00);
        A0o.append(", userProblems=");
        return C18260x0.A04(this.A01, A0o);
    }
}

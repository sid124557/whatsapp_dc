package X;

import android.content.Context;

/* renamed from: X.3QU  reason: invalid class name */
public class AnonymousClass3QU implements C85164Fe {
    public final C106655Zv A00;
    public final AnonymousClass5Y0 A01;

    public C106655Zv[] B7I() {
        return new C106655Zv[]{this.A00};
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass3QU) {
            return this.A00.equals(((AnonymousClass3QU) obj).A00);
        }
        return false;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass3QU(C106655Zv r1, AnonymousClass5Y0 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public boolean AyR() {
        return true;
    }

    public C105425Uw B13(Context context, C620733j r5, boolean z) {
        C626936e.A00();
        return new C95924v5(context, this.A00, this.A01, z);
    }

    public String BDW() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("EmojiShapeCreator:");
        AnonymousClass000.A1B(this.A00, A0o);
        return A0o.toString();
    }

    public boolean Bjq() {
        return true;
    }
}

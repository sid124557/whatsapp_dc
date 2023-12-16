package X;

import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.3QV  reason: invalid class name */
public class AnonymousClass3QV implements C85164Fe {
    public final AnonymousClass39M A00;
    public final AnonymousClass33O A01;

    public C106655Zv[] B7I() {
        C106655Zv[] r0;
        AnonymousClass330 r02 = this.A00.A04;
        if (r02 == null || (r0 = r02.A0B) == null) {
            return C85164Fe.A00;
        }
        return r0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass3QV)) {
            return false;
        }
        String str = ((AnonymousClass3QV) obj).A00.A0D;
        C626936e.A06(str);
        return str.equals(this.A00.A0D);
    }

    public int hashCode() {
        String str = this.A00.A0D;
        C626936e.A06(str);
        return str.hashCode();
    }

    public AnonymousClass3QV(AnonymousClass39M r1, AnonymousClass33O r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public boolean AyR() {
        return true;
    }

    public C105425Uw B13(Context context, C620733j r6, boolean z) {
        int i = R.dimen.f6nameremoved;
        if (z) {
            i = R.dimen.f6nameremoved;
        }
        C626936e.A00();
        return new AnonymousClass4v7(context, this.A00, this.A01, C18320x8.A00(context, i));
    }

    public String BDW() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("StickerShapeCreator:");
        String str = this.A00.A0D;
        C626936e.A06(str);
        return AnonymousClass000.A0X(str, A0o);
    }

    public boolean Bjq() {
        return true;
    }
}

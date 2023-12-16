package X;

import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.5ne  reason: invalid class name and case insensitive filesystem */
public class C114815ne implements C85164Fe {
    public final int A00;

    public boolean AyR() {
        return false;
    }

    public C105425Uw B13(Context context, C620733j r4, boolean z) {
        switch (this.A00) {
            case 0:
                return new AnonymousClass4v9();
            case 1:
                return new AnonymousClass4vA();
            case 2:
                return new C95944vB();
            case 3:
                return new C95974vG();
            case 4:
                return new AnonymousClass4vC();
            case 5:
                return new AnonymousClass4vD();
            case 6:
                return new C95934v6(context, r4, z);
            case 7:
                return new AnonymousClass4vI(context, r4, z);
            default:
                return new AnonymousClass4vJ(context, r4, context.getString(R.string.f11nameremoved), z);
        }
    }

    public C106655Zv[] B7I() {
        int i;
        C106655Zv[] r2 = new C106655Zv[1];
        int[] iArr = new int[1];
        switch (this.A00) {
            case 0:
                i = 8599;
                break;
            case 1:
                i = 11093;
                break;
            case 2:
                i = 128306;
                break;
            case 3:
                i = 128173;
                break;
            case 4:
            case 5:
                i = 128172;
                break;
            case 8:
                i = 128205;
                break;
            default:
                i = 128346;
                break;
        }
        iArr[0] = i;
        r2[0] = new C106655Zv(iArr);
        return r2;
    }

    public boolean Bjq() {
        int i = this.A00;
        if (i == 7 || i == 8) {
            return true;
        }
        return false;
    }

    public C114815ne(int i) {
        this.A00 = i;
    }

    public String BDW() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("custom:");
        return AnonymousClass000.A0h(A0o, this.A00);
    }
}

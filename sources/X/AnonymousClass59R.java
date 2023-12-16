package X;

import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.59R  reason: invalid class name */
public enum AnonymousClass59R {
    EXPLORE(1),
    TRENDING(2),
    FEATURED(3),
    NEW(4),
    POPULAR(5),
    COUNTRY(6);
    
    public final int value;

    /* access modifiers changed from: public */
    static {
        AnonymousClass59R[] r1;
        A00 = C73653fr.A00(r1);
    }

    /* access modifiers changed from: public */
    AnonymousClass59R(int i) {
        this.value = i;
    }

    public final String A00() {
        switch (ordinal()) {
            case 0:
                return "explore";
            case 1:
                return "most_active";
            case 2:
                return "featured";
            case 3:
                return "new";
            case 4:
                return "popular";
            case 5:
                return "region";
            default:
                throw C73153f1.A00();
        }
    }

    public final String A01(Context context) {
        int i;
        switch (ordinal()) {
            case 0:
                i = R.string.f11nameremoved;
                break;
            case 1:
                i = R.string.f11nameremoved;
                break;
            case 2:
                i = R.string.f11nameremoved;
                break;
            case 3:
                i = R.string.f11nameremoved;
                break;
            case 4:
                i = R.string.f11nameremoved;
                break;
            case 5:
                i = R.string.f11nameremoved;
                break;
            default:
                throw C73153f1.A00();
        }
        return C18290x4.A0l(context, i);
    }
}

package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.4W3  reason: invalid class name */
public final class AnonymousClass4W3 extends AnonymousClass09G {
    public final AnonymousClass4GQ A00;

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        int i2 = R.layout.f8nameremoved;
        if (i == 0) {
            i2 = R.layout.f8nameremoved;
        }
        View inflate = C18280x3.A0D(viewGroup).inflate(i2, viewGroup, false);
        if (i == 0) {
            C162457s7.A0H(inflate);
            return new C90054fl(inflate);
        }
        C162457s7.A0H(inflate);
        return new C90044fk(inflate);
    }

    public AnonymousClass4W3(AnonymousClass4GQ r2) {
        super((AnonymousClass0O4) new AnonymousClass6HE());
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r3, int i) {
        C125616Is r32 = (C125616Is) r3;
        C162457s7.A0J(r32, 0);
        AnonymousClass73X r1 = (AnonymousClass73X) A0K(i);
        C162457s7.A0H(r1);
        r32.A07(r1, new C175208Xm(this));
    }

    public int getItemViewType(int i) {
        Object A0K = A0K(i);
        if (A0K instanceof C132086ef) {
            return 0;
        }
        if (A0K instanceof C132096eg) {
            return 1;
        }
        throw C73153f1.A00();
    }
}

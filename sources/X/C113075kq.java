package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import com.whatsapp.R;

/* renamed from: X.5kq  reason: invalid class name and case insensitive filesystem */
public class C113075kq implements AnonymousClass679 {
    public int A00;
    public final Paint A01;
    public final C54292oU A02;
    public final C620733j A03;

    public /* synthetic */ int AzN() {
        if (this instanceof C93524oh) {
            return ((C93524oh) this).A00;
        }
        if ((this instanceof C93534oi) || (this instanceof C93494oe)) {
            return ((C93504of) this).A00;
        }
        return 0;
    }

    public int B4q() {
        if (this instanceof C93524oh) {
            return ((C93524oh) this).A00;
        }
        if (this instanceof C93534oi) {
            return ((C93504of) this).A00;
        }
        return 0;
    }

    public int B4r(C624134x r3) {
        if (this instanceof C93524oh) {
            return ((C93524oh) this).A00;
        }
        if (this instanceof C93534oi) {
            return ((C93504of) this).A00;
        }
        if (!(this instanceof C93494oe)) {
            return this.A00;
        }
        C93504of r1 = (C93504of) this;
        if (r3 == null || r3.A1J.A02) {
            return r1.A00;
        }
        return r1.A00;
    }

    public int B4s(Context context) {
        int i;
        if (this instanceof C93524oh) {
            C162457s7.A0J(context, 0);
            return AnonymousClass5YI.A04(context, 8.0f);
        }
        boolean z = this instanceof C93514og;
        Resources resources = context.getResources();
        if (z) {
            i = R.dimen.f6nameremoved;
        } else {
            i = R.dimen.f6nameremoved;
        }
        return resources.getDimensionPixelSize(i);
    }

    public /* synthetic */ int B5v(Context context, int i) {
        if (this instanceof C93524oh) {
            C93524oh r3 = (C93524oh) this;
            C162457s7.A0J(context, 0);
            int i2 = AnonymousClass000.A0B(r3.A02.A00).widthPixels;
            int i3 = r3.A00;
            return (i2 - (i3 + i3)) - (r3.BAN(context, i) + r3.BAQ(context, i));
        } else if (!(this instanceof C93534oi)) {
            return 0;
        } else {
            C93504of r2 = (C93504of) this;
            C162457s7.A0J(context, 0);
            int i4 = AnonymousClass000.A0B(r2.A02.A00).widthPixels;
            int i5 = r2.A00;
            return (i4 - (i5 + i5)) - (i + i);
        }
    }

    public Paint B7l() {
        return this.A01;
    }

    public /* synthetic */ int B89() {
        if (this instanceof C93524oh) {
            return ((C93524oh) this).A00;
        }
        if (this instanceof C93504of) {
            return ((C93504of) this).A00;
        }
        return 0;
    }

    public int BAN(Context context, int i) {
        if (this instanceof C93534oi) {
            return i;
        }
        return AnonymousClass5YL.A00(context) + i;
    }

    public int BAQ(Context context, int i) {
        if (this instanceof C93514og) {
            return C86654Ky.A02(context.getResources(), R.dimen.f6nameremoved, AnonymousClass5YL.A00(context) + i);
        } else if (this instanceof C93534oi) {
            return i;
        } else {
            return AnonymousClass5YL.A00(context) + i;
        }
    }

    public int BAa(int i) {
        if (this instanceof C93534oi) {
            if (i == 0 || i == 1 || i == 2) {
                return R.layout.f8nameremoved;
            }
            if (i == 3) {
                return -1;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("CAGConversationRowCustomizer/getParticipantHeaderLayoutRes/invalid layout option. Layout option input = ");
            A0o.append(i);
            C18270x1.A0z(A0o);
            return R.layout.f8nameremoved;
        } else if (i == 0 || i == 1 || i == 2) {
            return R.layout.f8nameremoved;
        } else {
            if (i == 3) {
                return -1;
            }
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("ConversationRowCustomizer/getParticipantHeaderLayoutRes/invalid layout option. Layout option input = ");
            A0o2.append(i);
            C18270x1.A0z(A0o2);
            return R.layout.f8nameremoved;
        }
    }

    public int BCi(Context context) {
        float max;
        float f;
        if (!(this instanceof C93514og)) {
            return Math.max(1, (int) (C86604Kt.A00(context) / 2.0f));
        }
        C93514og r1 = (C93514og) this;
        if (r1 instanceof C93484od) {
            C162457s7.A0J(context, 0);
            max = Math.max(1.0f, C86604Kt.A00(context));
            f = 34.0f;
        } else if (!(r1 instanceof C93474oc)) {
            return 0;
        } else {
            max = Math.max(1.0f, C86604Kt.A00(context));
            f = 24.0f;
        }
        return (int) (max * f);
    }

    public int BCj(Context context) {
        if (this instanceof C93514og) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    public boolean BHd() {
        if (this instanceof C93514og) {
            return false;
        }
        return true;
    }

    public boolean BHf(C624134x r2) {
        if (this instanceof C93524oh) {
            return true;
        }
        if (!(this instanceof C93504of)) {
            return false;
        }
        if (!(((C93504of) this) instanceof C93494oe)) {
            return true;
        }
        C162457s7.A0J(r2, 0);
        if (r2.A1J.A02 || (r2 instanceof C30481mW)) {
            return false;
        }
        return true;
    }

    public boolean BIS() {
        return false;
    }

    public boolean BIr() {
        if (this instanceof C93514og) {
            return C102805Ki.A00(this.A03);
        }
        return C620733j.A04(this.A03);
    }

    public /* synthetic */ void BmM(int i) {
        if (this instanceof C93524oh) {
            ((C93524oh) this).A00 = i;
        } else if (this instanceof C93504of) {
            ((C93504of) this).A00 = i;
        }
    }

    public boolean Bo2() {
        if (this instanceof C93514og) {
            return true;
        }
        return false;
    }

    public /* synthetic */ boolean Bo3() {
        if (this instanceof C93534oi) {
            return true;
        }
        return false;
    }

    public /* synthetic */ boolean Bo8() {
        if ((this instanceof C93524oh) || (this instanceof C93534oi)) {
            return true;
        }
        return false;
    }

    public boolean BoA() {
        if (this instanceof C93514og) {
            return true;
        }
        return false;
    }

    public boolean BoE() {
        if (this instanceof C93514og) {
            return C620733j.A04(this.A03);
        }
        return C102805Ki.A00(this.A03);
    }

    public /* synthetic */ boolean BoF() {
        if (this instanceof C93524oh) {
            return true;
        }
        return false;
    }

    public /* synthetic */ boolean BoL() {
        if ((this instanceof C93524oh) || (this instanceof C93534oi) || (this instanceof C93494oe)) {
            return true;
        }
        return false;
    }

    public boolean BoT() {
        if ((this instanceof C93524oh) || (this instanceof C93534oi) || (this instanceof C93494oe)) {
            return false;
        }
        return true;
    }

    public boolean BoW() {
        if (this instanceof C93514og) {
            return true;
        }
        return false;
    }

    public /* synthetic */ boolean Bp3() {
        if (this instanceof C93534oi) {
            return true;
        }
        return false;
    }

    public /* synthetic */ boolean Bp4() {
        if (this instanceof C93534oi) {
            return true;
        }
        return false;
    }

    public boolean Bp5() {
        if (this instanceof C93534oi) {
            return true;
        }
        return false;
    }

    public void Brf(Context context) {
        this.A01.setColor(C18300x5.A03(context, R.attr.f3nameremoved, R.color.f5nameremoved));
        this.A00 = AnonymousClass5YI.A04(context, 40.0f);
    }

    public void Brg(Context context, int i) {
        if (this instanceof C93524oh) {
            C162457s7.A0J(context, 0);
            ((C93524oh) this).A00 = Math.max((i - AnonymousClass5YI.A04(context, 600.0f)) / 2, AnonymousClass5YI.A04(context, 0.0f));
        } else if (this instanceof C93534oi) {
            C162457s7.A0J(context, 0);
            ((C93504of) this).A00 = Math.max((i - AnonymousClass5YI.A04(context, 480.0f)) / 2, AnonymousClass5YI.A04(context, 16.0f));
        }
    }

    public C113075kq(C54292oU r4, C620733j r5) {
        Paint A0Z = C86664Kz.A0Z();
        this.A01 = A0Z;
        this.A02 = r4;
        this.A03 = r5;
        C86604Kt.A0u(C54292oU.A00(r4).getColor(R.color.f5nameremoved), A0Z);
        A0Z.setAntiAlias(true);
    }
}

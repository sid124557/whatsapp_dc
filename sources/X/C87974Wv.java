package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.4Wv  reason: invalid class name and case insensitive filesystem */
public class C87974Wv extends AnonymousClass0R6 {
    public final C15910sA A00;
    public final C69263Wi A01;
    public final C56972sr A02;
    public final AnonymousClass5UX A03;
    public final C64773Ex A04;
    public final AnonymousClass5ZU A05;
    public final C613330g A06;
    public final C620733j A07;
    public final AnonymousClass5OD A08;
    public final AnonymousClass4UX A09;
    public final C72173dI A0A;

    public int A0G() {
        return C86614Ku.A06(this.A08.A02);
    }

    public final AnonymousClass7HU A0K(AnonymousClass3ZH r4, int i) {
        AnonymousClass5ZU r2 = this.A05;
        if (!r2.A0e(r4, i) || !this.A09.A0B) {
            return r2.A0D(r4, i, false, true);
        }
        return new AnonymousClass7HU(C998258i.PHONE_NUMBER, C86654Ky.A0m(this.A07, r4));
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r26, int i) {
        AnonymousClass7ID r1;
        AnonymousClass4YV r7 = (AnonymousClass4YV) r26;
        Context A0T = C86664Kz.A0T(r7);
        C117015rF r5 = (C117015rF) C86634Kw.A0w(this.A08.A02, i);
        C95814uZ r3 = r5.A04;
        AnonymousClass3ZH A072 = this.A04.A07(r3);
        C626936e.A06(A072);
        Bitmap A032 = this.A06.A03(A0T, A072, 0.0f, A0T.getResources().getDimensionPixelSize(R.dimen.f6nameremoved), true);
        if (A032 == null) {
            AnonymousClass5UX r2 = this.A03;
            A032 = r2.A03(A0T, r2.A00(A072));
        }
        boolean A0a = this.A02.A0a(r3);
        AnonymousClass5ZU r11 = this.A05;
        int A0A2 = r11.A0A(this.A09.A02);
        String str = r5.A05;
        C626936e.A06(str);
        if (A0a) {
            r1 = new AnonymousClass7ID(A0T.getString(R.string.f11nameremoved), AnonymousClass0x2.A0X(A0T, str, 1, R.string.f11nameremoved));
        } else {
            AnonymousClass7HU A0K = A0K(A072, A0A2);
            String str2 = A0K.A01;
            Object[] A0M = AnonymousClass002.A0M();
            String str3 = str2;
            if (A0K.A00 == C998258i.PUSH_NAME) {
                str3 = r11.A0Q(A072, R.string.f11nameremoved);
            }
            A0M[0] = str3;
            r1 = new AnonymousClass7ID(str2, AnonymousClass002.A0F(A0T, str, A0M, 1, R.string.f11nameremoved));
        }
        AnonymousClass3ZH r18 = A072;
        AnonymousClass7ID r19 = r1;
        C117015rF r17 = r5;
        this.A0A.execute(new C117525s4(A0T, A032, r17, r18, r19, r7, this, str, A0A2, A0a));
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        boolean z = this.A09.A0A;
        LayoutInflater A0D = C86604Kt.A0D(viewGroup);
        if (z) {
            return new C137606oy(A0D.inflate(R.layout.f8nameremoved, viewGroup, false));
        }
        return new AnonymousClass4YV(A0D.inflate(R.layout.f8nameremoved, viewGroup, false));
    }

    public C87974Wv(C15910sA r3, C69263Wi r4, C56972sr r5, AnonymousClass5UX r6, C64773Ex r7, AnonymousClass5ZU r8, C613330g r9, C620733j r10, AnonymousClass5OD r11, AnonymousClass4UX r12, C72173dI r13) {
        this.A01 = r4;
        this.A02 = r5;
        this.A03 = r6;
        this.A04 = r7;
        this.A0A = r13;
        this.A05 = r8;
        this.A07 = r10;
        this.A06 = r9;
        this.A00 = r3;
        this.A08 = r11;
        this.A09 = r12;
        AnonymousClass6C6.A02(r3, r11.A02, this, 282);
    }
}

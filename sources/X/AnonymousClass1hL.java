package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.core.graphics.drawable.IconCompat;
import com.whatsapp.R;

/* renamed from: X.1hL  reason: invalid class name */
public class AnonymousClass1hL extends C56682sO implements C84034At {
    public AnonymousClass2QS A00;
    public final C54292oU A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1hL(X.C55682qk r16, X.C56972sr r17, X.C66663Mh r18, X.C64773Ex r19, X.AnonymousClass5ZU r20, X.C620633i r21, X.C54292oU r22, X.C620733j r23, X.C48042eF r24, X.AnonymousClass1VX r25, X.C66553Lw r26, X.AnonymousClass2QS r27, X.C59962xm r28) {
        /*
            r15 = this;
            r0 = r27
            X.1mH r13 = r0.A02
            r14 = r28
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15.A01 = r8
            r15.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1hL.<init>(X.2qk, X.2sr, X.3Mh, X.3Ex, X.5ZU, X.33i, X.2oU, X.33j, X.2eF, X.1VX, X.3Lw, X.2QS, X.2xm):void");
    }

    public C04440Of A01() {
        boolean z;
        C30331mH r1 = this.A00.A02;
        if (!(r1 instanceof C30591mh) && !(r1 instanceof C30601mi)) {
            return super.A01();
        }
        AnonymousClass3ZH A02 = A02();
        String A05 = A05();
        C95814uZ r0 = this.A00.A1J.A00;
        AnonymousClass5ZU r12 = this.A05;
        String A0R = r12.A0R(A02, r12.A07(A02, r0), false);
        if (this.A00.A00 > 1) {
            Resources A002 = C54292oU.A00(this.A01);
            int i = this.A00.A00;
            Object[] A1b = C18310x6.A1b(A0R, 0);
            C18280x3.A1Q(A1b, i - 1, 1);
            A0R = A002.getQuantityString(R.plurals.f9nameremoved, i - 1, A1b);
        }
        C624134x r2 = this.A00;
        if (!this.A03.A08(C66663Mh.A0Q) || !(r2 instanceof C31891p1)) {
            z = r2.A1J.A02;
        } else {
            z = C56972sr.A08(this.A02, A02);
        }
        if (z) {
            return this.A0B.A0E();
        }
        C03910Ma r13 = new C03910Ma();
        r13.A01 = A0R;
        r13.A00 = IconCompat.A03(this.A0B.A0D(A02));
        r13.A03 = A05;
        return new C04440Of(r13);
    }

    public final CharSequence A09(String str) {
        int i = this.A00.A00 - 1;
        if (i == 0) {
            return str;
        }
        Resources A002 = C54292oU.A00(this.A01);
        Object[] A1a = C18310x6.A1a(str);
        AnonymousClass000.A1P(A1a, i, 1);
        return A002.getQuantityString(R.plurals.f9nameremoved, i, A1a);
    }

    public final String A0A() {
        Context context;
        int i;
        Object[] A0L;
        String str;
        int i2;
        AnonymousClass2QS r3 = this.A00;
        C30331mH r1 = r3.A02;
        if (r1 instanceof C30571mf) {
            C54292oU r0 = this.A01;
            C66553Lw r12 = this.A0B;
            int i3 = r3.A00 - 1;
            Context context2 = r0.A00;
            CharSequence A0F = r12.A0F(context2, r3.A01);
            String A03 = C107165ao.A03(((C30571mf) r3.A02).A01);
            if (i3 != 0) {
                Object[] A1X = AnonymousClass0x9.A1X();
                A1X[0] = A03;
                C18280x3.A1Q(A1X, i3, 1);
                return AnonymousClass002.A0F(context2, A0F, A1X, 2, R.string.f11nameremoved);
            }
            Object[] objArr = new Object[2];
            objArr[0] = A03;
            return AnonymousClass002.A0F(context2, A0F, objArr, 1, R.string.f11nameremoved);
        }
        if (r1 instanceof C30591mh) {
            C54292oU r13 = this.A01;
            C624134x r5 = r3.A01;
            if (!(r5 instanceof C30451mT)) {
                return "";
            }
            context = r13.A00;
            i = R.string.f11nameremoved;
            A0L = AnonymousClass002.A0M();
            A0L[0] = "📊";
            str = ((C30451mT) r5).A03;
            i2 = 1;
        } else if (!(r1 instanceof C30601mi)) {
            return "";
        } else {
            C54292oU r2 = this.A01;
            C624134x r14 = r3.A01;
            if (!(r14 instanceof C30461mU)) {
                return "";
            }
            context = r2.A00;
            i = R.string.f11nameremoved;
            A0L = AnonymousClass002.A0L();
            str = ((C30461mU) r14).A04;
            i2 = 0;
        }
        return AnonymousClass002.A0F(context, str, A0L, i2, i);
    }

    public AnonymousClass2z0 BAW() {
        return this.A00.A01.A1J;
    }
}

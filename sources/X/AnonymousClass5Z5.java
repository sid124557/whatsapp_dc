package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import com.whatsapp.R;

/* renamed from: X.5Z5  reason: invalid class name */
public class AnonymousClass5Z5 {
    public final AnonymousClass5XU A00;
    public final AnonymousClass5Z4 A01;
    public final C53602nM A02;
    public final AnonymousClass33p A03;
    public final C620733j A04;
    public final AnonymousClass1VX A05;
    public final AnonymousClass4FV A06;

    public static String A01(Context context, Uri uri, int i) {
        Object[] objArr = new Object[1];
        AnonymousClass0x7.A1E(uri, objArr, 0);
        return AnonymousClass002.A0F(context, context.getString(R.string.f11nameremoved, objArr), new Object[1], 0, i);
    }

    public Dialog A02(Activity activity, C50382i5 r15) {
        AnonymousClass5Z4 r3 = this.A01;
        int A002 = AnonymousClass5Z4.A00(r3.A00.A01(), r3.A01.A0H());
        long j = (long) A002;
        A03((Integer) null, 0, j, this.A00.A01().getTime());
        C19340zH A003 = AnonymousClass5V0.A00(activity);
        A003.A0U(R.string.f11nameremoved);
        C620733j r32 = this.A04;
        Object[] objArr = new Object[1];
        AnonymousClass000.A1P(objArr, A002, 0);
        A003.A0g(r32.A0L(objArr, R.plurals.f9nameremoved, j));
        A003.A0Y(new C107965cC(activity, this, r15, A002), R.string.f11nameremoved);
        A003.A0W(new C1234668n(activity, this, A002, 0), R.string.f11nameremoved);
        return A003.create();
    }

    public final void A03(Integer num, int i, long j, long j2) {
        if (this.A05.A0X(3299)) {
            C94674rj r1 = new C94674rj();
            r1.A02 = C18290x4.A0Z();
            if (i != 0) {
                r1.A01 = num;
            }
            r1.A00 = Integer.valueOf(i);
            r1.A04 = Long.valueOf(j);
            r1.A03 = Long.valueOf(j2);
            this.A06.BhA(r1);
        }
    }

    public AnonymousClass5Z5(AnonymousClass5XU r1, AnonymousClass5Z4 r2, C53602nM r3, AnonymousClass33p r4, C620733j r5, AnonymousClass1VX r6, AnonymousClass4FV r7) {
        this.A05 = r6;
        this.A00 = r1;
        this.A06 = r7;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    public static Uri A00(C50382i5 r0) {
        return r0.A00();
    }
}

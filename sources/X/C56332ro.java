package X;

import android.content.res.Resources;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Iterator;

/* renamed from: X.2ro  reason: invalid class name and case insensitive filesystem */
public class C56332ro {
    public final C64393Dh A00;
    public final C56972sr A01;
    public final AnonymousClass30B A02;
    public final C56612sH A03;
    public final C54292oU A04;

    public File A00(AnonymousClass3ZH r6) {
        if ((r6 instanceof AnonymousClass1RS) || C95804uY.A00(r6.A0H)) {
            return A02(r6);
        }
        C95814uZ A012 = AnonymousClass3ZH.A01(r6);
        if (A012 == null) {
            return null;
        }
        boolean A0a = this.A01.A0a(A012);
        C54292oU r0 = this.A04;
        if (A0a) {
            return AnonymousClass002.A0A(C54292oU.A03(r0), "me.jpg");
        }
        File A0A = AnonymousClass002.A0A(C54292oU.A02(r0), "Profile Pictures");
        C18280x3.A10(A0A);
        String str = A012.user;
        StringBuilder A0o = AnonymousClass001.A0o();
        if (str == null) {
            str = A012.getRawString();
        }
        A0o.append(str);
        return C18270x1.A0A(A0A, ".jpg", A0o);
    }

    public File A01(AnonymousClass3ZH r5) {
        String rawString;
        if ((r5 instanceof AnonymousClass1RS) || C95804uY.A00(r5.A0H)) {
            return A02(r5);
        }
        C95814uZ A012 = AnonymousClass3ZH.A01(r5);
        if (A012 == null) {
            return null;
        }
        File A0A = AnonymousClass002.A0A(C54292oU.A03(this.A04), "Avatars");
        C18280x3.A10(A0A);
        if (this.A01.A0a(A012)) {
            rawString = "me";
        } else {
            rawString = A012.getRawString();
        }
        return C18270x1.A0A(A0A, ".j", AnonymousClass000.A0l(rawString));
    }

    public File A02(AnonymousClass3ZH r5) {
        String A0i;
        C64393Dh r2;
        StringBuilder A0l;
        if (r5 instanceof AnonymousClass1RS) {
            r2 = this.A00;
            A0l = AnonymousClass000.A0l("tmpp");
            A0i = ((AnonymousClass1RS) r5).A00;
        } else {
            if (r5 != null) {
                C95814uZ r1 = r5.A0H;
                if (C95804uY.A00(r1)) {
                    A0i = C18300x5.A0i(r1);
                    r2 = this.A00;
                    A0l = AnonymousClass000.A0l("tmpp");
                }
            }
            return this.A00.A0S("tmpp");
        }
        return r2.A0S(AnonymousClass000.A0X(A0i, A0l));
    }

    public void A05(AnonymousClass3ZH r2, byte[] bArr, boolean z) {
        File A012;
        if (z) {
            A012 = A00(r2);
        } else {
            A012 = A01(r2);
        }
        if (bArr == null) {
            return;
        }
        if (A012 != null) {
            C627536m.A0H(A012, bArr);
        } else {
            Log.e("ContactPhotoUpdater/updatePhotoFiles/no thumb photo file when expected");
        }
    }

    public boolean A06(AnonymousClass3ZH r4) {
        Resources A002 = C54292oU.A00(this.A04);
        return AnonymousClass000.A1W(this.A02.A01().A06(r4.A0M(A002.getDimension(R.dimen.f6nameremoved), A002.getDimensionPixelSize(R.dimen.f6nameremoved))));
    }

    public C56332ro(C64393Dh r1, C56972sr r2, AnonymousClass30B r3, C56612sH r4, C54292oU r5) {
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A03(AnonymousClass3ZH r2) {
        File A002 = A00(r2);
        if (A002 != null) {
            C18270x1.A0x(A002);
        }
        File A012 = A01(r2);
        if (A012 != null) {
            C18270x1.A0x(A012);
        }
    }

    public void A04(AnonymousClass3ZH r6) {
        String A0K = r6.A0K();
        if (A0K != null) {
            C33131sU A012 = this.A02.A01();
            Iterator A0i = C18280x3.A0i(A012.A02.A06());
            while (A0i.hasNext()) {
                String A0m = AnonymousClass001.A0m(A0i);
                if (A0m.startsWith(A0K)) {
                    A012.A08(A0m);
                }
            }
        }
        r6.A0g = true;
        if (r6.A0H instanceof C95804uY) {
            r6.A0C = System.currentTimeMillis();
        }
    }

    public boolean A07(AnonymousClass3ZH r3) {
        File A012 = A01(r3);
        if (((A012 == null || !A012.exists()) && (A012 = A00(r3)) == null) || !A012.exists()) {
            return false;
        }
        return true;
    }
}

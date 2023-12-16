package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4ox  reason: invalid class name and case insensitive filesystem */
public final class C93654ox extends C113255l8 {
    public final C113245l7 A00;
    public final C93724pC A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C93654ox(X.AnonymousClass5M7 r4, X.C113245l7 r5, X.C93724pC r6) {
        /*
            r3 = this;
            r0 = 1
            X.C18260x0.A0Z(r4, r5, r6, r0)
            X.655[] r2 = new X.AnonymousClass655[r0]
            X.4eZ r0 = X.C113245l7.A09(r5)
            X.C162457s7.A0D(r0)
            X.4ow r1 = r4.A00(r0)
            r0 = 0
            r2[r0] = r1
            r3.<init>(r2)
            r3.A00 = r5
            r3.A01 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93654ox.<init>(X.5M7, X.5l7, X.4pC):void");
    }

    public boolean B2s(AnonymousClass654 r24, Collection collection, int i) {
        AnonymousClass1RL r1;
        String str;
        Object obj;
        Collection collection2 = collection;
        C162457s7.A0J(collection2, 1);
        int i2 = i;
        if (i2 == 1) {
            AnonymousClass1QT r3 = this.A01.A05;
            C624134x A0b = C86654Ky.A0b(collection2);
            C113245l7 r12 = this.A00;
            C162457s7.A0J(A0b, 0);
            if (r3.A01.A01(A0b)) {
                C95814uZ r0 = r12.A4J;
                C89644eZ A09 = C113245l7.A09(r12);
                C162457s7.A0D(A09);
                if (r0 == null) {
                    Log.i("Unable to launch bottom sheet due to null chatJid");
                    return true;
                }
                A09.Boo(AnonymousClass25W.A00(r0, A0b));
                return true;
            } else if (r12.A37.A0F()) {
                C89644eZ A092 = C113245l7.A09(r12);
                C162457s7.A0D(A092);
                r3.A02(A092, A0b);
                return true;
            } else {
                r12.A3B.A0S(A0b);
                return true;
            }
        } else if (i2 == 9) {
            return this.A01.A03.A01(this.A00, C86654Ky.A0b(collection2));
        } else if (i2 == 12) {
            AnonymousClass1QU r2 = this.A01.A04;
            C624134x A0b2 = C86654Ky.A0b(collection2);
            C89644eZ A093 = C113245l7.A09(this.A00);
            C162457s7.A0D(A093);
            return r2.A02(A093, A0b2);
        } else if (i2 == 15) {
            C93834pQ r32 = this.A01.A06;
            C624134x A0b3 = C86654Ky.A0b(collection2);
            C113245l7 r13 = this.A00;
            C162457s7.A0J(A0b3, 0);
            C89644eZ A094 = C113245l7.A09(r13);
            C162457s7.A0D(A094);
            C119535x8 r7 = new C119535x8(r13);
            C95814uZ r4 = A0b3.A1J.A00;
            if (r4 == null) {
                return false;
            }
            r32.A01.A08().A03(new C116475qL(A094, r32, r4, A0b3, "message_menu", r7));
            return true;
        } else if (i2 == 26) {
            C93814pO r22 = this.A01.A08;
            C624134x A0b4 = C86654Ky.A0b(collection2);
            C113245l7 r14 = this.A00;
            C162457s7.A0J(A0b4, 0);
            if (!(A0b4 instanceof C30721mu) || !(C113245l7.A09(r14) instanceof C184608sD)) {
                return true;
            }
            C89644eZ A095 = C113245l7.A09(r14);
            C162457s7.A0K(A095, "null cannot be cast to non-null type com.whatsapp.voicetranscription.PttTranscriptionUtils.PttTranscriptionCallback");
            r22.A01.A0B((C30721mu) A0b4, (C184608sD) A095);
            return true;
        } else if (i2 == 28) {
            C93884pV r9 = this.A01.A02;
            C624134x A0b5 = C86654Ky.A0b(collection2);
            C113245l7 r8 = this.A00;
            C162457s7.A0J(A0b5, 0);
            C95814uZ r15 = A0b5.A1J.A00;
            if (!(r15 instanceof C27991fJ)) {
                return false;
            }
            C89644eZ A096 = C113245l7.A09(r8);
            C27991fJ A012 = r9.A03.A01((C27991fJ) r15);
            String A0D = r9.A05.A0D(A012);
            A096.A6f(A096.getString(R.string.f11nameremoved));
            String A0e = C18300x5.A0e(A096, A0D, new Object[1], 0, R.string.f11nameremoved);
            String valueOf = String.valueOf(A0b5.A13());
            List emptyList = Collections.emptyList();
            C162457s7.A0D(emptyList);
            C66493Lq r132 = r9.A09;
            C28001fK A05 = r132.A05();
            r132.A1G.add(A05);
            C47492dL r02 = new C47492dL(A05);
            r02.A03 = A0e;
            r02.A02 = valueOf;
            r02.A04 = emptyList;
            r02.A01 = A012;
            r02.A08 = true;
            AnonymousClass2U1 A002 = r02.A00();
            C56612sH r10 = r9.A04;
            C27611eC r72 = new C27611eC(r8, r9, r10, r9.A06, r9.A07, r132, A002, r9.A0B);
            AnonymousClass1VX r33 = r9.A08;
            new AnonymousClass3TR(r9.A00, r9.A02, r10, r33, r132, r72, r72.A04, r9.A0A).A00();
            return true;
        } else if (i2 == 31) {
            C22761Pz r23 = this.A01.A07;
            C624134x A0b6 = C86654Ky.A0b(collection2);
            C89644eZ A097 = C113245l7.A09(this.A00);
            C162457s7.A0D(A097);
            return r23.A01(A097, A0b6);
        } else if (i2 == 34) {
            C93854pS r6 = this.A01.A00;
            C624134x A0b7 = C86654Ky.A0b(collection2);
            C162457s7.A0J(A0b7, 0);
            ClipboardManager A0C = r6.A01.A0C();
            if (A0C != null) {
                AnonymousClass31A A0A = r6.A03.A0A(A0b7.A1J.A00, false);
                if (!(A0A instanceof AnonymousClass1RL) || (r1 = (AnonymousClass1RL) A0A) == null || (str = r1.A0G) == null) {
                    return true;
                }
                long j = A0b7.A1M;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("https://whatsapp.com/channel/");
                A0o.append(str);
                A0o.append('/');
                String A0k = AnonymousClass001.A0k(A0o, j);
                try {
                    A0C.setPrimaryClip(ClipData.newPlainText(A0k, A0k));
                    r6.A00.A0H(R.string.f11nameremoved, 0);
                    obj = C59022wD.A00;
                } catch (Throwable th) {
                    obj = new AnonymousClass3Z0(th);
                }
                if (AnonymousClass3Z9.A00(obj) == null) {
                    return true;
                }
            }
            r6.A00.A0H(R.string.f11nameremoved, 0);
            return true;
        } else if (i2 != 35) {
            return super.B2s(r24, collection2, i2);
        } else {
            C89644eZ A098 = C113245l7.A09(this.A00);
            C162457s7.A0D(A098);
            C624134x A0b8 = C86654Ky.A0b(collection2);
            C162457s7.A0J(A0b8, 1);
            A098.startActivity(C627736r.A0j(A098, A0b8.A0o()));
            return true;
        }
    }
}

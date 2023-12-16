package X;

import android.content.Context;
import android.os.SystemClock;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2nK  reason: invalid class name and case insensitive filesystem */
public class C53582nK {
    public final C64773Ex A00;
    public final AnonymousClass2K7 A01;
    public final AnonymousClass5ZU A02;
    public final C56612sH A03;
    public final C54292oU A04;
    public final C620733j A05;
    public final AnonymousClass3S3 A06;

    public String A01(AnonymousClass3ZH r12) {
        Context context;
        int i;
        C41652Lb r4;
        Context context2;
        int i2;
        if (r12.A0H instanceof AnonymousClass1fS) {
            return null;
        }
        boolean A0U = r12.A0U();
        AnonymousClass3S3 r42 = this.A06;
        Class<C95814uZ> cls = C95814uZ.class;
        if (A0U) {
            C95814uZ A022 = AnonymousClass3ZH.A02(r12, cls);
            AnonymousClass2SS r1 = (AnonymousClass2SS) r42.A06.get(A022);
            Object obj = null;
            if (r1 != null) {
                int i3 = -1;
                if (C627336j.A0K(A022)) {
                    HashMap hashMap = r1.A05;
                    if (hashMap != null) {
                        Iterator A0u = AnonymousClass001.A0u(hashMap);
                        long j = 0;
                        while (A0u.hasNext()) {
                            Map.Entry A0w = AnonymousClass001.A0w(A0u);
                            if (((C41642La) A0w.getValue()).A01 > j) {
                                obj = A0w.getKey();
                                j = ((C41642La) A0w.getValue()).A01;
                                i3 = ((C41642La) A0w.getValue()).A00;
                            }
                        }
                        if (j != 0 && j + 25000 > SystemClock.elapsedRealtime()) {
                            C626936e.A06(obj);
                            r4 = new C41652Lb((C95814uZ) obj, i3);
                        }
                    }
                } else {
                    int A012 = r42.A01(A022, (UserJid) null);
                    if (A012 != -1) {
                        r4 = new C41652Lb(A022, A012);
                    }
                }
                AnonymousClass3ZH A0A = this.A00.A0A(r4.A01);
                AnonymousClass5ZU r13 = this.A02;
                String A0P = r13.A0P(A0A, r13.A0A(r12.A0H));
                int i4 = r4.A00;
                if (i4 == 0) {
                    context2 = this.A04.A00;
                    i2 = R.string.f11nameremoved;
                } else if (i4 == 1) {
                    context2 = this.A04.A00;
                    i2 = R.string.f11nameremoved;
                }
                Object[] objArr = new Object[1];
                C620733j.A03(this.A05, A0P, objArr, 0);
                return context2.getString(i2, objArr);
            }
        } else {
            int A013 = r42.A01(AnonymousClass3ZH.A02(r12, cls), (UserJid) null);
            if (A013 == 0) {
                context = this.A04.A00;
                i = R.string.f11nameremoved;
            } else if (A013 == 1) {
                context = this.A04.A00;
                i = R.string.f11nameremoved;
            }
            return context.getString(i);
        }
        return null;
    }

    public C53582nK(C64773Ex r1, AnonymousClass2K7 r2, AnonymousClass5ZU r3, C56612sH r4, C54292oU r5, C620733j r6, AnonymousClass3S3 r7) {
        this.A04 = r5;
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
        this.A05 = r6;
        this.A06 = r7;
        this.A01 = r2;
    }

    public String A00(AnonymousClass3ZH r8) {
        int i;
        String A012 = A01(r8);
        if (A012 != null) {
            return A012;
        }
        long A022 = this.A06.A02(AnonymousClass3ZH.A02(r8, C95814uZ.class));
        if (A022 == 0) {
            return "";
        }
        if (A022 == 1) {
            return this.A04.A00.getString(R.string.f11nameremoved);
        }
        toString();
        C56612sH r0 = this.A03;
        long A0I = r0.A0I(A022);
        int A002 = C107175ap.A00(r0.A0H(), A0I);
        if (A002 <= 6) {
            if (A002 != 0) {
                if (A002 != 1) {
                    Calendar instance = Calendar.getInstance();
                    instance.setTimeInMillis(A0I);
                    switch (instance.get(7)) {
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
                        case 6:
                            i = R.string.f11nameremoved;
                            break;
                        case 7:
                            i = R.string.f11nameremoved;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                } else {
                    i = R.string.f11nameremoved;
                }
            } else {
                i = R.string.f11nameremoved;
            }
            C620733j r4 = this.A05;
            return C107145am.A01(r4, AnonymousClass0x2.A0X(this.A04.A00, C107145am.A00(r4, A0I), 1, i), A0I);
        }
        return AnonymousClass0x2.A0X(this.A04.A00, C107565bW.A07(this.A05, A002, A0I), 1, R.string.f11nameremoved);
    }

    public String A02(AnonymousClass3ZH r8) {
        if (A01(r8) != null) {
            return null;
        }
        AnonymousClass3S3 r4 = this.A06;
        Class<C95814uZ> cls = C95814uZ.class;
        long A022 = r4.A02(AnonymousClass3ZH.A02(r8, cls));
        if (1 == r4.A02(AnonymousClass3ZH.A02(r8, cls))) {
            return null;
        }
        C56612sH r0 = this.A03;
        long A0I = r0.A0I(A022);
        int A002 = C107175ap.A00(r0.A0H(), A0I);
        if (A002 > 6) {
            return C107565bW.A07(this.A05, A002, A0I);
        }
        if (!(A002 == 0 || A002 == 1)) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(A0I);
            instance.get(7);
        }
        C620733j r1 = this.A05;
        return C107145am.A01(r1, C107145am.A00(r1, A0I), A0I);
    }
}

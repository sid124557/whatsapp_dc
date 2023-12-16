package X;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.whatsapp.R;
import java.util.Calendar;

/* renamed from: X.9bc  reason: invalid class name and case insensitive filesystem */
public class C196709bc implements C203549nv {
    public final C54292oU A00;
    public final C620733j A01;
    public final AnonymousClass1VX A02;
    public final AnonymousClass9O7 A03;
    public final C1906999m A04;
    public final AnonymousClass9WM A05;
    public final C1907099n A06;
    public final C203499no A07;
    public final C160757oG A08 = C160757oG.A00("BrazilPaymentErrorHelper", "payment", "BR");

    public AnonymousClass043 A01(Context context, AnonymousClass1VX r6, AnonymousClass9TZ r7, int i, int i2) {
        String str;
        AnonymousClass043 A032 = this.A05.A03(context, (DialogInterface.OnDismissListener) null, (DialogInterface.OnDismissListener) null, i);
        if (A032 != null) {
            return A032;
        }
        if (r6.A0X(698)) {
            str = r7.A02(String.valueOf(i));
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            int i3 = R.string.f11nameremoved;
            if (i != -233) {
                i3 = R.string.f11nameremoved;
                if (i != 477) {
                    i3 = R.string.f11nameremoved;
                    if (i != 10229) {
                        i3 = R.string.f11nameremoved;
                        if (i != 10234) {
                            i3 = R.string.f11nameremoved;
                            if (i != 10780) {
                                if (i != 2896002) {
                                    str = context.getString(i2);
                                } else {
                                    C19340zH A002 = AnonymousClass5V0.A00(context);
                                    A002.A0T(R.string.f11nameremoved);
                                    C19340zH.A06(A002);
                                    A002.A0W(new C204379pG(context, 5, this), R.string.f11nameremoved);
                                    return A002.create();
                                }
                            }
                        }
                    }
                }
            }
            str = context.getString(i3);
        }
        return AnonymousClass9WM.A00(context, new C204649ph(0), str);
    }

    public String B7P(String str, int i) {
        Context context;
        int i2;
        if (i == 14121 || i == 14125) {
            context = this.A00.A00;
            i2 = R.string.f11nameremoved;
        } else if (i != 2709017) {
            return str;
        } else {
            context = this.A00.A00;
            i2 = R.string.f11nameremoved;
        }
        return context.getString(i2);
    }

    public String BCE(int i) {
        Context context;
        int i2;
        if (i == 1703) {
            context = this.A00.A00;
            i2 = R.string.f11nameremoved;
        } else if (i == 10768) {
            context = this.A00.A00;
            i2 = R.string.f11nameremoved;
        } else if (i == 10779 || i == 12854 || i == 12907 || i == 20986 || i == 2709018) {
            context = this.A00.A00;
            i2 = R.string.f11nameremoved;
        } else if (i == 2826005) {
            context = this.A00.A00;
            i2 = R.string.f11nameremoved;
        } else if (i == 10755) {
            context = this.A00.A00;
            i2 = R.string.f11nameremoved;
        } else if (i != 10756) {
            return null;
        } else {
            context = this.A00.A00;
            i2 = R.string.f11nameremoved;
        }
        return context.getString(i2);
    }

    public boolean BHn(int i) {
        return AnonymousClass000.A1U(i, 2001);
    }

    public boolean BHq(int i) {
        return AnonymousClass000.A1U(i, 10244);
    }

    public boolean BHr(int i) {
        return AnonymousClass000.A1U(i, 10242);
    }

    public boolean BHs(int i) {
        return AnonymousClass000.A1U(i, 10241);
    }

    public boolean BHu(int i) {
        return AnonymousClass000.A1U(i, 10240);
    }

    public boolean BI2(int i) {
        return AnonymousClass000.A1U(i, 12871);
    }

    public boolean BI3(int i) {
        return AnonymousClass000.A1U(i, 18510);
    }

    public boolean BI4(int i) {
        return AnonymousClass000.A1U(i, 12894);
    }

    public boolean BI8(int i) {
        return AnonymousClass000.A1U(i, 12858);
    }

    public boolean BI9(int i) {
        return AnonymousClass000.A1U(i, 21001);
    }

    public boolean BIM(int i) {
        return AnonymousClass000.A1U(i, 20985);
    }

    public boolean BJE(int i) {
        return AnonymousClass000.A1U(i, 21000);
    }

    public C196709bc(C54292oU r4, C620733j r5, AnonymousClass1VX r6, AnonymousClass9O7 r7, C1906999m r8, AnonymousClass9WM r9, C1907099n r10, C203499no r11) {
        this.A00 = r4;
        this.A02 = r6;
        this.A01 = r5;
        this.A06 = r10;
        this.A07 = r11;
        this.A03 = r7;
        this.A05 = r9;
        this.A04 = r8;
    }

    public AnonymousClass043 A00(Context context, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnDismissListener onDismissListener2, DialogInterface.OnDismissListener onDismissListener3, String str, int i) {
        Context context2 = context;
        int i2 = i;
        if (i2 == 2896002) {
            C19340zH A002 = AnonymousClass5V0.A00(context2);
            A002.A0T(R.string.f11nameremoved);
            C19340zH.A06(A002);
            A002.A0W(new C204379pG(context2, 5, this), R.string.f11nameremoved);
            return A002.create();
        }
        DialogInterface.OnDismissListener onDismissListener4 = onDismissListener2;
        DialogInterface.OnDismissListener onDismissListener5 = onDismissListener3;
        String str2 = str;
        switch (i) {
            case 10780:
                return AnonymousClass9WM.A00(context2, onDismissListener4, context2.getString(R.string.f11nameremoved));
            case 2826028:
            case 2826029:
                return AnonymousClass9WM.A00(context2, onDismissListener5, C86604Kt.A0m(context2, str2, R.string.f11nameremoved));
            case 2826043:
                C620733j r4 = this.A01;
                Calendar instance = Calendar.getInstance(r4.A0O());
                instance.set(10, 20);
                instance.set(12, 0);
                String A003 = C107145am.A00(r4, instance.getTimeInMillis());
                Calendar instance2 = Calendar.getInstance(r4.A0O());
                instance2.set(10, 6);
                instance2.set(12, 0);
                String A004 = C107145am.A00(r4, instance2.getTimeInMillis());
                String valueOf = String.valueOf(2826043);
                String string = context2.getString(R.string.f11nameremoved);
                Object[] objArr = new Object[2];
                objArr[0] = A003;
                String A0F = AnonymousClass002.A0F(context2, A004, objArr, 1, R.string.f11nameremoved);
                C203499no r42 = this.A07;
                if (r42 != null) {
                    C134246ig B0d = r42.B0d();
                    C1899593h.A1B(B0d, 4);
                    B0d.A0b = "error";
                    B0d.A0S = valueOf;
                    B0d.A0T = A0F;
                    if (string != null) {
                        B0d.A0U = string;
                    }
                    C1899593h.A1H(this.A08, r42, "PaymentUserActionEvent errorLoggingEvent: ", AnonymousClass001.A0o());
                    r42.BKA(B0d);
                }
                String string2 = context2.getString(R.string.f11nameremoved);
                Object[] objArr2 = new Object[2];
                objArr2[0] = A003;
                return AnonymousClass9WM.A01(context2, onDismissListener5, string2, AnonymousClass002.A0F(context2, A004, objArr2, 1, R.string.f11nameremoved));
            default:
                return this.A05.A05(context2, onDismissListener, onDismissListener4, onDismissListener5, str2, i2);
        }
    }

    public String B68(int i) {
        Context context;
        int i2;
        if (!AnonymousClass000.A1U(i, 2826013)) {
            return null;
        }
        C1907099n r2 = this.A06;
        if (r2.A02.A0X(1587)) {
            context = this.A00.A00;
            i2 = R.string.f11nameremoved;
        } else if (!r2.A00()) {
            return null;
        } else {
            boolean A0C = this.A04.A0C();
            context = this.A00.A00;
            i2 = R.string.f11nameremoved;
            if (!A0C) {
                i2 = R.string.f11nameremoved;
            }
        }
        return context.getString(i2);
    }

    public int B69(C108985dt r4, AnonymousClass9Tp r5, int i) {
        if (!AnonymousClass000.A1U(i, 2826013)) {
            return -1;
        }
        C1907099n r2 = this.A06;
        if (r2.A02.A0X(1587)) {
            return 20;
        }
        if (!r2.A00()) {
            return -1;
        }
        if (!this.A04.A0C()) {
            return 25;
        }
        AnonymousClass1VX r1 = r5.A04;
        r1.A0X(1176);
        r1.A0X(1212);
        return -1;
    }

    public String B6A(int i) {
        if (!AnonymousClass000.A1U(i, 2826013)) {
            return null;
        }
        C1907099n r1 = this.A06;
        if (r1.A00() || r1.A02.A0X(1587)) {
            return this.A00.A00.getString(R.string.f11nameremoved);
        }
        return null;
    }

    public boolean BIN(int i) {
        return AnonymousClass000.A1U(i, 1353003);
    }

    public boolean BIZ(int i) {
        return AnonymousClass000.A1U(i, 2826013);
    }

    public int B7Q(C153607bd r2, int i) {
        return 0;
    }

    public int BKw() {
        return 0;
    }

    public int BKx() {
        return 0;
    }

    public String B6B(int i) {
        return null;
    }

    public void BF4(String str) {
    }

    public boolean BHM(int i) {
        return false;
    }

    public boolean BHQ(int i) {
        return false;
    }

    public boolean BHo(int i) {
        return false;
    }

    public boolean BHp(int i) {
        return false;
    }

    public boolean BHt(int i) {
        return false;
    }

    public boolean BI7(int i) {
        return false;
    }

    public boolean BJ9(int i) {
        return false;
    }

    public boolean BoX(int i) {
        return true;
    }
}

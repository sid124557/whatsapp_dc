package X;

import android.content.Intent;
import com.whatsapp.R;
import java.util.Objects;

/* renamed from: X.9bd  reason: invalid class name and case insensitive filesystem */
public class C196719bd implements C203549nv {
    public final C620733j A00;
    public final AnonymousClass1VX A01;
    public final AnonymousClass9U1 A02;
    public final C196629bS A03;
    public final AnonymousClass9TZ A04;

    public static boolean A02(AnonymousClass9DA r2, String str, int i, boolean z) {
        AnonymousClass9DA r0 = r2;
        Objects.requireNonNull(r2);
        return A01(r0, new AnonymousClass9NC(r2), new C198829fY(r0), str, i, z);
    }

    public AnonymousClass9VW A03(C153607bd r2) {
        return A04(r2, 0);
    }

    public int B7Q(C153607bd r2, int i) {
        return A04((C153607bd) null, i).A00;
    }

    public static int A00(C153607bd r3, int i) {
        int i2;
        int i3;
        if (i <= 0 && r3 != null) {
            synchronized (r3) {
                i2 = r3.A01;
            }
            synchronized (r3) {
                i3 = r3.A02;
            }
            int i4 = r3.A00;
            if (i2 > 0) {
                return i2;
            }
            if (i3 > 0) {
                return i3;
            }
            if (i4 > 0) {
                return i4;
            }
        }
        return i;
    }

    public static boolean A01(C89654ea r6, AnonymousClass9NC r7, Runnable runnable, String str, int i, boolean z) {
        Intent A07;
        if (i == 404) {
            if (z) {
                StringBuilder A0o = AnonymousClass001.A0o();
                AnonymousClass000.A17(r6, "PAY: ", " op: ", A0o);
                A0o.append(str);
                A0o.append(" payment account error: ");
                A0o.append(i);
                C18260x0.A1K(A0o, "; restartPaymentsAccountSetupAndFinish");
                if (runnable != null) {
                    runnable.run();
                }
                A07 = C18320x8.A07();
                A07.setClassName(r6.getPackageName(), "com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity");
            }
            return false;
        } else if (i == 440) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            AnonymousClass000.A17(r6, "PAY: ", " op: ", A0o2);
            A0o2.append(str);
            C18260x0.A1K(A0o2, " tos not accepted; showTosAndFinish");
            A07 = C18320x8.A07();
            A07.setClassName(r6.getPackageName(), "com.whatsapp.payments.ui.IndiaUpiPaymentsTosActivity");
            A07.putExtra("extra_show_updated_tos", false);
            if (r7 != null) {
                r7.A00.A7O(A07);
            }
            if (runnable != null) {
                runnable.run();
            }
            r6.A6T(A07, true);
            return true;
        } else if (i != 442) {
            if (i == 443) {
                StringBuilder A0o3 = AnonymousClass001.A0o();
                AnonymousClass000.A17(r6, "PAY: ", " op: ", A0o3);
                A0o3.append(str);
                C18260x0.A1K(A0o3, " payment unsupported for client version");
                if (runnable != null) {
                    runnable.run();
                }
                A07 = C18320x8.A07();
                A07.setClassName(r6.getPackageName(), "com.whatsapp.payments.ui.PaymentsUpdateRequiredActivity");
                A07.addFlags(335544320);
            }
            return false;
        } else {
            StringBuilder A0o4 = AnonymousClass001.A0o();
            AnonymousClass000.A17(r6, "PAY: ", " op: ", A0o4);
            A0o4.append(str);
            C18260x0.A1K(A0o4, " tos v2 not accepted; showTosAndFinish");
            Intent A072 = C18320x8.A07();
            A072.setClassName(r6.getPackageName(), "com.whatsapp.payments.ui.IndiaUpiPaymentsTosActivity");
            A072.putExtra("extra_show_updated_tos", true);
            if (r7 != null) {
                r7.A00.A7O(A072);
            }
            r6.startActivityForResult(A072, 1000);
            return true;
        }
        if (r7 != null) {
            r7.A00.A7O(A07);
        }
        r6.A6T(A07, true);
        return true;
    }

    public String B7P(String str, int i) {
        String A002 = this.A04.A00(i);
        if (A002 != null) {
            return A002;
        }
        return str;
    }

    public void BF4(String str) {
        if (str.equals(String.valueOf(11456)) || str.equals(String.valueOf(11471))) {
            C18260x0.A0s("PAY: IndiaUpiErrorHelper/handlePaymentTransactionError handle:", str, AnonymousClass001.A0o());
            this.A03.A0E();
            AnonymousClass9U1 r2 = this.A02;
            r2.A04.A07.add("done");
            r2.A0A();
        }
    }

    public boolean BHM(int i) {
        return AnonymousClass000.A1U(i, 11510);
    }

    public boolean BHQ(int i) {
        return AnonymousClass000.A1U(i, 10756);
    }

    public boolean BHn(int i) {
        return AnonymousClass000.A1U(i, 11482);
    }

    public boolean BHo(int i) {
        return AnonymousClass000.A1U(i, 11459);
    }

    public boolean BHp(int i) {
        return AnonymousClass000.A1U(i, 11504);
    }

    public boolean BHt(int i) {
        return AnonymousClass000.A1U(i, 11503);
    }

    public boolean BI7(int i) {
        return AnonymousClass000.A1U(i, 11468);
    }

    public boolean BJ9(int i) {
        if (i == 11455 || i == 11502) {
            return true;
        }
        return false;
    }

    public C196719bd(C620733j r1, AnonymousClass1VX r2, AnonymousClass9U1 r3, C196629bS r4, AnonymousClass9TZ r5) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A04 = r5;
        this.A03 = r4;
    }

    public AnonymousClass9VW A04(C153607bd r6, int i) {
        String str;
        int i2;
        Object obj;
        int A002 = A00(r6, i);
        if (this.A01.A0X(698)) {
            str = this.A04.A02(String.valueOf(A002));
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("PAY:IndiaUpiErrorHelper/getErrorString/error message: ");
            A0o.append(str);
            C18260x0.A0w("error code: ", A0o, A002);
        } else {
            str = null;
        }
        if (A002 == 443) {
            i2 = R.string.f11nameremoved;
        } else {
            if (!(A002 == 6 || A002 == 7)) {
                if (A002 == 405) {
                    i2 = R.string.f11nameremoved;
                } else if (A002 == 406) {
                    i2 = R.string.f11nameremoved;
                } else if (A002 == 409) {
                    i2 = R.string.f11nameremoved;
                } else if (A002 != 410) {
                    if (A002 != 21137 && A002 != 21138) {
                        switch (A002) {
                            case -2:
                                break;
                            case 400:
                            case 500:
                            case 4002:
                            case 11500:
                            case 2826004:
                                i2 = R.string.f11nameremoved;
                                break;
                            case 403:
                                i2 = R.string.f11nameremoved;
                                break;
                            case 426:
                                i2 = R.string.f11nameremoved;
                                break;
                            case 460:
                                i2 = R.string.f11nameremoved;
                                break;
                            case 503:
                            case 10702:
                            case 11474:
                            case 11484:
                                i2 = R.string.f11nameremoved;
                                break;
                            case 10780:
                            case 11497:
                            case 11537:
                            case 11540:
                                i2 = R.string.f11nameremoved;
                                break;
                            case 17009:
                                i2 = R.string.f11nameremoved;
                                break;
                            case 21157:
                            case 21164:
                                i2 = R.string.f11nameremoved;
                                break;
                            default:
                                i2 = 0;
                                break;
                        }
                    } else {
                        i2 = R.string.f11nameremoved;
                    }
                } else {
                    i2 = R.string.f11nameremoved;
                }
            }
            i2 = R.string.f11nameremoved;
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("PAY: getErrorString errorCode: ");
        A0o2.append(A002);
        A0o2.append(" states last error: ");
        if (r6 != null) {
            obj = Integer.valueOf(r6.A00);
        } else {
            obj = "null";
        }
        A0o2.append(obj);
        C18260x0.A0y(" resId returned: ", A0o2, i2);
        return new AnonymousClass9VW(i2, str);
    }

    public String B6B(int i) {
        if (i != 2826003) {
            return null;
        }
        C620733j r4 = this.A00;
        Object[] A0L = AnonymousClass002.A0L();
        AnonymousClass000.A1L(A0L, 5);
        return r4.A0L(A0L, R.plurals.f9nameremoved, 5);
    }

    public boolean BoX(int i) {
        if (BJ9(i) || i == 11503 || i == 11504 || i == 11482 || i == 11468 || i == 10756) {
            return false;
        }
        return true;
    }

    public int BKw() {
        return 100000;
    }

    public int BKx() {
        return 10;
    }

    public String B68(int i) {
        return null;
    }

    public String B6A(int i) {
        return null;
    }

    public String BCE(int i) {
        return null;
    }

    public boolean BHq(int i) {
        return false;
    }

    public boolean BHr(int i) {
        return false;
    }

    public boolean BHs(int i) {
        return false;
    }

    public boolean BHu(int i) {
        return false;
    }

    public boolean BI2(int i) {
        return false;
    }

    public boolean BI3(int i) {
        return false;
    }

    public boolean BI4(int i) {
        return false;
    }

    public boolean BI8(int i) {
        return false;
    }

    public boolean BI9(int i) {
        return false;
    }

    public boolean BIM(int i) {
        return false;
    }

    public boolean BIN(int i) {
        return false;
    }

    public boolean BIZ(int i) {
        return false;
    }

    public boolean BJE(int i) {
        return false;
    }

    public int B69(C108985dt r2, AnonymousClass9Tp r3, int i) {
        return -1;
    }
}

package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.9bp  reason: invalid class name and case insensitive filesystem */
public class C196839bp implements C202529mA {
    public final C620933l A00;

    public static final void A00(C617332a r7, AnonymousClass36K r8, AnonymousClass36K r9, ArrayList arrayList, int i) {
        AnonymousClass38U r0;
        int length;
        int i2 = 0;
        if (i == 2) {
            AnonymousClass36K[] r6 = r9.A03;
            if (r6 != null) {
                int length2 = r6.length;
                while (i2 < length2) {
                    AnonymousClass36K r2 = r6[i2];
                    if (r2 != null) {
                        if ("bank".equals(r2.A00)) {
                            r0 = new AnonymousClass99H();
                            r0.A04(r7, r8, 2);
                        } else if ("psp".equals(r2.A00) || "psp-routing".equals(r2.A00)) {
                            r0 = new AnonymousClass99E();
                        }
                        r0.A04(r7, r2, 2);
                        arrayList.add(r0);
                    }
                    i2++;
                }
            }
        } else if (i == 4) {
            AnonymousClass36K[] r3 = r9.A03;
            if (r3 != null && (length = r3.length) > 0) {
                do {
                    AnonymousClass36K r1 = r3[i2];
                    if (r1 != null) {
                        AnonymousClass99H r02 = new AnonymousClass99H();
                        r02.A04(r7, r1, 4);
                        arrayList.add(r02);
                    }
                    i2++;
                } while (i2 < length);
            }
        } else if (i != 5) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("PAY: IndiaProtoParser got action: ");
            A0o.append(i);
            C18260x0.A1L(A0o, "; nothing to do");
        } else {
            AnonymousClass99E r03 = new AnonymousClass99E();
            r03.A04(r7, r9, 5);
            arrayList.add(r03);
        }
    }

    public C196839bp(C620933l r1) {
        this.A00 = r1;
    }

    public ArrayList BgU(C617332a r10, AnonymousClass36K r11) {
        int i;
        boolean z;
        AnonymousClass36K A0T = C1899693i.A0T(r11);
        ArrayList A0s = AnonymousClass001.A0s();
        if (A0T == null) {
            Log.w("PAY: IndiaProtoParser empty account node");
        } else {
            String A0r = A0T.A0r("wa-support-phone-number", (String) null);
            if (!TextUtils.isEmpty(A0r)) {
                C18270x1.A0j(C620933l.A00(this.A00), "payments_support_phone_number", A0r);
            }
            String A0r2 = A0T.A0r("action", (String) null);
            if ("upi-batch".equalsIgnoreCase(A0r2)) {
                i = 1;
            } else if ("upi-get-banks".equalsIgnoreCase(A0r2)) {
                i = 2;
            } else if ("upi-register-vpa".equalsIgnoreCase(A0r2)) {
                i = 4;
            } else if ("upi-list-keys".equalsIgnoreCase(A0r2)) {
                i = 5;
            } else if ("upi-check-mpin".equalsIgnoreCase(A0r2)) {
                i = 6;
            } else if ("pay-precheck".equalsIgnoreCase(A0r2)) {
                i = 8;
            } else {
                boolean equalsIgnoreCase = "upi-get-psp-routing-and-list-keys".equalsIgnoreCase(A0r2);
                i = 0;
                if (equalsIgnoreCase) {
                    i = 10;
                }
            }
            int i2 = 0;
            if (i == 1 || i == 10) {
                AnonymousClass36K[] r8 = A0T.A03;
                if (r8 != null) {
                    while (i2 < r8.length) {
                        AnonymousClass36K r2 = r8[i2];
                        if (r2 != null) {
                            String str = r2.A00;
                            switch (str.hashCode()) {
                                case -384112062:
                                    z = str.equals("psp-config");
                                    break;
                                case 3288564:
                                    if (str.equals("keys")) {
                                        A00(r10, A0T, r2, A0s, 5);
                                        break;
                                    } else {
                                        continue;
                                    }
                                case 93503927:
                                    z = str.equals("banks");
                                    break;
                            }
                            if (z) {
                                A00(r10, A0T, r2, A0s, 2);
                            }
                        }
                        i2++;
                    }
                }
            } else if (i == 2) {
                A00(r10, A0T, A0T, A0s, 2);
                AnonymousClass36K[] r22 = A0T.A03;
                if (r22 != null) {
                    while (i2 < r22.length) {
                        AnonymousClass36K r1 = r22[i2];
                        if (r1 != null && "psp-config".equals(r1.A00)) {
                            A00(r10, A0T, r1, A0s, 2);
                        }
                        i2++;
                    }
                }
            } else {
                A00(r10, A0T, A0T, A0s, i);
                return A0s;
            }
        }
        return A0s;
    }
}

package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment;
import com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity;

/* renamed from: X.9oL  reason: invalid class name and case insensitive filesystem */
public class C203809oL extends C08380eM {
    public Object A00;
    public String A01;
    public String A02;
    public final int A03;

    public C203809oL(Object obj, String str, String str2, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A02 = str;
        this.A01 = str2;
    }

    public C05550Ty Azr(Class cls) {
        Class cls2 = cls;
        if (this.A03 != 0) {
            if (cls2.isAssignableFrom(AnonymousClass94u.class)) {
                IndiaUpiQrCodeUrlValidationActivity indiaUpiQrCodeUrlValidationActivity = (IndiaUpiQrCodeUrlValidationActivity) this.A00;
                C66663Mh r7 = indiaUpiQrCodeUrlValidationActivity.A06;
                C194759Uj r6 = indiaUpiQrCodeUrlValidationActivity.A05;
                AnonymousClass94u r8 = new AnonymousClass94u(r7, indiaUpiQrCodeUrlValidationActivity.A00, indiaUpiQrCodeUrlValidationActivity.A02, indiaUpiQrCodeUrlValidationActivity.A04, r6);
                C205049qL A002 = C205049qL.A00(this, 48);
                AnonymousClass4UC r1 = r8.A00;
                r1.A0B(indiaUpiQrCodeUrlValidationActivity, A002);
                String str = this.A02;
                String str2 = this.A01;
                if (TextUtils.isEmpty(str)) {
                    C193639Pk.A00(r1, 0);
                    return r8;
                }
                r8.A01 = str2;
                r8.A03.A0H(C195179Wl.A01(str, str2));
                C194759Uj r5 = r8.A08;
                C166557yt A0G = C1899693i.A0G(AnonymousClass3QD.A00(), r8.A0D().A0O, "upiHandle");
                C193139Nh r0 = new C193139Nh(r8);
                AnonymousClass9QD r62 = r5.A01;
                Context context = r62.A01.A00;
                C69263Wi r82 = r62.A00;
                AnonymousClass31C r10 = r62.A04;
                C194259Se r12 = r62.A0A;
                new AnonymousClass9AI(context, r82, r62.A02, r10, r62.A05, r62.A06, r62.A07, r62.A08, r62.A09, r12).A01(A0G, (C166557yt) null, new C196639bV(indiaUpiQrCodeUrlValidationActivity, A0G, r5, r0));
                return r8;
            }
            throw AnonymousClass001.A0c("Invalid viewModel");
        } else if (cls2.isAssignableFrom(C1901994m.class)) {
            IndiaUpiQrCodeScannedDialogFragment indiaUpiQrCodeScannedDialogFragment = (IndiaUpiQrCodeScannedDialogFragment) this.A00;
            C54292oU r83 = indiaUpiQrCodeScannedDialogFragment.A0D;
            C1901994m r9 = new C1901994m(indiaUpiQrCodeScannedDialogFragment.A0B, r83, indiaUpiQrCodeScannedDialogFragment.A0E, indiaUpiQrCodeScannedDialogFragment.A0I, indiaUpiQrCodeScannedDialogFragment.A0J, indiaUpiQrCodeScannedDialogFragment.A0K);
            C205049qL A003 = C205049qL.A00(this, 38);
            C205049qL A004 = C205049qL.A00(this, 39);
            C205049qL A005 = C205049qL.A00(this, 40);
            C205049qL A006 = C205049qL.A00(this, 41);
            C205049qL A007 = C205049qL.A00(this, 42);
            C205049qL A008 = C205049qL.A00(this, 43);
            C205049qL A009 = C205049qL.A00(this, 44);
            C205049qL A0010 = C205049qL.A00(this, 45);
            C205049qL A0011 = C205049qL.A00(this, 46);
            r9.A02.A0B(indiaUpiQrCodeScannedDialogFragment, A003);
            r9.A05.A0B(indiaUpiQrCodeScannedDialogFragment, A004);
            r9.A09.A0B(indiaUpiQrCodeScannedDialogFragment, A005);
            r9.A08.A0B(indiaUpiQrCodeScannedDialogFragment, A006);
            r9.A01.A0B(indiaUpiQrCodeScannedDialogFragment, A007);
            r9.A00.A0B(indiaUpiQrCodeScannedDialogFragment, A008);
            r9.A03.A0B(indiaUpiQrCodeScannedDialogFragment, A009);
            r9.A07.A0B(indiaUpiQrCodeScannedDialogFragment, A0010);
            r9.A04.A0B(indiaUpiQrCodeScannedDialogFragment, A0011);
            r9.A0A.A0B(indiaUpiQrCodeScannedDialogFragment, C205049qL.A00(this, 47));
            r9.A0D(this.A02, this.A01);
            return r9;
        } else {
            throw AnonymousClass001.A0c("Invalid viewModel");
        }
    }
}

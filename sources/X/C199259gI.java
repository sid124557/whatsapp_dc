package X;

import android.content.Context;
import com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity;

/* renamed from: X.9gI  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C199259gI implements Runnable {
    public final /* synthetic */ IndiaUpiDeviceBindStepActivity A00;

    public final void run() {
        IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity = this.A00;
        AnonymousClass9VD r9 = indiaUpiDeviceBindStepActivity.A0G;
        String str = indiaUpiDeviceBindStepActivity.A0X;
        String str2 = indiaUpiDeviceBindStepActivity.A0Z;
        String str3 = indiaUpiDeviceBindStepActivity.A0Y;
        String A05 = indiaUpiDeviceBindStepActivity.A0L.A05(str);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PAY: sendDeviceBindingIq called with psp: ");
        A0o.append(str);
        A0o.append(" verificationData: ");
        C18260x0.A1L(A0o, C195009Vm.A00(str2));
        C197109ca r10 = r9.A0F;
        AnonymousClass9B3 r11 = null;
        r10.A08((AnonymousClass34V) null, 20, 0);
        C153607bd r8 = r9.A0D;
        r8.A03("upi-bind-device");
        AnonymousClass31C r2 = r9.A09;
        String A03 = r2.A03();
        String A01 = r9.A0I.A01();
        C192209Ip r15 = new C192209Ip(new AnonymousClass9IP(A03), 3L, AnonymousClass0x2.A0T(), A01, str2, str, str3, C1899693i.A0Z(r9.A0B.A0P() ? 1 : 0));
        boolean A0X = r9.A08.A0X(2227);
        String str4 = "in_upi_device_binding_tag";
        if (A0X) {
            r9.A0G.A02(185476608, str4);
        }
        AnonymousClass36K r1 = r15.A00;
        Context context = r9.A06.A00;
        C69263Wi r6 = r9.A05;
        C40602Ha r7 = r9.A0C;
        if (A0X) {
            r11 = r9.A0G;
        } else {
            str4 = null;
        }
        r2.A0D(new AnonymousClass9AX(context, r6, r7, r8, r9, r10, r11, str4, str, A05), r1, A03, 204, 0);
    }

    public /* synthetic */ C199259gI(IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity) {
        this.A00 = indiaUpiDeviceBindStepActivity;
    }
}

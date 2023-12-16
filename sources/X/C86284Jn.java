package X;

import com.whatsapp.companiondevice.LinkedDevicesSharedViewModel;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;

/* renamed from: X.4Jn  reason: invalid class name and case insensitive filesystem */
public class C86284Jn implements C84134Bd {
    public Object A00;
    public String A01;
    public final int A02;

    public C86284Jn(int i, String str, Object obj) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    public final void AwB(Object obj) {
        if (this.A02 != 0) {
            C613530j r4 = (C613530j) this.A00;
            String str = this.A01;
            AnonymousClass3Z6 r8 = (AnonymousClass3Z6) obj;
            C162457s7.A0J(r8, 2);
            short s = 3;
            if (AnonymousClass001.A1Z(r8.first)) {
                s = 2;
            }
            r4.A0O.A06(str.hashCode(), s);
            if (AnonymousClass001.A1Z(r8.first)) {
                C161447pg r1 = r4.A01;
                if (r1 == null) {
                    throw C18270x1.A0S("fdsManager");
                }
                Object obj2 = r8.second;
                if (obj2 != null) {
                    r1.A0D(str, (String) obj2);
                    return;
                }
                throw C18300x5.A0X();
            }
            return;
        }
        LinkedDevicesSharedViewModel linkedDevicesSharedViewModel = (LinkedDevicesSharedViewModel) this.A00;
        String str2 = this.A01;
        try {
            C29041iB r42 = linkedDevicesSharedViewModel.A0H;
            boolean A1U = AnonymousClass000.A1U(r42.A0D().size(), 1);
            Log.d("LinkedDevicesSharedViewModel/onLogoutDevice logout");
            DeviceJid A022 = DeviceJid.Companion.A02(str2);
            boolean z = false;
            if (!A1U) {
                z = true;
            }
            r42.A0I(A022, "user_initiated", false, z);
        } catch (AnonymousClass24P e) {
            C18260x0.A0u("Invalid jid: ", str2, AnonymousClass001.A0o(), e);
        }
    }
}

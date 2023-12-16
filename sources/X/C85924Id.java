package X;

import android.app.Activity;
import com.whatsapp.companiondevice.LinkedDevicesSharedViewModel;
import com.whatsapp.identity.IdentityVerificationActivity;
import com.whatsapp.util.Log;

/* renamed from: X.4Id  reason: invalid class name and case insensitive filesystem */
public class C85924Id implements AnonymousClass4FJ {
    public Object A00;
    public final int A01;

    public C85924Id(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BQS(C48932fi r4) {
        Activity activity;
        Runnable runnable;
        switch (this.A01) {
            case 0:
                Log.w("LinkedDevicesEnterCodeActivity/companionDeviceObserver/onCriticalDataSyncFailed");
                activity = (Activity) this.A00;
                runnable = new C70193a6(this, 26, r4);
                break;
            case 3:
                activity = (Activity) this.A00;
                runnable = C70133a0.A00(this, r4, 37);
                break;
            default:
                return;
        }
        activity.runOnUiThread(runnable);
    }

    public void BQx(C48932fi r4) {
        Activity activity;
        Runnable runnable;
        switch (this.A01) {
            case 0:
                activity = (Activity) this.A00;
                runnable = new C70193a6(this, 23, r4);
                break;
            case 3:
                activity = (Activity) this.A00;
                runnable = C70133a0.A00(this, r4, 39);
                break;
            default:
                return;
        }
        activity.runOnUiThread(runnable);
    }

    public void BR0(C48932fi r4) {
        Activity activity;
        Runnable r1;
        switch (this.A01) {
            case 0:
                Log.i("LinkedDevicesEnterCodeActivity/companionDeviceObserver/onDeviceLoginComplete");
                activity = (Activity) this.A00;
                r1 = new C70193a6(this, 25, r4);
                break;
            case 1:
                ((LinkedDevicesSharedViewModel) this.A00).A0W.A0G((Object) null);
                return;
            case 2:
                IdentityVerificationActivity identityVerificationActivity = (IdentityVerificationActivity) this.A00;
                identityVerificationActivity.A7B(C56972sr.A04(identityVerificationActivity.A01));
                return;
            default:
                activity = (Activity) this.A00;
                r1 = C70133a0.A00(this, r4, 38);
                break;
        }
        activity.runOnUiThread(r1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003c, code lost:
        if (r4 != null) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void BR1(X.C129526aS r8, int r9) {
        /*
            r7 = this;
            int r0 = r7.A01
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x0068
            int r0 = r8.size()
            r6 = 1
            if (r0 != r6) goto L_0x003e
            java.lang.Object r5 = r7.A00
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r5 = (com.whatsapp.companiondevice.LinkedDevicesSharedViewModel) r5
            X.1iB r1 = r5.A0H
            X.8Nf r0 = r8.iterator()
            com.whatsapp.jid.Jid r0 = X.AnonymousClass0x7.A0S(r0)
            java.lang.String r0 = r0.getRawString()
            com.whatsapp.jid.DeviceJid r0 = com.whatsapp.jid.DeviceJid.getNullable(r0)
            X.C626936e.A06(r0)
            X.33G r0 = r1.A0A(r0)
            if (r0 == 0) goto L_0x003e
            java.lang.String r4 = r0.A09
            if (r4 == 0) goto L_0x003e
            android.app.Application r3 = r5.A04
            r2 = 2131893857(0x7f121e61, float:1.9422502E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r0 = 0
            java.lang.String r4 = X.AnonymousClass002.A0F(r3, r4, r1, r0, r2)
            if (r4 != 0) goto L_0x004b
        L_0x003e:
            java.lang.Object r5 = r7.A00
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r5 = (com.whatsapp.companiondevice.LinkedDevicesSharedViewModel) r5
            android.app.Application r3 = r5.A04
            r0 = 2131890443(0x7f12110b, float:1.9415578E38)
            java.lang.String r4 = r3.getString(r0)
        L_0x004b:
            X.1ip r0 = r5.A0E
            boolean r1 = r0.A0F()
            r0 = 2131890926(0x7f1212ee, float:1.9416558E38)
            if (r1 == 0) goto L_0x0059
            r0 = 2131890442(0x7f12110a, float:1.9415576E38)
        L_0x0059:
            java.lang.String r3 = r3.getString(r0)
            X.3Wi r2 = r5.A08
            r1 = 5
            X.3aI r0 = new X.3aI
            r0.<init>(r7, r3, r4, r1)
            r2.A0S(r0)
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85924Id.BR1(X.6aS, int):void");
    }

    public void BR2(C48932fi r4) {
        Activity activity;
        Runnable runnable;
        switch (this.A01) {
            case 0:
                Log.i("LinkedDevicesEnterCodeActivity/companionDeviceObserver/onDeviceRegistered");
                activity = (Activity) this.A00;
                runnable = new C70193a6(this, 27, r4);
                break;
            case 3:
                activity = (Activity) this.A00;
                runnable = C70133a0.A00(this, r4, 36);
                break;
            default:
                return;
        }
        activity.runOnUiThread(runnable);
    }

    public /* synthetic */ void BR3(C129526aS r3) {
        switch (this.A01) {
            case 1:
                C69263Wi.A03(((LinkedDevicesSharedViewModel) this.A00).A08, this, 47);
                return;
            case 2:
                IdentityVerificationActivity identityVerificationActivity = (IdentityVerificationActivity) this.A00;
                identityVerificationActivity.A7B(C56972sr.A04(identityVerificationActivity.A01));
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void BR4(AnonymousClass33G r3) {
        if (1 - this.A01 == 0) {
            ((LinkedDevicesSharedViewModel) this.A00).A0W.A0G((Object) null);
        }
    }
}

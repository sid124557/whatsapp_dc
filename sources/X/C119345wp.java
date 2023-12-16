package X;

import com.whatsapp.companiondevice.LinkedDeviceEditDeviceActivity;

/* renamed from: X.5wp  reason: invalid class name and case insensitive filesystem */
public final class C119345wp extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ LinkedDeviceEditDeviceActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119345wp(LinkedDeviceEditDeviceActivity linkedDeviceEditDeviceActivity) {
        super(0);
        this.this$0 = linkedDeviceEditDeviceActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LinkedDeviceEditDeviceActivity linkedDeviceEditDeviceActivity = this.this$0;
        AnonymousClass1VX r9 = linkedDeviceEditDeviceActivity.A0D;
        C69263Wi r4 = linkedDeviceEditDeviceActivity.A05;
        C55682qk r3 = linkedDeviceEditDeviceActivity.A03;
        C116985rC r1 = linkedDeviceEditDeviceActivity.A00;
        if (r1 != null) {
            C620633i r7 = linkedDeviceEditDeviceActivity.A08;
            AnonymousClass2R8 r8 = linkedDeviceEditDeviceActivity.A04;
            if (r8 != null) {
                C116985rC r2 = linkedDeviceEditDeviceActivity.A01;
                if (r2 != null) {
                    return new C50492iG(r1, r2, r3, r4, linkedDeviceEditDeviceActivity, linkedDeviceEditDeviceActivity, r7, r8, r9);
                }
                throw C18270x1.A0S("subscriptionManager");
            }
            throw C18270x1.A0S("smbMDExtensionUtils");
        }
        throw C18270x1.A0S("smbStrings");
    }
}

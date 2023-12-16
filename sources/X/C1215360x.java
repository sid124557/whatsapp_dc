package X;

import com.whatsapp.companiondevice.LinkedDeviceEditDeviceActivity;
import com.whatsapp.companiondevice.LinkedDeviceEditDeviceViewModel;
import com.whatsapp.jid.DeviceJid;

/* renamed from: X.60x  reason: invalid class name and case insensitive filesystem */
public final class C1215360x extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ LinkedDeviceEditDeviceActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1215360x(LinkedDeviceEditDeviceActivity linkedDeviceEditDeviceActivity) {
        super(1);
        this.this$0 = linkedDeviceEditDeviceActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        LinkedDeviceEditDeviceViewModel linkedDeviceEditDeviceViewModel = (LinkedDeviceEditDeviceViewModel) this.this$0.A0A.getValue();
        DeviceJid deviceJid = this.this$0.A05;
        if (deviceJid == null) {
            throw C18270x1.A0S("deviceJid");
        }
        C70193a6.A01(linkedDeviceEditDeviceViewModel.A02, linkedDeviceEditDeviceViewModel, deviceJid, 22);
        return C59022wD.A00;
    }
}

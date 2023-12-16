package X;

import android.app.ProgressDialog;
import com.whatsapp.R;
import com.whatsapp.companiondevice.LinkedDevicesSharedViewModel;
import com.whatsapp.deviceauth.BiometricAuthPlugin;

/* renamed from: X.2iG  reason: invalid class name and case insensitive filesystem */
public class C50492iG {
    public ProgressDialog A00;
    public final C116985rC A01;
    public final C116985rC A02;
    public final C55682qk A03;
    public final C69263Wi A04;
    public final C89644eZ A05;
    public final LinkedDevicesSharedViewModel A06;
    public final AnonymousClass49W A07;
    public final C620633i A08;
    public final AnonymousClass2R8 A09;
    public final BiometricAuthPlugin A0A;
    public final AnonymousClass1VX A0B;

    public void A00() {
        LinkedDevicesSharedViewModel linkedDevicesSharedViewModel = this.A06;
        AnonymousClass4UC r1 = linkedDevicesSharedViewModel.A0R;
        C89644eZ r2 = this.A05;
        AnonymousClass4K2.A00(r2, r1, this, 63);
        AnonymousClass4K2.A00(r2, linkedDevicesSharedViewModel.A0S, this, 64);
        AnonymousClass4K2.A00(r2, linkedDevicesSharedViewModel.A0T, this, 65);
        AnonymousClass4K2.A00(r2, linkedDevicesSharedViewModel.A0O, this, 66);
        AnonymousClass4K2.A00(r2, linkedDevicesSharedViewModel.A0N, this, 67);
        AnonymousClass4K2.A00(r2, linkedDevicesSharedViewModel.A0X, this, 68);
        AnonymousClass4K2.A00(r2, linkedDevicesSharedViewModel.A05, this, 69);
        AnonymousClass4K2.A00(r2, linkedDevicesSharedViewModel.A0P, this, 70);
    }

    public void A01(int i) {
        AnonymousClass4UC r1;
        LinkedDevicesSharedViewModel linkedDevicesSharedViewModel = this.A06;
        if (i == -1 || i == 4) {
            if (linkedDevicesSharedViewModel.A00 != 1 || !linkedDevicesSharedViewModel.A0A.A01()) {
                r1 = linkedDevicesSharedViewModel.A0V;
            } else {
                r1 = linkedDevicesSharedViewModel.A0U;
            }
            r1.A0H((Object) null);
            return;
        }
        linkedDevicesSharedViewModel.A0M.A00(3);
    }

    public C50492iG(C116985rC r11, C116985rC r12, C55682qk r13, C69263Wi r14, C89644eZ r15, AnonymousClass49W r16, C620633i r17, AnonymousClass2R8 r18, AnonymousClass1VX r19) {
        AnonymousClass1VX r7 = r19;
        this.A0B = r7;
        this.A04 = r14;
        this.A03 = r13;
        this.A01 = r11;
        C620633i r5 = r17;
        this.A08 = r5;
        this.A09 = r18;
        this.A02 = r12;
        C89644eZ r2 = r15;
        this.A05 = r15;
        this.A06 = (LinkedDevicesSharedViewModel) AnonymousClass0x9.A0H(r15).A01(LinkedDevicesSharedViewModel.class);
        this.A0A = new BiometricAuthPlugin(r2, r13, r14, r5, new AnonymousClass4HZ(this, 0), r7, R.string.f11nameremoved, 0);
        this.A07 = r16;
    }
}

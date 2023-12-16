package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.bonsai.discovery.BonsaiDiscoveryActivity;
import com.whatsapp.camera.mode.CameraModeTabLayout;
import com.whatsapp.stickers.store.StickerStoreActivity;

/* renamed from: X.6C2  reason: invalid class name */
public class AnonymousClass6C2 implements C183978qy, C187908y0 {
    public Object A00;
    public final int A01;

    public AnonymousClass6C2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void Bdu(AnonymousClass5T2 r3) {
        if (1 - this.A01 == 0) {
            CameraModeTabLayout cameraModeTabLayout = (CameraModeTabLayout) this.A00;
            C106755a7.A01(cameraModeTabLayout, cameraModeTabLayout.getSystemServices());
        }
    }

    public void Bdv(AnonymousClass5T2 r10) {
        String str;
        switch (this.A01) {
            case 0:
                BonsaiDiscoveryActivity bonsaiDiscoveryActivity = (BonsaiDiscoveryActivity) this.A00;
                if (!bonsaiDiscoveryActivity.A01) {
                    bonsaiDiscoveryActivity.A01 = true;
                    return;
                } else if (r10 != null) {
                    AnonymousClass4FV r2 = bonsaiDiscoveryActivity.A00;
                    if (r2 != null) {
                        AnonymousClass1ZN r1 = new AnonymousClass1ZN();
                        r1.A00 = 30;
                        CharSequence charSequence = r10.A05;
                        if (charSequence == null || (str = charSequence.toString()) == null) {
                            str = "";
                        }
                        r1.A03 = str;
                        r1.A02 = 36;
                        r2.BhD(r1);
                        return;
                    }
                    throw C18270x1.A0S("wamRuntime");
                } else {
                    return;
                }
            case 1:
                C162457s7.A0J(r10, 0);
                CameraModeTabLayout cameraModeTabLayout = (CameraModeTabLayout) this.A00;
                C179188ik r22 = cameraModeTabLayout.A00;
                if (r22 != null) {
                    Object obj = r10.A06;
                    C162457s7.A0K(obj, "null cannot be cast to non-null type kotlin.Int");
                    int A0K = AnonymousClass001.A0K(obj);
                    AnonymousClass5ZS r8 = ((C170978Fg) r22).A00;
                    C104405Qv r3 = r8.A0i;
                    r3.A00 = A0K;
                    r8.A0I.A01(AnonymousClass000.A1U(A0K, 2), false, false);
                    AnonymousClass5Y6 r5 = r8.A0E;
                    boolean A1U = AnonymousClass000.A1U(r3.A00, 2);
                    r5.A08 = A1U;
                    int i = R.drawable.shutter_button_background;
                    if (A1U) {
                        i = R.drawable.recording_button_background;
                    }
                    WaImageView waImageView = r5.A0I;
                    Context context = r5.A09;
                    C18290x4.A1A(context, waImageView, i);
                    float f = 1.0f;
                    float f2 = 0.6f;
                    if (A1U) {
                        f2 = 1.0f;
                        f = 0.6f;
                    }
                    r5.A03(f2, f, false);
                    boolean z = r5.A08;
                    int i2 = R.string.f11nameremoved;
                    if (z) {
                        i2 = R.string.f11nameremoved;
                    }
                    C18300x5.A13(context, waImageView, i2);
                    r8.A09();
                }
                C106755a7.A01(cameraModeTabLayout, cameraModeTabLayout.getSystemServices());
                return;
            default:
                ((StickerStoreActivity) this.A00).A01.setCurrentItem(r10.A00);
                return;
        }
    }
}

package X;

import android.content.Context;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

/* renamed from: X.3F4  reason: invalid class name */
public final class AnonymousClass3F4 implements C182218o3 {
    public final Context A00;
    public final C27991fJ A01;
    public final C27991fJ A02;
    public final C624134x A03;

    public List getCTAViews() {
        C95084sb r5 = new C95084sb();
        WDSButton[] wDSButtonArr = new WDSButton[2];
        Context context = this.A00;
        AnonymousClass570 r8 = new AnonymousClass570(context);
        r8.setOnClickListener(new C109545en(this.A02, r8, this.A03, 2, false));
        wDSButtonArr[0] = r8;
        C995456z r3 = new C995456z(context);
        C27991fJ r2 = this.A01;
        if (r2 != null) {
            r3.setupOnClick(r2, (C89654ea) C111095hX.A03(r3.getContext(), C89654ea.class), r5);
        }
        return AnonymousClass0x9.A19(r3, wDSButtonArr, 1);
    }

    public AnonymousClass3F4(Context context, C27991fJ r2, C27991fJ r3, C624134x r4) {
        this.A00 = context;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }
}

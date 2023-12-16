package X;

import com.facebook.xanalytics.XAnalyticsAdapterHolder;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;

/* renamed from: X.9PA  reason: invalid class name */
public final class AnonymousClass9PA {
    public String A00 = SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME;
    public final C195879Zw A01;
    public final XAnalyticsAdapterHolder A02;
    public final AnonymousClass2MA A03;

    public AnonymousClass9PA(AnonymousClass2MA r3) {
        this.A03 = r3;
        C195879Zw r1 = new C195879Zw(r3);
        this.A01 = r1;
        this.A02 = new XAnalyticsAdapterHolder(r1);
    }
}

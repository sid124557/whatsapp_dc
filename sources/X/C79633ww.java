package X;

import com.whatsapp.stickers.WebpInfo;

/* renamed from: X.3ww  reason: invalid class name and case insensitive filesystem */
public final class C79633ww extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C32731rW this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79633ww(C32731rW r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        int i;
        C32731rW r2 = this.this$0;
        WebpInfo webpInfo = r2.A01;
        if (webpInfo == null || webpInfo.numFrames <= 1) {
            i = -1;
        } else {
            i = r2.A02.A01(r2.A03.getAbsolutePath());
        }
        return Integer.valueOf(i);
    }
}

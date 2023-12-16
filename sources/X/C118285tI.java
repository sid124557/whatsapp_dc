package X;

import com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel;
import java.util.ArrayList;

/* renamed from: X.5tI  reason: invalid class name and case insensitive filesystem */
public class C118285tI extends ArrayList<AnonymousClass5L7> {
    public final /* synthetic */ InCallBannerViewModel this$0;

    public C118285tI(InCallBannerViewModel inCallBannerViewModel) {
        this.this$0 = inCallBannerViewModel;
    }

    /* renamed from: A01 */
    public AnonymousClass5L7 set(AnonymousClass5L7 r5, int i) {
        if (i != 0) {
            return (AnonymousClass5L7) super.set(i, r5);
        }
        AnonymousClass5L7 r3 = (AnonymousClass5L7) super.set(0, r5);
        int i2 = r3.A01;
        if (i2 != r5.A01) {
            InCallBannerViewModel inCallBannerViewModel = this.this$0;
            if (i2 == 14) {
                inCallBannerViewModel.A0B.A0G((Object) null);
            }
        }
        return r3;
    }

    /* renamed from: A00 */
    public AnonymousClass5L7 remove(int i) {
        AnonymousClass5L7 r3 = (AnonymousClass5L7) super.remove(i);
        if (i == 0) {
            InCallBannerViewModel inCallBannerViewModel = this.this$0;
            if (r3.A01 == 14) {
                inCallBannerViewModel.A0B.A0G((Object) null);
            }
        }
        return r3;
    }

    public void clear() {
        if (size() > 0) {
            super.clear();
            InCallBannerViewModel inCallBannerViewModel = this.this$0;
            if (((AnonymousClass5L7) AnonymousClass0x9.A0t(this)).A01 == 14) {
                inCallBannerViewModel.A0B.A0G((Object) null);
            }
        }
    }
}

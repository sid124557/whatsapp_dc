package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.3P0  reason: invalid class name */
public class AnonymousClass3P0 implements AnonymousClass4EO {
    public final /* synthetic */ C59822xY A00;
    public final /* synthetic */ AnonymousClass3ZH A01;
    public final /* synthetic */ C28001fK A02;

    public AnonymousClass3P0(C59822xY r1, AnonymousClass3ZH r2, C28001fK r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void BdP(AnonymousClass2RJ r7, C27991fJ r8) {
        C59822xY r5 = this.A00;
        r5.A0H.remove(this.A02);
        File A002 = r5.A08.A00(this.A01);
        if (A002 != null && A002.exists()) {
            r5.A0F.A0H(r5.A07.A0A(r8), A002, (byte[]) null, false);
        }
        C59822xY.A00(r5, r5.A0I.decrementAndGet());
    }

    public void Be8() {
        Log.d("CreateCommunityManager/createAndLinkGroupsToParentGroup/timeout Failed to create a group");
        C59822xY r1 = this.A00;
        C59822xY.A00(r1, r1.A0I.decrementAndGet());
    }

    public void onError(int i) {
        Log.d("CreateCommunityManager/createAndLinkGroupsToParentGroup Failed to create a group");
        C59822xY r1 = this.A00;
        C59822xY.A00(r1, r1.A0I.decrementAndGet());
    }
}

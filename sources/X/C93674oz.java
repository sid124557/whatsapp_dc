package X;

import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.status.playback.MyStatusesActivity;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.4oz  reason: invalid class name and case insensitive filesystem */
public final class C93674oz extends C113255l8 {
    public final MyStatusesActivity A00;
    public final C93784pI A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93674oz(AnonymousClass5M7 r4, MyStatusesActivity myStatusesActivity, C93784pI r6) {
        super(r4.A00(myStatusesActivity));
        C162457s7.A0J(r4, 1);
        this.A00 = myStatusesActivity;
        this.A01 = r6;
    }

    public boolean B2s(AnonymousClass654 r8, Collection collection, int i) {
        WfalManager wfalManager;
        C162457s7.A0J(collection, 1);
        if (i == 13) {
            AnonymousClass520 r6 = this.A01.A03;
            MyStatusesActivity myStatusesActivity = this.A00;
            ArrayList A0J = AnonymousClass002.A0J(collection);
            int i2 = 6;
            int i3 = 6;
            if (collection.size() > 1) {
                i3 = 7;
            }
            Integer valueOf = Integer.valueOf(i3);
            if (collection.size() <= 1) {
                i2 = 5;
            }
            myStatusesActivity.A78(AnonymousClass58B.FACEBOOK_SHARE, valueOf, Integer.valueOf(i2), A0J);
            if (r6.A05.A00()) {
                return true;
            }
            wfalManager = r6.A00;
        } else if (i == 14) {
            this.A00.A78(AnonymousClass58B.THIRD_PARTY_SHARE, (Integer) null, (Integer) null, AnonymousClass002.A0J(collection));
            return true;
        } else if (i == 21) {
            return this.A01.A01.A00(this.A00, collection);
        } else {
            if (i != 36) {
                return super.B2s(r8, collection, i);
            }
            AnonymousClass51z r62 = this.A01.A04;
            MyStatusesActivity myStatusesActivity2 = this.A00;
            ArrayList A0J2 = AnonymousClass002.A0J(collection);
            int i4 = 6;
            int i5 = 6;
            if (collection.size() > 1) {
                i5 = 7;
            }
            Integer valueOf2 = Integer.valueOf(i5);
            if (collection.size() <= 1) {
                i4 = 5;
            }
            myStatusesActivity2.A78(AnonymousClass58B.INSTAGRAM_SHARE, valueOf2, Integer.valueOf(i4), A0J2);
            wfalManager = r62.A00;
        }
        if (wfalManager.A02()) {
            return true;
        }
        return false;
    }
}

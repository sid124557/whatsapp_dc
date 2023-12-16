package X;

import android.database.Cursor;
import com.whatsapp.mediaview.MediaViewFragment;

/* renamed from: X.6pv  reason: invalid class name and case insensitive filesystem */
public class C138196pv extends AnonymousClass5ZM {
    public final int A00;
    public final long A01;
    public final AnonymousClass319 A02;
    public final AnonymousClass1VX A03;
    public final C95814uZ A04;
    public final C171468He A05;
    public final C55832qz A06;
    public final boolean A07;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Cursor A052;
        C55832qz r6 = this.A06;
        C95814uZ r5 = this.A04;
        boolean z = this.A07;
        AnonymousClass319 r2 = this.A02;
        long j = this.A01;
        if (z) {
            A052 = r2.A04(r5, 0, j);
        } else {
            A052 = r2.A05(r5, 0, j);
        }
        C86684Lb r1 = new C86684Lb(A052, this.A03, r5, r6);
        if (C18320x8.A1T(this)) {
            r1.close();
            return null;
        }
        r1.getCount();
        r1.moveToPosition(this.A00);
        return r1;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C86684Lb r3;
        C86684Lb r1;
        C86684Lb r6 = (C86684Lb) obj;
        if (r6 != null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("MediaMessagesNavigator/navigator/cursor-upgraded is-head:");
            boolean z = this.A07;
            A0o.append(z);
            A0o.append(" count:");
            A0o.append(r6.getCount());
            A0o.append(" pos:");
            C18260x0.A1F(A0o, r6.getPosition());
            C171468He r4 = this.A05;
            MediaViewFragment mediaViewFragment = r4.A0F;
            if (mediaViewFragment.A0Q() != null && !((C89654ea) mediaViewFragment.A0R()).BHW()) {
                if (z) {
                    r3 = r4.A02;
                    r4.A08 = true;
                    r4.A02 = r6;
                    int count = r6.getCount();
                    r4.A00 = count;
                    C18260x0.A0y("MediaMessagesNavigator/navigator/upgrade-head-cursor/ count:", AnonymousClass001.A0o(), count);
                    r1 = r4.A02;
                } else {
                    r3 = r4.A03;
                    r4.A09 = true;
                    r4.A03 = r6;
                    int count2 = r6.getCount();
                    r4.A01 = count2;
                    C18260x0.A0y("MediaMessagesNavigator/navigator/upgrade-tail-cursor/ count:", AnonymousClass001.A0o(), count2);
                    r1 = r4.A03;
                }
                r1.registerContentObserver(r4.A0A);
                Runnable runnable = r4.A07;
                if (runnable != null) {
                    runnable.run();
                }
                if (r3 != null) {
                    r3.close();
                }
            }
        }
    }

    public C138196pv(AnonymousClass319 r1, AnonymousClass1VX r2, C95814uZ r3, C171468He r4, C55832qz r5, int i, long j, boolean z) {
        this.A03 = r2;
        this.A05 = r4;
        this.A06 = r5;
        this.A02 = r1;
        this.A04 = r3;
        this.A01 = j;
        this.A07 = z;
        this.A00 = i;
    }
}

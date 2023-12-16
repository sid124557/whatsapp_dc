package X;

import android.database.ContentObserver;
import android.database.Cursor;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.util.Log;

/* renamed from: X.6py  reason: invalid class name and case insensitive filesystem */
public class C138226py extends AnonymousClass5ZM {
    public C86684Lb A00;
    public C86684Lb A01;
    public boolean A02;
    public boolean A03;
    public final AnonymousClass319 A04;
    public final AnonymousClass1VX A05;
    public final C95814uZ A06;
    public final C171468He A07;
    public final C30471mV A08;
    public final C55832qz A09;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C86684Lb r0;
        Log.i("mediaview/task/getmsgs");
        C55832qz r6 = this.A09;
        C95814uZ r5 = this.A06;
        AnonymousClass319 r7 = this.A04;
        C30471mV r8 = this.A08;
        Cursor A042 = r7.A04(r5, 512, r8.A1L);
        AnonymousClass1VX r4 = this.A05;
        this.A00 = new C86684Lb(A042, r4, r5, r6);
        AnonymousClass4MC r10 = this.A02;
        boolean isCancelled = r10.isCancelled();
        Integer A0f = AnonymousClass0x7.A0f();
        if (isCancelled) {
            r0 = this.A00;
        } else {
            this.A01 = new C86684Lb(r7.A05(r5, 512, r8.A1L), r4, r5, r6);
            boolean isCancelled2 = r10.isCancelled();
            C86684Lb r02 = this.A00;
            if (isCancelled2) {
                r02.close();
                r0 = this.A01;
            } else {
                this.A02 = AnonymousClass001.A1Y(r02.getCount(), 512);
                this.A00.moveToPosition(0);
                if (this.A00.getCount() == 0) {
                    this.A00.close();
                    C86684Lb r03 = new C86684Lb(r7.A04(r5, 0, r8.A1L), r4, r5, r6);
                    this.A00 = r03;
                    r03.moveToPosition(0);
                    this.A02 = true;
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("mediaview/navigator/getmsgs head-upgraded:");
                    C18260x0.A1G(A0o, this.A00.getCount());
                }
                this.A03 = AnonymousClass001.A1Y(this.A01.getCount(), 512);
                this.A01.moveToPosition(0);
                if (this.A01.getCount() == 0) {
                    this.A01.close();
                    C86684Lb r04 = new C86684Lb(r7.A05(r5, 0, r8.A1L), r4, r5, r6);
                    this.A01 = r04;
                    r04.moveToPosition(0);
                    this.A03 = true;
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("mediaview/navigator/getmsgs tail-upgraded:");
                    C18260x0.A1G(A0o2, this.A01.getCount());
                }
                return Integer.valueOf(this.A00.getCount() + this.A01.getCount());
            }
        }
        r0.close();
        Log.i("GetMediaMessagesTask cancelled");
        return A0f;
    }

    public C138226py(AnonymousClass319 r1, AnonymousClass1VX r2, C95814uZ r3, C171468He r4, C30471mV r5, C55832qz r6) {
        this.A05 = r2;
        this.A06 = r3;
        this.A08 = r5;
        this.A07 = r4;
        this.A09 = r6;
        this.A04 = r1;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        if (AnonymousClass001.A0K(obj) >= 0) {
            C171468He r6 = this.A07;
            C86684Lb r5 = this.A00;
            boolean z = this.A02;
            C86684Lb r4 = this.A01;
            boolean z2 = this.A03;
            MediaViewFragment mediaViewFragment = r6.A0F;
            if (mediaViewFragment.A0Q() != null && !((C89654ea) mediaViewFragment.A0R()).BHW()) {
                r6.close();
                r6.A0B.put(0, r6.A0G);
                r6.A02 = r5;
                r6.A08 = z;
                r6.A03 = r4;
                r6.A09 = z2;
                r6.A00 = r5.getCount();
                int count = r4.getCount();
                r6.A01 = count;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("MediaMessagesNavigator/navigator/set-cursors/ head-count:");
                A0o.append(r6.A00);
                A0o.append(" head-full:");
                A0o.append(z);
                A0o.append(" tail-count:");
                A0o.append(count);
                C18260x0.A1E(" tail-full:", A0o, z2);
                ContentObserver contentObserver = r6.A0A;
                r5.registerContentObserver(contentObserver);
                r4.registerContentObserver(contentObserver);
                mediaViewFragment.A1i(r6.A00, true);
            }
        }
    }
}

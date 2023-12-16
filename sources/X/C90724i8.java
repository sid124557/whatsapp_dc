package X;

import android.location.LocationManager;
import android.os.Handler;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.whatsapp.R;
import com.whatsapp.businessdirectory.util.DirectoryMapViewLocationUpdateListener;

/* renamed from: X.4i8  reason: invalid class name and case insensitive filesystem */
public abstract class C90724i8 extends C131796eC {
    public ViewGroup A00;
    public CardView A01;
    public C111545iG A02;
    public AnonymousClass4w0 A03;
    public DirectoryMapViewLocationUpdateListener A04;
    public C103415Mu A05;
    public AnonymousClass4U8 A06;
    public AnonymousClass5ZR A07;
    public C28071fd A08;
    public Runnable A09;
    public boolean A0A;
    public final Handler A0B = AnonymousClass000.A0A();
    public final AnonymousClass0O1 A0C = Bid(new AnonymousClass93C(this, 0), new AnonymousClass03x());

    public final AnonymousClass4U8 A74() {
        AnonymousClass4U8 r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C86604Kt.A0j();
    }

    public final void A77(boolean z) {
        LocationManager A0F = this.A08.A0F();
        boolean z2 = false;
        if (A0F != null && (A0F.isProviderEnabled("gps") || A0F.isProviderEnabled("network"))) {
            z2 = true;
        }
        if (z) {
            A74().A0K(z2);
        } else if (z2) {
            C06270Wx.A03(A74().A0b, 0);
        } else {
            A75();
        }
    }

    public final void A75() {
        C19340zH A002 = AnonymousClass5V0.A00(this);
        C86624Kv.A1F(A002);
        A002.A0V(new C1891590f(this, 3));
        A002.A00.A0L(new AnonymousClass91X(this, 2));
        A002.A0i(true);
        C86614Ku.A1O(A002, this, 22, R.string.f11nameremoved);
        C18280x3.A0q(A002);
    }

    public final void A76() {
        AnonymousClass5UF A012 = AnonymousClass5UF.A01(this);
        A012.A02 = R.string.f11nameremoved;
        startActivityForResult(A012.A02(), 34);
    }

    public void onResume() {
        C111545iG r3;
        Integer num;
        super.onResume();
        if (this.A06 != null) {
            AnonymousClass4U8 A74 = A74();
            r3 = A74.A0K;
            num = AnonymousClass5ZO.A03(A74.A05);
        } else {
            r3 = this.A02;
            if (r3 != null) {
                num = null;
            } else {
                throw C18270x1.A0S("directorySearchAnalyticsManagerV2");
            }
        }
        r3.A05(num, 11, 73);
    }
}

package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.4Ww  reason: invalid class name and case insensitive filesystem */
public class C87984Ww extends AnonymousClass0R6 {
    public boolean A00 = true;
    public final int A01;
    public final Context A02;
    public final C33131sU A03;
    public final C620733j A04;
    public final C133846i2 A05;
    public final AnonymousClass5Y0 A06;
    public final AnonymousClass1VX A07;
    public final C106105Xq A08;
    public final C53492nB A09;
    public final C988953q A0A;
    public final C105385Us A0B;
    public final AnonymousClass5LQ A0C;
    public final C182638ok A0D;
    public final AnonymousClass33O A0E;
    public final C989053r A0F;
    public final HashSet A0G;
    public final Set A0H;

    public long A0B(int i) {
        return (long) C86634Kw.A0w(this.A0B.A03, i).hashCode();
    }

    public int A0G() {
        return C86614Ku.A06(this.A0B.A03);
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r17, int i) {
        Drawable drawable;
        Context context;
        int i2;
        AnonymousClass6I4 r6 = (AnonymousClass6I4) r17;
        C53492nB r1 = this.A09;
        if (r1 != null) {
            C95274sy r12 = (C95274sy) r6.A0H;
            C105385Us r8 = this.A0B;
            boolean z = false;
            int i3 = i;
            boolean A1U = AnonymousClass000.A1U(C86604Kt.A05(r8.A02), i3);
            r12.setSelected(A1U);
            if (A1U && this.A00) {
                z = true;
            }
            Integer num = null;
            if (z) {
                drawable = AnonymousClass0RP.A00(this.A02, R.drawable.ic_cam_delete);
            } else {
                drawable = null;
            }
            r12.setOverlayIcon(drawable);
            if (z) {
                num = Integer.valueOf(R.id.delete_thumb);
            }
            r12.setCustomId(num);
            r1.A01((C84584Cx) r12.getTag());
            Uri uri = (Uri) C86634Kw.A0w(r8.A03, i3);
            AnonymousClass5YF A002 = this.A08.A00(uri);
            r12.A05 = A002;
            r12.A07 = r6;
            if (z) {
                C107295b4.A03(r12, R.string.f11nameremoved);
            }
            C988953q r11 = this.A0A;
            byte A012 = r11.A01(A002);
            if (A012 == 3) {
                context = this.A02;
                r12.A03 = AnonymousClass0RP.A00(context, R.drawable.mark_video);
                i2 = R.string.f11nameremoved;
            } else if (A012 != 13) {
                r12.A03 = null;
                context = this.A02;
                i2 = R.string.f11nameremoved;
            } else {
                context = this.A02;
                r12.A03 = AnonymousClass0RP.A00(context, R.drawable.mark_gif);
                i2 = R.string.f11nameremoved;
            }
            C18300x5.A13(context, r12, i2);
            C109695f2.A00(r12, this, i3, 13);
            AnonymousClass5CS.A00(r12, this, 6);
            C114255mk r4 = new C114255mk(uri, this.A04, this.A05, this.A06, this.A07, A002, r11, r12, this.A0E, this.A0F, this.A01);
            this.A0H.add(r4);
            r12.setTag(r4);
            C33131sU r2 = this.A03;
            C114275mm r3 = new C114275mm(r2, r4, r12);
            Bitmap bitmap = (Bitmap) r2.A06(r4.BDW());
            if (bitmap == null) {
                r1.A02(r4, r3);
            } else {
                r3.Bd0(bitmap, true);
            }
        }
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        return new AnonymousClass6I4(new C95274sy(this.A02, this.A0C, this.A0G, this.A01));
    }

    public C87984Ww(Context context, C33131sU r3, C620733j r4, C133846i2 r5, AnonymousClass5Y0 r6, AnonymousClass1VX r7, C106105Xq r8, C53492nB r9, C988953q r10, C105385Us r11, AnonymousClass5LQ r12, C182638ok r13, AnonymousClass33O r14, C989053r r15, HashSet hashSet, int i) {
        A0E(true);
        this.A02 = context;
        this.A04 = r4;
        this.A06 = r6;
        this.A0E = r14;
        this.A0D = r13;
        this.A0C = r12;
        this.A0F = r15;
        this.A0A = r10;
        this.A09 = r9;
        this.A08 = r8;
        this.A0G = hashSet;
        this.A0H = AnonymousClass002.A0K();
        this.A03 = r3;
        this.A0B = r11;
        this.A01 = i;
        this.A05 = r5;
        this.A07 = r7;
    }
}

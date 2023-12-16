package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.biz.catalog.view.AvailabilityStateImageView;
import com.whatsapp.biz.catalog.view.AvailabilityStateTextView;
import com.whatsapp.jid.UserJid;

/* renamed from: X.6Hg  reason: invalid class name and case insensitive filesystem */
public final class C125296Hg extends AnonymousClass0R6 {
    public int A00;
    public C165977xw A01;
    public C181848nR A02 = new C159657mF(0);
    public C166107y9 A03 = C1448473e.A00();
    public boolean A04;
    public final AnonymousClass7CT A05;
    public final UserJid A06;

    public C125296Hg(AnonymousClass7CT r3, UserJid userJid) {
        C162457s7.A0J(r3, 2);
        this.A06 = userJid;
        this.A05 = r3;
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        int i2;
        C162457s7.A0J(viewGroup, 0);
        if (i != 1) {
            if (i == 2) {
                i2 = R.layout.f8nameremoved;
            } else if (i != 3) {
                C18260x0.A0z("Unsupported ViewType=", AnonymousClass001.A0o(), i);
            } else {
                i2 = R.layout.f8nameremoved;
            }
            View inflate = C18280x3.A0D(viewGroup).inflate(i2, viewGroup, false);
            AnonymousClass7CT r1 = this.A05;
            C162457s7.A0H(inflate);
            AnonymousClass746 r6 = new AnonymousClass746(this, 2);
            UserJid userJid = this.A06;
            return new C125526Ij(inflate, r1.A00.A01.ABV(), new C170688Ed(), userJid, r6);
        }
        i2 = R.layout.f8nameremoved;
        View inflate2 = C18280x3.A0D(viewGroup).inflate(i2, viewGroup, false);
        AnonymousClass7CT r12 = this.A05;
        C162457s7.A0H(inflate2);
        AnonymousClass746 r62 = new AnonymousClass746(this, 2);
        UserJid userJid2 = this.A06;
        return new C125526Ij(inflate2, r12.A00.A01.ABV(), new C170688Ed(), userJid2, r62);
    }

    public int A0G() {
        if (this.A04) {
            return 5;
        }
        return this.A03.A01.size();
    }

    public /* bridge */ /* synthetic */ void A0J(C05570Ua r4) {
        C125526Ij r42 = (C125526Ij) r4;
        C162457s7.A0J(r42, 0);
        C175598Yz r2 = C175598Yz.A00;
        View view = r42.A0H;
        if ((view instanceof AvailabilityStateImageView) && view != null) {
            r2.invoke(view);
        }
        r42.A00.A00();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r8, int i) {
        AnonymousClass4GQ r1;
        boolean z;
        C125526Ij r82 = (C125526Ij) r8;
        C162457s7.A0J(r82, 0);
        if (!this.A04) {
            C165977xw A012 = C154217co.A01(this.A03, i);
            C166107y9 r0 = this.A03;
            String str = r0.A00;
            C165827xh r4 = (C165827xh) r0.A01.get(i);
            boolean z2 = false;
            boolean A1U = AnonymousClass000.A1U(this.A00, i);
            C166107y9 r02 = this.A03;
            C165977xw r12 = this.A01;
            C162457s7.A0J(r02, 0);
            C166027y1 A002 = C154217co.A00(A012, r12, r02.A02);
            if (A002 != null) {
                z2 = A002.A02;
            }
            C162457s7.A0J(r4, 1);
            View view = r82.A0H;
            view.setSelected(A1U);
            StringBuilder A0l = AnonymousClass000.A0l(str);
            A0l.append(' ');
            view.setContentDescription(AnonymousClass000.A0X(r4.A00(), A0l));
            if (r4 instanceof C132236ev) {
                r1 = new C175508Yq((C132236ev) r4, r82, z2);
                z = view instanceof AvailabilityStateImageView;
            } else if (r4 instanceof C132226eu) {
                r1 = new C175408Yg((C132226eu) r4, z2);
                z = view instanceof AvailabilityStateTextView;
            } else {
                return;
            }
            if (z) {
                r1.invoke(view);
            }
        }
    }

    public int getItemViewType(int i) {
        if (this.A04) {
            return 1;
        }
        if (this.A03.A01.get(i) instanceof C132236ev) {
            return 2;
        }
        return 3;
    }
}

package X;

import android.content.res.Resources;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.biz.catalog.view.CatalogMediaCard;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.5iy  reason: invalid class name and case insensitive filesystem */
public class C111965iy implements C186278v2 {
    public C108985dt A00;
    public boolean A01;
    public final C85244Fm A02;
    public final C105035Th A03;
    public final C97104xd A04;
    public final C50482iF A05;
    public final CatalogMediaCard A06;
    public final AnonymousClass2PX A07;
    public final AnonymousClass4FV A08;
    public final C1227565p A09;

    public void Awi() {
        if (!this.A01) {
            this.A06.A09.A08((View.OnClickListener) null, 6);
            this.A01 = true;
        }
    }

    public void B38(UserJid userJid, int i) {
        C50482iF r2 = this.A05;
        if (r2.A06.A0J(userJid)) {
            r2.A05.A08(userJid);
        } else if (!r2.A00) {
            r2.A00 = true;
            r2.A04.A06(new AnonymousClass8EL(r2, userJid, i), userJid);
        }
    }

    public int BBk(UserJid userJid) {
        return this.A05.A06.A01(userJid);
    }

    public C183218pg BDe(C109015dw r2, UserJid userJid, boolean z) {
        return new C172018Jh(r2, this);
    }

    public boolean BFE(UserJid userJid) {
        return this.A05.A06.A0I(userJid);
    }

    public void BG7(UserJid userJid) {
        CatalogMediaCard catalogMediaCard = this.A06;
        AnonymousClass52i r3 = catalogMediaCard.A09;
        r3.setSeeMoreClickListener(new AnonymousClass69U(this, 0));
        r3.setCatalogBrandingDrawable(C02680He.A00((Resources.Theme) null, catalogMediaCard.getResources(), R.drawable.ic_shops_logo));
    }

    public void BTJ(UserJid userJid) {
        List A0B = this.A05.A06.A0B(userJid);
        if (A0B != null && !A0B.isEmpty()) {
            this.A06.setupThumbnails(userJid, R.string.f11nameremoved, A0B);
        }
    }

    public boolean BoI() {
        return !this.A03.A02(this.A00);
    }

    public void cleanup() {
        this.A04.A07(this);
    }

    public C111965iy(C85244Fm r1, C105035Th r2, C97104xd r3, C50482iF r4, CatalogMediaCard catalogMediaCard, AnonymousClass2PX r6, AnonymousClass4FV r7, C1227565p r8) {
        this.A08 = r7;
        this.A02 = r1;
        this.A05 = r4;
        this.A04 = r3;
        this.A07 = r6;
        this.A06 = catalogMediaCard;
        this.A09 = r8;
        this.A03 = r2;
        r3.A06(this);
    }
}

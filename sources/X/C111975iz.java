package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.biz.catalog.view.CatalogMediaCard;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.5iz  reason: invalid class name and case insensitive filesystem */
public class C111975iz implements C186278v2, AnonymousClass4CO {
    public C108985dt A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public final Context A04;
    public final C116985rC A05;
    public final C111095hX A06;
    public final C69263Wi A07;
    public final C56972sr A08;
    public final C105035Th A09;
    public final C620433g A0A;
    public final AnonymousClass5T7 A0B;
    public final C29211iS A0C;
    public final C105405Uu A0D;
    public final AnonymousClass5Y9 A0E;
    public final CatalogMediaCard A0F;
    public final AnonymousClass2PX A0G;
    public final AnonymousClass5X1 A0H;
    public final AnonymousClass7SU A0I;
    public final AnonymousClass4FS A0J;
    public final boolean A0K;

    public void Awi() {
        if (!this.A03) {
            this.A0F.A09.A08((View.OnClickListener) null, 3);
            this.A03 = true;
        }
    }

    public void B38(UserJid userJid, int i) {
        this.A0E.A05(userJid, i);
    }

    public int BBk(UserJid userJid) {
        return this.A0D.A01(userJid);
    }

    public C183218pg BDe(C109015dw r2, UserJid userJid, boolean z) {
        return new C116205pu(r2, this, userJid, z);
    }

    public boolean BFE(UserJid userJid) {
        return this.A0D.A0I(userJid);
    }

    public void BG7(UserJid userJid) {
        if (this.A01 != null) {
            AnonymousClass52i r2 = this.A0F.A09;
            Context context = this.A04;
            r2.setTitle(context.getString(R.string.f11nameremoved));
            r2.setTitleTextColor(AnonymousClass0Y8.A04(context, R.color.f5nameremoved));
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            r2.A06(dimensionPixelSize, dimensionPixelSize);
        }
        AnonymousClass52i r1 = this.A0F.A09;
        r1.setSeeMoreClickListener(new C116185ps(this, userJid));
        r1.setCatalogBrandingDrawable((Drawable) null);
    }

    public void BT5(UserJid userJid, int i) {
        CatalogMediaCard catalogMediaCard = this.A0F;
        if (AnonymousClass75J.A00(catalogMediaCard.A07, userJid) && !this.A0D.A0J(catalogMediaCard.A07)) {
            C18260x0.A0z("CatalogMediaCard/requestCatalogProductsFromBeginning/FetchFailed/Error: ", AnonymousClass001.A0o(), i);
            int i2 = R.string.f11nameremoved;
            if (i != 406) {
                i2 = R.string.f11nameremoved;
                if (i != 404) {
                    i2 = R.string.f11nameremoved;
                    if (i == -1) {
                        i2 = R.string.f11nameremoved;
                    }
                }
            }
            catalogMediaCard.setError(i2);
        }
    }

    public void BT6(UserJid userJid, boolean z, boolean z2) {
        if (AnonymousClass75J.A00(this.A0F.A07, userJid)) {
            BTJ(userJid);
        }
    }

    public void BTJ(UserJid userJid) {
        C105405Uu r6 = this.A0D;
        int A012 = r6.A01(userJid);
        CatalogMediaCard catalogMediaCard = this.A0F;
        if (A012 != catalogMediaCard.A00) {
            catalogMediaCard.A00 = A012;
            boolean A0J2 = r6.A0J(userJid);
            C108985dt r1 = this.A00;
            if (!A0J2) {
                if (r1 != null && r1.A0Y) {
                    C105875Wt r0 = new C105875Wt(r1);
                    r0.A0V = false;
                    this.A00 = r0.A01();
                    C117165rU.A00(this.A0J, this, userJid, 45);
                }
                Log.w("CatalogMediaCard/onFetchCatalogSuccess/Error: no products");
                AnonymousClass52i r2 = catalogMediaCard.A09;
                Context context = this.A04;
                r2.setError(context.getString(R.string.f11nameremoved));
                Activity A022 = C111095hX.A02(context);
                if (A022 instanceof C179078iZ) {
                    C90514ha r12 = (C90514ha) ((C179078iZ) A022);
                    r12.A0k.A01 = true;
                    C86604Kt.A1A(r12.A0d);
                }
            } else {
                if (r1 != null && !r1.A0Y) {
                    C105875Wt r02 = new C105875Wt(r1);
                    r02.A0V = true;
                    this.A00 = r02.A01();
                    C117165rU.A00(this.A0J, this, userJid, 46);
                }
                Context context2 = this.A04;
                List A002 = catalogMediaCard.A00(userJid, context2.getString(R.string.f11nameremoved), r6.A0B(userJid), this.A0K);
                if (A002.isEmpty()) {
                    Activity A023 = C111095hX.A02(context2);
                    if (A023 instanceof C179078iZ) {
                        C90514ha r13 = (C90514ha) ((C179078iZ) A023);
                        r13.A0k.A01 = true;
                        C86604Kt.A1A(r13.A0d);
                    }
                }
                catalogMediaCard.A03(A002);
            }
            C108985dt r03 = this.A00;
            if (r03 == null || r03.A0Y || r6.A0J(userJid)) {
                catalogMediaCard.setVisibility(0);
            } else {
                catalogMediaCard.setVisibility(8);
            }
            if (!this.A02) {
                this.A02 = true;
            }
        }
    }

    public boolean BoI() {
        C108985dt r0 = this.A00;
        if (r0 == null || !r0.A0Y) {
            return true;
        }
        return false;
    }

    public void cleanup() {
        this.A0C.A07(this);
    }

    public C111975iz(C116985rC r2, C111095hX r3, C69263Wi r4, C56972sr r5, C105035Th r6, C620433g r7, AnonymousClass5T7 r8, C29211iS r9, C105405Uu r10, AnonymousClass5Y9 r11, CatalogMediaCard catalogMediaCard, AnonymousClass2PX r13, AnonymousClass5X1 r14, AnonymousClass7SU r15, AnonymousClass4FS r16, boolean z) {
        this.A07 = r4;
        this.A08 = r5;
        this.A05 = r2;
        this.A06 = r3;
        this.A0G = r13;
        this.A0K = z;
        this.A0J = r16;
        this.A0A = r7;
        this.A0E = r11;
        this.A0D = r10;
        this.A0C = r9;
        this.A0F = catalogMediaCard;
        this.A04 = catalogMediaCard.getContext();
        this.A0I = r15;
        this.A09 = r6;
        this.A0H = r14;
        this.A0B = r8;
        r9.A06(this);
    }
}

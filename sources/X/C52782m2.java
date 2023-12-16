package X;

import android.content.Context;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutFragment;
import com.whatsapp.bizintegrity.marketingoptout.MarketingReOptInFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2m2  reason: invalid class name and case insensitive filesystem */
public final class C52782m2 {
    public int A00;
    public final C61012zY A01;
    public final C43492Si A02;
    public final AnonymousClass1VX A03;

    public final void A00(Context context, C08270df r26, UserJid userJid, String str, boolean z) {
        DialogFragment marketingOptOutFragment;
        Context context2 = context;
        UserJid userJid2 = userJid;
        C18260x0.A0P(context2, userJid2);
        C43492Si r0 = this.A02;
        String str2 = str;
        if (z) {
            AnonymousClass7PT r15 = new AnonymousClass7PT(Integer.valueOf(R.drawable.ic_campaign_filled), Integer.valueOf(R.drawable.green_alpha15_circle), Integer.valueOf(R.color.f5nameremoved), (Integer) null, (Integer) null, R.layout.f8nameremoved, R.string.f11nameremoved, R.string.f11nameremoved);
            AnonymousClass1VX r12 = r0.A06;
            C69263Wi r7 = r0.A01;
            marketingOptOutFragment = new MarketingReOptInFragment(context2, r0.A00, r7, r0.A02, r15, r0.A03, r0.A04, r12, userJid2, str2);
        } else {
            AnonymousClass7PT r152 = new AnonymousClass7PT(Integer.valueOf(R.drawable.ic_megaphone_slash_filled), Integer.valueOf(R.drawable.green_alpha15_circle), Integer.valueOf(R.color.f5nameremoved), (Integer) null, Integer.valueOf(R.string.f11nameremoved), R.layout.f8nameremoved, R.string.f11nameremoved, R.string.f11nameremoved);
            AnonymousClass1VX r3 = r0.A06;
            C69263Wi r72 = r0.A01;
            marketingOptOutFragment = new MarketingOptOutFragment(context2, r0.A00, r72, r0, r152, r0.A03, r0.A04, r3, userJid2, str2);
        }
        marketingOptOutFragment.A1O(r26, AnonymousClass000.A0O(marketingOptOutFragment));
    }

    public final boolean A01() {
        AnonymousClass1VX r4 = this.A03;
        C58422vE r3 = C58422vE.A02;
        if (r4.A0Y(r3, 5484) && this.A00 % 2 == 0) {
            this.A00 = C158997kv.A01.A03(1, 100);
        }
        return r4.A0Y(r3, 4512);
    }

    public final boolean A02(C624134x r3) {
        String str;
        if (!(r3 instanceof AnonymousClass4FG) || (str = ((AnonymousClass4FG) r3).BDY().A04) == null || !"MARKETING".equals(str) || !A01()) {
            return false;
        }
        return true;
    }

    public C52782m2(C61012zY r1, C43492Si r2, AnonymousClass1VX r3) {
        C18260x0.A0V(r2, r1, r3);
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = r3;
    }
}

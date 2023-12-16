package X;

import com.whatsapp.R;
import com.whatsapp.biz.BusinessProfileExtraFieldsActivity;
import com.whatsapp.community.EditCommunityActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.4H9  reason: invalid class name */
public class AnonymousClass4H9 extends C56602sG {
    public Object A00;
    public final int A01;

    public AnonymousClass4H9(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A03(C95814uZ r7) {
        switch (this.A01) {
            case 2:
                ((AnonymousClass11H) this.A00).A12.execute(new C71653cS(this, 46, r7));
                return;
            case 4:
                Log.d("editCommunity/onProfilePhotoChanged");
                if (C627336j.A0K(r7)) {
                    EditCommunityActivity editCommunityActivity = (EditCommunityActivity) this.A00;
                    if (r7.equals(editCommunityActivity.A07)) {
                        C55052pi r0 = editCommunityActivity.A03;
                        r0.A06.A04(editCommunityActivity.A06);
                        int dimensionPixelSize = editCommunityActivity.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
                        editCommunityActivity.A04.A09(editCommunityActivity.A03, editCommunityActivity.A06, dimensionPixelSize, false);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void A06(UserJid userJid) {
        if (1 - this.A01 == 0 && userJid != null) {
            BusinessProfileExtraFieldsActivity businessProfileExtraFieldsActivity = (BusinessProfileExtraFieldsActivity) this.A00;
            if (userJid.equals(businessProfileExtraFieldsActivity.A0C)) {
                businessProfileExtraFieldsActivity.A74();
            }
        }
    }

    public void A09(Collection collection) {
        switch (this.A01) {
            case 0:
                if (collection != null) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        AnonymousClass3ZH A0R = C18310x6.A0R(it);
                        C95814uZ r3 = A0R.A0H;
                        if (r3 != null) {
                            C33451t5 r2 = (C33451t5) this.A00;
                            C51972kg r1 = r2.A02;
                            if (r3.equals(r1.A01) && A0R.A0E != null) {
                                r1.A00 = A0R;
                                C624134x r32 = r2.A03;
                                r32.A1M(r1);
                                C65193Go r22 = r2.A01;
                                r22.A0S.A0C(r32, 38);
                                r22.A0D.A07(this);
                            }
                        }
                    }
                    return;
                }
                return;
            case 3:
                ((AnonymousClass11B) this.A00).A0N.execute(new C70193a6(this, 2, collection));
                return;
            default:
                return;
        }
    }

    public void A0A(Collection collection) {
        switch (this.A01) {
            case 1:
                ((BusinessProfileExtraFieldsActivity) this.A00).A74();
                return;
            case 2:
                if (collection != null) {
                    AnonymousClass11H r2 = (AnonymousClass11H) this.A00;
                    if (collection.contains(r2.A0s)) {
                        C71553cI.A00(r2.A12, r2, 49);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ((AnonymousClass35T) this.A00).A0B();
                return;
            default:
                return;
        }
    }
}

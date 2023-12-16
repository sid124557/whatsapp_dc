package com.whatsapp.chatinfo.view.custom;

import X.AnonymousClass1RL;
import X.AnonymousClass31A;
import X.AnonymousClass5Yj;
import X.C106225Yc;
import X.C111095hX;
import X.C116395qD;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C18300x5;
import X.C18310x6;
import X.C56972sr;
import X.C56982ss;
import X.C66433Lk;
import X.C89364cO;
import X.C95804uY;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;

public class PhoneNumberHiddenInNewsletterBottomSheet extends Hilt_PhoneNumberHiddenInNewsletterBottomSheet {
    public C111095hX A00;
    public C56972sr A01;
    public C66433Lk A02;

    public void A0w(Bundle bundle, View view) {
        C95804uY r0;
        String str;
        AnonymousClass1RL r1;
        String string;
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        WDSButton wDSButton = this.A05;
        if (wDSButton != null) {
            wDSButton.setText(R.string.f11nameremoved);
        }
        WDSButton wDSButton2 = this.A06;
        if (wDSButton2 != null) {
            wDSButton2.setText(R.string.f11nameremoved);
        }
        if (this instanceof CreatorPrivacyNewsletterBottomSheet) {
            CreatorPrivacyNewsletterBottomSheet creatorPrivacyNewsletterBottomSheet = (CreatorPrivacyNewsletterBottomSheet) this;
            WaTextView waTextView = creatorPrivacyNewsletterBottomSheet.A03;
            if (waTextView != null) {
                C56982ss r2 = creatorPrivacyNewsletterBottomSheet.A03;
                if (r2 != null) {
                    Bundle bundle2 = creatorPrivacyNewsletterBottomSheet.A06;
                    if (bundle2 == null || (string = bundle2.getString("jid")) == null) {
                        r0 = null;
                    } else {
                        r0 = C95804uY.A03.A01(string);
                    }
                    AnonymousClass31A A002 = C56982ss.A00(r2, r0);
                    if (!(A002 instanceof AnonymousClass1RL) || (r1 = (AnonymousClass1RL) A002) == null) {
                        str = null;
                    } else {
                        str = r1.A0H;
                    }
                    waTextView.setText(str);
                } else {
                    throw C18270x1.A0S("chatsCache");
                }
            }
            WaTextView waTextView2 = creatorPrivacyNewsletterBottomSheet.A04;
            if (waTextView2 != null) {
                waTextView2.setText(R.string.f11nameremoved);
            }
            Context A1D = creatorPrivacyNewsletterBottomSheet.A1D();
            if (A1D != null) {
                ListItemWithLeftIcon listItemWithLeftIcon = creatorPrivacyNewsletterBottomSheet.A00;
                if (listItemWithLeftIcon != null) {
                    C89364cO.A01(A1D, listItemWithLeftIcon, R.string.f11nameremoved);
                    C89364cO.A02(A1D, listItemWithLeftIcon, R.string.f11nameremoved);
                }
                ListItemWithLeftIcon listItemWithLeftIcon2 = creatorPrivacyNewsletterBottomSheet.A01;
                if (listItemWithLeftIcon2 != null) {
                    C89364cO.A01(A1D, listItemWithLeftIcon2, R.string.f11nameremoved);
                    C89364cO.A02(A1D, listItemWithLeftIcon2, R.string.f11nameremoved);
                }
                ListItemWithLeftIcon listItemWithLeftIcon3 = creatorPrivacyNewsletterBottomSheet.A02;
                if (listItemWithLeftIcon3 != null) {
                    C89364cO.A01(A1D, listItemWithLeftIcon3, R.string.f11nameremoved);
                    C66433Lk r12 = creatorPrivacyNewsletterBottomSheet.A02;
                    if (r12 != null) {
                        listItemWithLeftIcon3.A06(C106225Yc.A00(A1D, new C116395qD(creatorPrivacyNewsletterBottomSheet), C18300x5.A0e(A1D, C18290x4.A0o(r12.A03("245599461477281")), new Object[1], 0, R.string.f11nameremoved)), true);
                        return;
                    }
                    throw C18270x1.A0S("faqLinkFactory");
                }
                return;
            }
            return;
        }
        WaTextView waTextView3 = this.A03;
        if (waTextView3 != null) {
            C56972sr r02 = this.A01;
            if (r02 != null) {
                waTextView3.setText(r02.A0L());
            } else {
                throw C18270x1.A0S("meManager");
            }
        }
        WaTextView waTextView4 = this.A04;
        if (waTextView4 != null) {
            waTextView4.setText(R.string.f11nameremoved);
        }
        Context A1D2 = A1D();
        if (A1D2 != null) {
            ListItemWithLeftIcon listItemWithLeftIcon4 = this.A00;
            if (listItemWithLeftIcon4 != null) {
                C89364cO.A01(A1D2, listItemWithLeftIcon4, R.string.f11nameremoved);
            }
            ListItemWithLeftIcon listItemWithLeftIcon5 = this.A00;
            if (listItemWithLeftIcon5 != null) {
                C89364cO.A02(A1D2, listItemWithLeftIcon5, R.string.f11nameremoved);
            }
            ListItemWithLeftIcon listItemWithLeftIcon6 = this.A01;
            if (listItemWithLeftIcon6 != null) {
                C89364cO.A01(A1D2, listItemWithLeftIcon6, R.string.f11nameremoved);
            }
            ListItemWithLeftIcon listItemWithLeftIcon7 = this.A01;
            if (listItemWithLeftIcon7 != null) {
                C89364cO.A02(A1D2, listItemWithLeftIcon7, R.string.f11nameremoved);
            }
            WDSButton wDSButton3 = this.A06;
            if (wDSButton3 != null) {
                C18300x5.A13(A1D2, wDSButton3, R.string.f11nameremoved);
            }
            ListItemWithLeftIcon listItemWithLeftIcon8 = this.A02;
            if (listItemWithLeftIcon8 != null) {
                C89364cO.A01(A1D2, listItemWithLeftIcon8, R.string.f11nameremoved);
            }
            ListItemWithLeftIcon listItemWithLeftIcon9 = this.A02;
            if (listItemWithLeftIcon9 != null) {
                C89364cO.A02(A1D2, listItemWithLeftIcon9, R.string.f11nameremoved);
            }
        }
    }

    public void onClick(View view) {
        C162457s7.A0J(view, 0);
        int id = view.getId();
        if (id != R.id.pnh_primary_button) {
            if (id == R.id.pnh_secondary_button) {
                C66433Lk r1 = this.A02;
                if (r1 != null) {
                    Uri A03 = r1.A03("1318001139066835");
                    C162457s7.A0D(A03);
                    Intent A0D = C18310x6.A0D(A03);
                    C111095hX r12 = this.A00;
                    if (r12 != null) {
                        r12.A0A(A0R(), A0D);
                    } else {
                        throw C18270x1.A0S("activityUtils");
                    }
                } else {
                    throw C18270x1.A0S("faqLinkFactory");
                }
            } else {
                return;
            }
        }
        A1L();
    }

    public static void A01(C89364cO r4, int i) {
        if (r4 != null) {
            r4.setIcon(i);
            r4.setIconColor(AnonymousClass5Yj.A03(r4.getContext(), r4.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
        }
    }
}

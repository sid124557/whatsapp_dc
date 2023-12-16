package X;

import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity;
import com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel;
import com.whatsapp.newsletter.ui.directory.filter.country.CountrySelectorBottomSheet;
import com.whatsapp.settings.Settings;
import com.whatsapp.wds.components.search.WDSSearchBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.69F  reason: invalid class name */
public class AnonymousClass69F implements C183518qA {
    public Object A00;
    public final int A01;

    public AnonymousClass69F(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BZI(String str) {
        List list;
        Drawable drawable;
        WDSSearchBar wDSSearchBar;
        String str2 = str;
        switch (this.A01) {
            case 0:
                ((C89634eX) this.A00).A7T(str2);
                return;
            case 1:
                C162457s7.A0J(str2, 0);
                InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel = ((InviteNonWhatsAppContactPickerActivity) this.A00).A0I;
                if (inviteNonWhatsAppContactPickerViewModel == null) {
                    throw C86604Kt.A0j();
                }
                inviteNonWhatsAppContactPickerViewModel.A00 = str2;
                ArrayList A03 = C107155an.A03(inviteNonWhatsAppContactPickerViewModel.A0B, str2);
                C06270Wx.A03(inviteNonWhatsAppContactPickerViewModel.A08, 0);
                inviteNonWhatsAppContactPickerViewModel.A06.A0H(A03);
                return;
            case 2:
                C162457s7.A0J(str2, 0);
                AnonymousClass4WG r0 = ((CountrySelectorBottomSheet) this.A00).A05;
                if (r0 != null) {
                    r0.getFilter().filter(str2);
                    return;
                }
                return;
            default:
                Settings settings = (Settings) this.A00;
                if (settings.A06 != null || (wDSSearchBar = settings.A0t) == null) {
                    settings.A12 = str2;
                    if (!str2.isEmpty()) {
                        AnonymousClass5U4 r3 = settings.A0m;
                        ArrayList A0s = AnonymousClass001.A0s();
                        r3.A03(str2, "", A0s);
                        List A0F = C73723fy.A0F(A0s);
                        AnonymousClass5U4 r5 = settings.A0m;
                        ArrayList A0s2 = AnonymousClass001.A0s();
                        LinkedHashMap A0r = C18320x8.A0r();
                        for (Object next : A0F) {
                            ((List) C18310x6.A0h(r5.A00((C1230366u) next).B8w(), A0r)).add(next);
                        }
                        Iterator A0v = AnonymousClass001.A0v(A0r);
                        while (A0v.hasNext()) {
                            int i = 0;
                            for (C1230366u r1 : C73723fy.A0L((Iterable) A0v.next(), new AnonymousClass6A6(9))) {
                                int i2 = i + 1;
                                String BBg = r1.BBg();
                                String B8w = r1.B8w();
                                String str3 = null;
                                if (i == 0) {
                                    drawable = r5.A00(r1).getIcon();
                                } else {
                                    drawable = null;
                                }
                                String BAX = r1.BAX();
                                if (BAX.length() != 0) {
                                    str3 = BAX;
                                }
                                A0s2.add(new C104825Sm(drawable, BBg, B8w, str3, 1));
                                i = i2;
                            }
                        }
                        if (A0s2.isEmpty()) {
                            A0s2.add(new C104825Sm((Drawable) null, C54292oU.A04(r5.A03, R.string.f11nameremoved), (String) null, (String) null, 2));
                        }
                        list = C73723fy.A0F(A0s2);
                    } else {
                        list = AnonymousClass001.A0s();
                    }
                    settings.A14 = list;
                    settings.A79();
                    return;
                } else if (!str2.isEmpty()) {
                    wDSSearchBar.A02(false);
                    return;
                } else {
                    return;
                }
        }
    }
}

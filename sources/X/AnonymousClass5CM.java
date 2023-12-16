package X;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.widget.SearchView;
import com.whatsapp.HomeActivity;
import com.whatsapp.audiopicker.AudioPickerActivity;
import com.whatsapp.businessapisearch.view.activity.BusinessApiSearchActivity;
import com.whatsapp.businessapisearch.view.fragment.BusinessApiHomeFragment;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity;
import com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import com.whatsapp.contact.picker.PhoneContactsSelector;
import com.whatsapp.gallery.MediaGalleryActivity;
import com.whatsapp.group.GroupParticipantsSearchFragment;
import com.whatsapp.newsletter.NewsletterInfoMembersSearchFragment;
import com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity;
import com.whatsapp.status.seeall.StatusSeeAllActivity;
import com.whatsapp.status.seeall.viewmodel.StatusSeeAllViewModel;
import com.whatsapp.status.seeall.viewmodel.StatusSeeAllViewModel$onSearchQueryTextChanged$1$1;
import com.whatsapp.storage.StorageUsageActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: X.5CM  reason: invalid class name */
public class AnonymousClass5CM implements C16510tW {
    public Object A00;
    public final int A01;

    public AnonymousClass5CM(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public boolean BZJ(String str) {
        switch (this.A01) {
            case 0:
                HomeActivity homeActivity = (HomeActivity) this.A00;
                C1229966q A2a = AnonymousClass4SG.A2a(homeActivity);
                if (A2a == null) {
                    return false;
                }
                AnonymousClass5U2 r0 = homeActivity.A2N;
                r0.A01 = str;
                A2a.AxH(r0);
                return false;
            case 1:
                AudioPickerActivity audioPickerActivity = (AudioPickerActivity) this.A00;
                audioPickerActivity.A0P = str;
                audioPickerActivity.A0Q = C107155an.A03(audioPickerActivity.A00, str);
                AnonymousClass0WA.A00(audioPickerActivity).A01((Bundle) null, audioPickerActivity);
                return false;
            case 2:
                BusinessApiHomeFragment businessApiHomeFragment = ((BusinessApiSearchActivity) this.A00).A03;
                if (businessApiHomeFragment == null) {
                    return true;
                }
                businessApiHomeFragment.A03.A0E(str);
                return true;
            case 3:
                ((BusinessDirectoryActivity) this.A00).A7F(str);
                return true;
            case 4:
                ((C89634eX) this.A00).A7T(str);
                return false;
            case 5:
                PhoneContactsSelector phoneContactsSelector = (PhoneContactsSelector) this.A00;
                phoneContactsSelector.A0a = str;
                ArrayList A03 = C107155an.A03(phoneContactsSelector.A0S, str);
                phoneContactsSelector.A0b = A03;
                if (A03.isEmpty()) {
                    phoneContactsSelector.A0b = null;
                }
                phoneContactsSelector.A75();
                return false;
            case 6:
                C93544ok r2 = (C93544ok) this.A00;
                r2.A0H = str;
                r2.A0I = C107155an.A03(r2.A00, str);
                Bundle A08 = AnonymousClass002.A08();
                A08.putString("query", str);
                AnonymousClass0WA.A00(r2).A01(A08, r2);
                return false;
            case 7:
                MediaGalleryActivity mediaGalleryActivity = (MediaGalleryActivity) this.A00;
                if (TextUtils.equals(mediaGalleryActivity.A0i, str)) {
                    return false;
                }
                mediaGalleryActivity.A0i = str;
                mediaGalleryActivity.A0j = C107155an.A03(mediaGalleryActivity.A00, str);
                AnonymousClass665 A0C = MediaGalleryActivity.A0C(mediaGalleryActivity);
                if (A0C == null) {
                    return false;
                }
                C56532s8 r1 = mediaGalleryActivity.A0b;
                r1.A06(mediaGalleryActivity.A0j);
                r1.A05(str);
                A0C.Bay(r1);
                return false;
            case 8:
                C87214Ol r12 = ((GroupParticipantsSearchFragment) this.A00).A06;
                r12.A00 = str;
                if (TextUtils.isEmpty(str)) {
                    r12.A01(r12.A02);
                    return false;
                }
                r12.getFilter().filter(str);
                return false;
            case 9:
                C162457s7.A0J(str, 0);
                NewsletterInfoMembersSearchFragment newsletterInfoMembersSearchFragment = (NewsletterInfoMembersSearchFragment) this.A00;
                newsletterInfoMembersSearchFragment.A1L(str);
                C87204Ok r02 = newsletterInfoMembersSearchFragment.A06;
                if (r02 != null) {
                    r02.A00(str);
                    return false;
                }
                throw C18270x1.A0S("adapter");
            case 10:
                C162457s7.A0J(str, 0);
                NewsletterDirectoryActivity newsletterDirectoryActivity = (NewsletterDirectoryActivity) this.A00;
                String A002 = AnonymousClass2AB.A00(str);
                if (C162457s7.A0P(newsletterDirectoryActivity.A0L, A002)) {
                    return true;
                }
                newsletterDirectoryActivity.A0L = A002;
                Runnable runnable = newsletterDirectoryActivity.A0J;
                if (runnable != null) {
                    newsletterDirectoryActivity.A0O.removeCallbacks(runnable);
                }
                C70023Zo r3 = new C70023Zo(newsletterDirectoryActivity, 45);
                newsletterDirectoryActivity.A0O.postDelayed(r3, 300);
                newsletterDirectoryActivity.A0J = r3;
                return true;
            case 11:
                C162457s7.A0J(str, 0);
                StatusSeeAllViewModel statusSeeAllViewModel = ((StatusSeeAllActivity) this.A00).A09;
                if (statusSeeAllViewModel == null) {
                    throw C86604Kt.A0j();
                }
                boolean z = !AnonymousClass000.A1S(C175738Zn.A0V(str) ? 1 : 0);
                statusSeeAllViewModel.A04 = z;
                if (!z) {
                    C85474Gj r03 = statusSeeAllViewModel.A03;
                    if (r03 != null) {
                        r03.AyX((CancellationException) null);
                    }
                    statusSeeAllViewModel.A0E(statusSeeAllViewModel.A02);
                    return true;
                }
                C105765Wh r4 = (C105765Wh) statusSeeAllViewModel.A07.A06.A07();
                if (r4 == null) {
                    return true;
                }
                C85474Gj r04 = statusSeeAllViewModel.A03;
                if (r04 != null) {
                    r04.AyX((CancellationException) null);
                }
                statusSeeAllViewModel.A03 = C616131n.A02(statusSeeAllViewModel.A08, new StatusSeeAllViewModel$onSearchQueryTextChanged$1$1(r4, statusSeeAllViewModel, str, (C84814Du) null), AnonymousClass0IV.A00(statusSeeAllViewModel), (AnonymousClass20D) null, 2);
                return true;
            default:
                StorageUsageActivity storageUsageActivity = (StorageUsageActivity) this.A00;
                storageUsageActivity.A0P = str;
                storageUsageActivity.A0R = C107155an.A03(storageUsageActivity.A00, str);
                StorageUsageActivity.A0C(storageUsageActivity, storageUsageActivity.A0Q, (List) null, false);
                return false;
        }
    }

    public boolean BZK(String str) {
        switch (this.A01) {
            case 2:
                BusinessApiHomeFragment businessApiHomeFragment = ((BusinessApiSearchActivity) this.A00).A03;
                if (businessApiHomeFragment == null) {
                    return false;
                }
                businessApiHomeFragment.A03.A0E(str);
                return false;
            case 3:
                BusinessDirectoryActivity businessDirectoryActivity = (BusinessDirectoryActivity) this.A00;
                BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment = businessDirectoryActivity.A06;
                if (businessDirectoryContextualSearchFragment != null) {
                    BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = businessDirectoryContextualSearchFragment.A09;
                    String trim = str.trim();
                    if (!TextUtils.isEmpty(trim) && trim.length() >= businessDirectoryContextualSearchViewModel.A0c.A03.A0N(4556)) {
                        businessDirectoryContextualSearchViewModel.A0N.A0A(C105085Tn.A00(businessDirectoryContextualSearchViewModel), true);
                        businessDirectoryContextualSearchViewModel.A0X(trim, businessDirectoryContextualSearchViewModel.A0D(str));
                    }
                }
                SearchView searchView = businessDirectoryActivity.A05.A02;
                if (searchView == null) {
                    return false;
                }
                searchView.clearFocus();
                return false;
            case 10:
                C105225Ub r0 = ((NewsletterDirectoryActivity) this.A00).A0H;
                if (r0 == null) {
                    throw C18270x1.A0S("searchToolbarHelper");
                }
                SearchView searchView2 = r0.A02;
                if (searchView2 == null) {
                    return true;
                }
                searchView2.clearFocus();
                return true;
            case 11:
                return true;
            case 12:
                StorageUsageActivity storageUsageActivity = (StorageUsageActivity) this.A00;
                storageUsageActivity.A0P = str;
                storageUsageActivity.A0R = C107155an.A03(storageUsageActivity.A00, str);
                StorageUsageActivity.A0C(storageUsageActivity, storageUsageActivity.A0Q, (List) null, false);
                return false;
            default:
                return false;
        }
    }
}

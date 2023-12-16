package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.IntentChooserBottomSheetDialogFragment;
import com.whatsapp.R;
import com.whatsapp.biz.product.view.fragment.ProductBottomSheet;
import com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel;
import com.whatsapp.contact.contactform.ContactFormActivity;
import com.whatsapp.conversation.ConversationSearchFragment;
import com.whatsapp.conversation.viewmodel.ConversationSearchViewModel;
import com.whatsapp.gallery.GalleryTabHostFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.69E  reason: invalid class name */
public class AnonymousClass69E implements C15610re {
    public Object A00;
    public final int A01;

    public AnonymousClass69E(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        String str;
        ConversationSearchViewModel conversationSearchViewModel;
        AnonymousClass4UC r1;
        boolean z;
        switch (this.A01) {
            case 0:
                IntentChooserBottomSheetDialogFragment intentChooserBottomSheetDialogFragment = (IntentChooserBottomSheetDialogFragment) this.A00;
                if (!intentChooserBottomSheetDialogFragment.A0L.A02.A00(AnonymousClass0GC.STARTED)) {
                    return false;
                }
                if (intentChooserBottomSheetDialogFragment.A08 == null) {
                    intentChooserBottomSheetDialogFragment.A0R().startActivityForResult(menuItem.getIntent(), intentChooserBottomSheetDialogFragment.A00);
                } else {
                    C08310eF A0B = intentChooserBottomSheetDialogFragment.A0U().A0B(intentChooserBottomSheetDialogFragment.A08.intValue());
                    C626936e.A06(A0B);
                    A0B.startActivityForResult(menuItem.getIntent(), intentChooserBottomSheetDialogFragment.A00);
                }
                intentChooserBottomSheetDialogFragment.A1K();
                return true;
            case 1:
                ProductBottomSheet productBottomSheet = (ProductBottomSheet) this.A00;
                if (menuItem.getItemId() != R.id.action_see_more_details) {
                    return false;
                }
                ProductBottomSheetViewModel productBottomSheetViewModel = productBottomSheet.A09;
                if (productBottomSheetViewModel == null) {
                    throw C86604Kt.A0j();
                }
                Context A0G = productBottomSheet.A0G();
                C109015dw r0 = productBottomSheetViewModel.A02;
                if (r0 == null || (str = r0.A0F) == null) {
                    return true;
                }
                UserJid userJid = productBottomSheetViewModel.A04;
                if (userJid != null) {
                    boolean A0a = productBottomSheetViewModel.A0L.A0a(userJid);
                    AnonymousClass5ZY.A03(A0G, productBottomSheetViewModel.A0M, productBottomSheetViewModel.A0a, userJid, (Integer) null, (Integer) null, str, 3, A0a, A0a, false);
                }
                productBottomSheetViewModel.A0W.A00(productBottomSheetViewModel.A04, 47);
                return true;
            case 2:
                ContactFormActivity contactFormActivity = (ContactFormActivity) this.A00;
                int itemId = menuItem.getItemId();
                if (itemId == R.id.delete_contact) {
                    String string = contactFormActivity.getString(R.string.f11nameremoved);
                    String string2 = contactFormActivity.getString(R.string.f11nameremoved);
                    int length = string.length();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append(string);
                    spannableStringBuilder.append(' ');
                    spannableStringBuilder.append(string2);
                    spannableStringBuilder.setSpan(new StyleSpan(1), length, length + string2.length(), 33);
                    String string3 = contactFormActivity.getString(R.string.f11nameremoved);
                    C1892590p r4 = new C1892590p(9);
                    C1235268t A002 = C1235268t.A00(contactFormActivity, 27);
                    C19340zH A003 = AnonymousClass5V0.A00(contactFormActivity);
                    A003.setTitle(string3);
                    A003.A0Q(spannableStringBuilder);
                    A003.A0G(r4, contactFormActivity.getString(R.string.f11nameremoved));
                    A003.A0I(A002, contactFormActivity.getString(R.string.f11nameremoved));
                    if (contactFormActivity.isFinishing()) {
                        return true;
                    }
                    C18280x3.A0q(A003);
                    return true;
                } else if (itemId != R.id.save_to_phone) {
                    return true;
                } else {
                    contactFormActivity.A0F.A04();
                    return true;
                }
            case 3:
                ConversationSearchFragment conversationSearchFragment = (ConversationSearchFragment) this.A00;
                int itemId2 = menuItem.getItemId();
                if (itemId2 == R.id.action_search_up) {
                    ConversationSearchViewModel conversationSearchViewModel2 = conversationSearchFragment.A02;
                    if (conversationSearchViewModel2 == null) {
                        return true;
                    }
                    r1 = conversationSearchViewModel2.A04;
                    z = true;
                } else if (itemId2 != R.id.action_search_down || (conversationSearchViewModel = conversationSearchFragment.A02) == null) {
                    return true;
                } else {
                    r1 = conversationSearchViewModel.A04;
                    z = false;
                }
                r1.A0H(z);
                return true;
            default:
                GalleryTabHostFragment galleryTabHostFragment = (GalleryTabHostFragment) this.A00;
                if (menuItem.getItemId() != R.id.multi_select) {
                    return false;
                }
                if (!galleryTabHostFragment.A1T()) {
                    return true;
                }
                galleryTabHostFragment.A1S(true);
                menuItem.setVisible(false);
                Toolbar toolbar = galleryTabHostFragment.A03;
                if (toolbar == null) {
                    return true;
                }
                C54292oU r02 = galleryTabHostFragment.A0A;
                if (r02 != null) {
                    toolbar.setTitle((CharSequence) C54292oU.A00(r02).getString(R.string.f11nameremoved));
                    return true;
                }
                throw C18270x1.A0S("waContext");
        }
    }
}

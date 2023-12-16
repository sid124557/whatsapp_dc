package X;

import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.WaImageButton;
import com.whatsapp.base.WDSSearchViewFragment;
import com.whatsapp.conversation.ConversationSearchFragment;
import com.whatsapp.conversation.viewmodel.ConversationSearchViewModel;
import com.whatsapp.search.calls.CallsSearchFragment;
import com.whatsapp.wds.components.search.WDSConversationSearchView;

/* renamed from: X.68Q  reason: invalid class name */
public class AnonymousClass68Q extends C166687z6 {
    public Object A00;
    public final int A01;

    public AnonymousClass68Q(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String str;
        AnonymousClass08J r0;
        WaImageButton waImageButton;
        switch (this.A01) {
            case 0:
                AnonymousClass4UM r1 = ((WDSSearchViewFragment) this.A00).A01;
                if (r1 != null) {
                    str = String.valueOf(charSequence);
                    C162457s7.A0J(str, 0);
                    r0 = r1.A00;
                    break;
                } else {
                    return;
                }
            case 1:
                ConversationSearchFragment conversationSearchFragment = (ConversationSearchFragment) this.A00;
                ConversationSearchViewModel conversationSearchViewModel = conversationSearchFragment.A02;
                if (conversationSearchViewModel != null) {
                    String valueOf = String.valueOf(charSequence);
                    C162457s7.A0J(valueOf, 0);
                    conversationSearchViewModel.A00.A0H(valueOf);
                }
                if (!C18270x1.A1V(conversationSearchFragment.A09)) {
                    return;
                }
                if (!conversationSearchFragment.A06 && (charSequence == null || C175738Zn.A0V(charSequence))) {
                    WDSConversationSearchView wDSConversationSearchView = conversationSearchFragment.A05;
                    if (wDSConversationSearchView != null) {
                        Menu menu = wDSConversationSearchView.A04.getMenu();
                        C162457s7.A0D(menu);
                        int size = menu.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            MenuItem item = menu.getItem(i4);
                            C162457s7.A0D(item);
                            item.setVisible(false);
                        }
                    }
                    WDSConversationSearchView wDSConversationSearchView2 = conversationSearchFragment.A05;
                    if (!(wDSConversationSearchView2 == null || (waImageButton = wDSConversationSearchView2.A05) == null)) {
                        waImageButton.setVisibility(0);
                    }
                    conversationSearchFragment.A06 = true;
                    return;
                } else if (conversationSearchFragment.A06 && charSequence != null && !C175738Zn.A0V(charSequence)) {
                    WDSConversationSearchView wDSConversationSearchView3 = conversationSearchFragment.A05;
                    if (wDSConversationSearchView3 != null) {
                        Menu menu2 = wDSConversationSearchView3.A04.getMenu();
                        C162457s7.A0D(menu2);
                        int size2 = menu2.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            MenuItem item2 = menu2.getItem(i5);
                            C162457s7.A0D(item2);
                            item2.setVisible(true);
                        }
                    }
                    WDSConversationSearchView wDSConversationSearchView4 = conversationSearchFragment.A05;
                    if (wDSConversationSearchView4 != null) {
                        C18270x1.A0p(wDSConversationSearchView4.A05);
                    }
                    conversationSearchFragment.A06 = false;
                    return;
                } else {
                    return;
                }
            default:
                AnonymousClass4UG r12 = ((CallsSearchFragment) this.A00).A02;
                if (r12 != null) {
                    str = String.valueOf(charSequence);
                    C162457s7.A0J(str, 0);
                    r0 = r12.A00;
                    break;
                } else {
                    throw C86604Kt.A0j();
                }
        }
        r0.A0H(str);
    }
}

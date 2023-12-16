package X;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.whatsapp.WaEditText;
import com.whatsapp.conversation.ConversationSearchFragment;
import com.whatsapp.conversation.viewmodel.ConversationSearchViewModel;
import com.whatsapp.newsletter.ui.NewsletterCreationActivity;
import com.whatsapp.registration.RegisterName;

/* renamed from: X.695  reason: invalid class name */
public class AnonymousClass695 implements View.OnFocusChangeListener {
    public Object A00;
    public final int A01;

    public AnonymousClass695(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnFocusChangeListener(new AnonymousClass695(obj, i));
    }

    public final void onFocusChange(View view, boolean z) {
        C96924xG r3;
        int i;
        switch (this.A01) {
            case 0:
                C08310eF r0 = (C08310eF) this.A00;
                if (!z) {
                    C86644Kx.A14(view, (InputMethodManager) r0.A0G().getSystemService("input_method"));
                    return;
                }
                return;
            case 1:
                C105245Ud r2 = (C105245Ud) this.A00;
                if (!z) {
                    TextView textView = r2.A04;
                    if (textView.getVisibility() == 0) {
                        textView.setVisibility(8);
                        r2.A05.setError((CharSequence) null);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                C105245Ud r1 = (C105245Ud) this.A00;
                r1.A0C.A00();
                r1.A08.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                return;
            case 3:
                ConversationSearchViewModel conversationSearchViewModel = ((ConversationSearchFragment) this.A00).A02;
                if (conversationSearchViewModel != null) {
                    C18320x8.A18(conversationSearchViewModel.A02, z);
                    return;
                }
                return;
            case 4:
                r3 = (C96924xG) this.A00;
                WaEditText A75 = r3.A75();
                if (z) {
                    String A0g = C86644Kx.A0g(A75);
                    C162457s7.A0J(A0g, 0);
                    r3.A0J = A0g;
                    return;
                } else if (AnonymousClass2AB.A00(C86644Kx.A0g(A75)).length() > 0) {
                    String str = r3.A0J;
                    if (str == null) {
                        throw C18270x1.A0S("tempNameText");
                    } else if (!str.equals(C86644Kx.A0g(r3.A75()))) {
                        i = 6;
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 5:
                r3 = (C96924xG) this.A00;
                if (z) {
                    String A0g2 = C86644Kx.A0g(r3.A74());
                    C162457s7.A0J(A0g2, 0);
                    r3.A0I = A0g2;
                    return;
                } else if (r3.A79() != null) {
                    String str2 = r3.A0I;
                    if (str2 == null) {
                        throw C18270x1.A0S("tempDescriptionText");
                    } else if (!str2.equals(C86644Kx.A0g(r3.A74()))) {
                        i = 11;
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                RegisterName registerName = (RegisterName) this.A00;
                if (z) {
                    registerName.A0D.A04();
                    throw AnonymousClass001.A0g("logUserAction");
                }
                return;
        }
        r3.A77().A05(i, r3 instanceof NewsletterCreationActivity);
    }
}

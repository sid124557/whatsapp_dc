package X;

import android.text.SpannableStringBuilder;
import com.whatsapp.chatinfo.ListChatInfoActivity;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import com.whatsapp.newsletter.viewmodel.NewsletterViewModel;
import com.whatsapp.text.ReadMoreTextView;
import java.util.List;

/* renamed from: X.5bC  reason: invalid class name and case insensitive filesystem */
public class C107365bC implements AnonymousClass4A3 {
    public Object A00;
    public final int A01;

    public C107365bC(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BiP(String str) {
        AnonymousClass5TS r0;
        switch (this.A01) {
            case 0:
                ListChatInfoActivity listChatInfoActivity = (ListChatInfoActivity) this.A00;
                if (!listChatInfoActivity.A0I.A0H(listChatInfoActivity.A0R).equals(str)) {
                    AnonymousClass3ZH r1 = listChatInfoActivity.A0R;
                    r1.A0P = str;
                    listChatInfoActivity.A0I.A0O(r1);
                    listChatInfoActivity.A0O.A01(listChatInfoActivity.A7G(), str);
                    listChatInfoActivity.A7M();
                    listChatInfoActivity.A0M.A0A(listChatInfoActivity.A7G());
                    return;
                }
                return;
            case 1:
                r0 = (AnonymousClass5TS) this.A00;
                break;
            case 2:
                r0 = ((GroupChatInfoActivity) this.A00).A1S;
                break;
            case 3:
                ((GroupChatInfoActivity) this.A00).A7a(str);
                return;
            default:
                NewsletterInfoActivity newsletterInfoActivity = (NewsletterInfoActivity) this.A00;
                String str2 = null;
                String A002 = AnonymousClass2AB.A00(str);
                if (A002 != null && !C175738Zn.A0V(A002)) {
                    str2 = A002;
                }
                if (!C162457s7.A0P(str2, newsletterInfoActivity.A7G().A0E)) {
                    C620633i r5 = newsletterInfoActivity.A08;
                    C60152y5 r2 = newsletterInfoActivity.A0n;
                    if (r2 != null) {
                        ReadMoreTextView readMoreTextView = newsletterInfoActivity.A0r;
                        if (readMoreTextView == null) {
                            throw C18270x1.A0S("descriptionTextView");
                        }
                        SpannableStringBuilder A003 = C18330xA.A00(C107635bd.A07(r5, r2, C107345b9.A03(newsletterInfoActivity, readMoreTextView.getPaint(), newsletterInfoActivity.A0C, str2)));
                        C106715a2 r12 = newsletterInfoActivity.A0s;
                        if (r12 != null) {
                            ReadMoreTextView readMoreTextView2 = newsletterInfoActivity.A0r;
                            if (readMoreTextView2 == null) {
                                throw C18270x1.A0S("descriptionTextView");
                            }
                            r12.A07(readMoreTextView2.getContext(), A003);
                            ReadMoreTextView readMoreTextView3 = newsletterInfoActivity.A0r;
                            if (readMoreTextView3 == null) {
                                throw C18270x1.A0S("descriptionTextView");
                            }
                            readMoreTextView3.A0K((List) null, A003);
                            C86194Je r4 = new C86194Je(newsletterInfoActivity, 0);
                            NewsletterViewModel newsletterViewModel = newsletterInfoActivity.A0k;
                            if (newsletterViewModel == null) {
                                throw C18270x1.A0S("newsletterViewModel");
                            }
                            C95804uY A0I = newsletterInfoActivity.A7G().A0I();
                            C162457s7.A0J(A0I, 0);
                            newsletterViewModel.A04.A0B(A0I, r4, (String) null, str2, (byte[]) null, true, false);
                            return;
                        }
                        throw C18270x1.A0S("linkifier");
                    }
                    throw C18270x1.A0S("sharedPreferencesFactory");
                }
                return;
        }
        r0.A00(str);
    }
}

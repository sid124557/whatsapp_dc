package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.bonsai.BonsaiConversationTitleViewModel;
import com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel;
import com.whatsapp.conversation.ConversationListView;
import com.whatsapp.jid.UserJid;
import java.util.Collection;

/* renamed from: X.6Bw  reason: invalid class name and case insensitive filesystem */
public class C124336Bw implements AnonymousClass4FD {
    public Object A00;
    public final int A01;

    public C124336Bw(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BLc(C95814uZ r3) {
        if (2 - this.A01 == 0) {
            C162457s7.A0J(r3, 0);
            AnonymousClass5WK.A00(r3, (AnonymousClass5WK) this.A00, "UpdatesViewModelObservers/notifyChatAdded");
        }
    }

    public void BLd() {
    }

    public void BLe(C95814uZ r24, boolean z) {
        C95804uY r3;
        C95814uZ r2 = r24;
        switch (this.A01) {
            case 0:
                C162457s7.A0J(r2, 0);
                BonsaiConversationTitleViewModel bonsaiConversationTitleViewModel = (BonsaiConversationTitleViewModel) this.A00;
                if (r2.equals(bonsaiConversationTitleViewModel.A01)) {
                    bonsaiConversationTitleViewModel.A0D();
                    return;
                }
                return;
            case 1:
                C113245l7 r1 = (C113245l7) this.A00;
                AnonymousClass3ZH r5 = r1.A3n;
                if (r2 == r5.A0H) {
                    boolean A0F = r1.A37.A0F();
                    boolean A0E = r1.A37.A0E();
                    C103985Pe r4 = (C103985Pe) C113245l7.A0C(r1).A0D.get();
                    C95814uZ r32 = r1.A4J;
                    if (r32 instanceof C95804uY) {
                        r3 = (C95804uY) r32;
                    } else {
                        r3 = null;
                    }
                    r1.A1n(new AnonymousClass5R9((C108985dt) null, r5, (AnonymousClass3ZH) null, (C27991fJ) null, (UserJid) null, 4, 0, 0, 0, false, false, false, false, false, A0F, false, false, A0E, r4.A01(r3)));
                    if (AnonymousClass5KY.A00(r1).BH2(r1.A4J)) {
                        C1229766o A002 = AnonymousClass5KY.A00(r1);
                        AnonymousClass3ZH r7 = r1.A3n;
                        LinearLayout linearLayout = r1.A0k;
                        ViewGroup viewGroup = r1.A0U;
                        ConversationListView conversationListView = r1.A2f;
                        Window A03 = C113245l7.A03(r1);
                        C89644eZ A09 = C113245l7.A09(r1);
                        C112185jK r8 = (C112185jK) A002;
                        C162457s7.A0J(r2, 0);
                        C18260x0.A0V(r7, linearLayout, viewGroup);
                        C162457s7.A0J(conversationListView, 4);
                        C18260x0.A0T(A03, A09);
                        if (r8.BH4(r2)) {
                            boolean BH3 = r8.BH3(r2);
                            View A0N = C86634Kw.A0N(A03);
                            if (BH3) {
                                r8.A02(conversationListView, r7);
                                if (A0N != null) {
                                    AnonymousClass4QF r0 = (AnonymousClass4QF) A0N.findViewById(R.id.bot_embodiment_view);
                                    if (r0 != null) {
                                        r0.setVisibility(0);
                                        r0.A03();
                                        return;
                                    }
                                    return;
                                }
                                C995055z A003 = C112185jK.A00(linearLayout, A03, A09, (BotEmbodimentViewModel) AnonymousClass0x9.A0H(A09).A01(BotEmbodimentViewModel.class), r2);
                                if (C112185jK.A01(conversationListView, conversationListView.getFirstVisiblePosition())) {
                                    A003.A0D(1, true);
                                    return;
                                } else {
                                    A003.A0D(2, true);
                                    return;
                                }
                            } else if (A0N != null) {
                                AnonymousClass4QF r12 = (AnonymousClass4QF) A0N.findViewById(R.id.bot_embodiment_view);
                                if (r12 != null) {
                                    r12.setVisibility(8);
                                    r12.A02();
                                }
                                View findViewById = conversationListView.findViewById(R.id.bonsai_list_view_header);
                                if (findViewById != null) {
                                    conversationListView.removeHeaderView(findViewById);
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                C162457s7.A0J(r2, 0);
                AnonymousClass5WK.A00(r2, (AnonymousClass5WK) this.A00, "UpdatesViewModelObservers/notifyChatChanged");
                return;
        }
    }

    public void BLf(C95814uZ r3, Collection collection, int i) {
        if (2 - this.A01 == 0) {
            C162457s7.A0J(r3, 0);
            AnonymousClass5WK.A00(r3, (AnonymousClass5WK) this.A00, "UpdatesViewModelObservers/notifyChatRead");
        }
    }

    public void BLg(C95814uZ r3) {
        if (2 - this.A01 == 0) {
            C162457s7.A0J(r3, 0);
            AnonymousClass5WK.A00(r3, (AnonymousClass5WK) this.A00, "UpdatesViewModelObservers/notifyChatRemoved");
        }
    }

    public void BLh(C95814uZ r3) {
        if (2 - this.A01 == 0) {
            C162457s7.A0J(r3, 0);
            AnonymousClass5WK.A00(r3, (AnonymousClass5WK) this.A00, "UpdatesViewModelObservers/notifyChatUnread");
        }
    }
}

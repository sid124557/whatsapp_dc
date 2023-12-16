package X;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.chatinfo.EphemeralMessagesInfoView;
import com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.playback.MessageReplyActivity;
import com.whatsapp.util.Log;

/* renamed from: X.39n  reason: invalid class name and case insensitive filesystem */
public class C635139n implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public C635139n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.A05 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
    }

    public final void onClick(View view) {
        int i;
        switch (this.A05) {
            case 0:
                EphemeralMessagesInfoView ephemeralMessagesInfoView = (EphemeralMessagesInfoView) this.A01;
                C27991fJ r6 = (C27991fJ) this.A02;
                AnonymousClass3ZH r5 = (AnonymousClass3ZH) this.A03;
                Context context = (Context) this.A04;
                C162457s7.A0J(context, 4);
                ((C95084sb) this.A00).A04 = Boolean.TRUE;
                boolean A0e = ephemeralMessagesInfoView.getGroupChatManager$ui_consumerBeta().A0e(r5, r6);
                Context context2 = ephemeralMessagesInfoView.getContext();
                if (A0e) {
                    context.startActivity(C627736r.A0R(context2, r6, r5.A02, 1));
                    return;
                } else {
                    Toast.makeText(context2, R.string.f11nameremoved, 0).show();
                    return;
                }
            case 1:
                C55662qi r4 = (C55662qi) this.A00;
                Context context3 = (Context) this.A01;
                C58932w3 r8 = (C58932w3) this.A02;
                C93314oJ r62 = (C93314oJ) this.A03;
                DialogFragment dialogFragment = (DialogFragment) this.A04;
                C624134x fMessage = r62.getFMessage();
                int i2 = r8.A06;
                if (i2 == 1) {
                    Log.e("ClickToActionButtonUtils/fillButton/the button is in wrong type.");
                } else if (i2 == 2) {
                    String str = r8.A09;
                    UserJid A0o = fMessage.A0o();
                    if (r4.A04(fMessage)) {
                        r4.A02(context3, r62, fMessage, r8, str, false);
                        if (A0o != null) {
                            r4.A0C.A00(A0o);
                        }
                    } else {
                        if (A0o != null && r4.A0D.A04(A0o) && str != null && !str.isEmpty()) {
                            r8.A01 = str;
                            r4.A0C.A00(A0o);
                        }
                        r4.A01(context3, r62, fMessage, r8);
                    }
                } else if (i2 == 3) {
                    r4.A0F.A00(fMessage, "cta-call", String.valueOf(r8.A05));
                    C70333aK.A00(r4.A0I, r4, fMessage, r8, 11);
                    C111095hX r3 = r4.A00;
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("tel:");
                    C18310x6.A0y(context3, r3, AnonymousClass000.A0X(r8.A01, A0o2));
                }
                if (dialogFragment != null) {
                    dialogFragment.A1K();
                    return;
                }
                return;
            case 2:
                C632338l r52 = (C632338l) this.A02;
                C08270df r42 = (C08270df) this.A03;
                Number number = (Number) this.A04;
                C18270x1.A0f(C18270x1.A03(((C59522x3) this.A00).A00), "fun_stickers_notice_started_clicked");
                ((AnonymousClass4GP) this.A01).invoke();
                if (number != null) {
                    i = number.intValue();
                } else {
                    i = 10;
                }
                SearchFunStickersBottomSheet searchFunStickersBottomSheet = new SearchFunStickersBottomSheet();
                Bundle A08 = AnonymousClass002.A08();
                A08.putInt("stickerOrigin", i);
                if (r52 != null) {
                    A08.putParcelable("funStickerData", r52);
                }
                searchFunStickersBottomSheet.A0u(A08);
                if (r42.A0D("search_fun_stickers_bottom_sheet") == null) {
                    searchFunStickersBottomSheet.A1O(r42, "search_fun_stickers_bottom_sheet");
                    return;
                }
                return;
            case 3:
                C108565dC r0 = (C108565dC) this.A00;
                C620733j r63 = (C620733j) this.A01;
                C111095hX r53 = (C111095hX) this.A02;
                Context context4 = (Context) this.A03;
                C69263Wi r32 = (C69263Wi) this.A04;
                if (r0 != null) {
                    String str2 = r0.A02;
                    if (!TextUtils.isEmpty(str2)) {
                        r53.A0A(context4, new Intent("android.intent.action.VIEW", Uri.parse(str2.replace("%@", r63.A07()))));
                        return;
                    }
                }
                r32.A0H(R.string.f11nameremoved, 0);
                return;
            default:
                MessageReplyActivity messageReplyActivity = (MessageReplyActivity) this.A00;
                ViewGroup viewGroup = (ViewGroup) this.A01;
                View view2 = (View) this.A02;
                View view3 = (View) this.A03;
                Object obj = this.A04;
                view2.performHapticFeedback(1, 2);
                if (C18280x3.A02(AnonymousClass1Hf.A27(messageReplyActivity), "status_reactions_nux_shown_count") <= 2) {
                    AnonymousClass33p r1 = messageReplyActivity.A09;
                    C18270x1.A0h(C18270x1.A03(r1), "status_reactions_nux_shown_count", C18280x3.A02(AnonymousClass0x2.A0F(r1), "status_reactions_nux_shown_count") + 1);
                }
                AnimatorSet A74 = messageReplyActivity.A74(view2, view3, viewGroup);
                A74.addListener(new C1233568c(A74, messageReplyActivity, obj, 0));
                A74.start();
                return;
        }
    }
}

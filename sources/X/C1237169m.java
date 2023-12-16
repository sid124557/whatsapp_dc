package X;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2;
import com.whatsapp.conversation.comments.CommentActionsBottomSheet;
import com.whatsapp.conversationslist.ViewHolder;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: X.69m  reason: invalid class name and case insensitive filesystem */
public class C1237169m implements View.OnLongClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C1237169m(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public static void A00(View view, Object obj, Object obj2, int i) {
        view.setOnLongClickListener(new C1237169m(obj, i, obj2));
    }

    public static final boolean A01(C1237169m r3) {
        AnonymousClass4Z5 r2 = (AnonymousClass4Z5) r3.A00;
        CallsHistoryFragmentV2 callsHistoryFragmentV2 = ((AnonymousClass7D6) r3.A01).A00;
        if (!callsHistoryFragmentV2.A0t) {
            Log.w("CallsHistoryFragmentV2/ScheduleCallItemViewHolderEventListener/onViewHolderLongClicked action not supported in the middle of a search");
            return false;
        }
        CallsHistoryFragmentV2.A01(r2, callsHistoryFragmentV2);
        return true;
    }

    public static final boolean A02(C1237169m r3) {
        C986452r r32 = (C986452r) r3.A01;
        C1228366a r2 = ((AnonymousClass53G) r3.A00).A06;
        UserJid userJid = r32.A01.A0A;
        C162457s7.A0D(userJid);
        r2.BcS(userJid, r32.A05);
        return true;
    }

    public static final boolean A03(C1237169m r2) {
        AnonymousClass66J r1 = ((AnonymousClass53H) r2.A00).A07;
        UserJid userJid = ((C986452r) r2.A01).A01.A0A;
        C162457s7.A0D(userJid);
        r1.BcS(userJid, false);
        return true;
    }

    public static final boolean A04(C1237169m r7) {
        AnonymousClass4Z4 r1 = (AnonymousClass4Z4) r7.A00;
        AnonymousClass5Y0 r5 = r1.A04;
        ImageView imageView = r1.A02;
        C106825aE.A00(imageView, r1.A03.getRootView(), new AnonymousClass4Rm(imageView, (AnonymousClass4A4) r7.A01, r5, r1.A01.A00, false));
        return true;
    }

    public static final boolean A05(C1237169m r10) {
        AnonymousClass4YZ r1 = (AnonymousClass4YZ) r10.A01;
        TextEmojiLabel textEmojiLabel = r1.A00;
        Context A0F = C18290x4.A0F(textEmojiLabel);
        String A1K = C86664Kz.A1K(textEmojiLabel);
        String str = r1.A03;
        AnonymousClass4WZ r6 = ((C101925Gu) r10.A00).A00;
        List list = r6.A06;
        int size = list.size();
        int i = R.string.f11nameremoved;
        if (size > 1) {
            i = R.string.f11nameremoved;
        }
        int size2 = list.size();
        int i2 = R.string.f11nameremoved;
        if (size2 > 1) {
            i2 = R.string.f11nameremoved;
        }
        AnonymousClass69A r3 = new AnonymousClass69A(16);
        C107945cA r2 = new C107945cA(r6, A1K, str);
        C19340zH A002 = AnonymousClass5V0.A00(A0F);
        A002.A0Q(A0F.getString(i));
        A002.A0G(r3, A0F.getString(R.string.f11nameremoved));
        A002.A0I(r2, A0F.getString(i2));
        C18280x3.A0q(A002);
        return true;
    }

    public final boolean onLongClick(View view) {
        C624134x r3;
        C89654ea r2;
        int i;
        switch (this.A02) {
            case 0:
                return A01(this);
            case 1:
                C92234mJ r4 = (C92234mJ) this.A00;
                C624134x r32 = (C624134x) this.A01;
                View view2 = r4.A00;
                AnonymousClass67A r5 = r4.A01;
                C89644eZ activity = r5.getActivity();
                AnonymousClass1VX r0 = r4.A06;
                C05430Th r8 = new C05430Th(activity, view2, 8388613, 0, AnonymousClass29M.A00(r0));
                C07890cz r7 = r8.A04;
                if (C106545Zk.A00(r0)) {
                    r7.A0H = true;
                }
                if (r4.A04.A00(r32)) {
                    MenuItem add = r7.add(0, 0, 1, (int) R.string.f11nameremoved);
                    add.setIcon(R.drawable.vec_ic_action_unpin_in_chat);
                    AnonymousClass0I5.A00(C86664Kz.A0V(r5.getActivity(), R.color.f5nameremoved), add);
                    i = 2;
                } else {
                    i = 1;
                }
                MenuItem add2 = r7.add(0, 1, i, (int) R.string.f11nameremoved);
                add2.setIcon(R.drawable.vec_ic_action_arrow_next);
                AnonymousClass0I5.A00(C86664Kz.A0V(r5.getActivity(), R.color.f5nameremoved), add2);
                r8.A01 = new C1234968q(r4, 0, r32);
                r8.A00();
                return true;
            case 2:
                r3 = (C624134x) this.A01;
                C162457s7.A0J(r3, 1);
                r2 = ((AnonymousClass4QS) this.A00).getActivity();
                break;
            case 3:
                r3 = (C624134x) this.A01;
                C162457s7.A0J(r3, 1);
                r2 = ((AnonymousClass4QT) this.A00).getActivity();
                break;
            case 4:
                C624134x r1 = (C624134x) this.A01;
                C162457s7.A0J(r1, 1);
                C89654ea activity2 = ((AnonymousClass4RV) this.A00).getActivity();
                Bundle A08 = AnonymousClass002.A08();
                C107395bF.A07(A08, r1.A1J);
                CommentActionsBottomSheet commentActionsBottomSheet = new CommentActionsBottomSheet();
                commentActionsBottomSheet.A0u(A08);
                activity2.Bon(commentActionsBottomSheet, (String) null);
                return true;
            case 5:
                AnonymousClass5TP r12 = (AnonymousClass5TP) this.A00;
                C624134x r42 = (C624134x) this.A01;
                C93294oH r33 = r12.A0D;
                AnonymousClass677 r22 = r33.A0m;
                if (r22 == null) {
                    return true;
                }
                r22.Bpx(r12.A07);
                r12.A00();
                r12.A02.setSelected(r22.BIB(r42));
                C71333bw.A00(r33.A25, r33, r42, 12);
                return true;
            case 6:
                C93414oW r34 = (C93414oW) this.A00;
                Log.d("BaseLinkCarouselItemView/longClickListener");
                C93414oW.A00(r34.A01, (C30481mW) this.A01, r34.getSelectionView());
                return true;
            case 7:
                C113245l7 r23 = (C113245l7) this.A00;
                if (((AnonymousClass5TN) this.A01).A04) {
                    r23.A1S(1);
                    r23.A15();
                    r23.A51.A04();
                    r23.A51.A03();
                    return true;
                }
                r23.A5T.A00(2);
                r23.A2a.A09(2);
                return true;
            case 8:
                C94124pw r02 = (C94124pw) this.A00;
                C1230266t r24 = r02.A03;
                ViewHolder viewHolder = r02.A08;
                return r24.BVx(viewHolder, viewHolder, (C95814uZ) this.A01, -1);
            case 9:
                return A04(this);
            case 10:
                MediaViewFragment mediaViewFragment = (MediaViewFragment) this.A00;
                Set singleton = Collections.singleton(this.A01);
                C003203q A0R = mediaViewFragment.A0R();
                C69263Wi r35 = mediaViewFragment.A0L;
                C106195Xz r9 = mediaViewFragment.A1G;
                C56972sr r43 = mediaViewFragment.A0N;
                C64773Ex r52 = mediaViewFragment.A0V;
                C620733j r82 = mediaViewFragment.A0l;
                C107315b6.A07(A0R, r35, r43, r52, mediaViewFragment.A0Z, mediaViewFragment.A0f, r82, r9, mediaViewFragment.A1O, mediaViewFragment.A1V, singleton);
                return true;
            case 11:
                return A05(this);
            case 12:
                return A02(this);
            default:
                return A03(this);
        }
        Bundle A082 = AnonymousClass002.A08();
        C107395bF.A07(A082, r3.A1J);
        CommentActionsBottomSheet commentActionsBottomSheet2 = new CommentActionsBottomSheet();
        commentActionsBottomSheet2.A0u(A082);
        r2.Boo(commentActionsBottomSheet2);
        return true;
    }
}

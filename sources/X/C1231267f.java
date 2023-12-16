package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.bonsai.commands.BotCommandsPickerView;
import com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2;
import com.whatsapp.community.CommunityFragment;
import com.whatsapp.mentions.MentionPickerView;
import com.whatsapp.util.Log;

/* renamed from: X.67f  reason: invalid class name and case insensitive filesystem */
public class C1231267f extends C04640Qa {
    public Object A00;
    public final int A01;

    public C1231267f(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A02(int i, int i2) {
        if (1 - this.A01 != 0) {
            super.A02(i, i2);
        } else {
            A08();
        }
    }

    public void A03(int i, int i2, int i3) {
        if (1 - this.A01 != 0) {
            super.A03(i, i2, i3);
        } else {
            A08();
        }
    }

    public void A05() {
        switch (this.A01) {
            case 0:
                BotCommandsPickerView botCommandsPickerView = (BotCommandsPickerView) this.A00;
                AnonymousClass4WQ r1 = botCommandsPickerView.A02;
                if (r1 != null) {
                    Log.d("BotCommandsPickerView/AdapterDataObserver/onChanged");
                    botCommandsPickerView.A0A(r1.A01.size());
                    return;
                }
                return;
            case 1:
                A08();
                return;
            case 4:
                MentionPickerView mentionPickerView = (MentionPickerView) this.A00;
                mentionPickerView.A05();
                mentionPickerView.A02.postDelayed(new C70013Zn(mentionPickerView, 20), 250);
                return;
            default:
                super.A05();
                return;
        }
    }

    public void A06(int i, int i2) {
        C06440Xs r1;
        int i3;
        C97154xi r2;
        int i4;
        switch (this.A01) {
            case 1:
                A08();
                CallsHistoryFragmentV2 callsHistoryFragmentV2 = (CallsHistoryFragmentV2) this.A00;
                if (!callsHistoryFragmentV2.isEmpty()) {
                    r2 = callsHistoryFragmentV2.A0a;
                    i4 = 400;
                    break;
                } else {
                    return;
                }
            case 2:
                CommunityFragment communityFragment = (CommunityFragment) this.A00;
                if (!communityFragment.isEmpty()) {
                    r2 = communityFragment.A0M;
                    i4 = 600;
                    break;
                } else {
                    return;
                }
            case 3:
                AnonymousClass4W9 r5 = (AnonymousClass4W9) this.A00;
                RecyclerView recyclerView = r5.A00;
                LinearLayoutManager linearLayoutManager = null;
                if (recyclerView != null) {
                    r1 = recyclerView.getLayoutManager();
                } else {
                    r1 = null;
                }
                if (r1 instanceof LinearLayoutManager) {
                    linearLayoutManager = (LinearLayoutManager) r1;
                }
                if (recyclerView != null) {
                    i3 = recyclerView.getScrollState();
                } else {
                    i3 = 0;
                }
                if (linearLayoutManager != null && i2 >= 0 && i == 0 && i3 == 0) {
                    int max = Math.max(linearLayoutManager.A1G(), 0);
                    if (max == 0 || max == 1) {
                        RecyclerView recyclerView2 = r5.A00;
                        if (recyclerView2 != null) {
                            recyclerView2.A0Z(0);
                        }
                        RecyclerView recyclerView3 = r5.A00;
                        if (recyclerView3 != null) {
                            recyclerView3.postOnAnimationDelayed(C117085rM.A00(r5, 24), 128);
                            return;
                        }
                        return;
                    }
                    RecyclerView recyclerView4 = r5.A00;
                    if (recyclerView4 != null) {
                        recyclerView4.A0f(0, 10);
                        return;
                    }
                    return;
                }
                return;
            default:
                super.A06(i, i2);
                return;
        }
        r2.A09(i4, false);
    }

    public void A07(int i, int i2) {
        C97154xi r2;
        int i3;
        switch (this.A01) {
            case 1:
                CallsHistoryFragmentV2 callsHistoryFragmentV2 = (CallsHistoryFragmentV2) this.A00;
                if (callsHistoryFragmentV2.isEmpty()) {
                    r2 = callsHistoryFragmentV2.A0a;
                    i3 = 400;
                    break;
                } else {
                    return;
                }
            case 2:
                CommunityFragment communityFragment = (CommunityFragment) this.A00;
                if (communityFragment.isEmpty()) {
                    r2 = communityFragment.A0M;
                    i3 = 600;
                    break;
                } else {
                    return;
                }
            default:
                super.A07(i, i2);
                return;
        }
        r2.A09(i3, true);
    }

    public final void A08() {
        CallsHistoryFragmentV2 callsHistoryFragmentV2 = (CallsHistoryFragmentV2) this.A00;
        if (C18320x8.A1U(callsHistoryFragmentV2.A0G.A0T.A01) && callsHistoryFragmentV2.A0F.A0G() > 0) {
            callsHistoryFragmentV2.A05.A0Z(0);
        }
    }
}

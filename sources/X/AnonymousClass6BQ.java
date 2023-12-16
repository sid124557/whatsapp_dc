package X;

import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.group.GroupCallButtonController;
import com.whatsapp.quickcontact.QuickContactActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.Lock;

/* renamed from: X.6BQ  reason: invalid class name */
public class AnonymousClass6BQ implements AnonymousClass4F0 {
    public Object A00;
    public final int A01;

    public AnonymousClass6BQ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void A00(AnonymousClass3ZF r5) {
        if (r5 != null) {
            ConversationsFragment conversationsFragment = (ConversationsFragment) this.A00;
            if (C627436k.A0G(conversationsFragment.A24)) {
                C95814uZ r0 = r5.A05;
                if (r0 == null) {
                    if (r5.A0L()) {
                        Iterator it = r5.A09().iterator();
                        while (it.hasNext()) {
                            C95814uZ A0P = C18300x5.A0P(it);
                            if (!conversationsFragment.A0j.A0a(A0P)) {
                                conversationsFragment.A1f(A0P);
                            }
                        }
                        return;
                    }
                    r0 = r5.A0E.A01;
                }
                conversationsFragment.A1f(r0);
            }
        }
    }

    public void BO3() {
        switch (this.A01) {
            case 0:
                Log.i("CallsHistoryDataSource/onCallLogDeleted");
                AnonymousClass7DD r2 = ((AnonymousClass5XL) this.A00).A06;
                if (r2 != null) {
                    Log.i("CallsHistoryViewModel/onCallLogCleared");
                    AnonymousClass5ZM.A05(r2.A00, new AnonymousClass68M((Object) r2, 3));
                    return;
                }
                return;
            case 2:
                ((ConversationsFragment) this.A00).A1i("CallLog cleared");
                return;
            default:
                return;
        }
    }

    public void BO5() {
        if (this.A01 == 0) {
            Log.i("CallsHistoryDataSource/onCallLogHistoryApplied");
            ((AnonymousClass5XL) this.A00).A01();
        }
    }

    public void BO6(AnonymousClass3ZF r16) {
        AnonymousClass3ZF r10 = r16;
        switch (this.A01) {
            case 0:
                Log.i("CallsHistoryDataSource/onCallLogUpdated");
                if (r10.A07 != null) {
                    AnonymousClass5XL r2 = (AnonymousClass5XL) this.A00;
                    if (r2.A0J.A0X(6522)) {
                        AnonymousClass7DD r1 = r2.A06;
                        if (r1 != null) {
                            Log.i("CallsHistoryViewModel/onOngoingCallLogUpdated");
                            CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r1.A00;
                            C18290x4.A1L(callsHistoryFragmentV2ViewModel.A08);
                            AnonymousClass7DC r22 = callsHistoryFragmentV2ViewModel.A0P;
                            Lock lock = callsHistoryFragmentV2ViewModel.A0r;
                            LinkedHashMap linkedHashMap = callsHistoryFragmentV2ViewModel.A0q;
                            ArrayList arrayList = callsHistoryFragmentV2ViewModel.A0o;
                            C56612sH r5 = callsHistoryFragmentV2ViewModel.A0a;
                            AnonymousClass1VX r7 = callsHistoryFragmentV2ViewModel.A0f;
                            C56572sD r9 = callsHistoryFragmentV2ViewModel.A0k;
                            C992755c r12 = new C992755c(r22, callsHistoryFragmentV2ViewModel.A0Y, callsHistoryFragmentV2ViewModel.A0Z, r5, callsHistoryFragmentV2ViewModel.A0e, r7, callsHistoryFragmentV2ViewModel.A0g, r9, r10, AnonymousClass0x9.A14(callsHistoryFragmentV2ViewModel), arrayList, linkedHashMap, lock);
                            callsHistoryFragmentV2ViewModel.A08 = r12;
                            AnonymousClass5ZM.A05(callsHistoryFragmentV2ViewModel, r12);
                            return;
                        }
                        return;
                    }
                }
                ((AnonymousClass5XL) this.A00).A01();
                return;
            case 1:
                C92274mN r3 = (C92274mN) this.A00;
                C95814uZ r23 = r3.A0V;
                if (r23.equals(r10.A05)) {
                    C18260x0.A1R(AnonymousClass001.A0o(), "groupconversationmenu/onCallLogUpdated groupJid: ", r23);
                    if (!AnonymousClass75J.A00(r10.A07, r3.A04)) {
                        r3.A04 = r10.A07;
                        r3.A01.invalidateOptionsMenu();
                    }
                    if (r3.A04 == null) {
                        r10 = null;
                    }
                    r3.A03 = r10;
                    r3.A0K.Brj(r10);
                    return;
                }
                return;
            case 2:
                Log.d("ConversationsFragment/onCallLogUpdated");
                A00(r10);
                return;
            case 3:
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("GroupCallButtonController/onCallLogUpdated groupJid: ");
                GroupCallButtonController groupCallButtonController = (GroupCallButtonController) this.A00;
                C18260x0.A0o(groupCallButtonController.A06, A0o);
                if (groupCallButtonController.A06.equals(r10.A05)) {
                    if (!AnonymousClass75J.A00(r10.A07, groupCallButtonController.A09)) {
                        groupCallButtonController.A09 = r10.A07;
                        C86624Kv.A1J(groupCallButtonController);
                    }
                    if (groupCallButtonController.A09 == null) {
                        r10 = null;
                    }
                    groupCallButtonController.A08 = r10;
                    return;
                }
                return;
            default:
                QuickContactActivity quickContactActivity = (QuickContactActivity) this.A00;
                C27991fJ r13 = quickContactActivity.A0h;
                if (r13 != null && r13.equals(r10.A05)) {
                    quickContactActivity.A0w = r10;
                    if (!AnonymousClass75J.A00(r10.A07, quickContactActivity.A0z)) {
                        quickContactActivity.A0z = r10.A07;
                        AnonymousClass4SG.A3n(quickContactActivity);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public void BO7(Collection collection) {
        switch (this.A01) {
            case 0:
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("CallsHistoryDataSource/onCallLogsDeleted: size:");
                C18260x0.A1G(A0o, collection.size());
                AnonymousClass7DD r2 = ((AnonymousClass5XL) this.A00).A06;
                if (r2 != null) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("CallsHistoryViewModel/onCallLogsDeleted(");
                    A0o2.append(collection.size());
                    C18260x0.A1L(A0o2, ")");
                    CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r2.A00;
                    if (!callsHistoryFragmentV2ViewModel.A0G) {
                        Log.i("CallsHistoryViewModel/onCallLogsDeleted skip due to no active observer");
                        return;
                    } else {
                        callsHistoryFragmentV2ViewModel.A0L.A01();
                        return;
                    }
                } else {
                    return;
                }
            case 2:
                StringBuilder A0o3 = AnonymousClass001.A0o();
                A0o3.append("ConversationsFragment/onCallLogsDeleted size: ");
                C18260x0.A1F(A0o3, collection.size());
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    A00((AnonymousClass3ZF) it.next());
                }
                return;
            default:
                return;
        }
    }
}

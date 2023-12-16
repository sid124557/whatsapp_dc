package X;

import android.view.View;
import com.whatsapp.HomeActivity;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import com.whatsapp.calling.views.VoipReturnToCallBanner;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.group.GroupCallButtonController;
import com.whatsapp.quickcontact.QuickContactActivity;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.Lock;

/* renamed from: X.69s  reason: invalid class name and case insensitive filesystem */
public class C1237769s implements C185958uW {
    public Object A00;
    public final int A01;

    public C1237769s(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public /* synthetic */ void BO1(AnonymousClass3ZF r16) {
        AnonymousClass39J r1;
        AnonymousClass3ZF r11 = r16;
        switch (this.A01) {
            case 1:
                Log.i("CallsHistoryDataSource/onCallEnded");
                AnonymousClass5XL r2 = (AnonymousClass5XL) this.A00;
                if (r2.A06 != null) {
                    try {
                        r1 = C627436k.A03();
                    } catch (UnsatisfiedLinkError e) {
                        Log.e((Throwable) e);
                        r1 = null;
                    }
                    if (AnonymousClass5XE.A00(r2.A09, r1, r11)) {
                        if (!r11.A0L() && r2.A03 != null) {
                            Log.d("CallsHistoryDataSource/cancelRefreshCalls");
                            r2.A03.A0D(true);
                        }
                        AnonymousClass7DD r12 = r2.A06;
                        Log.i("CallsHistoryViewModel/onCallEnded");
                        CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r12.A00;
                        if (!callsHistoryFragmentV2ViewModel.A0G) {
                            Log.i("CallsHistoryViewModel/onCallEnded fully refresh the call history as the call items might be outdated");
                            callsHistoryFragmentV2ViewModel.A0I = true;
                            callsHistoryFragmentV2ViewModel.A0L.A01();
                            return;
                        }
                        AnonymousClass55J r0 = callsHistoryFragmentV2ViewModel.A06;
                        if (r0 != null) {
                            r0.A0D(true);
                        }
                        AnonymousClass7DA r13 = callsHistoryFragmentV2ViewModel.A0N;
                        Lock lock = callsHistoryFragmentV2ViewModel.A0r;
                        LinkedHashMap linkedHashMap = callsHistoryFragmentV2ViewModel.A0q;
                        ArrayList arrayList = callsHistoryFragmentV2ViewModel.A0o;
                        C56612sH r6 = callsHistoryFragmentV2ViewModel.A0a;
                        AnonymousClass1VX r8 = callsHistoryFragmentV2ViewModel.A0f;
                        C56572sD r10 = callsHistoryFragmentV2ViewModel.A0k;
                        C64773Ex r4 = callsHistoryFragmentV2ViewModel.A0Y;
                        AnonymousClass5ZU r5 = callsHistoryFragmentV2ViewModel.A0Z;
                        C66493Lq r9 = callsHistoryFragmentV2ViewModel.A0g;
                        AnonymousClass55J r02 = new AnonymousClass55J(r13, callsHistoryFragmentV2ViewModel, callsHistoryFragmentV2ViewModel.A0V, r4, r5, r6, callsHistoryFragmentV2ViewModel.A0e, r8, r9, r10, r11, arrayList, linkedHashMap, lock);
                        callsHistoryFragmentV2ViewModel.A06 = r02;
                        AnonymousClass5ZM.A05(callsHistoryFragmentV2ViewModel, r02);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                int i = r11.A0H;
                AnonymousClass4Rs r14 = (AnonymousClass4Rs) this.A00;
                if (i != 2) {
                    r14.A0H = false;
                }
                r14.setVisibility(8);
                return;
            case 3:
                ((C92244mK) this.A00).A08();
                return;
            case 4:
                ((C113245l7) this.A00).A2z.invalidateOptionsMenu();
                return;
            case 6:
                C86624Kv.A1J((GroupCallButtonController) this.A00);
                return;
            case 7:
                AnonymousClass4SG.A3n((QuickContactActivity) this.A00);
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void BO8(AnonymousClass3ZF r2, boolean z) {
        if (1 - this.A01 == 0) {
            Log.i("CallsHistoryDataSource/onCallMissed");
        }
    }

    public /* synthetic */ void BO9(long j, boolean z, boolean z2, boolean z3, boolean z4) {
        switch (this.A01) {
            case 2:
                if (z3) {
                    C86634Kw.A1R(this.A00);
                    return;
                }
                AnonymousClass4Rs r2 = (AnonymousClass4Rs) this.A00;
                r2.A0H = true;
                r2.setVisibility(0);
                r2.setCallNotificationTimer(j);
                VoipReturnToCallBanner voipReturnToCallBanner = (VoipReturnToCallBanner) r2;
                if (voipReturnToCallBanner.A04.getVisibility() == 0 && z != voipReturnToCallBanner.A0K) {
                    r2.A0K = z;
                    r2.A01();
                } else if (r2.A0J != z2) {
                    r2.A0J = z2;
                } else if (r2.A0I != z4) {
                    r2.A0I = z4;
                    r2.A03();
                    return;
                } else {
                    return;
                }
                r2.A02();
                return;
            case 3:
                C92244mK r22 = (C92244mK) this.A00;
                WDSButton wDSButton = r22.A0A;
                if (wDSButton != null) {
                    wDSButton.setEnabled(false);
                }
                r22.A09();
                return;
            default:
                return;
        }
    }

    public void BOB(AnonymousClass3ZF r4) {
        switch (this.A01) {
            case 0:
                HomeActivity homeActivity = (HomeActivity) this.A00;
                ((C113895mA) homeActivity.A1o.get()).A04();
                C107465bM.A03(homeActivity.A02, (C113895mA) homeActivity.A1o.get());
                homeActivity.A7U();
                return;
            case 2:
                ((AnonymousClass4Rs) this.A00).A04(r4, true);
                return;
            case 3:
                ((C92244mK) this.A00).A08();
                return;
            case 4:
                C113245l7 r2 = (C113245l7) this.A00;
                r2.A15();
                if (r2.A41.A0X(6989)) {
                    r2.A11();
                    return;
                }
                return;
            case 6:
                C86624Kv.A1J((GroupCallButtonController) this.A00);
                return;
            case 7:
                AnonymousClass4SG.A3n((QuickContactActivity) this.A00);
                return;
            case 8:
                AnonymousClass5ZT r1 = (AnonymousClass5ZT) this.A00;
                r1.A0Q(r1.A0U());
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void BOC(C95814uZ r2, CallState callState, String str) {
        if (5 - this.A01 == 0) {
            ((ConversationsFragment) this.A00).A1f(r2);
        }
    }

    public void Bbe() {
        C113895mA r1;
        View view;
        switch (this.A01) {
            case 0:
                HomeActivity homeActivity = (HomeActivity) this.A00;
                r1 = (C113895mA) homeActivity.A1o.get();
                view = homeActivity.A02;
                break;
            case 4:
                AnonymousClass676 r0 = ((C113245l7) this.A00).A2z;
                r1 = r0.getMessageAudioPlayerProvider();
                view = r0.getContentView();
                break;
            case 8:
                ((AnonymousClass5ZT) this.A00).A05();
                return;
            default:
                return;
        }
        C107465bM.A03(view, r1);
    }
}

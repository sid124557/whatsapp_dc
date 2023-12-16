package com.whatsapp.calling.callhistory.view;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0R2;
import X.AnonymousClass0RP;
import X.AnonymousClass0UY;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass24P;
import X.AnonymousClass30V;
import X.AnonymousClass32Y;
import X.AnonymousClass34R;
import X.AnonymousClass39J;
import X.AnonymousClass3DP;
import X.AnonymousClass3XG;
import X.AnonymousClass3ZF;
import X.AnonymousClass3ZH;
import X.AnonymousClass4FS;
import X.AnonymousClass4WD;
import X.AnonymousClass4Z5;
import X.AnonymousClass4s0;
import X.AnonymousClass5B7;
import X.AnonymousClass5MP;
import X.AnonymousClass5MQ;
import X.AnonymousClass5PH;
import X.AnonymousClass5TW;
import X.AnonymousClass5U2;
import X.AnonymousClass5UY;
import X.AnonymousClass5XL;
import X.AnonymousClass5YU;
import X.AnonymousClass5Yj;
import X.AnonymousClass640;
import X.AnonymousClass6C6;
import X.AnonymousClass7D4;
import X.AnonymousClass7D5;
import X.AnonymousClass7D6;
import X.AnonymousClass7D7;
import X.AnonymousClass8r3;
import X.AnonymousClass8s5;
import X.C003203q;
import X.C009707r;
import X.C04640Qa;
import X.C06560Yg;
import X.C08310eF;
import X.C1001059l;
import X.C105045Tj;
import X.C105365Uq;
import X.C106715a2;
import X.C107295b4;
import X.C111095hX;
import X.C114015mM;
import X.C116985rC;
import X.C117005rE;
import X.C117695sL;
import X.C1229666n;
import X.C1229966q;
import X.C1230066r;
import X.C1231267f;
import X.C1238369y;
import X.C150987Sz;
import X.C16910uE;
import X.C18260x0;
import X.C18270x1;
import X.C18290x4;
import X.C18300x5;
import X.C18320x8;
import X.C183538qC;
import X.C185658u2;
import X.C187958y5;
import X.C27991fJ;
import X.C44772Xk;
import X.C48852fa;
import X.C50382i5;
import X.C55422qK;
import X.C56322rn;
import X.C56572sD;
import X.C56592sF;
import X.C56612sH;
import X.C56762sW;
import X.C56892sj;
import X.C56972sr;
import X.C58422vE;
import X.C619532x;
import X.C620633i;
import X.C620733j;
import X.C626936e;
import X.C627336j;
import X.C627436k;
import X.C64773Ex;
import X.C66493Lq;
import X.C69263Wi;
import X.C71513cE;
import X.C86604Kt;
import X.C86624Kv;
import X.C86634Kw;
import X.C86654Ky;
import X.C89654ea;
import X.C91244jD;
import X.C91254jE;
import X.C95814uZ;
import X.C97154xi;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import com.whatsapp.calling.fragment.CallConfirmationFragment;
import com.whatsapp.collections.observablelistview.ObservableListView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class CallsHistoryFragmentV2 extends Hilt_CallsHistoryFragmentV2 implements C1229966q, C1229666n, AnonymousClass8r3, AnonymousClass640 {
    public View A00;
    public View A01;
    public View A02;
    public AnonymousClass0R2 A03;
    public C04640Qa A04;
    public RecyclerView A05;
    public C116985rC A06;
    public C116985rC A07;
    public C116985rC A08;
    public C111095hX A09;
    public C69263Wi A0A;
    public C56972sr A0B;
    public C48852fa A0C;
    public C50382i5 A0D;
    public AnonymousClass3DP A0E;
    public AnonymousClass4WD A0F;
    public CallsHistoryFragmentV2ViewModel A0G;
    public C1230066r A0H;
    public AnonymousClass3XG A0I;
    public AnonymousClass5TW A0J;
    public ObservableListView A0K;
    public C44772Xk A0L;
    public C64773Ex A0M;
    public C105365Uq A0N;
    public C105365Uq A0O;
    public C114015mM A0P;
    public C105045Tj A0Q;
    public C620633i A0R;
    public C56612sH A0S;
    public C620733j A0T;
    public C56762sW A0U;
    public C56892sj A0V;
    public C56322rn A0W;
    public C55422qK A0X;
    public AnonymousClass1VX A0Y;
    public C66493Lq A0Z;
    public C97154xi A0a;
    public C56592sF A0b;
    public C56572sD A0c;
    public AnonymousClass30V A0d;
    public C106715a2 A0e;
    public C187958y5 A0f;
    public AnonymousClass5UY A0g;
    public AnonymousClass5UY A0h;
    public AnonymousClass5UY A0i;
    public AnonymousClass5UY A0j;
    public AnonymousClass5UY A0k;
    public AnonymousClass5UY A0l;
    public AnonymousClass4FS A0m;
    public C183538qC A0n;
    public C183538qC A0o;
    public CharSequence A0p = "";
    public boolean A0q = false;
    public boolean A0r;
    public boolean A0s = false;
    public boolean A0t = true;
    public AnonymousClass5UY[] A0u;
    public final C16910uE A0v = new C1238369y(this, 1);
    public final AnonymousClass7D4 A0w = new AnonymousClass7D4(this);
    public final AnonymousClass5MP A0x = new AnonymousClass5MP(this);
    public final AnonymousClass7D5 A0y = new AnonymousClass7D5(this);
    public final AnonymousClass5MQ A0z = new AnonymousClass5MQ(this);
    public final AnonymousClass7D6 A10 = new AnonymousClass7D6(this);
    public final AnonymousClass7D7 A11 = new AnonymousClass7D7(this);
    public final Runnable A12 = C117695sL.A00(this, 12);
    public final HashMap A13 = AnonymousClass001.A0t();

    public static /* synthetic */ void A02(CallsHistoryFragmentV2 callsHistoryFragmentV2, AnonymousClass3ZH r7, long j) {
        String str;
        CallsHistoryFragmentV2 callsHistoryFragmentV22 = callsHistoryFragmentV2;
        Context A1D = callsHistoryFragmentV2.A1D();
        if (A1D == null) {
            str = "CallsHistoryFragmentV2/openPrecallLobby context is null";
        } else {
            C27991fJ A012 = AnonymousClass34R.A01(r7.A0H);
            if (A012 == null) {
                str = "CallsHistoryFragmentV2/openPrecallLobby group jid is null";
            } else {
                callsHistoryFragmentV2.A0m.BkP(new C71513cE(callsHistoryFragmentV22, A1D, A012, 2, j));
                return;
            }
        }
        Log.w(str);
    }

    public void A0k(int i, int i2, Intent intent) {
        if (i2 == -1) {
            boolean z = true;
            if (i != 10) {
                if (i == 150) {
                    this.A0r = true;
                    A1I();
                }
            } else if (intent != null) {
                try {
                    UserJid A0A2 = AnonymousClass32Y.A0A(intent.getStringExtra("contact"));
                    int intExtra = intent.getIntExtra("call_type", 1);
                    C1230066r r3 = this.A0H;
                    AnonymousClass3ZH A0A3 = this.A0M.A0A(A0A2);
                    C003203q A0R2 = A0R();
                    if (intExtra != 2) {
                        z = false;
                    }
                    r3.Bpk(A0R2, A0A3, 3, z);
                } catch (AnonymousClass24P unused) {
                    Log.e("callsHistory/callPicker failed to get selected contact");
                }
            }
        }
    }

    public void B1i() {
        this.A0t = false;
    }

    public void B2N() {
        this.A0t = true;
    }

    public static /* synthetic */ void A01(AnonymousClass4Z5 r9, CallsHistoryFragmentV2 callsHistoryFragmentV2) {
        C185658u2 r0;
        String str;
        AnonymousClass0R2 r02;
        if (r9 instanceof C91244jD) {
            r0 = ((C91244jD) r9).A03;
        } else {
            r0 = ((C91254jE) r9).A00;
        }
        if (r0 == null) {
            str = "CallsHistoryFragmentV2/toggleItemSelection view holder not bound";
        } else {
            C117005rE B58 = r0.B58();
            if (B58 == null) {
                str = "CallsHistoryFragmentV2/toggleItemSelection call group is null";
            } else {
                String A032 = B58.A03();
                HashMap hashMap = callsHistoryFragmentV2.A13;
                boolean containsKey = hashMap.containsKey(A032);
                if (containsKey) {
                    hashMap.remove(A032);
                    if (hashMap.isEmpty() && (r02 = callsHistoryFragmentV2.A03) != null) {
                        r02.A05();
                    }
                } else {
                    hashMap.put(A032, r9);
                    if (callsHistoryFragmentV2.A03 == null) {
                        C003203q A0Q2 = callsHistoryFragmentV2.A0Q();
                        if (A0Q2 instanceof C009707r) {
                            callsHistoryFragmentV2.A03 = ((C009707r) A0Q2).Bpz(callsHistoryFragmentV2.A0v);
                        }
                    }
                }
                r9.A07(!containsKey);
                AnonymousClass0R2 r03 = callsHistoryFragmentV2.A03;
                if (r03 != null) {
                    r03.A06();
                }
                callsHistoryFragmentV2.A0F.A09 = hashMap.keySet();
                if (!hashMap.isEmpty()) {
                    C003203q A0Q3 = callsHistoryFragmentV2.A0Q();
                    if (A0Q3 == null) {
                        str = "CallsHistoryFragmentV2/toggleItemSelection activity null for # items selected";
                    } else {
                        C620633i r5 = callsHistoryFragmentV2.A0R;
                        Resources A092 = C08310eF.A09(callsHistoryFragmentV2);
                        int size = hashMap.size();
                        Object[] objArr = new Object[1];
                        AnonymousClass000.A1L(objArr, hashMap.size());
                        C107295b4.A00(A0Q3, r5, A092.getQuantityString(R.plurals.f9nameremoved, size, objArr));
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        Log.w(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r5.getBoolean("request_sync", false) == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A0K(android.os.Bundle r5, android.view.LayoutInflater r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            X.2sF r0 = r4.A0b
            java.lang.String r3 = "CallsHistoryFragmentV2_onCreateView"
            r0.A07(r3)
            java.lang.String r0 = "CallsHistoryFragmentV2/onCreateView"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2 = 0
            if (r5 == 0) goto L_0x0018
            java.lang.String r0 = "request_sync"
            boolean r1 = r5.getBoolean(r0, r2)
            r0 = 1
            if (r1 != 0) goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            r4.A0r = r0
            r0 = 2131624298(0x7f0e016a, float:1.8875772E38)
            android.view.View r1 = r6.inflate(r0, r7, r2)
            X.2sF r0 = r4.A0b
            r0.A06(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2.A0K(android.os.Bundle, android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    public void A0c() {
        C04640Qa r1;
        Log.i("voip/CallsHistoryFragmentV2/onDestroyView");
        this.A0O.A00();
        this.A0N.A00();
        if (this.A0q && (r1 = this.A04) != null) {
            this.A0F.A01.unregisterObserver(r1);
        }
        super.A0c();
        this.A00 = null;
        this.A0K = null;
        this.A05 = null;
        this.A01 = null;
        this.A02 = null;
    }

    public void A0f() {
        this.A0b.A07("CallsHistoryFragmentV2_onResume");
        Log.d("CallsHistoryFragmentV2/onResume");
        super.A0f();
        this.A0G.A0H();
        this.A0b.A06("CallsHistoryFragmentV2_onResume");
    }

    public void A0q(Bundle bundle) {
        bundle.putBoolean("request_sync", this.A0r);
    }

    public void A0w(Bundle bundle, View view) {
        Log.i("CallsHistoryFragmentV2/onViewCreated");
        CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = (CallsHistoryFragmentV2ViewModel) AnonymousClass0x9.A0H(this).A01(CallsHistoryFragmentV2ViewModel.class);
        this.A0G = callsHistoryFragmentV2ViewModel;
        AnonymousClass6C6.A02(A0V(), callsHistoryFragmentV2ViewModel.A0l, this, 62);
        AnonymousClass6C6.A02(A0V(), this.A0G.A0J, this, 61);
        this.A05 = C86654Ky.A0P(A0J(), R.id.calls_recyclerView);
        this.A0O = this.A0P.A06(A0G(), "calls-fragment-single");
        this.A0N = this.A0P.A07("calls-fragment-multi", 0.0f, C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved));
        C18320x8.A19(this.A05, 1);
        this.A05.setAdapter(this.A0F);
        AnonymousClass4WD r1 = this.A0F;
        r1.A01 = this.A0x;
        r1.A02 = this.A0y;
        r1.A03 = this.A0z;
        r1.A07 = this.A0O;
        r1.A06 = this.A0N;
        Runnable runnable = this.A12;
        r1.A08 = runnable;
        r1.A09 = this.A13.keySet();
        AnonymousClass4WD r12 = this.A0F;
        r12.A00 = this.A0w;
        r12.A04 = this.A10;
        if (this.A0Y.A0X(4119)) {
            this.A0F.A05 = this.A11;
        }
        this.A05.setItemAnimator((AnonymousClass0UY) null);
        this.A05.setScrollbarFadingEnabled(true);
        AnonymousClass5YU.A00(view, this);
        AnonymousClass5YU.A02(this, this.A05);
        ((AbsListView) C06560Yg.A02(view, 16908298)).setAdapter((ListAdapter) null);
        AnonymousClass5UY A0M2 = AnonymousClass0x2.A0M(view, R.id.calls_empty_no_contacts_stub);
        this.A0g = A0M2;
        AnonymousClass5UY.A02(A0M2, this, 0);
        AnonymousClass5UY A0M3 = AnonymousClass0x2.A0M(view, R.id.contacts_empty_permission_denied_stub);
        this.A0h = A0M3;
        AnonymousClass5UY.A02(A0M3, this, 1);
        this.A0i = AnonymousClass0x2.A0M(view, R.id.calls_progress_bar_stub);
        this.A0k = AnonymousClass0x2.A0M(view, R.id.search_no_matches_text_stub);
        AnonymousClass5UY A0M4 = AnonymousClass0x2.A0M(view, R.id.search_no_matches_frame_stub);
        this.A0j = A0M4;
        AnonymousClass5UY.A02(A0M4, this, 2);
        AnonymousClass5UY A0M5 = AnonymousClass0x2.A0M(view, R.id.welcome_calls_layout_stub);
        this.A0l = A0M5;
        AnonymousClass5UY.A02(A0M5, this, 3);
        this.A0K = (ObservableListView) C06560Yg.A02(view, 16908298);
        this.A00 = C06560Yg.A02(view, 16908292);
        this.A01 = C06560Yg.A02(view, R.id.no_search_results_e2ee_footer);
        this.A0u = new AnonymousClass5UY[]{this.A0g, this.A0h, this.A0i, this.A0k, this.A0j, this.A0l};
        this.A02 = this.A05;
        A13(true);
        TextView A0G2 = C18300x5.A0G(this.A01, R.id.e2ee_main_text);
        A0G2.setText(this.A0e.A06(A0G2.getContext(), runnable, C08310eF.A09(this).getString(R.string.f11nameremoved), "%s", AnonymousClass5Yj.A04(A0G2)));
        C18270x1.A0q(A0G2, this.A0Y);
        if (!C86654Ky.A1Z(this.A0Y)) {
            ViewGroup.MarginLayoutParams A0T2 = AnonymousClass001.A0T(A0G2);
            A0T2.setMargins(A0T2.leftMargin, 0, A0T2.rightMargin, A0T2.bottomMargin);
            A0G2.setLayoutParams(A0T2);
        }
    }

    public void A0y(Menu menu, MenuInflater menuInflater) {
        if (!C86634Kw.A1b(this.A0Y)) {
            AnonymousClass5B7.A01(menu.add(3, R.id.menuitem_clear_call_log, 0, R.string.f11nameremoved), this, R.drawable.ic_settings_delete);
        }
        if (this.A07.A07() && this.A0Y.A0X(852) && this.A0Z.A0j.A0X(2574)) {
            this.A07.A04();
            throw AnonymousClass001.A0g("getMenuItemBusinessToolsId");
        }
    }

    public boolean Awt() {
        return true;
    }

    public void AxH(AnonymousClass5U2 r3) {
        String str = r3.A01;
        this.A0p = str;
        this.A0G.A0T.filter(str);
    }

    public boolean B3Y() {
        return true;
    }

    public Drawable B9J() {
        int i;
        boolean A1T = AnonymousClass001.A1T(this.A0Y.A0N(5370));
        Context A0G2 = A0G();
        if (A1T) {
            i = R.drawable.vec_ic_action_add_rounded;
        } else {
            boolean z = C1001059l.A04;
            i = R.drawable.ic_action_new_call;
            if (z) {
                i = R.drawable.ic_action_new_call_filled_wds;
            }
        }
        return AnonymousClass0RP.A00(A0G2, i);
    }

    public String B9K() {
        return null;
    }

    public String BCY() {
        return null;
    }

    public Drawable BCZ() {
        return null;
    }

    public int BDV() {
        return 400;
    }

    public String BDl() {
        return null;
    }

    public void BTn() {
        Log.d("CallsHistoryFragmentV2/onFragmentAsyncInit");
        Log.d("CallsHistoryFragmentV2/initializeData");
        if (this.A0s) {
            Log.d("CallsHistoryFragmentV2/initializeData skip");
        } else {
            this.A0s = true;
            CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = this.A0G;
            if (!callsHistoryFragmentV2ViewModel.A0F) {
                Log.d("CallsHistoryFragmentV2ViewModel/refreshCallLog");
                callsHistoryFragmentV2ViewModel.A0F = true;
                AnonymousClass5XL r1 = callsHistoryFragmentV2ViewModel.A0L;
                r1.A01();
                if (C627436k.A0I(callsHistoryFragmentV2ViewModel.A0f)) {
                    r1.A02();
                }
            }
        }
        if (C86654Ky.A1Z(this.A0Y) && this.A04 == null) {
            C1231267f r12 = new C1231267f(this, 1);
            this.A04 = r12;
            this.A0F.BiZ(r12);
        }
        this.A0q = true;
        if (!isEmpty()) {
            this.A0a.A09(400, false);
        }
    }

    public boolean BTo() {
        return this.A0q;
    }

    public void BVy() {
        if (this.A0J.A01()) {
            Log.w("voip/CallsFragment tried to start outgoing call from active voip call");
            this.A0A.A0H(R.string.f11nameremoved, 0);
        } else if (!this.A0Y.A0X(5868) && !this.A0L.A00()) {
            RequestPermissionActivity.A0j(this, R.string.f11nameremoved, R.string.f11nameremoved);
        } else if (this.A0Y.A0N(5370) > 0) {
            AnonymousClass1VX r1 = this.A0Y;
            if (r1.A0N(5370) > 0 && r1.A0X(5757)) {
                C619532x r2 = (C619532x) this.A0o.get();
                C86624Kv.A1K(r2.A02, r2, 18);
            }
            A0m(C86624Kv.A07(A0G(), 44));
        } else {
            A1I();
        }
    }

    public void Bb1() {
    }

    public void BnI(boolean z) {
        C150987Sz r2 = this.A0G.A0U;
        if (z) {
            r2.A00 = UUID.randomUUID();
            r2.A01 = true;
            AnonymousClass4s0 A002 = r2.A00();
            Integer A0Z2 = C18290x4.A0Z();
            A002.A01 = A0Z2;
            A002.A03 = A0Z2;
            r2.A02.BhD(A002);
            return;
        }
        r2.A00 = null;
    }

    public void BnJ(boolean z) {
        CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = this.A0G;
        synchronized (callsHistoryFragmentV2ViewModel) {
            if (callsHistoryFragmentV2ViewModel.A0f.A0X(6792)) {
                C18260x0.A1E("CallsHistoryFragmentV2ViewModel/setHasActiveObserver ", AnonymousClass001.A0o(), z);
                boolean z2 = callsHistoryFragmentV2ViewModel.A0G;
                callsHistoryFragmentV2ViewModel.A0G = z;
                if (z && !z2) {
                    callsHistoryFragmentV2ViewModel.A0L.A01();
                }
            }
        }
        if (z) {
            this.A0d.A02((C95814uZ) null, 15);
        }
    }

    public boolean BqR() {
        return true;
    }

    public boolean isEmpty() {
        C626936e.A0D(this.A0q, "isEmpty should be called after onFragmentAsyncInit for accuracy");
        CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = this.A0G;
        if (!callsHistoryFragmentV2ViewModel.A0q.isEmpty() || !callsHistoryFragmentV2ViewModel.A0o.isEmpty()) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ void A00(C117005rE r7, CallsHistoryFragmentV2 callsHistoryFragmentV2, AnonymousClass3ZH r9) {
        C95814uZ r2;
        String str;
        Intent A072;
        Context A1D = callsHistoryFragmentV2.A1D();
        if (A1D == null) {
            str = "CallsHistoryFragmentV2/launchCallLogInfoPage/onViewHolderClicked context null";
        } else {
            List<AnonymousClass3ZF> unmodifiableList = Collections.unmodifiableList(r7.A04);
            if (unmodifiableList.isEmpty()) {
                str = "CallsHistoryFragmentV2/launchCallLogInfoPage/onViewHolderClicked no calls registered for item";
            } else {
                boolean z = false;
                AnonymousClass3ZF r1 = (AnonymousClass3ZF) unmodifiableList.get(0);
                if (!r7.A04() || r9 != null) {
                    ArrayList A0s2 = AnonymousClass001.A0s();
                    for (AnonymousClass3ZF A062 : unmodifiableList) {
                        A0s2.add(A062.A06());
                    }
                    if (r9 == null || !r7.A04()) {
                        AnonymousClass3ZH A022 = r7.A02();
                        if (A022 == null) {
                            str = "CallsHistoryFragmentV2/launchCallLogInfoPage/onViewHolderClicked no contact registered for call group";
                        } else {
                            r2 = A022.A0H;
                        }
                    } else {
                        r2 = r9.A0H;
                    }
                    if (((AnonymousClass3ZF) unmodifiableList.get(0)).A0H == 2) {
                        z = true;
                    }
                    A072 = C18320x8.A07();
                    C627336j.A0E(A072, r2, A1D.getPackageName(), "com.whatsapp.calling.callhistory.CallLogActivity");
                    A072.putExtra("calls", A0s2);
                    A072.putExtra("is_voice_chat", z);
                } else {
                    AnonymousClass39J A063 = r1.A06();
                    A072 = C18320x8.A07();
                    A072.setClassName(A1D.getPackageName(), "com.whatsapp.calling.callhistory.group.GroupCallLogActivity");
                    A072.putExtra("call_log_key", A063);
                }
                callsHistoryFragmentV2.A0m(A072);
                return;
            }
        }
        Log.w(str);
    }

    public static /* synthetic */ void A03(CallsHistoryFragmentV2 callsHistoryFragmentV2, AnonymousClass3ZH r4, boolean z) {
        C003203q A0Q2 = callsHistoryFragmentV2.A0Q();
        if (A0Q2 instanceof C89654ea) {
            C89654ea r2 = (C89654ea) A0Q2;
            int i = 16;
            if (C18320x8.A1U(callsHistoryFragmentV2.A0G.A0T.A01)) {
                i = 35;
            }
            CallConfirmationFragment.A03(r2, r4, Integer.valueOf(i), z);
            return;
        }
        Log.e("Cannot call group contact since activity is not a dialog activity");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r1.A0o.isEmpty() == false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0x(android.view.Menu r4) {
        /*
            r3 = this;
            r0 = 2131431399(0x7f0b0fe7, float:1.8484526E38)
            android.view.MenuItem r2 = r4.findItem(r0)
            if (r2 == 0) goto L_0x0022
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r1 = r3.A0G
            java.util.LinkedHashMap r0 = r1.A0q
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x001c
            java.util.ArrayList r0 = r1.A0o
            boolean r1 = r0.isEmpty()
            r0 = 1
            if (r1 != 0) goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            r0 = r0 ^ 1
            r2.setVisible(r0)
        L_0x0022:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2.A0x(android.view.Menu):void");
    }

    public boolean A1B(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_new_call) {
            BVy();
            return true;
        } else if (itemId == R.id.menuitem_clear_call_log && this.A04 >= 7) {
            new CallsHistoryClearCallLogDialogFragment().A1O(A0U(), (String) null);
            return true;
        } else if (!this.A06.A07()) {
            return false;
        } else {
            this.A07.A04();
            throw AnonymousClass001.A0g("getMenuItemBusinessToolsId");
        }
    }

    public final void A1I() {
        AnonymousClass5PH r3 = new AnonymousClass5PH(A0Q());
        boolean z = true;
        r3.A04 = true;
        if (!this.A0r || this.A0B.A0Y()) {
            z = false;
        }
        r3.A0G = Boolean.valueOf(z);
        startActivityForResult(AnonymousClass5PH.A01(r3), 10);
        this.A0r = false;
    }

    public final void A1J(int i) {
        int i2;
        int i3;
        if (A16() && this.A0B != null) {
            if (i != 1) {
                CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = this.A0G;
                if ((callsHistoryFragmentV2ViewModel.A01 == null || callsHistoryFragmentV2ViewModel.A0C.isEmpty()) && (callsHistoryFragmentV2ViewModel.A02 == null || callsHistoryFragmentV2ViewModel.A0C.isEmpty())) {
                    i2 = 0;
                    this.A0K.setClipToPadding(false);
                    ObservableListView observableListView = this.A0K;
                    C86634Kw.A1B(this.A0K, observableListView, observableListView.getPaddingLeft(), i2, this.A0K.getPaddingRight());
                }
            }
            boolean A0Y2 = this.A0Y.A0Y(C58422vE.A01, 3289);
            boolean isEmpty = this.A0G.A0o.isEmpty();
            Resources A092 = C08310eF.A09(this);
            if (isEmpty) {
                i3 = R.dimen.f6nameremoved;
                if (A0Y2) {
                    i3 = R.dimen.f6nameremoved;
                }
            } else {
                i3 = R.dimen.f6nameremoved;
            }
            i2 = A092.getDimensionPixelSize(i3);
            this.A0K.setClipToPadding(false);
            ObservableListView observableListView2 = this.A0K;
            C86634Kw.A1B(this.A0K, observableListView2, observableListView2.getPaddingLeft(), i2, this.A0K.getPaddingRight());
        }
    }

    public final void A1K(View view) {
        if ((C86604Kt.A0A(this).screenLayout & 15) == 1) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = 48;
                view.setLayoutParams(layoutParams2);
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), 0);
            }
        }
    }

    public /* synthetic */ void Awb(AnonymousClass8s5 r1) {
        r1.BMG();
    }

    public String B9I() {
        return C08310eF.A09(this).getString(R.string.f11nameremoved);
    }
}

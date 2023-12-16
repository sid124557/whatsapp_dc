package X;

import android.app.assist.AssistContent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.conversation.ConversationListView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.picker.search.PickerSearchDialogFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4np  reason: invalid class name and case insensitive filesystem */
public class C93064np extends C93344oM implements AnonymousClass676 {
    public C15940sD A00;
    public C17310vJ A01;
    public AnonymousClass5M4 A02;
    public C113245l7 A03;
    public C93654ox A04;
    public AnonymousClass1VX A05;
    public C97154xi A06;
    public boolean A07;
    public final List A08 = AnonymousClass001.A0s();

    public void BKe(short s) {
        getWaBaseActivity().BKe(3);
    }

    public Intent Bih(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, boolean z) {
        return C154317cy.A01(broadcastReceiver, getWaBaseActivity(), intentFilter, true);
    }

    public void overridePendingTransition(int i, int i2) {
        getWaBaseActivity().overridePendingTransition(0, i2);
    }

    private int getCurrentLayout() {
        if (this.A05.A0X(3792)) {
            return R.layout.f8nameremoved;
        }
        return R.layout.f8nameremoved;
    }

    public void A02(AssistContent assistContent) {
        this.A03.A1a(assistContent);
    }

    public void Awo() {
        this.A03.A0b();
    }

    public void Awp(AnonymousClass3ZH r3, C95814uZ r4) {
        this.A03.A1s(r3, r4, false);
    }

    public void AxT() {
        this.A03.A2f.A0P = true;
    }

    public void B1h() {
        ConversationListView conversationListView = this.A03.A2f;
        if (conversationListView.A0K) {
            conversationListView.A0K = false;
            conversationListView.setTranscriptMode(0);
        }
    }

    public void B1j(AnonymousClass2z0 r2) {
        this.A00.A0K.A02(r2);
    }

    public boolean BFK() {
        return AnonymousClass001.A1W(C113245l7.A0A(this.A03).getCount());
    }

    public boolean BFL() {
        return this.A03.A6P;
    }

    public boolean BFX() {
        return this.A03.A2Q();
    }

    public void BG8(C624134x r9, AnonymousClass2z0 r10, AnonymousClass5NI r11, String str, String str2, Bitmap[] bitmapArr, int i) {
        this.A03.A23(r9, r10, r11, str, str2, bitmapArr, i);
    }

    public boolean BHx() {
        ConversationListView conversationListView = this.A03.A2f;
        if (conversationListView != null) {
            return conversationListView.A0B(0);
        }
        return false;
    }

    public boolean BId() {
        return this.A03.A37.A0F();
    }

    public boolean BIh() {
        AnonymousClass5ZT r0 = this.A03.A5q;
        if (r0 == null || !r0.A0U()) {
            return false;
        }
        return true;
    }

    public boolean BIv() {
        AccessibilityManager A0P;
        C113245l7 r2 = this.A03;
        if (r2.A6b || (A0P = r2.A2z.getSystemServices().A0P()) == null || !A0P.isTouchExplorationEnabled()) {
            return true;
        }
        return false;
    }

    public boolean BJ3() {
        return this.A03.A3n.A0j;
    }

    public void BJR(AnonymousClass3ZF r2, int i) {
        this.A03.A2B(r2);
    }

    public /* bridge */ /* synthetic */ void BJZ(Object obj) {
        this.A04.B2s((AnonymousClass654) null, Collections.singleton(obj), 1);
    }

    public void BKy() {
        this.A03.A0g();
    }

    public void BMB(long j, boolean z) {
        this.A03.A1Z(j, false, z);
    }

    public void BMl() {
        C113245l7 r2 = this.A03;
        r2.A1t(r2.A3n, false, false);
    }

    public void BQF(C42242Ni r2, C624134x r3, int i, long j) {
        this.A03.A1p(r2, r3, i);
    }

    public void BQG(long j, boolean z) {
        this.A03.A2H(z);
    }

    public void BQP(long j, boolean z) {
        this.A03.A1Z(j, true, z);
    }

    public void BQh() {
        this.A03.A0j();
    }

    public void BRp(C106655Zv r3) {
        this.A03.A70.BRo(r3.A00);
    }

    public void BT5(UserJid userJid, int i) {
        AnonymousClass4UA r2 = this.A03.A3D;
        r2.A0G(r2.A01, AnonymousClass59D.LOADING_FAILED);
    }

    public void BT6(UserJid userJid, boolean z, boolean z2) {
        this.A03.A1y(userJid);
    }

    public void BU1() {
    }

    public void BU2() {
        C113245l7 r2 = this.A03;
        C113245l7.A0G(r2).BkM(C117615sD.A00(r2, 24));
    }

    public void BU5(C166177yG r2) {
        this.A03.A1u(r2);
    }

    public void BY7(PickerSearchDialogFragment pickerSearchDialogFragment) {
        C113245l7 r1 = this.A03;
        r1.A4o.A02(pickerSearchDialogFragment);
        if (r1.A2Q()) {
            AnonymousClass5ZT r0 = r1.A5q;
            C626936e.A06(r0);
            r0.A05();
        }
    }

    public void BZd() {
        this.A03.A2a.A01();
    }

    public boolean BbB() {
        C113245l7 r3 = this.A03;
        return r3.A2q.A0E(C18280x3.A00(((C172068Jm) r3.A5a).A01.A0Y(C58422vE.A01, 2889) ? 1 : 0));
    }

    public void BcG(C30721mu r3) {
        C93314oJ A002 = this.A03.A2f.A00(r3.A1J);
        if (A002 instanceof C93234oB) {
            ((C93234oB) A002).A0D.BcG(r3);
        }
    }

    public void BdW(Bundle bundle) {
        C112975kg r0 = this.A00;
        if (r0 != null) {
            r0.A0N = this;
            List list = this.A01;
            if (list == null || 0 >= list.size()) {
                C89174bs.A00(this);
                this.A00.A05();
                return;
            }
            list.get(0);
            throw AnonymousClass001.A0g("onCreate");
        }
    }

    public void Bdx() {
        this.A03.A2a.A00();
    }

    public void BeV(C30721mu r3, String str) {
        C93314oJ A002 = this.A03.A2f.A00(r3.A1J);
        if (A002 instanceof C93234oB) {
            ((C93234oB) A002).A0D.BeV(r3, str);
        }
    }

    public void BfD() {
        C113245l7 r3 = this.A03;
        r3.A1t(r3.A3n, true, false);
    }

    public void BgN(C182328oE r2, AnonymousClass39W r3) {
        this.A03.A1m(r2, r3);
    }

    public void BhP(AnonymousClass3ZH r2, boolean z, boolean z2) {
        this.A03.A1t(r2, z, z2);
    }

    public void BiX() {
        this.A03.A1K();
    }

    public void Bjd() {
        AnonymousClass4VQ r0 = this.A03.A3B;
        r0.A0K();
        r0.A0J();
    }

    public void Bjx() {
        C113245l7 r2 = this.A03;
        r2.A3B.A0S((C624134x) null);
        r2.A0t();
    }

    public void Bk1(C30721mu r7, long j) {
        C113245l7 r5 = this.A03;
        if (r5.A07 == r7.A1L) {
            r5.A2f.removeCallbacks(r5.A6B);
            r5.A2f.postDelayed(r5.A6B, j);
        }
    }

    public void Bkr(C624134x r2) {
        this.A03.A20(r2);
    }

    public void Bks(ViewGroup viewGroup, C624134x r3) {
        this.A03.A1i(viewGroup, r3);
    }

    public void BlH(C624134x r2, C46532bn r3) {
        this.A03.A24(r2, r3);
    }

    public void BlU(C95814uZ r10, String str, String str2, String str3, String str4, long j) {
        C113245l7 r0 = this.A03;
        C113245l7.A08(r0).A0J(C86604Kt.A0a(r0.A3n), str, "address_message", str3, (String) null, j);
    }

    public void BlV(C624134x r2, String str, String str2, String str3) {
        this.A03.A27(r2, str2, str3);
    }

    public void BlW(C624134x r2, C58932w3 r3) {
        this.A03.A26(r2, r3);
    }

    public void BlY(C624134x r2, C108785dY r3) {
        this.A03.A25(r2, r3);
    }

    public void Bom(DialogFragment dialogFragment) {
        this.A03.A2z.Boo(dialogFragment);
    }

    public void BpG(C50392i6 r2) {
        this.A03.A1q(r2);
    }

    public void Bpa(AnonymousClass3ZH r2) {
        this.A03.A1r(r2);
    }

    public void Bpr(C50392i6 r4, int i) {
        C113245l7 r0 = this.A03;
        r0.A2C.Bpq(C113245l7.A09(r0), r4, 9);
    }

    public void Bq8(C95814uZ r2) {
        this.A03.A1w(r2);
    }

    public Object BqK(Class cls) {
        return this.A00.B5x(cls);
    }

    public void Brj(AnonymousClass3ZF r2) {
        this.A03.A2C(r2);
    }

    public void Bs6(C30721mu r2, long j, boolean z) {
        this.A03.A2A(r2, j, z);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.A03.A2c(motionEvent);
    }

    public C152967aS getCatalogLoadSession() {
        return this.A03.A0X();
    }

    public C95814uZ getChatJid() {
        return this.A03.A4J;
    }

    public AnonymousClass3ZH getContact() {
        return this.A03.A3n;
    }

    public C105365Uq getContactPhotosLoader() {
        AnonymousClass676 r0 = this.A03.A2z;
        return r0.getConversationRowInflater().A01(r0.getActivity());
    }

    public AnonymousClass5PZ getConversationBanners() {
        return this.A03.A2b;
    }

    public AnonymousClass679 getConversationRowCustomizer() {
        return this.A03.A0Z();
    }

    public C89224c7 getEmojiPopupWindow() {
        return this.A03.A45;
    }

    public AnonymousClass66v getInlineVideoPlaybackHandler() {
        return this.A03.A5l;
    }

    public C95814uZ getJid() {
        return this.A03.A4J;
    }

    public AnonymousClass0O9 getLifecycle() {
        C08310eF r0 = this.A00;
        C626936e.A06(r0);
        return r0.A0L;
    }

    public C15910sA getLifecycleOwner() {
        C08310eF r0 = this.A00;
        C626936e.A06(r0);
        return r0;
    }

    public C378324f getPreferredLabel() {
        return null;
    }

    public C624134x getQuotedMessage() {
        return this.A03.A3B.A0G;
    }

    public C17310vJ getSavedStateRegistryOwner() {
        C17310vJ r0 = this.A01;
        if (r0 == null) {
            return getWaBaseActivity();
        }
        return r0;
    }

    public ArrayList getSearchTerms() {
        return this.A03.A3B.A0K;
    }

    public String getSearchText() {
        return this.A03.A3B.A0I;
    }

    public EditText getTextEntryField() {
        return this.A03.A4P;
    }

    public Toolbar getToolbar() {
        return this.A03.A0r;
    }

    public C15940sD getViewModelStoreOwner() {
        C15940sD r0 = this.A00;
        if (r0 == null) {
            return getWaBaseActivity();
        }
        return r0;
    }

    public View getVoiceNoteDraftQuotedPreview() {
        return this.A03.A0R;
    }

    public C54292oU getWAContext() {
        return this.A00.A0U;
    }

    public boolean isFinishing() {
        C08310eF r0 = this.A00;
        C626936e.A06(r0);
        return r0.A0i;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.A03.A2a(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.A03.A2b(i, keyEvent);
    }

    public void onWindowFocusChanged(boolean z) {
        this.A03.A2I(z);
    }

    public void setCustomActionBarEnabled(boolean z) {
        this.A03.A6L = z;
    }

    public void setFollowPlayingVoiceMemo(boolean z) {
        this.A03.A6O = z;
    }

    public void setInputLayoutBackground(int i) {
        this.A03.A1Q(i);
    }

    public void setQuotedMessage(C624134x r2) {
        this.A03.A3B.A0S(r2);
    }

    public void setVoiceNoteDraftQuotedPreview(View view) {
        this.A03.A0R = view;
    }

    public C93064np(Context context) {
        super(context);
        A01();
        View.inflate(getContext(), getCurrentLayout(), this);
        C113245l7 r1 = this.A03;
        r1.A2z = this;
        this.A04 = this.A02.A00(r1);
    }

    public /* synthetic */ void AxU(int i) {
    }

    public boolean Ayn(C30721mu r4, boolean z) {
        if (getWaBaseActivity() == null) {
            return false;
        }
        C113245l7 r2 = this.A03;
        return AnonymousClass5BT.A00(C113245l7.A0E(r2), C100355Ap.A00(C113245l7.A0A(r2), r4), r4, z);
    }

    public boolean Azg(C30721mu r2, int i, boolean z, boolean z2) {
        if (getWaBaseActivity() == null) {
            return false;
        }
        return this.A03.A2f(r2, i, z, z2);
    }

    public void BEg() {
        getWaBaseActivity().runOnUiThread(new C117645sG((Object) this, 9));
    }

    public boolean BH0() {
        return AnonymousClass000.A1W(getWaBaseActivity());
    }

    public boolean BHW() {
        return getWaBaseActivity().BHW();
    }

    public void BKj(String str) {
        getWaBaseActivity().BKj(str);
    }

    public void BNY() {
        getWaBaseActivity().BNY();
    }

    public void BQZ() {
        getWaBaseActivity().BQZ();
    }

    public void BZO(int i) {
        super.BZO(i);
        this.A03.A1P(i);
    }

    public void BZs() {
        getWaBaseActivity().BZs();
    }

    public void BjL() {
        getWaBaseActivity().BjL();
    }

    public void Bon(DialogFragment dialogFragment, String str) {
        getWaBaseActivity().Bon(dialogFragment, str);
    }

    public void Boo(DialogFragment dialogFragment) {
        getWaBaseActivity().Boo(dialogFragment);
    }

    public void Bot(int i) {
        getWaBaseActivity().Bot(i);
    }

    public void Bou(String str) {
        getWaBaseActivity().Bou(str);
    }

    public void Bov(String str, String str2) {
        getWaBaseActivity().Bov(str, str2);
    }

    public void Bow(C181548mw r7, Object[] objArr, int i, int i2, int i3) {
        getWaBaseActivity().Bow(r7, objArr, i, i2, R.string.f11nameremoved);
    }

    public void Box(Object[] objArr, int i, int i2) {
        getWaBaseActivity().Box(objArr, i, i2);
    }

    public void Bp9(int i) {
        getWaBaseActivity().Bp9(R.string.f11nameremoved);
    }

    public void BpA(int i, int i2) {
        getWaBaseActivity().BpA(i, i2);
    }

    public void BpY(Intent intent, int i) {
        getWaBaseActivity().BpY(intent, i);
    }

    public AnonymousClass0R2 Bpz(C16910uE r2) {
        return getWaBaseActivity().Bpz(r2);
    }

    public boolean BqJ(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public void Bqv(List list) {
        getWaBaseActivity().Bqv(list);
    }

    public void Bru(String str) {
        getWaBaseActivity().Bru(str);
    }

    public void finish() {
        getWaBaseActivity().finish();
    }

    public void finishAndRemoveTask() {
        getWaBaseActivity().finishAndRemoveTask();
    }

    public AnonymousClass1VX getAbProps() {
        return getWaBaseActivity().getAbProps();
    }

    public C89644eZ getActivity() {
        return getWaBaseActivity();
    }

    public C111095hX getActivityUtils() {
        return getWaBaseActivity().A00;
    }

    public View getContentView() {
        return getWaBaseActivity().A00;
    }

    public C55682qk getCrashLogs() {
        return getWaBaseActivity().A03;
    }

    public AnonymousClass5Y0 getEmojiLoader() {
        return getWaBaseActivity().A0C;
    }

    public C64393Dh getFMessageIO() {
        return getWaBaseActivity().A04;
    }

    public AnonymousClass5JR getFirstDrawMonitor() {
        return getWaBaseActivity().A00.A00;
    }

    public C69263Wi getGlobalUI() {
        return getWaBaseActivity().A05;
    }

    public C105895Wv getImeUtils() {
        return getWaBaseActivity().A0B;
    }

    public Intent getIntent() {
        return getWaBaseActivity().getIntent();
    }

    public AnonymousClass5ND getInteractionPerfTracker() {
        return getWaBaseActivity().A00;
    }

    public LayoutInflater getLayoutInflater() {
        return getWaBaseActivity().getLayoutInflater();
    }

    public String getLocalClassName() {
        return getWaBaseActivity().getLocalClassName();
    }

    public C56972sr getMeManager() {
        return getWaBaseActivity().A01;
    }

    public C186568vZ getQuickPerformanceLogger() {
        return getWaBaseActivity().A03;
    }

    public C51072jE getRegistrationStateManager() {
        return getWaBaseActivity().A09;
    }

    public C29321id getScreenLockStateProvider() {
        return getWaBaseActivity().A0A;
    }

    public C66663Mh getServerProps() {
        return getWaBaseActivity().A06;
    }

    public C56592sF getStartupTracker() {
        if (getWaBaseActivity() == null) {
            return null;
        }
        return getWaBaseActivity().A02;
    }

    public C61072zf getStorageUtils() {
        return getWaBaseActivity().A07;
    }

    public String getString(int i) {
        return getWaBaseActivity().getString(i);
    }

    public AnonymousClass0R8 getSupportActionBar() {
        return getWaBaseActivity().getSupportActionBar();
    }

    public C08270df getSupportFragmentManager() {
        return getWaBaseActivity().getSupportFragmentManager();
    }

    public C620633i getSystemServices() {
        return getWaBaseActivity().A08;
    }

    public C56612sH getTime() {
        return getWaBaseActivity().A06;
    }

    public AnonymousClass33p getWaSharedPreferences() {
        return getWaBaseActivity().A09;
    }

    public AnonymousClass4FS getWaWorkers() {
        return getWaBaseActivity().A04;
    }

    public C620733j getWhatsAppLocale() {
        return getWaBaseActivity().A00;
    }

    public Window getWindow() {
        return getWaBaseActivity().getWindow();
    }

    public WindowManager getWindowManager() {
        return getWaBaseActivity().getWindowManager();
    }

    public void invalidateOptionsMenu() {
        getWaBaseActivity().invalidateOptionsMenu();
    }

    public boolean isInMultiWindowMode() {
        return getWaBaseActivity().isInMultiWindowMode();
    }

    public boolean isTaskRoot() {
        return getWaBaseActivity().isTaskRoot();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A03.A1b(configuration);
    }

    public void setActivityPerfAsserts(boolean z) {
        getWaBaseActivity();
    }

    public void setContentView(int i) {
        if (i != getCurrentLayout() && this.A06.A0F()) {
            getWaBaseActivity().setContentView(i);
        }
    }

    public void setConversationDelegate(C113245l7 r1) {
        this.A03 = r1;
    }

    public void setSavedStateRegistryOwner(C17310vJ r1) {
        this.A01 = r1;
    }

    public void setSelectedMessages(AnonymousClass5QO r1) {
        super.setSelectedMessages(r1);
    }

    public void setSelectionActionMode(AnonymousClass0R2 r1) {
        super.setSelectionActionMode(r1);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getWaBaseActivity().setSupportActionBar(toolbar);
    }

    public void setViewModelStoreOwner(C15940sD r1) {
        this.A00 = r1;
    }

    public void startActivity(Intent intent) {
        getWaBaseActivity().startActivity(intent);
    }

    public void startActivityForResult(Intent intent, int i) {
        getWaBaseActivity().startActivityForResult(intent, i);
    }

    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        getWaBaseActivity().unregisterReceiver(broadcastReceiver);
    }

    public int getMarkerId() {
        return 703926750;
    }

    public String getString(int i, Object... objArr) {
        return getWaBaseActivity().getString(i, objArr);
    }
}

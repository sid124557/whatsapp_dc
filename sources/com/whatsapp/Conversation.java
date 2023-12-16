package com.whatsapp;

import X.AnonymousClass001;
import X.AnonymousClass0R2;
import X.AnonymousClass1VX;
import X.AnonymousClass29x;
import X.AnonymousClass2z0;
import X.AnonymousClass39W;
import X.AnonymousClass3DZ;
import X.AnonymousClass3ZF;
import X.AnonymousClass3ZH;
import X.AnonymousClass490;
import X.AnonymousClass4SG;
import X.AnonymousClass4UA;
import X.AnonymousClass4VQ;
import X.AnonymousClass59D;
import X.AnonymousClass5BT;
import X.AnonymousClass5M4;
import X.AnonymousClass5NI;
import X.AnonymousClass5PZ;
import X.AnonymousClass5YI;
import X.AnonymousClass5ZC;
import X.AnonymousClass5ZT;
import X.AnonymousClass654;
import X.AnonymousClass66v;
import X.AnonymousClass676;
import X.AnonymousClass679;
import X.C100355Ap;
import X.C105365Uq;
import X.C106655Zv;
import X.C108785dY;
import X.C113245l7;
import X.C117615sD;
import X.C1223263y;
import X.C152097Xn;
import X.C152967aS;
import X.C154317cy;
import X.C15910sA;
import X.C166177yG;
import X.C172068Jm;
import X.C182178nz;
import X.C182328oE;
import X.C18280x3;
import X.C185008su;
import X.C187388x8;
import X.C30721mu;
import X.C389229y;
import X.C42242Ni;
import X.C46532bn;
import X.C47122ck;
import X.C50392i6;
import X.C54292oU;
import X.C58152un;
import X.C58422vE;
import X.C58932w3;
import X.C620633i;
import X.C624134x;
import X.C626936e;
import X.C64393Dh;
import X.C836049b;
import X.C86604Kt;
import X.C87574Tl;
import X.C87604Ty;
import X.C88834as;
import X.C93054nn;
import X.C93234oB;
import X.C93314oJ;
import X.C93654ox;
import X.C95814uZ;
import android.app.Dialog;
import android.app.assist.AssistContent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.android.di.BaseEntryPoint;
import com.whatsapp.conversation.ConversationListView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.picker.search.PickerSearchDialogFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Conversation extends C93054nn implements AnonymousClass676, AnonymousClass490, C182178nz, C836049b, C187388x8, C1223263y {
    public AnonymousClass5M4 A00;
    public BaseEntryPoint A01;
    public C113245l7 A02;
    public C93654ox A03;
    public List A04 = AnonymousClass001.A0s();

    public Intent Bih(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, boolean z) {
        return C154317cy.A01(broadcastReceiver, this, intentFilter, true);
    }

    public void onCreate(Bundle bundle) {
        this.A06 = false;
        if (this.A02 == null) {
            C113245l7 r0 = new C113245l7();
            ((C88834as) ((AnonymousClass3DZ) AnonymousClass29x.A00(AnonymousClass3DZ.class, this))).ADi(r0);
            this.A02 = r0;
            r0.A2z = this;
            List list = this.A04;
            if (list != null && 0 < list.size()) {
                list.get(0);
                throw AnonymousClass001.A0g("onCreate");
            }
        }
        this.A02.A1d(bundle);
        this.A03 = this.A00.A00(this.A02);
    }

    public C47122ck A5u() {
        BaseEntryPoint baseEntryPoint = this.A01;
        if (baseEntryPoint == null || baseEntryPoint.Avy() == null || !this.A01.Avy().A0X(5233)) {
            C47122ck A5u = super.A5u();
            A5u.A02 = true;
            A5u.A05 = true;
            return A5u;
        }
        C47122ck A5u2 = super.A5u();
        A5u2.A02 = true;
        A5u2.A05 = true;
        A5u2.A04 = true;
        return A5u2;
    }

    public void A5w() {
        this.A02.A0l();
    }

    public void A65() {
        Log.d("Conversation/onActivityCreateAsync");
        this.A02.A0h();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A66() {
        /*
            r5 = this;
            java.lang.String r0 = "Conversation/onActivityStartAsync"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.5l7 r4 = r5.A02
            X.4uZ r1 = r4.A4J
            boolean r0 = r1 instanceof X.AnonymousClass1fI
            if (r0 == 0) goto L_0x004b
            java.lang.String r3 = "ConversationBroadcastList"
        L_0x000f:
            X.3Wi r2 = r4.A1Z
            r1 = 32
            X.3bv r0 = new X.3bv
            r0.<init>(r1, r3, r4)
            r2.A0S(r0)
        L_0x001b:
            X.4uZ r3 = r4.A4J
            boolean r2 = r3 instanceof X.C95804uY
            X.30V r1 = r4.A5N
            r0 = 4
            if (r2 == 0) goto L_0x0026
            r0 = 26
        L_0x0026:
            r1.A03(r3, r0)
            X.4fR r1 = r4.A2Z
            boolean r0 = r1 instanceof X.C92144mA
            if (r0 == 0) goto L_0x0036
            X.4mA r1 = (X.C92144mA) r1
            if (r1 == 0) goto L_0x0036
            r1.A0D()
        L_0x0036:
            boolean r0 = r4.A2Y()
            if (r0 == 0) goto L_0x0047
            X.5KY r0 = X.C113245l7.A0B(r4)
            X.2rv r1 = r0.A03
            X.4uZ r0 = r4.A4J
            r1.A01(r0)
        L_0x0047:
            super.A66()
            return
        L_0x004b:
            boolean r0 = X.C627336j.A0K(r1)
            if (r0 == 0) goto L_0x0054
            java.lang.String r3 = "ConversationGroupChat"
            goto L_0x000f
        L_0x0054:
            boolean r0 = r1 instanceof X.C95804uY
            if (r0 == 0) goto L_0x001b
            java.lang.String r3 = "ConversationNewsletter"
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.A66():void");
    }

    public boolean A6B() {
        return true;
    }

    public boolean A6C() {
        return true;
    }

    public void A6O(int i) {
        C113245l7 r1 = this.A02;
        C87574Tl r0 = r1.A1q;
        if (r0 != null) {
            r0.A00.A00();
        }
        C87604Ty r02 = r1.A1w;
        if (r02 != null) {
            r02.A0E();
        }
    }

    public boolean A6z() {
        return true;
    }

    public void Awo() {
        this.A02.A0b();
    }

    public void Awp(AnonymousClass3ZH r3, C95814uZ r4) {
        this.A02.A1s(r3, r4, false);
    }

    public void AxT() {
        this.A02.A2f.A0P = true;
    }

    public boolean Ayn(C30721mu r4, boolean z) {
        C113245l7 r2 = this.A02;
        return AnonymousClass5BT.A00(C113245l7.A0E(r2), C100355Ap.A00(C113245l7.A0A(r2), r4), r4, z);
    }

    public boolean Azg(C30721mu r2, int i, boolean z, boolean z2) {
        return this.A02.A2f(r2, i, z, z2);
    }

    public void B1h() {
        ConversationListView conversationListView = this.A02.A2f;
        if (conversationListView.A0K) {
            conversationListView.A0K = false;
            conversationListView.setTranscriptMode(0);
        }
    }

    public void B1j(AnonymousClass2z0 r2) {
        this.A00.A0K.A02(r2);
    }

    public AnonymousClass5ZC BCP() {
        return C58152un.A01;
    }

    public boolean BFK() {
        return AnonymousClass001.A1W(C113245l7.A0A(this.A02).getCount());
    }

    public boolean BFL() {
        return this.A02.A6P;
    }

    public boolean BFX() {
        return this.A02.A2Q();
    }

    public void BG8(C624134x r9, AnonymousClass2z0 r10, AnonymousClass5NI r11, String str, String str2, Bitmap[] bitmapArr, int i) {
        this.A02.A23(r9, r10, r11, str, str2, bitmapArr, i);
    }

    public boolean BH0() {
        return true;
    }

    public boolean BHx() {
        ConversationListView conversationListView = this.A02.A2f;
        if (conversationListView != null) {
            return conversationListView.A0B(0);
        }
        return false;
    }

    public boolean BId() {
        return this.A02.A37.A0F();
    }

    public boolean BIh() {
        AnonymousClass5ZT r0 = this.A02.A5q;
        if (r0 == null || !r0.A0U()) {
            return false;
        }
        return true;
    }

    public boolean BIv() {
        AccessibilityManager A0P;
        C113245l7 r2 = this.A02;
        if (r2.A6b || (A0P = r2.A2z.getSystemServices().A0P()) == null || !A0P.isTouchExplorationEnabled()) {
            return true;
        }
        return false;
    }

    public boolean BJ3() {
        return this.A02.A3n.A0j;
    }

    public void BJR(AnonymousClass3ZF r2, int i) {
        this.A02.A2B(r2);
    }

    public /* bridge */ /* synthetic */ void BJZ(Object obj) {
        this.A03.B2s((AnonymousClass654) null, Collections.singleton(obj), 1);
    }

    public void BKy() {
        this.A02.A0g();
    }

    public void BMB(long j, boolean z) {
        this.A02.A1Z(j, false, z);
    }

    public void BMl() {
        C113245l7 r2 = this.A02;
        r2.A1t(r2.A3n, false, false);
    }

    public boolean BPr(C95814uZ r2, int i) {
        return this.A02.A2d(r2, i);
    }

    public void BQF(C42242Ni r2, C624134x r3, int i, long j) {
        this.A02.A1p(r2, r3, i);
    }

    public void BQG(long j, boolean z) {
        this.A02.A2H(z);
    }

    public void BQP(long j, boolean z) {
        this.A02.A1Z(j, true, z);
    }

    public void BQh() {
        this.A02.A0j();
    }

    public void BR5(DialogInterface dialogInterface, int i, int i2) {
        if (i != 14) {
            return;
        }
        if (-1 == i2) {
            C113245l7 r2 = this.A02;
            r2.A5i.BkM(C117615sD.A00(r2, 12));
            return;
        }
        dialogInterface.dismiss();
    }

    public void BRp(C106655Zv r3) {
        this.A02.A70.BRo(r3.A00);
    }

    public void BT5(UserJid userJid, int i) {
        AnonymousClass4UA r2 = this.A02.A3D;
        r2.A0G(r2.A01, AnonymousClass59D.LOADING_FAILED);
    }

    public void BT6(UserJid userJid, boolean z, boolean z2) {
        this.A02.A1y(userJid);
    }

    public void BU1() {
    }

    public void BU2() {
        C113245l7 r2 = this.A02;
        C113245l7.A0G(r2).BkM(C117615sD.A00(r2, 24));
    }

    public void BU5(C166177yG r2) {
        this.A02.A1u(r2);
    }

    public void BY7(PickerSearchDialogFragment pickerSearchDialogFragment) {
        C113245l7 r1 = this.A02;
        r1.A4o.A02(pickerSearchDialogFragment);
        if (r1.A2Q()) {
            AnonymousClass5ZT r0 = r1.A5q;
            C626936e.A06(r0);
            r0.A05();
        }
    }

    public void BZd() {
        this.A02.A2a.A01();
    }

    public boolean BbB() {
        C113245l7 r3 = this.A02;
        return r3.A2q.A0E(C18280x3.A00(((C172068Jm) r3.A5a).A01.A0Y(C58422vE.A01, 2889) ? 1 : 0));
    }

    public void BcG(C30721mu r3) {
        C93314oJ A002 = this.A02.A2f.A00(r3.A1J);
        if (A002 instanceof C93234oB) {
            ((C93234oB) A002).A0D.BcG(r3);
        }
    }

    public void Bdx() {
        this.A02.A2a.A00();
    }

    public void BeV(C30721mu r3, String str) {
        C93314oJ A002 = this.A02.A2f.A00(r3.A1J);
        if (A002 instanceof C93234oB) {
            ((C93234oB) A002).A0D.BeV(r3, str);
        }
    }

    public void BfD() {
        C113245l7 r3 = this.A02;
        r3.A1t(r3.A3n, true, false);
    }

    public void BgN(C182328oE r2, AnonymousClass39W r3) {
        this.A02.A1m(r2, r3);
    }

    public void BhP(AnonymousClass3ZH r2, boolean z, boolean z2) {
        this.A02.A1t(r2, z, z2);
    }

    public void BiX() {
        this.A02.A1K();
    }

    public void Bjd() {
        AnonymousClass4VQ r0 = this.A02.A3B;
        r0.A0K();
        r0.A0J();
    }

    public void Bjx() {
        C113245l7 r2 = this.A02;
        r2.A3B.A0S((C624134x) null);
        r2.A0t();
    }

    public void Bk1(C30721mu r7, long j) {
        C113245l7 r5 = this.A02;
        if (r5.A07 == r7.A1L) {
            r5.A2f.removeCallbacks(r5.A6B);
            r5.A2f.postDelayed(r5.A6B, j);
        }
    }

    public void Bkr(C624134x r2) {
        this.A02.A20(r2);
    }

    public void Bks(ViewGroup viewGroup, C624134x r3) {
        this.A02.A1i(viewGroup, r3);
    }

    public void BlH(C624134x r2, C46532bn r3) {
        this.A02.A24(r2, r3);
    }

    public void BlU(C95814uZ r10, String str, String str2, String str3, String str4, long j) {
        C113245l7 r0 = this.A02;
        C113245l7.A08(r0).A0J(C86604Kt.A0a(r0.A3n), str, "address_message", str3, (String) null, j);
    }

    public void BlV(C624134x r2, String str, String str2, String str3) {
        this.A02.A27(r2, str2, str3);
    }

    public void BlW(C624134x r2, C58932w3 r3) {
        this.A02.A26(r2, r3);
    }

    public void BlY(C624134x r2, C108785dY r3) {
        this.A02.A25(r2, r3);
    }

    public void Bom(DialogFragment dialogFragment) {
        this.A02.A2z.Boo(dialogFragment);
    }

    public void BpG(C50392i6 r2) {
        this.A02.A1q(r2);
    }

    public void Bpa(AnonymousClass3ZH r2) {
        this.A02.A1r(r2);
    }

    public void Bpr(C50392i6 r4, int i) {
        C113245l7 r0 = this.A02;
        r0.A2C.Bpq(C113245l7.A09(r0), r4, 9);
    }

    public void Bq8(C95814uZ r2) {
        this.A02.A1w(r2);
    }

    public Object BqK(Class cls) {
        return this.A00.B5x(cls);
    }

    public void Brj(AnonymousClass3ZF r2) {
        this.A02.A2C(r2);
    }

    public void Bs6(C30721mu r2, long j, boolean z) {
        this.A02.A2A(r2, j, z);
    }

    public void attachBaseContext(Context context) {
        if (context != null) {
            this.A01 = (BaseEntryPoint) C389229y.A02(context, BaseEntryPoint.class);
        }
        super.attachBaseContext(context);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.A02.A2c(motionEvent);
    }

    public AnonymousClass1VX getAbProps() {
        return this.A0D;
    }

    public C152967aS getCatalogLoadSession() {
        return this.A02.A0X();
    }

    public C95814uZ getChatJid() {
        return this.A02.A4J;
    }

    public AnonymousClass3ZH getContact() {
        return this.A02.A3n;
    }

    public C105365Uq getContactPhotosLoader() {
        AnonymousClass676 r0 = this.A02.A2z;
        return r0.getConversationRowInflater().A01(r0.getActivity());
    }

    public AnonymousClass5PZ getConversationBanners() {
        return this.A02.A2b;
    }

    public AnonymousClass679 getConversationRowCustomizer() {
        return this.A02.A0Z();
    }

    public C64393Dh getFMessageIO() {
        return this.A04;
    }

    public AnonymousClass66v getInlineVideoPlaybackHandler() {
        return this.A02.A5l;
    }

    public C15910sA getLifecycleOwner() {
        return this;
    }

    public C624134x getQuotedMessage() {
        return this.A02.A3B.A0G;
    }

    public C54292oU getWAContext() {
        return this.A00.A0U;
    }

    public void onBackPressed() {
        this.A02.A0i();
    }

    public Dialog onCreateDialog(int i) {
        return this.A02.A0W(i);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C113245l7 r2 = this.A02;
        for (C185008su BQQ : r2.A7M) {
            BQQ.BQQ(menu);
        }
        return r2.A2z.BdY(menu);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.A02.A2a(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.A02.A2b(i, keyEvent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        for (C185008su BXQ : this.A02.A7M) {
            if (BXQ.BXQ(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        C113245l7 r2 = this.A02;
        for (C185008su BYj : r2.A7M) {
            BYj.BYj(menu);
        }
        return r2.A2z.Bdc(menu);
    }

    public void onResume() {
        this.A02.A0o();
    }

    public boolean onSearchRequested() {
        return this.A02.A2R();
    }

    public void onStart() {
        this.A02.A0p();
    }

    public void onWindowFocusChanged(boolean z) {
        this.A02.A2I(z);
    }

    public void scrollBy(int i, int i2) {
        AnonymousClass4VQ r0 = this.A02.A3B;
        r0.A19.A0H(new C152097Xn(i));
    }

    public void setFollowPlayingVoiceMemo(boolean z) {
        this.A02.A6O = true;
    }

    public void setVoiceNoteDraftQuotedPreview(View view) {
        this.A02.A0R = view;
    }

    public /* synthetic */ void AxU(int i) {
    }

    public Point B5y() {
        return AnonymousClass5YI.A05(C620633i.A01(this));
    }

    public void BWL(ArrayList arrayList) {
    }

    public void BZO(int i) {
        super.BZO(i);
        this.A02.A1P(i);
    }

    public void BdW(Bundle bundle) {
        super.onCreate(bundle);
    }

    public boolean BdY(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    public boolean Bda(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public boolean Bdb(int i, KeyEvent keyEvent) {
        return super.onKeyUp(i, keyEvent);
    }

    public boolean Bdc(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    public void Bdh(AnonymousClass0R2 r3) {
        super.Bdh(r3);
        AnonymousClass4SG.A3x(this.A02.A2O, false);
    }

    public void Bdi(AnonymousClass0R2 r3) {
        super.Bdi(r3);
        AnonymousClass4SG.A3x(this.A02.A2O, true);
    }

    public boolean BqJ(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.A02.A1Y(i, i2, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A02.A1b(configuration);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A02.A0k();
        this.A04.clear();
    }

    public void onPause() {
        super.onPause();
        this.A02.A0m();
    }

    public void onProvideAssistContent(AssistContent assistContent) {
        super.onProvideAssistContent(assistContent);
        this.A02.A1a(assistContent);
    }

    public void onRestart() {
        super.onRestart();
        this.A02.A0n();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.A02.A1e(bundle);
    }

    public void onStop() {
        super.onStop();
        this.A02.A0q();
    }

    public int A5t() {
        return 703926750;
    }

    public void BEg() {
        finish();
    }

    public void BdV() {
        super.onBackPressed();
    }

    public void Bde() {
        super.onResume();
    }

    public void Bdf() {
        super.onStart();
    }
}

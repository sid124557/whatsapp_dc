package com.whatsapp.contact.picker;

import X.AnonymousClass000;
import X.AnonymousClass002;
import X.AnonymousClass08M;
import X.AnonymousClass0x9;
import X.AnonymousClass1PC;
import X.AnonymousClass1VX;
import X.AnonymousClass2FW;
import X.AnonymousClass2ML;
import X.AnonymousClass30T;
import X.AnonymousClass3DP;
import X.AnonymousClass3ZH;
import X.AnonymousClass49P;
import X.AnonymousClass4FV;
import X.AnonymousClass54P;
import X.AnonymousClass5L3;
import X.AnonymousClass5UY;
import X.AnonymousClass66R;
import X.AnonymousClass7HS;
import X.AnonymousClass92D;
import X.AnonymousClass9U4;
import X.C000500m;
import X.C08310eF;
import X.C1001059l;
import X.C111355hx;
import X.C117705sM;
import X.C119395wu;
import X.C154517dI;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18320x8;
import X.C183538qC;
import X.C186568vZ;
import X.C380625j;
import X.C55682qk;
import X.C56072rN;
import X.C56652sL;
import X.C56892sj;
import X.C56962sq;
import X.C59972xn;
import X.C60122y2;
import X.C619532x;
import X.C620533h;
import X.C620733j;
import X.C64773Ex;
import X.C71643cR;
import X.C86624Kv;
import X.C86654Ky;
import X.C95814uZ;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.contact.picker.viewmodels.CallSuggestionsViewModel;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.HashSet;
import java.util.Map;

public final class VoipContactPickerFragment extends Hilt_VoipContactPickerFragment {
    public C60122y2 A00;
    public AnonymousClass49P A01;
    public C619532x A02;
    public CallSuggestionsViewModel A03;
    public C380625j A04;
    public AnonymousClass5UY A05;
    public final AnonymousClass66R A06 = C154517dI.A01(new C119395wu(this));

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        if (this.A1x.A0N(4833) >= 1) {
            this.A03 = (CallSuggestionsViewModel) C18290x4.A0O(this).A01(CallSuggestionsViewModel.class);
        }
        if (C18270x1.A1V(this.A06)) {
            AnonymousClass5UY r2 = new AnonymousClass5UY(C18280x3.A0E(view, R.id.add_to_call_button_stub));
            r2.A09(new AnonymousClass92D(this, 5));
            this.A05 = r2;
        }
    }

    public void A1n(View view, AnonymousClass3ZH r9) {
        C162457s7.A0J(view, 1);
        super.A1n(view, r9);
        A2O();
        Jid A032 = AnonymousClass3ZH.A03(r9);
        boolean A1U = C18320x8.A1U((CharSequence) this.A3h.A07());
        C619532x A2N = A2N();
        A2N.A02.execute(new C71643cR(A032, A2N, this.A00, 11, A1U));
    }

    public void A1q(AnonymousClass7HS r6) {
        Long l;
        C162457s7.A0J(r6, 0);
        super.A1q(r6);
        CallSuggestionsViewModel callSuggestionsViewModel = this.A03;
        Long l2 = null;
        if (callSuggestionsViewModel != null) {
            l = Long.valueOf(callSuggestionsViewModel.A00);
        } else {
            l = null;
        }
        Long A0m = AnonymousClass0x9.A0m(this.A38.size());
        if (this.A03 != null) {
            l2 = A0m;
        }
        C619532x A2N = A2N();
        C86654Ky.A1O(A2N.A02, A2N, l2, l, 43);
    }

    public void A1r(AnonymousClass5L3 r2) {
        C162457s7.A0J(r2, 0);
        super.A1r(r2);
        this.A00 = r2.A00;
    }

    public void A1u(UserJid userJid) {
        C162457s7.A0J(userJid, 0);
        C619532x A2N = A2N();
        boolean A1U = C18320x8.A1U((CharSequence) this.A3h.A07());
        A2N.A02.execute(new C71643cR(A2N, userJid, this.A00, 12, A1U));
        super.A1u(userJid);
    }

    public void A1v(UserJid userJid) {
        C162457s7.A0J(userJid, 0);
        super.A1v(userJid);
        boolean A1U = C18320x8.A1U((CharSequence) this.A3h.A07());
        C619532x A2N = A2N();
        A2N.A02.execute(new C71643cR(userJid, A2N, this.A00, 11, A1U));
    }

    public AnonymousClass54P A1O() {
        C60122y2 r7;
        AnonymousClass08M r0;
        HashSet hashSet = this.A3k;
        C162457s7.A0C(hashSet);
        boolean z = this.A3Q;
        boolean z2 = this.A3U;
        AnonymousClass1VX r19 = this.A1x;
        C162457s7.A0C(r19);
        C55682qk r18 = this.A0W;
        C162457s7.A0C(r18);
        AnonymousClass4FV r17 = this.A1z;
        C162457s7.A0C(r17);
        C64773Ex r15 = this.A0w;
        C162457s7.A0C(r15);
        C56072rN r14 = this.A2Y;
        C162457s7.A0C(r14);
        AnonymousClass9U4 r13 = this.A2H;
        C162457s7.A0C(r13);
        C56962sq r11 = this.A0k;
        C162457s7.A0C(r11);
        AnonymousClass3DP r10 = this.A0j;
        C162457s7.A0C(r10);
        C183538qC r9 = this.A2l;
        C162457s7.A0C(r9);
        AnonymousClass30T r8 = this.A1h;
        C162457s7.A0C(r8);
        CallSuggestionsViewModel callSuggestionsViewModel = this.A03;
        if (callSuggestionsViewModel == null || (r0 = callSuggestionsViewModel.A03) == null) {
            r7 = null;
        } else {
            r7 = (C60122y2) r0.A07();
        }
        AnonymousClass2ML r6 = this.A2Z;
        C162457s7.A0C(r6);
        C186568vZ r5 = this.A2J;
        C162457s7.A0C(r5);
        C56892sj r4 = this.A1i;
        C162457s7.A0C(r4);
        AnonymousClass2FW r3 = this.A10;
        C162457s7.A0C(r3);
        C59972xn r2 = this.A1n;
        C162457s7.A0C(r2);
        C620533h r1 = this.A1l;
        C162457s7.A0C(r1);
        C56652sL r02 = this.A1k;
        C162457s7.A0C(r02);
        HashSet hashSet2 = hashSet;
        boolean z3 = z;
        boolean z4 = z2;
        AnonymousClass1VX r29 = r19;
        AnonymousClass4FV r30 = r17;
        return new AnonymousClass1PC(r18, r10, r11, r7, r15, r3, this, r8, r4, r02, r1, r2, r29, r30, (C95814uZ) null, r13, r5, r14, r6, r9, hashSet2, false, false, false, false, false, false, z3, z4, false, false, false, false, false, false, false);
    }

    public final C619532x A2N() {
        C619532x r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("searchUserJourneyLogger");
    }

    public final void A2O() {
        int i;
        long size;
        Object[] A0M;
        if (C18270x1.A1V(this.A06)) {
            Map map = this.A3n;
            boolean isEmpty = map.isEmpty();
            C620733j r5 = this.A1V;
            if (isEmpty) {
                i = R.plurals.f9nameremoved;
                size = (long) this.A31.size();
                A0M = new Object[1];
                AnonymousClass000.A1P(A0M, this.A31.size(), 0);
            } else {
                i = R.plurals.f9nameremoved;
                size = (long) map.size();
                A0M = AnonymousClass002.A0M();
                AnonymousClass000.A1P(A0M, map.size(), 0);
                AnonymousClass000.A1P(A0M, this.A02, 1);
            }
            C111355hx.A00(this).A0I(r5.A0L(A0M, i, size));
        }
    }

    public void A0a() {
        super.A0a();
        C619532x A2N = A2N();
        C86624Kv.A1K(A2N.A02, A2N, 20);
        this.A05 = null;
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        C619532x A2N = A2N();
        C86624Kv.A1K(A2N.A02, A2N, 21);
    }

    public LayoutInflater A1E(Bundle bundle) {
        LayoutInflater A1E = super.A1E(bundle);
        C162457s7.A0D(A1E);
        if (this.A1x.A0N(4833) < 1) {
            return A1E;
        }
        C000500m r2 = new C000500m(A1D(), (int) R.style.f12nameremoved);
        Resources.Theme theme = r2.getTheme();
        C162457s7.A0D(theme);
        C162457s7.A0C(this.A1x);
        C162457s7.A0C(this.A2b);
        if (C1001059l.A03) {
            theme.applyStyle(R.style.f12nameremoved, true);
        }
        LayoutInflater cloneInContext = A1E.cloneInContext(r2);
        C162457s7.A0D(cloneInContext);
        return cloneInContext;
    }

    public void A1V() {
        int i;
        super.A1V();
        AnonymousClass66R r3 = this.A06;
        if (C18270x1.A1V(r3)) {
            this.A3f = true;
            this.A02 = A1K().getInt("custom_multiselect_limit", 32);
            this.A03 = R.plurals.f9nameremoved;
        }
        Resources A09 = C08310eF.A09(this);
        if (C18270x1.A1V(r3)) {
            i = this.A02;
        } else {
            i = 1;
        }
        C111355hx.A00(this).A0J(A09.getQuantityText(R.plurals.f9nameremoved, i));
    }

    public void A1w(String str) {
        int i;
        C619532x A2N = A2N();
        if (str != null) {
            i = str.length();
        } else {
            i = 0;
        }
        A2N.A02.execute(new C117705sM((Object) A2N, i, 23));
        super.A1w(str);
    }

    public void A20(boolean z) {
        super.A20(z);
        if (z) {
            C619532x A2N = A2N();
            C86624Kv.A1K(A2N.A02, A2N, 19);
        }
    }
}

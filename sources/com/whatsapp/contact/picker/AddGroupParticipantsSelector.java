package com.whatsapp.contact.picker;

import X.AnonymousClass0R8;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x9;
import X.AnonymousClass2FY;
import X.AnonymousClass31Y;
import X.AnonymousClass3ZH;
import X.AnonymousClass4AQ;
import X.AnonymousClass4EF;
import X.AnonymousClass4FV;
import X.AnonymousClass4SG;
import X.AnonymousClass58H;
import X.AnonymousClass5QN;
import X.AnonymousClass5R0;
import X.AnonymousClass5S6;
import X.AnonymousClass5YB;
import X.AnonymousClass66R;
import X.AnonymousClass68W;
import X.AnonymousClass697;
import X.AnonymousClass7HU;
import X.AnonymousClass8OQ;
import X.C106715a2;
import X.C107295b4;
import X.C107695bk;
import X.C119365wr;
import X.C119375ws;
import X.C119385wt;
import X.C129526aS;
import X.C140046t4;
import X.C154517dI;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C18310x6;
import X.C18320x8;
import X.C27981fH;
import X.C27991fJ;
import X.C28011fL;
import X.C382226f;
import X.C46412ba;
import X.C50932j0;
import X.C51472js;
import X.C56662sM;
import X.C56892sj;
import X.C56942so;
import X.C56982ss;
import X.C620833k;
import X.C64333Db;
import X.C66493Lq;
import X.C69903Yy;
import X.C69973Zj;
import X.C70203a7;
import X.C71593cM;
import X.C73723fy;
import X.C77503tV;
import X.C80273xy;
import X.C80283xz;
import X.C80573yS;
import X.C81373zm;
import X.C84384Cd;
import X.C86624Kv;
import X.C86644Kx;
import X.C86664Kz;
import X.C88834as;
import X.C89634eX;
import X.C91974lt;
import X.C95814uZ;
import X.C998258i;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.wds.components.search.WDSSearchBar;
import com.whatsapp.wds.components.search.WDSSearchView;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class AddGroupParticipantsSelector extends C89634eX implements AnonymousClass4EF {
    public static final AnonymousClass5S6 A0S = new AnonymousClass5S6(new AnonymousClass7HU(C998258i.UNKNOWN, (String) null), (C27981fH) null, false);
    public View A00;
    public C56942so A01;
    public C84384Cd A02;
    public C51472js A03;
    public AnonymousClass2FY A04;
    public C56982ss A05;
    public C46412ba A06;
    public C56892sj A07;
    public C56662sM A08;
    public AnonymousClass4FV A09;
    public C66493Lq A0A;
    public C50932j0 A0B;
    public AnonymousClass5R0 A0C;
    public C106715a2 A0D;
    public Map A0E;
    public boolean A0F;
    public final AnonymousClass4AQ A0G;
    public final Map A0H;
    public final Set A0I;
    public final AnonymousClass66R A0J;
    public final AnonymousClass66R A0K;
    public final AnonymousClass66R A0L;
    public final AnonymousClass66R A0M;
    public final AnonymousClass66R A0N;
    public final AnonymousClass66R A0O;
    public final AnonymousClass66R A0P;
    public final AnonymousClass66R A0Q;
    public final AnonymousClass66R A0R;

    public void A7N(AnonymousClass5QN r13, AnonymousClass3ZH r14) {
        boolean A0U;
        int i;
        AnonymousClass5QN r10 = r13;
        C162457s7.A0J(r13, 0);
        AnonymousClass3ZH r9 = r14;
        super.A7N(r13, r14);
        if (AnonymousClass4SG.A42(this)) {
            C69903Yy r7 = new C69903Yy();
            AnonymousClass7HU r1 = AnonymousClass4SG.A2h(this, r14).A00;
            r7.element = r1;
            if (C162457s7.A0P(r1, A0S.A00)) {
                this.A04.BkM(new C71593cM((Object) r7, (Object) this, (Object) r9, (Object) r10, 32));
            } else {
                A7d(r13, (AnonymousClass7HU) r7.element, r14);
            }
        }
        AnonymousClass66R r72 = this.A0Q;
        if (!C18270x1.A1V(r72) || A7e()) {
            A0U = C73723fy.A0U(this.A0I, AnonymousClass3ZH.A03(r14));
        } else {
            C27981fH r12 = AnonymousClass4SG.A2h(this, r14).A01;
            A0U = false;
            if (r12 != null && this.A0I.contains(r12)) {
                A0U = true;
            }
        }
        boolean z = AnonymousClass4SG.A2h(this, r14).A02;
        View view = r13.A00;
        C107295b4.A01(view);
        if (A0U || z) {
            boolean A1V = C18270x1.A1V(r72);
            TextEmojiLabel textEmojiLabel = r13.A02;
            if (A1V) {
                i = R.string.f11nameremoved;
            } else {
                i = R.string.f11nameremoved;
            }
            if (!A0U) {
                i = R.string.f11nameremoved;
            }
            textEmojiLabel.setText(i);
            r13.A01.setEnabled(false);
            textEmojiLabel.setTypeface((Typeface) null, 2);
            textEmojiLabel.setVisibility(0);
            AnonymousClass5YB.A03(r13.A03, AnonymousClass0Y8.A04(this, R.color.f5nameremoved));
            if (A0U) {
                view.setOnClickListener((View.OnClickListener) null);
                view.setClickable(false);
                view.setFocusable(true);
                return;
            }
            return;
        }
        r13.A02.setTypeface((Typeface) null, 0);
        AnonymousClass5YB.A03(r13.A03, C18300x5.A03(this, R.attr.f3nameremoved, R.color.f5nameremoved));
    }

    public void A7V(List list) {
        if (A7e()) {
            boolean z = true;
            if (this.A00 == null) {
                AnonymousClass66R r4 = this.A0O;
                this.A00 = C86644Kx.A0H(r4);
                ViewGroup A0m = C86664Kz.A0m(this, R.id.search_no_matches_container);
                if (A0m != null) {
                    A0m.addView(C86644Kx.A0H(this.A0P));
                }
                this.A04.addFooterView(C86644Kx.A0H(r4), (Object) null, true);
            }
            String str = this.A0S;
            if (!(str == null || str.length() == 0)) {
                z = false;
            }
            if (z || !list.isEmpty()) {
                C86624Kv.A1T(this.A0O, 0);
                C86624Kv.A1T(this.A0P, 8);
            } else {
                C86624Kv.A1T(this.A0O, 8);
                C86624Kv.A1T(this.A0P, 0);
            }
        }
        super.A7V(list);
    }

    public void A7X(List list) {
        C162457s7.A0J(list, 0);
        String str = this.A0S;
        if (str != null && str.length() != 0 && list.isEmpty() && AnonymousClass4SG.A42(this)) {
            A7W(list);
        }
        super.A7X(list);
    }

    public final void A7d(AnonymousClass5QN r9, AnonymousClass7HU r10, AnonymousClass3ZH r11) {
        AnonymousClass7HU r3 = r10;
        AnonymousClass3ZH r4 = r11;
        if (r10.A00 == C998258i.PUSH_NAME) {
            r9.A02.A0K((List) null, this.A0D.A0F(r11, true).A01);
        }
        r9.A03.A07(r3, r4, this.A0T, 7, r11.A0W());
    }

    public void Ayk(AnonymousClass3ZH r3) {
        C162457s7.A0J(r3, 0);
        if (!C73723fy.A0U(this.A0I, AnonymousClass3ZH.A03(r3))) {
            super.Ayk(r3);
        }
    }

    public void A5r() {
        if (!this.A0F) {
            this.A0F = true;
            C88834as A2X = AnonymousClass4SG.A2X(this);
            C64333Db r1 = A2X.A4Z;
            AnonymousClass4SG.A3W(r1, this);
            C107695bk r3 = r1.A00;
            AnonymousClass4SG.A3Q(r1, r3, this, AnonymousClass4SG.A2t(r1, r3, this));
            AnonymousClass4SG.A3T(r1, r3, this);
            AnonymousClass4SG.A3M(A2X, r1, this, r1.A6O.get());
            this.A0D = C18280x3.A0Q(r3);
            this.A05 = C64333Db.A39(r1);
            this.A09 = C64333Db.A4H(r1);
            this.A08 = (C56662sM) r1.AaX.get();
            this.A0A = C64333Db.A5A(r1);
            this.A0E = AnonymousClass8OQ.of("com.whatsapp.community.DirectoryContactsLoader", r1.A00.AKC(), "com.whatsapp.contact.picker.DeviceContactsLoader", r1.A00.AKB(), "com.whatsapp.contact.picker.RecentlyAcceptedInviteContactsLoader", r1.A00.AKE(), "com.whatsapp.contact.picker.NonWaContactsLoader", r1.A00.AKD(), "com.whatsapp.contact.picker.DefaultContactsLoader", r1.A00.AKA());
            this.A01 = C64333Db.A1k(r1);
            this.A02 = r1.AiI();
            this.A04 = (AnonymousClass2FY) r3.A4h.get();
            this.A06 = (C46412ba) r1.AGk.get();
            this.A0C = A2X.ACU();
            this.A0B = C86664Kz.A1A(r1);
            this.A07 = C64333Db.A3G(r1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006b, code lost:
        if (A7e() != false) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A7U(java.util.ArrayList r9) {
        /*
            r8 = this;
            X.66R r0 = r8.A0N
            java.lang.Object r5 = r0.getValue()
            X.1fJ r5 = (X.C27991fJ) r5
            if (r5 == 0) goto L_0x009b
            X.66R r0 = r8.A0K
            java.lang.Object r4 = r0.getValue()
            X.2FZ r4 = (X.AnonymousClass2FZ) r4
            X.0ni r0 = X.AnonymousClass0IT.A00(r8)
            r3 = 5
            X.4Gl r2 = r0.B61()     // Catch:{ CancellationException -> 0x0028 }
            r1 = 0
            com.whatsapp.contact.picker.CompoundContactsLoader$loadContacts$3 r0 = new com.whatsapp.contact.picker.CompoundContactsLoader$loadContacts$3     // Catch:{ CancellationException -> 0x0028 }
            r0.<init>(r4, r5, r1, r3)     // Catch:{ CancellationException -> 0x0028 }
            java.lang.Object r1 = X.C380725l.A00(r2, r0)     // Catch:{ CancellationException -> 0x0028 }
            X.2js r1 = (X.C51472js) r1     // Catch:{ CancellationException -> 0x0028 }
            goto L_0x0035
        L_0x0028:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            java.util.Map r0 = X.C73813g7.A0A()
            X.2js r1 = new X.2js
            r1.<init>(r0)
        L_0x0035:
            r8.A03 = r1
            X.66R r0 = r1.A01
            java.lang.Object r0 = r0.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            r9.addAll(r0)
            java.util.Iterator r7 = r9.iterator()
        L_0x0046:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x009b
            X.3ZH r6 = X.C18310x6.A0R(r7)
            X.4uZ r5 = r6.A0H
            if (r5 == 0) goto L_0x0046
            X.5ZU r1 = r8.A0D
            r0 = 7
            X.7HU r4 = r1.A0B(r6, r0)
            X.C162457s7.A0D(r4)
            X.66R r0 = r8.A0Q
            boolean r0 = X.C18270x1.A1V(r0)
            if (r0 == 0) goto L_0x006d
            boolean r1 = r8.A7e()
            r0 = 1
            if (r1 == 0) goto L_0x006e
        L_0x006d:
            r0 = 0
        L_0x006e:
            r3 = 0
            if (r0 == 0) goto L_0x0083
            java.lang.Class<com.whatsapp.jid.PhoneUserJid> r0 = com.whatsapp.jid.PhoneUserJid.class
            com.whatsapp.jid.Jid r1 = r6.A0I(r0)
            com.whatsapp.jid.PhoneUserJid r1 = (com.whatsapp.jid.PhoneUserJid) r1
            if (r1 == 0) goto L_0x0083
            X.2sM r0 = r8.A08
            if (r0 == 0) goto L_0x0094
            X.1fH r3 = r0.A01(r1)
        L_0x0083:
            java.util.Map r2 = r8.A0H
            X.2sq r0 = r8.A08
            boolean r1 = X.C86604Kt.A1a(r0, r6)
            X.5S6 r0 = new X.5S6
            r0.<init>(r4, r3, r1)
            r2.put(r5, r0)
            goto L_0x0046
        L_0x0094:
            java.lang.String r0 = "jidMapRepository"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.AddGroupParticipantsSelector.A7U(java.util.ArrayList):void");
    }

    public void A7Z(List list) {
        String str = this.A0S;
        if (!(str == null || str.length() == 0 || !C18310x6.A1X(list))) {
            list.add(new C91974lt(C18290x4.A0l(this, R.string.f11nameremoved)));
        }
        super.A7Z(list);
        A7V(list);
    }

    public final void A7c(TextEmojiLabel textEmojiLabel, C27991fJ r9) {
        int i;
        if (AnonymousClass31Y.A02(this.A0B.A0A(r9))) {
            boolean A7e = A7e();
            i = R.string.f11nameremoved;
            if (A7e) {
                i = R.string.f11nameremoved;
            }
        } else {
            i = R.string.f11nameremoved;
        }
        String string = getString(i);
        C162457s7.A0H(string);
        C106715a2 r1 = this.A0D;
        if (r1 != null) {
            textEmojiLabel.setText(r1.A06(textEmojiLabel.getContext(), new C70203a7(this, 20, r9), string, "edit_group_settings", C18290x4.A00(textEmojiLabel.getContext())));
            return;
        }
        throw C18270x1.A0S("linkifier");
    }

    public final boolean A7e() {
        GroupJid groupJid = (GroupJid) this.A0N.getValue();
        if (groupJid == null) {
            return false;
        }
        C56892sj r0 = this.A07;
        if (r0 != null) {
            return C18310x6.A1W(r0.A0D(groupJid) ? 1 : 0);
        }
        throw C18270x1.A0S("groupParticipantsManager");
    }

    public void BRm(int i, String str) {
        C95814uZ r1 = (C95814uZ) this.A0N.getValue();
        if (r1 != null) {
            AnonymousClass5R0 r0 = this.A0C;
            if (r0 != null) {
                r0.A01(this, r1, str);
                return;
            }
            throw C18270x1.A0S("groupInviteClickUtils");
        }
    }

    public AddGroupParticipantsSelector(int i) {
        this.A0F = false;
        AnonymousClass68W.A00(this, 33);
    }

    public void A7K(int i) {
    }

    public void BNi(String str) {
    }

    public /* synthetic */ void BOP(int i) {
    }

    public void onCreate(Bundle bundle) {
        Map map;
        super.onCreate(bundle);
        C28011fL r1 = (C28011fL) this.A0N.getValue();
        if (r1 != null) {
            C46412ba r0 = this.A06;
            if (r0 != null) {
                C620833k A002 = r0.A00(r1);
                if (A002 != null) {
                    if (!C18270x1.A1V(this.A0Q) || A7e()) {
                        map = A002.A09;
                    } else {
                        map = A002.A08;
                    }
                    C129526aS copyOf = C129526aS.copyOf((Collection) map.keySet());
                    C162457s7.A0H(copyOf);
                    this.A0I.addAll(copyOf);
                }
                C50932j0 r12 = this.A0B;
                if (r12 != null) {
                    r12.A00(this.A0G);
                } else {
                    throw C18270x1.A0S("groupDataChangeListeners");
                }
            } else {
                throw C18270x1.A0S("groupParticipantCache");
            }
        }
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0B(A75());
        }
        Bs7();
        WDSSearchBar wDSSearchBar = this.A0R;
        if (wDSSearchBar != null && AnonymousClass4SG.A42(this)) {
            WDSSearchView wDSSearchView = wDSSearchBar.A07;
            wDSSearchView.setTrailingButtonIcon(C140046t4.A00);
            wDSSearchView.setHint((int) R.string.f11nameremoved);
        }
        if (this.A0D.A0X(6356)) {
            this.A04.BkM(new C69973Zj(this, 11));
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C50932j0 r1 = this.A0B;
        if (r1 != null) {
            r1.A01(this.A0G);
            return;
        }
        throw C18270x1.A0S("groupDataChangeListeners");
    }

    public AddGroupParticipantsSelector() {
        this(0);
        this.A0I = AnonymousClass0x9.A17();
        this.A0H = C18320x8.A0r();
        this.A0L = C154517dI.A01(new C119365wr(this));
        AnonymousClass58H r2 = AnonymousClass58H.NONE;
        this.A0N = C154517dI.A00(r2, new C80273xy(this));
        this.A0J = C154517dI.A00(r2, new C80573yS(this, "community_name"));
        this.A0Q = C154517dI.A00(r2, new C81373zm(this));
        this.A0M = C382226f.A00(this, "entry_point", 6);
        this.A0R = C154517dI.A00(r2, new C80283xz(this));
        this.A0K = C154517dI.A01(new C77503tV(this));
        this.A0P = C154517dI.A01(new C119385wt(this));
        this.A0O = C154517dI.A01(new C119375ws(this));
        this.A0G = new AnonymousClass697(this, 4);
    }
}

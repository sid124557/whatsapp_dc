package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.chatlock.dialogs.ChatLockQuickAddHelperBottomSheet;
import com.whatsapp.chatlock.dialogs.ChatsAreLockedDialogFragment;
import com.whatsapp.chatlock.dialogs.ClearLockedChatsDialogFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.5aW  reason: invalid class name and case insensitive filesystem */
public final class C106995aW {
    public boolean A00;
    public boolean A01;
    public final C54292oU A02;
    public final C56982ss A03;
    public final AnonymousClass1VX A04;
    public final C60152y5 A05;
    public final AnonymousClass4FS A06;
    public final C183538qC A07;
    public final C183538qC A08;
    public final C183538qC A09;
    public final C183538qC A0A;
    public final C183538qC A0B;
    public final C183538qC A0C;
    public final C183538qC A0D;
    public final C183538qC A0E;
    public final C183538qC A0F;
    public final AnonymousClass4C1 A0G;
    public final AnonymousClass4C1 A0H;
    public final AnonymousClass66R A0I = C154517dI.A00(AnonymousClass58H.SYNCHRONIZED, new C119195wa(this));
    public final boolean A0J;
    public final boolean A0K;

    public static final void A01(Bundle bundle, C89644eZ r2, AnonymousClass5AS r3, C1225064q r4, C106995aW r5, int i) {
        C162457s7.A0J(bundle, 6);
        if (bundle.getBoolean("UnarchiveForQuickLockDialogFragment_result_key")) {
            C86624Kv.A1M(r5.A06, r5, r3, 14);
            r5.A08(r2, r3, r4, i);
            return;
        }
        r4.BaI(new AnonymousClass5S5(AnonymousClass58T.FAILURE, (Integer) null, (Integer) null));
    }

    public static final void A02(Bundle bundle, C89644eZ r7, AnonymousClass5S5 r8, C106995aW r9, AnonymousClass662 r10, C95814uZ r11) {
        int i;
        int i2;
        C162457s7.A0J(bundle, 6);
        C89644eZ r4 = r7;
        AnonymousClass662 r72 = r10;
        if (bundle.getBoolean("result")) {
            C106995aW r6 = r9;
            AnonymousClass5UK r3 = (AnonymousClass5UK) r9.A09.get();
            AnonymousClass5S5 r5 = r8;
            Integer num = r8.A00;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 5;
            }
            Integer num2 = r8.A01;
            if (num2 != null) {
                i2 = num2.intValue();
            } else {
                i2 = 1;
            }
            r3.A04(r11, Integer.valueOf(i), Integer.valueOf(i2), 7);
            r4.getSupportFragmentManager().A0j(new C107375bD(r4, r5, r6, r72, r11, 1), r4, "ClearLockedChatsDialogFragment_request_key");
            r4.Bon(new ClearLockedChatsDialogFragment(), "ClearLockedChatsDialogFragment");
        } else if (r10 != null) {
            r10.BOO();
        }
        r4.getSupportFragmentManager().A0l("request_key");
    }

    public static final void A03(Bundle bundle, C89644eZ r4, AnonymousClass5S5 r5, C106995aW r6, AnonymousClass662 r7, C95814uZ r8) {
        int i;
        int i2;
        C162457s7.A0J(bundle, 6);
        if (bundle.getBoolean("ClearLockedChatsDialogFragment_result_key")) {
            if (r8 == null) {
                r6.A06();
            } else {
                AnonymousClass31A A002 = C56982ss.A00(r6.A03, r8);
                if (A002 != null) {
                    C70323aJ.A00(r6.A06, r6, r8, A002, 23);
                }
            }
            if (r7 != null) {
                r7.BOx();
            }
            if (r6.A04.A0X(5337)) {
                AnonymousClass5UK r3 = (AnonymousClass5UK) r6.A09.get();
                Integer num = r5.A00;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 5;
                }
                Integer num2 = r5.A01;
                if (num2 != null) {
                    i2 = num2.intValue();
                } else {
                    i2 = 1;
                }
                r3.A04(r8, Integer.valueOf(i), Integer.valueOf(i2), 8);
            }
        } else if (r7 != null) {
            r7.BOO();
        }
        r4.getSupportFragmentManager().A0l("ClearLockedChatsDialogFragment_request_key");
    }

    public final void A08(C89644eZ r13, AnonymousClass5AS r14, C1225064q r15, int i) {
        C89644eZ r1 = r13;
        C162457s7.A0J(r13, 0);
        AnonymousClass5AS r2 = r14;
        C18260x0.A0Q(r14, r15);
        if (this.A0K) {
            C112595jz r3 = new C112595jz(r13, r15);
            int i2 = i;
            A05(r14).AxW(r13, r14, r3, new C102575Jj(r1, r2, r3, this, i2), i2);
            return;
        }
        Log.e("ChatLockManager/authenticate: Unsupported Version");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r0.A0i == true) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(X.C89644eZ r11, X.AnonymousClass5AS r12, X.C1225064q r13, int r14) {
        /*
            r10 = this;
            r6 = r12
            boolean r0 = r12 instanceof X.C91564kN
            r3 = 1
            r4 = 0
            r8 = r10
            r5 = r11
            r7 = r13
            r9 = r14
            if (r0 == 0) goto L_0x0035
            X.2ss r1 = r10.A03
            r0 = r6
            X.4kN r0 = (X.C91564kN) r0
            X.4uZ r0 = r0.A00
            X.31A r0 = r1.A0A(r0, r4)
            if (r0 == 0) goto L_0x0059
            boolean r0 = r0.A0i
            if (r0 != r3) goto L_0x0059
        L_0x001c:
            X.0df r1 = r11.getSupportFragmentManager()
            X.5gJ r4 = new X.5gJ
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.String r0 = "UnarchiveForQuickLockDialogFragment_request_key"
            r1.A0j(r4, r11, r0)
            com.whatsapp.chatlock.dialogs.UnarchiveForQuickLockDialogFragment r1 = new com.whatsapp.chatlock.dialogs.UnarchiveForQuickLockDialogFragment
            r1.<init>()
            java.lang.String r0 = "UnarchiveForQuickLockDialogFragment"
            r11.Bon(r1, r0)
            return
        L_0x0035:
            boolean r0 = r12 instanceof X.C91574kO
            if (r0 == 0) goto L_0x0059
            r0 = r6
            X.4kO r0 = (X.C91574kO) r0
            java.util.Collection r0 = r0.A00
            java.util.Iterator r2 = r0.iterator()
        L_0x0042:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0059
            X.4uZ r1 = X.C18300x5.A0P(r2)
            X.2ss r0 = r10.A03
            X.31A r0 = r0.A0A(r1, r4)
            if (r0 == 0) goto L_0x0042
            boolean r0 = r0.A0i
            if (r0 != r3) goto L_0x0042
            goto L_0x001c
        L_0x0059:
            r10.A08(r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106995aW.A09(X.4eZ, X.5AS, X.64q, int):void");
    }

    public final void A0A(C89644eZ r9, AnonymousClass5AS r10, C1225064q r11, C95814uZ r12, int i) {
        C89644eZ r3 = r9;
        C1225064q r5 = r11;
        C18270x1.A11(r9, 0, r11);
        AnonymousClass5AS r4 = r10;
        int i2 = i;
        if (AnonymousClass0x7.A1S(this.A03.A03)) {
            A09(r9, r10, r11, i);
            return;
        }
        C43102Qu r2 = new C43102Qu(r3, r4, r5, this, i2);
        ChatLockQuickAddHelperBottomSheet chatLockQuickAddHelperBottomSheet = new ChatLockQuickAddHelperBottomSheet();
        chatLockQuickAddHelperBottomSheet.A02 = r2;
        chatLockQuickAddHelperBottomSheet.A00 = i;
        chatLockQuickAddHelperBottomSheet.A05 = r12;
        r9.Bon(chatLockQuickAddHelperBottomSheet, "ChatLockQuickAddHelperBottomSheet");
    }

    public final void A0B(C89644eZ r10, AnonymousClass5S5 r11, AnonymousClass662 r12, C95814uZ r13) {
        r10.getSupportFragmentManager().A0j(new C107375bD(r10, r11, this, r12, r13, 0), r10, "request_key");
        r10.Bon(new ChatsAreLockedDialogFragment(), "ChatsAreLockedDialogFragment");
    }

    public final void A0C(C89644eZ r6, C95814uZ r7) {
        int i;
        C162457s7.A0J(r6, 0);
        C19340zH A002 = AnonymousClass5V0.A00(r6);
        C183538qC r3 = this.A07;
        if (!((C105275Ug) r3.get()).A06() || !this.A04.A0X(5337)) {
            boolean A062 = ((C105275Ug) r3.get()).A06();
            i = R.string.f11nameremoved;
            if (A062) {
                i = R.string.f11nameremoved;
            }
        } else {
            i = R.string.f11nameremoved;
        }
        A002.A0U(i);
        A002.A0i(true);
        A002.A0Y((DialogInterface.OnClickListener) null, R.string.f11nameremoved);
        C18280x3.A0q(A002);
        if (this.A04.A0X(5337)) {
            AnonymousClass5UK r32 = (AnonymousClass5UK) this.A09.get();
            C162457s7.A0H(r32);
            r32.A04(r7, 0, (Integer) null, 4);
        }
    }

    public final void A0D(C95814uZ r4, boolean z) {
        C162457s7.A0J(r4, 1);
        C56982ss r2 = this.A03;
        AnonymousClass31A A002 = C56982ss.A00(r2, r4);
        if (A002 != null) {
            A002.A0j = z;
            ((C56922sm) this.A0B.get()).A05(A002);
            C95814uZ A052 = A002.A05();
            HashSet hashSet = r2.A03;
            if (z) {
                hashSet.add(A052);
            } else {
                hashSet.remove(A052);
            }
            ((C28891hw) this.A0C.get()).A08();
            ((AnonymousClass3DP) this.A0H.get()).A03();
            C18270x1.A0l(C18270x1.A04(this.A0I), "shouldWarnLeakyCompanionIfAdded", !AnonymousClass001.A1W(((C56522s7) this.A0D.get()).A00().size()));
        }
    }

    public final boolean A0I(C95814uZ r3) {
        C162457s7.A0J(r3, 0);
        if (!this.A03.A0P(r3) || this.A01) {
            return false;
        }
        return true;
    }

    public C106995aW(C54292oU r18, C56982ss r19, AnonymousClass1VX r20, C60152y5 r21, AnonymousClass4FS r22, C183538qC r23, C183538qC r24, C183538qC r25, C183538qC r26, C183538qC r27, C183538qC r28, C183538qC r29, C183538qC r30, C183538qC r31, AnonymousClass4C1 r32, AnonymousClass4C1 r33) {
        AnonymousClass4FS r13 = r22;
        C183538qC r12 = r23;
        AnonymousClass1VX r0 = r20;
        C54292oU r16 = r18;
        C56982ss r15 = r19;
        C18260x0.A0f(r0, r15, r16, r13, r12);
        C183538qC r9 = r26;
        C183538qC r8 = r27;
        C183538qC r11 = r24;
        C183538qC r10 = r25;
        C60152y5 r14 = r21;
        C18260x0.A0g(r11, r10, r9, r8, r14);
        C183538qC r7 = r28;
        C162457s7.A0J(r7, 11);
        C183538qC r5 = r30;
        C183538qC r4 = r31;
        AnonymousClass4C1 r3 = r32;
        AnonymousClass4C1 r2 = r33;
        C183538qC r6 = r29;
        C18260x0.A0h(r6, r5, r4, r3, r2);
        this.A04 = r0;
        this.A03 = r15;
        this.A02 = r16;
        this.A06 = r13;
        this.A0B = r12;
        this.A0D = r11;
        this.A07 = r10;
        this.A09 = r9;
        this.A0F = r8;
        this.A05 = r14;
        this.A0C = r7;
        this.A0A = r6;
        this.A0E = r5;
        this.A08 = r4;
        this.A0G = r3;
        this.A0H = r2;
        boolean A022 = C107385bE.A02();
        this.A0K = A022;
        this.A0J = A022;
    }

    public final AnonymousClass663 A05(AnonymousClass5AS r5) {
        Object obj;
        C183538qC r3 = this.A08;
        if (!((C112635k3) r3.get()).A01(r5)) {
            C183538qC r2 = this.A0E;
            C112625k2 r1 = (C112625k2) r2.get();
            if (!(r5 instanceof C91594kQ) && ((C105095To) r1.A04.get()).A03()) {
                obj = r2.get();
                AnonymousClass663 r0 = (AnonymousClass663) obj;
                C162457s7.A0H(r0);
                return r0;
            }
        }
        obj = r3.get();
        AnonymousClass663 r02 = (AnonymousClass663) obj;
        C162457s7.A0H(r02);
        return r02;
    }

    public final void A06() {
        C56982ss r0 = this.A03;
        ArrayList A0s = AnonymousClass001.A0s();
        ConcurrentHashMap A0G2 = r0.A0G();
        Iterator it = r0.A03.iterator();
        while (it.hasNext()) {
            A0s.add(A0G2.get(it.next()));
        }
        A0F(false);
        ((C105095To) this.A0F.get()).A02(C1220863a.A00);
        C86624Kv.A1M(this.A06, A0s, this, 15);
    }

    public final void A0E(boolean z) {
        C18270x1.A0l(C18270x1.A04(this.A0I), "userFailedAppSwitchAuth", z);
    }

    public final void A0F(boolean z) {
        C18270x1.A0l(C18270x1.A03(((C104115Ps) this.A0A.get()).A00), "lock_folder_hidden", z);
    }

    public final boolean A0G() {
        return C18280x3.A1W(AnonymousClass0x2.A0F(((C104115Ps) this.A0A.get()).A00), "lock_folder_hidden");
    }

    public final boolean A0H() {
        if (((C105095To) this.A0F.get()).A03()) {
            AnonymousClass1VX r1 = this.A04;
            if (!r1.A0X(5854) || !A0G() || !r1.A0X(5854) || !r1.A0X(6243)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final void A00(Resources resources, View view, boolean z) {
        int i = R.string.f11nameremoved;
        if (!z) {
            i = R.string.f11nameremoved;
        }
        C88694ab A002 = C88694ab.A00(view, i, 0);
        AnonymousClass6FH r4 = A002.A0J;
        ViewGroup.MarginLayoutParams A0O = C86634Kw.A0O(r4);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f6nameremoved);
        A0O.setMargins(dimensionPixelSize, A0O.topMargin, dimensionPixelSize, resources.getDimensionPixelSize(R.dimen.f6nameremoved));
        r4.setLayoutParams(A0O);
        A002.A0E(new C109325eR(A002, 8), R.string.f11nameremoved);
        A002.A05();
    }

    public final AnonymousClass0O1 A04(C15540rX r3, C89644eZ r4, int i) {
        C18260x0.A0O(r3, r4);
        return r3.Bid(new C110315g2(r4, this, i), new C003403v());
    }

    public final void A07(AnonymousClass0O1 r5, C95814uZ r6, int i) {
        C18260x0.A0P(r6, r5);
        if (!this.A00) {
            this.A00 = true;
            Context context = this.A02.A00;
            Boolean bool = Boolean.TRUE;
            Intent A072 = C18320x8.A07();
            A072.setClassName(context.getPackageName(), "com.whatsapp.chatlock.ChatLockRequestAuthInterstitialActivity");
            AnonymousClass0x2.A0u(A072, r6, "extra_chat_jid");
            A072.putExtra("extra_open_chat_directly", bool);
            A072.putExtra("extra_unlock_entry_point", i);
            r5.A00((C05880Vi) null, A072);
        }
    }
}

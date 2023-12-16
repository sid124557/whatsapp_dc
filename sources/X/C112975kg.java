package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.PopupWindow;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.MessageSelectionViewModel;
import com.whatsapp.conversation.conversationrow.googlesearch.GoogleSearchDialogFragment;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.jid.UserJid;
import com.whatsapp.reactions.ReactionsTrayViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.5kg  reason: invalid class name and case insensitive filesystem */
public class C112975kg implements AnonymousClass677, AnonymousClass652 {
    public AnonymousClass0R2 A00;
    public C116985rC A01;
    public C116985rC A02;
    public C116985rC A03;
    public C116985rC A04;
    public C111095hX A05;
    public C103175Lv A06;
    public C621033m A07;
    public C620433g A08;
    public C56942so A09;
    public C65203Gp A0A;
    public C44772Xk A0B;
    public C64773Ex A0C;
    public C105975Xd A0D;
    public C56422rx A0E;
    public AnonymousClass5ZU A0F;
    public C48952fk A0G;
    public C114015mM A0H;
    public C53602nM A0I;
    public AnonymousClass5G6 A0J;
    public AnonymousClass5XQ A0K;
    public AnonymousClass5OL A0L;
    public C105165Tv A0M;
    public C1230666y A0N;
    public MessageSelectionViewModel A0O;
    public AnonymousClass4Rl A0P;
    public AnonymousClass5R7 A0Q;
    public AnonymousClass5RC A0R;
    public C113895mA A0S;
    public C620633i A0T;
    public C54292oU A0U;
    public AnonymousClass5ZR A0V;
    public C56982ss A0W;
    public C66543Lv A0X;
    public C56892sj A0Y;
    public C106065Xm A0Z;
    public C29431io A0a;
    public C55622qe A0b;
    public AnonymousClass36Y A0c;
    public EmojiSearchProvider A0d;
    public AnonymousClass4FV A0e;
    public AnonymousClass30N A0f;
    public C66493Lq A0g;
    public C52472lX A0h;
    public C97154xi A0i;
    public C53202mi A0j;
    public C106685Zz A0k;
    public C56232re A0l;
    public C620133d A0m;
    public C106195Xz A0n;
    public C50022hV A0o;
    public C47052cd A0p;
    public C1907099n A0q;
    public AnonymousClass9U4 A0r;
    public C624134x A0s;
    public C50222hp A0t;
    public C45042Yl A0u;
    public ReactionsTrayViewModel A0v;
    public C110065fd A0w;
    public AnonymousClass33O A0x;
    public C55832qz A0y;
    public C66433Lk A0z;
    public C105055Tk A10;
    public C56072rN A11;
    public C106715a2 A12;
    public AnonymousClass5RW A13;
    public HashMap A14;
    public C106705a1 A15;
    public final PopupWindow.OnDismissListener A16 = new AnonymousClass6AG(this, 0);
    public final HashSet A17 = AnonymousClass002.A0K();

    public static C89644eZ A00(C112975kg r0) {
        return r0.A0N.getActivity();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x013f, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0140, code lost:
        r6 = new X.C85634Ha(r5, r1, r3, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A02(int r44) {
        /*
            r43 = this;
            r1 = 13
            r0 = r43
            r3 = r44
            if (r3 == r1) goto L_0x0016
            r1 = 19
            if (r3 == r1) goto L_0x010d
            switch(r44) {
                case 23: goto L_0x012a;
                case 24: goto L_0x00f7;
                case 25: goto L_0x00e0;
                default: goto L_0x000f;
            }
        L_0x000f:
            X.66y r0 = r0.A0N
            android.app.Dialog r0 = r0.BdX(r3)
            return r0
        L_0x0016:
            X.5QO r1 = r0.A03()
            if (r1 == 0) goto L_0x00d9
            java.util.HashMap r1 = r1.A04
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x00d9
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "conversation/dialog/delete/"
            r3.append(r2)
            int r2 = r1.size()
            X.C18260x0.A1G(r3, r2)
            X.4eZ r4 = A00(r0)
            X.66y r2 = r0.A0N
            X.2sH r24 = r2.getTime()
            X.66y r2 = r0.A0N
            X.1VX r31 = r2.getABProps()
            X.66y r2 = r0.A0N
            X.3Wi r18 = r2.getGlobalUI()
            X.66y r2 = r0.A0N
            X.4FS r39 = r2.getWaWorkers()
            X.4FV r2 = r0.A0e
            r21 = r2
            X.66y r2 = r0.A0N
            X.5Y0 r30 = r2.getEmojiLoader()
            X.33m r2 = r0.A07
            r20 = r2
            X.3Ex r6 = r0.A0C
            X.36Y r2 = r0.A0c
            r19 = r2
            X.5ZU r3 = r0.A0F
            X.66y r2 = r0.A0N
            X.33j r26 = r2.getWhatsAppLocale()
            X.2fk r2 = r0.A0G
            r23 = r2
            X.2lX r2 = r0.A0h
            r17 = r2
            X.2mi r15 = r0.A0j
            X.30N r14 = r0.A0f
            X.2rx r13 = r0.A0E
            X.66y r2 = r0.A0N
            X.33p r25 = r2.getWaSharedPreferences()
            X.5rC r12 = r0.A02
            X.2sj r11 = r0.A0Y
            X.2cd r10 = r0.A0p
            java.util.Collection r1 = r1.values()
            java.util.HashSet r2 = X.AnonymousClass0x9.A15(r1)
            r5 = 0
            X.66y r8 = r0.A0N
            java.util.Objects.requireNonNull(r8)
            r7 = 0
            X.6AH r1 = new X.6AH
            r1.<init>(r8, r7)
            X.66y r7 = r0.A0N
            X.48y r16 = r7.B0u()
            X.2hp r9 = r0.A0t
            X.2Yl r8 = r0.A0u
            X.2ss r7 = r0.A0W
            r42 = 1
            X.5hq r0 = new X.5hq
            r0.<init>(r4)
            java.lang.String r40 = X.AnonymousClass5ZW.A01(r4, r6, r3, r5, r2)
            r27 = r7
            r28 = r11
            r29 = r19
            r32 = r21
            r33 = r14
            r34 = r17
            r35 = r15
            r36 = r10
            r37 = r9
            r38 = r8
            r41 = r2
            r17 = r1
            r19 = r20
            r20 = r6
            r21 = r13
            r22 = r3
            r13 = r4
            r14 = r12
            r15 = r0
            android.app.Dialog r0 = X.AnonymousClass5ZW.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            return r0
        L_0x00d9:
            java.lang.String r1 = "conversation/dialog/delete no messages"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x000f
        L_0x00e0:
            X.4uZ r8 = A01(r0)
            X.4eZ r5 = A00(r0)
            X.5hX r4 = r0.A05
            X.3Lk r9 = r0.A0z
            X.2nM r7 = r0.A0I
            X.66y r0 = r0.A0N
            X.33p r1 = r0.getWaSharedPreferences()
            r10 = 1
            r0 = 0
            goto L_0x0140
        L_0x00f7:
            X.4uZ r8 = A01(r0)
            X.4eZ r5 = A00(r0)
            X.5hX r4 = r0.A05
            X.3Lk r9 = r0.A0z
            X.2nM r7 = r0.A0I
            X.66y r0 = r0.A0N
            X.33p r1 = r0.getWaSharedPreferences()
            r10 = 0
            goto L_0x013f
        L_0x010d:
            X.4uZ r8 = A01(r0)
            X.4eZ r5 = A00(r0)
            X.5hX r4 = r0.A05
            X.3Lk r9 = r0.A0z
            X.2nM r7 = r0.A0I
            X.66y r0 = r0.A0N
            X.33p r1 = r0.getWaSharedPreferences()
            r10 = 0
            r0 = 19
            X.4Ha r6 = new X.4Ha
            r6.<init>(r5, r1, r0, r10)
            goto L_0x0145
        L_0x012a:
            X.4uZ r8 = A01(r0)
            X.4eZ r5 = A00(r0)
            X.5hX r4 = r0.A05
            X.3Lk r9 = r0.A0z
            X.2nM r7 = r0.A0I
            X.66y r0 = r0.A0N
            X.33p r1 = r0.getWaSharedPreferences()
            r10 = 1
        L_0x013f:
            r0 = 1
        L_0x0140:
            X.4Ha r6 = new X.4Ha
            r6.<init>(r5, r1, r3, r0)
        L_0x0145:
            android.app.Dialog r0 = X.AnonymousClass59s.A00(r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112975kg.A02(int):android.app.Dialog");
    }

    public AnonymousClass5QO A03() {
        MessageSelectionViewModel messageSelectionViewModel = this.A0O;
        if (messageSelectionViewModel == null) {
            return null;
        }
        return (AnonymousClass5QO) messageSelectionViewModel.A00.A07();
    }

    public void A05() {
        this.A0L = new AnonymousClass5OL(this.A0N.getGlobalUI(), this.A0N.getWaSharedPreferences(), this.A12);
        this.A0M = this.A06.A00(A00(this).getSupportFragmentManager(), C95894up.A00(this.A0N.getWaWorkers()));
        if (this.A0i.A0F()) {
            AnonymousClass5R7 r4 = this.A0Q;
            Iterator A0q2 = AnonymousClass000.A0q(r4.A0E);
            while (A0q2.hasNext()) {
                AnonymousClass679 r2 = (AnonymousClass679) AnonymousClass001.A0w(A0q2).getKey();
                C18280x3.A1D(r2, r4.A0D, r2.B89());
            }
        }
        this.A0Q.A01(A00(this));
    }

    public void A06() {
        MessageSelectionViewModel messageSelectionViewModel = this.A0O;
        if (messageSelectionViewModel != null) {
            messageSelectionViewModel.A0D();
        }
        C105165Tv r1 = this.A0M;
        C105365Uq r0 = r1.A00;
        if (r0 != null) {
            r0.A00();
        }
        r1.A0J.A03();
        r1.A0N.A08();
        AnonymousClass5OL r2 = this.A0L;
        C994455t r12 = r2.A00;
        if (r12 != null) {
            r12.A02 = true;
            r12.interrupt();
            r2.A00 = null;
        }
        this.A0J.A00.clear();
        this.A0N.BdZ();
    }

    public void A07() {
        AnonymousClass5XQ r1 = this.A0K;
        synchronized (r1) {
            Map map = r1.A00;
            if (map != null) {
                map.clear();
            }
        }
        this.A13.A01();
    }

    public final void A09() {
        if (this.A0O == null) {
            MessageSelectionViewModel messageSelectionViewModel = (MessageSelectionViewModel) AnonymousClass0x9.A0H(this.A0N.getViewModelStoreOwner()).A01(MessageSelectionViewModel.class);
            this.A0O = messageSelectionViewModel;
            AnonymousClass6C6.A02(A00(this), messageSelectionViewModel.A01, this, 186);
            AnonymousClass6C6.A02(A00(this), this.A0O.A00, this, 187);
        }
    }

    public void A0A(int i) {
        int i2;
        C626936e.A06(this.A0v);
        if (i == 0) {
            this.A0N.B1t();
            if (this.A0v.A03) {
                boolean A0X2 = this.A0N.getABProps().A0X(3792);
                C1230666y r0 = this.A0N;
                if (A0X2) {
                    r0.BFc();
                    return;
                }
                C89224c7 emojiPopupWindow = r0.getEmojiPopupWindow();
                if (emojiPopupWindow != null) {
                    emojiPopupWindow.dismiss();
                }
            }
        } else if (i == 1) {
            AnonymousClass4Rl r4 = this.A0P;
            if (r4 != null) {
                int i3 = this.A0v.A00;
                int dimensionPixelOffset = r4.getContentView().getResources().getDimensionPixelOffset(R.dimen.f6nameremoved);
                C89654ea r2 = r4.A01;
                int i4 = 0;
                int max = Math.max(0, 0 - r2.getResources().getDimensionPixelOffset(R.dimen.f6nameremoved));
                int dimensionPixelSize = r4.getContentView().getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
                C94024pj r5 = r4.A02;
                View view = r4.A00;
                int width = view.getWidth();
                C620733j r7 = r4.A03;
                r5.A00(width, max, AnonymousClass000.A1U(C86664Kz.A0r(r5).gravity & 7, C86664Kz.A04(C620733j.A04(r7) ? 1 : 0)));
                int i5 = -(((view.getHeight() + (r5.getMeasuredHeight() - (dimensionPixelSize * 2))) + dimensionPixelOffset) - i3);
                Window window = r2.getWindow();
                if ((window.getDecorView().getSystemUiVisibility() & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                    Rect A0N2 = AnonymousClass001.A0N();
                    window.getDecorView().getWindowVisibleDisplayFrame(A0N2);
                    i2 = A0N2.top;
                    Toolbar toolbar = r2.A02;
                    if (toolbar != null) {
                        i4 = toolbar.getHeight();
                    }
                } else {
                    i2 = 0;
                }
                int A052 = C86654Ky.A05(r4.getContentView());
                int top = (view.getTop() - i4) - i2;
                if (i3 + top < r5.getMeasuredHeight() + dimensionPixelOffset) {
                    i5 = -(((view.getHeight() + top) + dimensionPixelSize) - A052);
                }
                Pair A0C2 = C86604Kt.A0C(max, i5);
                r4.showAsDropDown(view, 0, C18290x4.A03(A0C2));
                Rect A0N3 = AnonymousClass001.A0N();
                view.getGlobalVisibleRect(A0N3);
                int i6 = C86634Kw.A0J().widthPixels;
                int i7 = A0N3.left;
                int A032 = C18280x3.A03(A0C2);
                r5.A02(i7 + A032, (i6 - A0N3.right) + A032, AnonymousClass000.A1U(C86664Kz.A0r(r5).gravity & 7, C86664Kz.A04(C620733j.A04(r7) ? 1 : 0)));
                C624134x r02 = this.A0v.A0G;
                C626936e.A06(r02);
                C95814uZ r1 = r02.A1J.A00;
                if (r1 != null) {
                    this.A0o.A00(r1);
                }
            }
        } else if (i == 2) {
            C148127Ha r12 = C107165ao.A02;
            C89224c7 emojiPopupWindow2 = this.A0N.getEmojiPopupWindow();
            if (emojiPopupWindow2 != null) {
                emojiPopupWindow2.A09 = r12;
                emojiPopupWindow2.A09();
            }
            this.A0N.B1t();
        }
    }

    public void A0B(int i, int i2, Intent intent) {
        String str;
        List list;
        if (i == 41) {
            if (i2 == -1) {
                if (intent != null) {
                    Uri data = intent.getData();
                    C626936e.A06(data);
                    str = data.getLastPathSegment();
                } else {
                    str = null;
                }
                ArrayList A0s2 = AnonymousClass001.A0s();
                ArrayList A0s3 = AnonymousClass001.A0s();
                C106705a1 r0 = this.A15;
                if (!(r0 == null || (list = r0.A06) == null)) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        AnonymousClass7OD A0R2 = AnonymousClass4L0.A0R(it);
                        A0s3.add(A0R2.A02);
                        UserJid userJid = A0R2.A01;
                        if (userJid != null) {
                            A0s2.add(userJid);
                        } else {
                            A0s2.add((Object) null);
                        }
                    }
                    this.A0D.A02(this.A15.A03(), str, A0s3, A0s2);
                }
            }
            this.A10.A00();
        }
    }

    public void A0C(Configuration configuration) {
        int i;
        this.A0Q.A01(A00(this));
        ReactionsTrayViewModel reactionsTrayViewModel = this.A0v;
        if (reactionsTrayViewModel != null && (i = configuration.orientation) != reactionsTrayViewModel.A01) {
            reactionsTrayViewModel.A01 = i;
            reactionsTrayViewModel.A0D(0);
        }
    }

    public /* synthetic */ void Awx(Drawable drawable, View view) {
    }

    public void B3M() {
        MessageSelectionViewModel messageSelectionViewModel = this.A0O;
        if (messageSelectionViewModel != null) {
            messageSelectionViewModel.A0D();
        }
    }

    public Object B5x(Class cls) {
        if (cls == AnonymousClass5XQ.class) {
            return this.A0K;
        }
        if (cls == AnonymousClass5OL.class) {
            return this.A0L;
        }
        return null;
    }

    public int BAS(C624134x r4) {
        Number A0p2;
        HashMap hashMap = this.A14;
        if (hashMap == null || (A0p2 = AnonymousClass0x9.A0p(r4.A1J, hashMap)) == null) {
            return 1;
        }
        return A0p2.intValue();
    }

    public boolean BFW() {
        MessageSelectionViewModel messageSelectionViewModel = this.A0O;
        if (messageSelectionViewModel == null) {
            return false;
        }
        Number A0i2 = C86654Ky.A0i(messageSelectionViewModel.A01);
        if (A0i2 == null || A0i2.intValue() != 0) {
            return true;
        }
        return false;
    }

    public /* synthetic */ boolean BIA() {
        return false;
    }

    public boolean BIB(C624134x r3) {
        MessageSelectionViewModel messageSelectionViewModel = this.A0O;
        if (messageSelectionViewModel != null) {
            C162457s7.A0J(r3, 0);
            AnonymousClass5QO r0 = (AnonymousClass5QO) messageSelectionViewModel.A00.A07();
            if (r0 != null) {
                if (!r0.A04.containsKey(r3.A1J)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ boolean BIT() {
        return false;
    }

    public /* synthetic */ boolean BLE() {
        return true;
    }

    public /* synthetic */ void BZx(C624134x r1, boolean z) {
    }

    public void Bmp(C624134x r3, int i) {
        HashMap hashMap = this.A14;
        if (hashMap == null) {
            hashMap = AnonymousClass001.A0t();
            this.A14 = hashMap;
        }
        AnonymousClass0x2.A1I(r3.A1J, hashMap, i);
    }

    public void BnL(List list, boolean z) {
        MessageSelectionViewModel messageSelectionViewModel = this.A0O;
        if (messageSelectionViewModel != null) {
            C162457s7.A0J(list, 0);
            AnonymousClass08M r5 = messageSelectionViewModel.A00;
            AnonymousClass5QO r4 = (AnonymousClass5QO) r5.A07();
            if (r4 != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C624134x A0T2 = C18300x5.A0T(it);
                    AnonymousClass2z0 r1 = A0T2.A1J;
                    HashMap hashMap = r4.A04;
                    if (z) {
                        hashMap.put(r1, A0T2);
                    } else {
                        hashMap.remove(r1);
                    }
                }
                r5.A0H(r4);
            }
        }
    }

    public /* synthetic */ boolean BoV() {
        return false;
    }

    public void Boh(Bitmap bitmap, C106705a1 r6) {
        this.A15 = r6;
        C19340zH A002 = AnonymousClass5V0.A00(A00(this));
        A002.A0T(R.string.f11nameremoved);
        A002.A0Y(new C1235668x(r6, bitmap, this, 2), R.string.f11nameremoved);
        A002.A0W(new C1235668x(r6, bitmap, this, 3), R.string.f11nameremoved);
        C18280x3.A0q(A002);
    }

    public /* synthetic */ boolean Bor() {
        return false;
    }

    public void BpB(View view, C624134x r10, int i, boolean z) {
        Number A0i2;
        MessageSelectionViewModel messageSelectionViewModel = this.A0O;
        if (messageSelectionViewModel == null || (A0i2 = C86654Ky.A0i(messageSelectionViewModel.A01)) == null || A0i2.intValue() != 2) {
            if (this.A0v == null) {
                ReactionsTrayViewModel reactionsTrayViewModel = (ReactionsTrayViewModel) AnonymousClass0x9.A0H(this.A0N.getViewModelStoreOwner()).A01(ReactionsTrayViewModel.class);
                this.A0v = reactionsTrayViewModel;
                C100385As.A01(A00(this), reactionsTrayViewModel.A0E, reactionsTrayViewModel, this, 12);
                AnonymousClass107 r3 = reactionsTrayViewModel.A0C;
                C89644eZ A002 = A00(this);
                C1230666y r1 = this.A0N;
                Objects.requireNonNull(r1);
                AnonymousClass6C6.A02(A002, r3, r1, 184);
                AnonymousClass6C6.A02(A00(this), reactionsTrayViewModel.A0D, this, 185);
            }
            this.A0v.A0F(r10);
            C620733j whatsAppLocale = this.A0N.getWhatsAppLocale();
            C620633i systemServices = this.A0N.getSystemServices();
            View view2 = view;
            this.A0P = new AnonymousClass4Rl(view2, A00(this), systemServices, whatsAppLocale, r10, this.A0v, z);
            this.A0v.A0E(i);
        }
    }

    public boolean Bqw(C624134x r6) {
        MessageSelectionViewModel messageSelectionViewModel = this.A0O;
        if (messageSelectionViewModel != null) {
            C162457s7.A0J(r6, 0);
            AnonymousClass08M r4 = messageSelectionViewModel.A00;
            AnonymousClass5QO r3 = (AnonymousClass5QO) r4.A07();
            if (r3 != null) {
                AnonymousClass2z0 r2 = r6.A1J;
                HashMap hashMap = r3.A04;
                boolean z = !hashMap.containsKey(r2);
                if (z) {
                    hashMap.put(r2, r6);
                } else {
                    hashMap.remove(r2);
                }
                r4.A0H(r3);
                if (!z) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public void Brx(C624134x r3) {
        this.A17.add(r3.A1J);
    }

    public /* synthetic */ int getContainerType() {
        return 0;
    }

    public AnonymousClass679 getConversationRowCustomizer() {
        return this.A0N.getConversationRowCustomizer();
    }

    public /* synthetic */ C06270Wx getHasOutgoingMessagesLiveData() {
        return null;
    }

    public /* synthetic */ C06270Wx getLastMessageLiveData() {
        return null;
    }

    public C15910sA getLifecycleOwner() {
        return this.A0N.getLifecycleOwner();
    }

    public /* synthetic */ ArrayList getSearchTerms() {
        return null;
    }

    public /* synthetic */ EditText getTextEntryField() {
        return null;
    }

    public static C95814uZ A01(C112975kg r0) {
        AnonymousClass5QO A032 = r0.A03();
        if (A032 == null) {
            return null;
        }
        return C627636p.A04(A032.A00());
    }

    public Collection A04() {
        ArrayList A0s2 = AnonymousClass001.A0s();
        AnonymousClass5QO A032 = A03();
        if (A032 != null) {
            A0s2.addAll(A032.A04.values());
        } else {
            C624134x r0 = this.A0s;
            if (r0 != null) {
                if (this.A0y.A05(r0.A1J) != null) {
                    A0s2.add(this.A0s);
                    return A0s2;
                }
            }
        }
        return A0s2;
    }

    public void A08() {
        C107405bG.A07(A00(this), AnonymousClass5Yj.A02(A00(this), R.attr.f3nameremoved, R.color.f5nameremoved));
    }

    public void B3X(C624134x r7) {
        long j;
        B3M();
        this.A0s = r7;
        AnonymousClass5PH r2 = new AnonymousClass5PH(A00(this));
        boolean z = true;
        r2.A09 = true;
        C116985rC r1 = this.A01;
        if (r1.A07()) {
            r1.A04();
            throw AnonymousClass001.A0g("isEligible");
        }
        r2.A0K = C18320x8.A0U();
        AnonymousClass2z0 r4 = r7.A1J;
        r2.A01 = r4.A00;
        r2.A0a = Collections.singletonList(r4);
        byte b = r7.A1I;
        AnonymousClass5PH.A02(r2, b);
        if (r7 instanceof C31971pB) {
            j = C18290x4.A0A(((C30471mV) r7).A0B);
        } else {
            j = 0;
        }
        r2.A0R = Integer.valueOf(AnonymousClass5PH.A00(r2, r7, b, j));
        r2.A0N = Integer.valueOf(C627636p.A0t(r7) ? 1 : 0);
        r2.A0C = Boolean.valueOf(r7.A1s(1));
        r2.A0A = Boolean.valueOf(r7.A1s(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH));
        r2.A0B = Boolean.valueOf(C18280x3.A1U(r7.A06, 127));
        if (!(r7 instanceof C30721mu) || r7.A09 != 1 || !r4.A02) {
            z = false;
        }
        r2.A0D = Boolean.valueOf(z);
        A00(this).startActivityForResult(AnonymousClass5PH.A01(r2), 2);
    }

    public /* synthetic */ boolean BJC(C624134x r2) {
        return false;
    }

    public void Bkv(C624134x r3) {
        GoogleSearchDialogFragment.A00(A00(this), this.A0N.getServerProps(), r3);
    }

    public /* synthetic */ void Boi(C624134x r1) {
    }

    public void Bpx(C624134x r8) {
        A09();
        MessageSelectionViewModel messageSelectionViewModel = this.A0O;
        C626936e.A06(messageSelectionViewModel);
        C162457s7.A0J(r8, 0);
        AnonymousClass08M r6 = messageSelectionViewModel.A00;
        C69263Wi r4 = messageSelectionViewModel.A02;
        C29431io r3 = messageSelectionViewModel.A03;
        AnonymousClass5QO r2 = new AnonymousClass5QO(r4, new C1236269d(messageSelectionViewModel, 0), (AnonymousClass5QO) r6.A07(), r3);
        r2.A04.put(r8.A1J, r8);
        r6.A0H(r2);
        this.A0N.BbB();
    }

    public /* synthetic */ void setQuotedMessage(C624134x r1) {
    }
}

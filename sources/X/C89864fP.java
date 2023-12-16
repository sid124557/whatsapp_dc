package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.4fP  reason: invalid class name and case insensitive filesystem */
public final class C89864fP extends AnonymousClass5c4 {
    public C33601tO A00;
    public Integer A01 = C18290x4.A0b();
    public Runnable A02;
    public final C009707r A03;
    public final C116985rC A04;
    public final C111095hX A05;
    public final C55682qk A06;
    public final C835748y A07;
    public final AnonymousClass64F A08;
    public final AnonymousClass4FU A09;
    public final C69263Wi A0A;
    public final C66663Mh A0B;
    public final AnonymousClass5Z5 A0C;
    public final C50382i5 A0D;
    public final C621033m A0E;
    public final C56962sq A0F;
    public final C29441ip A0G;
    public final C64773Ex A0H;
    public final C56422rx A0I;
    public final AnonymousClass5ZU A0J;
    public final AnonymousClass5ZU A0K;
    public final C48952fk A0L;
    public final C53602nM A0M;
    public final C104905Su A0N;
    public final AnonymousClass30W A0O;
    public final C620633i A0P;
    public final C56612sH A0Q;
    public final AnonymousClass33p A0R;
    public final C620733j A0S;
    public final C56982ss A0T;
    public final C66473Lo A0U;
    public final C28891hw A0V;
    public final C56892sj A0W;
    public final C56152rV A0X;
    public final AnonymousClass36Y A0Y;
    public final C1228766e A0Z;
    public final C100405Au A0a;
    public final AnonymousClass487 A0b;
    public final AnonymousClass5IY A0c;
    public final C27821ej A0d;
    public final AnonymousClass5Y0 A0e;
    public final EmojiSearchProvider A0f;
    public final AnonymousClass1VX A0g;
    public final AnonymousClass3LP A0h;
    public final AnonymousClass4FV A0i;
    public final AnonymousClass30N A0j;
    public final C66493Lq A0k;
    public final C66503Lr A0l;
    public final C52472lX A0m;
    public final C53202mi A0n;
    public final C95814uZ A0o;
    public final C47052cd A0p;
    public final AnonymousClass33S A0q;
    public final C60152y5 A0r;
    public final C50222hp A0s;
    public final C45042Yl A0t;
    public final C66433Lk A0u;
    public final C104355Qq A0v;
    public final C105895Wv A0w;
    public final AnonymousClass4FS A0x;

    public Dialog A00(AnonymousClass3ZH r46, int i) {
        C19340zH r5;
        int i2;
        DialogInterface.OnClickListener onClickListener;
        int i3;
        C19340zH A002;
        C27991fJ A012;
        int i4;
        AnonymousClass5QO selectedMessages;
        int i5;
        int i6;
        int i7 = i;
        if (i7 == 0) {
            C009707r r3 = this.A03;
            C621433s.A00(r3, 0);
            C621433s.A00(r3, 20);
            C1236369e r4 = new C1236369e(this, 0);
            r3.getString(R.string.f11nameremoved);
            AnonymousClass043 create = this.A0v.A00(r3, r4, 1, 3, 0, true).create();
            create.show();
            return create;
        }
        AnonymousClass3ZH r2 = r46;
        if (i7 == 28 || i7 == 29) {
            C009707r r6 = this.A03;
            C621433s.A00(r6, i7);
            Object[] objArr = new Object[1];
            C18300x5.A1E(this.A0J, r2, objArr, 0);
            r6.getString(R.string.f11nameremoved, objArr);
            return this.A0v.A00(r6, new C1236369e(new C116245py(r2, this, i7), 2), 1, 2, 0, false).create();
        } else if (i7 == 20) {
            C009707r r62 = this.A03;
            C621433s.A00(r62, 0);
            C621433s.A00(r62, 20);
            C1235969a r22 = new C1235969a(this, 1);
            r62.getString(R.string.f11nameremoved);
            return this.A0v.A00(r62, new C1236369e(r22, 2), 1, 3, 0, false).create();
        } else {
            if (i7 == 2) {
                C1235268t A003 = C1235268t.A00(this, 51);
                r5 = AnonymousClass5V0.A00(this.A03);
                C86624Kv.A1F(r5);
                r5.A0Y(A003, R.string.f11nameremoved);
            } else {
                if (i7 == 106 || i7 == 603 || i7 == 607 || i7 == 608) {
                    if (C57362tW.A00(this.A0h, this.A0o)) {
                        i3 = R.string.f11nameremoved;
                    } else if (i7 == 106) {
                        i3 = R.string.f11nameremoved;
                    } else if (i7 == 607) {
                        i3 = R.string.f11nameremoved;
                    } else {
                        i3 = R.string.f11nameremoved;
                        if (i7 == 608) {
                            i3 = R.string.f11nameremoved;
                        }
                    }
                    C009707r r63 = this.A03;
                    A002 = AnonymousClass5V0.A00(r63);
                    Object[] objArr2 = new Object[1];
                    C18300x5.A1E(this.A0J, r2, objArr2, 0);
                    C86624Kv.A0i(r63, A002, objArr2, i3);
                    A002.A0Y(new C1234668n(r2, this, i7, 1), R.string.f11nameremoved);
                    i2 = R.string.f11nameremoved;
                    onClickListener = new AnonymousClass69W(this, i7, 0);
                } else {
                    if (i7 == 7) {
                        Log.w("conversation/dialog/oom");
                        r5 = AnonymousClass5V0.A00(this.A03);
                        r5.A0T(R.string.f11nameremoved);
                        i5 = R.string.f11nameremoved;
                        i6 = 52;
                    } else if (i7 == 8) {
                        Log.e("conversation/dialog/not-an-image");
                        r5 = AnonymousClass5V0.A00(this.A03);
                        r5.A0T(R.string.f11nameremoved);
                        i5 = R.string.f11nameremoved;
                        i6 = 53;
                    } else {
                        if (i7 == 9) {
                            Log.i("conversation/warned-about-call-charges");
                            A002 = AnonymousClass5V0.A00(this.A03);
                            A002.A0T(R.string.f11nameremoved);
                            C1235268t.A03(A002, this, 54, R.string.f11nameremoved);
                            i2 = R.string.f11nameremoved;
                            i4 = 55;
                        } else if (i7 == 10) {
                            return this.A0N.A00(this.A03, this.A09, r2);
                        } else {
                            if (i7 == 115) {
                                Log.i("conversation/dialog software-about-to-expire");
                                return this.A0C.A02(this.A03, this.A0D);
                            } else if (i7 == 12) {
                                Log.w("conversation/add existing contact: activity not found, probably tablet");
                                r5 = AnonymousClass5V0.A00(this.A03);
                                r5.A0T(R.string.f11nameremoved);
                                i5 = R.string.f11nameremoved;
                                i6 = 56;
                            } else {
                                if (i7 == 13) {
                                    AnonymousClass6AB r32 = (AnonymousClass6AB) this.A0Z;
                                    if (!(r32.A01 == 0 || (selectedMessages = ((C113245l7) r32.A00).A2z.getSelectedMessages()) == null)) {
                                        HashMap hashMap = selectedMessages.A04;
                                        if (!hashMap.isEmpty()) {
                                            StringBuilder A0o2 = AnonymousClass001.A0o();
                                            A0o2.append("conversation/dialog/delete/");
                                            C18260x0.A1G(A0o2, hashMap.size());
                                            C009707r r12 = this.A03;
                                            C56612sH r27 = this.A0Q;
                                            AnonymousClass1VX r26 = this.A0g;
                                            C69263Wi r24 = this.A0A;
                                            AnonymousClass4FS r23 = this.A0x;
                                            AnonymousClass4FV r222 = this.A0i;
                                            AnonymousClass5Y0 r20 = this.A0e;
                                            C621033m r21 = this.A0E;
                                            C64773Ex r11 = this.A0H;
                                            AnonymousClass36Y r19 = this.A0Y;
                                            AnonymousClass5ZU r10 = this.A0J;
                                            C620733j r28 = this.A0S;
                                            C48952fk r25 = this.A0L;
                                            C52472lX r18 = this.A0m;
                                            C53202mi r17 = this.A0n;
                                            AnonymousClass30N r16 = this.A0j;
                                            C56422rx r15 = this.A0I;
                                            AnonymousClass33p r14 = this.A0R;
                                            C116985rC r9 = this.A04;
                                            C56892sj r8 = this.A0W;
                                            C47052cd r7 = this.A0p;
                                            HashSet A15 = AnonymousClass0x9.A15(hashMap.values());
                                            C95814uZ A013 = AnonymousClass3ZH.A01(r2);
                                            AnonymousClass64F r52 = this.A08;
                                            C835748y r42 = this.A07;
                                            C50222hp r33 = this.A0s;
                                            C45042Yl r29 = this.A0t;
                                            C56982ss r1 = this.A0T;
                                            C56982ss r292 = r1;
                                            C56892sj r30 = r8;
                                            AnonymousClass36Y r31 = r19;
                                            AnonymousClass5Y0 r322 = r20;
                                            AnonymousClass1VX r332 = r26;
                                            AnonymousClass4FV r34 = r222;
                                            AnonymousClass30N r35 = r16;
                                            C52472lX r36 = r18;
                                            C53202mi r37 = r17;
                                            C47052cd r38 = r7;
                                            C50222hp r39 = r33;
                                            C45042Yl r40 = r29;
                                            AnonymousClass4FS r41 = r23;
                                            C56422rx r232 = r15;
                                            return AnonymousClass5ZW.A00(r12, r9, new C111285hq(r12), r42, r52, r24, r21, r11, r232, r10, r25, r27, r14, r28, r292, r30, r31, r322, r332, r34, r35, r36, r37, r38, r39, r40, r41, AnonymousClass5ZW.A01(r12, r11, r10, A013, A15), A15, true);
                                        }
                                    }
                                    Log.e("conversation/dialog/delete no messages");
                                } else if (i7 == 17) {
                                    C009707r r43 = this.A03;
                                    A002 = AnonymousClass5V0.A00(r43);
                                    Object[] objArr3 = new Object[1];
                                    AnonymousClass000.A1P(objArr3, 65536, 0);
                                    C86624Kv.A0i(r43, A002, objArr3, R.string.f11nameremoved);
                                    C1235268t.A03(A002, this, 57, R.string.f11nameremoved);
                                    i2 = R.string.f11nameremoved;
                                    i4 = 50;
                                } else if (i7 == 25) {
                                    C89654ea r102 = (C89654ea) this.A03;
                                    C111095hX r92 = this.A05;
                                    C66433Lk r142 = this.A0u;
                                    return AnonymousClass59s.A00(r92, r102, new C85634Ha(r102, this.A0R, 25, 0), this.A0M, this.A0o, r142, true);
                                } else if (i7 == 19) {
                                    C89654ea r44 = (C89654ea) this.A03;
                                    C111095hX r310 = this.A05;
                                    C66433Lk r82 = this.A0u;
                                    return AnonymousClass59s.A00(r310, r44, new C85634Ha(r44, this.A0R, 19, 0), this.A0M, this.A0o, r82, false);
                                } else if (i7 == 23) {
                                    C89654ea r103 = (C89654ea) this.A03;
                                    C111095hX r93 = this.A05;
                                    C66433Lk r143 = this.A0u;
                                    return AnonymousClass59s.A00(r93, r103, new C85634Ha(r103, this.A0R, 23, 1), this.A0M, this.A0o, r143, true);
                                } else if (i7 == 24) {
                                    C89654ea r104 = (C89654ea) this.A03;
                                    C111095hX r94 = this.A05;
                                    C66433Lk r144 = this.A0u;
                                    return AnonymousClass59s.A00(r94, r104, new C85634Ha(r104, this.A0R, 24, 1), this.A0M, this.A0o, r144, false);
                                } else if (i7 != 30 || (A012 = AnonymousClass34R.A01(this.A0o)) == null) {
                                    return null;
                                } else {
                                    AnonymousClass1VX r262 = this.A0g;
                                    C009707r r64 = this.A03;
                                    C69263Wi r182 = this.A0A;
                                    AnonymousClass33S r13 = this.A0q;
                                    C66663Mh r122 = this.A0B;
                                    C620733j r233 = this.A0S;
                                    AnonymousClass5ZU r112 = this.A0J;
                                    C64773Ex r105 = this.A0H;
                                    C66493Lq r95 = this.A0k;
                                    C66503Lr r83 = this.A0l;
                                    AnonymousClass5TS r152 = new AnonymousClass5TS((View) null, (C89654ea) r64, r182, r122, this.A0G, r105, r112, r233, this.A0V, this.A0W, r262, r95, r83, A012, r13);
                                    C56612sH r172 = this.A0Q;
                                    C105895Wv r162 = this.A0w;
                                    C55682qk r153 = this.A06;
                                    AnonymousClass5Y0 r132 = this.A0e;
                                    C27821ej r113 = this.A0d;
                                    C620633i r106 = this.A0P;
                                    AnonymousClass5IY r96 = this.A0c;
                                    EmojiSearchProvider emojiSearchProvider = this.A0f;
                                    AnonymousClass33p r45 = this.A0R;
                                    C60152y5 r311 = this.A0r;
                                    AnonymousClass487 r84 = this.A0b;
                                    C107365bC r0 = new C107365bC(r152, 1);
                                    C105895Wv r282 = r162;
                                    C009707r r133 = r64;
                                    C89014bL r123 = new C89014bL(r133, r153, r182, r106, r172, r45, r233, r0, r84, r96, r113, r132, emojiSearchProvider, r262, r311, r282, "", 30, R.string.f11nameremoved, Math.max(0, r122.A03(C66663Mh.A1v)), R.string.f11nameremoved, R.string.f11nameremoved, 16385);
                                    r123.A05 = false;
                                    return r123;
                                }
                                return null;
                            }
                        }
                        onClickListener = C1235268t.A00(this, i4);
                    }
                    C1235268t.A03(r5, this, i6, i5);
                }
                r5.A0W(onClickListener, i2);
            }
            return r5.create();
        }
    }

    public void onActivityDestroyed(Activity activity) {
        super.onActivityDestroyed(activity);
        this.A02 = null;
        C33601tO r1 = this.A00;
        if (r1 != null) {
            r1.A01 = null;
            r1.A00 = null;
            r1.A0D(true);
            this.A00 = null;
        }
    }

    public C89864fP(C009707r r4, C116985rC r5, C111095hX r6, C55682qk r7, C835748y r8, AnonymousClass64F r9, AnonymousClass4FU r10, C69263Wi r11, C66663Mh r12, AnonymousClass5Z5 r13, C50382i5 r14, C621033m r15, C56962sq r16, C29441ip r17, C64773Ex r18, C56422rx r19, AnonymousClass5ZU r20, AnonymousClass5ZU r21, C48952fk r22, C53602nM r23, C104905Su r24, AnonymousClass30W r25, C620633i r26, C56612sH r27, AnonymousClass33p r28, C620733j r29, C56982ss r30, C66473Lo r31, C28891hw r32, C56892sj r33, C56152rV r34, AnonymousClass36Y r35, C1228766e r36, C100405Au r37, AnonymousClass487 r38, AnonymousClass5IY r39, C27821ej r40, AnonymousClass5Y0 r41, EmojiSearchProvider emojiSearchProvider, AnonymousClass1VX r43, AnonymousClass3LP r44, AnonymousClass4FV r45, AnonymousClass30N r46, C66493Lq r47, C66503Lr r48, C52472lX r49, C53202mi r50, C95814uZ r51, C47052cd r52, AnonymousClass33S r53, C60152y5 r54, C50222hp r55, C45042Yl r56, C66433Lk r57, C104355Qq r58, C105895Wv r59, AnonymousClass4FS r60) {
        this.A03 = r4;
        this.A0Q = r27;
        this.A0g = r43;
        this.A0D = r14;
        this.A0w = r59;
        this.A0A = r11;
        this.A06 = r7;
        this.A0x = r60;
        this.A0i = r45;
        this.A0T = r30;
        this.A0e = r41;
        this.A0q = r53;
        this.A0B = r12;
        this.A0E = r15;
        this.A0h = r44;
        this.A0d = r40;
        this.A05 = r6;
        this.A0H = r18;
        this.A0Y = r35;
        this.A0u = r57;
        this.A0P = r26;
        this.A0J = r20;
        this.A0S = r29;
        this.A0c = r39;
        this.A0F = r16;
        this.A0k = r47;
        this.A0l = r48;
        this.A0X = r34;
        this.A0L = r22;
        this.A0m = r49;
        this.A0O = r25;
        this.A0n = r50;
        this.A0C = r13;
        this.A0j = r46;
        this.A04 = r5;
        this.A0f = emojiSearchProvider;
        this.A0I = r19;
        this.A0R = r28;
        this.A0K = r21;
        this.A0M = r23;
        this.A0V = r32;
        this.A0N = r24;
        this.A0v = r58;
        this.A0W = r33;
        this.A0r = r54;
        this.A0G = r17;
        this.A0U = r31;
        this.A0p = r52;
        this.A0b = r38;
        this.A0t = r56;
        this.A09 = r10;
        this.A08 = r9;
        this.A07 = r8;
        C1228766e r2 = r36;
        this.A0Z = r2;
        this.A0s = r55;
        this.A0o = r51;
        this.A0a = r37;
        this.A02 = new C70343aL(this, r10, r2, 18);
    }
}

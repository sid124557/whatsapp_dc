package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.33m  reason: invalid class name and case insensitive filesystem */
public class C621033m {
    public final C55682qk A00;
    public final C159027ky A01;
    public final C69263Wi A02;
    public final AnonymousClass32O A03;
    public final C56972sr A04;
    public final AnonymousClass36E A05;
    public final C56352rq A06;
    public final C66663Mh A07;
    public final C56492s4 A08;
    public final C46292bO A09;
    public final AnonymousClass3DP A0A;
    public final C29411im A0B;
    public final C50422i9 A0C;
    public final C620433g A0D;
    public final C56192ra A0E;
    public final C153167am A0F;
    public final C623434q A0G;
    public final C56962sq A0H;
    public final C46342bT A0I;
    public final AnonymousClass4F4 A0J;
    public final C56942so A0K;
    public final C65203Gp A0L;
    public final C64773Ex A0M;
    public final C47882dz A0N;
    public final C56642sK A0O;
    public final AnonymousClass5ZU A0P;
    public final C54122oD A0Q;
    public final AnonymousClass314 A0R;
    public final C44382Vv A0S;
    public final C56512s6 A0T;
    public final C620633i A0U;
    public final C56612sH A0V;
    public final C54292oU A0W;
    public final C57162tC A0X;
    public final AnonymousClass5ZR A0Y;
    public final AnonymousClass33p A0Z;
    public final C620733j A0a;
    public final C61072zf A0b;
    public final C22931Qq A0c;
    public final C53412n3 A0d;
    public final C50202hn A0e;
    public final AnonymousClass2ZV A0f;
    public final C52852m9 A0g;
    public final C56542sA A0h;
    public final C56982ss A0i;
    public final C66473Lo A0j;
    public final C28891hw A0k;
    public final C66543Lv A0l;
    public final AnonymousClass30G A0m;
    public final C55672qj A0n;
    public final AnonymousClass313 A0o;
    public final C55412qJ A0p;
    public final C56892sj A0q;
    public final AnonymousClass2Y3 A0r;
    public final C56152rV A0s;
    public final C54762pF A0t;
    public final C29431io A0u;
    public final C55332qB A0v;
    public final C59972xn A0w;
    public final C55622qe A0x;
    public final C55292q7 A0y;
    public final AnonymousClass311 A0z;
    public final C50562iN A10;
    public final AnonymousClass2W8 A11;
    public final C48042eF A12;
    public final AnonymousClass36Y A13;
    public final C104395Qu A14;
    public final AnonymousClass2WE A15;
    public final C54922pV A16;
    public final C59652xG A17;
    public final AnonymousClass1VX A18;
    public final AnonymousClass3LP A19;
    public final AnonymousClass4FV A1A;
    public final C54602oz A1B;
    public final C66493Lq A1C;
    public final C66503Lr A1D;
    public final AnonymousClass33K A1E;
    public final C106685Zz A1F;
    public final C621233o A1G;
    public final C55972rD A1H;
    public final C56232re A1I;
    public final AnonymousClass2H2 A1J;
    public final AnonymousClass2WW A1K;
    public final C54882pR A1L;
    public final C620133d A1M;
    public final C162287rd A1N;
    public final AnonymousClass2RO A1O;
    public final C54462ol A1P;
    public final AnonymousClass31C A1Q;
    public final AnonymousClass33S A1R;
    public final C45342Zq A1S;
    public final C619933b A1T;
    public final AnonymousClass5ZC A1U = new AnonymousClass5ZC(1, 10);
    public final C40672Hh A1V;
    public final C49652gs A1W;
    public final AnonymousClass35J A1X;
    public final C45452a2 A1Y;
    public final C40822Hw A1Z;
    public final C44642Wx A1a;
    public final C45012Yi A1b;
    public final C45022Yj A1c;
    public final C41872Lx A1d;
    public final C50222hp A1e;
    public final C45042Yl A1f;
    public final C58742vk A1g;
    public final C29011i8 A1h;
    public final AnonymousClass1R1 A1i;
    public final AnonymousClass2X0 A1j;
    public final C113995mK A1k;
    public final C55732qp A1l;
    public final C56932sn A1m;
    public final C97144xh A1n;
    public final C55832qz A1o;
    public final C105025Tg A1p;
    public final C989053r A1q;
    public final AnonymousClass4FS A1r;
    public final JniBridge A1s;
    public final C183538qC A1t;
    public final C183538qC A1u;
    public final C183538qC A1v;
    public final C183538qC A1w;
    public final C183538qC A1x;
    public final C183538qC A1y;
    public final C183538qC A1z;
    public final C183538qC A20;
    public final C183538qC A21;
    public final C183538qC A22;

    public void A08(AnonymousClass30M r10, byte[] bArr, boolean z, boolean z2) {
        A02(r10, (AnonymousClass65N) null, (C30471mV) null, (Integer) null, bArr, false, z, z2);
    }

    public final void A0A(AnonymousClass5Ul r12, C108845de r13, String str, List list, List list2, boolean z) {
        ArrayList arrayList;
        String str2 = str;
        List list3 = list;
        List list4 = list2;
        if (str == null || list.size() > 1 || !AnonymousClass000.A1W(C627336j.A03(list4))) {
            arrayList = Collections.emptyList();
        } else {
            ArrayList A0s2 = AnonymousClass001.A0s();
            Object obj = null;
            for (Object next : list4) {
                if (next instanceof C135166kE) {
                    obj = next;
                } else {
                    A0s2.add(next);
                }
            }
            Pair A0C2 = AnonymousClass0x9.A0C(A0s2, obj);
            list4 = (List) A0C2.first;
            ArrayList A0s3 = AnonymousClass001.A0s();
            Object obj2 = A0C2.second;
            arrayList = A0s3;
            if (obj2 != null) {
                A0s3.add(obj2);
                arrayList = A0s3;
            }
        }
        AnonymousClass5Ul r4 = r12;
        C108845de r5 = r13;
        boolean z2 = z;
        A0B(r4, r5, str2, list3, arrayList, z2, false);
        A0B(r4, r5, str2, list3, list4, z2, true);
    }

    public void A0C(C66513Ls r16, C108845de r17, C624134x r18, String str, List list, List list2, boolean z, boolean z2) {
        A03(r16, r17, (C55162pu) null, (AnonymousClass2U8) null, r18, (C55592qb) null, (C85104Ey) null, (Integer) null, str, list, list2, z, z2, false);
    }

    public final void A0Q(C624134x r11, int i, int i2) {
        if (i == 1 && i2 <= 0) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("UserActions/userActionPinInChatMessage Pinning must expire ");
            A0o2.append(i2);
            C18270x1.A0z(A0o2);
        }
        AnonymousClass2z0 r1 = r11.A1J;
        C52042kn r8 = new C52042kn(r11.A0o(), r1);
        long j = r11.A1L;
        C40672Hh r9 = this.A1V;
        C95814uZ A012 = AnonymousClass2z0.A01(r1);
        C56612sH r0 = this.A0V;
        long A0H2 = r0.A0H();
        long A0H3 = r0.A0H();
        C162457s7.A0J(A012, 0);
        C30561me r6 = new C30561me(AnonymousClass35J.A01(A012, r9.A00), A0H2);
        r6.A00 = i;
        r6.A01 = A0H3;
        r6.A05 = r8;
        r6.A02 = j;
        if (r6 instanceof C30561me) {
            r6.A00 = i2;
            r6.A1w();
        }
        this.A10.A00(r6);
    }

    public void A0R(C624134x r20, int i, boolean z, boolean z2) {
        Boolean bool;
        int i2;
        long j;
        int i3 = 0;
        boolean z3 = z;
        C624134x r4 = r20;
        try {
            r4.A07 = AnonymousClass000.A1S(z3 ? 1 : 0) ? 1 : 0;
            this.A0o.A0B(r4);
            C104395Qu r10 = this.A14;
            C25801b6 r9 = new C25801b6();
            C30551md r1 = r4.A1S;
            if (r1 != null) {
                r9.A09 = AnonymousClass0x9.A0m(r1.A00);
            }
            boolean z4 = false;
            if (z) {
                r9.A04 = 1;
            } else {
                r9.A04 = 2;
                Long l = r4.A0r;
                long currentTimeMillis = System.currentTimeMillis();
                if (l != null) {
                    long longValue = l.longValue();
                    r9.A03 = Boolean.valueOf(AnonymousClass0x7.A1P((longValue > System.currentTimeMillis() ? 1 : (longValue == System.currentTimeMillis() ? 0 : -1))));
                    if (longValue <= currentTimeMillis) {
                        j = 0;
                    } else {
                        j = longValue - currentTimeMillis;
                    }
                    r9.A0B = Long.valueOf(j);
                }
                if (r1 != null) {
                    r9.A0A = AnonymousClass0x9.A0m(Math.round((((float) (currentTimeMillis - r1.A02)) / 1000.0f) / 3600.0f));
                }
            }
            r9.A06 = Integer.valueOf(i);
            r9.A0D = AnonymousClass0x2.A0U();
            r9.A07 = Integer.valueOf(C624134x.A05(r4));
            AnonymousClass2z0 r0 = r4.A1J;
            C95814uZ r6 = r0.A00;
            if (r6 != null) {
                C56982ss r12 = r10.A04;
                C64773Ex r5 = r10.A02;
                r9.A08 = AnonymousClass0x9.A0m(AnonymousClass352.A00(r5, r12, r6));
                if (C627336j.A0K(r6)) {
                    C56892sj r122 = r10.A05;
                    GroupJid groupJid = (GroupJid) r6;
                    boolean A0C2 = r122.A0C(groupJid);
                    boolean A0D2 = r122.A0D(groupJid);
                    if (A0C2 && A0D2) {
                        z4 = true;
                    }
                    r9.A02 = Boolean.valueOf(z4);
                    bool = Boolean.TRUE;
                } else {
                    bool = Boolean.FALSE;
                }
                r9.A01 = bool;
                if (r0.A02) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                r9.A05 = i2;
                AnonymousClass3ZH A072 = r5.A07(r6);
                if ((r6 instanceof C27991fJ) && A072 != null) {
                    r9.A00 = Boolean.valueOf(r10.A08.A0e(A072, (C27991fJ) r6));
                }
                r9.A0E = r10.A07.A04(r6.getRawString());
            }
            r10.A06.BhD(r9);
            C52042kn r11 = new C52042kn(r4.A0o(), r0);
            long j2 = r4.A1L;
            C626936e.A06(r6);
            C56612sH r52 = this.A0V;
            long A0H2 = r52.A0H();
            AnonymousClass2z0 A042 = this.A1X.A04(r6, true);
            boolean A1S2 = AnonymousClass000.A1S(z3);
            C30551md r92 = new C30551md(A042, r11, A1S2 ? 1 : 0, A0H2, j2, r52.A0H());
            if (z2 && !z) {
                r92.A1V = true;
            }
            if (r0.A02 && !z) {
                i3 = 7;
            }
            r92.A01 = i3;
            r4.A1S = r92;
            r4.A07 = r92.A01;
            this.A10.A00(r92);
        } catch (SQLiteException e) {
            r4.A07 = z ^ true ? 1 : 0;
            Log.d(AnonymousClass000.A0a("UserActions/userActionKeepInChat ", AnonymousClass001.A0o(), e));
            this.A02.A0S(new C71703cX(4, (Object) this, z3));
        }
    }

    public void A0S(C624134x r5, C30441mS r6) {
        UserJid userJid;
        if (!AnonymousClass000.A1U(r5.A0A & 1, 1)) {
            C183538qC r1 = this.A1v;
            if (C18320x8.A0I(r1).A04(r5)) {
                AnonymousClass3ZM[] r3 = new AnonymousClass3ZM[1];
                C56722sS A0I2 = C18320x8.A0I(r1);
                if (r5.A1k()) {
                    userJid = A0I2.A00(r5.A18);
                } else {
                    userJid = null;
                }
                r6.A1g(AnonymousClass0x9.A1A(new AnonymousClass3ZM(userJid, (String) null), r3, 0));
            }
        }
    }

    public void A0U(C624134x r8, String str, String str2, String str3, String str4, List list, byte[] bArr) {
        Log.d("UserActions/userActionSendShopStorefrontMessages");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C30791n7 r4 = new C30791n7(this.A1X.A04(C18300x5.A0P(it), true), (byte) 55, this.A0V.A0H());
            AnonymousClass39A r2 = new AnonymousClass39A(str2, bArr, str3);
            C162457s7.A0J(str, 1);
            r4.Blz(new AnonymousClass39W(r2, new C632938r(str, 1, 1), str4));
            A0O(r4);
            if (r8 != null) {
                this.A1a.A00(r4, r8);
            }
            this.A0l.A0V(r4);
            C24421Xi r42 = new C24421Xi();
            r42.A00 = C18290x4.A0d();
            r42.A01 = 33;
            this.A1A.Bh7(r42, new AnonymousClass5ZC(1, 1), false);
        }
    }

    public static /* synthetic */ void A00(Uri uri, C111095hX r10, C621033m r11, C30471mV r12, WeakReference weakReference) {
        String str;
        String A032;
        Intent intent;
        int i;
        r11.A02.A0D();
        if (weakReference.get() != null) {
            Context context = (Context) weakReference.get();
            boolean A1U2 = C18280x3.A1U(r12.A06, 127);
            C56972sr r7 = r11.A04;
            byte b = r12.A1I;
            if (b == 23) {
                str = ((C30771mz) r12).A09;
            } else if (b != 44) {
                if (b == 1) {
                    i = R.string.f11nameremoved;
                } else if (b == 2) {
                    i = R.string.f11nameremoved;
                } else if (b == 3) {
                    i = R.string.f11nameremoved;
                } else if (b != 9) {
                    i = R.string.f11nameremoved;
                    if (b != 13) {
                        i = R.string.f11nameremoved;
                    }
                } else {
                    i = R.string.f11nameremoved;
                }
                str = AnonymousClass002.A0F(context, r7.A0D.A03(), AnonymousClass002.A0L(), 0, i);
            } else {
                str = ((C30821nD) r12).A08;
            }
            C620733j r1 = r11.A0a;
            if (AnonymousClass353.A04(r12)) {
                A032 = AnonymousClass353.A00(r12);
            } else if (b != 44) {
                A032 = r12.A1w();
            } else {
                A032 = C107315b6.A03(r1, (C30821nD) r12);
            }
            String A002 = AnonymousClass29L.A00(r11.A00, r12);
            Intent A092 = AnonymousClass0x9.A09("android.intent.action.SEND");
            A092.setType(A002);
            if (!TextUtils.isEmpty(str)) {
                A092.putExtra("android.intent.extra.SUBJECT", str);
            }
            if (!TextUtils.isEmpty(A032)) {
                A092.putExtra("android.intent.extra.TEXT", A032);
            }
            A092.putExtra("origin", 3);
            A092.putExtra("android.intent.extra.STREAM", uri);
            if (Build.VERSION.SDK_INT >= 29 || !A1U2) {
                intent = Intent.createChooser(A092, (CharSequence) null);
            } else {
                ArrayList A0s2 = AnonymousClass001.A0s();
                List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(A092, 0);
                if (queryIntentActivities != null) {
                    for (ResolveInfo resolveInfo : queryIntentActivities) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        String str2 = activityInfo.name;
                        String str3 = activityInfo.applicationInfo.packageName;
                        Intent intent2 = new Intent(A092);
                        intent2.setClassName(str3, str2);
                        intent2.setPackage(str3);
                        A0s2.add(intent2);
                    }
                }
                Iterator it = A0s2.iterator();
                while (it.hasNext()) {
                    Intent intent3 = (Intent) it.next();
                    if ("com.whatsapp".equals(intent3.getPackage()) || "com.whatsapp.w4b".equals(intent3.getPackage())) {
                        intent3.putExtra("enforce_hfm_limit", A1U2);
                    }
                }
                intent = C107395bF.A01((IntentSender) null, (CharSequence) null, A0s2);
            }
            intent.setFlags(1);
            r10.A0A(context, intent);
        }
    }

    public final C30481mW A01(C66513Ls r12, C108845de r13, C95814uZ r14, AnonymousClass2U8 r15, C624134x r16, C55592qb r17, String str, List list, boolean z, boolean z2, boolean z3) {
        long A0H2;
        AnonymousClass3YN r6;
        C45022Yj r3;
        Log.d("UserActions/createFMessageTextFromUserInputs");
        C95814uZ r4 = r14;
        boolean z4 = r14 instanceof C135166kE;
        String str2 = str;
        if (z4) {
            boolean A092 = C107415bH.A09(r12, C107415bH.A02(this.A1F, str2));
            C42982Qh r1 = new C42982Qh(r12);
            r1.A02 = A092;
            r1.A01 = true;
            if (r1.A03 == null) {
                new AnonymousClass3YM
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0026: CONSTRUCTOR  (r6v7 ? I:X.3YM) =  call: X.3YM.<init>():void type: CONSTRUCTOR in method: X.33m.A01(X.3Ls, X.5de, X.4uZ, X.2U8, X.34x, X.2qb, java.lang.String, java.util.List, boolean, boolean, boolean):X.1mW, dex: classes2.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r6v7 ?
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 39 more
                    */
                /*
                    this = this;
                    java.lang.String r0 = "UserActions/createFMessageTextFromUserInputs"
                    com.whatsapp.util.Log.d((java.lang.String) r0)
                    r4 = r14
                    boolean r2 = r14 instanceof X.C135166kE
                    r7 = r18
                    if (r2 == 0) goto L_0x00a1
                    X.5Zz r0 = r11.A1F
                    int r0 = X.C107415bH.A02(r0, r7)
                    boolean r0 = X.C107415bH.A09(r12, r0)
                    X.2Qh r1 = new X.2Qh
                    r1.<init>(r12)
                    r1.A02 = r0
                    r0 = 1
                    r1.A01 = r0
                    X.3Ls r0 = r1.A03
                    if (r0 != 0) goto L_0x009b
                    X.3YM r6 = new X.3YM
                    r6.<init>()
                L_0x0029:
                    X.2Yj r3 = r11.A1c
                    X.2sH r0 = r11.A0V
                    long r9 = r0.A0H()
                L_0x0031:
                    r5 = r16
                    r8 = r19
                    X.1mW r3 = r3.A00(r4, r5, r6, r7, r8, r9)
                    r0 = r17
                    if (r17 == 0) goto L_0x0040
                    r3.A1W(r0)
                L_0x0040:
                    if (r15 == 0) goto L_0x0045
                    r3.A1P(r15)
                L_0x0045:
                    r11.A0O(r3)
                    if (r20 == 0) goto L_0x004e
                    r0 = 4
                    r3.A1B(r0)
                L_0x004e:
                    if (r21 == 0) goto L_0x0054
                    r0 = 2
                    r3.A1B(r0)
                L_0x0054:
                    if (r2 == 0) goto L_0x0096
                    com.whatsapp.TextData r1 = new com.whatsapp.TextData
                    r1.<init>()
                    int r0 = X.C107415bH.A00()
                    r1.backgroundColor = r0
                    r0 = -1
                    r1.textColor = r0
                    r0 = 0
                    r1.fontStyle = r0
                    r3.A1x(r1)
                    java.lang.String r0 = r3.A13()
                    java.lang.String r0 = X.C107415bH.A07(r0)
                    r3.A1Z(r0)
                    X.C626936e.A06(r13)
                    r3.A0O = r13
                    if (r13 == 0) goto L_0x0080
                    int r0 = r13.A00
                    r3.A0E = r0
                L_0x0080:
                    X.36Y r2 = r11.A13
                    X.2hp r1 = r11.A1e
                    X.2Yl r0 = r11.A1f
                    int r5 = X.AnonymousClass29K.A01(r2, r3, r1, r0)
                    X.5mK r2 = r11.A1k
                    java.lang.String r4 = "request"
                    r6 = 0
                    r8 = 0
                    r9 = r8
                    r2.A08(r3, r4, r5, r6, r8, r9)
                L_0x0096:
                    r0 = r22
                    r3.A1U = r0
                    return r3
                L_0x009b:
                    X.3YN r6 = new X.3YN
                    r6.<init>(r1)
                    goto L_0x0029
                L_0x00a1:
                    X.2sH r0 = r11.A0V
                    long r9 = r0.A0H()
                    r11.A05(r9)
                    X.2Qh r1 = new X.2Qh
                    r1.<init>(r12)
                    X.3Ls r0 = r1.A03
                    if (r0 != 0) goto L_0x00bc
                    X.3YM r6 = new X.3YM
                    r6.<init>()
                L_0x00b8:
                    X.2Yj r3 = r11.A1c
                    goto L_0x0031
                L_0x00bc:
                    X.3YN r6 = new X.3YN
                    r6.<init>(r1)
                    goto L_0x00b8
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C621033m.A01(X.3Ls, X.5de, X.4uZ, X.2U8, X.34x, X.2qb, java.lang.String, java.util.List, boolean, boolean, boolean):X.1mW");
            }

            public void A06(Activity activity, C111095hX r13, C624134x r14) {
                String str;
                File file;
                if (!(r14 instanceof C30471mV)) {
                    str = "UserActions/userActionShare/app/share/message-is-not-media-message";
                } else {
                    C30471mV r8 = (C30471mV) r14;
                    AnonymousClass33C r0 = r8.A01;
                    if (r0 == null || (file = r0.A0F) == null || !file.exists()) {
                        str = "UserActions/userActionShare/app/share/media-does-not-exist";
                    } else {
                        AnonymousClass4FS r4 = this.A1r;
                        C70173a4.A00(r4, r14, this, 43);
                        WeakReference A142 = AnonymousClass0x9.A14(activity);
                        C69263Wi r3 = this.A02;
                        r3.A0G(0, R.string.f11nameremoved);
                        C55682qk r2 = this.A00;
                        C48042eF r02 = this.A12;
                        C86214Jg r5 = new C86214Jg(r13, this, r8, A142, 0);
                        AnonymousClass1I3 r1 = new AnonymousClass1I3(r2, r02, r8);
                        r1.A04(r5, r3.A08);
                        r4.BkM(r1);
                        return;
                    }
                }
                Log.w(str);
                C69263Wi r22 = this.A02;
                boolean A012 = C61072zf.A01();
                int i = R.string.f11nameremoved;
                if (A012) {
                    i = R.string.f11nameremoved;
                }
                r22.A0H(i, 0);
            }

            public void A07(C89654ea r11, C30471mV r12, boolean z) {
                AnonymousClass4EV r2;
                C56512s6 r6 = this.A0T;
                C61072zf r7 = this.A0b;
                C89654ea r3 = r11;
                if (r6.A08(new AnonymousClass3FE(r11, r7))) {
                    if (z) {
                        boolean z2 = r12 instanceof C30771mz;
                        C69263Wi r4 = this.A02;
                        AnonymousClass4FV r9 = this.A1A;
                        AnonymousClass5ZU r5 = this.A0P;
                        AnonymousClass3ZH A032 = C627636p.A03(this.A0j, r12);
                        if (z2) {
                            r2 = new C28141fl(r3, r4, r5, r6, r7, A032, r9);
                        } else {
                            r2 = new AnonymousClass3QL(r3, r4, r5, r6, r7, A032, r9);
                        }
                    } else {
                        r2 = null;
                    }
                    this.A1M.A06(r2, r12, 0);
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: X.4uZ} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: X.4uZ} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void A0D(X.C95814uZ r5) {
                /*
                    r4 = this;
                    if (r5 == 0) goto L_0x0028
                    boolean r0 = r5 instanceof X.AnonymousClass1fS
                    if (r0 != 0) goto L_0x0028
                    boolean r0 = r5 instanceof X.C95804uY
                    if (r0 != 0) goto L_0x0028
                    X.2sr r0 = r4.A04
                    boolean r0 = r0.A0a(r5)
                    if (r0 != 0) goto L_0x0028
                    X.32O r0 = r4.A03
                    android.os.Handler r3 = r0.A00
                    r2 = 0
                    java.util.HashMap r1 = r0.A06
                    java.lang.Object r0 = r1.get(r5)
                    if (r0 == 0) goto L_0x0029
                    r5 = r0
                L_0x0020:
                    r0 = 1
                    android.os.Message r0 = r3.obtainMessage(r0, r2, r2, r5)
                    r0.sendToTarget()
                L_0x0028:
                    return
                L_0x0029:
                    r1.put(r5, r5)
                    goto L_0x0020
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C621033m.A0D(X.4uZ):void");
            }

            public final void A0E(C95814uZ r4) {
                AnonymousClass1R1 r2 = this.A1i;
                if (r2.A0i(r4)) {
                    C65203Gp r1 = this.A0L;
                    Set A062 = r1.A06(r4, false);
                    r2.A0N(r4);
                    r1.A0O(A062);
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: X.4uZ} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: X.4uZ} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void A0F(X.C95814uZ r5, int r6) {
                /*
                    r4 = this;
                    if (r5 == 0) goto L_0x0027
                    boolean r0 = r5 instanceof X.AnonymousClass1fS
                    if (r0 != 0) goto L_0x0027
                    boolean r0 = r5 instanceof X.C95804uY
                    if (r0 != 0) goto L_0x0027
                    X.2sr r0 = r4.A04
                    boolean r0 = r0.A0a(r5)
                    if (r0 != 0) goto L_0x0027
                    X.32O r0 = r4.A03
                    android.os.Handler r3 = r0.A00
                    r2 = 0
                    java.util.HashMap r1 = r0.A06
                    java.lang.Object r0 = r1.get(r5)
                    if (r0 == 0) goto L_0x0028
                    r5 = r0
                L_0x0020:
                    android.os.Message r0 = r3.obtainMessage(r2, r2, r6, r5)
                    r0.sendToTarget()
                L_0x0027:
                    return
                L_0x0028:
                    r1.put(r5, r5)
                    goto L_0x0020
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C621033m.A0F(X.4uZ, int):void");
            }

            /* JADX WARNING: Removed duplicated region for block: B:11:0x003a  */
            /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void A0G(X.C95814uZ r22, X.C624134x r23, X.AnonymousClass39M r24, java.lang.Integer r25, boolean r26) {
                /*
                    r21 = this;
                    X.33C r9 = new X.33C
                    r9.<init>()
                    r6 = r24
                    java.lang.String r2 = r6.A09
                    if (r2 == 0) goto L_0x0038
                    int r1 = r6.A01
                    r0 = 3
                    if (r1 != r0) goto L_0x0032
                    android.net.Uri r8 = android.net.Uri.parse(r2)
                L_0x0014:
                    int r0 = r6.A00
                    long r3 = (long) r0
                    r1 = 1048576(0x100000, double:5.180654E-318)
                    int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                    r4 = r21
                    if (r0 <= 0) goto L_0x003a
                    X.2oU r0 = r4.A0W
                    android.content.Context r1 = r0.A00
                    r0 = 2131894011(0x7f121efb, float:1.9422815E38)
                    java.lang.String r2 = r1.getString(r0)
                    X.3Wi r1 = r4.A02
                    r0 = 1
                    r1.A0P(r2, r0)
                    return
                L_0x0032:
                    java.io.File r0 = X.AnonymousClass002.A0B(r2)
                    r9.A0F = r0
                L_0x0038:
                    r8 = 0
                    goto L_0x0014
                L_0x003a:
                    int r0 = r6.A03
                    r9.A08 = r0
                    int r0 = r6.A02
                    r9.A06 = r0
                    X.2rD r7 = r4.A1H
                    r3 = 0
                    r17 = 20
                    r10 = 0
                    r14 = r10
                    r15 = r10
                    r16 = r10
                    r18 = r3
                    r11 = r22
                    r12 = r23
                    r20 = r26
                    r13 = r10
                    r19 = r3
                    X.1mV r5 = r7.A04(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                    X.1nE r5 = (X.AnonymousClass1nE) r5
                    java.lang.String r0 = r6.A0D
                    r5.A04 = r0
                    java.lang.String r0 = r6.A0C
                    r5.A05 = r0
                    if (r0 != 0) goto L_0x006b
                    java.lang.String r0 = "image/webp"
                    r5.A05 = r0
                L_0x006b:
                    X.330 r0 = r6.A04
                    r5.A04 = r0
                    r0 = r25
                    r5.A05 = r0
                    boolean r2 = r6.A0L
                    boolean r1 = r6.A0H
                    boolean r0 = r6.A0J
                    if (r1 == 0) goto L_0x007d
                    r2 = r2 | 2
                L_0x007d:
                    if (r0 == 0) goto L_0x0081
                    r2 = r2 | 4
                L_0x0081:
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
                    r5.A00 = r0
                    java.util.List r1 = java.util.Collections.singletonList(r5)
                    X.30M r0 = new X.30M
                    r0.<init>(r1)
                    r4.A08(r0, r10, r3, r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C621033m.A0G(X.4uZ, X.34x, X.39M, java.lang.Integer, boolean):void");
            }

            public void A0J(C95814uZ r6, String str, String str2, String str3, String str4, long j) {
                AnonymousClass39N r4;
                C31901p2 r3 = new C31901p2(AnonymousClass35J.A01(r6, this.A1X), this.A0V.A0H());
                C624134x A002 = C55122pp.A00(this.A1o, j);
                if (A002 != null) {
                    this.A1a.A00(r3, A002);
                }
                if (str4 == null || str4.equals("1")) {
                    r4 = new AnonymousClass39N((AnonymousClass22W) null, new AnonymousClass397(str2, str3), str);
                } else {
                    String string = C54292oU.A00(this.A0W).getString(R.string.f11nameremoved);
                    r4 = new AnonymousClass39N(AnonymousClass22W.EXTENSIONS_1, new AnonymousClass397(str2, str3), string);
                }
                r3.A00 = r4;
                this.A0l.A0V(r3);
            }

            public void A0K(C95814uZ r6, boolean z) {
                C50202hn r4 = this.A0e;
                UserJid A032 = AnonymousClass32Y.A03(r6);
                if (r4.A03.A0Y(C58422vE.A02, 2805)) {
                    r4.A01(A032, 24);
                }
                A0L(r6, z, true);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:68:0x023a, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:69:0x023b, code lost:
                X.AnonymousClass2A8.A00(r6, r1);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:70:0x023e, code lost:
                throw r0;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void A0L(X.C95814uZ r21, boolean r22, boolean r23) {
                /*
                    r20 = this;
                    r0 = r20
                    X.2bT r2 = r0.A0I
                    r1 = 6
                    r12 = r21
                    r2.A00(r12, r1)
                    X.3LP r10 = r0.A19
                    X.4FS r13 = r0.A1r
                    X.4FV r11 = r0.A1A
                    X.2rV r9 = r0.A0s
                    java.lang.Integer r14 = X.C18300x5.A0Z()
                    r15 = 0
                    r16 = r1
                    X.AnonymousClass31G.A01(r9, r10, r11, r12, r13, r14, r15, r16)
                    X.7am r11 = r0.A0F
                    r4 = 0
                    r17 = 5
                    r3 = 0
                    r14 = r15
                    r18 = r4
                    r13 = r15
                    r16 = r4
                    r11.A02(r12, r13, r14, r15, r16, r17, r18)
                    X.3Ex r1 = r0.A0M
                    X.3ZH r9 = r1.A07(r12)
                    X.33b r7 = r0.A1T
                    r7.A09(r12, r15)
                    X.C162457s7.A0J(r12, r4)
                    X.4uZ r1 = X.C58112uj.A00
                    boolean r1 = X.C162457s7.A0P(r1, r12)
                    if (r1 == 0) goto L_0x0043
                    X.C58112uj.A00 = r15
                L_0x0043:
                    java.util.Set r1 = X.C58112uj.A04
                    r1.remove(r12)
                    java.util.Set r1 = X.C58112uj.A03
                    r1.remove(r12)
                    X.2bO r6 = r0.A09
                    r8 = r22
                    if (r23 == 0) goto L_0x00e1
                    X.3Gp r1 = r6.A02
                    java.util.Set r2 = r1.A07(r12, r8)
                L_0x0059:
                    X.3Lv r1 = r6.A04
                    r1.A0R(r12, r8)
                    X.3Gp r1 = r6.A01
                    r1.A0O(r2)
                    if (r9 == 0) goto L_0x0177
                    boolean r1 = r9.A0U()
                    if (r1 != 0) goto L_0x0071
                    X.4uZ r1 = r9.A0H
                    boolean r1 = r1 instanceof X.AnonymousClass1fS
                    if (r1 == 0) goto L_0x0076
                L_0x0071:
                    X.3DP r1 = r0.A0A
                    r1.A06(r9)
                L_0x0076:
                    X.3DP r1 = r0.A0A
                    r1.A07(r12)
                    X.1R1 r2 = r0.A1i
                    boolean r1 = r9.A0U()
                    r2.A0Y(r12, r1)
                    r0.A0E(r12)
                    X.2ss r1 = r0.A0i
                    java.util.HashSet r1 = r1.A03
                    r1.remove(r12)
                    X.2oD r6 = r0.A0Q
                    X.4uZ r2 = X.AnonymousClass3ZH.A01(r9)
                    r1 = 1
                    r6.A00(r2, r1, r1, r1)
                    r7.A07()
                    X.3Lq r7 = r0.A1C
                    X.2bO r1 = r7.A08
                    r1.A00(r9)
                    java.lang.Class<X.1fJ> r6 = X.C27991fJ.class
                    com.whatsapp.jid.Jid r1 = r9.A0I(r6)
                    if (r1 == 0) goto L_0x00c6
                    X.2ss r2 = r7.A0S
                    java.lang.Class<com.whatsapp.jid.GroupJid> r1 = com.whatsapp.jid.GroupJid.class
                    com.whatsapp.jid.Jid r1 = r9.A0I(r1)
                    com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
                    int r2 = r2.A06(r1)
                    r1 = 1
                    if (r2 != r1) goto L_0x00c6
                    X.2so r2 = r7.A0A
                    com.whatsapp.jid.Jid r1 = r9.A0I(r6)
                    X.1fJ r1 = (X.C27991fJ) r1
                    r2.A0A(r1)
                L_0x00c6:
                    com.whatsapp.jid.UserJid r8 = X.AnonymousClass3ZH.A07(r9)
                    if (r8 == 0) goto L_0x0120
                    X.1VX r6 = r0.A18
                    r2 = 4991(0x137f, float:6.994E-42)
                    X.2vE r1 = X.C58422vE.A02
                    boolean r1 = r6.A0Y(r1, r2)
                    if (r1 != 0) goto L_0x0120
                    X.2sK r11 = r0.A0O
                    X.1vB r1 = r11.A03
                    X.4Fq r10 = X.C18630y0.A07(r1)
                    goto L_0x00e7
                L_0x00e1:
                    java.util.Set r2 = java.util.Collections.emptySet()
                    goto L_0x0059
                L_0x00e7:
                    java.lang.String r6 = "wa_trusted_contacts"
                    java.lang.String r2 = "wa_trusted_contacts.jid = ?"
                    r7 = 1
                    java.lang.String[] r1 = new java.lang.String[r7]     // Catch:{ all -> 0x0105 }
                    X.C18280x3.A0w(r8, r1, r4)     // Catch:{ all -> 0x0105 }
                    X.AnonymousClass361.A08(r10, r6, r2, r1)     // Catch:{ all -> 0x0105 }
                    java.lang.String r6 = "wa_trusted_contacts_send"
                    java.lang.String r2 = "wa_trusted_contacts_send.jid = ?"
                    java.lang.String[] r1 = new java.lang.String[r7]     // Catch:{ all -> 0x0105 }
                    X.C18280x3.A0w(r8, r1, r4)     // Catch:{ all -> 0x0105 }
                    X.AnonymousClass361.A08(r10, r6, r2, r1)     // Catch:{ all -> 0x0105 }
                    goto L_0x010f
                L_0x0105:
                    r1 = move-exception
                    r10.close()     // Catch:{ all -> 0x010a }
                    throw r1
                L_0x010a:
                    r0 = move-exception
                    r1.addSuppressed(r0)
                    throw r1
                L_0x010f:
                    r10.close()
                    java.util.Map r1 = r11.A09()
                    r1.remove(r8)
                    java.util.Map r1 = r11.A08()
                    r1.remove(r8)
                L_0x0120:
                    boolean r1 = r9.A0R()
                    if (r1 == 0) goto L_0x0177
                    X.33g r1 = r0.A0D
                    X.5dt r1 = r1.A02(r8)
                    if (r1 == 0) goto L_0x0177
                    boolean r1 = r1.A0X
                    if (r1 == 0) goto L_0x0177
                    X.2ra r1 = r0.A0E
                    java.lang.String r7 = r12.getRawString()
                    X.33p r8 = r1.A0A
                    r8.A1N(r7)
                    r8.A1L(r7)
                    r8.A1M(r7)
                    android.content.SharedPreferences$Editor r6 = X.C18270x1.A03(r8)
                    java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
                    java.lang.String r1 = "dc_user_postcode_"
                    X.C18260x0.A0G(r6, r1, r7, r2)
                    android.content.SharedPreferences$Editor r6 = X.C18270x1.A03(r8)
                    java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
                    java.lang.String r1 = "dc_location_name_"
                    X.C18260x0.A0G(r6, r1, r7, r2)
                    android.content.SharedPreferences$Editor r6 = X.C18270x1.A03(r8)
                    java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
                    java.lang.String r1 = "dc_default_postcode_"
                    X.C18260x0.A0G(r6, r1, r7, r2)
                    android.content.SharedPreferences$Editor r6 = X.C18270x1.A03(r8)
                    java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
                    java.lang.String r1 = "dc_business_domain_"
                    X.C18260x0.A0G(r6, r1, r7, r2)
                L_0x0177:
                    boolean r1 = r12 instanceof X.AnonymousClass1fI
                    if (r1 == 0) goto L_0x01d0
                    X.2Zq r8 = r0.A1S
                    X.1hw r2 = r0.A0k
                    r1 = r12
                    X.1fI r1 = (X.AnonymousClass1fI) r1
                    r17 = 60
                    X.1FD r7 = new X.1FD
                    r7.<init>(r2, r1)
                    java.lang.String r1 = "BroadcastXmppMethods/sendDeleteBroadcastList"
                    com.whatsapp.util.Log.i((java.lang.String) r1)
                    X.31C r13 = r8.A01
                    java.lang.String r6 = r13.A03()
                    X.1fI r9 = r7.A01
                    r1 = 1
                    java.lang.String r10 = "id"
                    if (r9 == 0) goto L_0x021b
                    X.39V[] r2 = new X.AnonymousClass39V[r1]
                    X.AnonymousClass39V.A02(r9, r10, r2, r4)
                    java.lang.String r1 = "list"
                    X.36K r2 = X.AnonymousClass36K.A0I(r1, r2)
                L_0x01a6:
                    java.lang.String r1 = "delete"
                    X.36K r9 = X.AnonymousClass36K.A0F(r2, r1, r15)
                    X.39V[] r5 = X.AnonymousClass0x9.A1W()
                    X.AnonymousClass39V.A0B(r10, r6, r5, r4)
                    java.lang.String r2 = "xmlns"
                    java.lang.String r1 = "w:b"
                    X.AnonymousClass39V.A0A(r2, r1, r5)
                    X.6kI r1 = X.C135206kI.A00
                    X.36K r15 = X.AnonymousClass36K.A0C(r1, r9, r5)
                    r1 = 10
                    X.4KX r14 = new X.4KX
                    r14.<init>(r7, r8, r7, r1)
                    r18 = 32000(0x7d00, double:1.581E-319)
                    r16 = r6
                    r13.A0D(r14, r15, r16, r17, r18)
                L_0x01d0:
                    X.3DP r1 = r0.A0A
                    r1.A03()
                    java.util.Map r2 = X.AnonymousClass2AZ.A00
                    java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
                    r2.put(r12, r1)
                    X.1VX r5 = r0.A18
                    r2 = 3689(0xe69, float:5.17E-42)
                    X.2vE r1 = X.C58422vE.A02
                    boolean r1 = r5.A0Y(r1, r2)
                    if (r1 == 0) goto L_0x0205
                    X.33p r5 = r0.A0Z
                    android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r5)
                    java.lang.String r2 = "1on1_invite_sender"
                    java.lang.String r1 = r1.getString(r2, r3)
                    com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A08(r1)
                    if (r1 == 0) goto L_0x0206
                    boolean r1 = r1.equals(r12)
                    if (r1 == 0) goto L_0x0206
                    X.C18260x0.A0K(r5, r2)
                L_0x0205:
                    return
                L_0x0206:
                    X.2xn r1 = r0.A0w
                    com.whatsapp.jid.UserJid r7 = X.AnonymousClass32Y.A05(r12)
                    boolean r0 = r1.A01(r7)
                    if (r0 == 0) goto L_0x0205
                    if (r7 == 0) goto L_0x0205
                    X.1RI r0 = r1.A01
                    X.4Fq r6 = r0.A0C()
                    goto L_0x021d
                L_0x021b:
                    r2 = r15
                    goto L_0x01a6
                L_0x021d:
                    r0 = r6
                    X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0238 }
                    X.2sg r5 = r0.A03     // Catch:{ all -> 0x0238 }
                    java.lang.String r3 = "recently_accepted_deeplink_invites"
                    java.lang.String r2 = "user_jid=?"
                    java.lang.String[] r1 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x0238 }
                    X.C18280x3.A0w(r7, r1, r4)     // Catch:{ all -> 0x0238 }
                    java.lang.String r0 = "delete_invite"
                    r5.A07(r3, r2, r0, r1)     // Catch:{ all -> 0x0238 }
                    r6.close()
                    return
                L_0x0238:
                    r1 = move-exception
                    throw r1     // Catch:{ all -> 0x023a }
                L_0x023a:
                    r0 = move-exception
                    X.AnonymousClass2A8.A00(r6, r1)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C621033m.A0L(X.4uZ, boolean, boolean):void");
            }

            public void A0M(UserJid userJid, Boolean bool, int i, int i2) {
                AnonymousClass3Z2 r0;
                AnonymousClass31A A012 = C56982ss.A01(this.A0i, userJid);
                if (A012 == null || (r0 = A012.A0b) == null || r0.expiration != i) {
                    AnonymousClass2WE r4 = this.A15;
                    long A0H2 = this.A0V.A0H();
                    C162457s7.A0J(userJid, 0);
                    C30311mF r2 = new C30311mF(r4.A00.A04(userJid, true), A0H2);
                    r2.A1J(userJid);
                    r2.A1v(Integer.valueOf(i));
                    if (i > 0) {
                        r2.A04 = i2;
                        if (bool != null) {
                            r2.A0o = Boolean.valueOf(bool.booleanValue());
                        }
                    }
                    A0O(r2);
                    this.A0l.A0V(r2);
                }
            }

            public void A0P(C624134x r5) {
                byte b = r5.A1I;
                C626936e.A0C(!C627636p.A0H(b));
                C626936e.A0C(!C627636p.A0I(b));
                C626936e.A0C(!AnonymousClass000.A1U(b, 82));
                C66423Lj r3 = (C66423Lj) this.A21.get();
                C43772Tk r2 = new C43772Tk(r3.A08, r5);
                r2.A07 = false;
                r2.A06 = true;
                r3.A00(new C53932nu(r2), (C72183dJ) null, (Runnable) null);
                if (r5 instanceof C30331mH) {
                    r5 = this.A1o.A05(((C30331mH) r5).A1v());
                }
                this.A0u.A0C(r5, -1);
            }

            public final void A0T(C624134x r4, Runnable runnable, Collection collection, byte[] bArr) {
                if (bArr != null) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        C614630w A0y2 = C18300x5.A0T(it).A0y();
                        C626936e.A06(A0y2);
                        A0y2.A03(bArr);
                    }
                }
                if (r4 == null) {
                    this.A02.BkS(runnable);
                } else {
                    this.A1B.A03(r4, new C172708Mj(r4, collection, runnable, 21));
                }
            }

            public void A0V(C624134x r18, String str, String str2, List list, boolean z) {
                String str3 = str;
                Log.d("UserActions/userActionSendContact");
                byte[] bArr = null;
                C624134x r12 = r18;
                String str4 = str2;
                List list2 = list;
                boolean z2 = z;
                if (str2 != null) {
                    try {
                        bArr = str4.getBytes(C58152un.A0B);
                    } catch (UnsupportedEncodingException unused) {
                    }
                    if (bArr != null) {
                        long length = (long) bArr.length;
                        C66663Mh r8 = this.A07;
                        if (length > ((long) r8.A03(C66663Mh.A1z)) * 1024) {
                            this.A02.A0I(R.string.f11nameremoved, 1);
                            return;
                        }
                        long A032 = ((long) r8.A03(C66663Mh.A1y)) * 1024;
                        if (A032 > 0 && length > A032) {
                            if (str == null) {
                                C54292oU r5 = this.A0W;
                                str3 = new AnonymousClass5Y4(this.A0M, this.A0U, r5, this.A0a).A00(str4);
                                if (str3 == null) {
                                    str3 = r5.A00.getString(R.string.f11nameremoved);
                                }
                            }
                            this.A1r.BkM(new C70933bI(this, list2, bArr, r12, str3, 1, 0, z2));
                            return;
                        }
                    }
                }
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    C30421mQ r2 = new C30421mQ(AnonymousClass35J.A01(C18300x5.A0P(it), this.A1X), this.A0V.A0H());
                    r2.A1w(str4);
                    r2.A00 = str3;
                    this.A1a.A00(r2, r12);
                    if (z) {
                        r2.A1B(4);
                    }
                    A0O(r2);
                    this.A0l.A0V(r2);
                }
            }

            public void A0W(C624134x r19, List list, List list2, boolean z) {
                String string;
                Log.d("UserActions/userActionSendContactsArray");
                List list3 = list2;
                String join = TextUtils.join("\n", list3);
                byte[] bArr = null;
                if (join != null) {
                    try {
                        bArr = join.getBytes(C58152un.A0B);
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
                C624134x r13 = r19;
                List list4 = list;
                boolean z2 = z;
                if (bArr != null) {
                    int length = bArr.length;
                    int size = list3.size();
                    long j = (long) length;
                    C66663Mh r9 = this.A07;
                    if (j > ((long) r9.A03(C66663Mh.A1z)) * 1024) {
                        int i = R.string.f11nameremoved;
                        if (size == 1) {
                            i = R.string.f11nameremoved;
                        }
                        this.A02.A0I(i, 1);
                        return;
                    }
                    long A032 = ((long) r9.A03(C66663Mh.A1y)) * 1024;
                    if (A032 > 0 && j > A032 && list3.size() > 0) {
                        C54292oU r8 = this.A0W;
                        C64773Ex r2 = this.A0M;
                        C620633i r0 = this.A0U;
                        C620733j r7 = this.A0a;
                        int size2 = list3.size();
                        String A002 = new AnonymousClass5Y4(r2, r0, r8, r7).A00(AnonymousClass001.A0n(list3, 0));
                        if (A002 != null) {
                            int i2 = size2 - 1;
                            Object[] A1b2 = C18310x6.A1b(A002, 0);
                            AnonymousClass000.A1P(A1b2, i2, 1);
                            string = r7.A0L(A1b2, R.plurals.f9nameremoved, (long) i2);
                        } else {
                            string = r8.A00.getString(R.string.f11nameremoved);
                        }
                        this.A1r.BkM(new C70933bI(this, list4, bArr, r13, string, size, 0, z2));
                        return;
                    }
                }
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    C95814uZ A0P2 = C18300x5.A0P(it);
                    Object[] objArr = new Object[1];
                    AnonymousClass000.A1L(objArr, list3.size());
                    String A0L2 = this.A0a.A0L(objArr, R.plurals.f9nameremoved, (long) list3.size());
                    C30411mP r22 = new C30411mP(this.A1X.A04(A0P2, true), this.A0V.A0H());
                    r22.A00 = A0L2;
                    r22.A1w(list3);
                    this.A1a.A00(r22, r13);
                    if (z) {
                        r22.A1B(4);
                    }
                    A0O(r22);
                    this.A0l.A0V(r22);
                }
            }

            public void A0X(C30361mK r15) {
                AnonymousClass4FS r0 = this.A1r;
                C56612sH r6 = this.A0V;
                C55682qk r2 = this.A00;
                C56492s4 r4 = this.A08;
                C66543Lv r8 = this.A0l;
                C29431io r9 = this.A0u;
                AnonymousClass33K r11 = this.A1E;
                AnonymousClass5ZR r7 = this.A0Y;
                C18270x1.A0w(new C34071uB(r2, this.A01, r4, this.A0S, r6, r7, r8, r9, this.A0v, r11, this.A1G, r15), r0);
            }

            public void A0Z(Set set, boolean z) {
                this.A1r.BkP(new C117665sI(this, set, 2, z));
            }

            public boolean A0a(C624134x r20, String str, boolean z) {
                C56962sq r4 = this.A0H;
                C624134x r3 = r20;
                AnonymousClass2z0 r7 = r3.A1J;
                C95814uZ r1 = r7.A00;
                String str2 = str;
                if (r4.A0P(AnonymousClass32Y.A03(r1)) && !TextUtils.isEmpty(str2)) {
                    return false;
                }
                C626936e.A06(r1);
                if (r1 instanceof C95804uY) {
                    C626936e.A06(r1);
                    if (!C106855aH.A04(this.A0i, (C95804uY) r1, (AnonymousClass5UP) this.A1x.get())) {
                        return false;
                    }
                }
                C52042kn r10 = new C52042kn(r3.A0o(), r7);
                C52042kn A012 = C33051sM.A01(r3);
                long j = r3.A1L;
                C56612sH r42 = this.A0V;
                C30571mf r8 = new C30571mf(AnonymousClass35J.A01(r1, this.A1X), r10, A012, str2, r42.A0H(), j, r42.A0H());
                this.A10.A00(r8);
                if (TextUtils.isEmpty(str2)) {
                    C58742vk r0 = this.A1g;
                    r0.A01.BhD(C58742vk.A00(AnonymousClass29K.A01(r0.A00, r3, r0.A02, r0.A03), AnonymousClass36M.A06(r8), 2));
                    C27991fJ A032 = AnonymousClass34R.A03(r1);
                    if (A032 != null && this.A0i.A06(A032) == 3) {
                        this.A1r.BkM(new C71733ca(this, A032));
                    }
                } else if (z) {
                    C58742vk r02 = this.A1g;
                    r02.A01.BhD(C58742vk.A00(AnonymousClass29K.A01(r02.A00, r3, r02.A02, r02.A03), AnonymousClass36M.A06(r8), 3));
                }
                C70173a4.A00(this.A1r, r3, this, 36);
                return true;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:5:0x003a, code lost:
                if (r7.A0F(r1.A00, (long) r1.A0B) != false) goto L_0x003c;
             */
            /* JADX WARNING: Removed duplicated region for block: B:13:0x0076  */
            /* JADX WARNING: Removed duplicated region for block: B:33:0x00e5  */
            /* JADX WARNING: Removed duplicated region for block: B:36:0x0116  */
            /* JADX WARNING: Removed duplicated region for block: B:41:0x0139  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final X.AnonymousClass2IK A02(X.AnonymousClass30M r34, X.AnonymousClass65N r35, X.C30471mV r36, java.lang.Integer r37, byte[] r38, boolean r39, boolean r40, boolean r41) {
                /*
                    r33 = this;
                    java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
                    java.lang.String r0 = "UserActions/userActionSendMediaMessages/size = "
                    r1.append(r0)
                    r5 = r34
                    java.util.concurrent.CopyOnWriteArrayList r6 = r5.A02
                    int r0 = r6.size()
                    X.C18260x0.A1G(r1, r0)
                    r13 = r33
                    X.7rd r7 = r13.A1N
                    X.1mV r0 = r5.A00()
                    boolean r0 = r7.A0K(r0)
                    r2 = 0
                    if (r0 != 0) goto L_0x003c
                    X.1mV r1 = r5.A00()
                    X.38t r0 = X.AnonymousClass36O.A02(r1)
                    boolean r0 = X.AnonymousClass36O.A08(r0)
                    if (r0 == 0) goto L_0x0063
                    long r3 = r1.A00
                    int r0 = r1.A0B
                    long r0 = (long) r0
                    boolean r0 = r7.A0F(r3, r0)
                    if (r0 == 0) goto L_0x0063
                L_0x003c:
                    X.1mV r0 = r5.A00()
                    X.38t r1 = X.AnonymousClass36O.A02(r0)
                    java.io.File r0 = X.C30471mV.A01(r0)
                    boolean r0 = r7.A0G(r1, r0)
                    if (r0 != 0) goto L_0x0063
                    X.3Wi r1 = r13.A02
                    r0 = 2131893801(0x7f121e29, float:1.9422389E38)
                    r1.A0H(r0, r2)
                    X.2IK r3 = new X.2IK
                    r3.<init>()
                    X.3d3 r1 = X.C72023d3.A00
                    X.3XA r0 = r3.A00
                    r0.A05(r1)
                    return r3
                L_0x0063:
                    java.util.ArrayList r10 = X.AnonymousClass001.A0s()
                    java.util.ArrayList r8 = X.AnonymousClass001.A0s()
                    java.util.Iterator r12 = X.AnonymousClass0x7.A0x(r6)
                L_0x006f:
                    boolean r0 = r12.hasNext()
                    r7 = 1
                    if (r0 == 0) goto L_0x00db
                    X.1mV r9 = X.C18320x8.A0S(r12)
                    r13.A0O(r9)
                    X.1VX r4 = r13.A18
                    r3 = 6728(0x1a48, float:9.428E-42)
                    X.2vE r1 = X.C58422vE.A02
                    int r11 = r4.A0O(r1, r3)
                    int r0 = r6.size()
                    if (r0 == r7) goto L_0x0095
                    r0 = 695(0x2b7, float:9.74E-43)
                    boolean r0 = r4.A0Y(r1, r0)
                    if (r0 == 0) goto L_0x00d7
                L_0x0095:
                    boolean r0 = X.AnonymousClass2z0.A0B(r9)
                    if (r0 == 0) goto L_0x00d7
                    byte r1 = r9.A1I
                    r0 = 3
                    if (r1 != r0) goto L_0x00d7
                    int r0 = r9.A0B
                    if (r0 <= r11) goto L_0x00d7
                    r9.A0B = r11
                    X.33C r7 = X.C30471mV.A00(r9)
                    long r0 = r7.A0D
                    long r3 = X.C56952sp.A04(r4, r3)
                    long r0 = r0 + r3
                    r7.A0E = r0
                    r8.add(r9)
                L_0x00b6:
                    boolean r0 = X.AnonymousClass2z0.A0B(r9)
                    if (r0 == 0) goto L_0x00d1
                    X.2X0 r0 = r13.A1j
                    boolean r0 = r0.A00()
                    if (r0 == 0) goto L_0x00d1
                    X.5mK r3 = r13.A1k
                    int r0 = r9.A0C
                    long r0 = (long) r0
                    java.lang.String r4 = "request"
                    X.5Z9 r3 = r3.A0C
                    r3.A03(r9, r4, r0)
                L_0x00d1:
                    X.2ol r0 = r13.A1P
                    r0.A01(r9)
                    goto L_0x006f
                L_0x00d7:
                    r10.add(r9)
                    goto L_0x00b6
                L_0x00db:
                    X.1mV r0 = r5.A00()
                    java.io.File r0 = X.C30471mV.A01(r0)
                    if (r0 == 0) goto L_0x00ec
                    X.4FS r1 = r13.A1r
                    r0 = 33
                    X.C70173a4.A00(r1, r5, r13, r0)
                L_0x00ec:
                    X.2IK r6 = new X.2IK
                    r6.<init>()
                    X.3d3 r9 = X.C72023d3.A00
                    X.3XA r0 = r6.A00
                    r0.A05(r9)
                    X.2IK r3 = new X.2IK
                    r3.<init>()
                    X.3XA r0 = r3.A00
                    r0.A05(r9)
                    boolean r0 = r10.isEmpty()
                    r14 = r35
                    r15 = r36
                    r17 = r37
                    r4 = r38
                    r19 = r39
                    r20 = r40
                    r21 = r41
                    if (r0 != 0) goto L_0x0133
                    int r0 = r5.A00
                    X.30M r11 = new X.30M
                    r11.<init>(r10, r0)
                    java.util.concurrent.CopyOnWriteArrayList r1 = r11.A02
                    java.util.List r0 = java.util.Collections.unmodifiableList(r1)
                    boolean r0 = r0.isEmpty()
                    X.2IK r6 = new X.2IK
                    if (r0 == 0) goto L_0x0195
                    r6.<init>()
                    X.3XA r0 = r6.A00
                    r0.A05(r9)
                L_0x0133:
                    boolean r0 = r8.isEmpty()
                    if (r0 != 0) goto L_0x0156
                    int r0 = r5.A00
                    X.30M r12 = new X.30M
                    r12.<init>(r8, r0)
                    java.util.concurrent.CopyOnWriteArrayList r1 = r12.A02
                    java.util.List r0 = java.util.Collections.unmodifiableList(r1)
                    boolean r0 = r0.isEmpty()
                    X.2IK r3 = new X.2IK
                    if (r0 == 0) goto L_0x017d
                    r3.<init>()
                    X.3XA r0 = r3.A00
                    r0.A05(r9)
                L_0x0156:
                    r5 = 2
                    X.2IK[] r4 = new X.AnonymousClass2IK[r5]
                    r4[r2] = r6
                    r4[r7] = r3
                    X.2IK r3 = new X.2IK
                    r3.<init>()
                    java.util.ArrayList r2 = X.AnonymousClass002.A0I(r5)
                    r1 = 0
                L_0x0167:
                    r0 = r4[r1]
                    X.3XA r0 = r0.A00
                    r2.add(r0)
                    int r1 = r1 + 1
                    if (r1 < r5) goto L_0x0167
                    X.1I2 r1 = new X.1I2
                    r1.<init>(r2)
                    r0 = 25
                    X.AnonymousClass3XA.A01(r1, r3, r0)
                    return r3
                L_0x017d:
                    r3.<init>()
                    java.util.List r0 = java.util.Collections.unmodifiableList(r1)
                    java.util.ArrayList r0 = X.AnonymousClass002.A0J(r0)
                    X.3bY r11 = new X.3bY
                    r18 = r4
                    r16 = r3
                    r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                    r13.A0T(r15, r11, r0, r4)
                    goto L_0x0156
                L_0x0195:
                    r6.<init>()
                    java.util.List r0 = java.util.Collections.unmodifiableList(r1)
                    java.util.ArrayList r1 = X.AnonymousClass002.A0J(r0)
                    X.3bY r0 = new X.3bY
                    r22 = r0
                    r23 = r11
                    r24 = r13
                    r25 = r14
                    r26 = r15
                    r27 = r6
                    r28 = r17
                    r29 = r4
                    r30 = r19
                    r31 = r20
                    r32 = r21
                    r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
                    r13.A0T(r15, r0, r1, r4)
                    goto L_0x0133
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C621033m.A02(X.30M, X.65N, X.1mV, java.lang.Integer, byte[], boolean, boolean, boolean):X.2IK");
            }

            public final List A04(Collection collection) {
                C53532nF A0r2;
                ArrayList A0u2 = C18300x5.A0u(collection);
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    C624134x A0T2 = C18300x5.A0T(it);
                    if (A0T2.A0q() != null) {
                        C183538qC r3 = this.A1v;
                        r3.get();
                        if ((A0T2 instanceof C30481mW) && C57322tS.A00(A0T2) && A0T2.A0r() != null && A0T2.A0q() != null && ((A0r2 = A0T2.A0r()) == null || A0r2.A00 == null)) {
                            Iterator it2 = ((C50182hl) this.A1u.get()).A00(A0T2.A0q().A01).iterator();
                            while (it2.hasNext()) {
                                C624134x A0T3 = C18300x5.A0T(it2);
                                if (C18320x8.A0I(r3).A06(A0T3)) {
                                    A0u2.add(A0T3);
                                }
                            }
                        }
                    }
                    A0u2.add(A0T2);
                }
                return A0u2;
            }

            public void A09(AnonymousClass5Ul r18, C108845de r19, String str, List list, List list2, boolean z) {
                ArrayList A0s2 = AnonymousClass001.A0s();
                ArrayList A0s3 = AnonymousClass001.A0s();
                for (Object next : list2) {
                    C18300x5.A1M(next, A0s2, A0s3, next instanceof C95804uY ? 1 : 0);
                }
                AnonymousClass5Ul r4 = r18;
                C108845de r5 = r19;
                String str2 = str;
                List list3 = list;
                boolean z2 = z;
                if (!A0s2.isEmpty() && this.A18.A0Y(C58422vE.A02, 6323)) {
                    A0A(r4, r5, str2, list3, A0s2, z2);
                }
                A0A(r4, r5, str2, list3, A0s3, z2);
            }

            public void A0H(C95814uZ r7, Integer num, boolean z) {
                String A0L2;
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("UserActions/userActionSetChatArchived; jid=");
                A0o2.append(r7);
                C18260x0.A1E("; archive=", A0o2, z);
                this.A0h.A06(r7, num, z);
                if (z) {
                    A0L2 = this.A0W.A00.getString(R.string.f11nameremoved);
                } else {
                    C620733j r4 = this.A0a;
                    Object[] objArr = new Object[1];
                    AnonymousClass000.A1P(objArr, 1, 0);
                    A0L2 = r4.A0L(objArr, R.plurals.f9nameremoved, 1);
                }
                C69263Wi r1 = this.A02;
                r1.A0P(A0L2, 0);
                C69263Wi.A0B(r1, r7, this, 37);
            }

            public void A0I(C95814uZ r16, String str) {
                A03((C66513Ls) null, (C108845de) null, (C55162pu) null, (AnonymousClass2U8) null, (C624134x) null, (C55592qb) null, (C85104Ey) null, (Integer) null, str, Collections.singletonList(r16), (List) null, false, false, false);
            }

            public void A0N(AnonymousClass65N r10, C30471mV r11) {
                A02(new AnonymousClass30M(Collections.singletonList(r11)), r10, (C30471mV) null, (Integer) null, (byte[]) null, false, false, false);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:55:0x0118, code lost:
                if (r0.A01(r9) != false) goto L_0x0051;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:57:0x011e, code lost:
                if ((r9 instanceof X.C30461mU) != false) goto L_0x0051;
             */
            /* JADX WARNING: Removed duplicated region for block: B:19:0x0062  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void A0O(X.C624134x r9) {
                /*
                    r8 = this;
                    java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
                    java.lang.String r0 = "UserActions/prepareSendMessage msg="
                    X.C18260x0.A1R(r1, r0, r9)
                    X.2z0 r0 = r9.A1J
                    X.4uZ r4 = r0.A00
                    boolean r3 = r4 instanceof X.C135166kE
                    if (r3 == 0) goto L_0x0122
                    X.1VX r2 = r8.A18
                    r1 = 5477(0x1565, float:7.675E-42)
                    X.2vE r0 = X.C58422vE.A02
                    boolean r0 = r2.A0Y(r0, r1)
                    if (r0 != 0) goto L_0x0022
                    X.1fY r0 = X.AnonymousClass1fY.A00
                    r9.A1J(r0)
                L_0x0022:
                    X.2X0 r0 = r8.A1j
                    boolean r0 = r0.A00()
                    if (r0 == 0) goto L_0x002f
                    r0 = 262144(0x40000, float:3.67342E-40)
                    r9.A1B(r0)
                L_0x002f:
                    X.1VX r5 = r8.A18
                    X.2ss r7 = r8.A0i
                    X.8qC r6 = r8.A1v
                    X.2WW r1 = r8.A1K
                    X.8qC r2 = r8.A20
                    boolean r0 = r9 instanceof X.C30451mT
                    if (r0 != 0) goto L_0x0051
                    boolean r0 = r1.A00(r9)
                    if (r0 != 0) goto L_0x0051
                    boolean r0 = r9 instanceof X.C30331mH
                    if (r0 != 0) goto L_0x00a0
                    X.1fJ r0 = X.AnonymousClass34R.A01(r4)
                    boolean r0 = r7.A0O(r0)
                    if (r0 == 0) goto L_0x00a0
                L_0x0051:
                    r0 = 1
                    r9.A1D = r0
                    r0 = 32
                    byte[] r0 = X.AnonymousClass29O.A01(r0)
                    r9.A1a = r0
                L_0x005c:
                    com.whatsapp.jid.UserJid r2 = X.AnonymousClass32Y.A03(r4)
                    if (r2 == 0) goto L_0x006b
                    X.1Qq r1 = r8.A0c
                    X.2e5 r0 = r1.A00(r2)
                    r1.A05(r0, r9)
                L_0x006b:
                    r1 = 508(0x1fc, float:7.12E-43)
                    X.2vE r0 = X.C58422vE.A02
                    boolean r0 = r5.A0Y(r0, r1)
                    if (r0 == 0) goto L_0x009f
                    if (r2 == 0) goto L_0x009f
                    X.2n3 r0 = r8.A0d
                    X.2wd r0 = r0.A01
                    X.2pe r1 = r0.A01(r2)
                    if (r1 == 0) goto L_0x009f
                    boolean r0 = r1.A08
                    if (r0 != 0) goto L_0x009f
                    java.lang.String r0 = r1.A06
                    r9.A12 = r0
                    java.lang.String r0 = r1.A05
                    r9.A11 = r0
                    java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
                    long r2 = java.lang.System.currentTimeMillis()
                    long r0 = r1.A01
                    long r2 = r2 - r0
                    java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
                    long r1 = r4.convert(r2, r0)
                    int r0 = (int) r1
                    r9.A03 = r0
                L_0x009f:
                    return
                L_0x00a0:
                    int r0 = r9.A05
                    if (r0 <= 0) goto L_0x00af
                    r1 = 3146(0xc4a, float:4.408E-42)
                    X.2vE r0 = X.C58422vE.A02
                    boolean r0 = r5.A0Y(r0, r1)
                    if (r0 == 0) goto L_0x00af
                    goto L_0x0051
                L_0x00af:
                    if (r4 == 0) goto L_0x005c
                    X.2sS r0 = X.C18320x8.A0I(r6)
                    boolean r0 = r0.A07(r9)
                    if (r0 != 0) goto L_0x0051
                    boolean r0 = X.C627336j.A0K(r4)
                    if (r0 == 0) goto L_0x00cc
                    r1 = 3143(0xc47, float:4.404E-42)
                    X.2vE r0 = X.C58422vE.A02
                    boolean r0 = r5.A0Y(r0, r1)
                    if (r0 == 0) goto L_0x00cc
                    goto L_0x0051
                L_0x00cc:
                    boolean r0 = r4 instanceof X.AnonymousClass1fI
                    if (r0 == 0) goto L_0x00dc
                    r1 = 3144(0xc48, float:4.406E-42)
                    X.2vE r0 = X.C58422vE.A02
                    boolean r0 = r5.A0Y(r0, r1)
                    if (r0 == 0) goto L_0x00dc
                    goto L_0x0051
                L_0x00dc:
                    if (r3 == 0) goto L_0x00ea
                    r1 = 3145(0xc49, float:4.407E-42)
                    X.2vE r0 = X.C58422vE.A02
                    boolean r0 = r5.A0Y(r0, r1)
                    if (r0 == 0) goto L_0x00ea
                    goto L_0x0051
                L_0x00ea:
                    X.2pu r0 = r9.A0t()
                    if (r0 == 0) goto L_0x00f8
                    boolean r0 = X.C624134x.A0g(r9)
                    if (r0 == 0) goto L_0x00f8
                    goto L_0x0051
                L_0x00f8:
                    java.lang.Object r3 = r2.get()
                    X.2Yo r3 = (X.C45072Yo) r3
                    X.1VX r2 = r3.A00
                    r1 = 5717(0x1655, float:8.011E-42)
                    X.2vE r0 = X.C58422vE.A02
                    boolean r0 = r2.A0Y(r0, r1)
                    if (r0 == 0) goto L_0x011c
                    X.8qC r0 = r3.A01
                    java.lang.Object r0 = r0.get()
                    X.2ya r0 = (X.C60452ya) r0
                    if (r0 == 0) goto L_0x011c
                    boolean r0 = r0.A01(r9)
                    if (r0 == 0) goto L_0x011c
                    goto L_0x0051
                L_0x011c:
                    boolean r0 = r9 instanceof X.C30461mU
                    if (r0 == 0) goto L_0x005c
                    goto L_0x0051
                L_0x0122:
                    boolean r0 = r4 instanceof X.AnonymousClass1fS
                    if (r0 == 0) goto L_0x002f
                    r0 = 1
                    r9.A1B = r0
                    X.2sj r1 = r8.A0q
                    r0 = r4
                    X.1fL r0 = (X.C28011fL) r0
                    X.33k r1 = X.C56892sj.A01(r1, r0)
                    X.3Lo r0 = r8.A0j
                    X.3ZH r0 = r0.A01(r4)
                    java.lang.String r0 = r0.A0J()
                    r9.A13 = r0
                    X.6aS r0 = r1.A02()
                    java.util.ArrayList r2 = X.AnonymousClass002.A0J(r0)
                    X.2sr r1 = r8.A04
                    com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r1)
                    r2.remove(r0)
                    X.1fH r0 = r1.A0H()
                    r2.remove(r0)
                    r9.A1h(r2)
                    goto L_0x002f
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C621033m.A0O(X.34x):void");
            }

            public void A0Y(Collection collection, boolean z, boolean z2) {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("UserActions/userActionDeleteMessages ");
                C18260x0.A1G(A0o2, collection.size());
                List A042 = A04(collection);
                C18260x0.A1C("UserActions/userActionDeleteMessages messagesToDeleteIncludingAssociatedMessages=", AnonymousClass001.A0o(), A042);
                Iterator it = A042.iterator();
                while (it.hasNext()) {
                    C624134x A0T2 = C18300x5.A0T(it);
                    AnonymousClass31G.A02(this.A19, this.A1A, A0T2, 6);
                    A0T2.A1V = true;
                    if ((A0T2 instanceof C30471mV) && A0T2.A1J.A02) {
                        this.A1I.A04(A0T2, false);
                    }
                    this.A0t.A03(A0T2.A1J);
                }
                this.A0g.A01(new C71423c5(this, A042, 1, z, z2), 20);
                C70173a4.A00(this.A1r, A042, this, 32);
            }

            public final void A05(long j) {
                if (j < 946684800000L || j > 2208988800000L) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("UserActions/reportIfBadTime: time=");
                    C620733j r2 = this.A0a;
                    C18260x0.A1K(A0o2, C107175ap.A04(r2, C107505bQ.A06(r2, j), C107145am.A00(r2, j)));
                    if (this.A1U.A00()) {
                        this.A00.A0A("UserActions/badTime", false, (String) null);
                    }
                }
            }

            public C621033m(C55682qk r4, C159027ky r5, C69263Wi r6, AnonymousClass32O r7, C56972sr r8, AnonymousClass36E r9, C56352rq r10, C66663Mh r11, C56492s4 r12, C46292bO r13, AnonymousClass3DP r14, C29411im r15, C50422i9 r16, C620433g r17, C56192ra r18, C153167am r19, C623434q r20, C56962sq r21, C46342bT r22, AnonymousClass4F4 r23, C56942so r24, C65203Gp r25, C64773Ex r26, C47882dz r27, C56642sK r28, AnonymousClass5ZU r29, C54122oD r30, AnonymousClass314 r31, C44382Vv r32, C56512s6 r33, C620633i r34, C56612sH r35, C54292oU r36, C57162tC r37, AnonymousClass5ZR r38, AnonymousClass33p r39, C620733j r40, C61072zf r41, C22931Qq r42, C53412n3 r43, C50202hn r44, AnonymousClass2ZV r45, C52852m9 r46, C56542sA r47, C56982ss r48, C66473Lo r49, C28891hw r50, C66543Lv r51, AnonymousClass30G r52, C55672qj r53, AnonymousClass313 r54, C55412qJ r55, C56892sj r56, AnonymousClass2Y3 r57, C56152rV r58, C54762pF r59, C29431io r60, C55332qB r61, C59972xn r62, C55622qe r63, C55292q7 r64, AnonymousClass311 r65, C50562iN r66, AnonymousClass2W8 r67, C48042eF r68, AnonymousClass36Y r69, C104395Qu r70, AnonymousClass2WE r71, C54922pV r72, C59652xG r73, AnonymousClass1VX r74, AnonymousClass3LP r75, AnonymousClass4FV r76, C54602oz r77, C66493Lq r78, C66503Lr r79, AnonymousClass33K r80, C106685Zz r81, C621233o r82, C55972rD r83, C56232re r84, AnonymousClass2H2 r85, AnonymousClass2WW r86, C54882pR r87, C620133d r88, C162287rd r89, AnonymousClass2RO r90, C54462ol r91, AnonymousClass31C r92, AnonymousClass33S r93, C45342Zq r94, C619933b r95, C40672Hh r96, C49652gs r97, AnonymousClass35J r98, C45452a2 r99, C40822Hw r100, C44642Wx r101, C45012Yi r102, C45022Yj r103, C41872Lx r104, C50222hp r105, C45042Yl r106, C58742vk r107, C29011i8 r108, AnonymousClass1R1 r109, AnonymousClass2X0 r110, C113995mK r111, C55732qp r112, C56932sn r113, C97144xh r114, C55832qz r115, C105025Tg r116, C989053r r117, AnonymousClass4FS r118, JniBridge jniBridge, C183538qC r120, C183538qC r121, C183538qC r122, C183538qC r123, C183538qC r124, C183538qC r125, C183538qC r126, C183538qC r127, C183538qC r128, C183538qC r129) {
                this.A0W = r36;
                this.A0V = r35;
                this.A18 = r74;
                this.A1p = r116;
                this.A02 = r6;
                this.A00 = r4;
                this.A04 = r8;
                this.A1r = r118;
                this.A0i = r48;
                this.A1s = jniBridge;
                this.A1F = r81;
                this.A08 = r12;
                this.A1A = r76;
                this.A0h = r47;
                this.A1R = r93;
                this.A07 = r11;
                this.A0L = r25;
                this.A1H = r83;
                this.A0b = r41;
                this.A19 = r75;
                this.A1E = r80;
                this.A1w = r120;
                this.A1Q = r92;
                this.A1h = r108;
                this.A0C = r16;
                this.A1v = r121;
                this.A0M = r26;
                this.A13 = r69;
                this.A0p = r55;
                this.A1q = r117;
                this.A05 = r9;
                this.A1l = r112;
                this.A0U = r34;
                this.A1N = r89;
                this.A0P = r29;
                this.A0a = r40;
                this.A22 = r122;
                this.A0H = r21;
                this.A0I = r22;
                this.A0l = r51;
                this.A0m = r52;
                this.A1o = r115;
                this.A1D = r79;
                this.A14 = r70;
                this.A0s = r58;
                this.A0u = r60;
                this.A1x = r123;
                this.A1y = r124;
                this.A1C = r78;
                this.A0B = r15;
                this.A1i = r109;
                this.A03 = r7;
                this.A0T = r33;
                this.A1m = r113;
                this.A0A = r14;
                this.A0g = r46;
                this.A0F = r19;
                this.A1t = r125;
                this.A1X = r98;
                this.A1O = r90;
                this.A21 = r126;
                this.A16 = r72;
                this.A1c = r103;
                this.A1L = r87;
                this.A0t = r59;
                this.A1T = r95;
                this.A0O = r28;
                this.A0x = r63;
                this.A12 = r68;
                this.A1j = r110;
                this.A0Y = r38;
                this.A0Z = r39;
                this.A1S = r94;
                this.A0K = r24;
                this.A0R = r31;
                this.A0n = r53;
                this.A1Y = r99;
                this.A01 = r5;
                this.A1M = r88;
                this.A20 = r127;
                this.A1g = r107;
                this.A0v = r61;
                this.A1k = r111;
                this.A1J = r85;
                this.A0y = r64;
                this.A0k = r50;
                this.A0o = r54;
                this.A1a = r101;
                this.A1P = r91;
                this.A1K = r86;
                this.A0f = r45;
                this.A1W = r97;
                this.A1b = r102;
                this.A1G = r82;
                this.A0D = r17;
                this.A0z = r65;
                this.A0J = r23;
                this.A1u = r128;
                this.A0Q = r30;
                this.A0E = r18;
                this.A1B = r77;
                this.A1Z = r100;
                this.A1I = r84;
                this.A15 = r71;
                this.A1V = r96;
                this.A0q = r56;
                this.A1z = r129;
                this.A1d = r104;
                this.A0N = r27;
                this.A0j = r49;
                this.A11 = r67;
                this.A1n = r114;
                this.A0d = r43;
                this.A10 = r66;
                this.A06 = r10;
                this.A0w = r62;
                this.A0c = r42;
                this.A0e = r44;
                this.A0S = r32;
                this.A09 = r13;
                this.A0r = r57;
                this.A1e = r105;
                this.A1f = r106;
                this.A0X = r37;
                this.A17 = r73;
                this.A0G = r20;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d8, code lost:
                if (X.C155477ey.A00(r3.A1J.A00) != false) goto L_0x005e;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.util.List A03(X.C66513Ls r22, X.C108845de r23, X.C55162pu r24, X.AnonymousClass2U8 r25, X.C624134x r26, X.C55592qb r27, X.C85104Ey r28, java.lang.Integer r29, java.lang.String r30, java.util.List r31, java.util.List r32, boolean r33, boolean r34, boolean r35) {
                /*
                    r21 = this;
                    java.lang.String r0 = "UserActions/userActionSendTextMessages"
                    com.whatsapp.util.Log.d((java.lang.String) r0)
                    java.util.ArrayList r4 = X.AnonymousClass000.A0p(r31)
                    java.util.Iterator r8 = r31.iterator()
                L_0x000d:
                    boolean r0 = r8.hasNext()
                    if (r0 == 0) goto L_0x00db
                    X.4uZ r12 = X.C18300x5.A0P(r8)
                    r9 = r21
                    r1 = r32
                    r17 = r1
                    r10 = r22
                    r20 = r35
                    r11 = r23
                    r13 = r25
                    r14 = r26
                    r15 = r27
                    r16 = r30
                    r18 = r33
                    r19 = r34
                    X.1mW r3 = r9.A01(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                    r4.add(r3)
                    X.8qC r0 = r9.A1w
                    java.lang.Object r0 = r0.get()
                    X.2m4 r0 = (X.C52802m4) r0
                    boolean r0 = r0.A00()
                    if (r0 == 0) goto L_0x0063
                    X.8qC r0 = r9.A1v
                    X.2sS r0 = X.C18320x8.A0I(r0)
                    com.whatsapp.jid.UserJid r0 = r0.A00(r1)
                    r1 = 1
                    if (r0 == 0) goto L_0x00d0
                    r3.A1i(r1)
                    r0 = 32
                    byte[] r0 = X.AnonymousClass29O.A01(r0)
                    r3.A1a = r0
                    r3.A1D = r1
                L_0x005e:
                    X.36E r0 = r9.A05
                    r0.A0J(r3, r1)
                L_0x0063:
                    r0 = r24
                    if (r24 == 0) goto L_0x006a
                    r3.A1N(r0)
                L_0x006a:
                    if (r29 == 0) goto L_0x0073
                    int r0 = r29.intValue()
                    r3.A1B(r0)
                L_0x0073:
                    r7 = r28
                    if (r28 == 0) goto L_0x00b4
                    boolean r0 = r7.Bo7()
                    if (r0 == 0) goto L_0x00b4
                    boolean r0 = X.AnonymousClass2z0.A0C(r3)
                    if (r0 == 0) goto L_0x00ad
                    X.8qC r0 = r9.A1z
                    java.lang.Object r2 = r0.get()
                    X.2iH r2 = (X.C50502iH) r2
                    X.4FS r1 = r2.A0B
                    r0 = 49
                    X.C70113Zy.A01(r1, r2, r3, r0)
                L_0x0092:
                    r7.BWZ(r3)
                    long r0 = r7.BDi()
                    r5 = 0
                    int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                    if (r2 <= 0) goto L_0x000d
                    X.3Wi r6 = r9.A02
                    r5 = 23
                    X.8Mj r2 = new X.8Mj
                    r2.<init>(r9, r7, r3, r5)
                    r6.A0T(r2, r0)
                    goto L_0x000d
                L_0x00ad:
                    X.3Lv r1 = r9.A0l
                    r0 = 1
                    r1.A0a(r3, r0)
                    goto L_0x0092
                L_0x00b4:
                    boolean r0 = r12 instanceof X.C95804uY
                    if (r0 == 0) goto L_0x00c9
                    X.8qC r0 = r9.A1z
                    java.lang.Object r2 = r0.get()
                    X.2iH r2 = (X.C50502iH) r2
                    X.4FS r1 = r2.A0B
                    r0 = 48
                    X.C70113Zy.A01(r1, r2, r3, r0)
                    goto L_0x000d
                L_0x00c9:
                    X.3Lv r0 = r9.A0l
                    r0.A0V(r3)
                    goto L_0x000d
                L_0x00d0:
                    X.2z0 r0 = r3.A1J
                    X.4uZ r0 = r0.A00
                    boolean r0 = X.C155477ey.A00(r0)
                    if (r0 == 0) goto L_0x0063
                    goto L_0x005e
                L_0x00db:
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C621033m.A03(X.3Ls, X.5de, X.2pu, X.2U8, X.34x, X.2qb, X.4Ey, java.lang.Integer, java.lang.String, java.util.List, java.util.List, boolean, boolean, boolean):java.util.List");
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v106, resolved type: X.1mW} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v109, resolved type: X.1mW} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v110, resolved type: X.1mW} */
            /* JADX WARNING: type inference failed for: r0v63, types: [X.1mV, X.1nF] */
            /* JADX WARNING: type inference failed for: r0v82, types: [X.1mV] */
            /* JADX WARNING: type inference failed for: r0v86, types: [X.1mV, X.34x] */
            /* JADX WARNING: type inference failed for: r35v17, types: [X.1mu] */
            /* JADX WARNING: type inference failed for: r35v18, types: [X.1nF] */
            /* JADX WARNING: type inference failed for: r35v19, types: [X.1nF] */
            /* JADX WARNING: type inference failed for: r35v20, types: [X.1mw] */
            /* JADX WARNING: type inference failed for: r35v21, types: [X.1nF] */
            /* JADX WARNING: type inference failed for: r35v22, types: [X.1pA] */
            /* JADX WARNING: type inference failed for: r35v23, types: [X.1pA] */
            /* JADX WARNING: type inference failed for: r35v24, types: [X.1p9] */
            /* JADX WARNING: type inference failed for: r35v25, types: [X.1pB] */
            /* JADX WARNING: type inference failed for: r35v26, types: [X.1pB] */
            /* JADX WARNING: type inference failed for: r35v27, types: [X.1pB] */
            /* JADX WARNING: type inference failed for: r35v28, types: [X.1n2] */
            /* JADX WARNING: type inference failed for: r35v29, types: [X.1my] */
            /* JADX WARNING: type inference failed for: r35v30, types: [X.1n1] */
            /* JADX WARNING: type inference failed for: r0v107 */
            /* JADX WARNING: type inference failed for: r35v31, types: [X.1n2] */
            /* JADX WARNING: type inference failed for: r35v32, types: [X.1n2] */
            /* JADX WARNING: type inference failed for: r35v33, types: [X.1mz] */
            /* JADX WARNING: type inference failed for: r35v34, types: [X.1nE] */
            /* JADX WARNING: Code restructure failed: missing block: B:104:0x0224, code lost:
                r31 = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:105:0x0226, code lost:
                if (r15 == false) goto L_0x0235;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:108:0x0233, code lost:
                if (X.AnonymousClass35Z.A03((X.C31981pC) r1) == false) goto L_0x0235;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:118:0x0250, code lost:
                if (r32 != false) goto L_0x0252;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
                if (X.C18320x8.A0I(r2.A1v).A04(r1) == false) goto L_0x0973;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:331:0x0724, code lost:
                if (r1.A0z() != null) goto L_0x0726;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:346:0x077c, code lost:
                if (X.C372721p.A02.equals(r4) != false) goto L_0x077e;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:380:0x0822, code lost:
                if (X.AnonymousClass32B.A00(r9, r2.A0V.A0H()) == false) goto L_0x0824;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:416:0x08a3, code lost:
                if (r12 < r3) goto L_0x08a5;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:417:0x08a5, code lost:
                r31 = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:418:0x08a7, code lost:
                if (r0 == false) goto L_0x0228;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:426:0x08c3, code lost:
                if (r3.A01() != false) goto L_0x08a5;
             */
            /* JADX WARNING: Failed to insert additional move for type inference */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Removed duplicated region for block: B:107:0x022a  */
            /* JADX WARNING: Removed duplicated region for block: B:113:0x0241  */
            /* JADX WARNING: Removed duplicated region for block: B:31:0x0088  */
            /* JADX WARNING: Removed duplicated region for block: B:383:0x0827  */
            /* JADX WARNING: Removed duplicated region for block: B:389:0x0840  */
            /* JADX WARNING: Removed duplicated region for block: B:396:0x085f  */
            /* JADX WARNING: Removed duplicated region for block: B:409:0x0889  */
            /* JADX WARNING: Removed duplicated region for block: B:433:0x08d4  */
            /* JADX WARNING: Removed duplicated region for block: B:453:0x0957  */
            /* JADX WARNING: Removed duplicated region for block: B:46:0x0104  */
            /* JADX WARNING: Removed duplicated region for block: B:482:0x07fa A[SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:54:0x0133  */
            /* JADX WARNING: Removed duplicated region for block: B:57:0x0149  */
            /* JADX WARNING: Removed duplicated region for block: B:79:0x01b9  */
            /* JADX WARNING: Removed duplicated region for block: B:93:0x01f4  */
            /* JADX WARNING: Removed duplicated region for block: B:97:0x01ff  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void A0B(X.AnonymousClass5Ul r54, X.C108845de r55, java.lang.String r56, java.util.List r57, java.util.List r58, boolean r59, boolean r60) {
                /*
                    r53 = this;
                    r51 = r58
                    int r0 = r51.size()
                    if (r0 == 0) goto L_0x099a
                    int r1 = r57.size()
                    r0 = 1
                    r18 = 0
                    if (r1 <= r0) goto L_0x0013
                    r18 = 1
                L_0x0013:
                    int r29 = r57.size()
                    java.util.Iterator r28 = r57.iterator()
                    r3 = 0
                L_0x001c:
                    boolean r0 = r28.hasNext()
                    r2 = r53
                    r26 = r55
                    r52 = r56
                    if (r0 == 0) goto L_0x0980
                    X.34x r1 = X.C18300x5.A0T(r28)
                    if (r18 == 0) goto L_0x097c
                    if (r59 == 0) goto L_0x0979
                    X.2mS r0 = r1.A0z()
                    if (r0 != 0) goto L_0x003c
                    boolean r0 = X.AnonymousClass2z0.A0C(r1)
                    if (r0 == 0) goto L_0x0979
                L_0x003c:
                    r5 = 1
                L_0x003d:
                    java.lang.String r27 = "UserActions/userActionForwardMessage"
                    com.whatsapp.util.Log.d((java.lang.String) r27)
                    r7 = 1
                    int r0 = r1.A0A
                    r0 = r0 & 1
                    boolean r3 = X.AnonymousClass000.A1U(r0, r7)
                    r0 = 0
                    if (r3 != 0) goto L_0x0066
                    X.2z0 r4 = r1.A1J
                    boolean r3 = r4.A02
                    if (r3 == 0) goto L_0x0066
                    X.4uZ r3 = r4.A00
                    boolean r3 = r3 instanceof X.C95804uY
                    if (r3 != 0) goto L_0x0066
                    X.8qC r3 = r2.A1v
                    X.2sS r3 = X.C18320x8.A0I(r3)
                    boolean r3 = r3.A04(r1)
                    if (r3 == 0) goto L_0x0973
                L_0x0066:
                    byte r4 = r1.A1I
                    r3 = 20
                    if (r4 == r3) goto L_0x0973
                    r19 = 1
                    X.2z0 r3 = r1.A1J
                    boolean r4 = r3.A02
                    int r3 = r1.A06
                    if (r4 == 0) goto L_0x0964
                    int r20 = java.lang.Math.max(r7, r3)
                L_0x007a:
                    X.4FS r3 = r2.A1r
                    r50 = r3
                    r4 = 44
                    X.C70173a4.A00(r3, r1, r2, r4)
                    boolean r3 = r1 instanceof X.AnonymousClass1n2
                    r6 = 0
                    if (r3 == 0) goto L_0x0104
                    r8 = r1
                    X.1mV r8 = (X.C30471mV) r8
                    X.33C r3 = r8.A01
                    if (r3 == 0) goto L_0x0120
                    java.io.File r9 = r3.A0F
                    if (r9 == 0) goto L_0x0120
                    X.C626936e.A06(r9)
                    r4 = 45
                    r3 = r50
                    X.C70173a4.A00(r3, r1, r2, r4)
                    java.lang.String r4 = r9.getAbsolutePath()     // Catch:{ IOException -> 0x0102, OutOfMemoryError -> 0x0100, 59c -> 0x00fe, SecurityException -> 0x011a }
                    X.0YU r3 = new X.0YU     // Catch:{ IOException -> 0x0102, OutOfMemoryError -> 0x0100, 59c -> 0x00fe, SecurityException -> 0x011a }
                    r3.<init>((java.lang.String) r4)     // Catch:{ IOException -> 0x0102, OutOfMemoryError -> 0x0100, 59c -> 0x00fe, SecurityException -> 0x011a }
                    int r3 = r3.A0G(r7)     // Catch:{ IOException -> 0x0102, OutOfMemoryError -> 0x0100, 59c -> 0x00fe, SecurityException -> 0x011a }
                    if (r3 == r7) goto L_0x0120
                    if (r3 == 0) goto L_0x0120
                    if (r5 == 0) goto L_0x00b1
                    goto L_0x00b5
                L_0x00b1:
                    r4 = r6
                    r38 = r6
                    goto L_0x00bb
                L_0x00b5:
                    java.util.List r4 = r1.A18     // Catch:{ IOException -> 0x0102, OutOfMemoryError -> 0x0100, 59c -> 0x00fe, SecurityException -> 0x011a }
                    java.lang.String r38 = r8.A1w()     // Catch:{ IOException -> 0x0102, OutOfMemoryError -> 0x0100, 59c -> 0x00fe, SecurityException -> 0x011a }
                L_0x00bb:
                    java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0102, OutOfMemoryError -> 0x0100, 59c -> 0x00fe, SecurityException -> 0x011a }
                    java.lang.String r3 = "sendmedia/send-image jids:"
                    r8.append(r3)     // Catch:{ IOException -> 0x0102, OutOfMemoryError -> 0x0100, 59c -> 0x00fe, SecurityException -> 0x011a }
                    java.lang.Object[] r3 = r51.toArray()     // Catch:{ IOException -> 0x0102, OutOfMemoryError -> 0x0100, 59c -> 0x00fe, SecurityException -> 0x011a }
                    java.lang.String r3 = java.util.Arrays.deepToString(r3)     // Catch:{ IOException -> 0x0102, OutOfMemoryError -> 0x0100, 59c -> 0x00fe, SecurityException -> 0x011a }
                    X.C18260x0.A1L(r8, r3)     // Catch:{ IOException -> 0x0102, OutOfMemoryError -> 0x0100, 59c -> 0x00fe, SecurityException -> 0x011a }
                    android.net.Uri r31 = android.net.Uri.fromFile(r9)     // Catch:{ IOException -> 0x0102, OutOfMemoryError -> 0x0100, 59c -> 0x00fe, SecurityException -> 0x011a }
                    r42 = 3
                    r33 = r6
                    r34 = r26
                    r35 = r6
                    r36 = r6
                    r37 = r6
                    r41 = r6
                    r46 = r0
                    r47 = r0
                    r48 = r0
                    r49 = r0
                    r30 = r54
                    r32 = r6
                    r39 = r51
                    r40 = r4
                    r43 = r20
                    r44 = r29
                    r45 = r0
                    X.2IK r3 = r30.A00(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)     // Catch:{ IOException -> 0x0102, OutOfMemoryError -> 0x0100, 59c -> 0x00fe, SecurityException -> 0x011a }
                    goto L_0x001c
                L_0x00fe:
                    r3 = move-exception
                    goto L_0x011b
                L_0x0100:
                    r3 = move-exception
                    goto L_0x011b
                L_0x0102:
                    r3 = move-exception
                    goto L_0x011b
                L_0x0104:
                    boolean r3 = r1 instanceof X.AnonymousClass1nE
                    if (r3 == 0) goto L_0x0120
                    r3 = r1
                    X.1mV r3 = (X.C30471mV) r3
                    long r3 = r3.A00
                    r9 = 1048576(0x100000, double:5.180654E-318)
                    int r8 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
                    if (r8 <= 0) goto L_0x0120
                    X.3Wi r1 = r2.A02
                    r0 = 2131894011(0x7f121efb, float:1.9422815E38)
                    goto L_0x0138
                L_0x011a:
                    r3 = move-exception
                L_0x011b:
                    r4 = r27
                    com.whatsapp.util.Log.e(r4, r3)
                L_0x0120:
                    X.1VX r3 = r2.A18
                    r44 = r3
                    X.3Mh r8 = r2.A07
                    X.2hp r3 = r2.A1e
                    r43 = r3
                    r4 = r3
                    r3 = r44
                    boolean r3 = X.C627636p.A0U(r8, r3, r1, r4)
                    if (r3 != 0) goto L_0x0149
                    X.3Wi r1 = r2.A02
                    r0 = 2131890742(0x7f121236, float:1.9416184E38)
                L_0x0138:
                    r1.A0F(r0, r7)
                L_0x013b:
                    X.2IK r3 = new X.2IK
                    r3.<init>()
                    X.3d3 r1 = X.C72023d3.A00
                    X.3XA r0 = r3.A00
                    r0.A05(r1)
                    goto L_0x001c
                L_0x0149:
                    X.34w r3 = r1.A0P
                    if (r3 == 0) goto L_0x0153
                    X.3Wi r1 = r2.A02
                    r0 = 2131890741(0x7f121235, float:1.9416182E38)
                    goto L_0x0138
                L_0x0153:
                    X.3LP r8 = r2.A19
                    X.4FV r4 = r2.A1A
                    r3 = 2
                    X.AnonymousClass31G.A02(r8, r4, r1, r3)
                    java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
                    java.lang.String r4 = "UserActions/userActionForwardMessage/forwarding message; message.key="
                    X.2z0 r22 = X.C624134x.A08(r1, r4, r3)
                    r4 = r22
                    X.C18260x0.A0m(r4, r3)
                    java.util.ArrayList r25 = X.AnonymousClass000.A0p(r51)
                    int r3 = r51.size()
                    if (r3 <= r7) goto L_0x019d
                    X.2rD r3 = r2.A1H
                    X.2sH r4 = r3.A06
                    X.2sr r3 = r3.A03
                    java.lang.String r21 = X.AnonymousClass35J.A02(r3, r4)
                L_0x017e:
                    byte r7 = r1.A1I
                    boolean r3 = X.C614630w.A00(r7)
                    if (r3 == 0) goto L_0x01b3
                    int r3 = r1.A0i()
                    if (r3 != 0) goto L_0x01b3
                    boolean r3 = r1.A1l()
                    if (r3 == 0) goto L_0x01b3
                    java.lang.String r3 = r1.A13()
                    int r3 = r3.length()
                    if (r3 <= 0) goto L_0x01b3
                    goto L_0x01a0
                L_0x019d:
                    r21 = r6
                    goto L_0x017e
                L_0x01a0:
                    java.lang.String r3 = r1.A13()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01ab, StringIndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01ad }
                    byte[] r24 = android.util.Base64.decode(r3, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01ab, StringIndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01ad }
                    goto L_0x01b5
                L_0x01a9:
                    r4 = move-exception
                    goto L_0x01ae
                L_0x01ab:
                    r4 = move-exception
                    goto L_0x01ae
                L_0x01ad:
                    r4 = move-exception
                L_0x01ae:
                    java.lang.String r3 = "UserActions/userActionForwardMessage/base64-decode/error"
                    com.whatsapp.util.Log.e(r3, r4)
                L_0x01b3:
                    r24 = r6
                L_0x01b5:
                    boolean r8 = r1 instanceof X.C31971pB
                    if (r8 == 0) goto L_0x01e7
                    r4 = 695(0x2b7, float:9.74E-43)
                    X.2vE r10 = X.C58422vE.A02
                    r3 = r44
                    boolean r3 = r3.A0Y(r10, r4)
                    if (r3 == 0) goto L_0x01e7
                    r3 = r1
                    X.1mV r3 = (X.C30471mV) r3
                    int r9 = r3.A0B
                    r4 = 6728(0x1a48, float:9.428E-42)
                    r3 = r44
                    int r3 = r3.A0O(r10, r4)
                    if (r9 <= r3) goto L_0x01e7
                    java.util.Iterator r4 = r51.iterator()
                L_0x01d8:
                    boolean r3 = r4.hasNext()
                    if (r3 == 0) goto L_0x01e7
                    java.lang.Object r3 = r4.next()
                    boolean r3 = r3 instanceof X.C135166kE
                    if (r3 == 0) goto L_0x01d8
                    r0 = 1
                L_0x01e7:
                    boolean r3 = r1 instanceof X.C30471mV
                    r23 = r3
                    if (r3 == 0) goto L_0x08c6
                    r3 = r1
                    X.1mV r3 = (X.C30471mV) r3
                    java.lang.String r3 = r3.A03
                    if (r3 == 0) goto L_0x08c6
                L_0x01f4:
                    r15 = 1
                L_0x01f5:
                    java.util.Iterator r9 = r51.iterator()
                L_0x01f9:
                    boolean r3 = r9.hasNext()
                    if (r3 == 0) goto L_0x07fa
                    java.lang.Object r3 = r9.next()
                    boolean r4 = r3 instanceof X.C135166kE
                    r3 = r44
                    boolean r3 = X.C624234y.A03(r3, r1, r4)
                    if (r3 == 0) goto L_0x01f9
                    X.2qb r3 = r1.A0l
                    X.30w r4 = r1.A0y()
                    X.C626936e.A06(r4)
                    boolean r4 = r4.A05()
                    if (r4 == 0) goto L_0x01f9
                    if (r3 == 0) goto L_0x0224
                    boolean r3 = r3.A01()
                    if (r3 != 0) goto L_0x01f9
                L_0x0224:
                    r31 = 0
                    if (r15 == 0) goto L_0x0235
                L_0x0228:
                    if (r8 == 0) goto L_0x0235
                    r0 = r1
                    X.1pC r0 = (X.C31981pC) r0
                    boolean r0 = X.AnonymousClass35Z.A03(r0)
                    r32 = 1
                    if (r0 != 0) goto L_0x0237
                L_0x0235:
                    r32 = 0
                L_0x0237:
                    java.util.Iterator r33 = r51.iterator()
                L_0x023b:
                    boolean r0 = r33.hasNext()
                    if (r0 == 0) goto L_0x08e9
                    X.4uZ r9 = X.C18300x5.A0P(r33)
                    X.2Lx r4 = r2.A1d     // Catch:{ 23o -> 0x08da }
                    X.2sH r0 = r2.A0V     // Catch:{ 23o -> 0x08da }
                    long r12 = r0.A0H()     // Catch:{ 23o -> 0x08da }
                    if (r31 != 0) goto L_0x0252
                    r11 = 0
                    if (r32 == 0) goto L_0x0253
                L_0x0252:
                    r11 = 1
                L_0x0253:
                    r3 = 1024(0x400, float:1.435E-42)
                    int r0 = r1.A0A     // Catch:{ 23o -> 0x08da }
                    r0 = r0 & r3
                    boolean r0 = X.AnonymousClass000.A1U(r0, r3)     // Catch:{ 23o -> 0x08da }
                    if (r0 == 0) goto L_0x0285
                    X.35J r0 = r4.A01     // Catch:{ 23o -> 0x08da }
                    X.2z0 r8 = X.AnonymousClass35J.A01(r9, r0)     // Catch:{ 23o -> 0x08da }
                    X.2U8 r3 = r1.A0c     // Catch:{ 23o -> 0x08da }
                    X.1mW r0 = new X.1mW     // Catch:{ 23o -> 0x08da }
                    r0.<init>(r8, r12)     // Catch:{ 23o -> 0x08da }
                    java.lang.String r8 = r3.A08     // Catch:{ 23o -> 0x08da }
                    r0.A1Z(r8)     // Catch:{ 23o -> 0x08da }
                    r0.A1P(r3)     // Catch:{ 23o -> 0x08da }
                L_0x0273:
                    X.1VX r10 = r4.A00     // Catch:{ 23o -> 0x08da }
                    r3 = 4513(0x11a1, float:6.324E-42)
                    X.2vE r8 = X.C58422vE.A02     // Catch:{ 23o -> 0x08da }
                    boolean r3 = r10.A0Y(r8, r3)     // Catch:{ 23o -> 0x08da }
                    if (r3 == 0) goto L_0x0618
                    r3 = 1
                    X.C162457s7.A0J(r0, r3)     // Catch:{ 23o -> 0x08da }
                    goto L_0x05f3
                L_0x0285:
                    r0 = 46
                    if (r7 != r0) goto L_0x02a2
                    X.35J r0 = r4.A01     // Catch:{ 23o -> 0x08da }
                    X.2z0 r3 = X.AnonymousClass35J.A01(r9, r0)     // Catch:{ 23o -> 0x08da }
                    java.lang.String r8 = r1.A13()     // Catch:{ 23o -> 0x08da }
                    X.1mW r0 = new X.1mW     // Catch:{ 23o -> 0x08da }
                    r0.<init>(r3, r12)     // Catch:{ 23o -> 0x08da }
                    r3 = 65536(0x10000, float:9.18355E-41)
                    java.lang.String r3 = X.C107575bX.A0C(r8, r3)     // Catch:{ 23o -> 0x08da }
                    r0.A1Z(r3)     // Catch:{ 23o -> 0x08da }
                    goto L_0x0273
                L_0x02a2:
                    if (r23 == 0) goto L_0x05bf
                    r3 = r1
                    X.1mV r3 = (X.C30471mV) r3     // Catch:{ 23o -> 0x08da }
                    X.33C r34 = X.C30471mV.A00(r3)     // Catch:{ 23o -> 0x08da }
                    if (r11 == 0) goto L_0x0563
                    X.33C r8 = r34.A02()     // Catch:{ 23o -> 0x08da }
                L_0x02b1:
                    long r14 = r8.A0B     // Catch:{ 23o -> 0x08da }
                    r16 = 0
                    int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                    if (r0 != 0) goto L_0x02bd
                    long r14 = r3.A0K     // Catch:{ 23o -> 0x08da }
                    r8.A0B = r14     // Catch:{ 23o -> 0x08da }
                L_0x02bd:
                    X.35J r0 = r4.A01     // Catch:{ 23o -> 0x08da }
                    X.2z0 r15 = X.AnonymousClass35J.A01(r9, r0)     // Catch:{ 23o -> 0x08da }
                    boolean r0 = r3 instanceof X.AnonymousClass1nE     // Catch:{ 23o -> 0x08da }
                    if (r0 == 0) goto L_0x033f
                    r10 = r3
                    X.1nE r10 = (X.AnonymousClass1nE) r10     // Catch:{ 23o -> 0x08da }
                    X.C626936e.A06(r8)     // Catch:{ 23o -> 0x08da }
                    r41 = 0
                    X.1nE r0 = new X.1nE     // Catch:{ 23o -> 0x08da }
                    r35 = r0
                    r36 = r8
                    r37 = r15
                    r38 = r10
                    r39 = r12
                    r35.<init>(r36, r37, r38, r39, r41)     // Catch:{ 23o -> 0x08da }
                L_0x02de:
                    X.1VX r10 = r4.A00     // Catch:{ 23o -> 0x08da }
                    boolean r12 = X.AnonymousClass2z0.A0B(r0)     // Catch:{ 23o -> 0x08da }
                    boolean r12 = X.C624234y.A03(r10, r3, r12)     // Catch:{ 23o -> 0x08da }
                    if (r12 == 0) goto L_0x0315
                    X.2qb r12 = r3.A0l     // Catch:{ 23o -> 0x08da }
                    if (r12 == 0) goto L_0x0315
                    boolean r12 = r12.A01()     // Catch:{ 23o -> 0x08da }
                    if (r12 == 0) goto L_0x0315
                    X.30w r12 = r3.A0y()     // Catch:{ 23o -> 0x08da }
                    X.C626936e.A06(r12)     // Catch:{ 23o -> 0x08da }
                    boolean r12 = r12.A05()     // Catch:{ 23o -> 0x08da }
                    if (r12 == 0) goto L_0x0315
                    X.2qb r12 = r3.A0l     // Catch:{ 23o -> 0x08da }
                    byte[] r12 = r12.A0A     // Catch:{ 23o -> 0x08da }
                    byte[] r8 = r8.A0W     // Catch:{ 23o -> 0x08da }
                    boolean r8 = java.util.Arrays.equals(r12, r8)     // Catch:{ 23o -> 0x08da }
                    if (r8 != 0) goto L_0x0327
                    java.lang.String r3 = "FMessageFactory/newFMessageForForward/thumbnail and media file key not the same"
                    com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ 23o -> 0x08da }
                    r0.A1W(r6)     // Catch:{ 23o -> 0x08da }
                L_0x0315:
                    boolean r3 = X.C624234y.A01(r10, r0)     // Catch:{ 23o -> 0x08da }
                    r12 = 1
                    if (r3 == 0) goto L_0x056f
                    X.30d r3 = r0.A1v()     // Catch:{ 23o -> 0x08da }
                    X.C626936e.A06(r3)     // Catch:{ 23o -> 0x08da }
                    r3.A05 = r12     // Catch:{ 23o -> 0x08da }
                    goto L_0x056f
                L_0x0327:
                    X.2qb r3 = r3.A0l     // Catch:{ 23o -> 0x08da }
                    X.2qb r8 = r3.A00()     // Catch:{ 23o -> 0x08da }
                    r3 = r34
                    long r12 = r3.A0B     // Catch:{ 23o -> 0x08da }
                    r8.A02 = r12     // Catch:{ 23o -> 0x08da }
                    r8.A09 = r11     // Catch:{ 23o -> 0x08da }
                    boolean r3 = X.C624234y.A02(r10, r0)     // Catch:{ 23o -> 0x08da }
                    r8.A0C = r3     // Catch:{ 23o -> 0x08da }
                    r0.A1W(r8)     // Catch:{ 23o -> 0x08da }
                    goto L_0x0315
                L_0x033f:
                    boolean r0 = r3 instanceof X.C30821nD     // Catch:{ 23o -> 0x08da }
                    if (r0 == 0) goto L_0x034c
                    java.lang.String r0 = "Order messages can not be forwarded"
                    X.23o r1 = new X.23o     // Catch:{ 23o -> 0x08da }
                    r1.<init>(r0)     // Catch:{ 23o -> 0x08da }
                    goto L_0x08d9
                L_0x034c:
                    boolean r0 = r3 instanceof X.AnonymousClass1n3     // Catch:{ 23o -> 0x08da }
                    if (r0 == 0) goto L_0x0359
                    java.lang.String r0 = "ViewOnce messages can not be forwarded"
                    X.23o r1 = new X.23o     // Catch:{ 23o -> 0x08da }
                    r1.<init>(r0)     // Catch:{ 23o -> 0x08da }
                    goto L_0x08d9
                L_0x0359:
                    boolean r0 = r3 instanceof X.AnonymousClass1n2     // Catch:{ 23o -> 0x08da }
                    if (r0 == 0) goto L_0x0405
                    r10 = r3
                    X.1n2 r10 = (X.AnonymousClass1n2) r10     // Catch:{ 23o -> 0x08da }
                    boolean r0 = r10 instanceof X.C30771mz     // Catch:{ 23o -> 0x08da }
                    if (r0 == 0) goto L_0x037f
                    X.1mz r10 = (X.C30771mz) r10     // Catch:{ 23o -> 0x08da }
                    X.C626936e.A06(r8)     // Catch:{ 23o -> 0x08da }
                    r41 = 0
                    X.1mz r0 = new X.1mz     // Catch:{ 23o -> 0x08da }
                    r35 = r0
                    r36 = r8
                    r37 = r15
                    r38 = r10
                    r39 = r12
                    r35.<init>(r36, r37, r38, r39, r41)     // Catch:{ 23o -> 0x08da }
                    X.C30471mV.A02(r0, r5)     // Catch:{ 23o -> 0x08da }
                    goto L_0x02de
                L_0x037f:
                    boolean r0 = r10 instanceof X.AnonymousClass1n0     // Catch:{ 23o -> 0x08da }
                    if (r0 == 0) goto L_0x039a
                    X.C626936e.A06(r8)     // Catch:{ 23o -> 0x08da }
                    X.1n2 r0 = new X.1n2     // Catch:{ 23o -> 0x08da }
                    r35 = r0
                    r36 = r8
                    r37 = r15
                    r38 = r10
                    r39 = r12
                    r35.<init>(r36, r37, r38, r39)     // Catch:{ 23o -> 0x08da }
                    X.C30471mV.A02(r0, r5)     // Catch:{ 23o -> 0x08da }
                    goto L_0x02de
                L_0x039a:
                    boolean r0 = r10 instanceof X.AnonymousClass1n1     // Catch:{ 23o -> 0x08da }
                    if (r0 == 0) goto L_0x03cd
                    X.1n1 r10 = (X.AnonymousClass1n1) r10     // Catch:{ 23o -> 0x08da }
                    r14 = 0
                    X.C162457s7.A0J(r15, r14)     // Catch:{ 23o -> 0x08da }
                    X.C626936e.A06(r8)     // Catch:{ 23o -> 0x08da }
                    X.C162457s7.A0H(r8)     // Catch:{ 23o -> 0x08da }
                    X.1n1 r0 = new X.1n1     // Catch:{ 23o -> 0x08da }
                    r35 = r0
                    r36 = r8
                    r37 = r15
                    r38 = r10
                    r39 = r12
                    r41 = r14
                    r35.<init>((X.AnonymousClass33C) r36, (X.AnonymousClass2z0) r37, (X.AnonymousClass1n1) r38, (long) r39, (boolean) r41)     // Catch:{ 23o -> 0x08da }
                    boolean r14 = X.C18300x5.A1T(r10)     // Catch:{ 23o -> 0x08da }
                    if (r14 == 0) goto L_0x03c8
                    X.1n2 r0 = new X.1n2     // Catch:{ 23o -> 0x08da }
                    r35 = r0
                    r35.<init>(r36, r37, r38, r39)     // Catch:{ 23o -> 0x08da }
                L_0x03c8:
                    X.C30471mV.A02(r0, r5)     // Catch:{ 23o -> 0x08da }
                    goto L_0x02de
                L_0x03cd:
                    boolean r0 = r10 instanceof X.C30761my     // Catch:{ 23o -> 0x08da }
                    if (r0 == 0) goto L_0x03ec
                    X.1my r10 = (X.C30761my) r10     // Catch:{ 23o -> 0x08da }
                    X.C626936e.A06(r8)     // Catch:{ 23o -> 0x08da }
                    r41 = 0
                    X.1my r0 = new X.1my     // Catch:{ 23o -> 0x08da }
                    r35 = r0
                    r36 = r8
                    r37 = r15
                    r38 = r10
                    r39 = r12
                    r35.<init>(r36, r37, r38, r39, r41)     // Catch:{ 23o -> 0x08da }
                    X.C30471mV.A02(r0, r5)     // Catch:{ 23o -> 0x08da }
                    goto L_0x02de
                L_0x03ec:
                    X.C626936e.A06(r8)     // Catch:{ 23o -> 0x08da }
                    r41 = 0
                    X.1n2 r0 = new X.1n2     // Catch:{ 23o -> 0x08da }
                    r35 = r0
                    r36 = r8
                    r37 = r15
                    r38 = r10
                    r39 = r12
                    r35.<init>(r36, r37, r38, r39, r41)     // Catch:{ 23o -> 0x08da }
                    X.C30471mV.A02(r0, r5)     // Catch:{ 23o -> 0x08da }
                    goto L_0x02de
                L_0x0405:
                    boolean r0 = r3 instanceof X.C31991pD     // Catch:{ 23o -> 0x08da }
                    if (r0 == 0) goto L_0x0412
                    java.lang.String r0 = "ViewOnce messages can not be forwarded"
                    X.23o r1 = new X.23o     // Catch:{ 23o -> 0x08da }
                    r1.<init>(r0)     // Catch:{ 23o -> 0x08da }
                    goto L_0x08d9
                L_0x0412:
                    boolean r0 = r3 instanceof X.C31971pB     // Catch:{ 23o -> 0x08da }
                    if (r0 == 0) goto L_0x0471
                    r10 = r3
                    X.1pB r10 = (X.C31971pB) r10     // Catch:{ 23o -> 0x08da }
                    boolean r0 = r10 instanceof X.C31941p8     // Catch:{ 23o -> 0x08da }
                    if (r0 == 0) goto L_0x043b
                    r0 = 0
                    X.C162457s7.A0J(r15, r0)     // Catch:{ 23o -> 0x08da }
                    X.C626936e.A06(r8)     // Catch:{ 23o -> 0x08da }
                    X.C162457s7.A0H(r8)     // Catch:{ 23o -> 0x08da }
                    X.1pB r0 = new X.1pB     // Catch:{ 23o -> 0x08da }
                    r35 = r0
                    r36 = r8
                    r37 = r15
                    r38 = r10
                    r39 = r12
                    r35.<init>(r36, r37, r38, r39)     // Catch:{ 23o -> 0x08da }
                    X.C30471mV.A02(r0, r5)     // Catch:{ 23o -> 0x08da }
                    goto L_0x02de
                L_0x043b:
                    boolean r0 = r10 instanceof X.AnonymousClass1p7     // Catch:{ 23o -> 0x08da }
                    if (r0 == 0) goto L_0x0458
                    X.C626936e.A06(r8)     // Catch:{ 23o -> 0x08da }
                    X.33C r14 = r10.A01     // Catch:{ 23o -> 0x08da }
                    X.1pB r0 = new X.1pB     // Catch:{ 23o -> 0x08da }
                    r35 = r0
                    r36 = r14
                    r37 = r15
                    r38 = r10
                    r39 = r12
                    r35.<init>(r36, r37, r38, r39)     // Catch:{ 23o -> 0x08da }
                    X.C30471mV.A02(r0, r5)     // Catch:{ 23o -> 0x08da }
                    goto L_0x02de
                L_0x0458:
                    X.C626936e.A06(r8)     // Catch:{ 23o -> 0x08da }
                    r41 = 0
                    X.1pB r0 = new X.1pB     // Catch:{ 23o -> 0x08da }
                    r35 = r0
                    r36 = r8
                    r37 = r15
                    r38 = r10
                    r39 = r12
                    r35.<init>(r36, r37, r38, r39, r41)     // Catch:{ 23o -> 0x08da }
                    X.C30471mV.A02(r0, r5)     // Catch:{ 23o -> 0x08da }
                    goto L_0x02de
                L_0x0471:
                    boolean r0 = r3 instanceof X.C31951p9     // Catch:{ 23o -> 0x08da }
                    if (r0 == 0) goto L_0x0491
                    r10 = r3
                    X.1p9 r10 = (X.C31951p9) r10     // Catch:{ 23o -> 0x08da }
                    X.C626936e.A06(r8)     // Catch:{ 23o -> 0x08da }
                    r41 = 0
                    X.1p9 r0 = new X.1p9     // Catch:{ 23o -> 0x08da }
                    r35 = r0
                    r36 = r8
                    r37 = r15
                    r38 = r10
                    r39 = r12
                    r35.<init>(r36, r37, r38, r39, r41)     // Catch:{ 23o -> 0x08da }
                    X.C30471mV.A02(r0, r5)     // Catch:{ 23o -> 0x08da }
                    goto L_0x02de
                L_0x0491:
                    boolean r0 = r3 instanceof X.C31961pA     // Catch:{ 23o -> 0x08da }
                    if (r0 == 0) goto L_0x04ce
                    r10 = r3
                    X.1pA r10 = (X.C31961pA) r10     // Catch:{ 23o -> 0x08da }
                    boolean r0 = r10 instanceof X.C30751mx     // Catch:{ 23o -> 0x08da }
                    if (r0 == 0) goto L_0x04b5
                    X.C626936e.A06(r8)     // Catch:{ 23o -> 0x08da }
                    X.33C r14 = r10.A01     // Catch:{ 23o -> 0x08da }
                    X.1pA r0 = new X.1pA     // Catch:{ 23o -> 0x08da }
                    r35 = r0
                    r36 = r14
                    r37 = r15
                    r38 = r10
                    r39 = r12
                    r35.<init>(r36, r37, r38, r39)     // Catch:{ 23o -> 0x08da }
                    X.C30471mV.A02(r0, r5)     // Catch:{ 23o -> 0x08da }
                    goto L_0x02de
                L_0x04b5:
                    X.C626936e.A06(r8)     // Catch:{ 23o -> 0x08da }
                    r41 = 0
                    X.1pA r0 = new X.1pA     // Catch:{ 23o -> 0x08da }
                    r35 = r0
                    r36 = r8
                    r37 = r15
                    r38 = r10
                    r39 = r12
                    r35.<init>(r36, r37, r38, r39, r41)     // Catch:{ 23o -> 0x08da }
                    X.C30471mV.A02(r0, r5)     // Catch:{ 23o -> 0x08da }
                    goto L_0x02de
                L_0x04ce:
                    boolean r0 = r3 instanceof X.AnonymousClass1nF     // Catch:{ 23o -> 0x08da }
                    if (r0 == 0) goto L_0x053d
                    r10 = r3
                    X.1nF r10 = (X.AnonymousClass1nF) r10     // Catch:{ 23o -> 0x08da }
                    boolean r0 = r10 instanceof X.C30731mv     // Catch:{ 23o -> 0x08da }
                    if (r0 == 0) goto L_0x04e1
                    X.C626936e.A06(r8)     // Catch:{ 23o -> 0x08da }
                    r42 = 0
                    r14 = 9
                    goto L_0x0525
                L_0x04e1:
                    boolean r0 = r10 instanceof X.C30741mw     // Catch:{ 23o -> 0x08da }
                    if (r0 == 0) goto L_0x051e
                    X.1mw r10 = (X.C30741mw) r10     // Catch:{ 23o -> 0x08da }
                    r14 = 0
                    X.C162457s7.A0J(r15, r14)     // Catch:{ 23o -> 0x08da }
                    X.C626936e.A06(r8)     // Catch:{ 23o -> 0x08da }
                    X.C162457s7.A0H(r8)     // Catch:{ 23o -> 0x08da }
                    X.1mw r0 = new X.1mw     // Catch:{ 23o -> 0x08da }
                    r35 = r0
                    r36 = r8
                    r37 = r15
                    r38 = r10
                    r39 = r12
                    r41 = r14
                    r35.<init>(r36, r37, r38, r39, r41)     // Catch:{ 23o -> 0x08da }
                    boolean r30 = X.C18300x5.A1T(r10)     // Catch:{ 23o -> 0x08da }
                    if (r30 == 0) goto L_0x0515
                    r39 = 9
                    X.1nF r0 = new X.1nF     // Catch:{ 23o -> 0x08da }
                    r35 = r0
                    r40 = r12
                    r42 = r14
                    r35.<init>(r36, r37, r38, r39, r40, r42)     // Catch:{ 23o -> 0x08da }
                L_0x0515:
                    if (r5 != 0) goto L_0x02de
                    r0.A02 = r6     // Catch:{ 23o -> 0x08da }
                    r0.A23(r6)     // Catch:{ 23o -> 0x08da }
                    goto L_0x02de
                L_0x051e:
                    X.C626936e.A06(r8)     // Catch:{ 23o -> 0x08da }
                    r42 = 0
                    byte r14 = r10.A1I     // Catch:{ 23o -> 0x08da }
                L_0x0525:
                    X.1nF r0 = new X.1nF     // Catch:{ 23o -> 0x08da }
                    r35 = r0
                    r36 = r8
                    r37 = r15
                    r38 = r10
                    r39 = r14
                    r40 = r12
                    r35.<init>(r36, r37, r38, r39, r40, r42)     // Catch:{ 23o -> 0x08da }
                    if (r5 != 0) goto L_0x02de
                    r0.A23(r6)     // Catch:{ 23o -> 0x08da }
                    goto L_0x02de
                L_0x053d:
                    r10 = r3
                    X.1mu r10 = (X.C30721mu) r10     // Catch:{ 23o -> 0x08da }
                    boolean r0 = r10 instanceof X.C30711mt     // Catch:{ 23o -> 0x08da }
                    if (r0 == 0) goto L_0x054d
                    java.lang.String r0 = "ViewOnce messages can not be forwarded"
                    X.23o r1 = new X.23o     // Catch:{ 23o -> 0x08da }
                    r1.<init>(r0)     // Catch:{ 23o -> 0x08da }
                    goto L_0x08d9
                L_0x054d:
                    X.C626936e.A06(r8)     // Catch:{ 23o -> 0x08da }
                    r41 = 0
                    X.1mu r0 = new X.1mu     // Catch:{ 23o -> 0x08da }
                    r35 = r0
                    r36 = r8
                    r37 = r15
                    r38 = r10
                    r39 = r12
                    r35.<init>(r36, r37, r38, r39, r41)     // Catch:{ 23o -> 0x08da }
                    goto L_0x02de
                L_0x0563:
                    X.33C r8 = new X.33C     // Catch:{ 23o -> 0x08da }
                    r0 = r34
                    r8.<init>(r0)     // Catch:{ 23o -> 0x08da }
                    r0 = 0
                    r8.A0R = r0     // Catch:{ 23o -> 0x08da }
                    goto L_0x02b1
                L_0x056f:
                    if (r11 == 0) goto L_0x0576
                    r3 = 2
                    r0.A1G(r3)     // Catch:{ 23o -> 0x08da }
                    goto L_0x05b8
                L_0x0576:
                    boolean r3 = r0 instanceof X.AnonymousClass1n2     // Catch:{ 23o -> 0x08da }
                    if (r3 == 0) goto L_0x05b3
                    r0.A04 = r6     // Catch:{ 23o -> 0x08da }
                    r0.A03 = r6     // Catch:{ 23o -> 0x08da }
                    X.33C r3 = X.C30471mV.A00(r0)     // Catch:{ 23o -> 0x08da }
                    r3.A0L = r6     // Catch:{ 23o -> 0x08da }
                    X.33C r3 = r0.A01     // Catch:{ 23o -> 0x08da }
                    r3.A0K = r6     // Catch:{ 23o -> 0x08da }
                    X.30d r13 = r0.A1v()     // Catch:{ 23o -> 0x08da }
                    if (r13 == 0) goto L_0x05b3
                    int[] r8 = r13.A07()     // Catch:{ 23o -> 0x08da }
                    r13.A01()     // Catch:{ 23o -> 0x08da }
                    if (r8 == 0) goto L_0x05b3
                    int r10 = r8.length     // Catch:{ 23o -> 0x08da }
                    r3 = 4
                    if (r10 != r3) goto L_0x05b3
                    r3 = 0
                L_0x059c:
                    r11 = r8[r3]     // Catch:{ 23o -> 0x08da }
                    long r14 = (long) r11     // Catch:{ 23o -> 0x08da }
                    long r16 = r16 + r14
                    int r3 = r3 + 1
                    if (r3 < r10) goto L_0x059c
                    X.33C r3 = r0.A01     // Catch:{ 23o -> 0x08da }
                    long r10 = r3.A0A     // Catch:{ 23o -> 0x08da }
                    int r3 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
                    if (r3 != 0) goto L_0x05b3
                    monitor-enter(r13)     // Catch:{ 23o -> 0x08da }
                    r13.A03 = r8     // Catch:{ all -> 0x08d7 }
                    r13.A01 = r12     // Catch:{ all -> 0x08d7 }
                    monitor-exit(r13)     // Catch:{ 23o -> 0x08da }
                L_0x05b3:
                    r0.A1G(r12)     // Catch:{ 23o -> 0x08da }
                    r0.A07 = r6     // Catch:{ 23o -> 0x08da }
                L_0x05b8:
                    r3 = r21
                    r0.A1a(r3)     // Catch:{ 23o -> 0x08da }
                    goto L_0x0273
                L_0x05bf:
                    boolean r0 = r1 instanceof X.C30481mW     // Catch:{ 23o -> 0x08da }
                    if (r0 == 0) goto L_0x05d5
                    r3 = r1
                    X.1mW r3 = (X.C30481mW) r3     // Catch:{ 23o -> 0x08da }
                    X.35J r0 = r4.A01     // Catch:{ 23o -> 0x08da }
                    X.2z0 r0 = X.AnonymousClass35J.A01(r9, r0)     // Catch:{ 23o -> 0x08da }
                    X.1mW r0 = r3.A1v(r0, r12)     // Catch:{ 23o -> 0x08da }
                L_0x05d0:
                    X.2qb r3 = r1.A0l     // Catch:{ 23o -> 0x08da }
                    if (r11 == 0) goto L_0x0273
                    goto L_0x05e8
                L_0x05d5:
                    boolean r0 = r1 instanceof X.AnonymousClass4BA     // Catch:{ 23o -> 0x08da }
                    X.C626936e.A0C(r0)     // Catch:{ 23o -> 0x08da }
                    r3 = r1
                    X.4BA r3 = (X.AnonymousClass4BA) r3     // Catch:{ 23o -> 0x08da }
                    X.35J r0 = r4.A01     // Catch:{ 23o -> 0x08da }
                    X.2z0 r0 = X.AnonymousClass35J.A01(r9, r0)     // Catch:{ 23o -> 0x08da }
                    X.34x r0 = r3.Az2(r0, r12)     // Catch:{ 23o -> 0x08da }
                    goto L_0x05d0
                L_0x05e8:
                    if (r3 == 0) goto L_0x0273
                    X.2qb r3 = r3.A00()     // Catch:{ 23o -> 0x08da }
                    r0.A1W(r3)     // Catch:{ 23o -> 0x08da }
                    goto L_0x0273
                L_0x05f3:
                    r3 = 25
                    if (r7 == r3) goto L_0x062f
                    r3 = 26
                    if (r7 == r3) goto L_0x062f
                    r3 = 27
                    if (r7 == r3) goto L_0x062f
                    r3 = 28
                    if (r7 == r3) goto L_0x062f
                    r3 = 29
                    if (r7 == r3) goto L_0x062f
                    r3 = 30
                    if (r7 == r3) goto L_0x062f
                    r3 = 23
                    if (r7 == r3) goto L_0x062f
                    r3 = 52
                    if (r7 == r3) goto L_0x062f
                    r3 = 37
                    if (r7 == r3) goto L_0x062f
                    goto L_0x061c
                L_0x0618:
                    r0.A1M(r6)     // Catch:{ 23o -> 0x08da }
                    goto L_0x0641
                L_0x061c:
                    boolean r3 = r1 instanceof X.AnonymousClass4DV     // Catch:{ 23o -> 0x08da }
                    if (r3 == 0) goto L_0x0641
                    r3 = r1
                    X.4DV r3 = (X.AnonymousClass4DV) r3     // Catch:{ 23o -> 0x08da }
                    if (r3 == 0) goto L_0x0641
                    X.39W r3 = r3.B5s()     // Catch:{ 23o -> 0x08da }
                    if (r3 == 0) goto L_0x0641
                    java.lang.String r3 = r3.A0A     // Catch:{ 23o -> 0x08da }
                    if (r3 == 0) goto L_0x0641
                L_0x062f:
                    r3 = r22
                    X.4uZ r4 = r3.A00     // Catch:{ 23o -> 0x08da }
                    boolean r3 = r4 instanceof com.whatsapp.jid.UserJid     // Catch:{ 23o -> 0x08da }
                    if (r3 == 0) goto L_0x0641
                    com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4     // Catch:{ 23o -> 0x08da }
                    X.2kg r3 = new X.2kg     // Catch:{ 23o -> 0x08da }
                    r3.<init>(r6, r4)     // Catch:{ 23o -> 0x08da }
                    r0.A1M(r3)     // Catch:{ 23o -> 0x08da }
                L_0x0641:
                    r3 = 5431(0x1537, float:7.61E-42)
                    boolean r3 = r10.A0Y(r8, r3)     // Catch:{ 23o -> 0x08da }
                    if (r3 == 0) goto L_0x064f
                    java.lang.Long r3 = X.C624134x.A0A(r1)     // Catch:{ 23o -> 0x08da }
                    r0.A0s = r3     // Catch:{ 23o -> 0x08da }
                L_0x064f:
                    boolean r4 = X.AnonymousClass31H.A02(r1)     // Catch:{ 23o -> 0x08da }
                    r3 = 3
                    if (r4 == 0) goto L_0x0657
                    r3 = 7
                L_0x0657:
                    r0.A09 = r3     // Catch:{ 23o -> 0x08da }
                    boolean r9 = r9 instanceof X.C135166kE     // Catch:{ 23o -> 0x08da }
                    if (r9 == 0) goto L_0x070d
                    boolean r3 = android.text.TextUtils.isEmpty(r52)     // Catch:{ 23o -> 0x08da }
                    if (r3 != 0) goto L_0x066a
                    java.lang.String r3 = r52.trim()     // Catch:{ 23o -> 0x08da }
                    r0.A1f(r3)     // Catch:{ 23o -> 0x08da }
                L_0x066a:
                    boolean r3 = r0 instanceof X.C30481mW     // Catch:{ 23o -> 0x08da }
                    if (r3 == 0) goto L_0x06df
                    r10 = r0
                    X.1mW r10 = (X.C30481mW) r10     // Catch:{ 23o -> 0x08da }
                    com.whatsapp.TextData r4 = new com.whatsapp.TextData     // Catch:{ 23o -> 0x08da }
                    r4.<init>()     // Catch:{ 23o -> 0x08da }
                    int r3 = X.C107415bH.A00()     // Catch:{ 23o -> 0x08da }
                    r4.backgroundColor = r3     // Catch:{ 23o -> 0x08da }
                    r3 = -1
                    r4.textColor = r3     // Catch:{ 23o -> 0x08da }
                    r3 = 0
                    r4.fontStyle = r3     // Catch:{ 23o -> 0x08da }
                    r10.A1x(r4)     // Catch:{ 23o -> 0x08da }
                    boolean r3 = X.AnonymousClass353.A04(r0)     // Catch:{ 23o -> 0x08da }
                    if (r3 == 0) goto L_0x06fb
                    java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()     // Catch:{ 23o -> 0x08da }
                    java.lang.String r3 = r0.A13()     // Catch:{ 23o -> 0x08da }
                    boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ 23o -> 0x08da }
                    if (r4 != 0) goto L_0x069c
                    r10.append(r3)     // Catch:{ 23o -> 0x08da }
                L_0x069c:
                    java.lang.String r3 = X.AnonymousClass353.A01(r0)     // Catch:{ 23o -> 0x08da }
                    boolean r11 = android.text.TextUtils.isEmpty(r3)     // Catch:{ 23o -> 0x08da }
                    java.lang.String r4 = "\n\n"
                    if (r11 != 0) goto L_0x06b4
                    boolean r11 = android.text.TextUtils.isEmpty(r10)     // Catch:{ 23o -> 0x08da }
                    if (r11 != 0) goto L_0x06b1
                    r10.append(r4)     // Catch:{ 23o -> 0x08da }
                L_0x06b1:
                    r10.append(r3)     // Catch:{ 23o -> 0x08da }
                L_0x06b4:
                    X.2Ot r3 = X.C40802Hu.A01(r0)     // Catch:{ 23o -> 0x08da }
                    if (r3 == 0) goto L_0x06ce
                    java.lang.String r3 = r3.A01     // Catch:{ 23o -> 0x08da }
                    boolean r11 = android.text.TextUtils.isEmpty(r3)     // Catch:{ 23o -> 0x08da }
                    if (r11 != 0) goto L_0x06ce
                    boolean r11 = android.text.TextUtils.isEmpty(r10)     // Catch:{ 23o -> 0x08da }
                    if (r11 != 0) goto L_0x06cb
                    r10.append(r4)     // Catch:{ 23o -> 0x08da }
                L_0x06cb:
                    r10.append(r3)     // Catch:{ 23o -> 0x08da }
                L_0x06ce:
                    java.lang.String r4 = r10.toString()     // Catch:{ 23o -> 0x08da }
                    boolean r3 = android.text.TextUtils.isEmpty(r4)     // Catch:{ 23o -> 0x08da }
                    if (r3 != 0) goto L_0x06df
                    java.lang.String r3 = X.C107415bH.A07(r4)     // Catch:{ 23o -> 0x08da }
                    r0.A1Z(r3)     // Catch:{ 23o -> 0x08da }
                L_0x06df:
                    boolean r3 = r0 instanceof X.C30721mu     // Catch:{ 23o -> 0x08da }
                    if (r3 == 0) goto L_0x070d
                    r11 = r0
                    X.1nC r11 = (X.C30811nC) r11     // Catch:{ 23o -> 0x08da }
                    X.2xx r3 = r11.A00     // Catch:{ 23o -> 0x08da }
                    if (r3 == 0) goto L_0x06f9
                    byte[] r10 = r3.A02     // Catch:{ 23o -> 0x08da }
                L_0x06ec:
                    int r4 = X.C107415bH.A00()     // Catch:{ 23o -> 0x08da }
                    X.2xx r3 = new X.2xx     // Catch:{ 23o -> 0x08da }
                    r3.<init>(r10, r4)     // Catch:{ 23o -> 0x08da }
                    r11.A23(r3)     // Catch:{ 23o -> 0x08da }
                    goto L_0x070d
                L_0x06f9:
                    r10 = r6
                    goto L_0x06ec
                L_0x06fb:
                    boolean r3 = X.C624134x.A0a(r1)     // Catch:{ 23o -> 0x08da }
                    if (r3 != 0) goto L_0x06df
                    java.lang.String r3 = r0.A13()     // Catch:{ 23o -> 0x08da }
                    java.lang.String r3 = X.C107415bH.A07(r3)     // Catch:{ 23o -> 0x08da }
                    r0.A1Z(r3)     // Catch:{ 23o -> 0x08da }
                    goto L_0x06df
                L_0x070d:
                    if (r19 == 0) goto L_0x07a3
                    r3 = 1
                    r0.A1B(r3)     // Catch:{ 23o -> 0x08da }
                    r3 = r20
                    r0.A06 = r3     // Catch:{ 23o -> 0x08da }
                    r3 = r22
                    X.4uZ r11 = r3.A00     // Catch:{ 23o -> 0x08da }
                    boolean r3 = r11 instanceof X.C95804uY     // Catch:{ 23o -> 0x08da }
                    if (r3 != 0) goto L_0x0726
                    X.2mS r4 = r1.A0z()     // Catch:{ 23o -> 0x08da }
                    r13 = 0
                    if (r4 == 0) goto L_0x0727
                L_0x0726:
                    r13 = 1
                L_0x0727:
                    X.2mS r4 = r1.A0z()     // Catch:{ 23o -> 0x08da }
                    if (r4 == 0) goto L_0x073d
                    X.2mS r3 = r1.A0z()     // Catch:{ 23o -> 0x08da }
                    r0.A1T(r3)     // Catch:{ 23o -> 0x08da }
                L_0x0734:
                    X.2mS r3 = r0.A0z()     // Catch:{ 23o -> 0x08da }
                    if (r3 == 0) goto L_0x075a
                    X.21p r4 = r3.A02     // Catch:{ 23o -> 0x08da }
                    goto L_0x075b
                L_0x073d:
                    if (r3 == 0) goto L_0x0734
                    X.2ss r3 = r2.A0i     // Catch:{ 23o -> 0x08da }
                    X.31A r12 = X.C56982ss.A00(r3, r11)     // Catch:{ 23o -> 0x08da }
                    X.1RL r12 = (X.AnonymousClass1RL) r12     // Catch:{ 23o -> 0x08da }
                    X.4uY r11 = (X.C95804uY) r11     // Catch:{ 23o -> 0x08da }
                    long r3 = r1.A1M     // Catch:{ 23o -> 0x08da }
                    int r10 = (int) r3     // Catch:{ 23o -> 0x08da }
                    java.lang.String r4 = r12.A0H     // Catch:{ 23o -> 0x08da }
                    X.C18260x0.A0R(r11, r4)     // Catch:{ 23o -> 0x08da }
                    X.2mS r3 = new X.2mS     // Catch:{ 23o -> 0x08da }
                    r3.<init>(r11, r6, r4, r10)     // Catch:{ 23o -> 0x08da }
                    r0.A1T(r3)     // Catch:{ 23o -> 0x08da }
                    goto L_0x0734
                L_0x075a:
                    r4 = r6
                L_0x075b:
                    if (r13 == 0) goto L_0x078c
                    X.8qC r3 = r2.A1y     // Catch:{ 23o -> 0x08da }
                    java.lang.Object r12 = r3.get()     // Catch:{ 23o -> 0x08da }
                    X.5YD r12 = (X.AnonymousClass5YD) r12     // Catch:{ 23o -> 0x08da }
                    X.2z0 r3 = r0.A1J     // Catch:{ 23o -> 0x08da }
                    X.4uZ r3 = r3.A00     // Catch:{ 23o -> 0x08da }
                    java.lang.Integer r11 = X.AnonymousClass36E.A06(r3)     // Catch:{ 23o -> 0x08da }
                    X.21p r3 = X.C372721p.UPDATE_CARD     // Catch:{ 23o -> 0x08da }
                    boolean r3 = r3.equals(r4)     // Catch:{ 23o -> 0x08da }
                    if (r3 != 0) goto L_0x077e
                    X.21p r3 = X.C372721p.LINK_CARD     // Catch:{ 23o -> 0x08da }
                    boolean r3 = r3.equals(r4)     // Catch:{ 23o -> 0x08da }
                    r10 = 0
                    if (r3 == 0) goto L_0x077f
                L_0x077e:
                    r10 = 1
                L_0x077f:
                    int r4 = r1.A09     // Catch:{ 23o -> 0x08da }
                    boolean r3 = X.C627636p.A0p(r1)     // Catch:{ 23o -> 0x08da }
                    int r3 = X.C106495Zf.A00(r7, r4, r3)     // Catch:{ 23o -> 0x08da }
                    r12.A0D(r0, r11, r10, r3)     // Catch:{ 23o -> 0x08da }
                L_0x078c:
                    r4 = 4513(0x11a1, float:6.324E-42)
                    r3 = r44
                    boolean r3 = r3.A0Y(r8, r4)     // Catch:{ 23o -> 0x08da }
                    if (r3 == 0) goto L_0x07a3
                    X.2kg r3 = r1.A0s()     // Catch:{ 23o -> 0x08da }
                    if (r3 == 0) goto L_0x07a3
                    X.2kg r3 = r1.A0s()     // Catch:{ 23o -> 0x08da }
                    r0.A1M(r3)     // Catch:{ 23o -> 0x08da }
                L_0x07a3:
                    boolean r3 = r0 instanceof X.AnonymousClass1nE     // Catch:{ 23o -> 0x08da }
                    if (r3 == 0) goto L_0x07b0
                    r4 = r0
                    X.1nE r4 = (X.AnonymousClass1nE) r4     // Catch:{ 23o -> 0x08da }
                    java.lang.Integer r3 = X.C18280x3.A0S()     // Catch:{ 23o -> 0x08da }
                    r4.A05 = r3     // Catch:{ 23o -> 0x08da }
                L_0x07b0:
                    r2.A0O(r0)     // Catch:{ 23o -> 0x08da }
                    if (r9 == 0) goto L_0x07bf
                    r3 = r26
                    r0.A0O = r3     // Catch:{ 23o -> 0x08da }
                    if (r55 == 0) goto L_0x07bf
                    int r3 = r3.A00     // Catch:{ 23o -> 0x08da }
                    r0.A0E = r3     // Catch:{ 23o -> 0x08da }
                L_0x07bf:
                    byte r4 = r0.A1I     // Catch:{ 23o -> 0x08da }
                    if (r4 == 0) goto L_0x07c6
                    r3 = 1
                    if (r4 != r3) goto L_0x07e0
                L_0x07c6:
                    if (r9 == 0) goto L_0x07e0
                    X.36Y r8 = r2.A13     // Catch:{ 23o -> 0x08da }
                    X.2Yl r4 = r2.A1f     // Catch:{ 23o -> 0x08da }
                    r3 = r43
                    int r11 = X.AnonymousClass29K.A01(r8, r1, r3, r4)     // Catch:{ 23o -> 0x08da }
                    X.5mK r3 = r2.A1k     // Catch:{ 23o -> 0x08da }
                    r12 = 0
                    java.lang.String r10 = "request"
                    r14 = 0
                    r8 = r3
                    r9 = r0
                    r15 = r14
                    r8.A08(r9, r10, r11, r12, r14, r15)     // Catch:{ 23o -> 0x08da }
                L_0x07e0:
                    X.8qC r3 = r2.A1v     // Catch:{ 23o -> 0x08da }
                    X.2sS r4 = X.C18320x8.A0I(r3)     // Catch:{ 23o -> 0x08da }
                    java.util.List r3 = r1.A18     // Catch:{ 23o -> 0x08da }
                    com.whatsapp.jid.UserJid r3 = r4.A00(r3)     // Catch:{ 23o -> 0x08da }
                    if (r3 == 0) goto L_0x07f3
                    r0.A1a = r6     // Catch:{ 23o -> 0x08da }
                    r3 = 0
                    r0.A1D = r3     // Catch:{ 23o -> 0x08da }
                L_0x07f3:
                    r3 = r25
                    r3.add(r0)     // Catch:{ 23o -> 0x08da }
                    goto L_0x023b
                L_0x07fa:
                    if (r23 == 0) goto L_0x0866
                    r4 = r1
                    X.1mV r4 = (X.C30471mV) r4
                    X.33C r3 = X.C30471mV.A00(r4)
                    long r9 = r4.A0K
                    byte[] r11 = r3.A0W
                    long r3 = r3.A0B
                    if (r11 == 0) goto L_0x0824
                    r13 = 0
                    int r12 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
                    if (r12 > 0) goto L_0x0812
                    r3 = r9
                L_0x0812:
                    X.32B r9 = new X.32B
                    r9.<init>(r11, r3)
                L_0x0817:
                    X.2sH r3 = r2.A0V
                    long r3 = r3.A0H()
                    boolean r3 = X.AnonymousClass32B.A00(r9, r3)
                    r4 = 1
                    if (r3 != 0) goto L_0x0825
                L_0x0824:
                    r4 = 0
                L_0x0825:
                    if (r23 == 0) goto L_0x085f
                    r3 = r1
                    X.1mV r3 = (X.C30471mV) r3
                    java.lang.String r3 = r3.A07
                    boolean r3 = X.C18320x8.A1U(r3)
                L_0x0830:
                    if (r15 == 0) goto L_0x0224
                    if (r4 == 0) goto L_0x0224
                    if (r3 == 0) goto L_0x0224
                    X.2sr r10 = r2.A04
                    X.2sH r3 = r2.A0V
                    long r12 = r3.A0H()
                    if (r23 == 0) goto L_0x0883
                    r3 = r22
                    X.4uZ r4 = r3.A00
                    boolean r3 = r4 instanceof X.C135166kE
                    if (r3 != 0) goto L_0x0224
                    boolean r3 = r4 instanceof X.C135216kJ
                    if (r3 == 0) goto L_0x0883
                    r9 = 1844(0x734, float:2.584E-42)
                    X.2vE r4 = X.C58422vE.A02
                    r3 = r44
                    boolean r3 = r3.A0Y(r4, r9)
                    if (r3 == 0) goto L_0x0883
                    java.lang.String r0 = "FMessageUtil/isAsyncForwardable Forwarding a ChatPSA message"
                    com.whatsapp.util.Log.d((java.lang.String) r0)
                    goto L_0x0224
                L_0x085f:
                    boolean r3 = r1 instanceof X.C30481mW
                    boolean r3 = X.AnonymousClass000.A1S(r3)
                    goto L_0x0830
                L_0x0866:
                    boolean r3 = r1 instanceof X.C30481mW
                    if (r3 == 0) goto L_0x0824
                    X.2qb r3 = r1.A0l
                    if (r3 == 0) goto L_0x0824
                    byte[] r11 = r3.A0A
                    long r3 = r3.A02
                    long r9 = r1.A0K
                    if (r11 == 0) goto L_0x0824
                    r13 = 0
                    int r12 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
                    if (r12 > 0) goto L_0x087d
                    r3 = r9
                L_0x087d:
                    X.32B r9 = new X.32B
                    r9.<init>(r11, r3)
                    goto L_0x0817
                L_0x0883:
                    boolean r3 = X.C627636p.A0J(r7)
                    if (r3 != 0) goto L_0x0224
                    boolean r3 = X.C627636p.A0H(r7)
                    if (r3 == 0) goto L_0x08ab
                    boolean r3 = X.C627636p.A0T(r10, r1)
                    if (r3 != 0) goto L_0x08ab
                    long r3 = r1.A0K
                    r9 = 432000000(0x19bfcc00, double:2.13436359E-315)
                    long r3 = r3 + r9
                    r10 = 0
                    int r9 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
                    if (r9 == 0) goto L_0x08ab
                    int r9 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
                    if (r9 >= 0) goto L_0x08ab
                L_0x08a5:
                    r31 = 1
                    if (r0 == 0) goto L_0x0228
                    goto L_0x0224
                L_0x08ab:
                    boolean r3 = X.C627636p.A0p(r1)
                    if (r3 == 0) goto L_0x0224
                    long r3 = r1.A0K
                    r9 = 432000000(0x19bfcc00, double:2.13436359E-315)
                    long r12 = r12 - r9
                    int r9 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
                    if (r9 <= 0) goto L_0x0224
                    X.2qb r3 = r1.A0l
                    if (r3 == 0) goto L_0x0224
                    boolean r3 = r3.A01()
                    if (r3 == 0) goto L_0x0224
                    goto L_0x08a5
                L_0x08c6:
                    boolean r3 = r1 instanceof X.C30481mW
                    if (r3 == 0) goto L_0x08d4
                    X.2qb r3 = r1.A0l
                    if (r3 == 0) goto L_0x08d4
                    java.lang.String r3 = r3.A05
                    if (r3 == 0) goto L_0x08d4
                    goto L_0x01f4
                L_0x08d4:
                    r15 = 0
                    goto L_0x01f5
                L_0x08d7:
                    r1 = move-exception
                    monitor-exit(r13)     // Catch:{ 23o -> 0x08da }
                L_0x08d9:
                    throw r1     // Catch:{ 23o -> 0x08da }
                L_0x08da:
                    r3 = move-exception
                    java.lang.String r0 = "UserActions/userActionForwardMessage "
                    com.whatsapp.util.Log.e(r0, r3)
                    X.2qk r1 = r2.A00
                    r0 = r27
                    X.C55682qk.A04(r1, r0, r3)
                    goto L_0x013b
                L_0x08e9:
                    boolean r0 = X.C627636p.A0H(r7)
                    if (r0 == 0) goto L_0x0936
                    if (r31 != 0) goto L_0x0936
                    X.C626936e.A0C(r23)
                    if (r32 == 0) goto L_0x090e
                    X.2IK r3 = new X.2IK
                    r3.<init>()
                    r9 = 17
                    X.3cM r4 = new X.3cM
                    r5 = r2
                    r6 = r1
                    r7 = r25
                    r8 = r3
                    r4.<init>((java.lang.Object) r5, (java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8, (int) r9)
                    r0 = r50
                    r0.BkM(r4)
                    goto L_0x001c
                L_0x090e:
                    java.util.ArrayList r4 = X.AnonymousClass000.A0p(r51)
                    java.util.Iterator r3 = r25.iterator()
                L_0x0916:
                    boolean r0 = r3.hasNext()
                    if (r0 == 0) goto L_0x0920
                    X.C18310x6.A1R(r4, r3)
                    goto L_0x0916
                L_0x0920:
                    X.30M r3 = new X.30M
                    r0 = r29
                    r3.<init>(r4, r0)
                    X.1mV r1 = (X.C30471mV) r1
                    r8 = 0
                    r10 = r8
                    r4 = r6
                    r5 = r1
                    r7 = r24
                    r9 = r8
                    X.2IK r3 = r2.A02(r3, r4, r5, r6, r7, r8, r9, r10)
                    goto L_0x001c
                L_0x0936:
                    X.2IK r3 = new X.2IK
                    r3.<init>()
                    r10 = 16
                    X.3cM r5 = new X.3cM
                    r6 = r2
                    r7 = r1
                    r8 = r25
                    r9 = r3
                    r5.<init>((java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8, (java.lang.Object) r9, (int) r10)
                    r0 = r24
                    r2.A0T(r1, r5, r8, r0)
                    r0 = r22
                    X.4uZ r5 = r0.A00
                    int r4 = r51.size()
                    r0 = 1
                    if (r4 > r0) goto L_0x0958
                    r0 = 0
                L_0x0958:
                    int r5 = X.AnonymousClass368.A01(r5, r0)
                    r4 = 7
                    r0 = r50
                    X.C71733ca.A01(r0, r1, r2, r5, r4)
                    goto L_0x001c
                L_0x0964:
                    int r3 = r3 + 1
                    int r20 = java.lang.Math.max(r7, r3)
                    r4 = 5
                    r3 = r20
                    if (r3 < r4) goto L_0x007a
                    r20 = 127(0x7f, float:1.78E-43)
                    goto L_0x007a
                L_0x0973:
                    r19 = 0
                    r20 = 0
                    goto L_0x007a
                L_0x0979:
                    r5 = 0
                    goto L_0x003d
                L_0x097c:
                    r5 = r59
                    goto L_0x003d
                L_0x0980:
                    if (r60 == 0) goto L_0x099a
                    boolean r0 = android.text.TextUtils.isEmpty(r52)
                    if (r0 != 0) goto L_0x099a
                    if (r3 == 0) goto L_0x099a
                    X.3X2 r5 = new X.3X2
                    r4 = r26
                    r1 = r52
                    r0 = r51
                    r5.<init>(r2, r4, r1, r0)
                    X.3XA r0 = r3.A00
                    r0.A03(r5)
                L_0x099a:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C621033m.A0B(X.5Ul, X.5de, java.lang.String, java.util.List, java.util.List, boolean, boolean):void");
            }
        }

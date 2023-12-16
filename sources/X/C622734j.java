package X;

import android.os.Build;
import android.os.ConditionVariable;
import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.34j  reason: invalid class name and case insensitive filesystem */
public class C622734j {
    public C116985rC A00;
    public final C116985rC A01;
    public final AnonymousClass31B A02;
    public final C53962nx A03;
    public final C106175Xx A04;
    public final C55682qk A05;
    public final C64393Dh A06;
    public final C56972sr A07;
    public final C29411im A08;
    public final C614930z A09;
    public final C105275Ug A0A;
    public final AnonymousClass0N6 A0B;
    public final WfalManager A0C;
    public final C106155Xv A0D;
    public final C52282lE A0E;
    public final C54552ou A0F;
    public final C29441ip A0G;
    public final C56422rx A0H;
    public final AnonymousClass310 A0I;
    public final C620633i A0J;
    public final C54292oU A0K;
    public final AnonymousClass5ZR A0L;
    public final AnonymousClass33p A0M;
    public final C72303dV A0N;
    public final C56082rO A0O;
    public final C29041iB A0P;
    public final AnonymousClass30D A0Q;
    public final AnonymousClass1VX A0R;
    public final C64723Er A0S;
    public final C48092eK A0T;
    public final C46992cX A0U;
    public final C66653Mg A0V;
    public final C1907099n A0W;
    public final C28861ht A0X;
    public final C49222gB A0Y;
    public final AnonymousClass1R1 A0Z;
    public final C64373Df A0a;
    public final C160257nK A0b;
    public final AnonymousClass3FI A0c;
    public final C56042rK A0d;
    public final C104745Se A0e;
    public final C183538qC A0f;

    public String A06(String str) {
        ArrayList latestLogs = Log.getLatestLogs(1);
        if (latestLogs.size() < 1) {
            Log.e("debug-builder/upload-logs no logs found to be uploaded.");
        } else {
            Pair A022 = C627536m.A02(this.A0T, (File) latestLogs.get(0), 8388608, 41943040);
            boolean A1Z = AnonymousClass001.A1Z(A022.first);
            File file = (File) A022.second;
            if (file != null) {
                String A052 = A05(file, str, false);
                if (A1Z) {
                    file.delete();
                }
                return A052;
            }
        }
        return null;
    }

    public static void A00(Object obj, Object obj2, String str) {
        if (obj2 instanceof JSONObject) {
            try {
                ((JSONObject) obj2).put(str, obj);
            } catch (JSONException e) {
                Log.e("debug-builder/json/error ", e);
            }
        } else if (obj2 instanceof StringBuilder) {
            StringBuilder sb = (StringBuilder) obj2;
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    public static final boolean A02(File file) {
        if (!C18300x5.A1V(file, ".nomedia")) {
            return false;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        C18260x0.A1M(A0o, AnonymousClass0x7.A0p(file, "debug-builder/unexpected .nomedia in ", A0o));
        return true;
    }

    public File A03(File file, int i, boolean z, boolean z2) {
        ArrayList A0s;
        BufferedInputStream bufferedInputStream;
        if (z) {
            A0s = Log.getLatestLogs(i);
        } else {
            A0s = AnonymousClass001.A0s();
        }
        if (file != null) {
            A0s.add(file);
        }
        if (z2) {
            File[] A002 = AnonymousClass329.A00(this.A0K);
            if (A002.length > 0) {
                Log.d("debug-builder/getZippedInfoFiles adding ANR traces");
                Collections.addAll(A0s, A002);
            } else {
                Log.w("debug-builder/getZippedInfoFiles no ANR traces to send");
            }
        }
        if (A0s.size() != 0) {
            File A052 = C64393Dh.A05(C64393Dh.A02(C54292oU.A02(this.A06.A01), "support"), ".zip", AnonymousClass000.A0l("logs"));
            try {
                ZipOutputStream zipOutputStream = new ZipOutputStream(AnonymousClass0x7.A0d(A052));
                try {
                    byte[] bArr = new byte[16384];
                    Iterator it = A0s.iterator();
                    while (it.hasNext()) {
                        File A0f2 = AnonymousClass0x9.A0f(it);
                        try {
                            bufferedInputStream = new BufferedInputStream(AnonymousClass0x9.A0g(A0f2), 16384);
                            zipOutputStream.putNextEntry(new ZipEntry(A0f2.getName()));
                            while (true) {
                                int read = bufferedInputStream.read(bArr, 0, 16384);
                                if (read == -1) {
                                    break;
                                }
                                zipOutputStream.write(bArr, 0, read);
                            }
                            bufferedInputStream.close();
                        } catch (IOException e) {
                            StringBuilder A0o = AnonymousClass001.A0o();
                            C18260x0.A15(AnonymousClass0x7.A0p(A0f2, "debug-builder/cant zip file ", A0o), A0o, e);
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                    }
                    zipOutputStream.close();
                    return A052;
                } catch (Throwable th2) {
                    zipOutputStream.close();
                    throw th2;
                }
            } catch (IOException e2) {
                Log.e("debug-builder/zip ", e2);
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
        }
        return null;
        throw th;
    }

    public final String A05(File file, String str, boolean z) {
        StringBuffer stringBuffer = new StringBuffer();
        ConditionVariable conditionVariable = new ConditionVariable();
        C67383Pb r13 = new C67383Pb(conditionVariable, this, stringBuffer);
        File file2 = file;
        try {
            FileInputStream A0g = AnonymousClass0x9.A0g(file2);
            try {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("debug-builder/uploadLogsInternal uploading logs from ");
                A0o.append(file2);
                C18260x0.A0q(" to ", "https://crashlogs.whatsapp.net/wa_clb_data", A0o);
                C614230q A002 = this.A0U.A00(r13, "https://crashlogs.whatsapp.net/wa_clb_data", (String) null, 6, false);
                A002.A09("access_token", "1063127757113399|745146ffa34413f9dbb5469f5370b7af");
                int A012 = C18280x3.A01(z ? 1 : 0);
                try {
                    A002.A0C.add(new AnonymousClass5KF(A0g, "file", file2.getName(), A012, 0, file2.length()));
                    A002.A09(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "support");
                    C55682qk r5 = this.A05;
                    A002.A09("from_jid", r5.A06());
                    A002.A09("forced", "true");
                    A002.A09("android_hprof_extras", r5.A07((String) null));
                    String str2 = str;
                    if (str != null) {
                        A002.A09("ticket_id", str2);
                    }
                    A002.A03((AnonymousClass7US) null);
                    A0g.close();
                    conditionVariable.block(100000);
                    C18260x0.A1P(AnonymousClass001.A0o(), "debug-builder/uploadLogsInternal returning ", stringBuffer);
                    if (stringBuffer.length() == 0) {
                        return null;
                    }
                    return stringBuffer.toString();
                } catch (Throwable th) {
                    th = th;
                    try {
                        A0g.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                A0g.close();
                throw th;
            }
        } catch (Exception e) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "debug-builder/uploadLogsInternal/error-uploading-logs exception:", e);
            return null;
        }
    }

    public void A07() {
        Log.e("app-state: APP STATE DEBUG INFO BEGIN");
        Iterator A0j = AnonymousClass0x2.A0j(this.A0f);
        while (A0j.hasNext()) {
            ((C84944Ei) A0j.next()).BK1("app-state");
        }
        if (Build.VERSION.SDK_INT >= 23) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("app-state/auth-keystore-result:");
            C18260x0.A1G(A0o, this.A02.A03().A00);
        }
        AnonymousClass30D r1 = this.A0Q;
        C72303dV r4 = r1.A09;
        if (C72303dV.A00(r4)) {
            AnonymousClass4GK A032 = r4.get();
            try {
                C172878Nf A002 = C48602fA.A00(r1);
                while (A002.hasNext()) {
                    AnonymousClass31D r2 = (AnonymousClass31D) A002.next();
                    StringBuilder A0l = AnonymousClass000.A0l("app-state");
                    A0l.append("/db-migration-status/");
                    C18290x4.A1R(A0l, r2.A0C);
                    C18260x0.A1G(A0l, r2.A0A());
                }
                C18260x0.A1L(AnonymousClass000.A0l("app-state"), "/db-migration-status-overall: true");
                r4.A05();
                if (r4.A04.A00 != null) {
                    StringBuilder A0l2 = AnonymousClass000.A0l("app-state");
                    A0l2.append("/");
                    A0l2.append("message_view");
                    A0l2.append(":");
                    C56862sg r3 = ((AnonymousClass3H0) A032).A03;
                    C626936e.A06(r3);
                    C18260x0.A1L(A0l2, C626235v.A00(r3, "view", "message_view"));
                    StringBuilder A0m = AnonymousClass000.A0m("app-state", "/");
                    A0m.append("available_message_view");
                    A0m.append(":");
                    C626936e.A06(r3);
                    C18260x0.A1L(A0m, C626235v.A00(r3, "view", "available_message_view"));
                    StringBuilder A0m2 = AnonymousClass000.A0m("app-state", "/");
                    A0m2.append("legacy_available_messages_view");
                    A0m2.append(":");
                    C626936e.A06(r3);
                    C18260x0.A1L(A0m2, C626235v.A00(r3, "view", "legacy_available_messages_view"));
                    StringBuilder A0m3 = AnonymousClass000.A0m("app-state", "/");
                    A0m3.append("deleted_messages_view");
                    A0m3.append(":");
                    C626936e.A06(r3);
                    C18260x0.A1L(A0m3, C626235v.A00(r3, "view", "deleted_messages_view"));
                    StringBuilder A0m4 = AnonymousClass000.A0m("app-state", "/");
                    A0m4.append("deleted_messages_ids_view");
                    A0m4.append(":");
                    C626936e.A06(r3);
                    C18260x0.A1L(A0m4, C626235v.A00(r3, "view", "deleted_messages_ids_view"));
                }
                A032.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        } else {
            C18260x0.A1L(AnonymousClass000.A0l("app-state"), "/db-migration-status-not-ready");
        }
        Log.e("app-state: APP STATE DEBUG INFO END");
    }

    public static void A01(Object obj, String str, boolean z) {
        A00(Boolean.valueOf(z), obj, str);
    }

    public C622734j(C116985rC r2, C116985rC r3, AnonymousClass31B r4, C53962nx r5, C106175Xx r6, C55682qk r7, C64393Dh r8, C56972sr r9, C29411im r10, C614930z r11, C105275Ug r12, AnonymousClass0N6 r13, WfalManager wfalManager, C106155Xv r15, C52282lE r16, C54552ou r17, C29441ip r18, C56422rx r19, AnonymousClass310 r20, C620633i r21, C54292oU r22, AnonymousClass5ZR r23, AnonymousClass33p r24, C72303dV r25, C56082rO r26, C29041iB r27, AnonymousClass30D r28, AnonymousClass1VX r29, C64723Er r30, C48092eK r31, C46992cX r32, C66653Mg r33, C1907099n r34, C28861ht r35, C49222gB r36, AnonymousClass1R1 r37, C64373Df r38, C160257nK r39, AnonymousClass3FI r40, C56042rK r41, C104745Se r42, C183538qC r43) {
        this.A0K = r22;
        this.A0R = r29;
        this.A05 = r7;
        this.A07 = r9;
        this.A0c = r40;
        this.A06 = r8;
        this.A0I = r20;
        this.A0b = r39;
        this.A02 = r4;
        this.A0X = r35;
        this.A0B = r13;
        this.A0e = r42;
        this.A0A = r12;
        this.A0J = r21;
        this.A09 = r11;
        this.A0d = r41;
        this.A04 = r6;
        this.A08 = r10;
        this.A0Z = r37;
        this.A0V = r33;
        this.A0O = r26;
        this.A03 = r5;
        this.A0N = r25;
        this.A0H = r19;
        this.A0L = r23;
        this.A0M = r24;
        this.A0f = r43;
        this.A0E = r16;
        this.A0W = r34;
        this.A0Y = r36;
        this.A0D = r15;
        this.A0P = r27;
        this.A0U = r32;
        this.A0Q = r28;
        this.A0G = r18;
        this.A01 = r2;
        this.A0F = r17;
        this.A0T = r31;
        this.A0a = r38;
        this.A0C = wfalManager;
        this.A0S = r30;
        this.A00 = r3;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(93:88|(4:90|(3:92|(2:95|93)|471)|96|(3:98|(3:100|(2:103|101)|472)|104))(1:105)|106|(1:108)|109|110|111|(1:113)|114|(1:116)|121|122|123|124|125|(1:127)|128|(1:130)|131|(1:133)(1:135)|134|(1:137)|138|(1:140)(1:141)|142|(1:144)|145|146|(7:148|149|(1:151)(1:153)|152|(1:155)|156|(4:158|(1:160)(2:164|(9:166|(1:168)|473|169|(1:171)|474|(4:173|(3:175|(2:177|478)(2:178|477)|179)|476|180)|475|181))|161|(7:184|(1:186)(1:188)|187|(2:190|(1:201)(2:196|(1:200)))|202|(1:204)(1:205)|206)))|207|(1:209)(3:217|(5:219|(1:221)|222|(8:224|225|226|227|228|229|230|480)(1:481)|231)|479)|210|(1:212)|213|(1:215)|216|(1:233)|234|(1:236)|237|(1:241)|242|(16:244|(1:246)|247|(1:249)|250|(1:252)|253|(1:255)|256|(1:258)|259|(1:261)|263|264|(1:266)(1:268)|267)|269|(1:271)|272|273|(2:275|(2:277|(3:279|280|281))(1:282))(1:283)|284|(1:286)|287|(2:289|(3:293|(2:296|294)|482))|297|(2:299|(1:301)(1:302))(1:303)|(2:305|307)(1:306)|308|(1:310)|311|(1:313)(2:315|(1:317)(1:318))|314|(7:320|(1:322)(2:329|(1:331)(1:332))|323|(1:325)|326|(2:328|(2:334|336))(1:335)|337)|338|(1:(2:341|(2:343|347)(1:344))(1:345))(1:346)|348|(1:(2:351|(2:353|357)(1:354))(1:355))(1:356)|358|(3:362|(1:364)(1:381)|365)|366|(23:378|(1:380)|383|(2:386|384)|483|387|(1:389)|(4:391|(2:394|392)|484|395)|396|(1:400)|401|(1:407)|408|(2:409|(2:411|(1:485)(2:486|415))(2:487|416))|417|(1:419)|420|(1:422)(2:426|(1:428)(2:429|(1:434)(1:433)))|423|(1:425)|(1:436)|456|457)|382|383|(1:384)|483|387|(0)|(0)|396|398|400|401|403|407|408|(3:409|(0)(0)|485)|417|(0)|420|(0)(0)|423|(0)|(0)|456|457) */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0557, code lost:
        if (r0.intValue() != 2) goto L_0x0559;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:124:0x02a2 */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02a8 A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02b3 A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02c7 A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02e4 A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02e9 A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02f4 A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02f6 A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0300 A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0318 A[SYNTHETIC, Splitter:B:148:0x0318] */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0435 A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0452 A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0461 A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x047d A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x04e6 A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x04f8 A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x051b A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x056c A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0599  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x05ad A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x05b8 A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x05c9 A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x05f8 A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x060a A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x060e A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x060f A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x063d A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x066a A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x0680 A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x0697 A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x0723 A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x0731 A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x0743 A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x0751 A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x0779 A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x07d3 A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x07d4 A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x07ea A[Catch:{ all -> 0x0916, Exception -> 0x091b }, LOOP:12: B:384:0x07e4->B:386:0x07ea, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x080c A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x081b A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x0880 A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:419:0x08a5 A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x08be A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x08c7 A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x08ce A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x08f9 A[Catch:{ all -> 0x0916, Exception -> 0x091b }] */
    /* JADX WARNING: Removed duplicated region for block: B:487:0x0899 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A04(android.content.Context r36, android.util.Pair r37, X.C27991fJ r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.util.List r43, java.util.List r44, org.json.JSONObject r45, long r46, long r48, boolean r50, boolean r51) {
        /*
            r35 = this;
            java.lang.String r27 = "%s:%s"
            java.lang.String r16 = ""
            java.lang.StringBuilder r17 = X.AnonymousClass001.A0o()
            r4 = r35
            java.lang.String r0 = "yyyy-MM-dd HH:mm:ss.SSSZ"
            java.text.SimpleDateFormat r19 = X.AnonymousClass0x7.A0u(r0)     // Catch:{ Exception -> 0x091b }
            X.33p r0 = r4.A0M     // Catch:{ Exception -> 0x091b }
            r32 = r0
            java.lang.String r8 = r32.A0Z()     // Catch:{ Exception -> 0x091b }
            java.lang.String r6 = r32.A0b()     // Catch:{ Exception -> 0x091b }
            X.1im r2 = r4.A08     // Catch:{ Exception -> 0x091b }
            int r1 = r2.A04     // Catch:{ Exception -> 0x091b }
            r0 = 2
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)     // Catch:{ Exception -> 0x091b }
            if (r0 == 0) goto L_0x002b
            java.lang.String r5 = "UP"
            goto L_0x0041
        L_0x002b:
            int r0 = r2.A04     // Catch:{ Exception -> 0x091b }
            boolean r0 = X.AnonymousClass001.A1T(r0)
            if (r0 == 0) goto L_0x0036
            java.lang.String r5 = "SC/XC"
            goto L_0x0041
        L_0x0036:
            X.1ht r0 = r4.A0X     // Catch:{ Exception -> 0x091b }
            boolean r0 = r0.A00     // Catch:{ Exception -> 0x091b }
            if (r0 == 0) goto L_0x003f
            java.lang.String r5 = "PW"
            goto L_0x0041
        L_0x003f:
            java.lang.String r5 = "DN"
        L_0x0041:
            java.lang.String r15 = ")"
            java.lang.String r3 = " ("
            java.lang.String r2 = "Not Calculated"
            r10 = -1
            r0 = r48
            int r7 = (r48 > r10 ? 1 : (r48 == r10 ? 0 : -1))
            r34 = r36
            if (r7 != 0) goto L_0x0061
            r9 = r2
        L_0x0052:
            r0 = r46
            int r7 = (r46 > r10 ? 1 : (r46 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x00a5
            r10 = -2
            int r2 = (r46 > r10 ? 1 : (r46 == r10 ? 0 : -1))
            r7 = r42
            if (r2 != 0) goto L_0x0074
            goto L_0x009a
        L_0x0061:
            java.lang.String r7 = java.lang.Long.toString(r0)     // Catch:{ Exception -> 0x091b }
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0m(r7, r3)     // Catch:{ Exception -> 0x091b }
            r7 = r34
            java.lang.String r0 = android.text.format.Formatter.formatFileSize(r7, r0)     // Catch:{ Exception -> 0x091b }
            java.lang.String r9 = X.AnonymousClass000.A0V(r0, r15, r9)     // Catch:{ Exception -> 0x091b }
            goto L_0x0052
        L_0x0074:
            java.lang.String r2 = java.lang.Long.toString(r0)     // Catch:{ Exception -> 0x091b }
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0m(r2, r3)     // Catch:{ Exception -> 0x091b }
            r2 = r34
            java.lang.String r0 = android.text.format.Formatter.formatFileSize(r2, r0)     // Catch:{ Exception -> 0x091b }
            java.lang.String r2 = X.AnonymousClass000.A0V(r0, r15, r10)     // Catch:{ Exception -> 0x091b }
            java.lang.String r0 = "mounted_ro"
            boolean r0 = r0.equals(r7)     // Catch:{ Exception -> 0x091b }
            if (r0 == 0) goto L_0x00a5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r2)     // Catch:{ Exception -> 0x091b }
            java.lang.String r0 = " (read-only)"
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ Exception -> 0x091b }
            goto L_0x00a5
        L_0x009a:
            java.lang.String r0 = "removed"
            boolean r0 = r0.equals(r7)     // Catch:{ Exception -> 0x091b }
            if (r0 == 0) goto L_0x00b2
            java.lang.String r2 = "Not present"
        L_0x00a5:
            X.2rx r0 = r4.A0H     // Catch:{ Exception -> 0x091b }
            X.1vC r0 = r0.A04     // Catch:{ Exception -> 0x091b }
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()     // Catch:{ Exception -> 0x091b }
            X.4GK r7 = X.C18630y0.A03(r0)     // Catch:{ Exception -> 0x091b }
            goto L_0x00b4
        L_0x00b2:
            r2 = r7
            goto L_0x00a5
        L_0x00b4:
            java.lang.String r1 = X.C39412Bw.A00     // Catch:{ all -> 0x0911 }
            java.lang.String r0 = "CONTACT_VNAMES"
            android.database.Cursor r11 = X.AnonymousClass361.A09(r7, r1, r0)     // Catch:{ all -> 0x0911 }
        L_0x00bc:
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x0905 }
            if (r0 == 0) goto L_0x00cc
            X.2qS r0 = X.AnonymousClass25T.A00(r11)     // Catch:{ all -> 0x0905 }
            if (r0 == 0) goto L_0x00bc
            r10.add(r0)     // Catch:{ all -> 0x0905 }
            goto L_0x00bc
        L_0x00cc:
            r11.close()     // Catch:{ all -> 0x0911 }
            r7.close()     // Catch:{ Exception -> 0x091b }
            java.util.Iterator r7 = r10.iterator()     // Catch:{ Exception -> 0x091b }
            r14 = 0
            r13 = 0
        L_0x00d8:
            boolean r0 = r7.hasNext()     // Catch:{ Exception -> 0x091b }
            if (r0 == 0) goto L_0x00fa
            java.lang.Object r1 = r7.next()     // Catch:{ Exception -> 0x091b }
            X.2qS r1 = (X.C55502qS) r1     // Catch:{ Exception -> 0x091b }
            java.lang.String r0 = r1.A07     // Catch:{ Exception -> 0x091b }
            if (r0 == 0) goto L_0x00d8
            boolean r0 = r1.A03()     // Catch:{ Exception -> 0x091b }
            if (r0 == 0) goto L_0x00f1
            int r14 = r14 + 1
            goto L_0x00d8
        L_0x00f1:
            boolean r0 = r1.A02()     // Catch:{ Exception -> 0x091b }
            if (r0 == 0) goto L_0x00d8
            int r13 = r13 + 1
            goto L_0x00d8
        L_0x00fa:
            if (r50 != 0) goto L_0x0108
            java.lang.String r1 = "\n\n\n\n"
            r0 = r17
            r0.append(r1)     // Catch:{ Exception -> 0x091b }
            java.lang.String r1 = "--Support Info--\n"
            r0.append(r1)     // Catch:{ Exception -> 0x091b }
        L_0x0108:
            org.json.JSONObject r18 = X.AnonymousClass0x9.A1G()     // Catch:{ Exception -> 0x091b }
            r7 = r17
            if (r50 == 0) goto L_0x0112
            r7 = r18
        L_0x0112:
            r1 = r45
            if (r45 == 0) goto L_0x011b
            java.lang.String r0 = "Calling debug info"
            A00(r1, r7, r0)     // Catch:{ Exception -> 0x091b }
        L_0x011b:
            X.2P4 r1 = new X.2P4     // Catch:{ Exception -> 0x091b }
            r10 = r51
            r0 = r34
            r1.<init>(r0, r10)     // Catch:{ Exception -> 0x091b }
            X.8qC r0 = r4.A0f     // Catch:{ Exception -> 0x091b }
            java.util.Iterator r11 = X.AnonymousClass0x2.A0j(r0)     // Catch:{ Exception -> 0x091b }
        L_0x012a:
            boolean r0 = r11.hasNext()     // Catch:{ Exception -> 0x091b }
            if (r0 == 0) goto L_0x013a
            java.lang.Object r0 = r11.next()     // Catch:{ Exception -> 0x091b }
            X.4Ei r0 = (X.C84944Ei) r0     // Catch:{ Exception -> 0x091b }
            r0.BK5(r1)     // Catch:{ Exception -> 0x091b }
            goto L_0x012a
        L_0x013a:
            java.util.Map r0 = r1.A01     // Catch:{ Exception -> 0x091b }
            java.util.Iterator r11 = X.AnonymousClass000.A0q(r0)     // Catch:{ Exception -> 0x091b }
        L_0x0140:
            boolean r0 = r11.hasNext()     // Catch:{ Exception -> 0x091b }
            if (r0 == 0) goto L_0x0156
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r11)     // Catch:{ Exception -> 0x091b }
            java.lang.String r1 = X.C18310x6.A0q(r0)     // Catch:{ Exception -> 0x091b }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Exception -> 0x091b }
            A00(r0, r7, r1)     // Catch:{ Exception -> 0x091b }
            goto L_0x0140
        L_0x0156:
            if (r51 != 0) goto L_0x019b
            java.lang.String r11 = "Debug info"
            X.2sr r12 = r4.A07     // Catch:{ Exception -> 0x091b }
            com.whatsapp.jid.PhoneUserJid r10 = X.C56972sr.A04(r12)     // Catch:{ Exception -> 0x091b }
            if (r10 == 0) goto L_0x0209
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x091b }
            java.lang.String r0 = "+"
            r1.append(r0)     // Catch:{ Exception -> 0x091b }
            java.lang.String r0 = r10.user     // Catch:{ Exception -> 0x091b }
            java.lang.String r10 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ Exception -> 0x091b }
        L_0x0171:
            X.2nx r0 = r4.A03     // Catch:{ Exception -> 0x091b }
            boolean r0 = r0.A01()     // Catch:{ Exception -> 0x091b }
            if (r0 == 0) goto L_0x0198
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x091b }
            java.lang.String r0 = "chnum "
            java.lang.String r10 = X.AnonymousClass000.A0V(r0, r10, r1)     // Catch:{ Exception -> 0x091b }
            com.whatsapp.Me r0 = r12.A0E()     // Catch:{ Exception -> 0x091b }
            if (r0 == 0) goto L_0x0198
            java.lang.String r1 = r0.jabber_id     // Catch:{ Exception -> 0x091b }
            if (r1 == 0) goto L_0x0198
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x091b }
            X.C18260x0.A0p(r10, r3, r1, r15, r0)     // Catch:{ Exception -> 0x091b }
            java.lang.String r10 = r0.toString()     // Catch:{ Exception -> 0x091b }
        L_0x0198:
            A00(r10, r7, r11)     // Catch:{ Exception -> 0x091b }
        L_0x019b:
            java.lang.String r1 = "MDEnabled"
            X.3Mg r0 = r4.A0V     // Catch:{ Exception -> 0x091b }
            boolean r0 = X.C66653Mg.A00(r0)     // Catch:{ Exception -> 0x091b }
            A01(r7, r1, r0)     // Catch:{ Exception -> 0x091b }
            java.lang.String r1 = "HasMdCompanion"
            X.1iB r0 = r4.A0P     // Catch:{ Exception -> 0x091b }
            r31 = r0
            java.util.List r0 = r31.A0C()     // Catch:{ Exception -> 0x091b }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x091b }
            r0 = r0 ^ 1
            A01(r7, r1, r0)     // Catch:{ Exception -> 0x091b }
            java.lang.String r1 = "Context"
            r33 = r39
            r0 = r33
            A00(r0, r7, r1)     // Catch:{ Exception -> 0x091b }
            java.lang.String r1 = "useragent"
            X.3FI r0 = r4.A0c     // Catch:{ Exception -> 0x091b }
            java.lang.String r0 = r0.A00()     // Catch:{ Exception -> 0x091b }
            A00(r0, r7, r1)     // Catch:{ Exception -> 0x091b }
            java.lang.String r0 = "Socket Conn"
            A00(r5, r7, r0)     // Catch:{ Exception -> 0x091b }
            java.lang.String r0 = "Free Space Built-In"
            A00(r9, r7, r0)     // Catch:{ Exception -> 0x091b }
            java.lang.String r0 = "Free Space Removable"
            A00(r2, r7, r0)     // Catch:{ Exception -> 0x091b }
            java.lang.String r1 = "Smb count"
            java.lang.String r0 = java.lang.Integer.toString(r14)     // Catch:{ Exception -> 0x091b }
            A00(r0, r7, r1)     // Catch:{ Exception -> 0x091b }
            java.lang.String r1 = "Ent count"
            java.lang.String r0 = java.lang.Integer.toString(r13)     // Catch:{ Exception -> 0x091b }
            A00(r0, r7, r1)     // Catch:{ Exception -> 0x091b }
            X.5rC r1 = r4.A01     // Catch:{ Exception -> 0x091b }
            boolean r0 = r1.A07()     // Catch:{ Exception -> 0x091b }
            if (r0 == 0) goto L_0x020e
            X.3dV r0 = r4.A0N     // Catch:{ Exception -> 0x091b }
            boolean r0 = X.C72303dV.A00(r0)     // Catch:{ Exception -> 0x091b }
            if (r0 == 0) goto L_0x020e
            r1.A04()     // Catch:{ Exception -> 0x091b }
            java.lang.String r0 = "getAwayState"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)     // Catch:{ Exception -> 0x091b }
            throw r0     // Catch:{ Exception -> 0x091b }
        L_0x0209:
            java.lang.String r10 = "unregistered"
            goto L_0x0171
        L_0x020e:
            X.33i r0 = r4.A0J     // Catch:{ Exception -> 0x091b }
            r30 = r0
            android.net.ConnectivityManager r26 = r30.A0H()     // Catch:{ Exception -> 0x091b }
            java.lang.String r10 = "Connection"
            X.1ip r0 = r4.A0G     // Catch:{ Exception -> 0x091b }
            r29 = r0
            X.2hc r9 = r29.A0A()     // Catch:{ Exception -> 0x091b }
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x091b }
            if (r9 == 0) goto L_0x0255
            java.lang.String r2 = r9.A02     // Catch:{ Exception -> 0x091b }
            if (r2 == 0) goto L_0x0236
            r1 = 0
        L_0x022b:
            int r0 = r2.length()     // Catch:{ Exception -> 0x091b }
            if (r1 >= r0) goto L_0x0236
            int r1 = X.AnonymousClass0x7.A09(r2, r5, r1)     // Catch:{ Exception -> 0x091b }
            goto L_0x022b
        L_0x0236:
            java.lang.String r2 = r9.A01     // Catch:{ Exception -> 0x091b }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x091b }
            if (r0 != 0) goto L_0x025a
            r5.append(r3)     // Catch:{ Exception -> 0x091b }
            if (r2 == 0) goto L_0x024f
            r1 = 0
        L_0x0244:
            int r0 = r2.length()     // Catch:{ Exception -> 0x091b }
            if (r1 >= r0) goto L_0x024f
            int r1 = X.AnonymousClass0x7.A09(r2, r5, r1)     // Catch:{ Exception -> 0x091b }
            goto L_0x0244
        L_0x024f:
            r0 = 41
            r5.append(r0)     // Catch:{ Exception -> 0x091b }
            goto L_0x025a
        L_0x0255:
            java.lang.String r0 = "NONE"
            r5.append(r0)     // Catch:{ Exception -> 0x091b }
        L_0x025a:
            java.lang.String r0 = r5.toString()     // Catch:{ Exception -> 0x091b }
            A00(r0, r7, r10)     // Catch:{ Exception -> 0x091b }
            r1 = r40
            if (r40 == 0) goto L_0x026a
            java.lang.String r0 = "Server"
            A00(r1, r7, r0)     // Catch:{ Exception -> 0x091b }
        L_0x026a:
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x091b }
            X.7nK r2 = r4.A0b     // Catch:{ Exception -> 0x0292 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x0292 }
            r0 = 0
            X.5I5 r5 = r2.A01(r1, r0)     // Catch:{ Exception -> 0x0292 }
            java.util.Set r2 = r5.A00     // Catch:{ Exception -> 0x0292 }
            r1 = 32
            if (r2 == 0) goto L_0x0285
            java.lang.String r0 = "TK-NP-"
            X.C18290x4.A1P(r0, r9, r2)     // Catch:{ Exception -> 0x0292 }
            r9.append(r1)     // Catch:{ Exception -> 0x0292 }
        L_0x0285:
            java.util.Set r2 = r5.A01     // Catch:{ Exception -> 0x0292 }
            if (r2 == 0) goto L_0x0297
            java.lang.String r0 = "TK-NS-"
            X.C18290x4.A1P(r0, r9, r2)     // Catch:{ Exception -> 0x0292 }
            r9.append(r1)     // Catch:{ Exception -> 0x0292 }
            goto L_0x0297
        L_0x0292:
            java.lang.String r0 = "TK-FG-0 "
            r9.append(r0)     // Catch:{ Exception -> 0x091b }
        L_0x0297:
            java.lang.String r0 = "org.acra.ACRA"
            java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x02a2 }
            java.lang.String r0 = "NW-WAP-1 "
            r9.append(r0)     // Catch:{ ClassNotFoundException -> 0x02a2 }
        L_0x02a2:
            boolean r0 = X.C627236i.A0E(r30)     // Catch:{ Exception -> 0x091b }
            if (r0 == 0) goto L_0x02ad
            java.lang.String r0 = "DC-RTED "
            r9.append(r0)     // Catch:{ Exception -> 0x091b }
        L_0x02ad:
            boolean r0 = X.C627236i.A0C()     // Catch:{ Exception -> 0x091b }
            if (r0 == 0) goto L_0x02b8
            java.lang.String r0 = "DC-BACRM "
            r9.append(r0)     // Catch:{ Exception -> 0x091b }
        L_0x02b8:
            java.lang.String r0 = "FE-GDE "
            r9.append(r0)     // Catch:{ Exception -> 0x091b }
            X.2oU r1 = r4.A0K     // Catch:{ Exception -> 0x091b }
            android.content.Context r2 = r1.A00     // Catch:{ Exception -> 0x091b }
            boolean r0 = X.AnonymousClass0YV.A0F(r2)     // Catch:{ Exception -> 0x091b }
            if (r0 == 0) goto L_0x02e4
            java.lang.String r0 = "FE-GDC "
            r9.append(r0)     // Catch:{ Exception -> 0x091b }
            java.lang.String r0 = "debug-builder/generate-diagnostics/gdrive-capable"
        L_0x02ce:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x091b }
            java.lang.String r0 = "FE-VIDC "
            r9.append(r0)     // Catch:{ Exception -> 0x091b }
            java.lang.String r0 = "debug-builder/generate-diagnostics/video-call-capable"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x091b }
            int r0 = X.C159787mS.A00(r2)     // Catch:{ Exception -> 0x091b }
            boolean r0 = X.AnonymousClass000.A1T(r0)     // Catch:{ Exception -> 0x091b }
            goto L_0x02e7
        L_0x02e4:
            java.lang.String r0 = "debug-builder/generate-diagnostics/gdrive-not-capable"
            goto L_0x02ce
        L_0x02e7:
            if (r0 == 0) goto L_0x02ee
            java.lang.String r0 = "FE-SMSRTV "
            r9.append(r0)     // Catch:{ Exception -> 0x091b }
        L_0x02ee:
            int r0 = r9.length()     // Catch:{ Exception -> 0x091b }
            if (r0 != 0) goto L_0x02f6
            r2 = 0
            goto L_0x02fa
        L_0x02f6:
            java.lang.String r2 = r9.toString()     // Catch:{ Exception -> 0x091b }
        L_0x02fa:
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x091b }
            if (r0 != 0) goto L_0x0305
            java.lang.String r0 = "Diagnostic Codes"
            A00(r2, r7, r0)     // Catch:{ Exception -> 0x091b }
        L_0x0305:
            android.telephony.TelephonyManager r25 = r30.A0N()     // Catch:{ Exception -> 0x091b }
            X.2sr r0 = r4.A07     // Catch:{ Exception -> 0x091b }
            r28 = r0
            com.whatsapp.Me r0 = X.C56972sr.A00(r28)     // Catch:{ Exception -> 0x091b }
            java.lang.String r24 = "unknown"
            r23 = r24
            if (r0 != 0) goto L_0x042b
            X.5ZR r2 = r4.A0L     // Catch:{ Exception -> 0x091b }
            r0 = r30
            java.lang.String r2 = X.C621333r.A01(r0, r1, r2)     // Catch:{ Exception -> 0x091b }
            if (r25 == 0) goto L_0x0334
            int r0 = r25.getSimState()     // Catch:{ Exception -> 0x091b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x091b }
        L_0x032a:
            java.lang.String r1 = "Sim"
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x091b }
            X.AnonymousClass0x2.A1N(r0, r2)     // Catch:{ Exception -> 0x091b }
            goto L_0x0336
        L_0x0334:
            r5 = 0
            goto L_0x032a
        L_0x0336:
            if (r5 != 0) goto L_0x033a
            r5 = r16
        L_0x033a:
            java.lang.String r0 = X.AnonymousClass000.A0R(r5, r0)     // Catch:{ Exception -> 0x091b }
            A00(r0, r7, r1)     // Catch:{ Exception -> 0x091b }
            if (r2 == 0) goto L_0x042b
            java.lang.String r1 = "\\D"
            r0 = r16
            java.lang.String r12 = r2.replaceAll(r1, r0)     // Catch:{ Exception -> 0x091b }
            java.lang.String r22 = "L Distance"
            int r11 = r12.length()     // Catch:{ Exception -> 0x091b }
            if (r11 != 0) goto L_0x0369
            int r11 = r6.length()     // Catch:{ Exception -> 0x091b }
        L_0x0357:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x091b }
            r0 = r22
            A00(r1, r7, r0)     // Catch:{ Exception -> 0x091b }
            java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x091b }
            int r2 = X.AnonymousClass36l.A00(r6, r12)     // Catch:{ Exception -> 0x091b }
            if (r2 == 0) goto L_0x03d8
            goto L_0x03d5
        L_0x0369:
            int r10 = r6.length()     // Catch:{ Exception -> 0x091b }
            if (r10 == 0) goto L_0x0357
            r9 = 1
            int r5 = r10 + 1
            int r2 = r11 + 1
            r0 = 2
            int[] r1 = new int[r0]     // Catch:{ Exception -> 0x091b }
            r1[r9] = r2     // Catch:{ Exception -> 0x091b }
            r2 = 0
            r1[r2] = r5     // Catch:{ Exception -> 0x091b }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x091b }
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r0, r1)     // Catch:{ Exception -> 0x091b }
            int[][] r5 = (int[][]) r5     // Catch:{ Exception -> 0x091b }
            r0 = 0
        L_0x0385:
            if (r0 > r10) goto L_0x038e
            r1 = r5[r0]     // Catch:{ Exception -> 0x091b }
            r1[r2] = r0     // Catch:{ Exception -> 0x091b }
            int r0 = r0 + 1
            goto L_0x0385
        L_0x038e:
            r0 = 0
        L_0x038f:
            if (r0 > r11) goto L_0x0398
            r1 = r5[r2]     // Catch:{ Exception -> 0x091b }
            r1[r0] = r0     // Catch:{ Exception -> 0x091b }
            int r0 = r0 + 1
            goto L_0x038f
        L_0x0398:
            if (r9 > r11) goto L_0x03d0
            r2 = 1
        L_0x039b:
            if (r2 > r10) goto L_0x03cd
            int r1 = r2 + -1
            char r14 = r6.charAt(r1)     // Catch:{ Exception -> 0x091b }
            int r0 = r9 + -1
            char r13 = r12.charAt(r0)     // Catch:{ Exception -> 0x091b }
            r21 = r5[r2]     // Catch:{ Exception -> 0x091b }
            r20 = r5[r1]     // Catch:{ Exception -> 0x091b }
            if (r14 != r13) goto L_0x03b4
            r0 = r20[r0]     // Catch:{ Exception -> 0x091b }
            r21[r9] = r0     // Catch:{ Exception -> 0x091b }
            goto L_0x03ca
        L_0x03b4:
            r1 = r20[r0]     // Catch:{ Exception -> 0x091b }
            int r13 = r1 + 1
            r1 = r20[r9]     // Catch:{ Exception -> 0x091b }
            int r1 = r1 + 1
            r0 = r21[r0]     // Catch:{ Exception -> 0x091b }
            int r0 = r0 + 1
            int r0 = java.lang.Math.min(r1, r0)     // Catch:{ Exception -> 0x091b }
            int r0 = java.lang.Math.min(r13, r0)     // Catch:{ Exception -> 0x091b }
            r21[r9] = r0     // Catch:{ Exception -> 0x091b }
        L_0x03ca:
            int r2 = r2 + 1
            goto L_0x039b
        L_0x03cd:
            int r9 = r9 + 1
            goto L_0x0398
        L_0x03d0:
            r0 = r5[r10]     // Catch:{ Exception -> 0x091b }
            r11 = r0[r11]     // Catch:{ Exception -> 0x091b }
            goto L_0x0357
        L_0x03d5:
            r0 = 1
            if (r2 != r0) goto L_0x042b
        L_0x03d8:
            X.5Xx r5 = r4.A04     // Catch:{ Exception -> 0x091b }
            java.lang.String r0 = X.AnonymousClass36l.A0B(r5, r6, r8, r12)     // Catch:{ Exception -> 0x091b }
            java.lang.String r1 = "Mistyped"
            if (r0 != 0) goto L_0x03e8
            java.lang.String r0 = "false"
        L_0x03e4:
            A00(r0, r7, r1)     // Catch:{ Exception -> 0x091b }
            goto L_0x03ec
        L_0x03e8:
            java.lang.String r0 = "true"
            goto L_0x03e4
        L_0x03ec:
            if (r2 != 0) goto L_0x041d
            java.lang.String r2 = X.C107195ar.A02(r5, r8, r12)     // Catch:{ Exception -> 0x091b }
            java.lang.String r1 = X.C107195ar.A02(r5, r8, r6)     // Catch:{ Exception -> 0x091b }
            java.lang.String r0 = X.AnonymousClass000.A0T(r8, r1)     // Catch:{ Exception -> 0x091b }
            boolean r1 = r2.equals(r1)     // Catch:{ Exception -> 0x091b }
            if (r1 != 0) goto L_0x041b
            boolean r0 = r2.equals(r0)     // Catch:{ Exception -> 0x091b }
            if (r0 != 0) goto L_0x041b
            boolean r0 = X.C107195ar.A05(r12, r6, r2, r8)     // Catch:{ Exception -> 0x091b }
            if (r0 != 0) goto L_0x041b
            boolean r0 = r6.endsWith(r2)     // Catch:{ Exception -> 0x091b }
            if (r0 == 0) goto L_0x041d
            int r1 = X.C107195ar.A00(r5, r8, r2)     // Catch:{ Exception -> 0x091b }
            r0 = 5
            if (r1 != r0) goto L_0x041d
            r9 = 0
            goto L_0x041d
        L_0x041b:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x091b }
        L_0x041d:
            java.lang.String r1 = "Mistyped Last6"
            if (r9 != 0) goto L_0x0424
            r0 = r24
            goto L_0x0428
        L_0x0424:
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x091b }
        L_0x0428:
            A00(r0, r7, r1)     // Catch:{ Exception -> 0x091b }
        L_0x042b:
            java.lang.StringBuilder r12 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x091b }
            java.lang.StringBuilder r11 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x091b }
            if (r26 != 0) goto L_0x047d
            java.lang.String r0 = "debug-builder/get-debug-info cm=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ Exception -> 0x091b }
        L_0x043a:
            java.lang.String r1 = "Network metered"
            java.lang.String r0 = r12.toString()     // Catch:{ Exception -> 0x091b }
            A00(r0, r7, r1)     // Catch:{ Exception -> 0x091b }
            java.lang.String r1 = "Network restricted"
            java.lang.String r0 = r11.toString()     // Catch:{ Exception -> 0x091b }
            A00(r0, r7, r1)     // Catch:{ Exception -> 0x091b }
            X.2xD r0 = r29.A0B()     // Catch:{ Exception -> 0x091b }
            if (r0 == 0) goto L_0x045d
            java.lang.String r1 = "Data roaming"
            boolean r0 = r0.A02     // Catch:{ Exception -> 0x091b }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x091b }
            A00(r0, r7, r1)     // Catch:{ Exception -> 0x091b }
        L_0x045d:
            java.lang.String r1 = "Tel roaming"
            if (r25 == 0) goto L_0x0469
            boolean r0 = r25.isNetworkRoaming()     // Catch:{ Exception -> 0x091b }
            java.lang.String r24 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x091b }
        L_0x0469:
            r0 = r24
            A00(r0, r7, r1)     // Catch:{ Exception -> 0x091b }
            X.5Xv r2 = r4.A0D     // Catch:{ Exception -> 0x091b }
            android.content.SharedPreferences r1 = r2.A03()     // Catch:{ Exception -> 0x091b }
            java.lang.String r0 = "previous_call_tslog_call_id"
            r9 = 0
            java.lang.String r1 = r1.getString(r0, r9)     // Catch:{ Exception -> 0x091b }
            goto L_0x04e4
        L_0x047d:
            android.net.Network[] r10 = r26.getAllNetworks()     // Catch:{ Exception -> 0x091b }
            int r9 = r10.length     // Catch:{ Exception -> 0x091b }
            r8 = 0
            r14 = 0
        L_0x0484:
            if (r8 >= r9) goto L_0x043a
            r6 = r10[r8]     // Catch:{ Exception -> 0x091b }
            if (r14 == 0) goto L_0x0492
            r0 = 59
            r12.append(r0)     // Catch:{ Exception -> 0x091b }
            r11.append(r0)     // Catch:{ Exception -> 0x091b }
        L_0x0492:
            r0 = r26
            android.net.NetworkCapabilities r5 = r0.getNetworkCapabilities(r6)     // Catch:{ Exception -> 0x091b }
            if (r5 == 0) goto L_0x04df
            java.lang.Object[] r2 = X.AnonymousClass002.A0M()     // Catch:{ Exception -> 0x091b }
            java.lang.String r0 = r6.toString()     // Catch:{ Exception -> 0x091b }
            r1 = 0
            r2[r1] = r0     // Catch:{ Exception -> 0x091b }
            r0 = 11
            boolean r0 = r5.hasCapability(r0)     // Catch:{ Exception -> 0x091b }
            boolean r0 = X.AnonymousClass000.A1T(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x091b }
            r13 = 1
            r2[r13] = r0     // Catch:{ Exception -> 0x091b }
            r0 = r27
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ Exception -> 0x091b }
            r12.append(r0)     // Catch:{ Exception -> 0x091b }
            java.lang.Object[] r0 = X.AnonymousClass002.A0M()     // Catch:{ Exception -> 0x091b }
            X.AnonymousClass0x7.A1E(r6, r0, r1)     // Catch:{ Exception -> 0x091b }
            r1 = 13
            boolean r1 = r5.hasCapability(r1)     // Catch:{ Exception -> 0x091b }
            boolean r1 = X.AnonymousClass000.A1T(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x091b }
            r0[r13] = r1     // Catch:{ Exception -> 0x091b }
            r1 = r27
            java.lang.String r0 = java.lang.String.format(r1, r0)     // Catch:{ Exception -> 0x091b }
            r11.append(r0)     // Catch:{ Exception -> 0x091b }
        L_0x04df:
            int r14 = r14 + 1
            int r8 = r8 + 1
            goto L_0x0484
        L_0x04e4:
            if (r1 == 0) goto L_0x04eb
            java.lang.String r0 = "Last CR ID"
            A00(r1, r7, r0)     // Catch:{ Exception -> 0x091b }
        L_0x04eb:
            android.content.SharedPreferences r1 = r2.A03()     // Catch:{ Exception -> 0x091b }
            java.lang.String r0 = "previous_relay_call_uuid"
            java.lang.String r1 = r1.getString(r0, r9)     // Catch:{ Exception -> 0x091b }
            if (r1 == 0) goto L_0x04fd
            java.lang.String r0 = "Last Relay Call UUID"
            A00(r1, r7, r0)     // Catch:{ Exception -> 0x091b }
        L_0x04fd:
            android.content.SharedPreferences r1 = r2.A03()     // Catch:{ Exception -> 0x091b }
            java.lang.String r0 = "previous_self_participant_uuid"
            java.lang.String r1 = r1.getString(r0, r9)     // Catch:{ Exception -> 0x091b }
            if (r1 == 0) goto L_0x0515
            int r0 = r1.length()     // Catch:{ Exception -> 0x091b }
            if (r0 <= 0) goto L_0x0515
            java.lang.String r0 = "Last Call Self Participant UUID"
            A00(r1, r7, r0)     // Catch:{ Exception -> 0x091b }
        L_0x0515:
            X.3Er r0 = r4.A0S     // Catch:{ Exception -> 0x091b }
            com.whatsapp.fieldstats.events.WamCall r2 = r0.A01     // Catch:{ Exception -> 0x091b }
            if (r2 == 0) goto L_0x0568
            java.lang.Integer r1 = r2.callSide     // Catch:{ Exception -> 0x091b }
            if (r1 == 0) goto L_0x0525
            java.lang.String r0 = "voip call side"
            A00(r1, r7, r0)     // Catch:{ Exception -> 0x091b }
        L_0x0525:
            java.lang.Integer r1 = r2.callResult     // Catch:{ Exception -> 0x091b }
            if (r1 == 0) goto L_0x052f
            java.lang.String r0 = "voip call result"
            A00(r1, r7, r0)     // Catch:{ Exception -> 0x091b }
        L_0x052f:
            java.lang.Integer r1 = r2.callSetupErrorType     // Catch:{ Exception -> 0x091b }
            if (r1 == 0) goto L_0x0539
            java.lang.String r0 = "voip call setup error"
            A00(r1, r7, r0)     // Catch:{ Exception -> 0x091b }
        L_0x0539:
            java.lang.Integer r1 = r2.callTermReason     // Catch:{ Exception -> 0x091b }
            if (r1 == 0) goto L_0x0543
            java.lang.String r0 = "voip call terminate reason"
            A00(r1, r7, r0)     // Catch:{ Exception -> 0x091b }
        L_0x0543:
            java.lang.String r1 = r2.callTestBucket     // Catch:{ Exception -> 0x091b }
            if (r1 == 0) goto L_0x054d
            java.lang.String r0 = "voip call test bucket"
            A00(r1, r7, r0)     // Catch:{ Exception -> 0x091b }
        L_0x054d:
            java.lang.Integer r0 = r2.callRelayBindStatus     // Catch:{ Exception -> 0x091b }
            if (r0 == 0) goto L_0x0559
            int r1 = r0.intValue()     // Catch:{ Exception -> 0x091b }
            r2 = 1
            r0 = 2
            if (r1 == r0) goto L_0x055a
        L_0x0559:
            r2 = 0
        L_0x055a:
            java.lang.String r1 = "voip bind to any relay"
            if (r2 == 0) goto L_0x0565
            java.lang.String r0 = "Yes"
        L_0x0561:
            A00(r0, r7, r1)     // Catch:{ Exception -> 0x091b }
            goto L_0x0568
        L_0x0565:
            java.lang.String r0 = "No"
            goto L_0x0561
        L_0x0568:
            r1 = r41
            if (r41 == 0) goto L_0x0572
            java.lang.String r0 = "ref"
            A00(r1, r7, r0)     // Catch:{ Exception -> 0x091b }
        L_0x0572:
            java.lang.String r1 = "ABprops hash state"
            X.2gB r2 = r4.A0Y     // Catch:{ Exception -> 0x091b }
            java.lang.String r0 = r2.A00()     // Catch:{ Exception -> 0x091b }
            A00(r0, r7, r1)     // Catch:{ Exception -> 0x091b }
            java.lang.String r1 = "Serverprops hash state"
            java.lang.String r0 = r2.A01()     // Catch:{ Exception -> 0x091b }
            A00(r0, r7, r1)     // Catch:{ Exception -> 0x091b }
            X.1VX r6 = r4.A0R     // Catch:{ Exception -> 0x091b }
            r0 = 422(0x1a6, float:5.91E-43)
            X.2vE r5 = X.C58422vE.A02     // Catch:{ Exception -> 0x091b }
            boolean r0 = r6.A0Y(r5, r0)     // Catch:{ Exception -> 0x091b }
            int r2 = X.AnonymousClass8HT.A02(r0)     // Catch:{ Exception -> 0x091b }
            java.lang.String r1 = "Video transcode"
            r0 = 1
            if (r2 == r0) goto L_0x05ad
            r0 = 2
            if (r2 == r0) goto L_0x05a6
            r0 = 3
            if (r2 != r0) goto L_0x05b3
            java.lang.String r0 = "no encoders"
            A00(r0, r7, r1)     // Catch:{ Exception -> 0x091b }
            goto L_0x05b3
        L_0x05a6:
            java.lang.String r0 = "unsupported device"
            A00(r0, r7, r1)     // Catch:{ Exception -> 0x091b }
            goto L_0x05b3
        L_0x05ad:
            java.lang.String r0 = "supported"
            A00(r0, r7, r1)     // Catch:{ Exception -> 0x091b }
        L_0x05b3:
            r2 = 1
            r0 = r37
            if (r37 == 0) goto L_0x05c1
            java.lang.Object r1 = r0.first     // Catch:{ Exception -> 0x091b }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x091b }
            java.lang.Object r0 = r0.second     // Catch:{ Exception -> 0x091b }
            A00(r0, r7, r1)     // Catch:{ Exception -> 0x091b }
        L_0x05c1:
            X.99n r0 = r4.A0W     // Catch:{ Exception -> 0x091b }
            boolean r0 = r0.A02()     // Catch:{ Exception -> 0x091b }
            if (r0 == 0) goto L_0x05f0
            java.lang.String r1 = "Payments"
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x091b }
            A00(r0, r7, r1)     // Catch:{ Exception -> 0x091b }
            if (r43 == 0) goto L_0x05f0
            boolean r0 = X.AnonymousClass2BI.A00(r33)     // Catch:{ Exception -> 0x091b }
            if (r0 == 0) goto L_0x05f0
            java.util.Iterator r8 = r43.iterator()     // Catch:{ Exception -> 0x091b }
        L_0x05dc:
            boolean r0 = r8.hasNext()     // Catch:{ Exception -> 0x091b }
            if (r0 == 0) goto L_0x05f0
            android.util.Pair r0 = X.AnonymousClass0x9.A0D(r8)     // Catch:{ Exception -> 0x091b }
            java.lang.Object r1 = r0.first     // Catch:{ Exception -> 0x091b }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x091b }
            java.lang.Object r0 = r0.second     // Catch:{ Exception -> 0x091b }
            A00(r0, r7, r1)     // Catch:{ Exception -> 0x091b }
            goto L_0x05dc
        L_0x05f0:
            X.3dV r0 = r4.A0N     // Catch:{ Exception -> 0x091b }
            boolean r0 = X.C72303dV.A00(r0)     // Catch:{ Exception -> 0x091b }
            if (r0 == 0) goto L_0x060a
            X.2rO r1 = r4.A0O     // Catch:{ Exception -> 0x091b }
            java.lang.String r0 = "cross_platform_migration_completed"
            r8 = 0
            java.lang.String r0 = r1.A01(r0)     // Catch:{ Exception -> 0x091b }
            if (r0 != 0) goto L_0x0605
            r0 = 0
            goto L_0x060c
        L_0x0605:
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x091b }
            goto L_0x060c
        L_0x060a:
            r8 = 0
            r0 = 0
        L_0x060c:
            if (r0 == 0) goto L_0x060f
            goto L_0x0613
        L_0x060f:
            java.lang.String r1 = "no"
            goto L_0x0628
        L_0x0613:
            X.2rO r11 = r4.A0O     // Catch:{ Exception -> 0x091b }
            java.lang.String r10 = "cross_platform_migration_completed_timestamp"
            r0 = 0
            long r0 = r11.A00(r10, r0)     // Catch:{ Exception -> 0x091b }
            java.util.Date r10 = new java.util.Date     // Catch:{ Exception -> 0x091b }
            r10.<init>(r0)     // Catch:{ Exception -> 0x091b }
            r0 = r19
            java.lang.String r1 = r0.format(r10)     // Catch:{ Exception -> 0x091b }
        L_0x0628:
            java.lang.String r0 = "XPMigrated"
            A00(r1, r7, r0)     // Catch:{ Exception -> 0x091b }
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r32)     // Catch:{ Exception -> 0x091b }
            java.lang.String r0 = "last_datacenter"
            java.lang.String r1 = r1.getString(r0, r9)     // Catch:{ Exception -> 0x091b }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x091b }
            if (r0 != 0) goto L_0x0642
            java.lang.String r0 = "Datacenter"
            A00(r1, r7, r0)     // Catch:{ Exception -> 0x091b }
        L_0x0642:
            java.lang.String r1 = "Screen reader"
            android.view.accessibility.AccessibilityManager r0 = r30.A0P()     // Catch:{ Exception -> 0x091b }
            boolean r0 = X.C107295b4.A08(r0)     // Catch:{ Exception -> 0x091b }
            A01(r7, r1, r0)     // Catch:{ Exception -> 0x091b }
            java.lang.String r1 = "Fingerprint eligible"
            X.5Ug r0 = r4.A0A     // Catch:{ Exception -> 0x091b }
            boolean r0 = r0.A06()     // Catch:{ Exception -> 0x091b }
            A01(r7, r1, r0)     // Catch:{ Exception -> 0x091b }
            X.0N6 r0 = r4.A0B     // Catch:{ Exception -> 0x091b }
            X.35r r0 = X.AnonymousClass0x7.A0N(r0)     // Catch:{ Exception -> 0x091b }
            long r0 = r0.A0D()     // Catch:{ Exception -> 0x091b }
            r10 = 0
            int r9 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x0680
            java.lang.String r1 = "never"
        L_0x066d:
            java.lang.String r0 = "Last local backup time"
            A00(r1, r7, r0)     // Catch:{ Exception -> 0x091b }
            java.lang.String r9 = r32.A0X()     // Catch:{ Exception -> 0x091b }
            boolean r1 = X.C18320x8.A1U(r9)     // Catch:{ Exception -> 0x091b }
            java.lang.String r0 = "Google account added"
            A01(r7, r0, r1)     // Catch:{ Exception -> 0x091b }
            goto L_0x0695
        L_0x0680:
            r10 = -1
            int r9 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x0689
            r1 = r23
            goto L_0x066d
        L_0x0689:
            java.util.Date r9 = new java.util.Date     // Catch:{ Exception -> 0x091b }
            r9.<init>(r0)     // Catch:{ Exception -> 0x091b }
            r0 = r19
            java.lang.String r1 = r0.format(r9)     // Catch:{ Exception -> 0x091b }
            goto L_0x066d
        L_0x0695:
            if (r1 == 0) goto L_0x0717
            r0 = r32
            long r0 = r0.A0R(r9)     // Catch:{ Exception -> 0x091b }
            java.lang.String r11 = "Last successful Google Drive backup time"
            r12 = 0
            int r10 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r10 != 0) goto L_0x06e4
            java.lang.String r0 = "never"
        L_0x06a8:
            A00(r0, r7, r11)     // Catch:{ Exception -> 0x091b }
            r0 = r32
            long r0 = r0.A0S(r9)     // Catch:{ Exception -> 0x091b }
            r10 = 0
            int r9 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x06d0
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x091b }
            r9.append(r0)     // Catch:{ Exception -> 0x091b }
            r9.append(r3)     // Catch:{ Exception -> 0x091b }
            r3 = r34
            java.lang.String r0 = android.text.format.Formatter.formatFileSize(r3, r0)     // Catch:{ Exception -> 0x091b }
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r15, r9)     // Catch:{ Exception -> 0x091b }
            java.lang.String r0 = "Size of Google Drive backup"
            A00(r1, r7, r0)     // Catch:{ Exception -> 0x091b }
        L_0x06d0:
            int r0 = r32.A05()     // Catch:{ Exception -> 0x091b }
            java.lang.String r1 = X.AnonymousClass0YV.A03(r0)     // Catch:{ Exception -> 0x091b }
            java.lang.String r0 = "Backup to Google Drive frequency"
            A00(r1, r7, r0)     // Catch:{ Exception -> 0x091b }
            int r0 = r32.A06()     // Catch:{ Exception -> 0x091b }
            if (r0 == 0) goto L_0x06fc
            goto L_0x06f9
        L_0x06e4:
            r12 = -1
            int r10 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r10 != 0) goto L_0x06ed
            r0 = r23
            goto L_0x06a8
        L_0x06ed:
            java.util.Date r10 = new java.util.Date     // Catch:{ Exception -> 0x091b }
            r10.<init>(r0)     // Catch:{ Exception -> 0x091b }
            r0 = r19
            java.lang.String r0 = r0.format(r10)     // Catch:{ Exception -> 0x091b }
            goto L_0x06a8
        L_0x06f9:
            if (r0 != r2) goto L_0x0703
            goto L_0x0700
        L_0x06fc:
            java.lang.String r23 = "wifi only"
            goto L_0x0703
        L_0x0700:
            java.lang.String r23 = "wifi or cellular"
        L_0x0703:
            java.lang.String r1 = "Backed up over"
            r0 = r23
            A00(r0, r7, r1)     // Catch:{ Exception -> 0x091b }
            boolean r0 = r32.A27()     // Catch:{ Exception -> 0x091b }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x091b }
            java.lang.String r0 = "Videos included in backup"
            A00(r1, r7, r0)     // Catch:{ Exception -> 0x091b }
        L_0x0717:
            java.lang.String r3 = "Groups media visibility"
            X.1R1 r9 = r4.A0Z     // Catch:{ Exception -> 0x091b }
            X.2sa r0 = r9.A0H()     // Catch:{ Exception -> 0x091b }
            int r1 = r0.A01     // Catch:{ Exception -> 0x091b }
            if (r1 == 0) goto L_0x0731
            if (r1 == r2) goto L_0x072d
            r0 = 2
            if (r1 == r0) goto L_0x0729
            goto L_0x0734
        L_0x0729:
            java.lang.String r0 = "on"
            goto L_0x0736
        L_0x072d:
            java.lang.String r0 = "off"
            goto L_0x0736
        L_0x0731:
            java.lang.String r0 = "default"
            goto L_0x0736
        L_0x0734:
            java.lang.String r0 = "<unknown>"
        L_0x0736:
            A00(r0, r7, r3)     // Catch:{ Exception -> 0x091b }
            java.lang.String r3 = "Individual media visibility"
            X.2sa r0 = r9.A0I()     // Catch:{ Exception -> 0x091b }
            int r1 = r0.A01     // Catch:{ Exception -> 0x091b }
            if (r1 == 0) goto L_0x0751
            if (r1 == r2) goto L_0x074d
            r0 = 2
            if (r1 == r0) goto L_0x0749
            goto L_0x0754
        L_0x0749:
            java.lang.String r0 = "on"
            goto L_0x0756
        L_0x074d:
            java.lang.String r0 = "off"
            goto L_0x0756
        L_0x0751:
            java.lang.String r0 = "default"
            goto L_0x0756
        L_0x0754:
            java.lang.String r0 = "<unknown>"
        L_0x0756:
            A00(r0, r7, r3)     // Catch:{ Exception -> 0x091b }
            java.lang.String r3 = "In scoped mode"
            X.310 r1 = r4.A0I     // Catch:{ Exception -> 0x091b }
            boolean r0 = r1.A0B()     // Catch:{ Exception -> 0x091b }
            A01(r7, r3, r0)     // Catch:{ Exception -> 0x091b }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x091b }
            r0 = 30
            if (r3 < r0) goto L_0x0780
            boolean r0 = r1.A0B()     // Catch:{ Exception -> 0x091b }
            if (r0 != 0) goto L_0x0780
            java.io.File r0 = r1.A04()     // Catch:{ Exception -> 0x091b }
            java.lang.String r3 = "scoped root"
            if (r0 == 0) goto L_0x07d4
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x091b }
        L_0x077d:
            A00(r0, r7, r3)     // Catch:{ Exception -> 0x091b }
        L_0x0780:
            java.lang.String r3 = "Has unexpected .nomedia"
            X.3Dh r9 = r4.A06     // Catch:{ Exception -> 0x091b }
            X.2UN r0 = r9.A08()     // Catch:{ Exception -> 0x091b }
            java.io.File r0 = r0.A01     // Catch:{ Exception -> 0x091b }
            boolean r0 = A02(r0)     // Catch:{ Exception -> 0x091b }
            if (r0 != 0) goto L_0x07d8
            X.2UN r0 = r9.A08()     // Catch:{ Exception -> 0x091b }
            java.io.File r0 = r0.A00     // Catch:{ Exception -> 0x091b }
            boolean r0 = A02(r0)     // Catch:{ Exception -> 0x091b }
            if (r0 != 0) goto L_0x07d8
            X.2UN r0 = r9.A08()     // Catch:{ Exception -> 0x091b }
            java.io.File r0 = r0.A0O     // Catch:{ Exception -> 0x091b }
            boolean r0 = A02(r0)     // Catch:{ Exception -> 0x091b }
            if (r0 != 0) goto L_0x07d8
            X.2UN r0 = r9.A08()     // Catch:{ Exception -> 0x091b }
            java.io.File r0 = r0.A05     // Catch:{ Exception -> 0x091b }
            boolean r0 = A02(r0)     // Catch:{ Exception -> 0x091b }
            if (r0 != 0) goto L_0x07d8
            java.io.File r0 = r9.A0A()     // Catch:{ Exception -> 0x091b }
            boolean r0 = A02(r0)     // Catch:{ Exception -> 0x091b }
            if (r0 != 0) goto L_0x07d8
            java.io.File r0 = r9.A0G()     // Catch:{ Exception -> 0x091b }
            boolean r0 = A02(r0)     // Catch:{ Exception -> 0x091b }
            if (r0 != 0) goto L_0x07d8
            java.io.File r0 = X.AnonymousClass310.A00(r1)     // Catch:{ Exception -> 0x091b }
            boolean r1 = A02(r0)     // Catch:{ Exception -> 0x091b }
            r0 = 0
            if (r1 == 0) goto L_0x07d9
            goto L_0x07d8
        L_0x07d4:
            java.lang.String r0 = "null"
            goto L_0x077d
        L_0x07d8:
            r0 = 1
        L_0x07d9:
            A01(r7, r3, r0)     // Catch:{ Exception -> 0x091b }
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()     // Catch:{ Exception -> 0x091b }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ Exception -> 0x091b }
        L_0x07e4:
            boolean r0 = r3.hasNext()     // Catch:{ Exception -> 0x091b }
            if (r0 == 0) goto L_0x07f8
            android.util.Pair r0 = X.AnonymousClass0x9.A0D(r3)     // Catch:{ Exception -> 0x091b }
            java.lang.Object r1 = r0.first     // Catch:{ Exception -> 0x091b }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x091b }
            java.lang.Object r0 = r0.second     // Catch:{ Exception -> 0x091b }
            A00(r0, r7, r1)     // Catch:{ Exception -> 0x091b }
            goto L_0x07e4
        L_0x07f8:
            java.lang.String r1 = "waffle enabled"
            com.whatsapp.bridge.wfal.WfalManager r0 = r4.A0C     // Catch:{ Exception -> 0x091b }
            boolean r0 = r0.A02()     // Catch:{ Exception -> 0x091b }
            A01(r7, r1, r0)     // Catch:{ Exception -> 0x091b }
            X.5Se r0 = r4.A0e     // Catch:{ Exception -> 0x091b }
            boolean r0 = r0.A00()     // Catch:{ Exception -> 0x091b }
            if (r0 == 0) goto L_0x0819
            java.lang.String r3 = "crossposting enabled"
            X.2rK r1 = r4.A0d     // Catch:{ Exception -> 0x091b }
            X.21S r0 = X.AnonymousClass21S.A0K     // Catch:{ Exception -> 0x091b }
            boolean r0 = r1.A05(r0)     // Catch:{ Exception -> 0x091b }
            A01(r7, r3, r0)     // Catch:{ Exception -> 0x091b }
        L_0x0819:
            if (r44 == 0) goto L_0x0840
            org.json.JSONObject r9 = X.AnonymousClass0x9.A1G()     // Catch:{ Exception -> 0x091b }
            java.util.Iterator r3 = r44.iterator()     // Catch:{ Exception -> 0x091b }
        L_0x0823:
            boolean r0 = r3.hasNext()     // Catch:{ Exception -> 0x091b }
            if (r0 == 0) goto L_0x0837
            android.util.Pair r0 = X.AnonymousClass0x9.A0D(r3)     // Catch:{ Exception -> 0x091b }
            java.lang.Object r1 = r0.first     // Catch:{ Exception -> 0x091b }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x091b }
            java.lang.Object r0 = r0.second     // Catch:{ Exception -> 0x091b }
            r9.put(r1, r0)     // Catch:{ Exception -> 0x091b }
            goto L_0x0823
        L_0x0837:
            java.lang.String r1 = "User context"
            java.lang.String r0 = r9.toString()     // Catch:{ Exception -> 0x091b }
            A00(r0, r7, r1)     // Catch:{ Exception -> 0x091b }
        L_0x0840:
            r3 = r38
            if (r38 == 0) goto L_0x0853
            r0 = 2057(0x809, float:2.882E-42)
            boolean r0 = r6.A0Y(r5, r0)     // Catch:{ Exception -> 0x091b }
            if (r0 == 0) goto L_0x0853
            java.lang.String r1 = "entity id"
            java.lang.String r0 = r3.user     // Catch:{ Exception -> 0x091b }
            A00(r0, r7, r1)     // Catch:{ Exception -> 0x091b }
        L_0x0853:
            java.lang.String r1 = "Is Companion"
            X.2lE r0 = r4.A0E     // Catch:{ Exception -> 0x091b }
            int r0 = r0.A00()     // Catch:{ Exception -> 0x091b }
            r3 = 2
            if (r0 != r3) goto L_0x0866
            X.2ou r0 = r4.A0F     // Catch:{ Exception -> 0x091b }
            boolean r0 = r0.A01()     // Catch:{ Exception -> 0x091b }
            if (r0 == 0) goto L_0x086c
        L_0x0866:
            boolean r0 = r28.A0Y()     // Catch:{ Exception -> 0x091b }
            if (r0 == 0) goto L_0x086d
        L_0x086c:
            r8 = 1
        L_0x086d:
            A01(r7, r1, r8)     // Catch:{ Exception -> 0x091b }
            java.lang.String r9 = "Has Wear OS Companion"
            java.util.List r0 = r31.A0C()     // Catch:{ Exception -> 0x091b }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ Exception -> 0x091b }
        L_0x087a:
            boolean r0 = r8.hasNext()     // Catch:{ Exception -> 0x091b }
            if (r0 == 0) goto L_0x0899
            java.lang.Object r0 = r8.next()     // Catch:{ Exception -> 0x091b }
            X.33G r0 = (X.AnonymousClass33G) r0     // Catch:{ Exception -> 0x091b }
            java.lang.String r0 = r0.A09     // Catch:{ Exception -> 0x091b }
            if (r0 == 0) goto L_0x087a
            java.lang.String r1 = X.AnonymousClass0x9.A0z(r0)     // Catch:{ Exception -> 0x091b }
            java.lang.String r0 = "wear os"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x091b }
            if (r0 == 0) goto L_0x087a
            r0 = 1
            goto L_0x089a
        L_0x0899:
            r0 = 0
        L_0x089a:
            A01(r7, r9, r0)     // Catch:{ Exception -> 0x091b }
            X.30z r8 = r4.A09     // Catch:{ Exception -> 0x091b }
            boolean r0 = r8.A07()     // Catch:{ Exception -> 0x091b }
            if (r0 == 0) goto L_0x08b6
            java.lang.String r1 = "Number of Accounts"
            X.33p r0 = r8.A0A     // Catch:{ Exception -> 0x091b }
            int r0 = r0.A0C()     // Catch:{ Exception -> 0x091b }
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x091b }
            A00(r0, r7, r1)     // Catch:{ Exception -> 0x091b }
        L_0x08b6:
            r1 = 6296(0x1898, float:8.823E-42)
            int r0 = r6.A0O(r5, r1)     // Catch:{ Exception -> 0x091b }
            if (r0 != r2) goto L_0x08ce
            java.lang.String r1 = "saga_control"
        L_0x08c1:
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x091b }
            if (r0 != 0) goto L_0x08f7
            java.lang.String r0 = "sagaKey"
            A00(r1, r7, r0)     // Catch:{ Exception -> 0x091b }
            goto L_0x08f7
        L_0x08ce:
            int r0 = r6.A0O(r5, r1)     // Catch:{ Exception -> 0x091b }
            if (r0 != r3) goto L_0x08d8
            java.lang.String r1 = "saga_test"
            goto L_0x08c1
        L_0x08d8:
            X.5rC r1 = r4.A00     // Catch:{ Exception -> 0x091b }
            boolean r0 = r1.A07()     // Catch:{ Exception -> 0x091b }
            if (r0 == 0) goto L_0x08f4
            java.lang.Object r0 = r1.A04()     // Catch:{ Exception -> 0x091b }
            X.2Ga r0 = (X.C40492Ga) r0     // Catch:{ Exception -> 0x091b }
            X.1VX r1 = r0.A00     // Catch:{ Exception -> 0x091b }
            r0 = 5626(0x15fa, float:7.884E-42)
            boolean r0 = r1.A0Y(r5, r0)     // Catch:{ Exception -> 0x091b }
            if (r0 == 0) goto L_0x08f4
            java.lang.String r1 = "saga"
            goto L_0x08c1
        L_0x08f4:
            r1 = r16
            goto L_0x08c1
        L_0x08f7:
            if (r50 == 0) goto L_0x0923
            r0 = r18
            java.lang.String r1 = r0.toString(r2)     // Catch:{ Exception -> 0x091b }
            r0 = r17
            r0.append(r1)     // Catch:{ Exception -> 0x091b }
            goto L_0x0923
        L_0x0905:
            r1 = move-exception
            if (r11 == 0) goto L_0x0910
            r11.close()     // Catch:{ all -> 0x090c }
            goto L_0x0910
        L_0x090c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0911 }
        L_0x0910:
            throw r1     // Catch:{ all -> 0x0911 }
        L_0x0911:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0916 }
            goto L_0x091a
        L_0x0916:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x091b }
        L_0x091a:
            throw r1     // Catch:{ Exception -> 0x091b }
        L_0x091b:
            r2 = move-exception
            boolean r0 = r2 instanceof android.database.sqlite.SQLiteException
            if (r0 == 0) goto L_0x0928
            X.C626936e.A0A(r2)
        L_0x0923:
            java.lang.String r0 = r17.toString()
            return r0
        L_0x0928:
            java.lang.String r0 = "exception during email composition"
            com.whatsapp.util.Log.e(r0, r2)
            X.2qk r1 = r4.A05
            java.lang.String r0 = "Exception building debug info"
            X.C55682qk.A05(r1, r0, r2)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C622734j.A04(android.content.Context, android.util.Pair, X.1fJ, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, org.json.JSONObject, long, long, boolean, boolean):java.lang.String");
    }
}

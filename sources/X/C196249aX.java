package X;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.avatar.autogen.AvatarAutogenMediaUploadManagerImpl$uploadAutogenMedia$1;
import com.whatsapp.biz.product.view.fragment.ReportProductDialogFragment;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wabloks.ui.BkActionBottomSheet;
import com.whatsapp.wabloks.ui.WaBloksActivity;
import com.whatsapp.wabloks.ui.WaBloksBottomSheetActivity;
import com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContainerFragment;
import com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContentFragment;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9aX  reason: invalid class name and case insensitive filesystem */
public abstract class C196249aX implements C186558vY {
    public Set A00;
    public final C116985rC A01;
    public final C116985rC A02;
    public final C193389Oh A03;
    public final C183538qC A04;
    public final C183538qC A05;
    public final C183538qC A06;
    public final C183538qC A07;
    public final C183538qC A08;
    public final C183538qC A09;
    public final C183538qC A0A;
    public final C183538qC A0B;
    public final C183538qC A0C;
    public final C183538qC A0D;
    public final C183538qC A0E;
    public final C183538qC A0F;
    public final C183538qC A0G;
    public final C183538qC A0H;
    public final C183538qC A0I;
    public final C183538qC A0J;
    public final C183538qC A0K;
    public final C183538qC A0L;
    public final C183538qC A0M;
    public final C183538qC A0N;
    public final C183538qC A0O;
    public final C183538qC A0P;
    public final C183538qC A0Q;
    public final C183538qC A0R;
    public final C183538qC A0S;
    public final C183538qC A0T;
    public final C183538qC A0U;
    public final C183538qC A0V;
    public final C183538qC A0W;
    public final C183538qC A0X;
    public final C183538qC A0Y;
    public final C183538qC A0Z;
    public final C183538qC A0a;
    public final C183538qC A0b;
    public final C183538qC A0c;
    public final C183538qC A0d;

    public void Bg4(Activity activity, String str, String str2) {
        try {
            UserJid A072 = A07(str);
            String A052 = AnonymousClass36P.A05(A072);
            if (A052 != null) {
                Object[] A1Z = AnonymousClass6C9.A1Z(A052, 2);
                if (str2 == null) {
                    str2 = "";
                }
                A1Z[1] = str2;
                ((C184988ss) this.A06.get()).BkW(activity, Uri.parse(String.format("http://api.whatsapp.com/send?phone=%s&text=%s", A1Z)), (C624134x) null);
                return;
            }
            throw new AnonymousClass24P(AnonymousClass000.A0P(A072, "invalid jid ", AnonymousClass001.A0o()));
        } catch (AnonymousClass24P e) {
            ((C55682qk) this.A0N.get()).A0A("bloks/openchat", true, e.getMessage());
            ((C69263Wi) this.A0Q.get()).A0H(R.string.f11nameremoved, 0);
        }
    }

    public void BgL(Activity activity, AnonymousClass49G r5, String str, String str2) {
        activity.startActivity(AnonymousClass0x9.A08(activity, WaBloksActivity.class).putExtra("screen_name", str).putExtra("screen_params", str2).putExtra("screen_cache_config", (Parcelable) null));
    }

    public void Bhy(AnonymousClass49G r8, int i, int i2) {
        C1230166s r3;
        boolean equals = "cancel".equals(r8.B3p().A0O(35));
        String A072 = AnonymousClass84O.A07(r8.B3p());
        r8.B3p().A0E(38, -1);
        C193389Oh r2 = this.A03;
        C183538qC r0 = r2.A00;
        int A022 = A02(r0, i2, i);
        int A002 = A00(r0, i);
        C183538qC r4 = r2.A01;
        long A032 = A03(r4, A022, A002);
        int A012 = A01(r4, i);
        if (1 == A012) {
            r3 = A04(r4).A05;
        } else if (2 == A012) {
            r3 = A04(r4).A04;
        } else {
            return;
        }
        r3.B3O(new C103995Pf(A072, equals), A032);
    }

    public void Bjh(Activity activity, String str, String str2, String str3, String str4, boolean z) {
        AnonymousClass2z0 r5;
        String str5;
        Activity activity2 = activity;
        if (!(activity instanceof AnonymousClass4FU)) {
            str5 = "[Bloks][bk.action.wa.spam.ReportSpam] activity doesn't implement DialogInterface";
        } else {
            C95814uZ A052 = C95814uZ.A00.A05(str);
            if (A052 == null) {
                str5 = "[Bloks][bk.action.wa.spam.ReportSpam] failed to parse chat jid from string";
            } else {
                AnonymousClass32Y r0 = UserJid.Companion;
                UserJid A0E2 = r0.A0E(str4);
                if (A0E2 == null) {
                    A0E2 = r0.A0E(str);
                }
                if (TextUtils.isEmpty(str3)) {
                    r5 = null;
                } else {
                    r5 = new AnonymousClass2z0(A052, str3, z);
                }
                C18270x1.A0w(new C191859Gs((AnonymousClass4FU) activity2, A052, A0E2, r5, this.A04, this.A0O, this.A0J, str2), (AnonymousClass4FS) this.A0c.get());
                return;
            }
        }
        Log.e(str5);
    }

    public void BlO(String str, ArrayList arrayList, HashMap hashMap, int i, int i2, int i3) {
        int i4;
        if (i2 != 1) {
            i4 = 2;
            if (i2 != 2) {
                i4 = 0;
            }
        } else {
            i4 = 1;
        }
        ((AnonymousClass4FV) this.A0d.get()).BhD(AnonymousClass9LP.A00(str, arrayList, hashMap, i, i4, i3));
    }

    public void BlP(String str, ArrayList arrayList, HashMap hashMap, int i, int i2, int i3) {
        int i4;
        if (i2 != 1) {
            i4 = 2;
            if (i2 != 2) {
                i4 = 0;
            }
        } else {
            i4 = 1;
        }
        ((AnonymousClass4FV) this.A0d.get()).BhA(AnonymousClass9LP.A00(str, arrayList, hashMap, i, i4, i3));
    }

    public void BpF(Activity activity, AnonymousClass49I r5, String str, String str2) {
        List A052 = ((C003203q) activity).getSupportFragmentManager().A0Y.A05();
        C88694ab A012 = C88694ab.A01(((C08310eF) A052.get(A052.size() - 1)).A0B, str, 0);
        A012.A0F(str2, new C204409pJ((Object) activity, 36, (Object) r5));
        A012.A05();
    }

    public void BpX(Activity activity, Intent intent, AnonymousClass7SE r5, int i) {
        if (!(activity instanceof C89644eZ)) {
            r5.A00(AnonymousClass9JJ.ERROR);
            return;
        }
        C89644eZ r3 = (C89644eZ) activity;
        r3.A6w(new C204699pm(r3, r5, this, 1));
        r3.startActivityForResult(intent, 1);
    }

    public void AxK(AnonymousClass49I r9, AnonymousClass49I r10, Object obj, String str, HashMap hashMap) {
        AnonymousClass0XG r1 = (AnonymousClass0XG) this.A07.get();
        r1.A00.A04((AnonymousClass39C) null, new C10440hw(r10, r9, r1, obj), (Boolean) null, str, C18320x8.A0e("params", hashMap), (String) null, true);
    }

    public void AxL(AnonymousClass49I r3, AnonymousClass49I r4, Object obj, String str, HashMap hashMap) {
        hashMap.put("nest_data_manifest", "true");
        AxK(r3, r4, obj, str, hashMap);
    }

    public void AxM(AnonymousClass49I r12, AnonymousClass49I r13, Object obj, String str, String str2, String str3, String str4) {
        String str5;
        C42082Ms r1;
        AnonymousClass9P8 r3 = (AnonymousClass9P8) this.A08.get();
        String str6 = str;
        if (TextUtils.isEmpty(str)) {
            C626936e.A0D(false, "null app id");
            r3.A00.BkS(AnonymousClass8DJ.A07(r13.B3r(), obj));
            return;
        }
        Iterator it = r3.A02.iterator();
        do {
            str5 = str2;
            if (it.hasNext()) {
                r1 = (C42082Ms) it.next();
                C162457s7.A0J(obj, 0);
            } else {
                AnonymousClass0XG r0 = (AnonymousClass0XG) r3.A01.get();
                r0.A00.A04((AnonymousClass39C) null, new C10440hw(r13, r12, r0, obj), (Boolean) null, str6, str5, (String) null, true);
                return;
            }
        } while (!"secure_v0".equals(str4));
        C183538qC r02 = r1.A02;
        if (r02 != null) {
            C34701va r5 = (C34701va) r02.get();
            if (str != null) {
                C198129eQ r4 = new C198129eQ(r1, r12, r13, obj);
                C64333Db r2 = r5.A00.A00.A01;
                r5.A02(r4, new AnonymousClass9Hj((C55682qk) r2.A75.get(), C64333Db.A2p(r2), C64333Db.A5u(r2), str3), AnonymousClass0x9.A0G(str, str5), 45);
                return;
            }
            throw AnonymousClass001.A0e("Required value was null.");
        }
        throw C18270x1.A0S("bloksPayloadIqHelperLazy");
    }

    public void AxX() {
        AnonymousClass4GP r0 = ((AnonymousClass7OZ) this.A09.get()).A02;
        if (r0 != null) {
            r0.invoke();
        }
    }

    public void Ayi() {
        AnonymousClass4GP r0 = ((AnonymousClass7OZ) this.A09.get()).A03;
        if (r0 != null) {
            r0.invoke();
        }
    }

    public void B1o(Activity activity, AnonymousClass49I r4) {
        if (activity instanceof WaBloksBottomSheetActivity) {
            activity.finish();
            return;
        }
        ((AnonymousClass9V0) this.A0B.get()).A00(activity);
        Stack stack = C194709Ue.A01;
        if (!stack.isEmpty()) {
            BkBottomSheetContainerFragment bkBottomSheetContainerFragment = (BkBottomSheetContainerFragment) stack.peek();
            bkBottomSheetContainerFragment.A02 = r4;
            bkBottomSheetContainerFragment.A1K();
        }
    }

    public void B37(AnonymousClass49I r3, Object obj, String str, String str2, String str3, String str4, List list, List list2, Map map) {
        C116985rC r1 = this.A02;
        if (r1.A07()) {
            r1.A04();
            throw AnonymousClass001.A0g("handleFetchPriceAndBuy");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r1 == false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String B41(int r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r4 = "null"
            int r1 = r7.hashCode()     // Catch:{ IllegalArgumentException -> 0x0067 }
            r0 = -1808118735(0xffffffff943a4c31, float:-9.405626E-27)
            r3 = 2
            r2 = 1
            if (r1 == r0) goto L_0x0027
            r0 = -672261858(0xffffffffd7ee191e, float:-5.2358329E14)
            if (r1 == r0) goto L_0x001f
            r0 = 1729365000(0x67140408, float:6.989846E23)
            if (r1 != r0) goto L_0x0030
            java.lang.String r0 = "Boolean"
            boolean r1 = r7.equals(r0)     // Catch:{ IllegalArgumentException -> 0x0067 }
            r0 = 2
            goto L_0x002e
        L_0x001f:
            java.lang.String r0 = "Integer"
            boolean r1 = r7.equals(r0)     // Catch:{ IllegalArgumentException -> 0x0067 }
            r0 = 1
            goto L_0x002e
        L_0x0027:
            java.lang.String r0 = "String"
            boolean r1 = r7.equals(r0)     // Catch:{ IllegalArgumentException -> 0x0067 }
            r0 = 0
        L_0x002e:
            if (r1 != 0) goto L_0x0031
        L_0x0030:
            r0 = -1
        L_0x0031:
            if (r0 == 0) goto L_0x005a
            if (r0 == r2) goto L_0x0049
            if (r0 == r3) goto L_0x0038
            return r4
        L_0x0038:
            X.8qC r0 = r5.A04     // Catch:{ IllegalArgumentException -> 0x0067 }
            java.lang.Object r0 = r0.get()     // Catch:{ IllegalArgumentException -> 0x0067 }
            X.2sp r0 = (X.C56952sp) r0     // Catch:{ IllegalArgumentException -> 0x0067 }
            boolean r0 = r0.A0X(r6)     // Catch:{ IllegalArgumentException -> 0x0067 }
            java.lang.String r0 = java.lang.Boolean.toString(r0)     // Catch:{ IllegalArgumentException -> 0x0067 }
            return r0
        L_0x0049:
            X.8qC r0 = r5.A04     // Catch:{ IllegalArgumentException -> 0x0067 }
            java.lang.Object r0 = r0.get()     // Catch:{ IllegalArgumentException -> 0x0067 }
            X.2sp r0 = (X.C56952sp) r0     // Catch:{ IllegalArgumentException -> 0x0067 }
            int r0 = r0.A0N(r6)     // Catch:{ IllegalArgumentException -> 0x0067 }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ IllegalArgumentException -> 0x0067 }
            return r0
        L_0x005a:
            X.8qC r0 = r5.A04     // Catch:{ IllegalArgumentException -> 0x0067 }
            java.lang.Object r0 = r0.get()     // Catch:{ IllegalArgumentException -> 0x0067 }
            X.2sp r0 = (X.C56952sp) r0     // Catch:{ IllegalArgumentException -> 0x0067 }
            java.lang.String r0 = r0.A0Q(r6)     // Catch:{ IllegalArgumentException -> 0x0067 }
            return r0
        L_0x0067:
            r1 = move-exception
            java.lang.String r0 = "Bloks: WaBkGlobalInterpreterExtImpl/getAbPropValue/exception"
            com.whatsapp.util.Log.e(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196249aX.B41(int, java.lang.String):java.lang.String");
    }

    public Map B4m() {
        PhoneUserJid A042 = C56972sr.A04((C56972sr) this.A0R.get());
        C626936e.A06(A042);
        return ((C193949Qw) this.A0G.get()).A00(A042);
    }

    public ClipboardManager B5Z() {
        return ((C620633i) this.A0V.get()).A0C();
    }

    public long B6Z() {
        return ((C56612sH) this.A0W.get()).A0H();
    }

    public File B7V(String str) {
        return ((C64393Dh) this.A0P.get()).A0R(str);
    }

    public String BBJ() {
        return ((AnonymousClass3Au) this.A0T.get()).BBI().A01;
    }

    public void Bg2(Activity activity, String str) {
        Class B5q = ((AnonymousClass9U4) this.A0S.get()).A0G().B5q();
        if (B5q != null) {
            Intent A082 = AnonymousClass0x9.A08(activity, B5q);
            if (B5q.getName().equals("com.whatsapp.support.DescribeProblemActivity")) {
                A082.putExtra("com.whatsapp.support.DescribeProblemActivity.from", "payments:transaction");
                A082.putExtra("com.whatsapp.support.DescribeProblemActivity.paymentFBTxnId", str);
            }
            A082.putExtra("extra_transaction_id", str);
            activity.startActivity(A082);
        }
    }

    public void Bg3(Activity activity, String str) {
        Class BC8 = ((AnonymousClass9U4) this.A0S.get()).A0G().BC8();
        if (BC8 != null) {
            Intent A082 = AnonymousClass0x9.A08(activity, BC8);
            A082.putExtra("extra_transaction_id", str);
            activity.startActivity(A082);
        }
    }

    public void BgI(Activity activity, String str, String str2, List list) {
        BkActionBottomSheet.A00((C55742qq) this.A0C.get(), str, str2, list).A1O(((C003203q) activity).getSupportFragmentManager(), "bloks_action_sheet_tag");
    }

    public void BgK(Activity activity, String str, String str2) {
        Iterator it = ((Set) this.A0a.get()).iterator();
        while (it.hasNext()) {
            it.next();
            C162457s7.A0J(str, 0);
            if (C175738Zn.A0Y(str, "com.bloks.www.csf", false)) {
                C162457s7.A0J(activity, 0);
                Intent A072 = C18320x8.A07();
                A072.setClassName(activity, "com.whatsapp.inappsupport.ui.SupportBloksActivity");
                A072.putExtra("screen_name", str);
                A072.putExtra("screen_params", str2);
                activity.startActivity(A072);
                return;
            }
        }
        activity.startActivity(WaBloksActivity.A0X(activity, str, str2));
    }

    public void Bgz(Activity activity) {
        ((AnonymousClass9V0) this.A0B.get()).A00(activity);
        Stack stack = C194709Ue.A01;
        if (!stack.isEmpty()) {
            ((C08310eF) stack.peek()).A0T().A0M();
        }
    }

    public void Bho(Map map, int i, int i2) {
        String str;
        String str2;
        char c;
        int i3;
        C186568vZ r0;
        if (map != null && !map.isEmpty()) {
            try {
                Iterator A0q = AnonymousClass000.A0q(map);
                while (A0q.hasNext()) {
                    Map.Entry A0w = AnonymousClass001.A0w(A0q);
                    Object key = A0w.getKey();
                    if (key == null) {
                        str = null;
                    } else {
                        str = key.toString();
                    }
                    Object value = A0w.getValue();
                    if (value == null) {
                        str2 = null;
                    } else {
                        str2 = value.toString();
                    }
                    if (!(str == null || str2 == null)) {
                        C193389Oh r1 = this.A03;
                        C183538qC r02 = r1.A00;
                        int A022 = A02(r02, i2, i);
                        int A002 = A00(r02, i);
                        C183538qC r7 = r1.A01;
                        AnonymousClass9TW r8 = A04(r7).A06;
                        Number number = (Number) r8.A00(i).A03.get(str);
                        if (number != null) {
                            int intValue = number.intValue();
                            c = 2;
                            if (2 != intValue) {
                                c = 1;
                                if (1 == intValue) {
                                }
                            }
                            i3 = r8.A00(i).A00;
                            if (!(i3 == -1 || c == 65535)) {
                                if (i3 != 2 || c == 2) {
                                    r0 = A04(r7).A02;
                                } else {
                                    r0 = A04(r7).A03;
                                }
                                r0.markerAnnotate(A002, A022, str, str2);
                            }
                        }
                        c = 65535;
                        i3 = r8.A00(i).A00;
                        if (i3 != 2) {
                        }
                        r0 = A04(r7).A02;
                        r0.markerAnnotate(A002, A022, str, str2);
                    }
                }
            } catch (ConcurrentModificationException e) {
                Log.e("Error during annotations map parse", e);
            }
        }
    }

    public void Bhp(int i, int i2) {
        C186568vZ r0;
        C193389Oh r1 = this.A03;
        C183538qC r02 = r1.A00;
        int A022 = A02(r02, i2, i);
        int A002 = A00(r02, i);
        C183538qC r2 = r1.A01;
        int A012 = A01(r2, i);
        if (1 == A012) {
            r0 = A04(r2).A03;
        } else if (2 == A012) {
            r0 = A04(r2).A02;
        } else {
            return;
        }
        r0.markerDrop(A002, A022);
    }

    public void Bhq(AnonymousClass49G r7, Map map, int i, int i2, int i3) {
        C186568vZ r0;
        C193389Oh r1 = this.A03;
        short s = (short) i3;
        C183538qC r02 = r1.A00;
        int A022 = A02(r02, i2, i);
        int A002 = A00(r02, i);
        C183538qC r2 = r1.A01;
        int A012 = A01(r2, i);
        if (1 == A012) {
            r0 = A04(r2).A03;
        } else if (2 == A012) {
            r0 = A04(r2).A02;
        } else {
            return;
        }
        r0.markerEnd(A002, A022, s);
    }

    public void Bhr(AnonymousClass49G r7, String str, int i, int i2) {
        String str2;
        C186568vZ r0;
        if (str != null) {
            if (r7.B3p() != null) {
                str2 = r7.B3p().A0O(35);
            } else {
                str2 = null;
            }
            C193389Oh r1 = this.A03;
            C183538qC r02 = r1.A00;
            int A022 = A02(r02, i2, i);
            int A002 = A00(r02, i);
            C183538qC r2 = r1.A01;
            int A012 = A01(r2, i);
            if (1 == A012) {
                r0 = A04(r2).A03;
            } else if (2 == A012) {
                r0 = A04(r2).A02;
            } else {
                return;
            }
            r0.markerPoint(A002, A022, str, str2);
        }
    }

    public void Bhs(AnonymousClass49G r7, Map map, int i, int i2) {
        C186568vZ r2;
        if (r7 != null) {
            r7.B3p().A0O(38);
        }
        C193389Oh r1 = this.A03;
        C183538qC r0 = r1.A00;
        int A022 = A02(r0, i2, i);
        int A002 = A00(r0, i);
        C183538qC r3 = r1.A01;
        int A012 = A01(r3, i);
        if (1 == A012) {
            r2 = A04(r3).A03;
        } else if (2 == A012) {
            r2 = A04(r3).A02;
        } else {
            return;
        }
        r2.markerStart(A002, A022);
        r2.markerAnnotate(A002, A022, "bloks_display_name", A04(r3).A06.A00(i).A02);
    }

    public void Bht(int i, int i2, String str) {
        C186568vZ r0;
        C1230166s r02;
        C193389Oh r1 = this.A03;
        C183538qC r03 = r1.A00;
        int A022 = A02(r03, i2, i);
        int A002 = A00(r03, i);
        C183538qC r5 = r1.A01;
        long A032 = A03(r5, A022, A002);
        int A012 = A01(r5, i);
        if (1 == A012) {
            C197759dp A042 = A04(r5);
            if (str != null) {
                r02 = A042.A05;
            } else {
                r0 = A042.A03;
                r0.markerEnd(A002, A022, 4);
                return;
            }
        } else if (2 == A012) {
            C197759dp A043 = A04(r5);
            if (str != null) {
                r02 = A043.A04;
            } else {
                r0 = A043.A02;
                r0.markerEnd(A002, A022, 4);
                return;
            }
        } else {
            return;
        }
        r02.flowEndCancel(A032, str);
    }

    public void Bhu(int i, int i2, String str, String str2) {
        C186568vZ r0;
        Object obj;
        C193389Oh r1 = this.A03;
        C183538qC r02 = r1.A00;
        int A022 = A02(r02, i2, i);
        int A002 = A00(r02, i);
        C183538qC r5 = r1.A01;
        long A032 = A03(r5, A022, A002);
        int A012 = A01(r5, i);
        if (1 == A012) {
            C197759dp A042 = A04(r5);
            if (str != null) {
                obj = A042.A05;
            } else {
                r0 = A042.A03;
                r0.markerEnd(A002, A022, 87);
                return;
            }
        } else if (2 == A012) {
            C197759dp A043 = A04(r5);
            if (str != null) {
                obj = A043.A04;
            } else {
                r0 = A043.A02;
                r0.markerEnd(A002, A022, 87);
                return;
            }
        } else {
            return;
        }
        int i3 = (int) A032;
        int i4 = (int) (A032 >>> 32);
        C186568vZ r12 = ((C115425oe) obj).A00;
        r12.markerAnnotate(i3, i4, "uf_has_error", true);
        if (str2 != null) {
            r12.markerPoint(i3, i4, str, str2);
        } else {
            r12.markerPoint(i3, i4, str);
        }
    }

    public void Bhv(int i, int i2, String str, String str2) {
        C1230166s r2;
        C193389Oh r22 = this.A03;
        C183538qC r0 = r22.A00;
        int A022 = A02(r0, i2, i);
        int A002 = A00(r0, i);
        C183538qC r4 = r22.A01;
        long A032 = A03(r4, A022, A002);
        int A012 = A01(r4, i);
        if (1 == A012) {
            r2 = A04(r4).A05;
        } else if (2 == A012) {
            r2 = A04(r4).A04;
        } else {
            return;
        }
        r2.flowEndFail(A032, str, str2);
    }

    public void Bhw(int i, int i2) {
        C1230166s r0;
        C193389Oh r2 = this.A03;
        C183538qC r02 = r2.A00;
        int A022 = A02(r02, i2, i);
        int A002 = A00(r02, i);
        C183538qC r4 = r2.A01;
        long A032 = A03(r4, A022, A002);
        int A012 = A01(r4, i);
        if (1 == A012) {
            r0 = A04(r4).A05;
        } else if (2 == A012) {
            r0 = A04(r4).A04;
        } else {
            return;
        }
        r0.flowEndSuccess(A032);
    }

    public void Bhx(String str, Map map, int i, int i2) {
        String obj;
        if (str != null) {
            HashMap A0t = AnonymousClass001.A0t();
            if (map != null) {
                Iterator A0q = AnonymousClass000.A0q(map);
                while (A0q.hasNext()) {
                    Map.Entry A0w = AnonymousClass001.A0w(A0q);
                    A0t.put(A0w.getKey().toString(), A0w.getValue());
                }
            }
            C193389Oh r1 = this.A03;
            C183538qC r0 = r1.A00;
            int A022 = A02(r0, i2, i);
            int A002 = A00(r0, i);
            C197759dp A042 = A04(r1.A01);
            AnonymousClass6N2 r2 = new AnonymousClass6N2(A042.A00, A042, Integer.valueOf(A022), A002);
            r2.A03 = str;
            r2.A01 = -1;
            Iterator A0u = AnonymousClass001.A0u(A0t);
            while (A0u.hasNext()) {
                Map.Entry A0w2 = AnonymousClass001.A0w(A0u);
                String A0q2 = C18310x6.A0q(A0w2);
                Object value = A0w2.getValue();
                if (value instanceof String) {
                    obj = (String) value;
                } else if (value instanceof Integer) {
                    r2.addPointData(A0q2, AnonymousClass001.A0K(value));
                } else if (value instanceof Long) {
                    r2.addPointData(A0q2, C18310x6.A0B(value));
                } else if (value instanceof Double) {
                    r2.addPointData(A0q2, ((Number) value).doubleValue());
                } else if (value instanceof Float) {
                    r2.addPointData(A0q2, AnonymousClass001.A05(value));
                } else if (value instanceof Boolean) {
                    r2.addPointData(A0q2, AnonymousClass001.A1Z(value));
                } else if (value instanceof int[]) {
                    r2.addPointData(A0q2, (int[]) value);
                } else if (value instanceof long[]) {
                    r2.addPointData(A0q2, (long[]) value);
                } else if (value instanceof String[]) {
                    r2.addPointData(A0q2, (String[]) value);
                } else if (value instanceof double[]) {
                    r2.addPointData(A0q2, (double[]) value);
                } else if (value instanceof float[]) {
                    r2.addPointData(A0q2, (float[]) value);
                } else if (value instanceof boolean[]) {
                    r2.addPointData(A0q2, (boolean[]) value);
                } else if (value != null) {
                    obj = value.toString();
                }
                r2.addPointData(A0q2, obj);
            }
            r2.pointEditingCompleted();
        }
    }

    public void Bjc(Activity activity, String str, String str2) {
        ((AnonymousClass4FS) this.A0c.get()).BkP(new C201309jr(activity, this, str, str2));
    }

    public void Bjf(Activity activity, String str, String str2) {
        String str3;
        if (!(activity instanceof AnonymousClass4FU)) {
            str3 = "[Bloks][bk.action.wa.extension.ReportItem] activity doesn't implement DialogInterface";
        } else if (!(activity instanceof C009707r)) {
            str3 = "[Bloks][bk.action.wa.extension.ReportItem] activity is not instance of AppCompatActivity";
        } else {
            C95814uZ A052 = C95814uZ.A00.A05(str);
            if (A052 == null) {
                str3 = "[Bloks][bk.action.wa.extension.ReportItem] failed to parse chat jid from string";
            } else {
                ReportProductDialogFragment reportProductDialogFragment = new ReportProductDialogFragment();
                reportProductDialogFragment.A00 = new C196079aG(activity, A052, this, str2);
                AnonymousClass344.A02(reportProductDialogFragment, ((C003203q) activity).getSupportFragmentManager(), ReportProductDialogFragment.class.getName());
                return;
            }
        }
        Log.e(str3);
    }

    public void Bjn(Activity activity, AnonymousClass49H r7, String[] strArr) {
        if (this.A00 == null) {
            HashSet A0K2 = AnonymousClass002.A0K();
            this.A00 = A0K2;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            C73743g0.A0Y(linkedHashSet, C107035aa.A00());
            C73743g0.A0Y(linkedHashSet, C107035aa.A03());
            A0K2.addAll(Arrays.asList(linkedHashSet.toArray(new String[0])));
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                String str = strArr[i];
                if (!this.A00.contains(str)) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Unauthorized permission request ");
                    A0o.append(str);
                    A0o.append(", Bloks allowed to request only whitelisted permissions ");
                    A0o.append(this.A00);
                    C18280x3.A13(A0o);
                    break;
                }
                i++;
            } else if (activity instanceof C89644eZ) {
                C89644eZ r4 = (C89644eZ) activity;
                Intent A0L2 = RequestPermissionActivity.A0L(activity, (AnonymousClass5ZR) this.A0b.get(), (AnonymousClass1VX) this.A04.get(), 30);
                if (A0L2 == null) {
                    r7.BaR(true);
                    return;
                }
                r4.A6w(new C204699pm(r4, r7, this, 0));
                r4.startActivityForResult(A0L2, 30);
                return;
            }
        }
        r7.BaR(false);
    }

    public void Bjo(String str, HashMap hashMap, int i) {
        C03660Lb r5 = (C03660Lb) this.A0Z.get();
        String A0e = C18320x8.A0e("params", hashMap);
        r5.A00.A03(new AnonymousClass39C(((long) i) * 1000, "PRELOAD", false), new C10420hu(r5, str), Boolean.TRUE, str, A0e, (String) null);
    }

    public void BkG(Activity activity, String str) {
        C116985rC r1 = this.A01;
        if (r1.A07()) {
            r1.A04();
            throw AnonymousClass001.A0g("routeToNativeScreen");
        }
    }

    public void BlL(Activity activity, String str, String str2, String str3) {
        C183538qC r1 = this.A0F;
        if (r1.get() != null) {
            r1.get();
            activity.getApplicationContext();
        }
    }

    public void Bo0(Activity activity, String str) {
        C50482iF r1 = (C50482iF) this.A0U.get();
        if (!(activity instanceof WaBloksActivity) || !r1.A01() || !r1.A08.A01(str)) {
            A06(activity, str);
            return;
        }
        WaBloksActivity waBloksActivity = (WaBloksActivity) activity;
        waBloksActivity.A6w(new C195999a8(this, waBloksActivity, str));
        HashSet A0K2 = AnonymousClass002.A0K();
        C18270x1.A1K(A0K2, 55);
        AnonymousClass5PH r2 = new AnonymousClass5PH(waBloksActivity);
        r2.A0H = true;
        r2.A0L = true;
        r2.A0Z = AnonymousClass002.A0J(A0K2);
        r2.A0W = str;
        waBloksActivity.startActivityForResult(r2.A03("com.whatsapp.contact.picker.ContactPicker"), 1);
    }

    public void Bp7(Activity activity, ProgressDialog progressDialog, String str, boolean z) {
        if (progressDialog != null) {
            if (progressDialog.isShowing()) {
                progressDialog.dismiss();
            }
            progressDialog.setMessage(str);
            progressDialog.setIndeterminate(true);
            progressDialog.setCanceledOnTouchOutside(false);
            if (z) {
                progressDialog.setCancelable(true);
                progressDialog.setOnCancelListener(new C204259p4(activity, 1, this));
            } else {
                progressDialog.setCancelable(false);
            }
            progressDialog.show();
        }
    }

    public void Bqu(String str) {
        ((C69263Wi) this.A0Q.get()).A0P(str, 0);
    }

    public C196249aX(C116985rC r3, C116985rC r4, C183538qC r5, C183538qC r6, C183538qC r7, C183538qC r8, C183538qC r9, C183538qC r10, C183538qC r11, C183538qC r12, C183538qC r13, C183538qC r14, C183538qC r15, C183538qC r16, C183538qC r17, C183538qC r18, C183538qC r19, C183538qC r20, C183538qC r21, C183538qC r22, C183538qC r23, C183538qC r24, C183538qC r25, C183538qC r26, C183538qC r27, C183538qC r28, C183538qC r29, C183538qC r30, C183538qC r31, C183538qC r32, C183538qC r33, C183538qC r34, C183538qC r35, C183538qC r36, C183538qC r37, C183538qC r38, C183538qC r39, C183538qC r40, C183538qC r41, C183538qC r42) {
        this.A03 = new C193389Oh(r6, r32);
        this.A0W = r5;
        this.A04 = r7;
        this.A0C = r8;
        this.A0Q = r9;
        this.A0N = r10;
        this.A0R = r11;
        this.A0c = r12;
        this.A05 = r13;
        this.A0d = r14;
        this.A0D = r15;
        this.A0U = r16;
        this.A0Y = r17;
        this.A0T = r18;
        this.A0I = r19;
        this.A0K = r20;
        this.A0V = r21;
        this.A0S = r22;
        this.A06 = r23;
        this.A0L = r24;
        this.A0O = r25;
        this.A0M = r26;
        this.A0Z = r27;
        this.A07 = r28;
        this.A0G = r29;
        this.A0F = r30;
        this.A0X = r31;
        this.A0H = r33;
        this.A0J = r34;
        this.A0A = r41;
        this.A0E = r35;
        this.A0B = r36;
        this.A08 = r37;
        this.A0b = r38;
        this.A0P = r39;
        this.A0a = r40;
        this.A09 = r42;
        this.A02 = r3;
        this.A01 = r4;
    }

    public static int A00(C183538qC r0, int i) {
        return ((AnonymousClass9Qq) r0.get()).A00.A00(i).A01;
    }

    public static int A01(C183538qC r0, int i) {
        return ((C197759dp) r0.get()).A06.A00(i).A00;
    }

    public static int A02(C183538qC r3, int i, int i2) {
        r3.get();
        Integer valueOf = Integer.valueOf(i);
        if (valueOf == null) {
            return i2;
        }
        int intValue = valueOf.intValue();
        int i3 = 0;
        for (int i4 = 0; i4 < 32; i4++) {
            i3 |= ((intValue >> i4) & 1) << (31 - i4);
        }
        return i2 ^ i3;
    }

    public static long A03(C183538qC r2, int i, int i2) {
        r2.get();
        return ((long) i2) | (((long) i) << 32);
    }

    public static C197759dp A04(C183538qC r0) {
        return (C197759dp) r0.get();
    }

    public static final String A05(HashMap hashMap) {
        ArrayList A0J2 = AnonymousClass002.A0J(hashMap.keySet());
        try {
            JSONObject A1G = AnonymousClass0x9.A1G();
            Collections.sort(A0J2);
            for (int i = 0; i < A0J2.size(); i++) {
                A1G.put((String) A0J2.get(i), hashMap.get(A0J2.get(i)));
            }
            return A1G.toString();
        } catch (JSONException e) {
            Log.e("Failed to Convert Map to JSON object.", e);
            return null;
        }
    }

    public static final void A06(Activity activity, String str) {
        Intent A072 = C18320x8.A07();
        A072.setAction("android.intent.action.SEND");
        A072.putExtra("android.intent.extra.TEXT", str);
        A072.setType("text/plain");
        activity.startActivity(Intent.createChooser(A072, (CharSequence) null));
    }

    public final UserJid A07(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return AnonymousClass32Y.A0A(str);
            } catch (AnonymousClass24P e) {
                PhoneUserJid A002 = AnonymousClass32X.A00(str);
                ((C55682qk) this.A0N.get()).A0A("bloks/openchat - Jid missing suffix", true, e.getMessage());
                return A002;
            }
        } else {
            throw new AnonymousClass24P("Jid is Empty");
        }
    }

    public void B1Y(HashMap hashMap) {
        String A052 = A05(hashMap);
        if (!TextUtils.isEmpty(A052)) {
            ((C41172Jf) this.A0E.get()).A01.remove(A052);
        }
    }

    public void BGh(String str, HashMap hashMap) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("invalidatePreloadScreenV2() called with: appId = [");
        A0o.append(str);
        A0o.append("], params = [");
        A0o.append(hashMap);
        C18260x0.A1J(A0o, "]");
        ((C55742qq) this.A0C.get()).A04(((C59252wc) this.A0D.get()).A00(str, C18320x8.A0e("params", hashMap)), "PRELOAD");
    }

    public void Bg1(Activity activity, AnonymousClass49G r7) {
        AnonymousClass9N5 r4 = new AnonymousClass9N5(r7.B3p());
        try {
            C194709Ue A002 = ((AnonymousClass9V0) this.A0B.get()).A00(activity);
            C003203q r6 = (C003203q) activity;
            if (r4.A00.A04.get(35) != null) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("bottom_sheet_fragment_tag");
                AnonymousClass000.A1B(UUID.randomUUID(), A0o);
                String obj = A0o.toString();
                C626936e.A06(r4);
                BkBottomSheetContentFragment A003 = BkBottomSheetContentFragment.A00(r4, (C55742qq) A002.A00.get(), obj, false);
                BkBottomSheetContainerFragment bkBottomSheetContainerFragment = new BkBottomSheetContainerFragment();
                bkBottomSheetContainerFragment.A01 = AnonymousClass0x9.A0G(A003, obj);
                if (!bkBottomSheetContainerFragment.A19()) {
                    C08270df supportFragmentManager = r6.getSupportFragmentManager();
                    C626936e.A06(supportFragmentManager);
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("bottom_sheet_container_tag");
                    AnonymousClass000.A1B(UUID.randomUUID(), A0o2);
                    bkBottomSheetContainerFragment.A1O(supportFragmentManager, A0o2.toString());
                    C194709Ue.A01.push(bkBottomSheetContainerFragment);
                    return;
                }
                return;
            }
            throw new AnonymousClass9KM();
        } catch (AnonymousClass9KM e) {
            Log.e((Throwable) e);
            e.getMessage();
        }
    }

    public void BgC(Activity activity, String str) {
        try {
            UserJid A072 = A07(str);
            String A052 = AnonymousClass36P.A05(A072);
            if (A052 != null) {
                AnonymousClass3ZH A073 = ((C64773Ex) this.A0K.get()).A07(A072);
                if (A073 == null || !((C56972sr) this.A0R.get()).A0a(A072)) {
                    String replaceAll = A052.replaceAll("\\D", "");
                    String str2 = null;
                    if (replaceAll.length() < 5) {
                        Log.w("bkextentionsimpl/converttointlformat/too-short-no-cc");
                    } else {
                        Matcher matcher = Pattern.compile("^([17]|2[07]|3[0123469]|4[013456789]|5[12345678]|6[0123456]|8[1246]|9[0123458]|\\d{3})\\d*?(\\d{4,6})$").matcher(replaceAll);
                        if (matcher.find()) {
                            String group = matcher.group(1);
                            C626936e.A06(group);
                            String substring = replaceAll.substring(group.length());
                            C106175Xx r1 = (C106175Xx) this.A0M.get();
                            if (C107195ar.A01(r1, group, substring) == 1) {
                                int parseInt = Integer.parseInt(group);
                                try {
                                    substring = r1.A02(parseInt, substring.replaceAll("\\D", ""));
                                } catch (Exception e) {
                                    Log.w(AnonymousClass000.A0Y("bkextentionsimpl/converttointlformat/trim/error ", AnonymousClass001.A0o(), parseInt), e);
                                }
                                StringBuilder A0o = AnonymousClass001.A0o();
                                A0o.append("+");
                                str2 = AnonymousClass000.A0V(group, substring, A0o);
                            }
                        }
                    }
                    if (A073 != null || str2 == null) {
                        activity.startActivity(C627736r.A0l(activity, A072, (Integer) null, true, true));
                    } else {
                        ((AnonymousClass4FS) this.A0c.get()).BkM(new C201319js(activity, A072, this, str2));
                    }
                } else {
                    this.A05.get();
                    Intent A074 = C18320x8.A07();
                    A074.setClassName(activity.getPackageName(), "com.whatsapp.profile.ProfileInfoActivity");
                    activity.startActivity(A074);
                }
            } else {
                throw new AnonymousClass24P(AnonymousClass000.A0P(A072, "invalid jid ", AnonymousClass001.A0o()));
            }
        } catch (AnonymousClass24P e2) {
            ((C55682qk) this.A0N.get()).A0A("bloks/openContactInfo - ", true, e2.getMessage());
            ((C69263Wi) this.A0Q.get()).A0H(R.string.f11nameremoved, 0);
        }
    }

    public void Bhl(Activity activity, AnonymousClass49G r10, boolean z) {
        AnonymousClass9N5 r3 = new AnonymousClass9N5(r10.B3p());
        C194709Ue A002 = ((AnonymousClass9V0) this.A0B.get()).A00(activity);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("bottom_sheet_fragment_tag");
        AnonymousClass000.A1B(UUID.randomUUID(), A0o);
        String obj = A0o.toString();
        BkBottomSheetContentFragment A003 = BkBottomSheetContentFragment.A00(r3, (C55742qq) A002.A00.get(), obj, z);
        BkBottomSheetContainerFragment bkBottomSheetContainerFragment = (BkBottomSheetContainerFragment) C194709Ue.A01.peek();
        C08240dc r4 = new C08240dc(bkBottomSheetContainerFragment.A0T());
        if (z) {
            r4.A0I(obj);
        }
        r4.A02 = R.anim.f0nameremoved;
        r4.A03 = R.anim.f0nameremoved;
        r4.A05 = R.anim.f0nameremoved;
        r4.A06 = R.anim.f0nameremoved;
        r4.A0E(A003, obj, bkBottomSheetContainerFragment.A00.getId());
        r4.A01();
    }

    public void Bic(C41182Jg r7, HashMap hashMap) {
        String A052 = A05(hashMap);
        if (!TextUtils.isEmpty(A052)) {
            C41172Jf r4 = (C41172Jf) this.A0E.get();
            r4.A01.put(A052, new C52792m3(r7.A00, r7.A01, r4.A00));
        }
    }

    public void Bol(C009707r r5, C41182Jg r6, C41182Jg r7, C41182Jg r8, String str, String str2, String str3, String str4, String str5) {
        C19340zH A002 = AnonymousClass5V0.A00(r5);
        A002.A0h(str);
        A002.A0g(str2);
        A002.A0f(r5, C205049qL.A00(r6, 75), str3);
        if (str4 != null) {
            A002.A0e(r5, C205049qL.A00(r7, 73), str4);
        }
        if (str5 != null) {
            C205049qL A003 = C205049qL.A00(r8, 74);
            AnonymousClass0Uj r1 = A002.A00;
            C628536z r0 = A002.A01;
            r1.A0H(r0, str5);
            r0.A01.A0B(r5, A003);
        }
        C18280x3.A0q(A002);
    }

    public void Bs8(C41182Jg r8, C41182Jg r9, String str) {
        File file = new File(URI.create(str));
        C201639kT r5 = new C201639kT(r8, r9);
        AnonymousClass3LU r0 = (AnonymousClass3LU) this.A0A.get();
        C616131n.A02(r0.A04, new AvatarAutogenMediaUploadManagerImpl$uploadAutogenMedia$1(r0, file, (C84814Du) null, r5), r0.A05, (AnonymousClass20D) null, 2);
    }
}

package X;

import android.app.Activity;
import com.whatsapp.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.9Zy  reason: invalid class name and case insensitive filesystem */
public class C195899Zy implements C835348u {
    public final C835348u A00;
    public final AnonymousClass9VZ A01;
    public final C203529nt A02;

    public static Activity A00(C131266dJ r1) {
        return (Activity) r1.A00.A02.A00().get(R.id.bloks_host_activity);
    }

    public C195899Zy(C835348u r1, AnonymousClass9VZ r2, C203529nt r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public static HashMap A01(Map map) {
        String obj;
        HashMap A0t = AnonymousClass001.A0t();
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            boolean z = A0w.getValue() instanceof Number;
            Object key = A0w.getKey();
            if (z || A0w.getValue() != null) {
                obj = A0w.getValue().toString();
            } else {
                obj = null;
            }
            A0t.put(key, obj);
        }
        return A0t;
    }

    public final HashMap A02(Map map) {
        HashMap hashMap;
        HashMap A0t = AnonymousClass001.A0t();
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            Object key = A0w.getKey();
            String str = null;
            try {
                Map map2 = (Map) A0w.getValue();
                if (A0w.getValue() != null) {
                    hashMap = A02(map2);
                } else {
                    hashMap = null;
                }
                A0t.put(key, hashMap);
            } catch (ClassCastException unused) {
                if (A0w.getValue() != null) {
                    str = A0w.getValue().toString();
                }
                A0t.put(key, str);
            }
        }
        return A0t;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0270, code lost:
        r1 = (X.C202399lx) r3;
        r3.onBackPressed();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0276, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0278, code lost:
        ((java.util.AbstractMap) ((X.AnonymousClass98s) r1).A09.A02.peek()).putAll(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0287, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0288, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x028a, code lost:
        r5 = X.C157967jD.A01(r11, 0);
        r3 = (X.AnonymousClass98s) ((X.C202399lx) A00(r1));
        r4 = (androidx.fragment.app.DialogFragment) r3.getSupportFragmentManager().A0D("bloks-dialog");
        r3 = r3.A09;
        r1 = r3.A01;
        r2 = (X.C52792m3) r1.get("dialog");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02ae, code lost:
        if (r4 == null) goto L_0x02bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02b0, code lost:
        r4.A1K();
        X.AnonymousClass9VZ.A00(r1);
        r3.A02.pop();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02bb, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02bd, code lost:
        r2.A00 = true;
        r2.A00(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0055, code lost:
        if (r3 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02c3, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02c4, code lost:
        r4 = r11.A00;
        r8 = X.AnonymousClass001.A0n(r4, 0);
        r7 = (java.lang.Boolean) r4.get(1);
        r4 = r1.A00.A02;
        r6 = r2.A02;
        r5 = A00(r1);
        r4 = (android.app.ProgressDialog) r4.A08.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02e2, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02e8, code lost:
        if (r4.isShowing() == false) goto L_0x02ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02ea, code lost:
        r4.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02ed, code lost:
        r4.setMessage(r8);
        r4.setIndeterminate(true);
        r4.setCanceledOnTouchOutside(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02fb, code lost:
        if (r7.booleanValue() == false) goto L_0x030c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02fd, code lost:
        r4.setCancelable(true);
        r4.setOnCancelListener(new X.C204259p4(r5, 0, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0308, code lost:
        r4.show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x030b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x030c, code lost:
        r4.setCancelable(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005b, code lost:
        switch(r3.hashCode()) {
            case -891985903: goto L_0x006c;
            case 64711720: goto L_0x0079;
            case 97526364: goto L_0x008a;
            case 1958052158: goto L_0x009c;
            default: goto L_0x005e;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005e, code lost:
        android.util.Log.d(r6, X.AnonymousClass000.A0V("PAY: BloksActivity/getIntentParameter type not supported: ", r3, X.AnonymousClass001.A0o()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x04b0, code lost:
        if (r0 == false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x04b4, code lost:
        r2 = X.AnonymousClass001.A0o();
        r2.append("WaExtensions/Bloks function: [");
        r2.append(r7);
        r2.append("] not implemented on client");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04c7, code lost:
        r6 = r11.A00;
        r5 = X.AnonymousClass001.A0n(r6, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x04cd, code lost:
        if (r5 == null) goto L_0x04ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0072, code lost:
        if (r3.equals("string") == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x04d3, code lost:
        if (r5.length() == 0) goto L_0x04ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:?, code lost:
        r4 = java.lang.Long.parseLong(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x04da, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x04db, code lost:
        android.util.Log.d("Whatsapp", X.AnonymousClass000.A0V("NumberUtil/Invalid long value:", r5, X.AnonymousClass001.A0o()), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0078, code lost:
        return r4.getStringExtra(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x054d, code lost:
        r4 = java.lang.Double.valueOf(java.lang.Math.ceil(r2 / r0)).longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x055e, code lost:
        r0 = r11.A00;
        r4 = X.AnonymousClass001.A0n(r0, 0);
        r2 = (java.util.AbstractList) r0.get(1);
        r1 = new java.lang.String[r2.size()];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0574, code lost:
        if (r5 >= r2.size()) goto L_0x057f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0576, code lost:
        r1[r5] = r2.get(r5);
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0583, code lost:
        return java.text.MessageFormat.format(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x059a, code lost:
        return java.lang.Boolean.valueOf(((X.C203299nT) A00(r1)).BEy(X.C57102t5.A00(X.C157967jD.A01(r11, 0))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x059b, code lost:
        r2 = r11.A00;
        r0 = X.AnonymousClass6C9.A0k(r2, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x05b3, code lost:
        return ((X.C203299nT) A00(r1)).Bgo(X.AnonymousClass001.A0n(r2, 1), A01(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x05b4, code lost:
        r7 = r11.A00;
        r6 = X.AnonymousClass001.A0n(r7, 0);
        r4 = r7.size() - 1;
        r2 = new java.lang.String[r4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x05c1, code lost:
        if (r5 >= r4) goto L_0x05cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x05c3, code lost:
        r1 = r5 + 1;
        r2[r5] = r7.get(r1);
        r5 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x05d1, code lost:
        return java.text.MessageFormat.format(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x05d2, code lost:
        r0 = r11.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007f, code lost:
        if (r3.equals("boolean") == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x05ec, code lost:
        return java.lang.Boolean.valueOf(java.util.regex.Pattern.compile(X.AnonymousClass001.A0n(r0, 1)).matcher(X.AnonymousClass001.A0n(r0, 0)).matches());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x05f5, code lost:
        return java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x05f6, code lost:
        r5 = ((X.AnonymousClass9Bw) ((X.C203299nT) A00(r1))).A0L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0606, code lost:
        if (r5.A00 <= 0) goto L_0x0616;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0608, code lost:
        r2 = r5.A01.A0H() - r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0615, code lost:
        return java.lang.Long.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0616, code lost:
        r2 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0619, code lost:
        r2 = (X.C196149aN) r2.A02;
        r1 = X.C56972sr.A04(r2.A01);
        X.C626936e.A06(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x062c, code lost:
        return r2.A02.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x063b, code lost:
        return ((X.AnonymousClass9Bw) ((X.C203299nT) A00(r1))).A0L.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x063c, code lost:
        r2 = r11.A00;
        r4 = X.AnonymousClass6C9.A0k(r2, 0);
        r2 = X.C155787fV.A02(r2, 1);
        r7 = new X.C41182Jg();
        r7.A01 = r2;
        r7.A00 = r1;
        r2 = A00(r1);
        r6 = A01(r4);
        r5 = r6.remove("case");
        X.C626936e.A06(r5);
        r5 = (java.lang.String) r5;
        ((X.C203299nT) r2).Bgl(((X.AnonymousClass98s) ((X.C202399lx) r2)).A09.A01(r7.A00, r7.A01, r5), r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0676, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0677, code lost:
        r6 = r11.A00;
        r7 = X.AnonymousClass001.A0n(r6, 0);
        r5 = r6.get(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0683, code lost:
        if ((r5 instanceof java.lang.Boolean) == false) goto L_0x06c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0685, code lost:
        r10 = X.AnonymousClass001.A1Z(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0689, code lost:
        r5 = r6.get(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x068f, code lost:
        if ((r5 instanceof java.lang.Boolean) == false) goto L_0x06bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0089, code lost:
        return X.C1899693i.A0Z(r4.getBooleanExtra(r2, false) ? 1 : 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0691, code lost:
        r1 = X.AnonymousClass001.A1Z(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0695, code lost:
        if (r1 == 1) goto L_0x06ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0697, code lost:
        r11 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0698, code lost:
        if (r1 == 2) goto L_0x069b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x069a, code lost:
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x069b, code lost:
        r3 = X.AnonymousClass6C9.A0k(r6, 3);
        ((X.C196149aN) r2.A02).A07.BhD(X.AnonymousClass9LP.A00(r7, (java.util.ArrayList) r6.get(4), A01(r3), r10, r11, -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x06b9, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x06ba, code lost:
        r11 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x06bc, code lost:
        r1 = X.AnonymousClass001.A0K(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x06c1, code lost:
        r10 = X.AnonymousClass001.A0K(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x06c6, code lost:
        r6 = r11.A00;
        r4 = X.AnonymousClass6C9.A0k(r6, 0);
        r3 = X.C155787fV.A02(r6, 1);
        r8 = new X.C41182Jg();
        r8.A01 = r3;
        r8.A00 = r1;
        r2 = r2.A02;
        r1 = A00(r1);
        r6 = A01(r4);
        r4 = ((X.AnonymousClass98s) ((X.C202399lx) r1)).A09;
        r7 = ((X.C196149aN) r2).A06;
        r2 = r8.A00.A00.A02;
        r9 = r6.get("message");
        X.C626936e.A06(r9);
        r9 = (java.lang.String) r9;
        r3 = X.C18320x8.A0e("title", r6);
        r5 = new X.AnonymousClass0Uj((android.content.Context) r2.A06.get()).create();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0719, code lost:
        if (android.text.TextUtils.isEmpty(r3) != false) goto L_0x071e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x071b, code lost:
        r5.setTitle(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x071e, code lost:
        r1 = r5.A00;
        r1.A0Q = r9;
        r1 = r1.A0K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0724, code lost:
        if (r1 == null) goto L_0x0729;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0726, code lost:
        r1.setText(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0729, code lost:
        r5.setCanceledOnTouchOutside(false);
        r4 = r4.A01(r8.A00, r8.A01, "alert_dialog");
        r2 = X.C18320x8.A0e("button_info", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0742, code lost:
        if (android.text.TextUtils.isEmpty(r2) != false) goto L_0x0799;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0744, code lost:
        r7 = r2.split("\\|");
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0090, code lost:
        if (r3.equals("float") == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x074e, code lost:
        if (r6 > (r7.length - 2)) goto L_0x07a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0750, code lost:
        r3 = r7[r6 + 1];
        r2 = new X.C204379pG(r5, 0, r4);
        r8 = r7[r6];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0760, code lost:
        switch(r8.hashCode()) {
            case -518392103: goto L_0x076a;
            case 1820734407: goto L_0x077a;
            case 2113821835: goto L_0x078a;
            default: goto L_0x0763;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0763, code lost:
        r1 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0764, code lost:
        r5.A03(r1, r3, r2);
        r6 = r6 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0770, code lost:
        if (r8.equals("neutral_btn_label") == false) goto L_0x0763;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0772, code lost:
        r2 = new X.C204379pG(r5, 3, r4);
        r1 = -3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0780, code lost:
        if (r8.equals("negative_btn_label") == false) goto L_0x0763;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0782, code lost:
        r2 = new X.C204379pG(r5, 2, r4);
        r1 = -2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0790, code lost:
        if (r8.equals("positive_btn_label") == false) goto L_0x0763;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0792, code lost:
        r2 = new X.C204379pG(r5, 1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0799, code lost:
        r5.A03(-1, r7.A0B(com.whatsapp.R.string.f11nameremoved), new X.C204379pG(r5, 4, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x07a9, code lost:
        r5.setOnKeyListener(new X.C204909q7(r4, 0));
        r5.setOnDismissListener(new X.C204629pf(r4, 0));
        r5.show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x07bd, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x07be, code lost:
        A00(r1).startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(X.C157967jD.A01(r11, 0))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x07d4, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x07d5, code lost:
        r2 = r11.A00;
        r7 = X.AnonymousClass001.A0n(r2, 0);
        r3 = X.AnonymousClass6C9.A0k(r2, 1);
        r8 = new X.C41182Jg();
        r8.A01 = null;
        r8.A00 = r1;
        r6 = r1.A00.A02;
        r5 = A00(r1);
        r4 = A01(r3);
        X.AnonymousClass9KY.A00 = r7;
        X.AnonymousClass9KY.A01 = r4;
        r3 = (X.C202399lx) r5;
        r2 = r3.getIntent().getExtras();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009b, code lost:
        return java.lang.Float.toString(r4.getFloatExtra(r2, 0.0f));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0803, code lost:
        if (r2 == null) goto L_0x080a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0805, code lost:
        r2.putString("screen_name", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x080a, code lost:
        r3 = (X.AnonymousClass98s) r3;
        X.C196149aN.A00(r5, r3.A09, r8, r4);
        r3.A05 = com.whatsapp.bloks.ui.BloksDialogFragment.A00(r7, r4);
        r1 = X.AnonymousClass97S.A0L((X.C08270df) r6.A07.get(), r3);
        r1.A0I(r7);
        r1.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0829, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x082a, code lost:
        r2 = r11.A00;
        r6 = X.AnonymousClass001.A0n(r2, 0);
        r3 = X.AnonymousClass6C9.A0k(r2, 1);
        r2 = X.C155787fV.A02(r2, 2);
        r8 = new X.C41182Jg();
        r8.A01 = r2;
        r8.A00 = r1;
        r7 = r1.A00.A02;
        r5 = A00(r1);
        r4 = A01(r3);
        X.AnonymousClass9KY.A00 = r6;
        X.AnonymousClass9KY.A01 = r4;
        r3 = (X.C202399lx) r5;
        r2 = r3.getIntent().getExtras();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x085c, code lost:
        if (r2 == null) goto L_0x0863;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x085e, code lost:
        r2.putString("screen_name", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0863, code lost:
        r3 = (X.AnonymousClass98s) r3;
        X.C196149aN.A00(r5, r3.A09, r8, r4);
        r3.A05 = com.whatsapp.bloks.ui.BloksDialogFragment.A00(r6, r4);
        r1 = X.AnonymousClass97S.A0L((X.C08270df) r7.A07.get(), r3);
        r1.A0I(r6);
        r1.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0882, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0883, code lost:
        r4 = r11.A00;
        r8 = X.AnonymousClass001.A0n(r4, 0);
        r3 = X.AnonymousClass6C9.A0k(r4, 1);
        r6 = new X.C41182Jg();
        r6.A01 = null;
        r6.A00 = r1;
        r2.A02.BJb(A00(r1), r6, r1.A00.A02, r8, A01(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x08a7, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x08a8, code lost:
        ((X.C196149aN) r2.A02).A00.A0P(X.C157967jD.A01(r11, 0), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x08b5, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x08b6, code lost:
        r6 = r11.A00;
        r10 = X.AnonymousClass001.A0n(r6, 0);
        r5 = X.AnonymousClass6C9.A0k(r6, 1);
        r3 = X.C155787fV.A02(r6, 2);
        r8 = new X.C41182Jg();
        r8.A01 = r3;
        r8.A00 = r1;
        r2.A02.BJb(A00(r1), r8, r1.A00.A02, r10, A01(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x08de, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x08df, code lost:
        r2 = r11.A00;
        r6 = X.AnonymousClass000.A09(r2, 0);
        r2 = X.AnonymousClass6C9.A0k(r2, 1);
        r5 = A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x08ed, code lost:
        if (r2 == null) goto L_0x0909;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x08ef, code lost:
        r4 = A01(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x08f3, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x08f4, code lost:
        if (r6 == 0) goto L_0x08f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a2, code lost:
        if (r3.equals("integer") == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x08f6, code lost:
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x08f7, code lost:
        r2 = r5.getIntent();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x08fb, code lost:
        if (r4 == null) goto L_0x0902;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x08fd, code lost:
        r2.putExtra("finish_activity_result", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0902, code lost:
        r5.setResult(r3, r2);
        r5.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0908, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0909, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x090b, code lost:
        ((X.AnonymousClass9Bw) ((X.C203299nT) A00(r1))).A0L.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0918, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0919, code lost:
        ((X.AnonymousClass9Bw) ((X.C203299nT) A00(r1))).A0L.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0926, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0927, code lost:
        A00(r1).finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x092e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0939, code lost:
        return X.C18320x8.A0e(r3, (java.util.AbstractMap) r1.peek());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:?, code lost:
        r2.setPrimaryClip(android.content.ClipData.newPlainText(r3, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0941, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0942, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0943, code lost:
        com.whatsapp.util.Log.e("bkinterpreter/clipboard/", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ac, code lost:
        return java.lang.Integer.toString(r4.getIntExtra(r2, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0948, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0949, code lost:
        r2 = X.AnonymousClass001.A0o();
        r1 = "WaExtensions/GetChildNode Cannot find the child node [";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0950, code lost:
        r2 = X.AnonymousClass001.A0o();
        r1 = "WaExtensions/GetChildNode Cannot find the attribute [";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0956, code lost:
        X.AnonymousClass000.A17(r3, r1, "] on a null or empty parent node", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0959, code lost:
        r1 = r2.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x095e, code lost:
        r6 = java.util.Collections.unmodifiableList(r11.A00);
        r7 = new java.lang.StringBuilder("[Bloks logging] ");
        r2 = 0;
        r5 = X.AnonymousClass001.A0n(r6, 0);
        r7.append(X.AnonymousClass001.A0n(r6, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x097b, code lost:
        if (r6.get(2) == null) goto L_0x0989;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x097d, code lost:
        r7.append(" ");
        r7.append(r6.get(2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x098d, code lost:
        switch(r5.hashCode()) {
            case 97: goto L_0x09ab;
            case 100: goto L_0x09b2;
            case 101: goto L_0x09ba;
            case 105: goto L_0x09c2;
            case 118: goto L_0x09ca;
            case 119: goto L_0x09d2;
            default: goto L_0x0990;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ad, code lost:
        r3 = X.C157967jD.A01(r11, 0);
        r1 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0990, code lost:
        r2 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0991, code lost:
        r6 = "Whatsapp";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0993, code lost:
        switch(r2) {
            case 0: goto L_0x09a3;
            case 1: goto L_0x09a3;
            case 2: goto L_0x09a3;
            case 3: goto L_0x09dc;
            case 4: goto L_0x09e4;
            case 5: goto L_0x09ec;
            default: goto L_0x0996;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0996, code lost:
        android.util.Log.d(r6, X.AnonymousClass000.A0V("[Bloks logging] incorrect level: ", r5, X.AnonymousClass001.A0o()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x09a3, code lost:
        r1 = r7.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x09a7, code lost:
        android.util.Log.d(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x09aa, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x09ab, code lost:
        r1 = r5.equals("a");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x09b2, code lost:
        r1 = r5.equals("d");
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x09ba, code lost:
        r1 = r5.equals("e");
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b3, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x09c2, code lost:
        r1 = r5.equals("i");
        r2 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x09ca, code lost:
        r1 = r5.equals("v");
        r2 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x09d2, code lost:
        r1 = r5.equals("w");
        r2 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x09d9, code lost:
        if (r1 != false) goto L_0x0991;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x09dc, code lost:
        android.util.Log.i(r6, r7.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x09e3, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x09e4, code lost:
        android.util.Log.v(r6, r7.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x09eb, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x09ec, code lost:
        android.util.Log.w(r6, r7.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x09f3, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b5, code lost:
        r1 = r1.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x09f4, code lost:
        r2 = X.AnonymousClass001.A0m(r9.keySet().iterator());
        r10 = r5.A00(r3, r2, (java.util.Map) r9.get(r2));
        r11 = r5.A01;
        r14 = r11.A03();
        r9 = new X.AnonymousClass39V[4];
        r9[0] = X.AnonymousClass39V.A00();
        X.AnonymousClass39V.A05(androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r8, r9);
        X.AnonymousClass39V.A06(androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_ID, r14, r9);
        r11.A0D(new X.C205109qR(r6, r5, r3, 0), X.AnonymousClass36K.A0E(r10, "xmlns", r7, r9), r14, 204, ((long) r4) * 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0a3b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bb, code lost:
        if (r1.isEmpty() == false) goto L_0x092f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:?, code lost:
        return r2.B2m(r11, r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bd, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bf, code lost:
        r2 = r11.A00;
        r6 = (java.util.List) r2.get(0);
        r0 = r2.get(1);
        r7 = X.C155787fV.A02(r2, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d3, code lost:
        if (r6.size() == 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d5, code lost:
        r6 = r6.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
        r2 = r18;
        r11 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00dd, code lost:
        if (r6.hasNext() == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00df, code lost:
        r4 = r6.next();
        r2 = new X.C152057Xj();
        r2.A05(r0, 0);
        r2.A05(r4, 1);
        r0 = X.C157157hp.A00(r1, r2.A03(), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f7, code lost:
        r0 = r11.A00;
        r8 = (java.util.AbstractList) r0.get(0);
        r7 = X.C155787fV.A02(r0, 1);
        r0 = X.C18290x4.A0y(r8);
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x010c, code lost:
        if (r6 >= r8.size()) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010e, code lost:
        r4 = new X.C152057Xj();
        r4.A05(java.lang.Integer.valueOf(r6), 0);
        r4.A05(r8.get(r6), 1);
        r0.add(X.C157157hp.A00(r1, r4.A03(), r7));
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x012f, code lost:
        r3 = X.C157967jD.A01(r11, 0);
        r2 = (X.C196149aN) r2.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x013b, code lost:
        if (android.text.TextUtils.isEmpty(r3) == false) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x013d, code lost:
        com.whatsapp.util.Log.e("WaExtensions/evaluate/bk.action.io.clipboard.SetString: text cannot be null or empty");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0142, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002c, code lost:
        switch(r10) {
            case 0: goto L_0x05ed;
            case 1: goto L_0x0037;
            case 2: goto L_0x063c;
            case 3: goto L_0x00f7;
            case 4: goto L_0x0677;
            case 5: goto L_0x012f;
            case 6: goto L_0x04c7;
            case 7: goto L_0x06c6;
            case 8: goto L_0x07be;
            case 9: goto L_0x055e;
            case 10: goto L_0x014d;
            case 11: goto L_0x0584;
            case 12: goto L_0x07d5;
            case 13: goto L_0x090b;
            case 14: goto L_0x07be;
            case 15: goto L_0x082a;
            case 16: goto L_0x0162;
            case 17: goto L_0x0174;
            case 18: goto L_0x0883;
            case 19: goto L_0x05f6;
            case 20: goto L_0x0197;
            case 21: goto L_0x0919;
            case 22: goto L_0x00bf;
            case 23: goto L_0x0677;
            case 24: goto L_0x0208;
            case 25: goto L_0x0037;
            case 26: goto L_0x0619;
            case 27: goto L_0x08a8;
            case 28: goto L_0x021a;
            case 29: goto L_0x059b;
            case 30: goto L_0x0927;
            case 31: goto L_0x0038;
            case 32: goto L_0x00ad;
            case 33: goto L_0x0037;
            case 34: goto L_0x095e;
            case 35: goto L_0x062d;
            case 36: goto L_0x0260;
            case 37: goto L_0x05b4;
            case 38: goto L_0x0037;
            case 39: goto L_0x028a;
            case 40: goto L_0x02c4;
            case 41: goto L_0x05d2;
            case 42: goto L_0x08b6;
            case 43: goto L_0x08df;
            default: goto L_0x002f;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0143, code lost:
        r2 = r2.A04.A0C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0149, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x014d, code lost:
        r1 = r11.A00;
        r2 = X.AnonymousClass6C9.A0k(r1, 0);
        r3 = r1.get(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0157, code lost:
        if (r2 == null) goto L_0x0949;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x015d, code lost:
        if (r2.size() <= 0) goto L_0x0949;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x015f, code lost:
        r1 = "children";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0162, code lost:
        r1 = X.AnonymousClass6C9.A0k(r11.A00, 0);
        r2 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x016a, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x016c, code lost:
        r2.A02(A01(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002f, code lost:
        r2 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0173, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0174, code lost:
        r1 = r11.A00;
        r2 = X.AnonymousClass6C9.A0k(r1, 0);
        r3 = r1.get(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x017e, code lost:
        if (r2 == null) goto L_0x0950;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0184, code lost:
        if (r2.size() <= 0) goto L_0x0950;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0186, code lost:
        r1 = "properties";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0188, code lost:
        r1 = (java.util.Map) r2.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x018e, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0190, code lost:
        r1 = r1.get(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0194, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0031, code lost:
        if (r2 == null) goto L_0x04b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0196, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0197, code lost:
        r6 = r11.A00;
        r8 = X.AnonymousClass001.A0n(r6, 0);
        r7 = X.AnonymousClass001.A0n(r6, 1);
        r11 = X.AnonymousClass001.A0n(r6, 2);
        r4 = X.AnonymousClass6C9.A0k(r6, 3);
        r3 = X.C155787fV.A02(r6, 4);
        r6 = new X.C41182Jg();
        r6.A01 = r3;
        r6.A00 = r1;
        r5 = r2.A02;
        r10 = A00(r1);
        r9 = A02(r4);
        r5 = (X.C196149aN) r5;
        r10 = (X.C202399lx) r10;
        r4 = r6.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01c8, code lost:
        if (r4 == null) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01ca, code lost:
        r6 = ((X.AnonymousClass98s) r10).A09.A01(r6.A00, r4, "case");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01d7, code lost:
        r5 = r5.A03;
        r4 = java.lang.Integer.parseInt(r11);
        r10 = (X.AnonymousClass9Bw) r10;
        r2 = r10.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01e1, code lost:
        if (r2 != null) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01e3, code lost:
        r2 = new X.AnonymousClass9LW();
        r10.A06 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ea, code lost:
        r3 = new X.AnonymousClass9OA(r10.A05, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01f7, code lost:
        if (X.AnonymousClass9VP.A02.contains(r7) != false) goto L_0x09f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01f9, code lost:
        com.whatsapp.util.Log.e("Bloks: IQRequestHelper/sendIQRequest: Invalid XMLNS");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01fe, code lost:
        if (r6 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0200, code lost:
        r6.A00("on_failure");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0205, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0206, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0208, code lost:
        r1 = (android.app.Dialog) r1.A00.A02.A08.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0214, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0216, code lost:
        r1.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0219, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x021a, code lost:
        r4 = r11.A00;
        r2 = X.AnonymousClass001.A0n(r4, 0);
        r6 = X.AnonymousClass001.A0n(r4, 1);
        r5 = A00(r1);
        r3 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0245, code lost:
        if (r5.getApplicationContext().getPackageManager().queryIntentActivities(r3, 65536).size() <= 0) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        r0 = r11.A00;
        r2 = X.AnonymousClass001.A0n(r0, 0);
        r3 = X.AnonymousClass001.A0n(r0, 1);
        r4 = ((android.app.Activity) r1.A00.A02.A06.get()).getIntent();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0247, code lost:
        r5.startActivity(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x024a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x024b, code lost:
        if (r6 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0251, code lost:
        if (r6.isEmpty() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0253, code lost:
        r5.startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(r6)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x025f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0260, code lost:
        r2 = X.AnonymousClass6C9.A0k(r11.A00, 0);
        r3 = A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x026a, code lost:
        if (r2 == null) goto L_0x0288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x026c, code lost:
        r2 = A01(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0053, code lost:
        if (r2 == null) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object B2m(X.C157967jD r19, X.C146787Bp r20, X.C151147Tp r21) {
        /*
            r18 = this;
            r1 = r21
            X.6dJ r1 = (X.C131266dJ) r1
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "WaGlobalExtensions evaluate: action="
            r2.append(r0)
            r8 = r20
            java.lang.String r7 = r8.A00
            java.lang.String r0 = X.AnonymousClass000.A0X(r7, r2)
            java.lang.String r6 = ""
            android.util.Log.d(r6, r0)
            int r0 = r7.hashCode()
            r4 = 2
            r3 = 1
            r5 = 0
            switch(r0) {
                case -2117986441: goto L_0x0310;
                case -1747557034: goto L_0x0319;
                case -1551525849: goto L_0x0322;
                case -1483567756: goto L_0x032b;
                case -1242219886: goto L_0x0334;
                case -1182895194: goto L_0x033d;
                case -1030847255: goto L_0x0346;
                case -877110701: goto L_0x034f;
                case -809454050: goto L_0x0358;
                case -780036552: goto L_0x0362;
                case -746705348: goto L_0x036c;
                case -629460340: goto L_0x0376;
                case -606722934: goto L_0x0380;
                case -541608891: goto L_0x038a;
                case -531827055: goto L_0x0394;
                case -444732597: goto L_0x039e;
                case -384355952: goto L_0x03a8;
                case -363552265: goto L_0x03b2;
                case -347836657: goto L_0x03bc;
                case -161320099: goto L_0x03c6;
                case -131830477: goto L_0x03d0;
                case -78052800: goto L_0x03da;
                case 151157378: goto L_0x03e4;
                case 227600558: goto L_0x03ee;
                case 243158640: goto L_0x03f8;
                case 598814056: goto L_0x0402;
                case 610178701: goto L_0x040c;
                case 683144274: goto L_0x0416;
                case 710140428: goto L_0x0420;
                case 764653078: goto L_0x042a;
                case 878253942: goto L_0x0433;
                case 889592555: goto L_0x043c;
                case 902242951: goto L_0x0445;
                case 1002037470: goto L_0x044e;
                case 1073657643: goto L_0x0457;
                case 1093292105: goto L_0x0460;
                case 1172555497: goto L_0x0469;
                case 1281868444: goto L_0x0472;
                case 1293733961: goto L_0x047b;
                case 1323560766: goto L_0x0484;
                case 1643041589: goto L_0x048d;
                case 1856118462: goto L_0x0496;
                case 1866424912: goto L_0x049f;
                case 2094846105: goto L_0x04a8;
                default: goto L_0x0024;
            }
        L_0x0024:
            r10 = -1
        L_0x0025:
            java.lang.String r9 = "] on a null or empty parent node"
            r0 = 0
            r2 = r18
            r11 = r19
            switch(r10) {
                case 0: goto L_0x05ed;
                case 1: goto L_0x0037;
                case 2: goto L_0x063c;
                case 3: goto L_0x00f7;
                case 4: goto L_0x0677;
                case 5: goto L_0x012f;
                case 6: goto L_0x04c7;
                case 7: goto L_0x06c6;
                case 8: goto L_0x07be;
                case 9: goto L_0x055e;
                case 10: goto L_0x014d;
                case 11: goto L_0x0584;
                case 12: goto L_0x07d5;
                case 13: goto L_0x090b;
                case 14: goto L_0x07be;
                case 15: goto L_0x082a;
                case 16: goto L_0x0162;
                case 17: goto L_0x0174;
                case 18: goto L_0x0883;
                case 19: goto L_0x05f6;
                case 20: goto L_0x0197;
                case 21: goto L_0x0919;
                case 22: goto L_0x00bf;
                case 23: goto L_0x0677;
                case 24: goto L_0x0208;
                case 25: goto L_0x0037;
                case 26: goto L_0x0619;
                case 27: goto L_0x08a8;
                case 28: goto L_0x021a;
                case 29: goto L_0x059b;
                case 30: goto L_0x0927;
                case 31: goto L_0x0038;
                case 32: goto L_0x00ad;
                case 33: goto L_0x0037;
                case 34: goto L_0x095e;
                case 35: goto L_0x062d;
                case 36: goto L_0x0260;
                case 37: goto L_0x05b4;
                case 38: goto L_0x0037;
                case 39: goto L_0x028a;
                case 40: goto L_0x02c4;
                case 41: goto L_0x05d2;
                case 42: goto L_0x08b6;
                case 43: goto L_0x08df;
                default: goto L_0x002f;
            }
        L_0x002f:
            X.48u r2 = r2.A00
            if (r2 == 0) goto L_0x04b4
            java.lang.Object r0 = r2.B2m(r11, r8, r1)
        L_0x0037:
            return r0
        L_0x0038:
            java.util.List r0 = r11.A00
            java.lang.String r2 = X.AnonymousClass001.A0n(r0, r5)
            java.lang.String r3 = X.AnonymousClass001.A0n(r0, r3)
            X.7bI r0 = r1.A00
            X.2dA r0 = r0.A02
            java.lang.ref.WeakReference r0 = r0.A06
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            android.content.Intent r4 = r0.getIntent()
            r0 = 0
            if (r2 == 0) goto L_0x0037
            if (r3 == 0) goto L_0x0037
            int r1 = r3.hashCode()
            switch(r1) {
                case -891985903: goto L_0x006c;
                case 64711720: goto L_0x0079;
                case 97526364: goto L_0x008a;
                case 1958052158: goto L_0x009c;
                default: goto L_0x005e;
            }
        L_0x005e:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "PAY: BloksActivity/getIntentParameter type not supported: "
            java.lang.String r1 = X.AnonymousClass000.A0V(r1, r3, r2)
            android.util.Log.d(r6, r1)
            return r0
        L_0x006c:
            java.lang.String r1 = "string"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x005e
            java.lang.String r0 = r4.getStringExtra(r2)
            return r0
        L_0x0079:
            java.lang.String r1 = "boolean"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x005e
            boolean r0 = r4.getBooleanExtra(r2, r5)
            java.lang.String r0 = X.C1899693i.A0Z(r0)
            return r0
        L_0x008a:
            java.lang.String r1 = "float"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x005e
            r0 = 0
            float r0 = r4.getFloatExtra(r2, r0)
            java.lang.String r0 = java.lang.Float.toString(r0)
            return r0
        L_0x009c:
            java.lang.String r1 = "integer"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x005e
            int r0 = r4.getIntExtra(r2, r5)
            java.lang.String r0 = java.lang.Integer.toString(r0)
            return r0
        L_0x00ad:
            java.lang.String r3 = X.C157967jD.A01(r11, r5)
            X.9VZ r1 = r2.A01
            if (r1 == 0) goto L_0x0037
            java.util.Stack r1 = r1.A02
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x092f
            r0 = 0
            return r0
        L_0x00bf:
            java.util.List r2 = r11.A00
            java.lang.Object r6 = r2.get(r5)
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r0 = r2.get(r3)
            X.8DF r7 = X.C155787fV.A02(r2, r4)
            int r2 = r6.size()
            if (r2 == 0) goto L_0x0037
            java.util.Iterator r6 = r6.iterator()
        L_0x00d9:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0037
            java.lang.Object r4 = r6.next()
            X.7Xj r2 = new X.7Xj
            r2.<init>()
            r2.A05(r0, r5)
            r2.A05(r4, r3)
            X.7jD r0 = r2.A03()
            java.lang.Object r0 = X.C157157hp.A00(r1, r0, r7)
            goto L_0x00d9
        L_0x00f7:
            java.util.List r0 = r11.A00
            java.lang.Object r8 = r0.get(r5)
            java.util.AbstractList r8 = (java.util.AbstractList) r8
            X.8DF r7 = X.C155787fV.A02(r0, r3)
            java.util.ArrayList r0 = X.C18290x4.A0y(r8)
            r6 = 0
        L_0x0108:
            int r2 = r8.size()
            if (r6 >= r2) goto L_0x0037
            X.7Xj r4 = new X.7Xj
            r4.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r4.A05(r2, r5)
            java.lang.Object r2 = r8.get(r6)
            r4.A05(r2, r3)
            X.7jD r2 = r4.A03()
            java.lang.Object r2 = X.C157157hp.A00(r1, r2, r7)
            r0.add(r2)
            int r6 = r6 + 1
            goto L_0x0108
        L_0x012f:
            java.lang.String r3 = X.C157967jD.A01(r11, r5)
            X.9nt r2 = r2.A02
            X.9aN r2 = (X.C196149aN) r2
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto L_0x0143
            java.lang.String r1 = "WaExtensions/evaluate/bk.action.io.clipboard.SetString: text cannot be null or empty"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            return r0
        L_0x0143:
            X.33i r1 = r2.A04
            android.content.ClipboardManager r2 = r1.A0C()
            if (r2 == 0) goto L_0x0037
            goto L_0x093a
        L_0x014d:
            java.util.List r1 = r11.A00
            java.util.Map r2 = X.AnonymousClass6C9.A0k(r1, r5)
            java.lang.Object r3 = r1.get(r3)
            if (r2 == 0) goto L_0x0949
            int r1 = r2.size()
            if (r1 <= 0) goto L_0x0949
            java.lang.String r1 = "children"
            goto L_0x0188
        L_0x0162:
            java.util.List r1 = r11.A00
            java.util.Map r1 = X.AnonymousClass6C9.A0k(r1, r5)
            X.9VZ r2 = r2.A01
            if (r2 == 0) goto L_0x0037
            java.util.HashMap r1 = A01(r1)
            r2.A02(r1)
            return r0
        L_0x0174:
            java.util.List r1 = r11.A00
            java.util.Map r2 = X.AnonymousClass6C9.A0k(r1, r5)
            java.lang.Object r3 = r1.get(r3)
            if (r2 == 0) goto L_0x0950
            int r1 = r2.size()
            if (r1 <= 0) goto L_0x0950
            java.lang.String r1 = "properties"
        L_0x0188:
            java.lang.Object r1 = r2.get(r1)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L_0x0037
            java.lang.Object r1 = r1.get(r3)
            if (r1 == 0) goto L_0x0037
            return r1
        L_0x0197:
            java.util.List r6 = r11.A00
            java.lang.String r8 = X.AnonymousClass001.A0n(r6, r5)
            java.lang.String r7 = X.AnonymousClass001.A0n(r6, r3)
            java.lang.String r11 = X.AnonymousClass001.A0n(r6, r4)
            r3 = 3
            java.util.Map r4 = X.AnonymousClass6C9.A0k(r6, r3)
            r3 = 4
            X.8DF r3 = X.C155787fV.A02(r6, r3)
            X.2Jg r6 = new X.2Jg
            r6.<init>()
            r6.A01 = r3
            r6.A00 = r1
            X.9nt r5 = r2.A02
            android.app.Activity r10 = A00(r1)
            java.util.HashMap r9 = r2.A02(r4)
            X.9aN r5 = (X.C196149aN) r5
            X.9lx r10 = (X.C202399lx) r10
            X.48t r4 = r6.A01
            if (r4 == 0) goto L_0x0206
            r1 = r10
            X.98s r1 = (X.AnonymousClass98s) r1
            X.9VZ r3 = r1.A09
            X.6dJ r2 = r6.A00
            java.lang.String r1 = "case"
            X.2m3 r6 = r3.A01(r2, r4, r1)
        L_0x01d7:
            X.9VP r5 = r5.A03
            int r4 = java.lang.Integer.parseInt(r11)
            X.9Bw r10 = (X.AnonymousClass9Bw) r10
            X.9LW r2 = r10.A06
            if (r2 != 0) goto L_0x01ea
            X.9LW r2 = new X.9LW
            r2.<init>()
            r10.A06 = r2
        L_0x01ea:
            X.33S r1 = r10.A05
            X.9OA r3 = new X.9OA
            r3.<init>(r1, r2)
            java.util.List r1 = X.AnonymousClass9VP.A02
            boolean r1 = r1.contains(r7)
            if (r1 != 0) goto L_0x09f4
            java.lang.String r1 = "Bloks: IQRequestHelper/sendIQRequest: Invalid XMLNS"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            if (r6 == 0) goto L_0x0037
            java.lang.String r1 = "on_failure"
            r6.A00(r1)
            return r0
        L_0x0206:
            r6 = 0
            goto L_0x01d7
        L_0x0208:
            X.7bI r1 = r1.A00
            X.2dA r1 = r1.A02
            java.lang.ref.WeakReference r1 = r1.A08
            java.lang.Object r1 = r1.get()
            android.app.Dialog r1 = (android.app.Dialog) r1
            if (r1 == 0) goto L_0x0037
            r1.dismiss()
            return r0
        L_0x021a:
            java.util.List r4 = r11.A00
            java.lang.String r2 = X.AnonymousClass001.A0n(r4, r5)
            java.lang.String r6 = X.AnonymousClass001.A0n(r4, r3)
            android.app.Activity r5 = A00(r1)
            android.net.Uri r1 = android.net.Uri.parse(r2)
            java.lang.String r4 = "android.intent.action.VIEW"
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r4, r1)
            android.content.Context r1 = r5.getApplicationContext()
            android.content.pm.PackageManager r2 = r1.getPackageManager()
            r1 = 65536(0x10000, float:9.18355E-41)
            java.util.List r1 = r2.queryIntentActivities(r3, r1)
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x024b
            r5.startActivity(r3)
            return r0
        L_0x024b:
            if (r6 == 0) goto L_0x0037
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L_0x0037
            android.net.Uri r2 = android.net.Uri.parse(r6)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r4, r2)
            r5.startActivity(r1)
            return r0
        L_0x0260:
            java.util.List r2 = r11.A00
            java.util.Map r2 = X.AnonymousClass6C9.A0k(r2, r5)
            android.app.Activity r3 = A00(r1)
            if (r2 == 0) goto L_0x0288
            java.util.HashMap r2 = A01(r2)
        L_0x0270:
            r1 = r3
            X.9lx r1 = (X.C202399lx) r1
            r3.onBackPressed()
            if (r2 == 0) goto L_0x0037
            X.98s r1 = (X.AnonymousClass98s) r1
            X.9VZ r1 = r1.A09
            java.util.Stack r1 = r1.A02
            java.lang.Object r1 = r1.peek()
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            r1.putAll(r2)
            return r0
        L_0x0288:
            r2 = r0
            goto L_0x0270
        L_0x028a:
            java.lang.String r5 = X.C157967jD.A01(r11, r5)
            android.app.Activity r3 = A00(r1)
            X.9lx r3 = (X.C202399lx) r3
            X.98s r3 = (X.AnonymousClass98s) r3
            X.0df r2 = r3.getSupportFragmentManager()
            java.lang.String r1 = "bloks-dialog"
            X.0eF r4 = r2.A0D(r1)
            androidx.fragment.app.DialogFragment r4 = (androidx.fragment.app.DialogFragment) r4
            X.9VZ r3 = r3.A09
            java.lang.String r2 = "dialog"
            java.util.HashMap r1 = r3.A01
            java.lang.Object r2 = r1.get(r2)
            X.2m3 r2 = (X.C52792m3) r2
            if (r4 == 0) goto L_0x02bb
            r4.A1K()
            X.AnonymousClass9VZ.A00(r1)
            java.util.Stack r1 = r3.A02
            r1.pop()
        L_0x02bb:
            if (r2 == 0) goto L_0x0037
            r1 = 1
            r2.A00 = r1
            r2.A00(r5)
            return r0
        L_0x02c4:
            java.util.List r4 = r11.A00
            java.lang.String r8 = X.AnonymousClass001.A0n(r4, r5)
            java.lang.Object r7 = r4.get(r3)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            X.7bI r4 = r1.A00
            X.2dA r4 = r4.A02
            X.9nt r6 = r2.A02
            android.app.Activity r5 = A00(r1)
            java.lang.ref.WeakReference r1 = r4.A08
            java.lang.Object r4 = r1.get()
            android.app.ProgressDialog r4 = (android.app.ProgressDialog) r4
            if (r4 == 0) goto L_0x0037
            boolean r1 = r4.isShowing()
            if (r1 == 0) goto L_0x02ed
            r4.dismiss()
        L_0x02ed:
            r4.setMessage(r8)
            r4.setIndeterminate(r3)
            r2 = 0
            r4.setCanceledOnTouchOutside(r2)
            boolean r1 = r7.booleanValue()
            if (r1 == 0) goto L_0x030c
            r4.setCancelable(r3)
            X.9p4 r1 = new X.9p4
            r1.<init>(r5, r2, r6)
            r4.setOnCancelListener(r1)
        L_0x0308:
            r4.show()
            return r0
        L_0x030c:
            r4.setCancelable(r2)
            goto L_0x0308
        L_0x0310:
            java.lang.String r0 = "bk.action.io.CurrentTimeMillis"
            boolean r0 = r7.equals(r0)
            r10 = 0
            goto L_0x04b0
        L_0x0319:
            java.lang.String r0 = "wa.action.perf.TrackPerformance"
            boolean r0 = r7.equals(r0)
            r10 = 1
            goto L_0x04b0
        L_0x0322:
            java.lang.String r0 = "wa.action.AsyncRequest"
            boolean r0 = r7.equals(r0)
            r10 = 2
            goto L_0x04b0
        L_0x032b:
            java.lang.String r0 = "bk.action.array.Map"
            boolean r0 = r7.equals(r0)
            r10 = 3
            goto L_0x04b0
        L_0x0334:
            java.lang.String r0 = "wa.action.SendFieldStat"
            boolean r0 = r7.equals(r0)
            r10 = 4
            goto L_0x04b0
        L_0x033d:
            java.lang.String r0 = "bk.action.io.clipboard.SetString"
            boolean r0 = r7.equals(r0)
            r10 = 5
            goto L_0x04b0
        L_0x0346:
            java.lang.String r0 = "wa.action.TimeInFuture"
            boolean r0 = r7.equals(r0)
            r10 = 6
            goto L_0x04b0
        L_0x034f:
            java.lang.String r0 = "wa.action.ShowAlertDialog"
            boolean r0 = r7.equals(r0)
            r10 = 7
            goto L_0x04b0
        L_0x0358:
            java.lang.String r0 = "bk.action.navigation.OpenUrl"
            boolean r0 = r7.equals(r0)
            r10 = 8
            goto L_0x04b0
        L_0x0362:
            java.lang.String r0 = "wa.action.FormatStringV2"
            boolean r0 = r7.equals(r0)
            r10 = 9
            goto L_0x04b0
        L_0x036c:
            java.lang.String r0 = "wa.action.GetChildNode"
            boolean r0 = r7.equals(r0)
            r10 = 10
            goto L_0x04b0
        L_0x0376:
            java.lang.String r0 = "wa.action.HandleError"
            boolean r0 = r7.equals(r0)
            r10 = 11
            goto L_0x04b0
        L_0x0380:
            java.lang.String r0 = "bk.action.bloks.OpenScreen"
            boolean r0 = r7.equals(r0)
            r10 = 12
            goto L_0x04b0
        L_0x038a:
            java.lang.String r0 = "wa.action.StartFieldStatTimer"
            boolean r0 = r7.equals(r0)
            r10 = 13
            goto L_0x04b0
        L_0x0394:
            java.lang.String r0 = "wa.action.OpenUrl"
            boolean r0 = r7.equals(r0)
            r10 = 14
            goto L_0x04b0
        L_0x039e:
            java.lang.String r0 = "wa.action.bloks.OpenScreenWithBackpress"
            boolean r0 = r7.equals(r0)
            r10 = 15
            goto L_0x04b0
        L_0x03a8:
            java.lang.String r0 = "wa.action.SaveScreenParam"
            boolean r0 = r7.equals(r0)
            r10 = 16
            goto L_0x04b0
        L_0x03b2:
            java.lang.String r0 = "wa.action.GetAttributeValue"
            boolean r0 = r7.equals(r0)
            r10 = 17
            goto L_0x04b0
        L_0x03bc:
            java.lang.String r0 = "bk.action.bloks.LaunchDialog"
            boolean r0 = r7.equals(r0)
            r10 = 18
            goto L_0x04b0
        L_0x03c6:
            java.lang.String r0 = "wa.action.GetFieldStatElapsedTime"
            boolean r0 = r7.equals(r0)
            r10 = 19
            goto L_0x04b0
        L_0x03d0:
            java.lang.String r0 = "wa.action.IQRequest"
            boolean r0 = r7.equals(r0)
            r10 = 20
            goto L_0x04b0
        L_0x03da:
            java.lang.String r0 = "wa.action.ResetFieldStats"
            boolean r0 = r7.equals(r0)
            r10 = 21
            goto L_0x04b0
        L_0x03e4:
            java.lang.String r0 = "wa.action.array.Foldl"
            boolean r0 = r7.equals(r0)
            r10 = 22
            goto L_0x04b0
        L_0x03ee:
            java.lang.String r0 = "wa.action.SendFieldStatV2"
            boolean r0 = r7.equals(r0)
            r10 = 23
            goto L_0x04b0
        L_0x03f8:
            java.lang.String r0 = "wa.action.DismissProgressBar"
            boolean r0 = r7.equals(r0)
            r10 = 24
            goto L_0x04b0
        L_0x0402:
            java.lang.String r0 = "wa.action.navigation.OpenChat"
            boolean r0 = r7.equals(r0)
            r10 = 25
            goto L_0x04b0
        L_0x040c:
            java.lang.String r0 = "bk.action.session_store.Get"
            boolean r0 = r7.equals(r0)
            r10 = 26
            goto L_0x04b0
        L_0x0416:
            java.lang.String r0 = "bk.action.io.Toast"
            boolean r0 = r7.equals(r0)
            r10 = 27
            goto L_0x04b0
        L_0x0420:
            java.lang.String r0 = "bk.action.DeeplinkToOtherAppOrDirectToAppStore"
            boolean r0 = r7.equals(r0)
            r10 = 28
            goto L_0x04b0
        L_0x042a:
            java.lang.String r0 = "wa.action.GetProcessedData"
            boolean r0 = r7.equals(r0)
            r10 = 29
            goto L_0x04b0
        L_0x0433:
            java.lang.String r0 = "wa.action.FinishActivity"
            boolean r0 = r7.equals(r0)
            r10 = 30
            goto L_0x04b0
        L_0x043c:
            java.lang.String r0 = "wa.action.GetIntentParameter"
            boolean r0 = r7.equals(r0)
            r10 = 31
            goto L_0x04b0
        L_0x0445:
            java.lang.String r0 = "wa.action.LoadScreenParam"
            boolean r0 = r7.equals(r0)
            r10 = 32
            goto L_0x04b0
        L_0x044e:
            java.lang.String r0 = "wa.action.navigation.OpenContactInfo"
            boolean r0 = r7.equals(r0)
            r10 = 33
            goto L_0x04b0
        L_0x0457:
            java.lang.String r0 = "wa.action.Logging"
            boolean r0 = r7.equals(r0)
            r10 = 34
            goto L_0x04b0
        L_0x0460:
            java.lang.String r0 = "wa.action.GetFieldStatEventId"
            boolean r0 = r7.equals(r0)
            r10 = 35
            goto L_0x04b0
        L_0x0469:
            java.lang.String r0 = "wa.action.PopScreen"
            boolean r0 = r7.equals(r0)
            r10 = 36
            goto L_0x04b0
        L_0x0472:
            java.lang.String r0 = "wa.action.FormatString"
            boolean r0 = r7.equals(r0)
            r10 = 37
            goto L_0x04b0
        L_0x047b:
            java.lang.String r0 = "bk.action.io.DebugToast"
            boolean r0 = r7.equals(r0)
            r10 = 38
            goto L_0x04b0
        L_0x0484:
            java.lang.String r0 = "wa.action.DismissDialog"
            boolean r0 = r7.equals(r0)
            r10 = 39
            goto L_0x04b0
        L_0x048d:
            java.lang.String r0 = "wa.action.ShowProgressBar"
            boolean r0 = r7.equals(r0)
            r10 = 40
            goto L_0x04b0
        L_0x0496:
            java.lang.String r0 = "bk.action.string.MatchesRegex"
            boolean r0 = r7.equals(r0)
            r10 = 41
            goto L_0x04b0
        L_0x049f:
            java.lang.String r0 = "wa.action.bloks.LaunchDialog"
            boolean r0 = r7.equals(r0)
            r10 = 42
            goto L_0x04b0
        L_0x04a8:
            java.lang.String r0 = "wa.action.FinishActivityWithResult"
            boolean r0 = r7.equals(r0)
            r10 = 43
        L_0x04b0:
            if (r0 != 0) goto L_0x0025
            goto L_0x0024
        L_0x04b4:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "WaExtensions/Bloks function: ["
            r2.append(r1)
            r2.append(r7)
            java.lang.String r1 = "] not implemented on client"
            r2.append(r1)
            goto L_0x0959
        L_0x04c7:
            java.util.List r6 = r11.A00
            java.lang.String r5 = X.AnonymousClass001.A0n(r6, r5)
            if (r5 == 0) goto L_0x04ea
            int r0 = r5.length()
            if (r0 == 0) goto L_0x04ea
            long r4 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x04da }
            goto L_0x04ec
        L_0x04da:
            r4 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "NumberUtil/Invalid long value:"
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r5, r1)
            java.lang.String r0 = "Whatsapp"
            android.util.Log.d(r0, r1, r4)
        L_0x04ea:
            r4 = 0
        L_0x04ec:
            r0 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r0
            java.lang.String r3 = X.AnonymousClass001.A0n(r6, r3)
            X.9nt r0 = r2.A02
            X.9aN r0 = (X.C196149aN) r0
            X.2sH r0 = r0.A05
            long r0 = r0.A0H()
            long r4 = r4 - r0
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x055b
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            int r0 = r3.hashCode()
            switch(r0) {
                case -1074026988: goto L_0x0518;
                case -906279820: goto L_0x052a;
                case 3208676: goto L_0x053c;
                default: goto L_0x050f;
            }
        L_0x050f:
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x0518:
            java.lang.String r0 = "minute"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x050f
            double r2 = r1.doubleValue()
            r0 = 4678479150791524352(0x40ed4c0000000000, double:60000.0)
            goto L_0x054d
        L_0x052a:
            java.lang.String r0 = "second"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x050f
            double r2 = r1.doubleValue()
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            goto L_0x054d
        L_0x053c:
            java.lang.String r0 = "hour"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x050f
            double r2 = r1.doubleValue()
            r0 = 4704985352480227328(0x414b774000000000, double:3600000.0)
        L_0x054d:
            double r2 = r2 / r0
            double r0 = java.lang.Math.ceil(r2)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            long r4 = r0.longValue()
            goto L_0x050f
        L_0x055b:
            r4 = -1
            goto L_0x050f
        L_0x055e:
            java.util.List r0 = r11.A00
            java.lang.String r4 = X.AnonymousClass001.A0n(r0, r5)
            java.lang.Object r2 = r0.get(r3)
            java.util.AbstractList r2 = (java.util.AbstractList) r2
            int r0 = r2.size()
            java.lang.String[] r1 = new java.lang.String[r0]
        L_0x0570:
            int r0 = r2.size()
            if (r5 >= r0) goto L_0x057f
            java.lang.Object r0 = r2.get(r5)
            r1[r5] = r0
            int r5 = r5 + 1
            goto L_0x0570
        L_0x057f:
            java.lang.String r0 = java.text.MessageFormat.format(r4, r1)
            return r0
        L_0x0584:
            java.lang.String r0 = X.C157967jD.A01(r11, r5)
            int r2 = X.C57102t5.A00(r0)
            android.app.Activity r0 = A00(r1)
            X.9nT r0 = (X.C203299nT) r0
            boolean r0 = r0.BEy(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x059b:
            java.util.List r2 = r11.A00
            java.util.Map r0 = X.AnonymousClass6C9.A0k(r2, r5)
            java.lang.String r2 = X.AnonymousClass001.A0n(r2, r3)
            android.app.Activity r1 = A00(r1)
            java.util.HashMap r0 = A01(r0)
            X.9nT r1 = (X.C203299nT) r1
            java.lang.String r0 = r1.Bgo(r2, r0)
            return r0
        L_0x05b4:
            java.util.List r7 = r11.A00
            java.lang.String r6 = X.AnonymousClass001.A0n(r7, r5)
            int r4 = r7.size()
            int r4 = r4 - r3
            java.lang.String[] r2 = new java.lang.String[r4]
        L_0x05c1:
            if (r5 >= r4) goto L_0x05cd
            int r1 = r5 + 1
            java.lang.Object r0 = r7.get(r1)
            r2[r5] = r0
            r5 = r1
            goto L_0x05c1
        L_0x05cd:
            java.lang.String r0 = java.text.MessageFormat.format(r6, r2)
            return r0
        L_0x05d2:
            java.util.List r0 = r11.A00
            java.lang.String r1 = X.AnonymousClass001.A0n(r0, r5)
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r3)
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r0 = r0.matches()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x05ed:
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L_0x05f6:
            android.app.Activity r0 = A00(r1)
            X.9nT r0 = (X.C203299nT) r0
            X.9Bw r0 = (X.AnonymousClass9Bw) r0
            X.9TD r5 = r0.A0L
            long r3 = r5.A00
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0616
            X.2sH r0 = r5.A01
            long r2 = r0.A0H()
            long r0 = r5.A00
            long r2 = r2 - r0
        L_0x0611:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            return r0
        L_0x0616:
            r2 = -1
            goto L_0x0611
        L_0x0619:
            X.9nt r2 = r2.A02
            X.9aN r2 = (X.C196149aN) r2
            X.2sr r0 = r2.A01
            com.whatsapp.jid.PhoneUserJid r1 = X.C56972sr.A04(r0)
            X.C626936e.A06(r1)
            X.9Qw r0 = r2.A02
            java.util.Map r0 = r0.A00(r1)
            return r0
        L_0x062d:
            android.app.Activity r0 = A00(r1)
            X.9nT r0 = (X.C203299nT) r0
            X.9Bw r0 = (X.AnonymousClass9Bw) r0
            X.9TD r0 = r0.A0L
            java.lang.String r0 = r0.A00()
            return r0
        L_0x063c:
            java.util.List r2 = r11.A00
            java.util.Map r4 = X.AnonymousClass6C9.A0k(r2, r5)
            X.8DF r2 = X.C155787fV.A02(r2, r3)
            X.2Jg r7 = new X.2Jg
            r7.<init>()
            r7.A01 = r2
            r7.A00 = r1
            android.app.Activity r2 = A00(r1)
            java.util.HashMap r6 = A01(r4)
            java.lang.String r1 = "case"
            java.lang.Object r5 = r6.remove(r1)
            X.C626936e.A06(r5)
            java.lang.String r5 = (java.lang.String) r5
            r4 = r2
            X.9nT r4 = (X.C203299nT) r4
            X.9lx r2 = (X.C202399lx) r2
            X.98s r2 = (X.AnonymousClass98s) r2
            X.9VZ r3 = r2.A09
            X.6dJ r2 = r7.A00
            X.48t r1 = r7.A01
            X.2m3 r1 = r3.A01(r2, r1, r5)
            r4.Bgl(r1, r5, r6)
            return r0
        L_0x0677:
            java.util.List r6 = r11.A00
            java.lang.String r7 = X.AnonymousClass001.A0n(r6, r5)
            java.lang.Object r5 = r6.get(r3)
            boolean r1 = r5 instanceof java.lang.Boolean
            if (r1 == 0) goto L_0x06c1
            boolean r10 = X.AnonymousClass001.A1Z(r5)
        L_0x0689:
            java.lang.Object r5 = r6.get(r4)
            boolean r1 = r5 instanceof java.lang.Boolean
            if (r1 == 0) goto L_0x06bc
            boolean r1 = X.AnonymousClass001.A1Z(r5)
        L_0x0695:
            if (r1 == r3) goto L_0x06ba
            r11 = 2
            if (r1 == r4) goto L_0x069b
            r11 = 0
        L_0x069b:
            r1 = 3
            java.util.Map r3 = X.AnonymousClass6C9.A0k(r6, r1)
            r1 = 4
            java.lang.Object r8 = r6.get(r1)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            X.9nt r1 = r2.A02
            java.util.HashMap r9 = A01(r3)
            X.9aN r1 = (X.C196149aN) r1
            r12 = -1
            X.99V r2 = X.AnonymousClass9LP.A00(r7, r8, r9, r10, r11, r12)
            X.4FV r1 = r1.A07
            r1.BhD(r2)
            return r0
        L_0x06ba:
            r11 = 1
            goto L_0x069b
        L_0x06bc:
            int r1 = X.AnonymousClass001.A0K(r5)
            goto L_0x0695
        L_0x06c1:
            int r10 = X.AnonymousClass001.A0K(r5)
            goto L_0x0689
        L_0x06c6:
            java.util.List r6 = r11.A00
            java.util.Map r4 = X.AnonymousClass6C9.A0k(r6, r5)
            X.8DF r3 = X.C155787fV.A02(r6, r3)
            X.2Jg r8 = new X.2Jg
            r8.<init>()
            r8.A01 = r3
            r8.A00 = r1
            X.9nt r2 = r2.A02
            android.app.Activity r1 = A00(r1)
            java.util.HashMap r6 = A01(r4)
            X.9aN r2 = (X.C196149aN) r2
            X.9lx r1 = (X.C202399lx) r1
            X.98s r1 = (X.AnonymousClass98s) r1
            X.9VZ r4 = r1.A09
            X.33j r7 = r2.A06
            X.6dJ r1 = r8.A00
            X.7bI r1 = r1.A00
            X.2dA r2 = r1.A02
            java.lang.String r1 = "message"
            java.lang.Object r9 = r6.get(r1)
            X.C626936e.A06(r9)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r1 = "title"
            java.lang.String r3 = X.C18320x8.A0e(r1, r6)
            java.lang.ref.WeakReference r1 = r2.A06
            java.lang.Object r2 = r1.get()
            android.content.Context r2 = (android.content.Context) r2
            X.0Uj r1 = new X.0Uj
            r1.<init>(r2)
            X.043 r5 = r1.create()
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L_0x071e
            r5.setTitle(r3)
        L_0x071e:
            X.0Wq r1 = r5.A00
            r1.A0Q = r9
            android.widget.TextView r1 = r1.A0K
            if (r1 == 0) goto L_0x0729
            r1.setText(r9)
        L_0x0729:
            r1 = 0
            r5.setCanceledOnTouchOutside(r1)
            X.6dJ r3 = r8.A00
            X.48t r2 = r8.A01
            java.lang.String r1 = "alert_dialog"
            X.2m3 r4 = r4.A01(r3, r2, r1)
            java.lang.String r1 = "button_info"
            java.lang.String r2 = X.C18320x8.A0e(r1, r6)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            r6 = -1
            if (r1 != 0) goto L_0x0799
            java.lang.String r1 = "\\|"
            java.lang.String[] r7 = r2.split(r1)
            r6 = 0
        L_0x074b:
            int r2 = r7.length
            r1 = 2
            int r2 = r2 - r1
            if (r6 > r2) goto L_0x07a9
            int r1 = r6 + 1
            r3 = r7[r1]
            r1 = 0
            X.9pG r2 = new X.9pG
            r2.<init>(r5, r1, r4)
            r8 = r7[r6]
            int r1 = r8.hashCode()
            switch(r1) {
                case -518392103: goto L_0x076a;
                case 1820734407: goto L_0x077a;
                case 2113821835: goto L_0x078a;
                default: goto L_0x0763;
            }
        L_0x0763:
            r1 = -1
        L_0x0764:
            r5.A03(r1, r3, r2)
            int r6 = r6 + 2
            goto L_0x074b
        L_0x076a:
            java.lang.String r1 = "neutral_btn_label"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L_0x0763
            r1 = 3
            X.9pG r2 = new X.9pG
            r2.<init>(r5, r1, r4)
            r1 = -3
            goto L_0x0764
        L_0x077a:
            java.lang.String r1 = "negative_btn_label"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L_0x0763
            r1 = 2
            X.9pG r2 = new X.9pG
            r2.<init>(r5, r1, r4)
            r1 = -2
            goto L_0x0764
        L_0x078a:
            java.lang.String r1 = "positive_btn_label"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L_0x0763
            r1 = 1
            X.9pG r2 = new X.9pG
            r2.<init>(r5, r1, r4)
            goto L_0x0763
        L_0x0799:
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            java.lang.String r3 = r7.A0B(r1)
            r2 = 4
            X.9pG r1 = new X.9pG
            r1.<init>(r5, r2, r4)
            r5.A03(r6, r3, r1)
        L_0x07a9:
            r2 = 0
            X.9q7 r1 = new X.9q7
            r1.<init>(r4, r2)
            r5.setOnKeyListener(r1)
            X.9pf r1 = new X.9pf
            r1.<init>(r4, r2)
            r5.setOnDismissListener(r1)
            r5.show()
            return r0
        L_0x07be:
            java.lang.String r2 = X.C157967jD.A01(r11, r5)
            android.app.Activity r4 = A00(r1)
            java.lang.String r3 = "android.intent.action.VIEW"
            android.net.Uri r2 = android.net.Uri.parse(r2)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r3, r2)
            r4.startActivity(r1)
            return r0
        L_0x07d5:
            java.util.List r2 = r11.A00
            java.lang.String r7 = X.AnonymousClass001.A0n(r2, r5)
            java.util.Map r3 = X.AnonymousClass6C9.A0k(r2, r3)
            X.2Jg r8 = new X.2Jg
            r8.<init>()
            r8.A01 = r0
            r8.A00 = r1
            X.7bI r2 = r1.A00
            X.2dA r6 = r2.A02
            android.app.Activity r5 = A00(r1)
            java.util.HashMap r4 = A01(r3)
            X.AnonymousClass9KY.A00 = r7
            X.AnonymousClass9KY.A01 = r4
            r3 = r5
            X.9lx r3 = (X.C202399lx) r3
            android.content.Intent r1 = r3.getIntent()
            android.os.Bundle r2 = r1.getExtras()
            if (r2 == 0) goto L_0x080a
            java.lang.String r1 = "screen_name"
            r2.putString(r1, r7)
        L_0x080a:
            X.98s r3 = (X.AnonymousClass98s) r3
            X.9VZ r1 = r3.A09
            X.C196149aN.A00(r5, r1, r8, r4)
            com.whatsapp.bloks.ui.BloksDialogFragment r1 = com.whatsapp.bloks.ui.BloksDialogFragment.A00(r7, r4)
            r3.A05 = r1
            java.lang.ref.WeakReference r1 = r6.A07
            java.lang.Object r1 = r1.get()
            X.0df r1 = (X.C08270df) r1
            X.0dc r1 = X.AnonymousClass97S.A0L(r1, r3)
            r1.A0I(r7)
            r1.A01()
            return r0
        L_0x082a:
            java.util.List r2 = r11.A00
            java.lang.String r6 = X.AnonymousClass001.A0n(r2, r5)
            java.util.Map r3 = X.AnonymousClass6C9.A0k(r2, r3)
            X.8DF r2 = X.C155787fV.A02(r2, r4)
            X.2Jg r8 = new X.2Jg
            r8.<init>()
            r8.A01 = r2
            r8.A00 = r1
            X.7bI r2 = r1.A00
            X.2dA r7 = r2.A02
            android.app.Activity r5 = A00(r1)
            java.util.HashMap r4 = A01(r3)
            X.AnonymousClass9KY.A00 = r6
            X.AnonymousClass9KY.A01 = r4
            r3 = r5
            X.9lx r3 = (X.C202399lx) r3
            android.content.Intent r1 = r3.getIntent()
            android.os.Bundle r2 = r1.getExtras()
            if (r2 == 0) goto L_0x0863
            java.lang.String r1 = "screen_name"
            r2.putString(r1, r6)
        L_0x0863:
            X.98s r3 = (X.AnonymousClass98s) r3
            X.9VZ r1 = r3.A09
            X.C196149aN.A00(r5, r1, r8, r4)
            com.whatsapp.bloks.ui.BloksDialogFragment r1 = com.whatsapp.bloks.ui.BloksDialogFragment.A00(r6, r4)
            r3.A05 = r1
            java.lang.ref.WeakReference r1 = r7.A07
            java.lang.Object r1 = r1.get()
            X.0df r1 = (X.C08270df) r1
            X.0dc r1 = X.AnonymousClass97S.A0L(r1, r3)
            r1.A0I(r6)
            r1.A01()
            return r0
        L_0x0883:
            java.util.List r4 = r11.A00
            java.lang.String r8 = X.AnonymousClass001.A0n(r4, r5)
            java.util.Map r3 = X.AnonymousClass6C9.A0k(r4, r3)
            X.2Jg r6 = new X.2Jg
            r6.<init>()
            r6.A01 = r0
            r6.A00 = r1
            X.9nt r4 = r2.A02
            android.app.Activity r5 = A00(r1)
            X.7bI r1 = r1.A00
            X.2dA r7 = r1.A02
            java.util.HashMap r9 = A01(r3)
            r4.BJb(r5, r6, r7, r8, r9)
            return r0
        L_0x08a8:
            java.lang.String r3 = X.C157967jD.A01(r11, r5)
            X.9nt r1 = r2.A02
            X.9aN r1 = (X.C196149aN) r1
            X.3Wi r1 = r1.A00
            r1.A0P(r3, r5)
            return r0
        L_0x08b6:
            java.util.List r6 = r11.A00
            java.lang.String r10 = X.AnonymousClass001.A0n(r6, r5)
            java.util.Map r5 = X.AnonymousClass6C9.A0k(r6, r3)
            X.8DF r3 = X.C155787fV.A02(r6, r4)
            X.2Jg r8 = new X.2Jg
            r8.<init>()
            r8.A01 = r3
            r8.A00 = r1
            X.9nt r6 = r2.A02
            android.app.Activity r7 = A00(r1)
            X.7bI r1 = r1.A00
            X.2dA r9 = r1.A02
            java.util.HashMap r11 = A01(r5)
            r6.BJb(r7, r8, r9, r10, r11)
            return r0
        L_0x08df:
            java.util.List r2 = r11.A00
            int r6 = X.AnonymousClass000.A09(r2, r5)
            java.util.Map r2 = X.AnonymousClass6C9.A0k(r2, r3)
            android.app.Activity r5 = A00(r1)
            if (r2 == 0) goto L_0x0909
            java.util.HashMap r4 = A01(r2)
        L_0x08f3:
            r3 = 0
            if (r6 == 0) goto L_0x08f7
            r3 = -1
        L_0x08f7:
            android.content.Intent r2 = r5.getIntent()
            if (r4 == 0) goto L_0x0902
            java.lang.String r1 = "finish_activity_result"
            r2.putExtra(r1, r4)
        L_0x0902:
            r5.setResult(r3, r2)
            r5.finish()
            return r0
        L_0x0909:
            r4 = r0
            goto L_0x08f3
        L_0x090b:
            android.app.Activity r1 = A00(r1)
            X.9nT r1 = (X.C203299nT) r1
            X.9Bw r1 = (X.AnonymousClass9Bw) r1
            X.9TD r1 = r1.A0L
            r1.A02()
            return r0
        L_0x0919:
            android.app.Activity r1 = A00(r1)
            X.9nT r1 = (X.C203299nT) r1
            X.9Bw r1 = (X.AnonymousClass9Bw) r1
            X.9TD r1 = r1.A0L
            r1.A01()
            return r0
        L_0x0927:
            android.app.Activity r1 = A00(r1)
            r1.finish()
            return r0
        L_0x092f:
            java.lang.Object r0 = r1.peek()
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            java.lang.String r0 = X.C18320x8.A0e(r3, r0)
            return r0
        L_0x093a:
            android.content.ClipData r1 = android.content.ClipData.newPlainText(r3, r3)     // Catch:{ NullPointerException | SecurityException -> 0x0942 }
            r2.setPrimaryClip(r1)     // Catch:{ NullPointerException | SecurityException -> 0x0942 }
            return r0
        L_0x0942:
            r2 = move-exception
            java.lang.String r1 = "bkinterpreter/clipboard/"
            com.whatsapp.util.Log.e(r1, r2)
            return r0
        L_0x0949:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "WaExtensions/GetChildNode Cannot find the child node ["
            goto L_0x0956
        L_0x0950:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "WaExtensions/GetChildNode Cannot find the attribute ["
        L_0x0956:
            X.AnonymousClass000.A17(r3, r1, r9, r2)
        L_0x0959:
            java.lang.String r1 = r2.toString()
            goto L_0x09a7
        L_0x095e:
            java.util.List r1 = r11.A00
            java.util.List r6 = java.util.Collections.unmodifiableList(r1)
            java.lang.String r1 = "[Bloks logging] "
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r1)
            r2 = 0
            java.lang.String r5 = X.AnonymousClass001.A0n(r6, r5)
            java.lang.String r1 = X.AnonymousClass001.A0n(r6, r3)
            r7.append(r1)
            java.lang.Object r1 = r6.get(r4)
            if (r1 == 0) goto L_0x0989
            java.lang.String r1 = " "
            r7.append(r1)
            java.lang.Object r1 = r6.get(r4)
            r7.append(r1)
        L_0x0989:
            int r1 = r5.hashCode()
            switch(r1) {
                case 97: goto L_0x09ab;
                case 100: goto L_0x09b2;
                case 101: goto L_0x09ba;
                case 105: goto L_0x09c2;
                case 118: goto L_0x09ca;
                case 119: goto L_0x09d2;
                default: goto L_0x0990;
            }
        L_0x0990:
            r2 = -1
        L_0x0991:
            java.lang.String r6 = "Whatsapp"
            switch(r2) {
                case 0: goto L_0x09a3;
                case 1: goto L_0x09a3;
                case 2: goto L_0x09a3;
                case 3: goto L_0x09dc;
                case 4: goto L_0x09e4;
                case 5: goto L_0x09ec;
                default: goto L_0x0996;
            }
        L_0x0996:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "[Bloks logging] incorrect level: "
            java.lang.String r1 = X.AnonymousClass000.A0V(r1, r5, r2)
            android.util.Log.d(r6, r1)
        L_0x09a3:
            java.lang.String r1 = r7.toString()
        L_0x09a7:
            android.util.Log.d(r6, r1)
            return r0
        L_0x09ab:
            java.lang.String r1 = "a"
            boolean r1 = r5.equals(r1)
            goto L_0x09d9
        L_0x09b2:
            java.lang.String r1 = "d"
            boolean r1 = r5.equals(r1)
            r2 = 1
            goto L_0x09d9
        L_0x09ba:
            java.lang.String r1 = "e"
            boolean r1 = r5.equals(r1)
            r2 = 2
            goto L_0x09d9
        L_0x09c2:
            java.lang.String r1 = "i"
            boolean r1 = r5.equals(r1)
            r2 = 3
            goto L_0x09d9
        L_0x09ca:
            java.lang.String r1 = "v"
            boolean r1 = r5.equals(r1)
            r2 = 4
            goto L_0x09d9
        L_0x09d2:
            java.lang.String r1 = "w"
            boolean r1 = r5.equals(r1)
            r2 = 5
        L_0x09d9:
            if (r1 != 0) goto L_0x0991
            goto L_0x0990
        L_0x09dc:
            java.lang.String r1 = r7.toString()
            android.util.Log.i(r6, r1)
            return r0
        L_0x09e4:
            java.lang.String r1 = r7.toString()
            android.util.Log.v(r6, r1)
            return r0
        L_0x09ec:
            java.lang.String r1 = r7.toString()
            android.util.Log.w(r6, r1)
            return r0
        L_0x09f4:
            java.util.Set r1 = r9.keySet()
            java.util.Iterator r1 = r1.iterator()
            java.lang.String r2 = X.AnonymousClass001.A0m(r1)
            java.lang.Object r1 = r9.get(r2)
            java.util.Map r1 = (java.util.Map) r1
            X.36K r10 = r5.A00(r3, r2, r1)
            X.31C r11 = r5.A01
            java.lang.String r14 = r11.A03()
            r1 = 4
            X.39V[] r9 = new X.AnonymousClass39V[r1]
            X.39V r2 = X.AnonymousClass39V.A00()
            r1 = 0
            r9[r1] = r2
            java.lang.String r1 = "type"
            X.AnonymousClass39V.A05(r1, r8, r9)
            java.lang.String r1 = "id"
            X.AnonymousClass39V.A06(r1, r14, r9)
            java.lang.String r1 = "xmlns"
            X.36K r13 = X.AnonymousClass36K.A0E(r10, r1, r7, r9)
            r15 = 204(0xcc, float:2.86E-43)
            r1 = 0
            X.9qR r12 = new X.9qR
            r12.<init>(r6, r5, r3, r1)
            long r1 = (long) r4
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            r16 = r1
            r11.A0D(r12, r13, r14, r15, r16)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195899Zy.B2m(X.7jD, X.7Bp, X.7Tp):java.lang.Object");
    }
}
